package com.example.outbounddemo0629.oubound.cache;

/**
 * @ClassName FreeSwitchEvenName
 * @Description TODO 通道事件名称
 * @Author jwjkj
 * @Date 2019/7/18
 * @Version 1.0
 **/
public interface FreeSwitchEvenName {
    /**
     * 信道事件
     */
    String CHANNEL_EVENTS = "CHANNEL_EVENTS";
    /**
     * 信道状态
     */
    String CHANNEL_STATE = "CHANNEL_STATE";
    /**
     * //信道呼叫状态事件
     */
    String CHANNEL_CALLSTATE = "CHANNEL_CALLSTATE";
    /**
     * //创建信道
     */
    String CHANNEL_CREATE = "CHANNEL_CREATE";
    /**
     * //销毁信道
     */
    String CHANNEL_DESTROY = "CHANNEL_DESTROY";
    /**
     * //呼叫信道应到
     */
    String CHANNEL_ANSWER = "CHANNEL_ANSWER";
    /**
     * //挂机事件
     */
    String CHANNEL_HANGUP = "CHANNEL_HANGUP";
    /**
     * //挂机完成事件
     */
    String CHANNEL_HANGUP_COMPLETE = "CHANNEL_HANGUP_COMPLETE";
    /**
     * //PBX正在执行呼叫事件
     */
    String CHANNEL_EXECUTE = "CHANNEL_EXECUTE";
    /**
     * //PBX执行完成
     */
    String CHANNEL_EXECUTE_COMPLETE = "CHANNEL_EXECUTE_COMPLETE";
    /**
     * //一个呼叫两个端点之间的桥接事件
     */
    String CHANNEL_BRIDGE = "CHANNEL_BRIDGE";
    /**
     * //停用桥接事件
     */
    String CHANNEL_UNBRIDGE = "CHANNEL_UNBRIDGE";
    /**
     * //进度事件，外呼时对方提醒。或者入呼时提醒
     */
    String CHANNEL_PROGRESS = "CHANNEL_PROGRESS";
    /**
     * //媒体进度事件，外呼时对方提醒。或者入呼时提醒。
     */
    String CHANNEL_PROGRESS_MEDIA = "CHANNEL_PROGRESS_MEDIA";
    /**
     * //创建一个外呼事件;
     */
    String CHANNEL_OUTGOING = "CHANNEL_OUTGOING";
    /**
     * //一个呼叫被挂起(停放)在PBX中。
     */
    String CHANNEL_PARK = "CHANNEL_PARK";
    /**
     * //一个呼叫被取消挂起(停放)在PBX中
     */
    String CHANNEL_UNPARK = "CHANNEL_UNPARK";
    /**
     * //信道产生的应用程序就是事件application=event一般用来捕获呼转移
     */
    String CHANNEL_APPLICATION = "CHANNEL_APPLICATION";
    /**
     * //信道保持，使用uuid_hold或者接收SDP的readonly
     */
    String CHANNEL_HOLD = "CHANNEL_HOLD";
    /**
     * //触发后uuid_hold关闭<uuid>或者接收到INVITE SDP= SendRecv的
     */
    String CHANNEL_UNHOLD = "CHANNEL_UNHOLD";
    /**
     * //信道发起事件，触发完成发起（或桥）
     */
    String CHANNEL_ORIGINATE = "CHANNEL_ORIGINATE";
    /**
     * //uuid事件表示唯一的ID通道已经改变。原来的ID将被报告的旧唯一ID。此事件会发生，当您使用参数origination_uuid时发出命令发起/桥。
     */
    String CHANNEL_UUID = "CHANNEL_UUID";
    String RE_SCHEDULE = "RE_SCHEDULE";
    String HEARTBEAT = "HEARTBEAT";
    String CUSTOM = "CUSTOM";
    String PRESENCE_IN = "PRESENCE_IN";
    String API = "API";
    String CODEC = "CODEC";
    String DTMF = "DTMF";
    //------------------------------------------------------系统事件----------------------------------------------------------------------------------------------
    /**
     * //系统事件
     */
    String SYSTEM_EVENTS = "SYSTEM_EVENTS";
    /**
     * //设置以启动的FreeSWITCH的关机顺序。
     */
    String SHUTDOWN = "SHUTDOWN";
    /**
     * //模块加载
     */
    String MODULE_LOAD = "MODULE_LOAD";
    /**
     * //模块卸载
     */
    String MODULE_UNLOAD = "MODULE_UNLOAD";
    /**
     * //重新加载已经配置的XML
     */
    String RELOADXML = "RELOADXML";
    /**
     * //通知
     */
    String NOTIFY = "NOTIFY";
    /**
     * //发送信息
     */
    String SEND_MESSAGE = "SEND_MESSAGE";
    /**
     * //接收信息
     */
    String RECV_MESSAGE = "RECV_MESSAGE";
    /**
     * //请求参数
     */
    String REQUEST_PARAMS = "REQUEST_PARAMS";
    /**
     * //信道数据
     */
    String CHANNEL_DATA = "CHANNEL_DATA";
    /**
     * //总体
     */
    String GENERAL = "GENERAL";
    /**
     * //命令
     */
    String COMMAND = "COMMAND";
    /**
     * //SESSION心跳
     */
    String SESSION_HEARTBEAT = "SESSION_HEARTBEAT";
    /**
     * //客户端断开
     */
    String CLIENT_DISCONNECTED = "CLIENT_DISCONNECTED";
    /**
     * //服务器断开
     */
    String SERVER_DISCONNECTED = "SERVER_DISCONNECTED";
    /**
     * //发送信息
     */
    String SEND_INFO = "SEND_INFO";
    /**
     * //接收信息
     */
    String RECV_INFO = "RECV_INFO";
    /**
     * //保密呼叫
     */
    String CALL_SECURE = "CALL_SECURE";
    /**
     * //NAT
     */
    String NAT = "NAT";
    /**
     * //开始录音记录
     */
    String RECORD_START = "RECORD_START";
    /**
     * //停止录音记录
     */
    String RECORD_STOP = "RECORD_STOP";
    /**
     * //开始播放
     */
    String PLAYBACK_START = "PLAYBACK_START";
    /**
     * //停止播放
     */
    String PLAYBACK_STOP = "PLAYBACK_STOP";
    /**
     * //更新呼叫
     */
    String CALL_UPDATE = "CALL_UPDATE";
}
