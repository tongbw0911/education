package org.sang.pay.config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class AlipayConfig {
    // 商户appid
    private  String APPID = "2016101700710235";
    // 私钥 pkcs8格式的
    private  String RSA_PRIVATE_KEY = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC/2nQa/N8XG4K4pnxlyKQgRC3YUqSVNtWO+PS2+G+v5AW61XusPs8HFTCvoSVbMjoCGuOhcNygJPX12vorBdqCn3ieSfYdiH2waQKyFH0mKOfuADwpLMk81pAGrWRStt3YBW2DeZ7X2bWmdJSVTaitZdLwTVSDKJ71xBp7rnKi3FvUFoUGVTvBkfENNe1wucCG8uUKAhw22wx+M2kzMKZVwrBaVl0T+Ifypkv7DSeKxH+DHiTH2dQziSc0FxS0cGNgkW8yTnUdhPMHnW80szOeAuqN1l/rW+PTHN3U0kr+vZOLLAcd3mI6GZFJA3kQEQs/DtNS8dS+d+a6qHfm1s4jAgMBAAECggEAKL8dz6mLPB4kqlD5tKhja1LvpbUPrX1C6CWp275yAhpcuSykIpYIZEm02GhSRccqGM5bMCuHQB/5eSjz3vVUTk/OT1gIBIe7oh77apT9a4BemebE4D3Z06kCV9i1qPebsEie1MCc4t0jPmIeOIOQ4prwrQbPfze+YxYuRbxsLnheN7hryjUI43KduV3atMib5yC3nFCMJN1exopqpbxqunIeZYE8qKwJPoKtucP0egnQ5FdVKhovm9tmUFQTGnH5jcQdiRUKYbyul7f5q5MxdPadawJMDbiCbzvzloS2rWKXMlmRuQVpMgqeW+yi5C0mI4Jajcio3CP3wlcgABzPYQKBgQDwnIV0NpLtXzVWmCSglKpN/3RayG7ZMuWzwxf5s/peQGnbLz38p1prOFf8AVhsAU+O/yfsu/Rbx9dL+RoEIEIYUC3pM+ospfYD8rYn/06Ixa36tOvifEYauGDfb4+1bZf/JOu3MIimvhDnS53Gt51Nk2C/bX34AS6gf/BInxnu0QKBgQDMH6BzU52J37aTEGDhsgKY2ExCw++Lhy0/NEoTEtzjJmGERK93B6aE2pqZPdFiDzLuc+IIkYI7VvLCUGiA7UChU+5En90vM0kcgLncYIHDW972ebSGvXGPNfKVt6IEc4fR2T47iapecuV49v8zY1ufftS36izpeG3lGEqiihAyswKBgG7MdPv+AYzDcgltSDiWHRKL1yXS9JCaSoKMDWdURK/QU662Q4IsAowrRwDqEbCyrdM4lkcCilUVYoQ+sodB343YpjukR2rGBdLtmooynBSJi0NOuuzxs0qsqxdZBUFTtVGty8nw1IyMK7aG8KHIfexyOHQOVJq22KTaJWkbstJxAoGAYnjfbsNnvJuv+EJuenLlzdaK86qSZT1RFqyjD5CJ/wsFAEoiW8nVC0JqUoL//85VQ7Oj135a1UWc1yDzST8rbqiOyYxVp++V1apD/4yPDS/E4CLWdCnwHqZn4NI11u/lFdc3roE7L1U+XpzJgIDuMoN9GzxdbkQqv9p4JvFz3wECgYBwyEyfNT/JJG1MU/KMsG8Hi7qT8wzkDGncfOkgWzdeHexfXTjhr9WZzQlSQlpTpkkdYFKVd3AAyk5MpbcMNvNXRDZNNovjR7dinNeS8jRcJH53mp6rDHT25NQEn4Ox+JwQjXLxpVDEAp1Bw0HvPbC/oW+YCHm2vInwi6zN/YI1/g==";
    // 服务器异步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    private  String notify_url = "http://tongbowen1.wezoz.com/notify";
    // 页面跳转同步通知页面路径 需http://或者https://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问 商户可以自定义同步跳转地址
    private  String return_url = "http://tongbowen1.wezoz.com/returnUrl";
    // 请求网关地址
    private  String URL = "https://openapi.alipaydev.com/gateway.do";
    // 编码
    private  String CHARSET = "utf-8";
    // 返回格式
    private  String FORMAT = "json";
    // 支付宝公钥
    private  String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgh6ySdecxfOzupdP7ZhbFXraBFZGMgfbkxqd0Bk2D0pE0+23XwS5sokJX3+HRuKwToMGnya/8csKSbKZ2fNVm0gmgRlxIB/oDTYpTHBi9A4aiDV2I0mnDJcie3fKwGTpZtDk4wS/RcUOcaQZqiT0wlaUK8jM17O/njKG52eAcYwiM4FfcRQ/2hqXU+LVHVKK0uL6qe7oBjFN5jLtK7Uk/E3jitqT3yfbVwV6Ul1AxK3V+l7kqfalGAN+mL3FsNIGXvu8l8BpIl0nffm3MjijGkOEi4fClmFLlzF+sHpJEAb+wpDtz2pd78Y0gKWWyG/D1FBoutXyZYLGbUj2IY6dYQIDAQAB";
    // 日志记录目录
    private  String log_path = "/logs";
    // RSA2
    private  String SIGNTYPE = "RSA2";
    //支付成功跳转页
    private String paymentSuccessUrl="http://localhost:8088/pay/success";
    //支付失败跳转页
    private String paymentFailureUrl="http://localhost:8088/pay/failure";

    public String getAPPID() {
        return APPID;
    }

    public void setAPPID(String APPID) {
        this.APPID = APPID;
    }

    public String getRSA_PRIVATE_KEY() {
        return RSA_PRIVATE_KEY;
    }

    public void setRSA_PRIVATE_KEY(String RSA_PRIVATE_KEY) {
        this.RSA_PRIVATE_KEY = RSA_PRIVATE_KEY;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getReturn_url() {
        return return_url;
    }

    public void setReturn_url(String return_url) {
        this.return_url = return_url;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getCHARSET() {
        return CHARSET;
    }

    public void setCHARSET(String CHARSET) {
        this.CHARSET = CHARSET;
    }

    public String getFORMAT() {
        return FORMAT;
    }

    public void setFORMAT(String FORMAT) {
        this.FORMAT = FORMAT;
    }

    public String getALIPAY_PUBLIC_KEY() {
        return ALIPAY_PUBLIC_KEY;
    }

    public void setALIPAY_PUBLIC_KEY(String ALIPAY_PUBLIC_KEY) {
        this.ALIPAY_PUBLIC_KEY = ALIPAY_PUBLIC_KEY;
    }

    public String getLog_path() {
        return log_path;
    }

    public void setLog_path(String log_path) {
        this.log_path = log_path;
    }

    public String getSIGNTYPE() {
        return SIGNTYPE;
    }

    public void setSIGNTYPE(String SIGNTYPE) {
        this.SIGNTYPE = SIGNTYPE;
    }

    public String getPaymentSuccessUrl() {
        return paymentSuccessUrl;
    }

    public void setPaymentSuccessUrl(String paymentSuccessUrl) {
        this.paymentSuccessUrl = paymentSuccessUrl;
    }

    public String getPaymentFailureUrl() {
        return paymentFailureUrl;
    }

    public void setPaymentFailureUrl(String paymentFailureUrl) {
        this.paymentFailureUrl = paymentFailureUrl;
    }
}
