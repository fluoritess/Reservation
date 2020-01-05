package com.shan.reservation.bean;

import java.util.ArrayList;
import java.util.List;

public class addressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public addressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceIsNull() {
            addCriterion("address_provence is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceIsNotNull() {
            addCriterion("address_provence is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceEqualTo(String value) {
            addCriterion("address_provence =", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceNotEqualTo(String value) {
            addCriterion("address_provence <>", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceGreaterThan(String value) {
            addCriterion("address_provence >", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceGreaterThanOrEqualTo(String value) {
            addCriterion("address_provence >=", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceLessThan(String value) {
            addCriterion("address_provence <", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceLessThanOrEqualTo(String value) {
            addCriterion("address_provence <=", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceLike(String value) {
            addCriterion("address_provence like", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceNotLike(String value) {
            addCriterion("address_provence not like", value, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceIn(List<String> values) {
            addCriterion("address_provence in", values, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceNotIn(List<String> values) {
            addCriterion("address_provence not in", values, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceBetween(String value1, String value2) {
            addCriterion("address_provence between", value1, value2, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressProvenceNotBetween(String value1, String value2) {
            addCriterion("address_provence not between", value1, value2, "addressProvence");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNull() {
            addCriterion("address_city is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNotNull() {
            addCriterion("address_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityEqualTo(String value) {
            addCriterion("address_city =", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotEqualTo(String value) {
            addCriterion("address_city <>", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThan(String value) {
            addCriterion("address_city >", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("address_city >=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThan(String value) {
            addCriterion("address_city <", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThanOrEqualTo(String value) {
            addCriterion("address_city <=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLike(String value) {
            addCriterion("address_city like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotLike(String value) {
            addCriterion("address_city not like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityIn(List<String> values) {
            addCriterion("address_city in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotIn(List<String> values) {
            addCriterion("address_city not in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityBetween(String value1, String value2) {
            addCriterion("address_city between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotBetween(String value1, String value2) {
            addCriterion("address_city not between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIsNull() {
            addCriterion("address_district is null");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIsNotNull() {
            addCriterion("address_district is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictEqualTo(String value) {
            addCriterion("address_district =", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictNotEqualTo(String value) {
            addCriterion("address_district <>", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictGreaterThan(String value) {
            addCriterion("address_district >", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("address_district >=", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictLessThan(String value) {
            addCriterion("address_district <", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictLessThanOrEqualTo(String value) {
            addCriterion("address_district <=", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictLike(String value) {
            addCriterion("address_district like", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictNotLike(String value) {
            addCriterion("address_district not like", value, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictIn(List<String> values) {
            addCriterion("address_district in", values, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictNotIn(List<String> values) {
            addCriterion("address_district not in", values, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictBetween(String value1, String value2) {
            addCriterion("address_district between", value1, value2, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressDistrictNotBetween(String value1, String value2) {
            addCriterion("address_district not between", value1, value2, "addressDistrict");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIsNull() {
            addCriterion("address_street is null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIsNotNull() {
            addCriterion("address_street is not null");
            return (Criteria) this;
        }

        public Criteria andAddressStreetEqualTo(String value) {
            addCriterion("address_street =", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotEqualTo(String value) {
            addCriterion("address_street <>", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetGreaterThan(String value) {
            addCriterion("address_street >", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetGreaterThanOrEqualTo(String value) {
            addCriterion("address_street >=", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLessThan(String value) {
            addCriterion("address_street <", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLessThanOrEqualTo(String value) {
            addCriterion("address_street <=", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetLike(String value) {
            addCriterion("address_street like", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotLike(String value) {
            addCriterion("address_street not like", value, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetIn(List<String> values) {
            addCriterion("address_street in", values, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotIn(List<String> values) {
            addCriterion("address_street not in", values, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetBetween(String value1, String value2) {
            addCriterion("address_street between", value1, value2, "addressStreet");
            return (Criteria) this;
        }

        public Criteria andAddressStreetNotBetween(String value1, String value2) {
            addCriterion("address_street not between", value1, value2, "addressStreet");
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