package com.study.demo.mapper;

import com.study.demo.domain.PluginConfig;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 14:46
 * @Description
 */
@Repository
public interface PluginConfigMapper {

    PluginConfig findByPluginId(@Param("pluginId") String pluginId);
}
