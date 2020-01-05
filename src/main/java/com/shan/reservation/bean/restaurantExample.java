package com.shan.reservation.bean;

import java.util.ArrayList;
import java.util.List;

public class restaurantExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public restaurantExample() {
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

        public Criteria andRestaurantIdIsNull() {
            addCriterion("restaurant_id is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIsNotNull() {
            addCriterion("restaurant_id is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdEqualTo(Integer value) {
            addCriterion("restaurant_id =", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotEqualTo(Integer value) {
            addCriterion("restaurant_id <>", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThan(Integer value) {
            addCriterion("restaurant_id >", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id >=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThan(Integer value) {
            addCriterion("restaurant_id <", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_id <=", value, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdIn(List<Integer> values) {
            addCriterion("restaurant_id in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotIn(List<Integer> values) {
            addCriterion("restaurant_id not in", values, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_id not between", value1, value2, "restaurantId");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordIsNull() {
            addCriterion("restaurant_password is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordIsNotNull() {
            addCriterion("restaurant_password is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordEqualTo(String value) {
            addCriterion("restaurant_password =", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordNotEqualTo(String value) {
            addCriterion("restaurant_password <>", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordGreaterThan(String value) {
            addCriterion("restaurant_password >", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_password >=", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordLessThan(String value) {
            addCriterion("restaurant_password <", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordLessThanOrEqualTo(String value) {
            addCriterion("restaurant_password <=", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordLike(String value) {
            addCriterion("restaurant_password like", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordNotLike(String value) {
            addCriterion("restaurant_password not like", value, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordIn(List<String> values) {
            addCriterion("restaurant_password in", values, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordNotIn(List<String> values) {
            addCriterion("restaurant_password not in", values, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordBetween(String value1, String value2) {
            addCriterion("restaurant_password between", value1, value2, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantPasswordNotBetween(String value1, String value2) {
            addCriterion("restaurant_password not between", value1, value2, "restaurantPassword");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressIsNull() {
            addCriterion("restaurant_address is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressIsNotNull() {
            addCriterion("restaurant_address is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressEqualTo(Integer value) {
            addCriterion("restaurant_address =", value, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressNotEqualTo(Integer value) {
            addCriterion("restaurant_address <>", value, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressGreaterThan(Integer value) {
            addCriterion("restaurant_address >", value, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_address >=", value, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressLessThan(Integer value) {
            addCriterion("restaurant_address <", value, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_address <=", value, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressIn(List<Integer> values) {
            addCriterion("restaurant_address in", values, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressNotIn(List<Integer> values) {
            addCriterion("restaurant_address not in", values, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_address between", value1, value2, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_address not between", value1, value2, "restaurantAddress");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneIsNull() {
            addCriterion("restaurant_phone is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneIsNotNull() {
            addCriterion("restaurant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneEqualTo(String value) {
            addCriterion("restaurant_phone =", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneNotEqualTo(String value) {
            addCriterion("restaurant_phone <>", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneGreaterThan(String value) {
            addCriterion("restaurant_phone >", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_phone >=", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneLessThan(String value) {
            addCriterion("restaurant_phone <", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneLessThanOrEqualTo(String value) {
            addCriterion("restaurant_phone <=", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneLike(String value) {
            addCriterion("restaurant_phone like", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneNotLike(String value) {
            addCriterion("restaurant_phone not like", value, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneIn(List<String> values) {
            addCriterion("restaurant_phone in", values, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneNotIn(List<String> values) {
            addCriterion("restaurant_phone not in", values, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneBetween(String value1, String value2) {
            addCriterion("restaurant_phone between", value1, value2, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantPhoneNotBetween(String value1, String value2) {
            addCriterion("restaurant_phone not between", value1, value2, "restaurantPhone");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNull() {
            addCriterion("restaurant_name is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIsNotNull() {
            addCriterion("restaurant_name is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameEqualTo(String value) {
            addCriterion("restaurant_name =", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotEqualTo(String value) {
            addCriterion("restaurant_name <>", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThan(String value) {
            addCriterion("restaurant_name >", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameGreaterThanOrEqualTo(String value) {
            addCriterion("restaurant_name >=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThan(String value) {
            addCriterion("restaurant_name <", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLessThanOrEqualTo(String value) {
            addCriterion("restaurant_name <=", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameLike(String value) {
            addCriterion("restaurant_name like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotLike(String value) {
            addCriterion("restaurant_name not like", value, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameIn(List<String> values) {
            addCriterion("restaurant_name in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotIn(List<String> values) {
            addCriterion("restaurant_name not in", values, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameBetween(String value1, String value2) {
            addCriterion("restaurant_name between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantNameNotBetween(String value1, String value2) {
            addCriterion("restaurant_name not between", value1, value2, "restaurantName");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateIsNull() {
            addCriterion("restaurant_state is null");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateIsNotNull() {
            addCriterion("restaurant_state is not null");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateEqualTo(Integer value) {
            addCriterion("restaurant_state =", value, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateNotEqualTo(Integer value) {
            addCriterion("restaurant_state <>", value, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateGreaterThan(Integer value) {
            addCriterion("restaurant_state >", value, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("restaurant_state >=", value, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateLessThan(Integer value) {
            addCriterion("restaurant_state <", value, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateLessThanOrEqualTo(Integer value) {
            addCriterion("restaurant_state <=", value, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateIn(List<Integer> values) {
            addCriterion("restaurant_state in", values, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateNotIn(List<Integer> values) {
            addCriterion("restaurant_state not in", values, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_state between", value1, value2, "restaurantState");
            return (Criteria) this;
        }

        public Criteria andRestaurantStateNotBetween(Integer value1, Integer value2) {
            addCriterion("restaurant_state not between", value1, value2, "restaurantState");
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