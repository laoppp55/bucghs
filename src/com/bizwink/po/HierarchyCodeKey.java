package com.bizwink.po;

public class HierarchyCodeKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_hierarchycode.classcode
     *
     * @mbggenerated
     */
    private Short classcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_hierarchycode.basiccode
     *
     * @mbggenerated
     */
    private String basiccode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_hierarchycode.classcode
     *
     * @return the value of tbl_hierarchycode.classcode
     *
     * @mbggenerated
     */
    public Short getClasscode() {
        return classcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_hierarchycode.classcode
     *
     * @param classcode the value for tbl_hierarchycode.classcode
     *
     * @mbggenerated
     */
    public void setClasscode(Short classcode) {
        this.classcode = classcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_hierarchycode.basiccode
     *
     * @return the value of tbl_hierarchycode.basiccode
     *
     * @mbggenerated
     */
    public String getBasiccode() {
        return basiccode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_hierarchycode.basiccode
     *
     * @param basiccode the value for tbl_hierarchycode.basiccode
     *
     * @mbggenerated
     */
    public void setBasiccode(String basiccode) {
        this.basiccode = basiccode == null ? null : basiccode.trim();
    }
}