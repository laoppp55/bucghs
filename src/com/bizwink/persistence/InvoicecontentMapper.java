package com.bizwink.persistence;

import com.bizwink.po.Invoicecontent;
import com.bizwink.po.InvoicecontentExample;

public interface InvoicecontentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    int countByExample(InvoicecontentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    int insert(Invoicecontent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    int insertSelective(Invoicecontent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    Invoicecontent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Invoicecontent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontent
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Invoicecontent record);
}