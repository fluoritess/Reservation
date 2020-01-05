package com.shan.reservation.bean;

import java.util.ArrayList;
import java.util.List;

public class advertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public advertisementExample() {
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

        public Criteria andAdvertisementIdIsNull() {
            addCriterion("advertisement_id is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdIsNotNull() {
            addCriterion("advertisement_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdEqualTo(Integer value) {
            addCriterion("advertisement_id =", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdNotEqualTo(Integer value) {
            addCriterion("advertisement_id <>", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdGreaterThan(Integer value) {
            addCriterion("advertisement_id >", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("advertisement_id >=", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdLessThan(Integer value) {
            addCriterion("advertisement_id <", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdLessThanOrEqualTo(Integer value) {
            addCriterion("advertisement_id <=", value, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdIn(List<Integer> values) {
            addCriterion("advertisement_id in", values, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdNotIn(List<Integer> values) {
            addCriterion("advertisement_id not in", values, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdBetween(Integer value1, Integer value2) {
            addCriterion("advertisement_id between", value1, value2, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIdNotBetween(Integer value1, Integer value2) {
            addCriterion("advertisement_id not between", value1, value2, "advertisementId");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleIsNull() {
            addCriterion("advertisement_title is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleIsNotNull() {
            addCriterion("advertisement_title is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleEqualTo(String value) {
            addCriterion("advertisement_title =", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleNotEqualTo(String value) {
            addCriterion("advertisement_title <>", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleGreaterThan(String value) {
            addCriterion("advertisement_title >", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_title >=", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleLessThan(String value) {
            addCriterion("advertisement_title <", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleLessThanOrEqualTo(String value) {
            addCriterion("advertisement_title <=", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleLike(String value) {
            addCriterion("advertisement_title like", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleNotLike(String value) {
            addCriterion("advertisement_title not like", value, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleIn(List<String> values) {
            addCriterion("advertisement_title in", values, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleNotIn(List<String> values) {
            addCriterion("advertisement_title not in", values, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleBetween(String value1, String value2) {
            addCriterion("advertisement_title between", value1, value2, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementTitleNotBetween(String value1, String value2) {
            addCriterion("advertisement_title not between", value1, value2, "advertisementTitle");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagIsNull() {
            addCriterion("advertisement_imag is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagIsNotNull() {
            addCriterion("advertisement_imag is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagEqualTo(String value) {
            addCriterion("advertisement_imag =", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagNotEqualTo(String value) {
            addCriterion("advertisement_imag <>", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagGreaterThan(String value) {
            addCriterion("advertisement_imag >", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_imag >=", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagLessThan(String value) {
            addCriterion("advertisement_imag <", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagLessThanOrEqualTo(String value) {
            addCriterion("advertisement_imag <=", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagLike(String value) {
            addCriterion("advertisement_imag like", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagNotLike(String value) {
            addCriterion("advertisement_imag not like", value, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagIn(List<String> values) {
            addCriterion("advertisement_imag in", values, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagNotIn(List<String> values) {
            addCriterion("advertisement_imag not in", values, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagBetween(String value1, String value2) {
            addCriterion("advertisement_imag between", value1, value2, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementImagNotBetween(String value1, String value2) {
            addCriterion("advertisement_imag not between", value1, value2, "advertisementImag");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentIsNull() {
            addCriterion("advertisement_content is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentIsNotNull() {
            addCriterion("advertisement_content is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentEqualTo(String value) {
            addCriterion("advertisement_content =", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentNotEqualTo(String value) {
            addCriterion("advertisement_content <>", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentGreaterThan(String value) {
            addCriterion("advertisement_content >", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_content >=", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentLessThan(String value) {
            addCriterion("advertisement_content <", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentLessThanOrEqualTo(String value) {
            addCriterion("advertisement_content <=", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentLike(String value) {
            addCriterion("advertisement_content like", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentNotLike(String value) {
            addCriterion("advertisement_content not like", value, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentIn(List<String> values) {
            addCriterion("advertisement_content in", values, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentNotIn(List<String> values) {
            addCriterion("advertisement_content not in", values, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentBetween(String value1, String value2) {
            addCriterion("advertisement_content between", value1, value2, "advertisementContent");
            return (Criteria) this;
        }

        public Criteria andAdvertisementContentNotBetween(String value1, String value2) {
            addCriterion("advertisement_content not between", value1, value2, "advertisementContent");
            return (Criteria) this;
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

        public Criteria andAdvertisementStateIsNull() {
            addCriterion("advertisement_state is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateIsNotNull() {
            addCriterion("advertisement_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateEqualTo(Integer value) {
            addCriterion("advertisement_state =", value, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateNotEqualTo(Integer value) {
            addCriterion("advertisement_state <>", value, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateGreaterThan(Integer value) {
            addCriterion("advertisement_state >", value, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("advertisement_state >=", value, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateLessThan(Integer value) {
            addCriterion("advertisement_state <", value, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateLessThanOrEqualTo(Integer value) {
            addCriterion("advertisement_state <=", value, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateIn(List<Integer> values) {
            addCriterion("advertisement_state in", values, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateNotIn(List<Integer> values) {
            addCriterion("advertisement_state not in", values, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateBetween(Integer value1, Integer value2) {
            addCriterion("advertisement_state between", value1, value2, "advertisementState");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStateNotBetween(Integer value1, Integer value2) {
            addCriterion("advertisement_state not between", value1, value2, "advertisementState");
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