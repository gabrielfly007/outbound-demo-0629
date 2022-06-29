package com.example.outbounddemo0629.oubound.service;


import org.freeswitch.esl.client.transport.SendMsg;

import java.util.List;

/**
 * 通过Sip外连接针对有电话号码呼入发送对应的外呼号码命令
 */
public interface SipDataService {
    /**
     * 获取发送的命令
     * @return
     */
    List<SendMsg> getSendMsg(String uuid,String phoneNum, String keyid,String type);

    /**
     * 添加对应的通话记录类型
     * @param userid
     * @param agencyId
     */
    //void addCdrType(String userid,String agencyId);

    /**
     * 通过中继线号码查询对应的设置的中继线类型
     * //@param caller_destination_number 中继线号码
     * @return  TrunkLine 返回中继线类型
     */
   // String getTrunkLineType(String caller_destination_number);
    //是否存在用户电话号码
    //boolean isExitUserinfoByHomePhone(String homephone);

}
