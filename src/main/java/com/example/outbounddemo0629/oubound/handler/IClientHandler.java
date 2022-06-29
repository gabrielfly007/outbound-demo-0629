package com.example.outbounddemo0629.oubound.handler;

import com.example.outbounddemo0629.oubound.cache.EventName;
import com.example.outbounddemo0629.oubound.cache.FreeSwitchEventCache;
import com.example.outbounddemo0629.oubound.service.SipDataService;
import com.example.outbounddemo0629.oubound.util.Ctx;
import com.example.outbounddemo0629.oubound.util.SIPOutboundUtils;
import org.freeswitch.esl.client.outbound.AbstractOutboundClientHandler;
import org.freeswitch.esl.client.transport.SendMsg;
import org.freeswitch.esl.client.transport.event.EslEvent;
import org.freeswitch.esl.client.transport.message.EslHeaders;
import org.freeswitch.esl.client.transport.message.EslMessage;
import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ExceptionEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * @ClassName IClientHandler
 * @Description TODO
 * @Author jwjkj
 * @Date 2019/7/18
 * @Version 1.0
 **/
public class IClientHandler extends AbstractOutboundClientHandler {
    private static final Logger log = LoggerFactory.getLogger(IClientHandler.class);
    private FreeSwitchEventCache eventCache = FreeSwitchEventCache.getInstance();
    private SipDataService sipDataService = (SipDataService) Ctx.getBean("sipDataServiceImpl");
    private  long beginTime;
    private  long endTime;
    private String dtmf = "";
    private String type ="";
    //默认为false 当超时后改为true，目的只执行一次
    private boolean isTimeOutStopDTMF = false;



    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, ExceptionEvent e) {
        //log.info("------异常方法exceptionCaught-------");

    }

    @Override
    protected void handleConnectResponse( ChannelHandlerContext ctx, EslEvent event ) {
        //被叫号码
        String caller_destination_number = "";
        //主叫号码
        String channel_ANI = "";
       // log.info( "Received connect response [{}]", event );
        if ( event.getEventName().equalsIgnoreCase( "CHANNEL_DATA" ) )
        {
            // this is the response to the initial connect
//            log.info( "=======================  incoming channel data  =============================" );
//            log.info( "Event-Date-Local: [{}]", event.getEventDateLocal() );
//            log.info( "Unique-ID: [{}]", event.getEventHeaders().get( "Unique-ID" ) );
//            log.info( "Channel-ANI: [{}]", event.getEventHeaders().get( "Channel-ANI" ) );
//            log.info( "Answer-State: [{}]", event.getEventHeaders().get( "Answer-State" ) );
//            log.info( "Caller-Destination-Number: [{}]", event.getEventHeaders().get( "Caller-Destination-Number" ) );
//            log.info( "=======================  = = = = = = = = = = =  =============================" );

            caller_destination_number = event.getEventHeaders().get("Caller-Destination-Number");
            channel_ANI = event.getEventHeaders().get("Channel-ANI");
            String uuid = event.getEventHeaders().get("Channel-Call-UUID");
            Channel channel = ctx.getChannel();
            resoponses(super.sendSyncMultiLineCommand(channel, SIPOutboundUtils.sendMsg( "execute", "playback","c:\\welcome.mp3").getMsgLines()));
            //resoponses(super.sendSyncMultiLineCommand(channel, SIPOutboundUtils.sendMsg( "execute", "hangup","").getMsgLines()));
            // now hangup the call
            hangupCall( ctx.getChannel() );
        }
        else
        {
            throw new IllegalStateException( "Unexpected event after connect: [" + event.getEventName() + ']' );
        }
    }


    private void resoponses(EslMessage response) {
        if (response.getHeaderValue(EslHeaders.Name.REPLY_TEXT).startsWith("+OK")) {
            //log.info("send successful");
            //System.out.println(response.toString());
            //System.out.println("============ headers =============");
            //response.getHeaders().forEach((name, s) -> System.out.println(name+" : "+s));
            //System.out.println("============ bodys   ==============");
            //response.getBodyLines().forEach(System.out :: println);

        } else {
            //log.error("send failed: " + response.getHeaderValue(EslHeaders.Name.REPLY_TEXT));
        }
    }

    @Override
    protected void handleEslEvent( ChannelHandlerContext ctx, EslEvent event )
    {
        //log.info( "Received event [{}]", event );
    }

    private void hangupCall( Channel channel )
    {
        SendMsg hangupMsg = new SendMsg();
        hangupMsg.addCallCommand( "execute" );
        hangupMsg.addExecuteAppName( "hangup" );

        EslMessage response = sendSyncMultiLineCommand( channel, hangupMsg.getMsgLines() );

        if ( response.getHeaderValue( EslHeaders.Name.REPLY_TEXT ).startsWith( "+OK" ) )
        {
            log.info( "Call hangup successful" );
        }
        else
        {
            log.error( "Call hangup failed: [{}}", response.getHeaderValue( EslHeaders.Name.REPLY_TEXT ) );
        }
    }
}





