package com.mycompany.apps.entities;

public class PkRoles {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.pk_roles.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    private Integer id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.pk_roles.id
     *
     * @return the value of public.pk_roles.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.pk_roles.id
     *
     * @param id the value for public.pk_roles.id
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pk_roles
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
        PkRoles other = (PkRoles) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.pk_roles
     *
     * @mbggenerated Sun Jun 15 20:25:56 JST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}