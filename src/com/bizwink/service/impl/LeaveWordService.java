package com.bizwink.service.impl;

import com.bizwink.persistence.LeaveWordMapper;
import com.bizwink.po.LeaveWord;
import com.bizwink.service.ILeaveWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeaveWordService implements ILeaveWordService{
    @Autowired
    private LeaveWordMapper leaveWordMapper;

    public int saveLeaveWord(LeaveWord leaveWord) {
        return leaveWordMapper.insert(leaveWord);
    }

}
