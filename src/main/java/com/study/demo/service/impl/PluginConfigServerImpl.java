package com.study.demo.service.impl;

import com.study.demo.domain.PluginConfig;
import com.study.demo.mapper.PluginConfigMapper;
import com.study.demo.service.PluginConfigServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 14:44
 * @Description
 */
@Service
public class PluginConfigServerImpl implements PluginConfigServer {
    @Resource
    private PluginConfigMapper pluginConfigMapper;

    @Override
    public PluginConfig findByPluginId(String pluginId) {
        return pluginConfigMapper.findByPluginId(pluginId);
    }

}
