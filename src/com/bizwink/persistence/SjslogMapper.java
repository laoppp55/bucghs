package com.bizwink.persistence;

import com.bizwink.po.Sjslog;
import com.bizwink.po.SjslogExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SjslogMapper {

    BigDecimal getKey();
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int countByExample(SjslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int deleteByExample(SjslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int insert(Sjslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int insertSelective(Sjslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    List<Sjslog> selectByExample(SjslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    Sjslog selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Sjslog record, @Param("example") SjslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Sjslog record, @Param("example") SjslogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Sjslog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_SJS_LOG
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sjslog record);
}