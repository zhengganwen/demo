package com.study.demo.pay;

import com.study.demo.domain.PluginConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 16:51
 * @Description
 */
public abstract class PaymentPlugin{

    private PluginConfig pluginConfig;



    /** 支付类型 */
    public enum ClientType {
        /** wap端 */
        wap,
        /** app端 */
        app,
        /** pc端 */
        pc
    }

    /**
     * 通知方法
     */
    public enum NotifyMethod {

        /** 通用 */
        general,

        /** 同步 */
        sync,

        /** 异步 */
        async
    }

    /**
     * 请求方法
     */
    public enum RequestMethod {

        /** POST */
        post,

        /** GET */
        get
    }

    /** 支付类型 */
    public enum Type {
        /** 支付宝 */
        alipay,
        /** 微信 */
        wechat,
        /** 连连支付 */
        lianlian,
        /** 银联 */
        unionpay
    }

    public abstract Map<String, Object> getParameterMap(ClientType client, String sn,
                                                        String description, HttpServletRequest request, HttpServletResponse httpResponse);


}
