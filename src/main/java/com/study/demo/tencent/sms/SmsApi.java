package com.study.demo.tencent.sms;

import com.study.demo.domain.PluginConfig;
import com.study.demo.service.PluginConfigServer;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 15:18
 * @Description
 */
@Component("txSmsApi")
public class SmsApi implements InitializingBean {
    @Resource
    private PluginConfigServer pluginConfigServer;

    private static PluginConfig pluginConfig;

    private final String getId(){

        return getClass().getAnnotation(Component.class).value();
    }

    private PluginConfig getPluginConfig() {
        if (null == pluginConfig) {
            pluginConfig = pluginConfigServer.findByPluginId(getId());
        }
        return pluginConfig;
    }


     public static String test(){
        Map<String, String> attributesMap = pluginConfig.getAttributesMap();
        String apikey = attributesMap.get("apikey");
        return apikey;

    }


    @Override
    public void afterPropertiesSet() throws Exception {

        getPluginConfig();
    }
}
