package com.neu.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table post
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Post {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column post.dno
     *
     * @mbg.generated
     */
    private Department department;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.id
     *
     * @return the value of post.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.id
     *
     * @param id the value for post.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.name
     *
     * @return the value of post.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.name
     *
     * @param name the value for post.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column post.dno
     *
     * @return the value of post.dno
     *
     * @mbg.generated
     */
    public Department getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column post.dno
     *
     * @param department the value for post.dno
     *
     * @mbg.generated
     */
    public void setDepartment(Department department) {
        this.department = department;
    }
}