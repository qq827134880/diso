package com.neu.mapper;

import com.neu.entity.Emp;
import com.neu.entity.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	long countByExample(EmpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int deleteByExample(EmpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int insert(Emp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int insertSelective(Emp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	List<Emp> selectByExample(EmpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	Emp selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(Emp record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	int updateByPrimaryKey(Emp record);
}