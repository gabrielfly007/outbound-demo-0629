package com.example.outbounddemo0629.oubound.util;

import org.freeswitch.esl.client.transport.SendMsg;

/**
 * @ClassName IClientHandler
 * @Description TODO
 * @Author jwjkj
 * @Date 2019/7/18
 * @Version 1.0
 **/
public class SIPOutboundUtils {
    private static SendMsg sendMsg;

    /**
     * @param uuid
     * @param callCommand    execute //固定命令
     * @param executeAppName 命令名称
     * @param executeAppArg  命令参数
     * @return
     */
    public static SendMsg sendMsg(String uuid, String callCommand, String executeAppName, String executeAppArg) {
        sendMsg = new SendMsg(uuid);
        sendMsg.addCallCommand(callCommand);
        sendMsg.addExecuteAppName(executeAppName);
        sendMsg.addExecuteAppArg(executeAppArg);
        sendMsg.addEventLock();
        return sendMsg;
    }

    /**
     * @param uuid
     * @param callCommand    execute //固定命令
     * @param executeAppName 命令名称
     * @param executeAppArg  命令参数
     * @param loops          循环次数
     * @return SendMsg
     */
    public static SendMsg sendMsg(String uuid, String callCommand, String executeAppName, String executeAppArg, int loops) {
        sendMsg = new SendMsg(uuid);
        sendMsg.addCallCommand(callCommand);
        sendMsg.addExecuteAppName(executeAppName);
        sendMsg.addExecuteAppArg(executeAppArg);
        sendMsg.addLoops(loops);
        sendMsg.addEventLock();
        return sendMsg;
    }

    /**
     * @param callCommand    execute //固定命令
     * @param executeAppName 命令名称
     * @return sendMsg
     */
    public static SendMsg sendMsg(String callCommand, String executeAppName) {
        sendMsg = new SendMsg();
        sendMsg.addCallCommand(callCommand);
        sendMsg.addExecuteAppName(executeAppName);
        sendMsg.addEventLock();
        return sendMsg;
    }

    /**
     * @param callCommand    execute //固定命令
     * @param executeAppName 命令名称
     * @param executeAppArg  命令参数
     * @return sendMsg
     */
    public static SendMsg sendMsg(String callCommand, String executeAppName, String executeAppArg) {
        sendMsg = new SendMsg();
        sendMsg.addCallCommand(callCommand);
        sendMsg.addExecuteAppName(executeAppName);
        sendMsg.addExecuteAppArg(executeAppArg);
        sendMsg.addEventLock(); //开启同步模式
        return sendMsg;
    }

    /**
     * @param callCommand    execute //固定命令
     * @param executeAppName 命令名称
     * @param executeAppArg  命令参数
     * @return sendMsg
     */
    public static SendMsg sendMsg(String callCommand, String executeAppName, String executeAppArg, int loops) {
        sendMsg = new SendMsg();
        sendMsg.addCallCommand(callCommand);
        sendMsg.addExecuteAppName(executeAppName);
        sendMsg.addExecuteAppArg(executeAppArg);
        sendMsg.addLoops(loops);
        sendMsg.addEventLock();
        return sendMsg;
    }

}
