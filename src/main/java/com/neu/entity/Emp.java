package com.neu.entity;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table emp
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Emp {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.id
	 * @mbg.generated
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.name
	 * @mbg.generated
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.age
	 * @mbg.generated
	 */
	private Integer age;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.sex
	 * @mbg.generated
	 */
	private String sex;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.pno
	 * @mbg.generated
	 */
	private Post post;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.sal
	 * @mbg.generated
	 */
	private Double sal;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column emp.subsidy
	 * @mbg.generated
	 */
	private Double subsidy;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.id
	 * @return  the value of emp.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.id
	 * @param id  the value for emp.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.name
	 * @return  the value of emp.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.name
	 * @param name  the value for emp.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.age
	 * @return  the value of emp.age
	 * @mbg.generated
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.age
	 * @param age  the value for emp.age
	 * @mbg.generated
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.sex
	 * @return  the value of emp.sex
	 * @mbg.generated
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.sex
	 * @param sex  the value for emp.sex
	 * @mbg.generated
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.pno
	 * @return  the value of emp.pno
	 * @mbg.generated
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.pno
	 * @param post  the value for emp.pno
	 * @mbg.generated
	 */
	public void setPost(Post post) {
		this.post = post;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.sal
	 * @return  the value of emp.sal
	 * @mbg.generated
	 */
	public Double getSal() {
		return sal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.sal
	 * @param sal  the value for emp.sal
	 * @mbg.generated
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column emp.subsidy
	 * @return  the value of emp.subsidy
	 * @mbg.generated
	 */
	public Double getSubsidy() {
		return subsidy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column emp.subsidy
	 * @param subsidy  the value for emp.subsidy
	 * @mbg.generated
	 */
	public void setSubsidy(Double subsidy) {
		this.subsidy = subsidy;
	}
}