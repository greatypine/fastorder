package com.example.demo.utils.weixin.config;

/**
 * @Description:
 * @Date: 2018/4/8
 * @Author: wcf
 */
public class WxPayConfig {
    //小程序appid
    public static final String appid = "wx04ab7dabcda2692b";
    //微信支付的商户id
    public static final String mch_id = "1544389031";
    //微信支付的商户密钥
    public static final String key = "qwertyuiop1234567890asdfghjklzxc";
    //签名方式
    public static final String SIGNTYPE = "MD5";
    //交易类型
    public static final String TRADETYPE = "JSAPI";
    //微信统一下单接口地址
    public static final String pay_url = "https://api.mch.weixin.qq.com/pay/unifiedorder";
    //支付成功后的服务器回调url
//    public static final String notify_url = "https://??/weixin/wxNotify";
    public static final String notify_url = "http://localhost:8080/weixin/wxNotify";
}
