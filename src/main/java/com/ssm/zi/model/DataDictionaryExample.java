package com.ssm.zi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DataDictionaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictionaryExample() {
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

        public Criteria andTypecodeIsNull() {
            addCriterion("typeCode is null");
            return (Criteria) this;
        }

        public Criteria andTypecodeIsNotNull() {
            addCriterion("typeCode is not null");
            return (Criteria) this;
        }

        public Criteria andTypecodeEqualTo(String value) {
            addCriterion("typeCode =", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotEqualTo(String value) {
            addCriterion("typeCode <>", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThan(String value) {
            addCriterion("typeCode >", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("typeCode >=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThan(String value) {
            addCriterion("typeCode <", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLessThanOrEqualTo(String value) {
            addCriterion("typeCode <=", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeLike(String value) {
            addCriterion("typeCode like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotLike(String value) {
            addCriterion("typeCode not like", value, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeIn(List<String> values) {
            addCriterion("typeCode in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotIn(List<String> values) {
            addCriterion("typeCode not in", values, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeBetween(String value1, String value2) {
            addCriterion("typeCode between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypecodeNotBetween(String value1, String value2) {
            addCriterion("typeCode not between", value1, value2, "typecode");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNull() {
            addCriterion("typeName is null");
            return (Criteria) this;
        }

        public Criteria andTypenameIsNotNull() {
            addCriterion("typeName is not null");
            return (Criteria) this;
        }

        public Criteria andTypenameEqualTo(String value) {
            addCriterion("typeName =", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotEqualTo(String value) {
            addCriterion("typeName <>", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThan(String value) {
            addCriterion("typeName >", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameGreaterThanOrEqualTo(String value) {
            addCriterion("typeName >=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThan(String value) {
            addCriterion("typeName <", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLessThanOrEqualTo(String value) {
            addCriterion("typeName <=", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameLike(String value) {
            addCriterion("typeName like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotLike(String value) {
            addCriterion("typeName not like", value, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameIn(List<String> values) {
            addCriterion("typeName in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotIn(List<String> values) {
            addCriterion("typeName not in", values, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameBetween(String value1, String value2) {
            addCriterion("typeName between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andTypenameNotBetween(String value1, String value2) {
            addCriterion("typeName not between", value1, value2, "typename");
            return (Criteria) this;
        }

        public Criteria andValueidIsNull() {
            addCriterion("valueId is null");
            return (Criteria) this;
        }

        public Criteria andValueidIsNotNull() {
            addCriterion("valueId is not null");
            return (Criteria) this;
        }

        public Criteria andValueidEqualTo(Long value) {
            addCriterion("valueId =", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotEqualTo(Long value) {
            addCriterion("valueId <>", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThan(Long value) {
            addCriterion("valueId >", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidGreaterThanOrEqualTo(Long value) {
            addCriterion("valueId >=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThan(Long value) {
            addCriterion("valueId <", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidLessThanOrEqualTo(Long value) {
            addCriterion("valueId <=", value, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidIn(List<Long> values) {
            addCriterion("valueId in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotIn(List<Long> values) {
            addCriterion("valueId not in", values, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidBetween(Long value1, Long value2) {
            addCriterion("valueId between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValueidNotBetween(Long value1, Long value2) {
            addCriterion("valueId not between", value1, value2, "valueid");
            return (Criteria) this;
        }

        public Criteria andValuenameIsNull() {
            addCriterion("valueName is null");
            return (Criteria) this;
        }

        public Criteria andValuenameIsNotNull() {
            addCriterion("valueName is not null");
            return (Criteria) this;
        }

        public Criteria andValuenameEqualTo(String value) {
            addCriterion("valueName =", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotEqualTo(String value) {
            addCriterion("valueName <>", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameGreaterThan(String value) {
            addCriterion("valueName >", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameGreaterThanOrEqualTo(String value) {
            addCriterion("valueName >=", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLessThan(String value) {
            addCriterion("valueName <", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLessThanOrEqualTo(String value) {
            addCriterion("valueName <=", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameLike(String value) {
            addCriterion("valueName like", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotLike(String value) {
            addCriterion("valueName not like", value, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameIn(List<String> values) {
            addCriterion("valueName in", values, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotIn(List<String> values) {
            addCriterion("valueName not in", values, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameBetween(String value1, String value2) {
            addCriterion("valueName between", value1, value2, "valuename");
            return (Criteria) this;
        }

        public Criteria andValuenameNotBetween(String value1, String value2) {
            addCriterion("valueName not between", value1, value2, "valuename");
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