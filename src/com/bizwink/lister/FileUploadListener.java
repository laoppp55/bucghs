package com.bizwink.lister;

import org.apache.commons.fileupload.ProgressListener;
import javax.servlet.http.HttpSession;

public class FileUploadListener implements ProgressListener {
    private HttpSession session;

    public FileUploadListener() { }

    public FileUploadListener(HttpSession _session) {
        session=_session;
        com.bizwink.cms.entity.Upload upload = new com.bizwink.cms.entity.Upload();
        session.setAttribute("upload",upload);
    }

    @Override
    public void update(long bytesRead, long contentLength, int items) {
        com.bizwink.cms.entity.Upload upload  = (com.bizwink.cms.entity.Upload) session.getAttribute("upload");
        System.out.println(contentLength + "==" + bytesRead);
        upload.setTotalSize(contentLength);
        upload.setUploadSize(bytesRead);
        upload.setRet_filename(String.valueOf(items));
        session.setAttribute("upload",upload);
    }
}
