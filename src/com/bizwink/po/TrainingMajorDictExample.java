package com.bizwink.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TrainingMajorDictExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public TrainingMajorDictExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(BigDecimal value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEIsNull() {
            addCriterion("MAJORNAME is null");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEIsNotNull() {
            addCriterion("MAJORNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEEqualTo(String value) {
            addCriterion("MAJORNAME =", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMENotEqualTo(String value) {
            addCriterion("MAJORNAME <>", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEGreaterThan(String value) {
            addCriterion("MAJORNAME >", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("MAJORNAME >=", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMELessThan(String value) {
            addCriterion("MAJORNAME <", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMELessThanOrEqualTo(String value) {
            addCriterion("MAJORNAME <=", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMELike(String value) {
            addCriterion("MAJORNAME like", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMENotLike(String value) {
            addCriterion("MAJORNAME not like", value, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEIn(List<String> values) {
            addCriterion("MAJORNAME in", values, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMENotIn(List<String> values) {
            addCriterion("MAJORNAME not in", values, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMEBetween(String value1, String value2) {
            addCriterion("MAJORNAME between", value1, value2, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORNAMENotBetween(String value1, String value2) {
            addCriterion("MAJORNAME not between", value1, value2, "MAJORNAME");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFIsNull() {
            addCriterion("MAJORBRIEF is null");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFIsNotNull() {
            addCriterion("MAJORBRIEF is not null");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFEqualTo(String value) {
            addCriterion("MAJORBRIEF =", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFNotEqualTo(String value) {
            addCriterion("MAJORBRIEF <>", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFGreaterThan(String value) {
            addCriterion("MAJORBRIEF >", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFGreaterThanOrEqualTo(String value) {
            addCriterion("MAJORBRIEF >=", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFLessThan(String value) {
            addCriterion("MAJORBRIEF <", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFLessThanOrEqualTo(String value) {
            addCriterion("MAJORBRIEF <=", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFLike(String value) {
            addCriterion("MAJORBRIEF like", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFNotLike(String value) {
            addCriterion("MAJORBRIEF not like", value, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFIn(List<String> values) {
            addCriterion("MAJORBRIEF in", values, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFNotIn(List<String> values) {
            addCriterion("MAJORBRIEF not in", values, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFBetween(String value1, String value2) {
            addCriterion("MAJORBRIEF between", value1, value2, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORBRIEFNotBetween(String value1, String value2) {
            addCriterion("MAJORBRIEF not between", value1, value2, "MAJORBRIEF");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEIsNull() {
            addCriterion("MAJORCODE is null");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEIsNotNull() {
            addCriterion("MAJORCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEEqualTo(String value) {
            addCriterion("MAJORCODE =", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODENotEqualTo(String value) {
            addCriterion("MAJORCODE <>", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEGreaterThan(String value) {
            addCriterion("MAJORCODE >", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEGreaterThanOrEqualTo(String value) {
            addCriterion("MAJORCODE >=", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODELessThan(String value) {
            addCriterion("MAJORCODE <", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODELessThanOrEqualTo(String value) {
            addCriterion("MAJORCODE <=", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODELike(String value) {
            addCriterion("MAJORCODE like", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODENotLike(String value) {
            addCriterion("MAJORCODE not like", value, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEIn(List<String> values) {
            addCriterion("MAJORCODE in", values, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODENotIn(List<String> values) {
            addCriterion("MAJORCODE not in", values, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODEBetween(String value1, String value2) {
            addCriterion("MAJORCODE between", value1, value2, "MAJORCODE");
            return (Criteria) this;
        }

        public Criteria andMAJORCODENotBetween(String value1, String value2) {
            addCriterion("MAJORCODE not between", value1, value2, "MAJORCODE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_TRAININGMAJORDICT
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}