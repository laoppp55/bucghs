package com.bizwink.vo;

import java.io.Serializable;

public class voWinResultsNotice implements Serializable {
    private String uuid;
    private String winningAnnName;
    private String createTime;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWinningAnnName() {
        return winningAnnName;
    }

    public void setWinningAnnName(String winningAnnName) {
        this.winningAnnName = winningAnnName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
