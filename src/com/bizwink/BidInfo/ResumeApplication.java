package com.bizwink.BidInfo;

import com.bizwink.error.ErrorMessage;
import com.bizwink.po.Jobinfo;
import com.bizwink.service.IResumeInfoService;
import com.bizwink.util.MD5Util;
import com.bizwink.util.ParamUtil;
import com.bizwink.util.SpringInit;
import com.bizwink.util.filter;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.net.URLDecoder;

@Controller
public class ResumeApplication {
    @RequestMapping(value = "/saveResumeInfo.do")
    public @ResponseBody ErrorMessage saveResumeInfo(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String name = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "name"),"utf-8"));                          //简历投递人姓名
        String sex = filter.excludeHTMLCode(ParamUtil.getParameter(request, "sex"));                                                             //简历投递人性别
        String age = filter.excludeHTMLCode(ParamUtil.getParameter(request, "age"));                                                             //简历投递人年龄
        String edubackground = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "edubackground"),"utf-8"));       //学历
        String edusystem = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "edusystem"),"utf-8"));                //学制
        String school = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "school"),"utf-8"));                      //毕业院校
        String major = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "major"),"utf-8"));                        //所学专业
        String telephone = filter.excludeHTMLCode(ParamUtil.getParameter(request, "telephone"));                                                 //联系手机电话
        String graduationtime = filter.excludeHTMLCode(ParamUtil.getParameter(request, "graduationtime"));                                       //毕业时间
        String resumefilename = filter.excludeHTMLCode(URLDecoder.decode(ParamUtil.getParameter(request, "resumefilename"),"utf-8"));      //简历文件名
        String yzcode = ParamUtil.getParameter(request, "yzcode");                                                                                //验证码
        String checkcode = filter.excludeHTMLCode(ParamUtil.getParameter(request, "checkval"));                                                   //前端所有投递信息的MD5签名

        if (age==null) age="";
        String messages = "name=" + name + "&sex=" + sex  + "&age=" + age + "&edubackground=" + edubackground + "&edusystem=" + edusystem + "&school=" + school +
                "&major=" + major + "&telephone=" + telephone + "&graduationtime=" + graduationtime + "&resumefilename=" + resumefilename + "&yzcode=" + yzcode;
        String paramVals = MD5Util.MD5Encode(messages,"utf-8");
        System.out.println(checkcode + "==" + paramVals);

        HttpSession session = request.getSession();
        String yzcodeForSession = (String)session.getAttribute("randnum");
        System.out.println(yzcode + "==" + yzcodeForSession);

        int retcode = 0;
        ErrorMessage errorMessage = new ErrorMessage();
        if (yzcode.equals(yzcodeForSession)) {
            if (checkcode.equals(paramVals)) {
                ApplicationContext appContext = SpringInit.getApplicationContext();
                if (appContext != null) {
                    IResumeInfoService resumeInfoService = (IResumeInfoService)appContext.getBean("resumeInfoService");
                    Jobinfo jobinfo = new Jobinfo();
                    jobinfo.setFIRSTNAME(name);
                    jobinfo.setSENDNAME(name);
                    jobinfo.setNATIONALITY("中国");
                    jobinfo.setGENDER(sex.equals("0")?"男":"女");
                    jobinfo.setAGE(age);
                    if (edubackground.equals("0"))
                        jobinfo.setEDUCATIONALCATEGORIE("大专");
                    else if (edubackground.equals("1"))
                        jobinfo.setEDUCATIONALCATEGORIE("本科");
                    else if (edubackground.equals("2"))
                        jobinfo.setEDUCATIONALCATEGORIE("硕士");
                    else if (edubackground.equals("3"))
                        jobinfo.setEDUCATIONALCATEGORIE("博士");
                    else
                        jobinfo.setEDUCATIONALCATEGORIE("其它");
                    jobinfo.setGRADE(edusystem);
                    jobinfo.setMAJOR1(major);
                    jobinfo.setPHONE(telephone);
                    jobinfo.setGRADUATESCHOOL(school);
                    jobinfo.setWORKBGNTIME1(graduationtime);
                    jobinfo.setDOCUMENTSNUM1(resumefilename);
                    jobinfo.setCOMPANYID(String.valueOf(0));
                    jobinfo.setPOSTID(String.valueOf(0));
                    jobinfo.setDOCUMENTSTYPE(String.valueOf(0));
                    retcode = resumeInfoService.saveResumeInfo(jobinfo);
                }else {
                    errorMessage.setErrcode(-203);
                    errorMessage.setErrmsg("系统环境出现错误,简历投递失败，请您过一段时间再次重新投递简历");
                    errorMessage.setModelname("简历投递系统");
                }
            } else {
                errorMessage.setErrcode(-204);
                errorMessage.setErrmsg("前后台数据收入不相符，未通过数据验证,简历投递失败，请您检验您的投递信息");
                errorMessage.setModelname("简历投递系统");
            }
        } else {
            errorMessage.setErrcode(-205);
            errorMessage.setErrmsg("验证码收入错误，未通过数据验证,简历投递失败，请您检验输入的验证码或者刷新并输入新的验证码");
            errorMessage.setModelname("简历投递系统");
        }

        if (retcode > 0) {
            errorMessage.setErrcode(0);
            errorMessage.setErrmsg("简历投递成功，感谢您投递简历");
            errorMessage.setModelname("简历投递系统");
        } else {
            errorMessage.setErrcode(-1);
            errorMessage.setErrmsg("简历投递失败，请您重新投递简历");
            errorMessage.setModelname("简历投递系统");
        }

        return errorMessage;
    }
}
