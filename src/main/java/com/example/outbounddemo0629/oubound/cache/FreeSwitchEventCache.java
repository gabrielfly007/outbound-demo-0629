package com.example.outbounddemo0629.oubound.cache;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * FreeSwitch 每个通道的事件缓存主要针对 内链接获取对应的事件
 * 外连接  通过对应的事件 决定 通话如何执行
 * @ClassName FreeSwitchEventCache
 * @Description TODO
 * @Author jwjkj
 * @Date 2019/11/21
 * @Version 1.0
 **/
public class FreeSwitchEventCache {
    private static FreeSwitchEventCache freeSwitchEventCache = null ;
    private Map<String,Map<String,Map<String,String>>> eventCacche ;
    private static final Logger log = LoggerFactory.getLogger(FreeSwitchEventCache.class);
    private FreeSwitchEventCache(){
        eventCacche = new ConcurrentHashMap<>(16);
    }

    /**
     * 单例模式初始化
     * @return FreeSwitchEventCache
     */
    public static FreeSwitchEventCache getInstance(){
        if(null == freeSwitchEventCache){
            freeSwitchEventCache = new FreeSwitchEventCache();
        }
        return  freeSwitchEventCache;
    }

    /**
     * 增加
     * @param uuid 每个通道唯一的UUID
     * @param evenName 每次触发的事件名称
     * @param eventMap 事件详细信息
     */
    public void addCache(String uuid,String evenName,Map<String,String> eventMap){
        Map<String, Map<String, String>> stringMapMap = null;
        if(eventCacche.containsKey(uuid)){
            stringMapMap = eventCacche.get(uuid);
            stringMapMap.put(evenName,eventMap);
        }else {
             stringMapMap = new ConcurrentHashMap<>(16);
            stringMapMap.put(evenName,eventMap);
            eventCacche.put(uuid,stringMapMap);
        }
    }

    /**
     * 根据UUID 移除通道 所有事件缓存
     * @param uuid uuid 每个通道的唯一id
     */
    public void removeCacheByUuid(String uuid){
        log.info("-----清除对应通道缓存BEGIN-----");
        log.info("-----清除之前缓存大小:"+eventCacche.size());
        eventCacche.remove(uuid);
        log.info("-----清除之后缓存大小:"+eventCacche.size());
        log.info("-----清除对应通道缓存END-----");


    }

    /**
     * 根据UUID 和 事件名称 移除对通道的--事件--缓存
     * @param uuid uuid 每个通道的唯一id
     * @param evenName evenName 事件名称
     */
    public void removByEvenName(String uuid,String evenName){
        eventCacche.get(uuid).remove(evenName);
    }

    /**
     * 根据UUID获取对应的通道的所有事件
     * @param uuid 每个通道的唯一id
     * @return  Map<String, Map<String, String>>
     */
    public Map<String, Map<String, String>> getEvent(String uuid){
        return  eventCacche.get(uuid);
    }
    /**
     * 清空所有缓存
     */
    public void clear(){
        if(null != eventCacche && eventCacche.size() != 0){
            eventCacche.clear();
        }
    }

    /**
     * 获取所有缓存
     * @return  Map<String,Map<String,Map<String,String>>>
     */
    public Map<String,Map<String,Map<String,String>>> getEventCacche(){
        return  eventCacche;
    }

    /**
     * 是否有数据
     * @return boolean
     */
    public boolean isCaheHaveData(){
        return null != getEventCacche() && getEventCacche().size() != 0;
    }
}
