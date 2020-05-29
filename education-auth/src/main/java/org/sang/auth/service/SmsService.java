package org.sang.auth.service;


import com.cloopen.rest.sdk.CCPRestSmsSDK;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class SmsService{
    public void SendTo(String to, String templateId, String[] datas) throws Exception {
        CCPRestSmsSDK sdk=new CCPRestSmsSDK();
        sdk.init("app.cloopen.com", "8883");
        sdk.setAccount("8aaf07087051bcec01707b00634d1738", "bb2677f563a547c59f1ca67deba8c509");
        sdk.setAppId("8aaf07087051bcec01707b0063b2173f");
        HashMap result = sdk.sendTemplateSMS(to, templateId, datas);
        if ("000000".equals(result.get("statusCode"))) {
            System.out.println("短信发送成功！");
        }else{
            throw new Exception(result.get("statusCode").toString()+":"+result.get("statusMsg").toString());
        }
    }
}
