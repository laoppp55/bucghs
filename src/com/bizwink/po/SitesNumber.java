package com.bizwink.po;

import java.io.Serializable;
import java.math.BigDecimal;

public class SitesNumber implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SITES_NUMBER.IPADDRESS
     *
     * @mbggenerated
     */
    private String IPADDRESS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SITES_NUMBER.SITESNUM
     *
     * @mbggenerated
     */
    private BigDecimal SITESNUM;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_SITES_NUMBER.HASHCODE
     *
     * @mbggenerated
     */
    private BigDecimal HASHCODE;
    private String WWWIP;
    private String DOCROOT;
    private String FTPUSER;
    private String FTPPASSWD;
    private BigDecimal FLAG;
    private String PRIVATEIP;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SITES_NUMBER.IPADDRESS
     *
     * @return the value of TBL_SITES_NUMBER.IPADDRESS
     *
     * @mbggenerated
     */
    public String getIPADDRESS() {
        return IPADDRESS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SITES_NUMBER.IPADDRESS
     *
     * @param IPADDRESS the value for TBL_SITES_NUMBER.IPADDRESS
     *
     * @mbggenerated
     */
    public void setIPADDRESS(String IPADDRESS) {
        this.IPADDRESS = IPADDRESS == null ? null : IPADDRESS.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SITES_NUMBER.SITESNUM
     *
     * @return the value of TBL_SITES_NUMBER.SITESNUM
     *
     * @mbggenerated
     */
    public BigDecimal getSITESNUM() {
        return SITESNUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SITES_NUMBER.SITESNUM
     *
     * @param SITESNUM the value for TBL_SITES_NUMBER.SITESNUM
     *
     * @mbggenerated
     */
    public void setSITESNUM(BigDecimal SITESNUM) {
        this.SITESNUM = SITESNUM;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_SITES_NUMBER.HASHCODE
     *
     * @return the value of TBL_SITES_NUMBER.HASHCODE
     *
     * @mbggenerated
     */
    public BigDecimal getHASHCODE() {
        return HASHCODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_SITES_NUMBER.HASHCODE
     *
     * @param HASHCODE the value for TBL_SITES_NUMBER.HASHCODE
     *
     * @mbggenerated
     */
    public void setHASHCODE(BigDecimal HASHCODE) {
        this.HASHCODE = HASHCODE;
    }

    public String getWWWIP() {
        return WWWIP;
    }

    public void setWWWIP(String WWWIP) {
        this.WWWIP = WWWIP;
    }

    public String getDOCROOT() {
        return DOCROOT;
    }

    public void setDOCROOT(String DOCROOT) {
        this.DOCROOT = DOCROOT;
    }

    public String getFTPUSER() {
        return FTPUSER;
    }

    public void setFTPUSER(String FTPUSER) {
        this.FTPUSER = FTPUSER;
    }

    public String getFTPPASSWD() {
        return FTPPASSWD;
    }

    public void setFTPPASSWD(String FTPPASSWD) {
        this.FTPPASSWD = FTPPASSWD;
    }

    public BigDecimal getFLAG() {
        return FLAG;
    }

    public void setFLAG(BigDecimal FLAG) {
        this.FLAG = FLAG;
    }

    public String getPRIVATEIP() {
        return PRIVATEIP;
    }

    public void setPRIVATEIP(String PRIVATEIP) {
        this.PRIVATEIP = PRIVATEIP;
    }
}