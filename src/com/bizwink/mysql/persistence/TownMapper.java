package com.bizwink.mysql.persistence;

import com.bizwink.mysql.po.Town;
import com.bizwink.mysql.po.TownExample;

public interface TownMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_town
     *
     * @mbggenerated
     */
    int countByExample(TownExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_town
     *
     * @mbggenerated
     */
    int insert(Town record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table en_town
     *
     * @mbggenerated
     */
    int insertSelective(Town record);
}