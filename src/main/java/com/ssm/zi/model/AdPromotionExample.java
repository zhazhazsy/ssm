package com.ssm.zi.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdPromotionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdPromotionExample() {
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

        public Criteria andAppidIsNull() {
            addCriterion("appId is null");
            return (Criteria) this;
        }

        public Criteria andAppidIsNotNull() {
            addCriterion("appId is not null");
            return (Criteria) this;
        }

        public Criteria andAppidEqualTo(Long value) {
            addCriterion("appId =", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotEqualTo(Long value) {
            addCriterion("appId <>", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThan(Long value) {
            addCriterion("appId >", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidGreaterThanOrEqualTo(Long value) {
            addCriterion("appId >=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThan(Long value) {
            addCriterion("appId <", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidLessThanOrEqualTo(Long value) {
            addCriterion("appId <=", value, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidIn(List<Long> values) {
            addCriterion("appId in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotIn(List<Long> values) {
            addCriterion("appId not in", values, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidBetween(Long value1, Long value2) {
            addCriterion("appId between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAppidNotBetween(Long value1, Long value2) {
            addCriterion("appId not between", value1, value2, "appid");
            return (Criteria) this;
        }

        public Criteria andAdpicpathIsNull() {
            addCriterion("adPicPath is null");
            return (Criteria) this;
        }

        public Criteria andAdpicpathIsNotNull() {
            addCriterion("adPicPath is not null");
            return (Criteria) this;
        }

        public Criteria andAdpicpathEqualTo(String value) {
            addCriterion("adPicPath =", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotEqualTo(String value) {
            addCriterion("adPicPath <>", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathGreaterThan(String value) {
            addCriterion("adPicPath >", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathGreaterThanOrEqualTo(String value) {
            addCriterion("adPicPath >=", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathLessThan(String value) {
            addCriterion("adPicPath <", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathLessThanOrEqualTo(String value) {
            addCriterion("adPicPath <=", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathLike(String value) {
            addCriterion("adPicPath like", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotLike(String value) {
            addCriterion("adPicPath not like", value, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathIn(List<String> values) {
            addCriterion("adPicPath in", values, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotIn(List<String> values) {
            addCriterion("adPicPath not in", values, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathBetween(String value1, String value2) {
            addCriterion("adPicPath between", value1, value2, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpicpathNotBetween(String value1, String value2) {
            addCriterion("adPicPath not between", value1, value2, "adpicpath");
            return (Criteria) this;
        }

        public Criteria andAdpvIsNull() {
            addCriterion("adPV is null");
            return (Criteria) this;
        }

        public Criteria andAdpvIsNotNull() {
            addCriterion("adPV is not null");
            return (Criteria) this;
        }

        public Criteria andAdpvEqualTo(Long value) {
            addCriterion("adPV =", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvNotEqualTo(Long value) {
            addCriterion("adPV <>", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvGreaterThan(Long value) {
            addCriterion("adPV >", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvGreaterThanOrEqualTo(Long value) {
            addCriterion("adPV >=", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvLessThan(Long value) {
            addCriterion("adPV <", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvLessThanOrEqualTo(Long value) {
            addCriterion("adPV <=", value, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvIn(List<Long> values) {
            addCriterion("adPV in", values, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvNotIn(List<Long> values) {
            addCriterion("adPV not in", values, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvBetween(Long value1, Long value2) {
            addCriterion("adPV between", value1, value2, "adpv");
            return (Criteria) this;
        }

        public Criteria andAdpvNotBetween(Long value1, Long value2) {
            addCriterion("adPV not between", value1, value2, "adpv");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionIsNull() {
            addCriterion("carouselPosition is null");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionIsNotNull() {
            addCriterion("carouselPosition is not null");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionEqualTo(Integer value) {
            addCriterion("carouselPosition =", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionNotEqualTo(Integer value) {
            addCriterion("carouselPosition <>", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionGreaterThan(Integer value) {
            addCriterion("carouselPosition >", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionGreaterThanOrEqualTo(Integer value) {
            addCriterion("carouselPosition >=", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionLessThan(Integer value) {
            addCriterion("carouselPosition <", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionLessThanOrEqualTo(Integer value) {
            addCriterion("carouselPosition <=", value, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionIn(List<Integer> values) {
            addCriterion("carouselPosition in", values, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionNotIn(List<Integer> values) {
            addCriterion("carouselPosition not in", values, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionBetween(Integer value1, Integer value2) {
            addCriterion("carouselPosition between", value1, value2, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andCarouselpositionNotBetween(Integer value1, Integer value2) {
            addCriterion("carouselPosition not between", value1, value2, "carouselposition");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endTime not between", value1, value2, "endtime");
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