package com.neu.entity;

import java.util.ArrayList;
import java.util.List;

public class EmpExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp
	 * @mbg.generated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp
	 * @mbg.generated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table emp
	 * @mbg.generated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public EmpExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table emp
	 * @mbg.generated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table emp
	 * @mbg.generated
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}

		public Criteria andNameIsNotNull() {
			addCriterion("name is not null");
			return (Criteria) this;
		}

		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}

		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}

		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}

		public Criteria andAgeIsNull() {
			addCriterion("age is null");
			return (Criteria) this;
		}

		public Criteria andAgeIsNotNull() {
			addCriterion("age is not null");
			return (Criteria) this;
		}

		public Criteria andAgeEqualTo(Integer value) {
			addCriterion("age =", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotEqualTo(Integer value) {
			addCriterion("age <>", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeGreaterThan(Integer value) {
			addCriterion("age >", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
			addCriterion("age >=", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLessThan(Integer value) {
			addCriterion("age <", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeLessThanOrEqualTo(Integer value) {
			addCriterion("age <=", value, "age");
			return (Criteria) this;
		}

		public Criteria andAgeIn(List<Integer> values) {
			addCriterion("age in", values, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotIn(List<Integer> values) {
			addCriterion("age not in", values, "age");
			return (Criteria) this;
		}

		public Criteria andAgeBetween(Integer value1, Integer value2) {
			addCriterion("age between", value1, value2, "age");
			return (Criteria) this;
		}

		public Criteria andAgeNotBetween(Integer value1, Integer value2) {
			addCriterion("age not between", value1, value2, "age");
			return (Criteria) this;
		}

		public Criteria andSexIsNull() {
			addCriterion("sex is null");
			return (Criteria) this;
		}

		public Criteria andSexIsNotNull() {
			addCriterion("sex is not null");
			return (Criteria) this;
		}

		public Criteria andSexEqualTo(String value) {
			addCriterion("sex =", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotEqualTo(String value) {
			addCriterion("sex <>", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThan(String value) {
			addCriterion("sex >", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexGreaterThanOrEqualTo(String value) {
			addCriterion("sex >=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThan(String value) {
			addCriterion("sex <", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLessThanOrEqualTo(String value) {
			addCriterion("sex <=", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexLike(String value) {
			addCriterion("sex like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotLike(String value) {
			addCriterion("sex not like", value, "sex");
			return (Criteria) this;
		}

		public Criteria andSexIn(List<String> values) {
			addCriterion("sex in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotIn(List<String> values) {
			addCriterion("sex not in", values, "sex");
			return (Criteria) this;
		}

		public Criteria andSexBetween(String value1, String value2) {
			addCriterion("sex between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andSexNotBetween(String value1, String value2) {
			addCriterion("sex not between", value1, value2, "sex");
			return (Criteria) this;
		}

		public Criteria andPostIsNull() {
			addCriterion("pno is null");
			return (Criteria) this;
		}

		public Criteria andPostIsNotNull() {
			addCriterion("pno is not null");
			return (Criteria) this;
		}

		public Criteria andPostEqualTo(Post value) {
			addCriterion("pno =", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostNotEqualTo(Post value) {
			addCriterion("pno <>", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostGreaterThan(Post value) {
			addCriterion("pno >", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostGreaterThanOrEqualTo(Post value) {
			addCriterion("pno >=", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostLessThan(Post value) {
			addCriterion("pno <", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostLessThanOrEqualTo(Post value) {
			addCriterion("pno <=", value, "post");
			return (Criteria) this;
		}

		public Criteria andPostIn(List<Post> values) {
			addCriterion("pno in", values, "post");
			return (Criteria) this;
		}

		public Criteria andPostNotIn(List<Post> values) {
			addCriterion("pno not in", values, "post");
			return (Criteria) this;
		}

		public Criteria andPostBetween(Post value1, Post value2) {
			addCriterion("pno between", value1, value2, "post");
			return (Criteria) this;
		}

		public Criteria andPostNotBetween(Post value1, Post value2) {
			addCriterion("pno not between", value1, value2, "post");
			return (Criteria) this;
		}

		public Criteria andSalIsNull() {
			addCriterion("sal is null");
			return (Criteria) this;
		}

		public Criteria andSalIsNotNull() {
			addCriterion("sal is not null");
			return (Criteria) this;
		}

		public Criteria andSalEqualTo(Double value) {
			addCriterion("sal =", value, "sal");
			return (Criteria) this;
		}

		public Criteria andSalNotEqualTo(Double value) {
			addCriterion("sal <>", value, "sal");
			return (Criteria) this;
		}

		public Criteria andSalGreaterThan(Double value) {
			addCriterion("sal >", value, "sal");
			return (Criteria) this;
		}

		public Criteria andSalGreaterThanOrEqualTo(Double value) {
			addCriterion("sal >=", value, "sal");
			return (Criteria) this;
		}

		public Criteria andSalLessThan(Double value) {
			addCriterion("sal <", value, "sal");
			return (Criteria) this;
		}

		public Criteria andSalLessThanOrEqualTo(Double value) {
			addCriterion("sal <=", value, "sal");
			return (Criteria) this;
		}

		public Criteria andSalIn(List<Double> values) {
			addCriterion("sal in", values, "sal");
			return (Criteria) this;
		}

		public Criteria andSalNotIn(List<Double> values) {
			addCriterion("sal not in", values, "sal");
			return (Criteria) this;
		}

		public Criteria andSalBetween(Double value1, Double value2) {
			addCriterion("sal between", value1, value2, "sal");
			return (Criteria) this;
		}

		public Criteria andSalNotBetween(Double value1, Double value2) {
			addCriterion("sal not between", value1, value2, "sal");
			return (Criteria) this;
		}

		public Criteria andSubsidyIsNull() {
			addCriterion("subsidy is null");
			return (Criteria) this;
		}

		public Criteria andSubsidyIsNotNull() {
			addCriterion("subsidy is not null");
			return (Criteria) this;
		}

		public Criteria andSubsidyEqualTo(Double value) {
			addCriterion("subsidy =", value, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyNotEqualTo(Double value) {
			addCriterion("subsidy <>", value, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyGreaterThan(Double value) {
			addCriterion("subsidy >", value, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyGreaterThanOrEqualTo(Double value) {
			addCriterion("subsidy >=", value, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyLessThan(Double value) {
			addCriterion("subsidy <", value, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyLessThanOrEqualTo(Double value) {
			addCriterion("subsidy <=", value, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyIn(List<Double> values) {
			addCriterion("subsidy in", values, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyNotIn(List<Double> values) {
			addCriterion("subsidy not in", values, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyBetween(Double value1, Double value2) {
			addCriterion("subsidy between", value1, value2, "subsidy");
			return (Criteria) this;
		}

		public Criteria andSubsidyNotBetween(Double value1, Double value2) {
			addCriterion("subsidy not between", value1, value2, "subsidy");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table emp
	 * @mbg.generated
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table emp
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}