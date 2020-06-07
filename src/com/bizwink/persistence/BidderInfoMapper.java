package com.bizwink.persistence;

import com.bizwink.po.BidderInfo;
import com.bizwink.po.BidderInfoExample;

import java.util.List;
import java.util.Map;

public interface BidderInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int countByExample(BidderInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String uuid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int insert(BidderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int insertSelective(BidderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    BidderInfo selectByPrimaryKey(String uuid);

    BidderInfo getBidderInfoByProjcodeAndCompcode(Map params);

    List<BidderInfo> getBidderInfosByUseridAndCompcode(Map params);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BidderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeyWithBLOBs(BidderInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table bidder_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BidderInfo record);
}