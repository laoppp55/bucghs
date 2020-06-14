package com.bizwink.BidInfo;

import com.bizwink.cms.server.InitServer;
import com.bizwink.util.CommonsMultipartResolverExt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

@Controller
public class UploadController {
    @RequestMapping(value = "/Upload.do")
    public void Upload(HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        String path = InitServer.getProperties().getProperty("main.uploaddir");
        CommonsMultipartResolverExt multipartResolver = new CommonsMultipartResolverExt();
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request)) {
            //将request变成多request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            multiRequest.setCharacterEncoding("utf-8");
            //获取multiRequest中所有的文件名
            Iterator iter = multiRequest.getFileNames();

            while(iter.hasNext()){
                //一次遍历所有的文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if(file!=null){
                    String name = file.getOriginalFilename();
                    //得到文件名
                    int index = name.lastIndexOf("\\");
                    String fileName = "";
                    if(index == -1){
                        fileName = name;
                    }else{
                        fileName = name.substring(index + 1);
                    }

                    //文件名加UUID保障文件名唯一
                    String uuid = UUID.randomUUID().toString();
                    uuid = uuid.replace("-", "");
                    fileName = uuid + "_" + fileName;

                    //获取收入流
                    InputStream fileInputStream = file.getInputStream();

                    //也可不用自己写实现方法直接使用,fileItem.write(uploadFile);
                    System.out.println(path + fileName);
                    File uploadFile = new File(path,fileName);

                    //首先要确认路径是否存在
                    uploadFile.getParentFile().mkdirs();
                    //检查文件是否已经存在
                    if(!uploadFile.exists()){
                        //建立文件
                        uploadFile.createNewFile();
                    }

                    FileOutputStream out2 = new FileOutputStream(uploadFile);

                    //开始copy文件
                    @SuppressWarnings("unused")
                    int len = 0;//每次读取的字节数
                    byte[] bytes = new byte[1024];
                    while((len = fileInputStream.read(bytes, 0, bytes.length)) != -1){
                        out2.write(bytes);
                    }
                    out2.flush();
                    out2.close();
                    fileInputStream.close();

                    //上传
                    //file.transferTo(new File(path));
                }
            }
        }
        out.flush();
        out.close();
    }

    @RequestMapping(value = "/Process.do", method = RequestMethod.GET)
    @ResponseBody
    public String getProcessInfo(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        com.bizwink.cms.entity.Upload upload  = (com.bizwink.cms.entity.Upload)session.getAttribute("upload");
        if(upload==null){
            System.out.println("i'm is null");
            return "{}";
        } else {
            System.out.println("i not is null");
        }
        return upload.toString();
    }
}
