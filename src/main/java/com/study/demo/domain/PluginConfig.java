package com.study.demo.domain;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 14:28
 * @Description
 */
public class PluginConfig implements Serializable {
    private static final long serialVersionUID = -4357367409438384806L;
    private Long id;

    private Date createDate;

    private Integer isEnabled;

    private Date modifyDate;

    private Integer orders;


    private String pluginId;

    private String attributes;

    private Map<String, String> attributesMap;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getPluginId() {
        return pluginId;
    }

    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }

    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }

    public Map<String, String> getAttributesMap() {
        if (null == attributesMap) {

            attributesMap = (Map)JSONObject.parse(attributes);
        }
        return attributesMap;
    }

    public void setAttributesMap(Map<String, String> attributesMap) {
        this.attributesMap = attributesMap;
    }

    @Override
    public String toString() {
        return "PluginConfig{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", isEnabled=" + isEnabled +
                ", modifyDate=" + modifyDate +
                ", orders=" + orders +
                ", pluginId='" + pluginId + '\'' +
                ", attributes='" + attributes + '\'' +
                '}';
    }
}
