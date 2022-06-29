package com.example.outbounddemo0629.oubound.serviceImpl;

import com.example.outbounddemo0629.oubound.service.SipDataService;
import com.example.outbounddemo0629.oubound.util.SIPOutboundUtils;
import org.freeswitch.esl.client.transport.SendMsg;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service("sipDataServiceImpl")
public class SipDataServiceImpl implements SipDataService {

    private List<SendMsg> sendMsgList = null;

    private String uuid = "";
    private String type = "";
    private String userid = "";

    @Override
    public List<SendMsg> getSendMsg(String uuid,String phoneNum, String keyid,String type) {
        sendMsgList = new ArrayList<>();
        this.uuid = uuid;
        this.type = type;
        getMsg(phoneNum, keyid);
        return sendMsgList;
    }

    /**
     * 将呼叫记录与用户和对应机构绑定
     * //@param userid 用户ID
     * //@param agencyId 对应的服务机构id
     */
   // @Override
//    public void addCdrType( String userid, String agencyId) {
//        this.userid = userid;
//        try {
//            stageService.addCdrType(this.uuid, userid, agencyId, this.type);
//        }catch (Exception e){
//            System.out.println("插入数据异常: "+this.uuid);
//        }
//    }

    /**
     * 获取对应中继线号码类型
     * 如果未设置则
     * 返回none 后挂断
     * //@param caller_destination_number 中继线号码
     * @return TrunkLineType 中的常量
     */
    //@Override
//    public String getTrunkLineType(String caller_destination_number) {
//        System.out.println("查询中继线类型:"+caller_destination_number);
//        TrunkLine trunkLine = trunkLineService.selectByPrimaryKey(caller_destination_number);
//        if(null != trunkLine){
//            return trunkLine.getTrunkType();
//        }
//        return "none";
//    }

   // @Override
//    public boolean isExitUserinfoByHomePhone(String homephone) {
//        return homeDUserInfoService.selectCountUserInfoByHomePhone(homephone)>0;
//    }

    /**
     * 通过对应的类型设置对应的命令
     * //@param phoneNum 呼叫号码
     * //@param keyid 签约号
     */
    private void getMsg(String phoneNum, String keyid) {
//          if(TrunkLineType.DINGDANG.equals(this.type)){
//              getDingDang(phoneNum,keyid);
//          }
//          if(TrunkLineType.STAGE.equals(this.type)){
//              getStage(phoneNum,keyid);
//          }

    }

    /**
     * 通过叮当送药
     * //@param phoneNum 呼叫号码
     * //@param keyid 签约号
     */
//    private void getDingDang(String phoneNum,String keyid){
//        List<HomeDUserInfo> homeDUserInfos = new ArrayList<>();
//        List<HomeDUserInfo> homeDUserInfoskeyid = new ArrayList<>();
//        if(null !=phoneNum && !"".equals(phoneNum)){
//            homeDUserInfos = getCallInUserInf(phoneNum);
//        }
//        if(null != keyid && !"".equals(keyid)){
//            homeDUserInfoskeyid = getCallInUserInfByKeyId(keyid);
//        }
//        if(homeDUserInfos.size()>0){
//            HomeDUserInfo homeDUserInfo = homeDUserInfos.get(0);
//            String id = homeDUserInfo.getId();
//            String getWay = "sofia/gateway/gw1/95028";
//            addCdrType(id, "");
//            addGetWay(getWay);
//        }else {
//            addCdrType("", "");
//            String erroMusic = "";
//            erroMsg(erroMusic);
//        }
//
//    }

    /**
     * 获取对应驿站信息
     * @param //phoneNum 呼叫号码
     * @param //keyid 签约号
     */
//    private void getStage(String phoneNum, String keyid){
//        List<HomeDUserInfo> callInUserInfByHomePhone = new ArrayList<>() ;
//        List<HomeDUserInfo> callInUserInfByKeyId = new ArrayList<>() ;
//        HomeDUserInfo homeDUserInfo = null;
//        if(null != phoneNum && !"".equals(phoneNum)){
//            callInUserInfByHomePhone = getCallInUserInf(phoneNum);
//        }
//        if(null !=keyid && !"".equals(keyid)){
//            callInUserInfByKeyId = getCallInUserInfByKeyId(keyid);
//        }
//        if (callInUserInfByKeyId.size() > 0) {
//            homeDUserInfo = callInUserInfByKeyId.get(0);
//        } else if (callInUserInfByHomePhone.size() > 0) {
//            homeDUserInfo = callInUserInfByHomePhone.get(0);
//        }
//        if (null != homeDUserInfo) {
//            String streeName = homeDUserInfo.getPayname();
//            List<Stage> stages = getStage(streeName);
//            String getWay = "sofia/gateway/gw1/";
//            String playMusic = "$${sounds_dir}/jwjkj/welcome.mp3";
//            StringBuilder toPhone = new StringBuilder();
////            stages.forEach(stage -> {
////                if(null != stage.getStageservicephone() && !"".equals(stage.getStageservicephone())){
////                    //设置多个号码呼叫 使用 “|” 隔开
////                    toPhone.append(stage.getStageservicephone()).append("|");
////                }
////            });
//
//            if(stages.size()>0){
//                Stage stage = stages.get(0);
//                if(!"".equals(stage.getStageservicephone()) && null != stage.getStageservicephone()){
//                    toPhone.append(stage.getStageservicephone()).append("|");
//                }
//                addCdrType(homeDUserInfo.getId(), String.valueOf(stage.getId()));
//                System.out.println("添加呼叫记录");
//            }else {
//                addCdrType(homeDUserInfo.getId(), "96083");
//
//            }
//            toPhone.append("96083");
//            addMsg(toPhone.toString(), playMusic, "", getWay);
//
//        } else {
//            String erroMusic = "";
//            addCdrType("", "");
//            erroMsg(erroMusic);
//        }
//    }

    /**
     * 通过那个网关呼叫对应的电话
     *
     * @param //toPhone   对应的电话
     * @param //playMusic 接通后首先播放对应的提示音
     * @param //ivr       对应的IVR操作
     * @param //getWay    对应的网关
     */
//    private void addMsg(String toPhone, String playMusic, String ivr, String getWay) {
//        if (null == toPhone || "".equals(toPhone)) {
//            String erroMusic = "";
//            erroMsg(erroMusic);
//        } else {
//            getWay = getWay + toPhone;
//            addPlayBackMusic(playMusic);
//            addGetWay(getWay);
//        }
//    }

    /**
     * 添加对应的欢迎声音文件 命令
     * @param //playMusic 声音文件
     */
//    private void addPlayBackMusic(String playMusic){
//        if(!"".equals(playMusic) && null != playMusic){
//            sendMsgList.add(ISPOutBoundUtils.sendMsg("execute", "playback", playMusic));
//        }
//    }
    /**
     * 添加对应的网关并且设置录音命令
     * //@param getWay 对应的网关
     */
//    private void addGetWay(String getWay){
//        sendMsgList.add(ISPOutBoundUtils.sendMsg("execute", "set", "RECORD_STEREO=true"));
//        //小于10秒录音不需要
//        sendMsgList.add(ISPOutBoundUtils.sendMsg("execute", "set", "RECORD_MIN_SEC=10"));
//        //sendMsgList.add(ISPOutBoundUtils.sendMsg("execute", "record_session", "$${recordings_dir}/cdr/"+userid+"/${caller_id_number}${strftime(%Y-%m-%d-%H-%M-%S)}.mp3"));
//        sendMsgList.add(ISPOutBoundUtils.sendMsg("execute", "record_session", "$${recordings_dir}/cdr/"+userid+"/"+uuid+".mp3"));
//        sendMsgList.add(ISPOutBoundUtils.sendMsg("execute", "bridge", getWay));
//    }

    /**
     * 播放声音并挂机
     *
     * //@param playMusic 错误声音
     */
//    private void erroMsg(String playMusic) {
//        if (null == playMusic || "".equals(playMusic)) {
//            playMusic = "$${sounds_dir}/jwjkj/erro.mp3";
//        }
//
//        addPlayBackMusic(playMusic);
//        addHangUp();
//    }

    private void addHangUp(){
      sendMsgList.add(SIPOutboundUtils.sendMsg("execute", "hangup\n\n"));
    }
    /**
     * 获取对应的用户号信息
     *
     * @param phoneNum 收到的来电号码
     * @return List<HomeDUserInfo>
     */
//    private List<HomeDUserInfo> getCallInUserInf(String phoneNum) {
//        //根据电话号码查询对应的用户信息
//        return homeDUserInfoService.selectUserInfoByHomePhoneOne(phoneNum);
//    }

    /**
     * 获取对应的用户号信息
     *
     * @param keyid 接收到的签约号
     * @return List<HomeDUserInfo>
     */
//    private List<HomeDUserInfo> getCallInUserInfByKeyId(String keyid) {
//        //根据签约号查询对应的用户信息
//        return homeDUserInfoService.selectUserInfoByKyeidOne(keyid);
//    }

    /**
     * 根据名称查询对应的服务商信息
     *查询对应的服务商信息
     * @param name 对应的名称
     * @return List<Stage>
     */
//    private List<Stage> getStage(String name) {
//        return stageService.selectStageByStreets(name);
//    }


}
