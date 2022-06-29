package com.example.outbounddemo0629.oubound.cache;

import java.util.ArrayList;
import java.util.List;

/**
 * 通道事件名称
 */
public class EventName implements FreeSwitchEvenName {
    private static EventName eventName = null;
    private List<String> listEvenName;

    private EventName() {
        listEvenName = new ArrayList<>();
        listEvenName.add(EventName.CHANNEL_EVENTS);
        listEvenName.add(EventName.CHANNEL_STATE);
        listEvenName.add(EventName.CHANNEL_CALLSTATE);
        listEvenName.add(EventName.CHANNEL_CREATE);
        listEvenName.add(EventName.CHANNEL_DESTROY);
        listEvenName.add(EventName.CHANNEL_ANSWER);
        listEvenName.add(EventName.CHANNEL_HANGUP);
        listEvenName.add(EventName.CHANNEL_HANGUP_COMPLETE);
        listEvenName.add(EventName.CHANNEL_EXECUTE);
        listEvenName.add(EventName.CHANNEL_EXECUTE_COMPLETE);
        listEvenName.add(EventName.CHANNEL_BRIDGE);
        listEvenName.add(EventName.CHANNEL_UNBRIDGE);
        listEvenName.add(EventName.CHANNEL_PROGRESS);
        listEvenName.add(EventName.CHANNEL_PROGRESS_MEDIA);
        listEvenName.add(EventName.CHANNEL_OUTGOING);
        listEvenName.add(EventName.CHANNEL_PARK);
        listEvenName.add(EventName.CHANNEL_UNPARK);
        listEvenName.add(EventName.COMMAND);
        listEvenName.add(EventName.CHANNEL_APPLICATION);
        listEvenName.add(EventName.CHANNEL_HOLD);
        listEvenName.add(EventName.CHANNEL_UNHOLD);
        listEvenName.add(EventName.CHANNEL_ORIGINATE);
        listEvenName.add(EventName.CHANNEL_UUID);
        listEvenName.add(EventName.SYSTEM_EVENTS);
        listEvenName.add(EventName.SHUTDOWN);
        listEvenName.add(EventName.MODULE_LOAD);
        listEvenName.add(EventName.MODULE_UNLOAD);
        listEvenName.add(EventName.RELOADXML);
        listEvenName.add(EventName.NOTIFY);
        listEvenName.add(EventName.SEND_MESSAGE);
        listEvenName.add(EventName.RECV_MESSAGE);
        listEvenName.add(EventName.REQUEST_PARAMS);
        listEvenName.add(EventName.CHANNEL_DATA);
        listEvenName.add(EventName.GENERAL);
        listEvenName.add(EventName.SESSION_HEARTBEAT);
        listEvenName.add(EventName.CLIENT_DISCONNECTED);
        listEvenName.add(EventName.SERVER_DISCONNECTED);
        listEvenName.add(EventName.SEND_INFO);
        listEvenName.add(EventName.RECV_INFO);
        listEvenName.add(EventName.CALL_SECURE);
        listEvenName.add(EventName.SEND_INFO);
        listEvenName.add(EventName.NAT);
        listEvenName.add(EventName.RECORD_START);
        listEvenName.add(EventName.RECORD_STOP);
        listEvenName.add(EventName.PLAYBACK_START);
        listEvenName.add(EventName.PLAYBACK_STOP);
        listEvenName.add(EventName.CALL_UPDATE);
        listEvenName.add(EventName.RE_SCHEDULE);
        listEvenName.add(EventName.HEARTBEAT);
        listEvenName.add(EventName.CUSTOM);
        listEvenName.add(EventName.PRESENCE_IN);
        listEvenName.add(EventName.API);
        listEvenName.add(EventName.CODEC);
        listEvenName.add(EventName.DTMF);

    }

    public static EventName getInstance() {
        if (eventName == null) {
            eventName = new EventName();
        }
        return eventName;
    }

    public List<String> getListEvenName() {
        return listEvenName;
    }


}
