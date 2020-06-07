package com.bizwink.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

public class Organization implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.ID
     *
     * @mbggenerated
     */
    private BigDecimal ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.PARENT
     *
     * @mbggenerated
     */
    private BigDecimal PARENT;

    private BigDecimal CUSTOMERID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.COTYPE
     *
     * @mbggenerated
     */
    private BigDecimal COTYPE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.NODEID
     *
     * @mbggenerated
     */
    private BigDecimal NODEID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.STATUS
     *
     * @mbggenerated
     */
    private BigDecimal STATUS;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.NAME
     *
     * @mbggenerated
     */
    private String NAME;

    private String ENAME;

    private BigDecimal ORDERID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.LLEVEL
     *
     * @mbggenerated
     */
    private BigDecimal LLEVEL;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.ORGCODE
     *
     * @mbggenerated
     */
    private String ORGCODE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.ISLEAF
     *
     * @mbggenerated
     */
    private Short ISLEAF;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.LASTUPDATE
     *
     * @mbggenerated
     */
    private Timestamp LASTUPDATE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.CREATEDATE
     *
     * @mbggenerated
     */
    private Timestamp CREATEDATE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_ORGANIZATION.CREATEUSER
     *
     * @mbggenerated
     */
    private String CREATEUSER;

    private String UPDATEUSER;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.ID
     *
     * @return the value of TBL_ORGANIZATION.ID
     *
     * @mbggenerated
     */
    public BigDecimal getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.ID
     *
     * @param ID the value for TBL_ORGANIZATION.ID
     *
     * @mbggenerated
     */
    public void setID(BigDecimal ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.PARENT
     *
     * @return the value of TBL_ORGANIZATION.PARENT
     *
     * @mbggenerated
     */
    public BigDecimal getPARENT() {
        return PARENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.PARENT
     *
     * @param PARENT the value for TBL_ORGANIZATION.PARENT
     *
     * @mbggenerated
     */
    public void setPARENT(BigDecimal PARENT) {
        this.PARENT = PARENT;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.COTYPE
     *
     * @return the value of TBL_ORGANIZATION.COTYPE
     *
     * @mbggenerated
     */
    public BigDecimal getCOTYPE() {
        return COTYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.COTYPE
     *
     * @param COTYPE the value for TBL_ORGANIZATION.COTYPE
     *
     * @mbggenerated
     */
    public void setCOTYPE(BigDecimal COTYPE) {
        this.COTYPE = COTYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.NODEID
     *
     * @return the value of TBL_ORGANIZATION.NODEID
     *
     * @mbggenerated
     */
    public BigDecimal getNODEID() {
        return NODEID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.NODEID
     *
     * @param NODEID the value for TBL_ORGANIZATION.NODEID
     *
     * @mbggenerated
     */
    public void setNODEID(BigDecimal NODEID) {
        this.NODEID = NODEID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.STATUS
     *
     * @return the value of TBL_ORGANIZATION.STATUS
     *
     * @mbggenerated
     */
    public BigDecimal getSTATUS() {
        return STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.STATUS
     *
     * @param STATUS the value for TBL_ORGANIZATION.STATUS
     *
     * @mbggenerated
     */
    public void setSTATUS(BigDecimal STATUS) {
        this.STATUS = STATUS;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.NAME
     *
     * @return the value of TBL_ORGANIZATION.NAME
     *
     * @mbggenerated
     */
    public String getNAME() {
        return NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.NAME
     *
     * @param NAME the value for TBL_ORGANIZATION.NAME
     *
     * @mbggenerated
     */
    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public BigDecimal getORDERID() {
        return ORDERID;
    }

    public void setORDERID(BigDecimal ORDERID) {
        this.ORDERID = ORDERID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.LLEVEL
     *
     * @return the value of TBL_ORGANIZATION.LLEVEL
     *
     * @mbggenerated
     */
    public BigDecimal getLLEVEL() {
        return LLEVEL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.LLEVEL
     *
     * @param LLEVEL the value for TBL_ORGANIZATION.LLEVEL
     *
     * @mbggenerated
     */
    public void setLLEVEL(BigDecimal LLEVEL) {
        this.LLEVEL = LLEVEL;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.ORGCODE
     *
     * @return the value of TBL_ORGANIZATION.ORGCODE
     *
     * @mbggenerated
     */
    public String getORGCODE() {
        return ORGCODE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.ORGCODE
     *
     * @param ORGCODE the value for TBL_ORGANIZATION.ORGCODE
     *
     * @mbggenerated
     */
    public void setORGCODE(String ORGCODE) {
        this.ORGCODE = ORGCODE == null ? null : ORGCODE.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.ISLEAF
     *
     * @return the value of TBL_ORGANIZATION.ISLEAF
     *
     * @mbggenerated
     */
    public Short getISLEAF() {
        return ISLEAF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.ISLEAF
     *
     * @param ISLEAF the value for TBL_ORGANIZATION.ISLEAF
     *
     * @mbggenerated
     */
    public void setISLEAF(Short ISLEAF) {
        this.ISLEAF = ISLEAF;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.LASTUPDATE
     *
     * @return the value of TBL_ORGANIZATION.LASTUPDATE
     *
     * @mbggenerated
     */
    public Date getLASTUPDATE() {
        return LASTUPDATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.LASTUPDATE
     *
     * @param LASTUPDATE the value for TBL_ORGANIZATION.LASTUPDATE
     *
     * @mbggenerated
     */
    public void setLASTUPDATE(Timestamp LASTUPDATE) {
        this.LASTUPDATE = LASTUPDATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.CREATEDATE
     *
     * @return the value of TBL_ORGANIZATION.CREATEDATE
     *
     * @mbggenerated
     */
    public Timestamp getCREATEDATE() {
        return CREATEDATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.CREATEDATE
     *
     * @param CREATEDATE the value for TBL_ORGANIZATION.CREATEDATE
     *
     * @mbggenerated
     */
    public void setCREATEDATE(Timestamp CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_ORGANIZATION.CREATEUSER
     *
     * @return the value of TBL_ORGANIZATION.CREATEUSER
     *
     * @mbggenerated
     */
    public String getCREATEUSER() {
        return CREATEUSER;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_ORGANIZATION.CREATEUSER
     *
     * @param CREATEUSER the value for TBL_ORGANIZATION.CREATEUSER
     *
     * @mbggenerated
     */
    public void setCREATEUSER(String CREATEUSER) {
        this.CREATEUSER = CREATEUSER == null ? null : CREATEUSER.trim();
    }

    public BigDecimal getCUSTOMERID() {
        return CUSTOMERID;
    }

    public void setCUSTOMERID(BigDecimal CUSTOMERID) {
        this.CUSTOMERID = CUSTOMERID;
    }

    public String getUPDATEUSER() {
        return UPDATEUSER;
    }

    public void setUPDATEUSER(String UPDATEUSER) {
        this.UPDATEUSER = UPDATEUSER;
    }
}