package com.bizwink.persistence;

import com.bizwink.po.OpenBiddingItemTemplate;
import com.bizwink.po.OpenBiddingItemTemplateExample;

public interface OpenBiddingItemTemplateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    int countByExample(OpenBiddingItemTemplateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    int insert(OpenBiddingItemTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    int insertSelective(OpenBiddingItemTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    OpenBiddingItemTemplate selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(OpenBiddingItemTemplate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_openbiddingitemtemplate
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OpenBiddingItemTemplate record);
}