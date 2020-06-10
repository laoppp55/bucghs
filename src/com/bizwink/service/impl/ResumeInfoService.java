package com.bizwink.service.impl;

import com.bizwink.persistence.JobinfoMapper;
import com.bizwink.po.Jobinfo;
import com.bizwink.service.IResumeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResumeInfoService implements IResumeInfoService{
    @Autowired
    private JobinfoMapper jobinfoMapper;

    public int saveResumeInfo(Jobinfo jobinfo) {
        return jobinfoMapper.insert(jobinfo);
    }
}
