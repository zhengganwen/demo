package com.study.demo.service;

import com.study.demo.domain.PluginConfig;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 14:41
 * @Description
 */
public interface PluginConfigServer {

    PluginConfig findByPluginId(String pluginId);


}
