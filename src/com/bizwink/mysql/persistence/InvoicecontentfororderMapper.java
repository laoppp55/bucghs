package com.bizwink.mysql.persistence;

import com.bizwink.mysql.po.Invoicecontentfororder;
import com.bizwink.mysql.po.InvoicecontentfororderExample;

import java.util.List;

public interface InvoicecontentfororderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    int countByExample(InvoicecontentfororderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    int deleteByOrderid(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    int insert(Invoicecontentfororder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    int insertSelective(Invoicecontentfororder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    Invoicecontentfororder selectByPrimaryKey(Integer id);

    List<Invoicecontentfororder> selectByOrderid(Long orderid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Invoicecontentfororder record);

    int updateByOrderidSelective(Invoicecontentfororder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_invoicecontentfororder
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Invoicecontentfororder record);
}