package org.sang.auth.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.sang.auth.service.TokenService;
import org.sang.beans.entity.User;
import org.sang.beans.util.Dto;
import org.sang.beans.util.DtoUtil;
import org.sang.beans.util.ItripTokenVo;
import org.sang.beans.util.error.ErrorCode;
import org.sang.dao.dao3.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Calendar;

@Api(tags = "登陆注销")
@Controller
public class LoginController {
    @Resource
    TokenService tokenService;
    @Resource
    UserDao userDao;
    @ApiImplicitParams({@ApiImplicitParam(value = "登陆手机号",name = "mobile",required = true,dataType = "String"),
      @ApiImplicitParam(value = "密码",name = "mobilePsw",required = true,dataType = "String")})
    @PostMapping("/logins")
    @ResponseBody
    @ApiOperation(value ="用户登陆",notes = "使用json 格式返回发送状态")
    public Dto login(String mobile, String mobilePsw, HttpServletRequest request){
        try {
            User userVo = new User();
            String md5Password = DigestUtils.md5DigestAsHex(mobilePsw.getBytes());
            userVo.setMobile(mobile);
            userVo.setMobilePsw(md5Password);
            User user =userDao.queryAll2(userVo);
            if(user!=null){
                String userAgent=request.getHeader("user-agent");
                String token=tokenService.generateToken(userAgent,user);
                tokenService.sava(token,user);
                ItripTokenVo vo=new ItripTokenVo(token,Calendar.getInstance().getTimeInMillis()+2*60*60*1000, Calendar.getInstance().getTimeInMillis());
                return DtoUtil.returnDataSuccess(vo);
            }else{
                return DtoUtil.returnFail("用户密码错误", ErrorCode.AUTH_AUTHENTICATION_FAILED);
            }
        }catch (Exception e){
            e.printStackTrace();
            return DtoUtil.returnFail(e.getMessage(), ErrorCode.AUTH_AUTHENTICATION_FAILED);
        }
    }
    @RequestMapping(value = "/loginOut",method = RequestMethod.GET,produces = "application/json",headers = "token")
    @ResponseBody
    @ApiOperation(value ="用户退出",notes = "使用json 格式返回发送状态")
    public Dto loginout(HttpServletRequest request){
        String token=request.getHeader("token");
        System.out.println(token);
        System.out.println(request.getHeader("user-agent"));
        try {
            if (tokenService.validate(request.getHeader("user-agent"),token)) {
                tokenService.delete(token);
                return DtoUtil.returnSuccess();
            }else{
                return DtoUtil.returnFail("token无效",ErrorCode.AUTH_TOKEN_INVALID);
            }
        }catch (Exception e){
            e.printStackTrace();
            return DtoUtil.returnFail("退出失败", ErrorCode.AUTH_TOKEN_INVALID);
        }
    }

}
