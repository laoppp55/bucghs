package com.bizwink.BidInfo;

import com.bizwink.error.ErrorMessage;
import com.bizwink.po.LeaveWord;
import com.bizwink.service.ILeaveWordService;
import com.bizwink.util.MD5Util;
import com.bizwink.util.ParamUtil;
import com.bizwink.util.SpringInit;
import com.bizwink.util.filter;
import com.google.gson.Gson;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.sql.Timestamp;

@Controller
public class MaterialsController {
    @RequestMapping(value = "/saveBuildingMaterialsInfo.do",produces = "application/json;charset=UTF-8")
    public @ResponseBody String saveBuildingMaterialsInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String contactor = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "contactor"), "utf-8"));  //联系人姓名
        String mphone = filter.excludeHTMLCode(ParamUtil.getParameter(request, "mphone"));                                          //联系人电话
        String content = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "content"),"utf-8"));                                        //咨询内容
        String yzcode = ParamUtil.getParameter(request, "yzcode");                                                                  //验证码
        String checkcode = filter.excludeHTMLCode(ParamUtil.getParameter(request, "checkval"));                                    //前端所有投递信息的MD5签名

        HttpSession session = request.getSession();
        String yzcodeForSession = (String)session.getAttribute("randnum");
        //System.out.println(yzcode + "==" + yzcodeForSession);

        String messages = "contactor=" + contactor + "&mphone=" + mphone  + "&content=" + content + "&yzcode=" + yzcode;
        //System.out.println(messages);
        String paramVals = MD5Util.MD5Encode(messages,"utf-8");
        //System.out.println(checkcode + "==" + paramVals);

        //获取用户端的IP地址
        String user_ip = null;
        if (request.getHeader("x-forwarded-for") == null) {
            user_ip = request.getRemoteAddr();
        } else {
            user_ip = request.getHeader("x-forwarded-for");
        }

        int retcode = 0;
        ErrorMessage errorMessage = new ErrorMessage();
        if (yzcode.equals(yzcodeForSession)) {
            if (checkcode.equals(paramVals)) {
                ApplicationContext appContext = SpringInit.getApplicationContext();
                if (appContext != null) {
                    ILeaveWordService leaveWordService = (ILeaveWordService)appContext.getBean("leaveWordService");
                    LeaveWord leaveWord = new LeaveWord();
                    leaveWord.setSITEID(BigDecimal.valueOf(59));
                    leaveWord.setUSERID(user_ip);
                    if (content.length()>50) {
                        leaveWord.setTITLE(content.substring(0,50));
                    } else {
                        leaveWord.setTITLE(content);
                    }
                    leaveWord.setLINKMAN(contactor);
                    leaveWord.setMPHONE(mphone);
                    leaveWord.setPHONE(mphone);
                    leaveWord.setCONTENT(content);
                    leaveWord.setWRITEDATE(new Timestamp(System.currentTimeMillis()));
                    retcode = leaveWordService.saveLeaveWord(leaveWord);
                    session.removeAttribute("randnum");
                }else {
                    errorMessage.setErrcode(-203);
                    errorMessage.setErrmsg("系统环境出现错误,建筑材料需求信息投递失败，请您过一段时间再次重新投递建筑材料需求信息");
                    errorMessage.setModelname("建筑材料需求信息投递系统");
                    session.removeAttribute("randnum");
                }
            } else {
                errorMessage.setErrcode(-204);
                errorMessage.setErrmsg("前后台数据收入不相符，未通过数据验证,建筑材料需求信息投递失败，请您检验您的投递信息");
                errorMessage.setModelname("建筑材料需求信息投递系统");
                session.removeAttribute("randnum");
            }
        } else {
            errorMessage.setErrcode(-205);
            errorMessage.setErrmsg("验证码收入错误，未通过数据验证,建筑材料需求信息投递失败，请您检验输入的验证码或者刷新并输入新的验证码");
            errorMessage.setModelname("建筑材料需求信息投递系统");
            session.removeAttribute("randnum");
        }

        if (retcode > 0) {
            errorMessage.setErrcode(0);
            errorMessage.setErrmsg("建筑材料需求信息投递成功，感谢您投递简历");
            errorMessage.setModelname("建筑材料需求信息投递系统");
        } else {
            errorMessage.setErrcode(-1);
            errorMessage.setErrmsg("建筑材料需求信息投递失败，请您重新投递简历");
            errorMessage.setModelname("建筑材料需求信息投递系统");
        }

        Gson gson = new Gson();
        String jsondata = gson.toJson(errorMessage);
        //System.out.println(jsondata);

        return jsondata;
    }
}
