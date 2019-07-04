package com.study.demo.pay.wx;

import com.study.demo.pay.PaymentPlugin;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @Auther Mr.Zheng
 * @Date 2019-03-12 17:15
 * @Description
 */
@Component("wxPaymentPlugin")
public class WxPaymentPlugin extends PaymentPlugin {

    @Override
    public Map<String, Object> getParameterMap(ClientType client, String sn, String description, HttpServletRequest request, HttpServletResponse httpResponse) {
        return null;
    }
}
