package com.bizwink.po;

public class NameValueCodeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_namevaluecode.classcode
     *
     * @mbggenerated
     */
    private Short classcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_namevaluecode.basiccode
     *
     * @mbggenerated
     */
    private String basiccode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_namevaluecode.classcode
     *
     * @return the value of tbl_namevaluecode.classcode
     *
     * @mbggenerated
     */
    public Short getClasscode() {
        return classcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_namevaluecode.classcode
     *
     * @param classcode the value for tbl_namevaluecode.classcode
     *
     * @mbggenerated
     */
    public void setClasscode(Short classcode) {
        this.classcode = classcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_namevaluecode.basiccode
     *
     * @return the value of tbl_namevaluecode.basiccode
     *
     * @mbggenerated
     */
    public String getBasiccode() {
        return basiccode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_namevaluecode.basiccode
     *
     * @param basiccode the value for tbl_namevaluecode.basiccode
     *
     * @mbggenerated
     */
    public void setBasiccode(String basiccode) {
        this.basiccode = basiccode == null ? null : basiccode.trim();
    }
}