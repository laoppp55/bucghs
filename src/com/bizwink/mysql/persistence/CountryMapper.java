package com.bizwink.mysql.persistence;

import com.bizwink.mysql.po.Country;
import com.bizwink.mysql.po.CountryExample;

public interface CountryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_country
     *
     * @mbggenerated
     */
    int countByExample(CountryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_country
     *
     * @mbggenerated
     */
    int insert(Country record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_country
     *
     * @mbggenerated
     */
    int insertSelective(Country record);
}