package com.example.outbounddemo0629;

import com.example.outbounddemo0629.oubound.connect.OutboundConnect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OutboundDemo0629Application {

    public static void main(String[] args) {

        SpringApplication.run(OutboundDemo0629Application.class, args);
        OutboundConnect outboundConnect = new OutboundConnect();
        outboundConnect.getOutboundConnect().start();
    }

}
