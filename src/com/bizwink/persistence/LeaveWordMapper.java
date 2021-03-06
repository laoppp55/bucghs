package com.bizwink.persistence;

import com.bizwink.po.LeaveWord;
import com.bizwink.po.LeaveWordExample;
import java.math.BigDecimal;

public interface LeaveWordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    int countByExample(LeaveWordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    int insert(LeaveWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    int insertSelective(LeaveWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    LeaveWord selectByPrimaryKey(BigDecimal ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(LeaveWord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_LEAVEWORD
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(LeaveWord record);
}