package com.greenplatform.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TGreenNlCzjlExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public TGreenNlCzjlExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
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

        public Criteria andCLshIsNull() {
            addCriterion("c_lsh is null");
            return (Criteria) this;
        }

        public Criteria andCLshIsNotNull() {
            addCriterion("c_lsh is not null");
            return (Criteria) this;
        }

        public Criteria andCLshEqualTo(String value) {
            addCriterion("c_lsh =", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshNotEqualTo(String value) {
            addCriterion("c_lsh <>", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshGreaterThan(String value) {
            addCriterion("c_lsh >", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshGreaterThanOrEqualTo(String value) {
            addCriterion("c_lsh >=", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshLessThan(String value) {
            addCriterion("c_lsh <", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshLessThanOrEqualTo(String value) {
            addCriterion("c_lsh <=", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshLike(String value) {
            addCriterion("c_lsh like", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshNotLike(String value) {
            addCriterion("c_lsh not like", value, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshIn(List<String> values) {
            addCriterion("c_lsh in", values, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshNotIn(List<String> values) {
            addCriterion("c_lsh not in", values, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshBetween(String value1, String value2) {
            addCriterion("c_lsh between", value1, value2, "cLsh");
            return (Criteria) this;
        }

        public Criteria andCLshNotBetween(String value1, String value2) {
            addCriterion("c_lsh not between", value1, value2, "cLsh");
            return (Criteria) this;
        }

        public Criteria andNCzjeIsNull() {
            addCriterion("n_czje is null");
            return (Criteria) this;
        }

        public Criteria andNCzjeIsNotNull() {
            addCriterion("n_czje is not null");
            return (Criteria) this;
        }

        public Criteria andNCzjeEqualTo(BigDecimal value) {
            addCriterion("n_czje =", value, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeNotEqualTo(BigDecimal value) {
            addCriterion("n_czje <>", value, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeGreaterThan(BigDecimal value) {
            addCriterion("n_czje >", value, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("n_czje >=", value, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeLessThan(BigDecimal value) {
            addCriterion("n_czje <", value, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("n_czje <=", value, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeIn(List<BigDecimal> values) {
            addCriterion("n_czje in", values, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeNotIn(List<BigDecimal> values) {
            addCriterion("n_czje not in", values, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_czje between", value1, value2, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCzjeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_czje not between", value1, value2, "nCzje");
            return (Criteria) this;
        }

        public Criteria andNCznlIsNull() {
            addCriterion("n_cznl is null");
            return (Criteria) this;
        }

        public Criteria andNCznlIsNotNull() {
            addCriterion("n_cznl is not null");
            return (Criteria) this;
        }

        public Criteria andNCznlEqualTo(BigDecimal value) {
            addCriterion("n_cznl =", value, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlNotEqualTo(BigDecimal value) {
            addCriterion("n_cznl <>", value, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlGreaterThan(BigDecimal value) {
            addCriterion("n_cznl >", value, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("n_cznl >=", value, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlLessThan(BigDecimal value) {
            addCriterion("n_cznl <", value, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("n_cznl <=", value, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlIn(List<BigDecimal> values) {
            addCriterion("n_cznl in", values, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlNotIn(List<BigDecimal> values) {
            addCriterion("n_cznl not in", values, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_cznl between", value1, value2, "nCznl");
            return (Criteria) this;
        }

        public Criteria andNCznlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("n_cznl not between", value1, value2, "nCznl");
            return (Criteria) this;
        }

        public Criteria andDCzsjIsNull() {
            addCriterion("d_czsj is null");
            return (Criteria) this;
        }

        public Criteria andDCzsjIsNotNull() {
            addCriterion("d_czsj is not null");
            return (Criteria) this;
        }

        public Criteria andDCzsjEqualTo(Date value) {
            addCriterion("d_czsj =", value, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjNotEqualTo(Date value) {
            addCriterion("d_czsj <>", value, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjGreaterThan(Date value) {
            addCriterion("d_czsj >", value, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_czsj >=", value, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjLessThan(Date value) {
            addCriterion("d_czsj <", value, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjLessThanOrEqualTo(Date value) {
            addCriterion("d_czsj <=", value, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjIn(List<Date> values) {
            addCriterion("d_czsj in", values, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjNotIn(List<Date> values) {
            addCriterion("d_czsj not in", values, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjBetween(Date value1, Date value2) {
            addCriterion("d_czsj between", value1, value2, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andDCzsjNotBetween(Date value1, Date value2) {
            addCriterion("d_czsj not between", value1, value2, "dCzsj");
            return (Criteria) this;
        }

        public Criteria andCSfcgIsNull() {
            addCriterion("c_sfcg is null");
            return (Criteria) this;
        }

        public Criteria andCSfcgIsNotNull() {
            addCriterion("c_sfcg is not null");
            return (Criteria) this;
        }

        public Criteria andCSfcgEqualTo(String value) {
            addCriterion("c_sfcg =", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgNotEqualTo(String value) {
            addCriterion("c_sfcg <>", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgGreaterThan(String value) {
            addCriterion("c_sfcg >", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgGreaterThanOrEqualTo(String value) {
            addCriterion("c_sfcg >=", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgLessThan(String value) {
            addCriterion("c_sfcg <", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgLessThanOrEqualTo(String value) {
            addCriterion("c_sfcg <=", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgLike(String value) {
            addCriterion("c_sfcg like", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgNotLike(String value) {
            addCriterion("c_sfcg not like", value, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgIn(List<String> values) {
            addCriterion("c_sfcg in", values, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgNotIn(List<String> values) {
            addCriterion("c_sfcg not in", values, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgBetween(String value1, String value2) {
            addCriterion("c_sfcg between", value1, value2, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCSfcgNotBetween(String value1, String value2) {
            addCriterion("c_sfcg not between", value1, value2, "cSfcg");
            return (Criteria) this;
        }

        public Criteria andCCzfsIsNull() {
            addCriterion("c_czfs is null");
            return (Criteria) this;
        }

        public Criteria andCCzfsIsNotNull() {
            addCriterion("c_czfs is not null");
            return (Criteria) this;
        }

        public Criteria andCCzfsEqualTo(String value) {
            addCriterion("c_czfs =", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsNotEqualTo(String value) {
            addCriterion("c_czfs <>", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsGreaterThan(String value) {
            addCriterion("c_czfs >", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsGreaterThanOrEqualTo(String value) {
            addCriterion("c_czfs >=", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsLessThan(String value) {
            addCriterion("c_czfs <", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsLessThanOrEqualTo(String value) {
            addCriterion("c_czfs <=", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsLike(String value) {
            addCriterion("c_czfs like", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsNotLike(String value) {
            addCriterion("c_czfs not like", value, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsIn(List<String> values) {
            addCriterion("c_czfs in", values, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsNotIn(List<String> values) {
            addCriterion("c_czfs not in", values, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsBetween(String value1, String value2) {
            addCriterion("c_czfs between", value1, value2, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzfsNotBetween(String value1, String value2) {
            addCriterion("c_czfs not between", value1, value2, "cCzfs");
            return (Criteria) this;
        }

        public Criteria andCCzzhIsNull() {
            addCriterion("c_czzh is null");
            return (Criteria) this;
        }

        public Criteria andCCzzhIsNotNull() {
            addCriterion("c_czzh is not null");
            return (Criteria) this;
        }

        public Criteria andCCzzhEqualTo(String value) {
            addCriterion("c_czzh =", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhNotEqualTo(String value) {
            addCriterion("c_czzh <>", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhGreaterThan(String value) {
            addCriterion("c_czzh >", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhGreaterThanOrEqualTo(String value) {
            addCriterion("c_czzh >=", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhLessThan(String value) {
            addCriterion("c_czzh <", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhLessThanOrEqualTo(String value) {
            addCriterion("c_czzh <=", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhLike(String value) {
            addCriterion("c_czzh like", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhNotLike(String value) {
            addCriterion("c_czzh not like", value, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhIn(List<String> values) {
            addCriterion("c_czzh in", values, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhNotIn(List<String> values) {
            addCriterion("c_czzh not in", values, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhBetween(String value1, String value2) {
            addCriterion("c_czzh between", value1, value2, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCCzzhNotBetween(String value1, String value2) {
            addCriterion("c_czzh not between", value1, value2, "cCzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhIsNull() {
            addCriterion("c_dzzh is null");
            return (Criteria) this;
        }

        public Criteria andCDzzhIsNotNull() {
            addCriterion("c_dzzh is not null");
            return (Criteria) this;
        }

        public Criteria andCDzzhEqualTo(String value) {
            addCriterion("c_dzzh =", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhNotEqualTo(String value) {
            addCriterion("c_dzzh <>", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhGreaterThan(String value) {
            addCriterion("c_dzzh >", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhGreaterThanOrEqualTo(String value) {
            addCriterion("c_dzzh >=", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhLessThan(String value) {
            addCriterion("c_dzzh <", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhLessThanOrEqualTo(String value) {
            addCriterion("c_dzzh <=", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhLike(String value) {
            addCriterion("c_dzzh like", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhNotLike(String value) {
            addCriterion("c_dzzh not like", value, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhIn(List<String> values) {
            addCriterion("c_dzzh in", values, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhNotIn(List<String> values) {
            addCriterion("c_dzzh not in", values, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhBetween(String value1, String value2) {
            addCriterion("c_dzzh between", value1, value2, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCDzzhNotBetween(String value1, String value2) {
            addCriterion("c_dzzh not between", value1, value2, "cDzzh");
            return (Criteria) this;
        }

        public Criteria andCBzIsNull() {
            addCriterion("c_bz is null");
            return (Criteria) this;
        }

        public Criteria andCBzIsNotNull() {
            addCriterion("c_bz is not null");
            return (Criteria) this;
        }

        public Criteria andCBzEqualTo(String value) {
            addCriterion("c_bz =", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotEqualTo(String value) {
            addCriterion("c_bz <>", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzGreaterThan(String value) {
            addCriterion("c_bz >", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzGreaterThanOrEqualTo(String value) {
            addCriterion("c_bz >=", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzLessThan(String value) {
            addCriterion("c_bz <", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzLessThanOrEqualTo(String value) {
            addCriterion("c_bz <=", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzLike(String value) {
            addCriterion("c_bz like", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotLike(String value) {
            addCriterion("c_bz not like", value, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzIn(List<String> values) {
            addCriterion("c_bz in", values, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotIn(List<String> values) {
            addCriterion("c_bz not in", values, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzBetween(String value1, String value2) {
            addCriterion("c_bz between", value1, value2, "cBz");
            return (Criteria) this;
        }

        public Criteria andCBzNotBetween(String value1, String value2) {
            addCriterion("c_bz not between", value1, value2, "cBz");
            return (Criteria) this;
        }

        public Criteria andCZtIsNull() {
            addCriterion("c_zt is null");
            return (Criteria) this;
        }

        public Criteria andCZtIsNotNull() {
            addCriterion("c_zt is not null");
            return (Criteria) this;
        }

        public Criteria andCZtEqualTo(String value) {
            addCriterion("c_zt =", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotEqualTo(String value) {
            addCriterion("c_zt <>", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtGreaterThan(String value) {
            addCriterion("c_zt >", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtGreaterThanOrEqualTo(String value) {
            addCriterion("c_zt >=", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLessThan(String value) {
            addCriterion("c_zt <", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLessThanOrEqualTo(String value) {
            addCriterion("c_zt <=", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtLike(String value) {
            addCriterion("c_zt like", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotLike(String value) {
            addCriterion("c_zt not like", value, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtIn(List<String> values) {
            addCriterion("c_zt in", values, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotIn(List<String> values) {
            addCriterion("c_zt not in", values, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtBetween(String value1, String value2) {
            addCriterion("c_zt between", value1, value2, "cZt");
            return (Criteria) this;
        }

        public Criteria andCZtNotBetween(String value1, String value2) {
            addCriterion("c_zt not between", value1, value2, "cZt");
            return (Criteria) this;
        }

        public Criteria andCCjuserIsNull() {
            addCriterion("c_cjuser is null");
            return (Criteria) this;
        }

        public Criteria andCCjuserIsNotNull() {
            addCriterion("c_cjuser is not null");
            return (Criteria) this;
        }

        public Criteria andCCjuserEqualTo(String value) {
            addCriterion("c_cjuser =", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotEqualTo(String value) {
            addCriterion("c_cjuser <>", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserGreaterThan(String value) {
            addCriterion("c_cjuser >", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserGreaterThanOrEqualTo(String value) {
            addCriterion("c_cjuser >=", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLessThan(String value) {
            addCriterion("c_cjuser <", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLessThanOrEqualTo(String value) {
            addCriterion("c_cjuser <=", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserLike(String value) {
            addCriterion("c_cjuser like", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotLike(String value) {
            addCriterion("c_cjuser not like", value, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserIn(List<String> values) {
            addCriterion("c_cjuser in", values, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotIn(List<String> values) {
            addCriterion("c_cjuser not in", values, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserBetween(String value1, String value2) {
            addCriterion("c_cjuser between", value1, value2, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andCCjuserNotBetween(String value1, String value2) {
            addCriterion("c_cjuser not between", value1, value2, "cCjuser");
            return (Criteria) this;
        }

        public Criteria andDCjsjIsNull() {
            addCriterion("d_cjsj is null");
            return (Criteria) this;
        }

        public Criteria andDCjsjIsNotNull() {
            addCriterion("d_cjsj is not null");
            return (Criteria) this;
        }

        public Criteria andDCjsjEqualTo(Date value) {
            addCriterion("d_cjsj =", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotEqualTo(Date value) {
            addCriterion("d_cjsj <>", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjGreaterThan(Date value) {
            addCriterion("d_cjsj >", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_cjsj >=", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjLessThan(Date value) {
            addCriterion("d_cjsj <", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjLessThanOrEqualTo(Date value) {
            addCriterion("d_cjsj <=", value, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjIn(List<Date> values) {
            addCriterion("d_cjsj in", values, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotIn(List<Date> values) {
            addCriterion("d_cjsj not in", values, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjBetween(Date value1, Date value2) {
            addCriterion("d_cjsj between", value1, value2, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andDCjsjNotBetween(Date value1, Date value2) {
            addCriterion("d_cjsj not between", value1, value2, "dCjsj");
            return (Criteria) this;
        }

        public Criteria andCXguserIsNull() {
            addCriterion("c_xguser is null");
            return (Criteria) this;
        }

        public Criteria andCXguserIsNotNull() {
            addCriterion("c_xguser is not null");
            return (Criteria) this;
        }

        public Criteria andCXguserEqualTo(String value) {
            addCriterion("c_xguser =", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotEqualTo(String value) {
            addCriterion("c_xguser <>", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserGreaterThan(String value) {
            addCriterion("c_xguser >", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserGreaterThanOrEqualTo(String value) {
            addCriterion("c_xguser >=", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLessThan(String value) {
            addCriterion("c_xguser <", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLessThanOrEqualTo(String value) {
            addCriterion("c_xguser <=", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserLike(String value) {
            addCriterion("c_xguser like", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotLike(String value) {
            addCriterion("c_xguser not like", value, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserIn(List<String> values) {
            addCriterion("c_xguser in", values, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotIn(List<String> values) {
            addCriterion("c_xguser not in", values, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserBetween(String value1, String value2) {
            addCriterion("c_xguser between", value1, value2, "cXguser");
            return (Criteria) this;
        }

        public Criteria andCXguserNotBetween(String value1, String value2) {
            addCriterion("c_xguser not between", value1, value2, "cXguser");
            return (Criteria) this;
        }

        public Criteria andDXgsjIsNull() {
            addCriterion("d_xgsj is null");
            return (Criteria) this;
        }

        public Criteria andDXgsjIsNotNull() {
            addCriterion("d_xgsj is not null");
            return (Criteria) this;
        }

        public Criteria andDXgsjEqualTo(Date value) {
            addCriterion("d_xgsj =", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotEqualTo(Date value) {
            addCriterion("d_xgsj <>", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjGreaterThan(Date value) {
            addCriterion("d_xgsj >", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("d_xgsj >=", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjLessThan(Date value) {
            addCriterion("d_xgsj <", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjLessThanOrEqualTo(Date value) {
            addCriterion("d_xgsj <=", value, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjIn(List<Date> values) {
            addCriterion("d_xgsj in", values, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotIn(List<Date> values) {
            addCriterion("d_xgsj not in", values, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjBetween(Date value1, Date value2) {
            addCriterion("d_xgsj between", value1, value2, "dXgsj");
            return (Criteria) this;
        }

        public Criteria andDXgsjNotBetween(Date value1, Date value2) {
            addCriterion("d_xgsj not between", value1, value2, "dXgsj");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_green_nl_czjl
     *
     * @mbggenerated
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
}