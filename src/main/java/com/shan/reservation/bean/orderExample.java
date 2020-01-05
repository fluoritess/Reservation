package com.shan.reservation.bean;

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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUserIsNull() {
            addCriterion("order_user is null");
            return (Criteria) this;
        }

        public Criteria andOrderUserIsNotNull() {
            addCriterion("order_user is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUserEqualTo(Integer value) {
            addCriterion("order_user =", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotEqualTo(Integer value) {
            addCriterion("order_user <>", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserGreaterThan(Integer value) {
            addCriterion("order_user >", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_user >=", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserLessThan(Integer value) {
            addCriterion("order_user <", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserLessThanOrEqualTo(Integer value) {
            addCriterion("order_user <=", value, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserIn(List<Integer> values) {
            addCriterion("order_user in", values, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotIn(List<Integer> values) {
            addCriterion("order_user not in", values, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserBetween(Integer value1, Integer value2) {
            addCriterion("order_user between", value1, value2, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderUserNotBetween(Integer value1, Integer value2) {
            addCriterion("order_user not between", value1, value2, "orderUser");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantIsNull() {
            addCriterion("order_restaurant is null");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantIsNotNull() {
            addCriterion("order_restaurant is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantEqualTo(Integer value) {
            addCriterion("order_restaurant =", value, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantNotEqualTo(Integer value) {
            addCriterion("order_restaurant <>", value, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantGreaterThan(Integer value) {
            addCriterion("order_restaurant >", value, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_restaurant >=", value, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantLessThan(Integer value) {
            addCriterion("order_restaurant <", value, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantLessThanOrEqualTo(Integer value) {
            addCriterion("order_restaurant <=", value, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantIn(List<Integer> values) {
            addCriterion("order_restaurant in", values, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantNotIn(List<Integer> values) {
            addCriterion("order_restaurant not in", values, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantBetween(Integer value1, Integer value2) {
            addCriterion("order_restaurant between", value1, value2, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderRestaurantNotBetween(Integer value1, Integer value2) {
            addCriterion("order_restaurant not between", value1, value2, "orderRestaurant");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("order_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("order_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(Integer value) {
            addCriterion("order_price =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(Integer value) {
            addCriterion("order_price <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(Integer value) {
            addCriterion("order_price >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_price >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(Integer value) {
            addCriterion("order_price <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(Integer value) {
            addCriterion("order_price <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<Integer> values) {
            addCriterion("order_price in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<Integer> values) {
            addCriterion("order_price not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(Integer value1, Integer value2) {
            addCriterion("order_price between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("order_price not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andOrderFoodIsNull() {
            addCriterion("order_food is null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodIsNotNull() {
            addCriterion("order_food is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFoodEqualTo(String value) {
            addCriterion("order_food =", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotEqualTo(String value) {
            addCriterion("order_food <>", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodGreaterThan(String value) {
            addCriterion("order_food >", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodGreaterThanOrEqualTo(String value) {
            addCriterion("order_food >=", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodLessThan(String value) {
            addCriterion("order_food <", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodLessThanOrEqualTo(String value) {
            addCriterion("order_food <=", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodLike(String value) {
            addCriterion("order_food like", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotLike(String value) {
            addCriterion("order_food not like", value, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodIn(List<String> values) {
            addCriterion("order_food in", values, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotIn(List<String> values) {
            addCriterion("order_food not in", values, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodBetween(String value1, String value2) {
            addCriterion("order_food between", value1, value2, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderFoodNotBetween(String value1, String value2) {
            addCriterion("order_food not between", value1, value2, "orderFood");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("order_state =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("order_state <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("order_state >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_state >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("order_state <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("order_state <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("order_state in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("order_state not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("order_state between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("order_state not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andIsShipIsNull() {
            addCriterion("is_ship is null");
            return (Criteria) this;
        }

        public Criteria andIsShipIsNotNull() {
            addCriterion("is_ship is not null");
            return (Criteria) this;
        }

        public Criteria andIsShipEqualTo(Integer value) {
            addCriterion("is_ship =", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipNotEqualTo(Integer value) {
            addCriterion("is_ship <>", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipGreaterThan(Integer value) {
            addCriterion("is_ship >", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_ship >=", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipLessThan(Integer value) {
            addCriterion("is_ship <", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipLessThanOrEqualTo(Integer value) {
            addCriterion("is_ship <=", value, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipIn(List<Integer> values) {
            addCriterion("is_ship in", values, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipNotIn(List<Integer> values) {
            addCriterion("is_ship not in", values, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipBetween(Integer value1, Integer value2) {
            addCriterion("is_ship between", value1, value2, "isShip");
            return (Criteria) this;
        }

        public Criteria andIsShipNotBetween(Integer value1, Integer value2) {
            addCriterion("is_ship not between", value1, value2, "isShip");
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