<%@ page import="com.bizwink.service.INoticeService" %>
<%@ page import="com.bizwink.util.SpringInit" %>
<%@ page import="org.springframework.context.ApplicationContext" %>
<%@ page import="com.bizwink.util.ParamUtil" %>
<%@ page import="com.bizwink.service.IBudgetProjectService" %>
<%@ page import="com.bizwink.service.IPurchaseProjectService" %>
<%@ page import="com.bizwink.po.BudgetProject" %>
<%@ page import="com.bizwink.po.PurchaseProject" %>
<%@ page import="com.bizwink.service.IWinResultsNoticeService" %>
<%@ page import="com.bizwink.po.WinResultsNotice" %>
<%@ page import="com.bizwink.po.WinResultsNoticeWithBLOBs" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 18-9-23
  Time: 下午7:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ApplicationContext appContext = SpringInit.getApplicationContext();

    String uuid = ParamUtil.getParameter(request,"uuid");
    PurchaseProject purchaseProject = null;
    BudgetProject budgetProject = null;
    WinResultsNoticeWithBLOBs winResultsNotice = null;
    if (appContext!=null) {
        IWinResultsNoticeService winResultsNoticeService = (IWinResultsNoticeService)appContext.getBean("winResultsNoticeService");
        winResultsNotice = winResultsNoticeService.getWinResultsNoticeByUUID(uuid);

        IPurchaseProjectService purchaseProjectService = (IPurchaseProjectService)appContext.getBean("purchaseProjectService");
        purchaseProject = purchaseProjectService.getProjectInfoByProjCode(winResultsNotice.getPurchaseprojcode());

        IBudgetProjectService budgetProjectService = (IBudgetProjectService)appContext.getBean("budgetProjectService");
        if (purchaseProject==null) response.sendRedirect("/users/error.jsp?errcode=300");
        budgetProject = budgetProjectService.getBudgetProjByPrjcode(purchaseProject.getBudgetProjectId());
    }

    String priceFormCode = winResultsNotice.getPriceFormCode();
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>招标公告--<%=winResultsNotice.getWinningAnnName()%></title>
    <link href="/ggzyjy/css/base.css" rel="stylesheet" type="text/css">
    <link href="/ggzyjy/css/list_more.css" rel="stylesheet" type="text/css">
    <link href="/ggzyjy/css/jquery.msgbox.css" rel="stylesheet" type="text/css" />
    <link href="/ggzyjy/css/jquery-ui.min.css" rel="stylesheet" type="text/css" />

    <script src="/ggzyjy/js/style.js" type="text/javascript" ></script>
    <script src="/ggzyjy/js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script src="/ggzyjy/js/jquery.msgbox.min.js" type="text/javascript"></script>
    <script src="/ggzyjy/js/jquery.dragndrop.min.js" type="text/javascript"></script>

    <script src="/ggzyjy/js/jquery-ui.js" language="javascript" type="text/javascript"></script>
    <script src="/ggzyjy/js/md5-min.js" type="text/javascript"></script>
    <script src="/ggzyjy/js/users.js" type="text/javascript"></script>
</head>
<body>
<div class="date_box">
    <%@include file="/ggzyjy/inc/writeCurrentDate.shtml" %>
</div>
<%@include file="/ggzyjy/inc/head_ggxx.shtml" %>
<div class="main clearfix">
    <div class="banner_box">
        <div class="baner_box_left">全国公共资源交易平台（北京市·西城区）西城区公共资源交易<br>
            信息网<br>公平 公正 公开 诚信</div>
    </div>
    <div class="menu_box_1">
        <div class="home_box"><a href="/ggzyjy/">首页</a></div>
        <div class="menu_list">
            <!--ul>
                <li class="fl_4"><a href="/ggzyjy/ywdt/tztg/">要闻动态</a></li>
                <li class="fl_3 current">公告信息</li>
                <li class="fl_2"><a href="/ggzyjy/fwzn/fwzn/">服务指南</a></li>
                <li class="fl_1"><a href="/ggzyjy/jrkb/">今日开标</a></li>
            </ul-->
        </div>
    </div>
    <div class="menu_c_box"><a href="/ggzyjy/ggxx/zbgg/">招标（资审）公告</a>|<a href="/ggzyjy/ggxx/bggg/">变更公告</a>|<a class="current">中标公告</a>|<a href="/ggzyjy/ggxx/other/">其它公告</a></div>
    <div class="path_search_box">
        <div class="path_box">您的位置：<a href="/ggzyjy/">首页</a>&gt;<a href="/ggzyjy/ggxx/">公告信息</a>&gt;招标（资审）公告</div>
        <div class="search_box"><input type="text" class="sear"></div>
    </div>
    <div  style="width: 1105px;margin:0 auto">
        <div style="text-align: center;margin:28px 0 28px 0;"> <span style="font-size: 20px;font-weight: bold"><%=winResultsNotice.getWinningAnnName()%></span></div>
        <div align="left" style="padding-left:30px;">
            <p align="center"></p>
            <p><p><strong>一、项目编号：<%=purchaseProject.getPurchaseprojcode()%></strong></p>
            <p><strong>二、项目名称：<%=purchaseProject.getPurchaseprojname()%></strong></p>
            <p><strong>三、中标（成交）信息</strong></p>
            <!--价款形式代码 1-金额  2-费率/比率/优惠率/合格率等 3-单价 4-其它形式 -->
            <% if (priceFormCode.equals("1")) {%>
            <p>总中标金额：<fmt:formatNumber type="currency" pattern="￥.000000#"><%=winResultsNotice.getWinBidingPrice().floatValue()%></fmt:formatNumber> 万元（人民币）</p>
            <%} else if (priceFormCode.equals("2")){%>
            <p>总中标金额：<fmt:formatNumber type="currency" pattern="￥.000000#"><%=winResultsNotice.getWinBidingPrice().floatValue()%></fmt:formatNumber> 万元（人民币）</p>
            <%} else if (priceFormCode.equals("3")) {%>
            <p>总中标金额：<fmt:formatNumber type="currency" pattern="￥.000000#"><%=winResultsNotice.getWinBidingPrice().floatValue()%></fmt:formatNumber> 万元（人民币）</p>
            <%} else {%>
            <p>总中标金额：<fmt:formatNumber type="currency" pattern="￥.000000#"><%=winResultsNotice.getWinBidingPrice().floatValue()%></fmt:formatNumber> 万元（人民币）</p>
            <%}%>
            <p>中标供应商名称、联系地址及中标金额：</p>
            <p>
            <p>&nbsp;项目管理费01包--文化领域项目管理费:</p>
            <p>中标人：京华观致（北京）国际信息咨询有限公司</p>
            <p>中标单位地址:&nbsp;北京市石景山区广宁村新立街25号托儿所2层2202房间</p>
            <p>中标金额：小写：&yen;450000元</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大写：肆拾伍万元整</p>
            <p>项目管理费02包--文物和旅游项目事中跟踪管理费:</p>
            <p>中标人：北京东方华太工程咨询有限公司</p>
            <p>中标单位地址:&nbsp;北京市东城区光明西街1号14号楼2层218室</p>
            <p>中标金额：小写：&yen;232800元</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大写：贰拾叁万贰仟捌佰元整</p>
            <p>项目管理费03包--文物和旅游项目事后绩效管理费:</p>
            <p>中标人：北京通正会计师事务所有限责任公司</p>
            <p>中标单位地址:&nbsp;北京市通州区中仓路3号1幢</p>
            <p>中标金额：小写：&yen;308000元</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;大写：叁拾万零捌仟元整</p>
            </p>
            <p><strong>四、主要标的信息</strong></p>
            <p></p>
            <p>
            <p>项目名称：项目管理费</p><p>项目编号：TZXM-202004278352</p>
            <p>招标单位：北京市通州区文化和旅游局</p>
            <p>地 &nbsp;&nbsp;&nbsp;址：北京市通州区车站路27号</p>
            <p>联 系 人： 刘超</p>
            <p>联系电话： 010-80574852</p>
            <p>招标代理人：中工久诚（北京）管理咨询有限公司</p>
            <p>地 &nbsp;&nbsp;&nbsp;址： 北京市通州区疃里东区庄园G5号楼102底商</p>
            <p>联 系 人： 皮丹</p>
            <p>联系电话： 010-61519006&nbsp;</p>
            <p>批准文号：通财教采指[2020]40号</p>
            <p>&nbsp;</p>
            <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;项目管理费于2020年04月29日发布招标公告，2020年05月25日开标，并于2020年05月27日已按照招标文件规定的评标办法完成了评标工作。</p>
            <p>中标标的名称、规格型号、数量、单价、服务要求：</p>
            <p>详见招标文件</p>
            <p><span>服务时间：自签订合同之日始一年</span></p>
            </p>
            <p><strong>五、评审专家（单一来源采购人员）名单：</strong></p>
            <p>张海峰，马宁，刘胜岭，吴巧先，刘海燕</p>
            <p><strong>六、代理服务收费标准及金额：</strong></p>
            <p></p>
            <p><b>本项目代理费总金额：4.5万元（人民币）</b></p>
            <p>本项目代理费收费标准：</p>
            <p>按原国家计委《招标代理服务收费管理暂行办法》[2002]1980号的规定执行</p>
            <p><strong>七、公告期限</strong></p>
            <p>自本公告发布之日起1个工作日。</p>
            <p><strong>八、其它补充事宜</strong></p>
            <p>
            <p></p>
            </p>
            <p></p>
            <p><strong>九、凡对本次公告内容提出询问，请按以下方式联系。</strong></p>
            <p>1.采购人信息</p>
            <p>名 称：北京市通州区文化和旅游局　　　　　</p>
            <p>地址：北京市通州区车站路27号　　　　　　　　</p>
            <p>联系方式：刘超 010-80574852　　　　　　</p>        　　　
            <p>2.采购代理机构信息</p>
            <p>名 称：中工久诚（北京）管理咨询有限公司　　　　　　　　　　　　</p>
            <p>地　址：北京市通州区疃里东区庄园G5号楼102底商　　　　　　　　　　　　</p>
            <p>联系方式：皮丹 010-61519006　　　　　　　　　　　　</p>
            <p>3.项目联系方式</p>
            <p>项目联系人：皮丹</p>
            <p>电　话：　　010-61519006</p>　
            <p></p>
            <p>&nbsp;</p>
            <p></p>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      </p>
            <p>
                <a href="./P020200529648136928742.rar">2020项目管理费.rar</a>
            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>

            </p>
            <p>
            </p>
        </div>
    </div>
    <div class="anniu">
        【 <A href="javascript:window.print()" style="width:500px;color: #0a53ad" >打印</A> 】
        【 <A href="javascript:window.opener=null;window.open('','_self');window.close();" style="color: #0a53ad">关闭窗口</A> 】
    </div>
</div>
</body>
</html>
