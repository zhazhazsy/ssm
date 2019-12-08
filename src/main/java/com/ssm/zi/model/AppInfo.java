package com.ssm.zi.model;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {
    private Long id;

    private String softwarename;

    private String apkname;

    private String supportrom;

    private String interfacelanguage;

    private BigDecimal softwaresize;

    private Date updatedate;

    private Long devid;

    private String appinfo;

    private Long status;

    private String statu;

    private Date onsaledate;

    private Date offsaledate;

    private Long flatformid;

    private String flatformname;

    private Long categorylevel3;

    private String categorylevelname1;
    private String categorylevelname2;
    private String categorylevelname3;

    private Long downloads;

    private Long createdby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

    private Long categorylevel1;

    private Long categorylevel2;

    private String logopicpath;

    private String logolocpath;

    private Long versionid;

    private String versionname;

    public String getCategorylevelname1() {
        return categorylevelname1;
    }

    public void setCategorylevelname1(String categorylevelname1) {
        this.categorylevelname1 = categorylevelname1;
    }

    public String getCategorylevelname2() {
        return categorylevelname2;
    }

    public void setCategorylevelname2(String categorylevelname2) {
        this.categorylevelname2 = categorylevelname2;
    }

    public String getCategorylevelname3() {
        return categorylevelname3;
    }

    public void setCategorylevelname3(String categorylevelname3) {
        this.categorylevelname3 = categorylevelname3;
    }

    public String getStatu() {
        return statu;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public String getFlatformname() {
        return flatformname;
    }

    public void setFlatformname(String flatformname) {
        this.flatformname = flatformname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSoftwarename() {
        return softwarename;
    }

    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename == null ? null : softwarename.trim();
    }

    public String getApkname() {
        return apkname;
    }

    public void setApkname(String apkname) {
        this.apkname = apkname == null ? null : apkname.trim();
    }

    public String getSupportrom() {
        return supportrom;
    }

    public void setSupportrom(String supportrom) {
        this.supportrom = supportrom == null ? null : supportrom.trim();
    }

    public String getInterfacelanguage() {
        return interfacelanguage;
    }

    public void setInterfacelanguage(String interfacelanguage) {
        this.interfacelanguage = interfacelanguage == null ? null : interfacelanguage.trim();
    }

    public BigDecimal getSoftwaresize() {
        return softwaresize;
    }

    public void setSoftwaresize(BigDecimal softwaresize) {
        this.softwaresize = softwaresize;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    public Long getDevid() {
        return devid;
    }

    public void setDevid(Long devid) {
        this.devid = devid;
    }

    public String getAppinfo() {
        return appinfo;
    }

    public void setAppinfo(String appinfo) {
        this.appinfo = appinfo == null ? null : appinfo.trim();
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Date getOnsaledate() {
        return onsaledate;
    }

    public void setOnsaledate(Date onsaledate) {
        this.onsaledate = onsaledate;
    }

    public Date getOffsaledate() {
        return offsaledate;
    }

    public void setOffsaledate(Date offsaledate) {
        this.offsaledate = offsaledate;
    }

    public Long getFlatformid() {
        return flatformid;
    }

    public void setFlatformid(Long flatformid) {
        this.flatformid = flatformid;
    }

    public Long getCategorylevel3() {
        return categorylevel3;
    }

    public void setCategorylevel3(Long categorylevel3) {
        this.categorylevel3 = categorylevel3;
    }

    public Long getDownloads() {
        return downloads;
    }

    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    public Long getCreatedby() {
        return createdby;
    }

    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public Long getCategorylevel1() {
        return categorylevel1;
    }

    public void setCategorylevel1(Long categorylevel1) {
        this.categorylevel1 = categorylevel1;
    }

    public Long getCategorylevel2() {
        return categorylevel2;
    }

    public void setCategorylevel2(Long categorylevel2) {
        this.categorylevel2 = categorylevel2;
    }

    public String getLogopicpath() {
        return logopicpath;
    }

    public void setLogopicpath(String logopicpath) {
        this.logopicpath = logopicpath == null ? null : logopicpath.trim();
    }

    public String getLogolocpath() {
        return logolocpath;
    }

    public void setLogolocpath(String logolocpath) {
        this.logolocpath = logolocpath == null ? null : logolocpath.trim();
    }

    public Long getVersionid() {
        return versionid;
    }

    public void setVersionid(Long versionid) {
        this.versionid = versionid;
    }

    @Override
    public String toString() {
        return "AppInfo{" +
                "id=" + id +
                ", softwarename='" + softwarename + '\'' +
                ", apkname='" + apkname + '\'' +
                ", supportrom='" + supportrom + '\'' +
                ", interfacelanguage='" + interfacelanguage + '\'' +
                ", softwaresize=" + softwaresize +
                ", updatedate=" + updatedate +
                ", devid=" + devid +
                ", appinfo='" + appinfo + '\'' +
                ", status=" + status +
                ", onsaledate=" + onsaledate +
                ", offsaledate=" + offsaledate +
                ", flatformid=" + flatformid +
                ", categorylevel3=" + categorylevel3 +
                ", downloads=" + downloads +
                ", createdby=" + createdby +
                ", creationdate=" + creationdate +
                ", modifyby=" + modifyby +
                ", modifydate=" + modifydate +
                ", categorylevel1=" + categorylevel1 +
                ", categorylevel2=" + categorylevel2 +
                ", logopicpath='" + logopicpath + '\'' +
                ", logolocpath='" + logolocpath + '\'' +
                ", versionid=" + versionid +
                '}';
    }
}