package com.bizwink.persistence;

import com.bizwink.po.bhApplyGuarantee;
import com.bizwink.po.bhApplyGuaranteeExample;

public interface bhApplyGuaranteeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    int countByExample(bhApplyGuaranteeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    int insert(bhApplyGuarantee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    int insertSelective(bhApplyGuarantee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    bhApplyGuarantee selectByPrimaryKey(String uuid);

    bhApplyGuarantee queryGuaranteeLetter(String sectionCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(bhApplyGuarantee record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bh_apply_guarantee
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(bhApplyGuarantee record);
}