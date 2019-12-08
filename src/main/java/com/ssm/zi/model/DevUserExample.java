package com.ssm.zi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DevUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DevUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andDevcodeIsNull() {
            addCriterion("devCode is null");
            return (Criteria) this;
        }

        public Criteria andDevcodeIsNotNull() {
            addCriterion("devCode is not null");
            return (Criteria) this;
        }

        public Criteria andDevcodeEqualTo(String value) {
            addCriterion("devCode =", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeNotEqualTo(String value) {
            addCriterion("devCode <>", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeGreaterThan(String value) {
            addCriterion("devCode >", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeGreaterThanOrEqualTo(String value) {
            addCriterion("devCode >=", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeLessThan(String value) {
            addCriterion("devCode <", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeLessThanOrEqualTo(String value) {
            addCriterion("devCode <=", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeLike(String value) {
            addCriterion("devCode like", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeNotLike(String value) {
            addCriterion("devCode not like", value, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeIn(List<String> values) {
            addCriterion("devCode in", values, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeNotIn(List<String> values) {
            addCriterion("devCode not in", values, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeBetween(String value1, String value2) {
            addCriterion("devCode between", value1, value2, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevcodeNotBetween(String value1, String value2) {
            addCriterion("devCode not between", value1, value2, "devcode");
            return (Criteria) this;
        }

        public Criteria andDevnameIsNull() {
            addCriterion("devName is null");
            return (Criteria) this;
        }

        public Criteria andDevnameIsNotNull() {
            addCriterion("devName is not null");
            return (Criteria) this;
        }

        public Criteria andDevnameEqualTo(String value) {
            addCriterion("devName =", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotEqualTo(String value) {
            addCriterion("devName <>", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameGreaterThan(String value) {
            addCriterion("devName >", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameGreaterThanOrEqualTo(String value) {
            addCriterion("devName >=", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLessThan(String value) {
            addCriterion("devName <", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLessThanOrEqualTo(String value) {
            addCriterion("devName <=", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameLike(String value) {
            addCriterion("devName like", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotLike(String value) {
            addCriterion("devName not like", value, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameIn(List<String> values) {
            addCriterion("devName in", values, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotIn(List<String> values) {
            addCriterion("devName not in", values, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameBetween(String value1, String value2) {
            addCriterion("devName between", value1, value2, "devname");
            return (Criteria) this;
        }

        public Criteria andDevnameNotBetween(String value1, String value2) {
            addCriterion("devName not between", value1, value2, "devname");
            return (Criteria) this;
        }

        public Criteria andDevpasswordIsNull() {
            addCriterion("devPassword is null");
            return (Criteria) this;
        }

        public Criteria andDevpasswordIsNotNull() {
            addCriterion("devPassword is not null");
            return (Criteria) this;
        }

        public Criteria andDevpasswordEqualTo(String value) {
            addCriterion("devPassword =", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordNotEqualTo(String value) {
            addCriterion("devPassword <>", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordGreaterThan(String value) {
            addCriterion("devPassword >", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("devPassword >=", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordLessThan(String value) {
            addCriterion("devPassword <", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordLessThanOrEqualTo(String value) {
            addCriterion("devPassword <=", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordLike(String value) {
            addCriterion("devPassword like", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordNotLike(String value) {
            addCriterion("devPassword not like", value, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordIn(List<String> values) {
            addCriterion("devPassword in", values, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordNotIn(List<String> values) {
            addCriterion("devPassword not in", values, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordBetween(String value1, String value2) {
            addCriterion("devPassword between", value1, value2, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevpasswordNotBetween(String value1, String value2) {
            addCriterion("devPassword not between", value1, value2, "devpassword");
            return (Criteria) this;
        }

        public Criteria andDevemailIsNull() {
            addCriterion("devEmail is null");
            return (Criteria) this;
        }

        public Criteria andDevemailIsNotNull() {
            addCriterion("devEmail is not null");
            return (Criteria) this;
        }

        public Criteria andDevemailEqualTo(String value) {
            addCriterion("devEmail =", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailNotEqualTo(String value) {
            addCriterion("devEmail <>", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailGreaterThan(String value) {
            addCriterion("devEmail >", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailGreaterThanOrEqualTo(String value) {
            addCriterion("devEmail >=", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailLessThan(String value) {
            addCriterion("devEmail <", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailLessThanOrEqualTo(String value) {
            addCriterion("devEmail <=", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailLike(String value) {
            addCriterion("devEmail like", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailNotLike(String value) {
            addCriterion("devEmail not like", value, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailIn(List<String> values) {
            addCriterion("devEmail in", values, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailNotIn(List<String> values) {
            addCriterion("devEmail not in", values, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailBetween(String value1, String value2) {
            addCriterion("devEmail between", value1, value2, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevemailNotBetween(String value1, String value2) {
            addCriterion("devEmail not between", value1, value2, "devemail");
            return (Criteria) this;
        }

        public Criteria andDevinfoIsNull() {
            addCriterion("devInfo is null");
            return (Criteria) this;
        }

        public Criteria andDevinfoIsNotNull() {
            addCriterion("devInfo is not null");
            return (Criteria) this;
        }

        public Criteria andDevinfoEqualTo(String value) {
            addCriterion("devInfo =", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoNotEqualTo(String value) {
            addCriterion("devInfo <>", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoGreaterThan(String value) {
            addCriterion("devInfo >", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoGreaterThanOrEqualTo(String value) {
            addCriterion("devInfo >=", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoLessThan(String value) {
            addCriterion("devInfo <", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoLessThanOrEqualTo(String value) {
            addCriterion("devInfo <=", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoLike(String value) {
            addCriterion("devInfo like", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoNotLike(String value) {
            addCriterion("devInfo not like", value, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoIn(List<String> values) {
            addCriterion("devInfo in", values, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoNotIn(List<String> values) {
            addCriterion("devInfo not in", values, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoBetween(String value1, String value2) {
            addCriterion("devInfo between", value1, value2, "devinfo");
            return (Criteria) this;
        }

        public Criteria andDevinfoNotBetween(String value1, String value2) {
            addCriterion("devInfo not between", value1, value2, "devinfo");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNull() {
            addCriterion("createdBy is null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIsNotNull() {
            addCriterion("createdBy is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedbyEqualTo(Long value) {
            addCriterion("createdBy =", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotEqualTo(Long value) {
            addCriterion("createdBy <>", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThan(Long value) {
            addCriterion("createdBy >", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyGreaterThanOrEqualTo(Long value) {
            addCriterion("createdBy >=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThan(Long value) {
            addCriterion("createdBy <", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyLessThanOrEqualTo(Long value) {
            addCriterion("createdBy <=", value, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyIn(List<Long> values) {
            addCriterion("createdBy in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotIn(List<Long> values) {
            addCriterion("createdBy not in", values, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyBetween(Long value1, Long value2) {
            addCriterion("createdBy between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreatedbyNotBetween(Long value1, Long value2) {
            addCriterion("createdBy not between", value1, value2, "createdby");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("creationDate is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("creationDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("creationDate =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("creationDate <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("creationDate >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("creationDate >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("creationDate <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("creationDate <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("creationDate in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("creationDate not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("creationDate between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("creationDate not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNull() {
            addCriterion("modifyBy is null");
            return (Criteria) this;
        }

        public Criteria andModifybyIsNotNull() {
            addCriterion("modifyBy is not null");
            return (Criteria) this;
        }

        public Criteria andModifybyEqualTo(Long value) {
            addCriterion("modifyBy =", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotEqualTo(Long value) {
            addCriterion("modifyBy <>", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThan(Long value) {
            addCriterion("modifyBy >", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyGreaterThanOrEqualTo(Long value) {
            addCriterion("modifyBy >=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThan(Long value) {
            addCriterion("modifyBy <", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyLessThanOrEqualTo(Long value) {
            addCriterion("modifyBy <=", value, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyIn(List<Long> values) {
            addCriterion("modifyBy in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotIn(List<Long> values) {
            addCriterion("modifyBy not in", values, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyBetween(Long value1, Long value2) {
            addCriterion("modifyBy between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifybyNotBetween(Long value1, Long value2) {
            addCriterion("modifyBy not between", value1, value2, "modifyby");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("modifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("modifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("modifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("modifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("modifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("modifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("modifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("modifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("modifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("modifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("modifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("modifyDate not between", value1, value2, "modifydate");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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