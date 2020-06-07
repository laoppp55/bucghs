package com.bizwink.po;

import java.util.ArrayList;
import java.util.List;

public class EvalBidingScoreItemsForSessionsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public EvalBidingScoreItemsForSessionsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
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
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
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
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_evalbidingscoreitemsforsessions
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
     * This class corresponds to the database table tbl_evalbidingscoreitemsforsessions
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidIsNull() {
            addCriterion("evalmethodid is null");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidIsNotNull() {
            addCriterion("evalmethodid is not null");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidEqualTo(String value) {
            addCriterion("evalmethodid =", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotEqualTo(String value) {
            addCriterion("evalmethodid <>", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidGreaterThan(String value) {
            addCriterion("evalmethodid >", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidGreaterThanOrEqualTo(String value) {
            addCriterion("evalmethodid >=", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidLessThan(String value) {
            addCriterion("evalmethodid <", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidLessThanOrEqualTo(String value) {
            addCriterion("evalmethodid <=", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidLike(String value) {
            addCriterion("evalmethodid like", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotLike(String value) {
            addCriterion("evalmethodid not like", value, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidIn(List<String> values) {
            addCriterion("evalmethodid in", values, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotIn(List<String> values) {
            addCriterion("evalmethodid not in", values, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidBetween(String value1, String value2) {
            addCriterion("evalmethodid between", value1, value2, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andEvalmethodidNotBetween(String value1, String value2) {
            addCriterion("evalmethodid not between", value1, value2, "evalmethodid");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeIsNull() {
            addCriterion("purchasesectioncode is null");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeIsNotNull() {
            addCriterion("purchasesectioncode is not null");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeEqualTo(String value) {
            addCriterion("purchasesectioncode =", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeNotEqualTo(String value) {
            addCriterion("purchasesectioncode <>", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeGreaterThan(String value) {
            addCriterion("purchasesectioncode >", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("purchasesectioncode >=", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeLessThan(String value) {
            addCriterion("purchasesectioncode <", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeLessThanOrEqualTo(String value) {
            addCriterion("purchasesectioncode <=", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeLike(String value) {
            addCriterion("purchasesectioncode like", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeNotLike(String value) {
            addCriterion("purchasesectioncode not like", value, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeIn(List<String> values) {
            addCriterion("purchasesectioncode in", values, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeNotIn(List<String> values) {
            addCriterion("purchasesectioncode not in", values, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeBetween(String value1, String value2) {
            addCriterion("purchasesectioncode between", value1, value2, "purchasesectioncode");
            return (Criteria) this;
        }

        public Criteria andPurchasesectioncodeNotBetween(String value1, String value2) {
            addCriterion("purchasesectioncode not between", value1, value2, "purchasesectioncode");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tbl_evalbidingscoreitemsforsessions
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
     * This class corresponds to the database table tbl_evalbidingscoreitemsforsessions
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