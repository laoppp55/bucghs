package com.bizwink.persistence;

import com.bizwink.po.CodeClassfy;
import com.bizwink.po.CodeClassfyExample;

public interface CodeClassfyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    int countByExample(CodeClassfyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Short classcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    int insert(CodeClassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    int insertSelective(CodeClassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    CodeClassfy selectByPrimaryKey(Short classcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(CodeClassfy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_classfy
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(CodeClassfy record);
}