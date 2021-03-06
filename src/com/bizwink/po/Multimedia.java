package com.bizwink.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Multimedia implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.ID
     *
     * @mbggenerated
     */
    private BigDecimal ID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.SITEID
     *
     * @mbggenerated
     */
    private BigDecimal SITEID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.ARTICLEID
     *
     * @mbggenerated
     */
    private BigDecimal ARTICLEID;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.DIRNAME
     *
     * @mbggenerated
     */
    private String DIRNAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.FILEPATH
     *
     * @mbggenerated
     */
    private String FILEPATH;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.OLDFILENAME
     *
     * @mbggenerated
     */
    private String OLDFILENAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.NEWFILENAME
     *
     * @mbggenerated
     */
    private String NEWFILENAME;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.ENCODEFLAG
     *
     * @mbggenerated
     */
    private BigDecimal ENCODEFLAG;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.INFOTYPE
     *
     * @mbggenerated
     */
    private BigDecimal INFOTYPE;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TBL_MULTIMEDIA.CREATEDATE
     *
     * @mbggenerated
     */
    private Date CREATEDATE;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.ID
     *
     * @return the value of TBL_MULTIMEDIA.ID
     *
     * @mbggenerated
     */
    public BigDecimal getID() {
        return ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.ID
     *
     * @param ID the value for TBL_MULTIMEDIA.ID
     *
     * @mbggenerated
     */
    public void setID(BigDecimal ID) {
        this.ID = ID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.SITEID
     *
     * @return the value of TBL_MULTIMEDIA.SITEID
     *
     * @mbggenerated
     */
    public BigDecimal getSITEID() {
        return SITEID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.SITEID
     *
     * @param SITEID the value for TBL_MULTIMEDIA.SITEID
     *
     * @mbggenerated
     */
    public void setSITEID(BigDecimal SITEID) {
        this.SITEID = SITEID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.ARTICLEID
     *
     * @return the value of TBL_MULTIMEDIA.ARTICLEID
     *
     * @mbggenerated
     */
    public BigDecimal getARTICLEID() {
        return ARTICLEID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.ARTICLEID
     *
     * @param ARTICLEID the value for TBL_MULTIMEDIA.ARTICLEID
     *
     * @mbggenerated
     */
    public void setARTICLEID(BigDecimal ARTICLEID) {
        this.ARTICLEID = ARTICLEID;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.DIRNAME
     *
     * @return the value of TBL_MULTIMEDIA.DIRNAME
     *
     * @mbggenerated
     */
    public String getDIRNAME() {
        return DIRNAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.DIRNAME
     *
     * @param DIRNAME the value for TBL_MULTIMEDIA.DIRNAME
     *
     * @mbggenerated
     */
    public void setDIRNAME(String DIRNAME) {
        this.DIRNAME = DIRNAME == null ? null : DIRNAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.FILEPATH
     *
     * @return the value of TBL_MULTIMEDIA.FILEPATH
     *
     * @mbggenerated
     */
    public String getFILEPATH() {
        return FILEPATH;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.FILEPATH
     *
     * @param FILEPATH the value for TBL_MULTIMEDIA.FILEPATH
     *
     * @mbggenerated
     */
    public void setFILEPATH(String FILEPATH) {
        this.FILEPATH = FILEPATH == null ? null : FILEPATH.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.OLDFILENAME
     *
     * @return the value of TBL_MULTIMEDIA.OLDFILENAME
     *
     * @mbggenerated
     */
    public String getOLDFILENAME() {
        return OLDFILENAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.OLDFILENAME
     *
     * @param OLDFILENAME the value for TBL_MULTIMEDIA.OLDFILENAME
     *
     * @mbggenerated
     */
    public void setOLDFILENAME(String OLDFILENAME) {
        this.OLDFILENAME = OLDFILENAME == null ? null : OLDFILENAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.NEWFILENAME
     *
     * @return the value of TBL_MULTIMEDIA.NEWFILENAME
     *
     * @mbggenerated
     */
    public String getNEWFILENAME() {
        return NEWFILENAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.NEWFILENAME
     *
     * @param NEWFILENAME the value for TBL_MULTIMEDIA.NEWFILENAME
     *
     * @mbggenerated
     */
    public void setNEWFILENAME(String NEWFILENAME) {
        this.NEWFILENAME = NEWFILENAME == null ? null : NEWFILENAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.ENCODEFLAG
     *
     * @return the value of TBL_MULTIMEDIA.ENCODEFLAG
     *
     * @mbggenerated
     */
    public BigDecimal getENCODEFLAG() {
        return ENCODEFLAG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.ENCODEFLAG
     *
     * @param ENCODEFLAG the value for TBL_MULTIMEDIA.ENCODEFLAG
     *
     * @mbggenerated
     */
    public void setENCODEFLAG(BigDecimal ENCODEFLAG) {
        this.ENCODEFLAG = ENCODEFLAG;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.INFOTYPE
     *
     * @return the value of TBL_MULTIMEDIA.INFOTYPE
     *
     * @mbggenerated
     */
    public BigDecimal getINFOTYPE() {
        return INFOTYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.INFOTYPE
     *
     * @param INFOTYPE the value for TBL_MULTIMEDIA.INFOTYPE
     *
     * @mbggenerated
     */
    public void setINFOTYPE(BigDecimal INFOTYPE) {
        this.INFOTYPE = INFOTYPE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TBL_MULTIMEDIA.CREATEDATE
     *
     * @return the value of TBL_MULTIMEDIA.CREATEDATE
     *
     * @mbggenerated
     */
    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TBL_MULTIMEDIA.CREATEDATE
     *
     * @param CREATEDATE the value for TBL_MULTIMEDIA.CREATEDATE
     *
     * @mbggenerated
     */
    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }
}