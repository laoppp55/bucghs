package com.bizwink.po;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrainingClassExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public TrainingClassExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
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
     * This method corresponds to the database table TBL_TRAININGCLASS
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
     * This method corresponds to the database table TBL_TRAININGCLASS
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TBL_TRAININGCLASS
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
     * This class corresponds to the database table TBL_TRAININGCLASS
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

        public Criteria andPROJCODEIsNull() {
            addCriterion("PROJCODE is null");
            return (Criteria) this;
        }

        public Criteria andPROJCODEIsNotNull() {
            addCriterion("PROJCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPROJCODEEqualTo(String value) {
            addCriterion("PROJCODE =", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODENotEqualTo(String value) {
            addCriterion("PROJCODE <>", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODEGreaterThan(String value) {
            addCriterion("PROJCODE >", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODEGreaterThanOrEqualTo(String value) {
            addCriterion("PROJCODE >=", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODELessThan(String value) {
            addCriterion("PROJCODE <", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODELessThanOrEqualTo(String value) {
            addCriterion("PROJCODE <=", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODELike(String value) {
            addCriterion("PROJCODE like", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODENotLike(String value) {
            addCriterion("PROJCODE not like", value, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODEIn(List<String> values) {
            addCriterion("PROJCODE in", values, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODENotIn(List<String> values) {
            addCriterion("PROJCODE not in", values, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODEBetween(String value1, String value2) {
            addCriterion("PROJCODE between", value1, value2, "PROJCODE");
            return (Criteria) this;
        }

        public Criteria andPROJCODENotBetween(String value1, String value2) {
            addCriterion("PROJCODE not between", value1, value2, "PROJCODE");
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

        public Criteria andCLASSNAMEIsNull() {
            addCriterion("CLASSNAME is null");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMEIsNotNull() {
            addCriterion("CLASSNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMEEqualTo(String value) {
            addCriterion("CLASSNAME =", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMENotEqualTo(String value) {
            addCriterion("CLASSNAME <>", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMEGreaterThan(String value) {
            addCriterion("CLASSNAME >", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSNAME >=", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMELessThan(String value) {
            addCriterion("CLASSNAME <", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMELessThanOrEqualTo(String value) {
            addCriterion("CLASSNAME <=", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMELike(String value) {
            addCriterion("CLASSNAME like", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMENotLike(String value) {
            addCriterion("CLASSNAME not like", value, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMEIn(List<String> values) {
            addCriterion("CLASSNAME in", values, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMENotIn(List<String> values) {
            addCriterion("CLASSNAME not in", values, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMEBetween(String value1, String value2) {
            addCriterion("CLASSNAME between", value1, value2, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSNAMENotBetween(String value1, String value2) {
            addCriterion("CLASSNAME not between", value1, value2, "CLASSNAME");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEIsNull() {
            addCriterion("CLASSCODE is null");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEIsNotNull() {
            addCriterion("CLASSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEEqualTo(String value) {
            addCriterion("CLASSCODE =", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODENotEqualTo(String value) {
            addCriterion("CLASSCODE <>", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEGreaterThan(String value) {
            addCriterion("CLASSCODE >", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEGreaterThanOrEqualTo(String value) {
            addCriterion("CLASSCODE >=", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODELessThan(String value) {
            addCriterion("CLASSCODE <", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODELessThanOrEqualTo(String value) {
            addCriterion("CLASSCODE <=", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODELike(String value) {
            addCriterion("CLASSCODE like", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODENotLike(String value) {
            addCriterion("CLASSCODE not like", value, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEIn(List<String> values) {
            addCriterion("CLASSCODE in", values, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODENotIn(List<String> values) {
            addCriterion("CLASSCODE not in", values, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODEBetween(String value1, String value2) {
            addCriterion("CLASSCODE between", value1, value2, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCLASSCODENotBetween(String value1, String value2) {
            addCriterion("CLASSCODE not between", value1, value2, "CLASSCODE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIsNull() {
            addCriterion("CREATEDATE is null");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIsNotNull() {
            addCriterion("CREATEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEEqualTo(Date value) {
            addCriterion("CREATEDATE =", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotEqualTo(Date value) {
            addCriterion("CREATEDATE <>", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThan(Date value) {
            addCriterion("CREATEDATE >", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE >=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThan(Date value) {
            addCriterion("CREATEDATE <", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATELessThanOrEqualTo(Date value) {
            addCriterion("CREATEDATE <=", value, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEIn(List<Date> values) {
            addCriterion("CREATEDATE in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotIn(List<Date> values) {
            addCriterion("CREATEDATE not in", values, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATEBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }

        public Criteria andCREATEDATENotBetween(Date value1, Date value2) {
            addCriterion("CREATEDATE not between", value1, value2, "CREATEDATE");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table TBL_TRAININGCLASS
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
     * This class corresponds to the database table TBL_TRAININGCLASS
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