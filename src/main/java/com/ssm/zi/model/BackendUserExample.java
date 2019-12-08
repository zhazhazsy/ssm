package com.ssm.zi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BackendUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackendUserExample() {
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

        public Criteria andUsercodeIsNull() {
            addCriterion("userCode is null");
            return (Criteria) this;
        }

        public Criteria andUsercodeIsNotNull() {
            addCriterion("userCode is not null");
            return (Criteria) this;
        }

        public Criteria andUsercodeEqualTo(String value) {
            addCriterion("userCode =", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotEqualTo(String value) {
            addCriterion("userCode <>", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThan(String value) {
            addCriterion("userCode >", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeGreaterThanOrEqualTo(String value) {
            addCriterion("userCode >=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThan(String value) {
            addCriterion("userCode <", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLessThanOrEqualTo(String value) {
            addCriterion("userCode <=", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeLike(String value) {
            addCriterion("userCode like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotLike(String value) {
            addCriterion("userCode not like", value, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeIn(List<String> values) {
            addCriterion("userCode in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotIn(List<String> values) {
            addCriterion("userCode not in", values, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeBetween(String value1, String value2) {
            addCriterion("userCode between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsercodeNotBetween(String value1, String value2) {
            addCriterion("userCode not between", value1, value2, "usercode");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("userName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("userName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("userName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("userName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("userName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("userName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("userName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("userName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("userName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("userName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("userName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("userName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("userName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("userName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("userType is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("userType is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Long value) {
            addCriterion("userType =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Long value) {
            addCriterion("userType <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Long value) {
            addCriterion("userType >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Long value) {
            addCriterion("userType >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Long value) {
            addCriterion("userType <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Long value) {
            addCriterion("userType <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Long> values) {
            addCriterion("userType in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Long> values) {
            addCriterion("userType not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Long value1, Long value2) {
            addCriterion("userType between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Long value1, Long value2) {
            addCriterion("userType not between", value1, value2, "usertype");
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

        public Criteria andUserpasswordIsNull() {
            addCriterion("userPassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userPassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userPassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userPassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userPassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userPassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userPassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userPassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userPassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userPassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userPassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userPassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userPassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userPassword not between", value1, value2, "userpassword");
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