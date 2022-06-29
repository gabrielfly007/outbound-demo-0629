package com.example.outbounddemo0629.oubound.connect;

import com.example.outbounddemo0629.oubound.factory.IClientHandlerFactory;
import org.freeswitch.esl.client.outbound.SocketClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OutboundConnect {
    private static final Logger logger = LoggerFactory.getLogger(OutboundConnect.class);
    private static final int port = 18040;
    private static OutboundConnect outboundConnect = null;
    public static boolean isStart = false;

    public OutboundConnect(){}

    public OutboundConnect getOutboundConnect(){
        if (null == outboundConnect) {
            outboundConnect = new OutboundConnect();
        }
        return outboundConnect;
    }

    public void start(){
        connection();
    }

    private void connection(){

        try {
            SocketClient socketClient = new SocketClient(port, new IClientHandlerFactory());
            socketClient.start();
            logger.info("---------------------------------------------------------------------------------");
            logger.info("--------------- Outbound外连服务启动成功，等待Freeswitch的连接 -----------------------");
            logger.info("---------------------------------------------------------------------------------");
        } catch (Exception e) {
            logger.info("---------------------------------------------------------------------------------");
            logger.info("---------------------------- Outbound外连服务启动失败 ------------------------------");
            logger.info("---------------------------------------------------------------------------------");
        }


    }



}
