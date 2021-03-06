package com.bizwink.persistence;

import com.bizwink.po.TrainingClass;
import com.bizwink.po.TrainingClassExample;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface TrainingClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    int countByExample(TrainingClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(BigDecimal ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    int insert(TrainingClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    int insertSelective(TrainingClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    TrainingClass selectByPrimaryKey(BigDecimal ID);

    List<TrainingClass> getTrainingClassByMajorcode(Map params);

    List<TrainingClass> getTrainingClassByProjcode(String projcode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TrainingClass record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TrainingClass record);
}