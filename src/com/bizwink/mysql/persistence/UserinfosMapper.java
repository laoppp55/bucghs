package com.bizwink.mysql.persistence;

import com.bizwink.mysql.po.Userinfos;

public interface UserinfosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userinfos
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userinfos
     *
     * @mbggenerated
     */
    int insert(Userinfos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userinfos
     *
     * @mbggenerated
     */
    int insertSelective(Userinfos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userinfos
     *
     * @mbggenerated
     */
    Userinfos selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userinfos
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Userinfos record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_userinfos
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Userinfos record);
}