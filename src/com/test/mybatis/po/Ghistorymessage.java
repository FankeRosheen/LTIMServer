package com.test.mybatis.po;

import java.util.Date;

public class Ghistorymessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ghistorymessage.id
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ghistorymessage.usergroupid
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    private Integer usergroupid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ghistorymessage.stime
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    private Date stime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ghistorymessage.message
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    private String message;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ghistorymessage.id
     *
     * @return the value of ghistorymessage.id
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ghistorymessage.id
     *
     * @param id the value for ghistorymessage.id
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ghistorymessage.usergroupid
     *
     * @return the value of ghistorymessage.usergroupid
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public Integer getUsergroupid() {
        return usergroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ghistorymessage.usergroupid
     *
     * @param usergroupid the value for ghistorymessage.usergroupid
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public void setUsergroupid(Integer usergroupid) {
        this.usergroupid = usergroupid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ghistorymessage.stime
     *
     * @return the value of ghistorymessage.stime
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public Date getStime() {
        return stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ghistorymessage.stime
     *
     * @param stime the value for ghistorymessage.stime
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public void setStime(Date stime) {
        this.stime = stime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ghistorymessage.message
     *
     * @return the value of ghistorymessage.message
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ghistorymessage.message
     *
     * @param message the value for ghistorymessage.message
     *
     * @mbg.generated Fri Dec 22 14:28:06 CST 2017
     */
    public void setMessage(String message) {
        this.message = message;
    }
}