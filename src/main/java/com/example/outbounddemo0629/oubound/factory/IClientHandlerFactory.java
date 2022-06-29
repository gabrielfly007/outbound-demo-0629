package com.example.outbounddemo0629.oubound.factory;

import com.example.outbounddemo0629.oubound.handler.IClientHandler;
import org.freeswitch.esl.client.outbound.AbstractOutboundClientHandler;
import org.freeswitch.esl.client.outbound.AbstractOutboundPipelineFactory;

public class IClientHandlerFactory extends AbstractOutboundPipelineFactory {

    @Override
    protected AbstractOutboundClientHandler makeHandler() {
        return new IClientHandler();
    }
}
