package com.bizwink.persistence;

import com.bizwink.po.SignInfo;
import com.bizwink.po.SignInfoExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface SignInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    int countByExample(SignInfoExample example);

    BigDecimal checkSigninfo(Map params);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    int insert(SignInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    int insertSelective(SignInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    SignInfo selectByPrimaryKey(BigDecimal ID);

    List<SignInfo> getSignInfosForCurrentDay(String signday);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(SignInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SIGNINFO
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SignInfo record);
}