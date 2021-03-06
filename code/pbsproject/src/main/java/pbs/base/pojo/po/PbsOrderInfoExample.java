package pbs.base.pojo.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PbsOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PbsOrderInfoExample() {
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

        public Criteria andOrderBmIsNull() {
            addCriterion("order_bm is null");
            return (Criteria) this;
        }

        public Criteria andOrderBmIsNotNull() {
            addCriterion("order_bm is not null");
            return (Criteria) this;
        }

        public Criteria andOrderBmEqualTo(String value) {
            addCriterion("order_bm =", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmNotEqualTo(String value) {
            addCriterion("order_bm <>", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmGreaterThan(String value) {
            addCriterion("order_bm >", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmGreaterThanOrEqualTo(String value) {
            addCriterion("order_bm >=", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmLessThan(String value) {
            addCriterion("order_bm <", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmLessThanOrEqualTo(String value) {
            addCriterion("order_bm <=", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmLike(String value) {
            addCriterion("order_bm like", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmNotLike(String value) {
            addCriterion("order_bm not like", value, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmIn(List<String> values) {
            addCriterion("order_bm in", values, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmNotIn(List<String> values) {
            addCriterion("order_bm not in", values, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmBetween(String value1, String value2) {
            addCriterion("order_bm between", value1, value2, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOrderBmNotBetween(String value1, String value2) {
            addCriterion("order_bm not between", value1, value2, "orderBm");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andBikeBmIsNull() {
            addCriterion("bike_bm is null");
            return (Criteria) this;
        }

        public Criteria andBikeBmIsNotNull() {
            addCriterion("bike_bm is not null");
            return (Criteria) this;
        }

        public Criteria andBikeBmEqualTo(String value) {
            addCriterion("bike_bm =", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmNotEqualTo(String value) {
            addCriterion("bike_bm <>", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmGreaterThan(String value) {
            addCriterion("bike_bm >", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmGreaterThanOrEqualTo(String value) {
            addCriterion("bike_bm >=", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmLessThan(String value) {
            addCriterion("bike_bm <", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmLessThanOrEqualTo(String value) {
            addCriterion("bike_bm <=", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmLike(String value) {
            addCriterion("bike_bm like", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmNotLike(String value) {
            addCriterion("bike_bm not like", value, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmIn(List<String> values) {
            addCriterion("bike_bm in", values, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmNotIn(List<String> values) {
            addCriterion("bike_bm not in", values, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmBetween(String value1, String value2) {
            addCriterion("bike_bm between", value1, value2, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andBikeBmNotBetween(String value1, String value2) {
            addCriterion("bike_bm not between", value1, value2, "bikeBm");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartIsNull() {
            addCriterion("node_bm_start is null");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartIsNotNull() {
            addCriterion("node_bm_start is not null");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartEqualTo(String value) {
            addCriterion("node_bm_start =", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartNotEqualTo(String value) {
            addCriterion("node_bm_start <>", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartGreaterThan(String value) {
            addCriterion("node_bm_start >", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartGreaterThanOrEqualTo(String value) {
            addCriterion("node_bm_start >=", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartLessThan(String value) {
            addCriterion("node_bm_start <", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartLessThanOrEqualTo(String value) {
            addCriterion("node_bm_start <=", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartLike(String value) {
            addCriterion("node_bm_start like", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartNotLike(String value) {
            addCriterion("node_bm_start not like", value, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartIn(List<String> values) {
            addCriterion("node_bm_start in", values, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartNotIn(List<String> values) {
            addCriterion("node_bm_start not in", values, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartBetween(String value1, String value2) {
            addCriterion("node_bm_start between", value1, value2, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmStartNotBetween(String value1, String value2) {
            addCriterion("node_bm_start not between", value1, value2, "nodeBmStart");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndIsNull() {
            addCriterion("node_bm_end is null");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndIsNotNull() {
            addCriterion("node_bm_end is not null");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndEqualTo(String value) {
            addCriterion("node_bm_end =", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndNotEqualTo(String value) {
            addCriterion("node_bm_end <>", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndGreaterThan(String value) {
            addCriterion("node_bm_end >", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndGreaterThanOrEqualTo(String value) {
            addCriterion("node_bm_end >=", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndLessThan(String value) {
            addCriterion("node_bm_end <", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndLessThanOrEqualTo(String value) {
            addCriterion("node_bm_end <=", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndLike(String value) {
            addCriterion("node_bm_end like", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndNotLike(String value) {
            addCriterion("node_bm_end not like", value, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndIn(List<String> values) {
            addCriterion("node_bm_end in", values, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndNotIn(List<String> values) {
            addCriterion("node_bm_end not in", values, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndBetween(String value1, String value2) {
            addCriterion("node_bm_end between", value1, value2, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andNodeBmEndNotBetween(String value1, String value2) {
            addCriterion("node_bm_end not between", value1, value2, "nodeBmEnd");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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