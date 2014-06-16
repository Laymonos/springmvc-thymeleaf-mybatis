package com.mycompany.apps.entities;

import java.util.Date;

public class Permissions {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.permissions.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.permissions.name
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.permissions.rec_insert_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Date recInsertDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.permissions.rec_insert_user
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private String recInsertUser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.permissions.rec_update_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Date recUpdateDatetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.permissions.rec_update_user
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private String recUpdateUser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.permissions.id
     *
     * @return the value of public.permissions.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.permissions.id
     *
     * @param id the value for public.permissions.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.permissions.name
     *
     * @return the value of public.permissions.name
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.permissions.name
     *
     * @param name the value for public.permissions.name
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.permissions.rec_insert_datetime
     *
     * @return the value of public.permissions.rec_insert_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Date getRecInsertDatetime() {
        return recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.permissions.rec_insert_datetime
     *
     * @param recInsertDatetime the value for public.permissions.rec_insert_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setRecInsertDatetime(Date recInsertDatetime) {
        this.recInsertDatetime = recInsertDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.permissions.rec_insert_user
     *
     * @return the value of public.permissions.rec_insert_user
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public String getRecInsertUser() {
        return recInsertUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.permissions.rec_insert_user
     *
     * @param recInsertUser the value for public.permissions.rec_insert_user
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setRecInsertUser(String recInsertUser) {
        this.recInsertUser = recInsertUser == null ? null : recInsertUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.permissions.rec_update_datetime
     *
     * @return the value of public.permissions.rec_update_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Date getRecUpdateDatetime() {
        return recUpdateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.permissions.rec_update_datetime
     *
     * @param recUpdateDatetime the value for public.permissions.rec_update_datetime
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setRecUpdateDatetime(Date recUpdateDatetime) {
        this.recUpdateDatetime = recUpdateDatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.permissions.rec_update_user
     *
     * @return the value of public.permissions.rec_update_user
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public String getRecUpdateUser() {
        return recUpdateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.permissions.rec_update_user
     *
     * @param recUpdateUser the value for public.permissions.rec_update_user
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setRecUpdateUser(String recUpdateUser) {
        this.recUpdateUser = recUpdateUser == null ? null : recUpdateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.permissions
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Permissions other = (Permissions) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getRecInsertDatetime() == null ? other.getRecInsertDatetime() == null : this.getRecInsertDatetime().equals(other.getRecInsertDatetime()))
            && (this.getRecInsertUser() == null ? other.getRecInsertUser() == null : this.getRecInsertUser().equals(other.getRecInsertUser()))
            && (this.getRecUpdateDatetime() == null ? other.getRecUpdateDatetime() == null : this.getRecUpdateDatetime().equals(other.getRecUpdateDatetime()))
            && (this.getRecUpdateUser() == null ? other.getRecUpdateUser() == null : this.getRecUpdateUser().equals(other.getRecUpdateUser()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.permissions
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getRecInsertDatetime() == null) ? 0 : getRecInsertDatetime().hashCode());
        result = prime * result + ((getRecInsertUser() == null) ? 0 : getRecInsertUser().hashCode());
        result = prime * result + ((getRecUpdateDatetime() == null) ? 0 : getRecUpdateDatetime().hashCode());
        result = prime * result + ((getRecUpdateUser() == null) ? 0 : getRecUpdateUser().hashCode());
        return result;
    }
}