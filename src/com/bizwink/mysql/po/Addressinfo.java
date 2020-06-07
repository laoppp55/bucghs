package com.bizwink.mysql.po;

import java.io.Serializable;
import java.util.Date;

public class Addressinfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.userid
     *
     * @mbggenerated
     */
    private Integer userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.provinces
     *
     * @mbggenerated
     */
    private String provinces;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.zone
     *
     * @mbggenerated
     */
    private String zone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.mobile
     *
     * @mbggenerated
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.zip
     *
     * @mbggenerated
     */
    private String zip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tbl_addressinfo.createdate
     *
     * @mbggenerated
     */
    private Date createdate;

    private String email;

    private String notes;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.id
     *
     * @return the value of tbl_addressinfo.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.id
     *
     * @param id the value for tbl_addressinfo.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.userid
     *
     * @return the value of tbl_addressinfo.userid
     *
     * @mbggenerated
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.userid
     *
     * @param userid the value for tbl_addressinfo.userid
     *
     * @mbggenerated
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.name
     *
     * @return the value of tbl_addressinfo.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.name
     *
     * @param name the value for tbl_addressinfo.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.provinces
     *
     * @return the value of tbl_addressinfo.provinces
     *
     * @mbggenerated
     */
    public String getProvinces() {
        return provinces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.provinces
     *
     * @param provinces the value for tbl_addressinfo.provinces
     *
     * @mbggenerated
     */
    public void setProvinces(String provinces) {
        this.provinces = provinces == null ? null : provinces.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.city
     *
     * @return the value of tbl_addressinfo.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.city
     *
     * @param city the value for tbl_addressinfo.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.zone
     *
     * @return the value of tbl_addressinfo.zone
     *
     * @mbggenerated
     */
    public String getZone() {
        return zone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.zone
     *
     * @param zone the value for tbl_addressinfo.zone
     *
     * @mbggenerated
     */
    public void setZone(String zone) {
        this.zone = zone == null ? null : zone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.mobile
     *
     * @return the value of tbl_addressinfo.mobile
     *
     * @mbggenerated
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.mobile
     *
     * @param mobile the value for tbl_addressinfo.mobile
     *
     * @mbggenerated
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.phone
     *
     * @return the value of tbl_addressinfo.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.phone
     *
     * @param phone the value for tbl_addressinfo.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.zip
     *
     * @return the value of tbl_addressinfo.zip
     *
     * @mbggenerated
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.zip
     *
     * @param zip the value for tbl_addressinfo.zip
     *
     * @mbggenerated
     */
    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.address
     *
     * @return the value of tbl_addressinfo.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.address
     *
     * @param address the value for tbl_addressinfo.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tbl_addressinfo.createdate
     *
     * @return the value of tbl_addressinfo.createdate
     *
     * @mbggenerated
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tbl_addressinfo.createdate
     *
     * @param createdate the value for tbl_addressinfo.createdate
     *
     * @mbggenerated
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}