<%@ page import="com.bizwink.search.SearchFilesServlet" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.lucene.document.Document" %>
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
<head><meta charset="utf-8">
    <title>北京城建华晟交通建设有限公司--信息检索</title>
    <link href="/css/main2019.css" rel="stylesheet" type="text/css" />
    <link href="/css/list.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="/js/jquery-1.11.1.min.js"></script>
    <script>
        function goThePage() {
            window.document.location = "/_prog/search.jsp?currpage=" + $("#select").val() +"&searchcontent=<%=content%>"
        }
    </script>
</head>
<body>
<div class="full_box"><!--#include virtual="/inc/head.shtml"--></div>

<div class="banner"><img alt="" src="/images/banner03_c.jpg" /></div>
<!--BANNER END-->

<div class="main whitebg clearfix">
    <div class="content_box clearfix">
        <div class="box_out">
            <div class="title">
                <h2><span>检索结果</span></h2>
            </div>
        </div>

        <div class="box_out clearfix">
            <div class="list-right">
                <ul><!--循环LI开始-->
                    <%
                        for(int ii=0; ii<list.size(); ii++) {
                            Document doc = (Document)list.get(ii);
                            String maintitle = doc.get("maintitle");
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
                    <li><a href="<%=url%>" target="_blank"><span><%=createdate%></span> </a>

                        <p><a href="<%=url%>" target="_blank"><%=maintitle%></a></p>
                    </li>
                    <%}%>
                    <!--循环LI结束-->
                </ul>

                <div class="page" id="ArticlePage">
                    <span>第1页</span> <span>共<%=totalPages%>页</span>
                    <%if(pages>1) {%>
                    <a href="/_prog/search.jsp?currpage=<%=(pages-1)%>&searchcontent=<%=content%>">上一页</a>
                    <%}%>
                    <%
                        int startpage = pages-2;
                        int endpage = pages + 2;
                        if (startpage<0) {
                            startpage = 1;
                            endpage = 5;
                        }
                        if (endpage>totalPages) {
                            startpage = totalPages-5;
                            if(startpage<0) startpage=1;
                            endpage = totalPages;
                        }
                        for(int ii=startpage;ii<=endpage;ii++){
                            if (pages==ii)
                                out.println("<span class=\"cur\">" + ii + "</span>");
                            else
                                out.println("<a href=\"/_prog/search.jsp?currpage=" + ii + "&searchcontent=" + content + "\">" + ii + "</a>");
                        }

                    %>
                    <!--span class="cur">1</span>
                    <a href="javascript:void(0)" onclick="doSearch(2,65828,'2018')">2</a>
                    <a href="javascript:void(0)" onclick="doSearch(3,65828,'2018')">3</a>
                    <a href="javascript:void(0)" onclick="doSearch(4,65828,'2018')">4</a>
                    <a href="javascript:void(0)" onclick="doSearch(5,65828,'2018')">5</a-->
                    <%if (pages<totalPages) {%>
                    <a href="/_prog/search.jsp?currpage=<%=(pages+1)%>&searchcontent=<%=content%>">下一页</a>
                    <%} else {%>
                    <a href="/_prog/search.jsp?currpage=<%=totalPages%>&searchcontent=<%=content%>">下一页</a>
                    <%}%>
                    <span class="select-pager">
                        转到第<select id="select" onchange="goThePage();">
                        <% for (int ii=0;ii<totalPages;ii++) {
                            if (pages == (ii+1))
                                out.println("<option selected=\"selected\" value=\"" + pages + "\">" + (ii+1) +"</option>");
                            else
                                out.println("<option value=\"" + (ii+1) + "\">" + (ii+1) + "</option>");
                        }%>
                    </select>页
                    </span>
                </div>
            </div>

            <div class="ichanye-box"><!--#include virtual="/inc/right.shtml"--></div>
        </div>
    </div>
</div>

<div class="full_box foot"><!--#include virtual="/inc/tail.shtml"--></div>
</body>
</html>
