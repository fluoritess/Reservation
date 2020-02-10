package com.shan.reservation.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class orderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public orderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderNo is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderNo is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderNo =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderNo <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderNo >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderNo >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderNo <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderNo <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderNo like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderNo not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderNo in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderNo not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderNo between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderNo not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidIsNull() {
            addCriterion("restaurantId is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantidIsNotNull() {
            addCriterion("restaurantId is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantidEqualTo(Integer value) {
            addCriterion("restaurantId =", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidNotEqualTo(Integer value) {
            addCriterion("restaurantId <>", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidGreaterThan(Integer value) {
            addCriterion("restaurantId >", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurantId >=", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidLessThan(Integer value) {
            addCriterion("restaurantId <", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidLessThanOrEqualTo(Integer value) {
            addCriterion("restaurantId <=", value, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidIn(List<Integer> values) {
            addCriterion("restaurantId in", values, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidNotIn(List<Integer> values) {
            addCriterion("restaurantId not in", values, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidBetween(Integer value1, Integer value2) {
            addCriterion("restaurantId between", value1, value2, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andRestaurantidNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurantId not between", value1, value2, "restaurantid");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("isPay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("isPay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Byte value) {
            addCriterion("isPay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Byte value) {
            addCriterion("isPay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Byte value) {
            addCriterion("isPay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Byte value) {
            addCriterion("isPay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Byte value) {
            addCriterion("isPay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Byte value) {
            addCriterion("isPay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Byte> values) {
            addCriterion("isPay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Byte> values) {
            addCriterion("isPay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Byte value1, Byte value2) {
            addCriterion("isPay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Byte value1, Byte value2) {
            addCriterion("isPay not between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIsappraiseIsNull() {
            addCriterion("isAppraise is null");
            return (Criteria) this;
        }

        public Criteria andIsappraiseIsNotNull() {
            addCriterion("isAppraise is not null");
            return (Criteria) this;
        }

        public Criteria andIsappraiseEqualTo(Byte value) {
            addCriterion("isAppraise =", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseNotEqualTo(Byte value) {
            addCriterion("isAppraise <>", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseGreaterThan(Byte value) {
            addCriterion("isAppraise >", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseGreaterThanOrEqualTo(Byte value) {
            addCriterion("isAppraise >=", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseLessThan(Byte value) {
            addCriterion("isAppraise <", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseLessThanOrEqualTo(Byte value) {
            addCriterion("isAppraise <=", value, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseIn(List<Byte> values) {
            addCriterion("isAppraise in", values, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseNotIn(List<Byte> values) {
            addCriterion("isAppraise not in", values, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseBetween(Byte value1, Byte value2) {
            addCriterion("isAppraise between", value1, value2, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsappraiseNotBetween(Byte value1, Byte value2) {
            addCriterion("isAppraise not between", value1, value2, "isappraise");
            return (Criteria) this;
        }

        public Criteria andIsrefundIsNull() {
            addCriterion("isRefund is null");
            return (Criteria) this;
        }

        public Criteria andIsrefundIsNotNull() {
            addCriterion("isRefund is not null");
            return (Criteria) this;
        }

        public Criteria andIsrefundEqualTo(Byte value) {
            addCriterion("isRefund =", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundNotEqualTo(Byte value) {
            addCriterion("isRefund <>", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundGreaterThan(Byte value) {
            addCriterion("isRefund >", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("isRefund >=", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundLessThan(Byte value) {
            addCriterion("isRefund <", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundLessThanOrEqualTo(Byte value) {
            addCriterion("isRefund <=", value, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundIn(List<Byte> values) {
            addCriterion("isRefund in", values, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundNotIn(List<Byte> values) {
            addCriterion("isRefund not in", values, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundBetween(Byte value1, Byte value2) {
            addCriterion("isRefund between", value1, value2, "isrefund");
            return (Criteria) this;
        }

        public Criteria andIsrefundNotBetween(Byte value1, Byte value2) {
            addCriterion("isRefund not between", value1, value2, "isrefund");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyIsNull() {
            addCriterion("deliverMoney is null");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyIsNotNull() {
            addCriterion("deliverMoney is not null");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyEqualTo(BigDecimal value) {
            addCriterion("deliverMoney =", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyNotEqualTo(BigDecimal value) {
            addCriterion("deliverMoney <>", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyGreaterThan(BigDecimal value) {
            addCriterion("deliverMoney >", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("deliverMoney >=", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyLessThan(BigDecimal value) {
            addCriterion("deliverMoney <", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("deliverMoney <=", value, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyIn(List<BigDecimal> values) {
            addCriterion("deliverMoney in", values, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyNotIn(List<BigDecimal> values) {
            addCriterion("deliverMoney not in", values, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliverMoney between", value1, value2, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andDelivermoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("deliverMoney not between", value1, value2, "delivermoney");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNull() {
            addCriterion("deliveryTime is null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIsNotNull() {
            addCriterion("deliveryTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeEqualTo(Date value) {
            addCriterion("deliveryTime =", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotEqualTo(Date value) {
            addCriterion("deliveryTime <>", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThan(Date value) {
            addCriterion("deliveryTime >", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliveryTime >=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThan(Date value) {
            addCriterion("deliveryTime <", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeLessThanOrEqualTo(Date value) {
            addCriterion("deliveryTime <=", value, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeIn(List<Date> values) {
            addCriterion("deliveryTime in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotIn(List<Date> values) {
            addCriterion("deliveryTime not in", values, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeBetween(Date value1, Date value2) {
            addCriterion("deliveryTime between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andDeliverytimeNotBetween(Date value1, Date value2) {
            addCriterion("deliveryTime not between", value1, value2, "deliverytime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNull() {
            addCriterion("receiveTime is null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIsNotNull() {
            addCriterion("receiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetimeEqualTo(Date value) {
            addCriterion("receiveTime =", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotEqualTo(Date value) {
            addCriterion("receiveTime <>", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThan(Date value) {
            addCriterion("receiveTime >", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receiveTime >=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThan(Date value) {
            addCriterion("receiveTime <", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeLessThanOrEqualTo(Date value) {
            addCriterion("receiveTime <=", value, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeIn(List<Date> values) {
            addCriterion("receiveTime in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotIn(List<Date> values) {
            addCriterion("receiveTime not in", values, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeBetween(Date value1, Date value2) {
            addCriterion("receiveTime between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andReceivetimeNotBetween(Date value1, Date value2) {
            addCriterion("receiveTime not between", value1, value2, "receivetime");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNull() {
            addCriterion("orderState is null");
            return (Criteria) this;
        }

        public Criteria andOrderstateIsNotNull() {
            addCriterion("orderState is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstateEqualTo(Byte value) {
            addCriterion("orderState =", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotEqualTo(Byte value) {
            addCriterion("orderState <>", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThan(Byte value) {
            addCriterion("orderState >", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderState >=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThan(Byte value) {
            addCriterion("orderState <", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateLessThanOrEqualTo(Byte value) {
            addCriterion("orderState <=", value, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateIn(List<Byte> values) {
            addCriterion("orderState in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotIn(List<Byte> values) {
            addCriterion("orderState not in", values, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateBetween(Byte value1, Byte value2) {
            addCriterion("orderState between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderstateNotBetween(Byte value1, Byte value2) {
            addCriterion("orderState not between", value1, value2, "orderstate");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIsNull() {
            addCriterion("orderRemarks is null");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIsNotNull() {
            addCriterion("orderRemarks is not null");
            return (Criteria) this;
        }

        public Criteria andOrderremarksEqualTo(String value) {
            addCriterion("orderRemarks =", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotEqualTo(String value) {
            addCriterion("orderRemarks <>", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksGreaterThan(String value) {
            addCriterion("orderRemarks >", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksGreaterThanOrEqualTo(String value) {
            addCriterion("orderRemarks >=", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLessThan(String value) {
            addCriterion("orderRemarks <", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLessThanOrEqualTo(String value) {
            addCriterion("orderRemarks <=", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksLike(String value) {
            addCriterion("orderRemarks like", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotLike(String value) {
            addCriterion("orderRemarks not like", value, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksIn(List<String> values) {
            addCriterion("orderRemarks in", values, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotIn(List<String> values) {
            addCriterion("orderRemarks not in", values, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksBetween(String value1, String value2) {
            addCriterion("orderRemarks between", value1, value2, "orderremarks");
            return (Criteria) this;
        }

        public Criteria andOrderremarksNotBetween(String value1, String value2) {
            addCriterion("orderRemarks not between", value1, value2, "orderremarks");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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