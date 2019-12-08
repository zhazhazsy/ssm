package com.ssm.zi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andSoftwarenameIsNull() {
            addCriterion("softwareName is null");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameIsNotNull() {
            addCriterion("softwareName is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameEqualTo(String value) {
            addCriterion("softwareName =", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameNotEqualTo(String value) {
            addCriterion("softwareName <>", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameGreaterThan(String value) {
            addCriterion("softwareName >", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameGreaterThanOrEqualTo(String value) {
            addCriterion("softwareName >=", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameLessThan(String value) {
            addCriterion("softwareName <", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameLessThanOrEqualTo(String value) {
            addCriterion("softwareName <=", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameLike(String value) {
            addCriterion("softwareName like", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameNotLike(String value) {
            addCriterion("softwareName not like", value, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameIn(List<String> values) {
            addCriterion("softwareName in", values, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameNotIn(List<String> values) {
            addCriterion("softwareName not in", values, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameBetween(String value1, String value2) {
            addCriterion("softwareName between", value1, value2, "softwarename");
            return (Criteria) this;
        }

        public Criteria andSoftwarenameNotBetween(String value1, String value2) {
            addCriterion("softwareName not between", value1, value2, "softwarename");
            return (Criteria) this;
        }

        public Criteria andApknameIsNull() {
            addCriterion("APKName is null");
            return (Criteria) this;
        }

        public Criteria andApknameIsNotNull() {
            addCriterion("APKName is not null");
            return (Criteria) this;
        }

        public Criteria andApknameEqualTo(String value) {
            addCriterion("APKName =", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameNotEqualTo(String value) {
            addCriterion("APKName <>", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameGreaterThan(String value) {
            addCriterion("APKName >", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameGreaterThanOrEqualTo(String value) {
            addCriterion("APKName >=", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameLessThan(String value) {
            addCriterion("APKName <", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameLessThanOrEqualTo(String value) {
            addCriterion("APKName <=", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameLike(String value) {
            addCriterion("APKName like", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameNotLike(String value) {
            addCriterion("APKName not like", value, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameIn(List<String> values) {
            addCriterion("APKName in", values, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameNotIn(List<String> values) {
            addCriterion("APKName not in", values, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameBetween(String value1, String value2) {
            addCriterion("APKName between", value1, value2, "apkname");
            return (Criteria) this;
        }

        public Criteria andApknameNotBetween(String value1, String value2) {
            addCriterion("APKName not between", value1, value2, "apkname");
            return (Criteria) this;
        }

        public Criteria andSupportromIsNull() {
            addCriterion("supportROM is null");
            return (Criteria) this;
        }

        public Criteria andSupportromIsNotNull() {
            addCriterion("supportROM is not null");
            return (Criteria) this;
        }

        public Criteria andSupportromEqualTo(String value) {
            addCriterion("supportROM =", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromNotEqualTo(String value) {
            addCriterion("supportROM <>", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromGreaterThan(String value) {
            addCriterion("supportROM >", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromGreaterThanOrEqualTo(String value) {
            addCriterion("supportROM >=", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromLessThan(String value) {
            addCriterion("supportROM <", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromLessThanOrEqualTo(String value) {
            addCriterion("supportROM <=", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromLike(String value) {
            addCriterion("supportROM like", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromNotLike(String value) {
            addCriterion("supportROM not like", value, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromIn(List<String> values) {
            addCriterion("supportROM in", values, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromNotIn(List<String> values) {
            addCriterion("supportROM not in", values, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromBetween(String value1, String value2) {
            addCriterion("supportROM between", value1, value2, "supportrom");
            return (Criteria) this;
        }

        public Criteria andSupportromNotBetween(String value1, String value2) {
            addCriterion("supportROM not between", value1, value2, "supportrom");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageIsNull() {
            addCriterion("interfaceLanguage is null");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageIsNotNull() {
            addCriterion("interfaceLanguage is not null");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageEqualTo(String value) {
            addCriterion("interfaceLanguage =", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageNotEqualTo(String value) {
            addCriterion("interfaceLanguage <>", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageGreaterThan(String value) {
            addCriterion("interfaceLanguage >", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageGreaterThanOrEqualTo(String value) {
            addCriterion("interfaceLanguage >=", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageLessThan(String value) {
            addCriterion("interfaceLanguage <", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageLessThanOrEqualTo(String value) {
            addCriterion("interfaceLanguage <=", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageLike(String value) {
            addCriterion("interfaceLanguage like", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageNotLike(String value) {
            addCriterion("interfaceLanguage not like", value, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageIn(List<String> values) {
            addCriterion("interfaceLanguage in", values, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageNotIn(List<String> values) {
            addCriterion("interfaceLanguage not in", values, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageBetween(String value1, String value2) {
            addCriterion("interfaceLanguage between", value1, value2, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andInterfacelanguageNotBetween(String value1, String value2) {
            addCriterion("interfaceLanguage not between", value1, value2, "interfacelanguage");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeIsNull() {
            addCriterion("softwareSize is null");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeIsNotNull() {
            addCriterion("softwareSize is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeEqualTo(BigDecimal value) {
            addCriterion("softwareSize =", value, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeNotEqualTo(BigDecimal value) {
            addCriterion("softwareSize <>", value, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeGreaterThan(BigDecimal value) {
            addCriterion("softwareSize >", value, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("softwareSize >=", value, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeLessThan(BigDecimal value) {
            addCriterion("softwareSize <", value, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("softwareSize <=", value, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeIn(List<BigDecimal> values) {
            addCriterion("softwareSize in", values, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeNotIn(List<BigDecimal> values) {
            addCriterion("softwareSize not in", values, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("softwareSize between", value1, value2, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andSoftwaresizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("softwareSize not between", value1, value2, "softwaresize");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateDate not between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andDevidIsNull() {
            addCriterion("devId is null");
            return (Criteria) this;
        }

        public Criteria andDevidIsNotNull() {
            addCriterion("devId is not null");
            return (Criteria) this;
        }

        public Criteria andDevidEqualTo(Long value) {
            addCriterion("devId =", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotEqualTo(Long value) {
            addCriterion("devId <>", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidGreaterThan(Long value) {
            addCriterion("devId >", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidGreaterThanOrEqualTo(Long value) {
            addCriterion("devId >=", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLessThan(Long value) {
            addCriterion("devId <", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidLessThanOrEqualTo(Long value) {
            addCriterion("devId <=", value, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidIn(List<Long> values) {
            addCriterion("devId in", values, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotIn(List<Long> values) {
            addCriterion("devId not in", values, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidBetween(Long value1, Long value2) {
            addCriterion("devId between", value1, value2, "devid");
            return (Criteria) this;
        }

        public Criteria andDevidNotBetween(Long value1, Long value2) {
            addCriterion("devId not between", value1, value2, "devid");
            return (Criteria) this;
        }

        public Criteria andAppinfoIsNull() {
            addCriterion("appInfo is null");
            return (Criteria) this;
        }

        public Criteria andAppinfoIsNotNull() {
            addCriterion("appInfo is not null");
            return (Criteria) this;
        }

        public Criteria andAppinfoEqualTo(String value) {
            addCriterion("appInfo =", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoNotEqualTo(String value) {
            addCriterion("appInfo <>", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoGreaterThan(String value) {
            addCriterion("appInfo >", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoGreaterThanOrEqualTo(String value) {
            addCriterion("appInfo >=", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoLessThan(String value) {
            addCriterion("appInfo <", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoLessThanOrEqualTo(String value) {
            addCriterion("appInfo <=", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoLike(String value) {
            addCriterion("appInfo like", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoNotLike(String value) {
            addCriterion("appInfo not like", value, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoIn(List<String> values) {
            addCriterion("appInfo in", values, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoNotIn(List<String> values) {
            addCriterion("appInfo not in", values, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoBetween(String value1, String value2) {
            addCriterion("appInfo between", value1, value2, "appinfo");
            return (Criteria) this;
        }

        public Criteria andAppinfoNotBetween(String value1, String value2) {
            addCriterion("appInfo not between", value1, value2, "appinfo");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Long value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Long value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Long value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Long value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Long value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Long value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Long> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Long> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Long value1, Long value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Long value1, Long value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOnsaledateIsNull() {
            addCriterion("onSaleDate is null");
            return (Criteria) this;
        }

        public Criteria andOnsaledateIsNotNull() {
            addCriterion("onSaleDate is not null");
            return (Criteria) this;
        }

        public Criteria andOnsaledateEqualTo(Date value) {
            addCriterion("onSaleDate =", value, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateNotEqualTo(Date value) {
            addCriterion("onSaleDate <>", value, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateGreaterThan(Date value) {
            addCriterion("onSaleDate >", value, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateGreaterThanOrEqualTo(Date value) {
            addCriterion("onSaleDate >=", value, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateLessThan(Date value) {
            addCriterion("onSaleDate <", value, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateLessThanOrEqualTo(Date value) {
            addCriterion("onSaleDate <=", value, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateIn(List<Date> values) {
            addCriterion("onSaleDate in", values, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateNotIn(List<Date> values) {
            addCriterion("onSaleDate not in", values, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateBetween(Date value1, Date value2) {
            addCriterion("onSaleDate between", value1, value2, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOnsaledateNotBetween(Date value1, Date value2) {
            addCriterion("onSaleDate not between", value1, value2, "onsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateIsNull() {
            addCriterion("offSaleDate is null");
            return (Criteria) this;
        }

        public Criteria andOffsaledateIsNotNull() {
            addCriterion("offSaleDate is not null");
            return (Criteria) this;
        }

        public Criteria andOffsaledateEqualTo(Date value) {
            addCriterion("offSaleDate =", value, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateNotEqualTo(Date value) {
            addCriterion("offSaleDate <>", value, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateGreaterThan(Date value) {
            addCriterion("offSaleDate >", value, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateGreaterThanOrEqualTo(Date value) {
            addCriterion("offSaleDate >=", value, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateLessThan(Date value) {
            addCriterion("offSaleDate <", value, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateLessThanOrEqualTo(Date value) {
            addCriterion("offSaleDate <=", value, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateIn(List<Date> values) {
            addCriterion("offSaleDate in", values, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateNotIn(List<Date> values) {
            addCriterion("offSaleDate not in", values, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateBetween(Date value1, Date value2) {
            addCriterion("offSaleDate between", value1, value2, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andOffsaledateNotBetween(Date value1, Date value2) {
            addCriterion("offSaleDate not between", value1, value2, "offsaledate");
            return (Criteria) this;
        }

        public Criteria andFlatformidIsNull() {
            addCriterion("flatformId is null");
            return (Criteria) this;
        }

        public Criteria andFlatformidIsNotNull() {
            addCriterion("flatformId is not null");
            return (Criteria) this;
        }

        public Criteria andFlatformidEqualTo(Long value) {
            addCriterion("flatformId =", value, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidNotEqualTo(Long value) {
            addCriterion("flatformId <>", value, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidGreaterThan(Long value) {
            addCriterion("flatformId >", value, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidGreaterThanOrEqualTo(Long value) {
            addCriterion("flatformId >=", value, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidLessThan(Long value) {
            addCriterion("flatformId <", value, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidLessThanOrEqualTo(Long value) {
            addCriterion("flatformId <=", value, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidIn(List<Long> values) {
            addCriterion("flatformId in", values, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidNotIn(List<Long> values) {
            addCriterion("flatformId not in", values, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidBetween(Long value1, Long value2) {
            addCriterion("flatformId between", value1, value2, "flatformid");
            return (Criteria) this;
        }

        public Criteria andFlatformidNotBetween(Long value1, Long value2) {
            addCriterion("flatformId not between", value1, value2, "flatformid");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3IsNull() {
            addCriterion("categoryLevel3 is null");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3IsNotNull() {
            addCriterion("categoryLevel3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3EqualTo(Long value) {
            addCriterion("categoryLevel3 =", value, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3NotEqualTo(Long value) {
            addCriterion("categoryLevel3 <>", value, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3GreaterThan(Long value) {
            addCriterion("categoryLevel3 >", value, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3GreaterThanOrEqualTo(Long value) {
            addCriterion("categoryLevel3 >=", value, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3LessThan(Long value) {
            addCriterion("categoryLevel3 <", value, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3LessThanOrEqualTo(Long value) {
            addCriterion("categoryLevel3 <=", value, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3In(List<Long> values) {
            addCriterion("categoryLevel3 in", values, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3NotIn(List<Long> values) {
            addCriterion("categoryLevel3 not in", values, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3Between(Long value1, Long value2) {
            addCriterion("categoryLevel3 between", value1, value2, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andCategorylevel3NotBetween(Long value1, Long value2) {
            addCriterion("categoryLevel3 not between", value1, value2, "categorylevel3");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNull() {
            addCriterion("downloads is null");
            return (Criteria) this;
        }

        public Criteria andDownloadsIsNotNull() {
            addCriterion("downloads is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadsEqualTo(Long value) {
            addCriterion("downloads =", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotEqualTo(Long value) {
            addCriterion("downloads <>", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThan(Long value) {
            addCriterion("downloads >", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsGreaterThanOrEqualTo(Long value) {
            addCriterion("downloads >=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThan(Long value) {
            addCriterion("downloads <", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsLessThanOrEqualTo(Long value) {
            addCriterion("downloads <=", value, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsIn(List<Long> values) {
            addCriterion("downloads in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotIn(List<Long> values) {
            addCriterion("downloads not in", values, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsBetween(Long value1, Long value2) {
            addCriterion("downloads between", value1, value2, "downloads");
            return (Criteria) this;
        }

        public Criteria andDownloadsNotBetween(Long value1, Long value2) {
            addCriterion("downloads not between", value1, value2, "downloads");
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

        public Criteria andCategorylevel1IsNull() {
            addCriterion("categoryLevel1 is null");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1IsNotNull() {
            addCriterion("categoryLevel1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1EqualTo(Long value) {
            addCriterion("categoryLevel1 =", value, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1NotEqualTo(Long value) {
            addCriterion("categoryLevel1 <>", value, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1GreaterThan(Long value) {
            addCriterion("categoryLevel1 >", value, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1GreaterThanOrEqualTo(Long value) {
            addCriterion("categoryLevel1 >=", value, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1LessThan(Long value) {
            addCriterion("categoryLevel1 <", value, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1LessThanOrEqualTo(Long value) {
            addCriterion("categoryLevel1 <=", value, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1In(List<Long> values) {
            addCriterion("categoryLevel1 in", values, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1NotIn(List<Long> values) {
            addCriterion("categoryLevel1 not in", values, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1Between(Long value1, Long value2) {
            addCriterion("categoryLevel1 between", value1, value2, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel1NotBetween(Long value1, Long value2) {
            addCriterion("categoryLevel1 not between", value1, value2, "categorylevel1");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2IsNull() {
            addCriterion("categoryLevel2 is null");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2IsNotNull() {
            addCriterion("categoryLevel2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2EqualTo(Long value) {
            addCriterion("categoryLevel2 =", value, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2NotEqualTo(Long value) {
            addCriterion("categoryLevel2 <>", value, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2GreaterThan(Long value) {
            addCriterion("categoryLevel2 >", value, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2GreaterThanOrEqualTo(Long value) {
            addCriterion("categoryLevel2 >=", value, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2LessThan(Long value) {
            addCriterion("categoryLevel2 <", value, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2LessThanOrEqualTo(Long value) {
            addCriterion("categoryLevel2 <=", value, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2In(List<Long> values) {
            addCriterion("categoryLevel2 in", values, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2NotIn(List<Long> values) {
            addCriterion("categoryLevel2 not in", values, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2Between(Long value1, Long value2) {
            addCriterion("categoryLevel2 between", value1, value2, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andCategorylevel2NotBetween(Long value1, Long value2) {
            addCriterion("categoryLevel2 not between", value1, value2, "categorylevel2");
            return (Criteria) this;
        }

        public Criteria andLogopicpathIsNull() {
            addCriterion("logoPicPath is null");
            return (Criteria) this;
        }

        public Criteria andLogopicpathIsNotNull() {
            addCriterion("logoPicPath is not null");
            return (Criteria) this;
        }

        public Criteria andLogopicpathEqualTo(String value) {
            addCriterion("logoPicPath =", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathNotEqualTo(String value) {
            addCriterion("logoPicPath <>", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathGreaterThan(String value) {
            addCriterion("logoPicPath >", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathGreaterThanOrEqualTo(String value) {
            addCriterion("logoPicPath >=", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathLessThan(String value) {
            addCriterion("logoPicPath <", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathLessThanOrEqualTo(String value) {
            addCriterion("logoPicPath <=", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathLike(String value) {
            addCriterion("logoPicPath like", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathNotLike(String value) {
            addCriterion("logoPicPath not like", value, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathIn(List<String> values) {
            addCriterion("logoPicPath in", values, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathNotIn(List<String> values) {
            addCriterion("logoPicPath not in", values, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathBetween(String value1, String value2) {
            addCriterion("logoPicPath between", value1, value2, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogopicpathNotBetween(String value1, String value2) {
            addCriterion("logoPicPath not between", value1, value2, "logopicpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathIsNull() {
            addCriterion("logoLocPath is null");
            return (Criteria) this;
        }

        public Criteria andLogolocpathIsNotNull() {
            addCriterion("logoLocPath is not null");
            return (Criteria) this;
        }

        public Criteria andLogolocpathEqualTo(String value) {
            addCriterion("logoLocPath =", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathNotEqualTo(String value) {
            addCriterion("logoLocPath <>", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathGreaterThan(String value) {
            addCriterion("logoLocPath >", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathGreaterThanOrEqualTo(String value) {
            addCriterion("logoLocPath >=", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathLessThan(String value) {
            addCriterion("logoLocPath <", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathLessThanOrEqualTo(String value) {
            addCriterion("logoLocPath <=", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathLike(String value) {
            addCriterion("logoLocPath like", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathNotLike(String value) {
            addCriterion("logoLocPath not like", value, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathIn(List<String> values) {
            addCriterion("logoLocPath in", values, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathNotIn(List<String> values) {
            addCriterion("logoLocPath not in", values, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathBetween(String value1, String value2) {
            addCriterion("logoLocPath between", value1, value2, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andLogolocpathNotBetween(String value1, String value2) {
            addCriterion("logoLocPath not between", value1, value2, "logolocpath");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNull() {
            addCriterion("versionId is null");
            return (Criteria) this;
        }

        public Criteria andVersionidIsNotNull() {
            addCriterion("versionId is not null");
            return (Criteria) this;
        }

        public Criteria andVersionidEqualTo(Long value) {
            addCriterion("versionId =", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotEqualTo(Long value) {
            addCriterion("versionId <>", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThan(Long value) {
            addCriterion("versionId >", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidGreaterThanOrEqualTo(Long value) {
            addCriterion("versionId >=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThan(Long value) {
            addCriterion("versionId <", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidLessThanOrEqualTo(Long value) {
            addCriterion("versionId <=", value, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidIn(List<Long> values) {
            addCriterion("versionId in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotIn(List<Long> values) {
            addCriterion("versionId not in", values, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidBetween(Long value1, Long value2) {
            addCriterion("versionId between", value1, value2, "versionid");
            return (Criteria) this;
        }

        public Criteria andVersionidNotBetween(Long value1, Long value2) {
            addCriterion("versionId not between", value1, value2, "versionid");
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