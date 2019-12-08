package com.ssm.zi.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppVersionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppVersionExample() {
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

        public Criteria andVersionnoIsNull() {
            addCriterion("versionNo is null");
            return (Criteria) this;
        }

        public Criteria andVersionnoIsNotNull() {
            addCriterion("versionNo is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnoEqualTo(String value) {
            addCriterion("versionNo =", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotEqualTo(String value) {
            addCriterion("versionNo <>", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThan(String value) {
            addCriterion("versionNo >", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoGreaterThanOrEqualTo(String value) {
            addCriterion("versionNo >=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThan(String value) {
            addCriterion("versionNo <", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLessThanOrEqualTo(String value) {
            addCriterion("versionNo <=", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoLike(String value) {
            addCriterion("versionNo like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotLike(String value) {
            addCriterion("versionNo not like", value, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoIn(List<String> values) {
            addCriterion("versionNo in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotIn(List<String> values) {
            addCriterion("versionNo not in", values, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoBetween(String value1, String value2) {
            addCriterion("versionNo between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersionnoNotBetween(String value1, String value2) {
            addCriterion("versionNo not between", value1, value2, "versionno");
            return (Criteria) this;
        }

        public Criteria andVersioninfoIsNull() {
            addCriterion("versionInfo is null");
            return (Criteria) this;
        }

        public Criteria andVersioninfoIsNotNull() {
            addCriterion("versionInfo is not null");
            return (Criteria) this;
        }

        public Criteria andVersioninfoEqualTo(String value) {
            addCriterion("versionInfo =", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotEqualTo(String value) {
            addCriterion("versionInfo <>", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoGreaterThan(String value) {
            addCriterion("versionInfo >", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoGreaterThanOrEqualTo(String value) {
            addCriterion("versionInfo >=", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoLessThan(String value) {
            addCriterion("versionInfo <", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoLessThanOrEqualTo(String value) {
            addCriterion("versionInfo <=", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoLike(String value) {
            addCriterion("versionInfo like", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotLike(String value) {
            addCriterion("versionInfo not like", value, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoIn(List<String> values) {
            addCriterion("versionInfo in", values, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotIn(List<String> values) {
            addCriterion("versionInfo not in", values, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoBetween(String value1, String value2) {
            addCriterion("versionInfo between", value1, value2, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andVersioninfoNotBetween(String value1, String value2) {
            addCriterion("versionInfo not between", value1, value2, "versioninfo");
            return (Criteria) this;
        }

        public Criteria andPublishstatusIsNull() {
            addCriterion("publishStatus is null");
            return (Criteria) this;
        }

        public Criteria andPublishstatusIsNotNull() {
            addCriterion("publishStatus is not null");
            return (Criteria) this;
        }

        public Criteria andPublishstatusEqualTo(Long value) {
            addCriterion("publishStatus =", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusNotEqualTo(Long value) {
            addCriterion("publishStatus <>", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusGreaterThan(Long value) {
            addCriterion("publishStatus >", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusGreaterThanOrEqualTo(Long value) {
            addCriterion("publishStatus >=", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusLessThan(Long value) {
            addCriterion("publishStatus <", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusLessThanOrEqualTo(Long value) {
            addCriterion("publishStatus <=", value, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusIn(List<Long> values) {
            addCriterion("publishStatus in", values, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusNotIn(List<Long> values) {
            addCriterion("publishStatus not in", values, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusBetween(Long value1, Long value2) {
            addCriterion("publishStatus between", value1, value2, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andPublishstatusNotBetween(Long value1, Long value2) {
            addCriterion("publishStatus not between", value1, value2, "publishstatus");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIsNull() {
            addCriterion("downloadLink is null");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIsNotNull() {
            addCriterion("downloadLink is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkEqualTo(String value) {
            addCriterion("downloadLink =", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotEqualTo(String value) {
            addCriterion("downloadLink <>", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkGreaterThan(String value) {
            addCriterion("downloadLink >", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkGreaterThanOrEqualTo(String value) {
            addCriterion("downloadLink >=", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLessThan(String value) {
            addCriterion("downloadLink <", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLessThanOrEqualTo(String value) {
            addCriterion("downloadLink <=", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkLike(String value) {
            addCriterion("downloadLink like", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotLike(String value) {
            addCriterion("downloadLink not like", value, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkIn(List<String> values) {
            addCriterion("downloadLink in", values, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotIn(List<String> values) {
            addCriterion("downloadLink not in", values, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkBetween(String value1, String value2) {
            addCriterion("downloadLink between", value1, value2, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andDownloadlinkNotBetween(String value1, String value2) {
            addCriterion("downloadLink not between", value1, value2, "downloadlink");
            return (Criteria) this;
        }

        public Criteria andVersionsizeIsNull() {
            addCriterion("versionSize is null");
            return (Criteria) this;
        }

        public Criteria andVersionsizeIsNotNull() {
            addCriterion("versionSize is not null");
            return (Criteria) this;
        }

        public Criteria andVersionsizeEqualTo(BigDecimal value) {
            addCriterion("versionSize =", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeNotEqualTo(BigDecimal value) {
            addCriterion("versionSize <>", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeGreaterThan(BigDecimal value) {
            addCriterion("versionSize >", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("versionSize >=", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeLessThan(BigDecimal value) {
            addCriterion("versionSize <", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("versionSize <=", value, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeIn(List<BigDecimal> values) {
            addCriterion("versionSize in", values, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeNotIn(List<BigDecimal> values) {
            addCriterion("versionSize not in", values, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("versionSize between", value1, value2, "versionsize");
            return (Criteria) this;
        }

        public Criteria andVersionsizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("versionSize not between", value1, value2, "versionsize");
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

        public Criteria andApklocpathIsNull() {
            addCriterion("apkLocPath is null");
            return (Criteria) this;
        }

        public Criteria andApklocpathIsNotNull() {
            addCriterion("apkLocPath is not null");
            return (Criteria) this;
        }

        public Criteria andApklocpathEqualTo(String value) {
            addCriterion("apkLocPath =", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotEqualTo(String value) {
            addCriterion("apkLocPath <>", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathGreaterThan(String value) {
            addCriterion("apkLocPath >", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathGreaterThanOrEqualTo(String value) {
            addCriterion("apkLocPath >=", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathLessThan(String value) {
            addCriterion("apkLocPath <", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathLessThanOrEqualTo(String value) {
            addCriterion("apkLocPath <=", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathLike(String value) {
            addCriterion("apkLocPath like", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotLike(String value) {
            addCriterion("apkLocPath not like", value, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathIn(List<String> values) {
            addCriterion("apkLocPath in", values, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotIn(List<String> values) {
            addCriterion("apkLocPath not in", values, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathBetween(String value1, String value2) {
            addCriterion("apkLocPath between", value1, value2, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApklocpathNotBetween(String value1, String value2) {
            addCriterion("apkLocPath not between", value1, value2, "apklocpath");
            return (Criteria) this;
        }

        public Criteria andApkfilenameIsNull() {
            addCriterion("apkFileName is null");
            return (Criteria) this;
        }

        public Criteria andApkfilenameIsNotNull() {
            addCriterion("apkFileName is not null");
            return (Criteria) this;
        }

        public Criteria andApkfilenameEqualTo(String value) {
            addCriterion("apkFileName =", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotEqualTo(String value) {
            addCriterion("apkFileName <>", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameGreaterThan(String value) {
            addCriterion("apkFileName >", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("apkFileName >=", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameLessThan(String value) {
            addCriterion("apkFileName <", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameLessThanOrEqualTo(String value) {
            addCriterion("apkFileName <=", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameLike(String value) {
            addCriterion("apkFileName like", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotLike(String value) {
            addCriterion("apkFileName not like", value, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameIn(List<String> values) {
            addCriterion("apkFileName in", values, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotIn(List<String> values) {
            addCriterion("apkFileName not in", values, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameBetween(String value1, String value2) {
            addCriterion("apkFileName between", value1, value2, "apkfilename");
            return (Criteria) this;
        }

        public Criteria andApkfilenameNotBetween(String value1, String value2) {
            addCriterion("apkFileName not between", value1, value2, "apkfilename");
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