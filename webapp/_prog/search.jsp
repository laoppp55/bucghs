<%@ page import="com.bizwink.search.SearchFilesServlet" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.lucene.document.Document" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.text.ParseException" %>
<%@ page import="com.bizwink.util.StringUtil" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.bizwink.util.filter" %>
<%@ page language="java" contentType="text/html;charset=utf-8" %>

<%
    request.setCharacterEncoding("utf-8");
    String sitename = request.getServerName();  //site name
    sitename = "www.bjcjhs.com";
    sitename = StringUtil.replace(sitename,".","_");
    String pagesstr = filter.excludeHTMLCode(request.getParameter("currpage"));
    int pages = 1;  //当前页
    if (pagesstr == null) {
        pages = 1;
    } else {
        pages = Integer.parseInt(pagesstr);
    }
    int range = 20;
    String content = filter.excludeHTMLCode(request.getParameter("searchcontent"));
    SearchFilesServlet search = new SearchFilesServlet();

    List list = new ArrayList();
    int num = 0;

    if (content != null) {
        if (!content.isEmpty()) {
            String ip = request.getHeader("x-forwarded-for");
            if(ip == null || ip.length() == 0 ||"unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("Proxy-Client-IP");
            }
            if(ip == null || ip.length() == 0 ||"unknown".equalsIgnoreCase(ip)) {
                ip = request.getHeader("WL-Proxy-Client-IP");
            }
            if(ip == null || ip.length() == 0 ||"unknown".equalsIgnoreCase(ip)) {
                ip = request.getRemoteAddr();
            }
            num = search.getArticlesNum(sitename,content); //总的记录数
            list = search.getArticles(sitename,content,(pages-1) * range, pages * range);
        }
    }

    int totalPages = 0;  //总页数
    if (num % range == 0) {
        totalPages = num / range;
    } else {
        totalPages = num / range + 1;
    }
    sitename = request.getServerName();
%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>北京城建华晟交通建设有限公司--信息检索</title>
    <link href="/css/main2019.css" rel="stylesheet" type="text/css" />
    <link href="/css/list.css" rel="stylesheet" type="text/css" />
    <script src="/js/jquery-1.10.2.min.js" type="text/javascript"></script>
</head>

<body>
<div class="full_box">
    <div class="top_box">
        <%@include file="/inc/top.shtml" %>
    </div>
    <div class="logo_box clearfix">
        <%@include file="/inc/search.shtml" %>
    </div>
    <div class="menu_box">
        <%@include file="/inc/menu.shtml" %>
    </div>
</div>

<!--以上页面头-->
<div class="banner"><img alt="" src="/images/banner02.jpg"></div>
<div class="main div_top div_bottom clearfix">
    <div class="path_box">当前位置：<a href="#">首页</a>><a href="#">搜索结果</a></div>
    <div class="search_result">
        <div class="search_title">搜索结果--记录总数：<%=num%>条</div>
        <%
            for(int ii=0; ii<list.size(); ii++) {
                Document doc = (Document)list.get(ii);
                String filename = doc.get("filename");
                String url = null;
                String colurl = doc.get("dirname");
                String colname = doc.get("colname");
                String summary = doc.get("summary");
                String createdate = doc.get("createdate");
                if (filename == null)
                    url = colurl + createdate + "/" + doc.get("id") + ".shtml";
                else
                    url = colurl + "download/" + filename;
                System.out.println(url);
        %>
        <div class="ss_bk">
            <h3>【<a href="<%=colurl%>" target="_blank"><%=colname%></a>】<a href="<%=url%>" target="_blank"><%=doc.get("maintitle")%></a>         <%=createdate%></h3>
            <p align=left><%=(summary!=null)?summary:""%><a href="<%=url%>" target="_blank">[详细]</a></p>
        </div>
        <%}%>
    </div>
    <div class="search_page" id="pagesid">
        <script>
            Pagination(<%=totalPages%>,<%=pages%>,"<%=content%>","search.jsp");
        </script>
    </div>

</div>
<!--以下页面尾-->
<div>
    <%@include file="/inc/tail.shtml" %>
</div>
</body>
</html>
