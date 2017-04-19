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

        public Criteria andRentStartIsNull() {
            addCriterion("rent_start is null");
            return (Criteria) this;
        }

        public Criteria andRentStartIsNotNull() {
            addCriterion("rent_start is not null");
            return (Criteria) this;
        }

        public Criteria andRentStartEqualTo(Integer value) {
            addCriterion("rent_start =", value, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartNotEqualTo(Integer value) {
            addCriterion("rent_start <>", value, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartGreaterThan(Integer value) {
            addCriterion("rent_start >", value, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_start >=", value, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartLessThan(Integer value) {
            addCriterion("rent_start <", value, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartLessThanOrEqualTo(Integer value) {
            addCriterion("rent_start <=", value, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartIn(List<Integer> values) {
            addCriterion("rent_start in", values, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartNotIn(List<Integer> values) {
            addCriterion("rent_start not in", values, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartBetween(Integer value1, Integer value2) {
            addCriterion("rent_start between", value1, value2, "rentStart");
            return (Criteria) this;
        }

        public Criteria andRentStartNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_start not between", value1, value2, "rentStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartIsNull() {
            addCriterion("node_start is null");
            return (Criteria) this;
        }

        public Criteria andNodeStartIsNotNull() {
            addCriterion("node_start is not null");
            return (Criteria) this;
        }

        public Criteria andNodeStartEqualTo(Integer value) {
            addCriterion("node_start =", value, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartNotEqualTo(Integer value) {
            addCriterion("node_start <>", value, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartGreaterThan(Integer value) {
            addCriterion("node_start >", value, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_start >=", value, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartLessThan(Integer value) {
            addCriterion("node_start <", value, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartLessThanOrEqualTo(Integer value) {
            addCriterion("node_start <=", value, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartIn(List<Integer> values) {
            addCriterion("node_start in", values, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartNotIn(List<Integer> values) {
            addCriterion("node_start not in", values, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartBetween(Integer value1, Integer value2) {
            addCriterion("node_start between", value1, value2, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andNodeStartNotBetween(Integer value1, Integer value2) {
            addCriterion("node_start not between", value1, value2, "nodeStart");
            return (Criteria) this;
        }

        public Criteria andRentEndIsNull() {
            addCriterion("rent_end is null");
            return (Criteria) this;
        }

        public Criteria andRentEndIsNotNull() {
            addCriterion("rent_end is not null");
            return (Criteria) this;
        }

        public Criteria andRentEndEqualTo(Integer value) {
            addCriterion("rent_end =", value, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndNotEqualTo(Integer value) {
            addCriterion("rent_end <>", value, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndGreaterThan(Integer value) {
            addCriterion("rent_end >", value, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("rent_end >=", value, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndLessThan(Integer value) {
            addCriterion("rent_end <", value, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndLessThanOrEqualTo(Integer value) {
            addCriterion("rent_end <=", value, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndIn(List<Integer> values) {
            addCriterion("rent_end in", values, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndNotIn(List<Integer> values) {
            addCriterion("rent_end not in", values, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndBetween(Integer value1, Integer value2) {
            addCriterion("rent_end between", value1, value2, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andRentEndNotBetween(Integer value1, Integer value2) {
            addCriterion("rent_end not between", value1, value2, "rentEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndIsNull() {
            addCriterion("node_end is null");
            return (Criteria) this;
        }

        public Criteria andNodeEndIsNotNull() {
            addCriterion("node_end is not null");
            return (Criteria) this;
        }

        public Criteria andNodeEndEqualTo(Integer value) {
            addCriterion("node_end =", value, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndNotEqualTo(Integer value) {
            addCriterion("node_end <>", value, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndGreaterThan(Integer value) {
            addCriterion("node_end >", value, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndGreaterThanOrEqualTo(Integer value) {
            addCriterion("node_end >=", value, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndLessThan(Integer value) {
            addCriterion("node_end <", value, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndLessThanOrEqualTo(Integer value) {
            addCriterion("node_end <=", value, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndIn(List<Integer> values) {
            addCriterion("node_end in", values, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndNotIn(List<Integer> values) {
            addCriterion("node_end not in", values, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndBetween(Integer value1, Integer value2) {
            addCriterion("node_end between", value1, value2, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andNodeEndNotBetween(Integer value1, Integer value2) {
            addCriterion("node_end not between", value1, value2, "nodeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNull() {
            addCriterion("time_start is null");
            return (Criteria) this;
        }

        public Criteria andTimeStartIsNotNull() {
            addCriterion("time_start is not null");
            return (Criteria) this;
        }

        public Criteria andTimeStartEqualTo(Date value) {
            addCriterion("time_start =", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotEqualTo(Date value) {
            addCriterion("time_start <>", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThan(Date value) {
            addCriterion("time_start >", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("time_start >=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThan(Date value) {
            addCriterion("time_start <", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("time_start <=", value, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartIn(List<Date> values) {
            addCriterion("time_start in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotIn(List<Date> values) {
            addCriterion("time_start not in", values, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartBetween(Date value1, Date value2) {
            addCriterion("time_start between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("time_start not between", value1, value2, "timeStart");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNull() {
            addCriterion("time_end is null");
            return (Criteria) this;
        }

        public Criteria andTimeEndIsNotNull() {
            addCriterion("time_end is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEndEqualTo(Date value) {
            addCriterion("time_end =", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotEqualTo(Date value) {
            addCriterion("time_end <>", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThan(Date value) {
            addCriterion("time_end >", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("time_end >=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThan(Date value) {
            addCriterion("time_end <", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("time_end <=", value, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndIn(List<Date> values) {
            addCriterion("time_end in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotIn(List<Date> values) {
            addCriterion("time_end not in", values, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndBetween(Date value1, Date value2) {
            addCriterion("time_end between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("time_end not between", value1, value2, "timeEnd");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
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