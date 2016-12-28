package otc.domain.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class cpxxExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cpxxExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCpdmIsNull() {
            addCriterion("CPDM is null");
            return (Criteria) this;
        }

        public Criteria andCpdmIsNotNull() {
            addCriterion("CPDM is not null");
            return (Criteria) this;
        }

        public Criteria andCpdmEqualTo(String value) {
            addCriterion("CPDM =", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmNotEqualTo(String value) {
            addCriterion("CPDM <>", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmGreaterThan(String value) {
            addCriterion("CPDM >", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmGreaterThanOrEqualTo(String value) {
            addCriterion("CPDM >=", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmLessThan(String value) {
            addCriterion("CPDM <", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmLessThanOrEqualTo(String value) {
            addCriterion("CPDM <=", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmLike(String value) {
            addCriterion("CPDM like", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmNotLike(String value) {
            addCriterion("CPDM not like", value, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmIn(List<String> values) {
            addCriterion("CPDM in", values, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmNotIn(List<String> values) {
            addCriterion("CPDM not in", values, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmBetween(String value1, String value2) {
            addCriterion("CPDM between", value1, value2, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmNotBetween(String value1, String value2) {
            addCriterion("CPDM not between", value1, value2, "cpdm");
            return (Criteria) this;
        }

        public Criteria andCpdmXtIsNull() {
            addCriterion("CPDM_XT is null");
            return (Criteria) this;
        }

        public Criteria andCpdmXtIsNotNull() {
            addCriterion("CPDM_XT is not null");
            return (Criteria) this;
        }

        public Criteria andCpdmXtEqualTo(String value) {
            addCriterion("CPDM_XT =", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtNotEqualTo(String value) {
            addCriterion("CPDM_XT <>", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtGreaterThan(String value) {
            addCriterion("CPDM_XT >", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtGreaterThanOrEqualTo(String value) {
            addCriterion("CPDM_XT >=", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtLessThan(String value) {
            addCriterion("CPDM_XT <", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtLessThanOrEqualTo(String value) {
            addCriterion("CPDM_XT <=", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtLike(String value) {
            addCriterion("CPDM_XT like", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtNotLike(String value) {
            addCriterion("CPDM_XT not like", value, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtIn(List<String> values) {
            addCriterion("CPDM_XT in", values, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtNotIn(List<String> values) {
            addCriterion("CPDM_XT not in", values, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtBetween(String value1, String value2) {
            addCriterion("CPDM_XT between", value1, value2, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpdmXtNotBetween(String value1, String value2) {
            addCriterion("CPDM_XT not between", value1, value2, "cpdmXt");
            return (Criteria) this;
        }

        public Criteria andCpjpIsNull() {
            addCriterion("CPJP is null");
            return (Criteria) this;
        }

        public Criteria andCpjpIsNotNull() {
            addCriterion("CPJP is not null");
            return (Criteria) this;
        }

        public Criteria andCpjpEqualTo(String value) {
            addCriterion("CPJP =", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpNotEqualTo(String value) {
            addCriterion("CPJP <>", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpGreaterThan(String value) {
            addCriterion("CPJP >", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpGreaterThanOrEqualTo(String value) {
            addCriterion("CPJP >=", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpLessThan(String value) {
            addCriterion("CPJP <", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpLessThanOrEqualTo(String value) {
            addCriterion("CPJP <=", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpLike(String value) {
            addCriterion("CPJP like", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpNotLike(String value) {
            addCriterion("CPJP not like", value, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpIn(List<String> values) {
            addCriterion("CPJP in", values, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpNotIn(List<String> values) {
            addCriterion("CPJP not in", values, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpBetween(String value1, String value2) {
            addCriterion("CPJP between", value1, value2, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpjpNotBetween(String value1, String value2) {
            addCriterion("CPJP not between", value1, value2, "cpjp");
            return (Criteria) this;
        }

        public Criteria andCpflIsNull() {
            addCriterion("CPFL is null");
            return (Criteria) this;
        }

        public Criteria andCpflIsNotNull() {
            addCriterion("CPFL is not null");
            return (Criteria) this;
        }

        public Criteria andCpflEqualTo(Long value) {
            addCriterion("CPFL =", value, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflNotEqualTo(Long value) {
            addCriterion("CPFL <>", value, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflGreaterThan(Long value) {
            addCriterion("CPFL >", value, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflGreaterThanOrEqualTo(Long value) {
            addCriterion("CPFL >=", value, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflLessThan(Long value) {
            addCriterion("CPFL <", value, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflLessThanOrEqualTo(Long value) {
            addCriterion("CPFL <=", value, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflIn(List<Long> values) {
            addCriterion("CPFL in", values, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflNotIn(List<Long> values) {
            addCriterion("CPFL not in", values, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflBetween(Long value1, Long value2) {
            addCriterion("CPFL between", value1, value2, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpflNotBetween(Long value1, Long value2) {
            addCriterion("CPFL not between", value1, value2, "cpfl");
            return (Criteria) this;
        }

        public Criteria andCpmcIsNull() {
            addCriterion("CPMC is null");
            return (Criteria) this;
        }

        public Criteria andCpmcIsNotNull() {
            addCriterion("CPMC is not null");
            return (Criteria) this;
        }

        public Criteria andCpmcEqualTo(String value) {
            addCriterion("CPMC =", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotEqualTo(String value) {
            addCriterion("CPMC <>", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcGreaterThan(String value) {
            addCriterion("CPMC >", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcGreaterThanOrEqualTo(String value) {
            addCriterion("CPMC >=", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcLessThan(String value) {
            addCriterion("CPMC <", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcLessThanOrEqualTo(String value) {
            addCriterion("CPMC <=", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcLike(String value) {
            addCriterion("CPMC like", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotLike(String value) {
            addCriterion("CPMC not like", value, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcIn(List<String> values) {
            addCriterion("CPMC in", values, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotIn(List<String> values) {
            addCriterion("CPMC not in", values, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcBetween(String value1, String value2) {
            addCriterion("CPMC between", value1, value2, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpmcNotBetween(String value1, String value2) {
            addCriterion("CPMC not between", value1, value2, "cpmc");
            return (Criteria) this;
        }

        public Criteria andCpqcIsNull() {
            addCriterion("CPQC is null");
            return (Criteria) this;
        }

        public Criteria andCpqcIsNotNull() {
            addCriterion("CPQC is not null");
            return (Criteria) this;
        }

        public Criteria andCpqcEqualTo(String value) {
            addCriterion("CPQC =", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcNotEqualTo(String value) {
            addCriterion("CPQC <>", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcGreaterThan(String value) {
            addCriterion("CPQC >", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcGreaterThanOrEqualTo(String value) {
            addCriterion("CPQC >=", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcLessThan(String value) {
            addCriterion("CPQC <", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcLessThanOrEqualTo(String value) {
            addCriterion("CPQC <=", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcLike(String value) {
            addCriterion("CPQC like", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcNotLike(String value) {
            addCriterion("CPQC not like", value, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcIn(List<String> values) {
            addCriterion("CPQC in", values, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcNotIn(List<String> values) {
            addCriterion("CPQC not in", values, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcBetween(String value1, String value2) {
            addCriterion("CPQC between", value1, value2, "cpqc");
            return (Criteria) this;
        }

        public Criteria andCpqcNotBetween(String value1, String value2) {
            addCriterion("CPQC not between", value1, value2, "cpqc");
            return (Criteria) this;
        }

        public Criteria andSylxIsNull() {
            addCriterion("SYLX is null");
            return (Criteria) this;
        }

        public Criteria andSylxIsNotNull() {
            addCriterion("SYLX is not null");
            return (Criteria) this;
        }

        public Criteria andSylxEqualTo(Long value) {
            addCriterion("SYLX =", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotEqualTo(Long value) {
            addCriterion("SYLX <>", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxGreaterThan(Long value) {
            addCriterion("SYLX >", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxGreaterThanOrEqualTo(Long value) {
            addCriterion("SYLX >=", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLessThan(Long value) {
            addCriterion("SYLX <", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxLessThanOrEqualTo(Long value) {
            addCriterion("SYLX <=", value, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxIn(List<Long> values) {
            addCriterion("SYLX in", values, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotIn(List<Long> values) {
            addCriterion("SYLX not in", values, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxBetween(Long value1, Long value2) {
            addCriterion("SYLX between", value1, value2, "sylx");
            return (Criteria) this;
        }

        public Criteria andSylxNotBetween(Long value1, Long value2) {
            addCriterion("SYLX not between", value1, value2, "sylx");
            return (Criteria) this;
        }

        public Criteria andCplxIsNull() {
            addCriterion("CPLX is null");
            return (Criteria) this;
        }

        public Criteria andCplxIsNotNull() {
            addCriterion("CPLX is not null");
            return (Criteria) this;
        }

        public Criteria andCplxEqualTo(Long value) {
            addCriterion("CPLX =", value, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxNotEqualTo(Long value) {
            addCriterion("CPLX <>", value, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxGreaterThan(Long value) {
            addCriterion("CPLX >", value, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxGreaterThanOrEqualTo(Long value) {
            addCriterion("CPLX >=", value, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxLessThan(Long value) {
            addCriterion("CPLX <", value, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxLessThanOrEqualTo(Long value) {
            addCriterion("CPLX <=", value, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxIn(List<Long> values) {
            addCriterion("CPLX in", values, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxNotIn(List<Long> values) {
            addCriterion("CPLX not in", values, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxBetween(Long value1, Long value2) {
            addCriterion("CPLX between", value1, value2, "cplx");
            return (Criteria) this;
        }

        public Criteria andCplxNotBetween(Long value1, Long value2) {
            addCriterion("CPLX not between", value1, value2, "cplx");
            return (Criteria) this;
        }

        public Criteria andFxpjIsNull() {
            addCriterion("FXPJ is null");
            return (Criteria) this;
        }

        public Criteria andFxpjIsNotNull() {
            addCriterion("FXPJ is not null");
            return (Criteria) this;
        }

        public Criteria andFxpjEqualTo(Long value) {
            addCriterion("FXPJ =", value, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjNotEqualTo(Long value) {
            addCriterion("FXPJ <>", value, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjGreaterThan(Long value) {
            addCriterion("FXPJ >", value, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjGreaterThanOrEqualTo(Long value) {
            addCriterion("FXPJ >=", value, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjLessThan(Long value) {
            addCriterion("FXPJ <", value, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjLessThanOrEqualTo(Long value) {
            addCriterion("FXPJ <=", value, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjIn(List<Long> values) {
            addCriterion("FXPJ in", values, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjNotIn(List<Long> values) {
            addCriterion("FXPJ not in", values, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjBetween(Long value1, Long value2) {
            addCriterion("FXPJ between", value1, value2, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxpjNotBetween(Long value1, Long value2) {
            addCriterion("FXPJ not between", value1, value2, "fxpj");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfIsNull() {
            addCriterion("FXJB_FXF is null");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfIsNotNull() {
            addCriterion("FXJB_FXF is not null");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfEqualTo(Long value) {
            addCriterion("FXJB_FXF =", value, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfNotEqualTo(Long value) {
            addCriterion("FXJB_FXF <>", value, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfGreaterThan(Long value) {
            addCriterion("FXJB_FXF >", value, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfGreaterThanOrEqualTo(Long value) {
            addCriterion("FXJB_FXF >=", value, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfLessThan(Long value) {
            addCriterion("FXJB_FXF <", value, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfLessThanOrEqualTo(Long value) {
            addCriterion("FXJB_FXF <=", value, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfIn(List<Long> values) {
            addCriterion("FXJB_FXF in", values, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfNotIn(List<Long> values) {
            addCriterion("FXJB_FXF not in", values, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfBetween(Long value1, Long value2) {
            addCriterion("FXJB_FXF between", value1, value2, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andFxjbFxfNotBetween(Long value1, Long value2) {
            addCriterion("FXJB_FXF not between", value1, value2, "fxjbFxf");
            return (Criteria) this;
        }

        public Criteria andTzqxIsNull() {
            addCriterion("TZQX is null");
            return (Criteria) this;
        }

        public Criteria andTzqxIsNotNull() {
            addCriterion("TZQX is not null");
            return (Criteria) this;
        }

        public Criteria andTzqxEqualTo(Short value) {
            addCriterion("TZQX =", value, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxNotEqualTo(Short value) {
            addCriterion("TZQX <>", value, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxGreaterThan(Short value) {
            addCriterion("TZQX >", value, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxGreaterThanOrEqualTo(Short value) {
            addCriterion("TZQX >=", value, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxLessThan(Short value) {
            addCriterion("TZQX <", value, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxLessThanOrEqualTo(Short value) {
            addCriterion("TZQX <=", value, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxIn(List<Short> values) {
            addCriterion("TZQX in", values, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxNotIn(List<Short> values) {
            addCriterion("TZQX not in", values, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxBetween(Short value1, Short value2) {
            addCriterion("TZQX between", value1, value2, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzqxNotBetween(Short value1, Short value2) {
            addCriterion("TZQX not between", value1, value2, "tzqx");
            return (Criteria) this;
        }

        public Criteria andTzpzIsNull() {
            addCriterion("TZPZ is null");
            return (Criteria) this;
        }

        public Criteria andTzpzIsNotNull() {
            addCriterion("TZPZ is not null");
            return (Criteria) this;
        }

        public Criteria andTzpzEqualTo(Long value) {
            addCriterion("TZPZ =", value, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzNotEqualTo(Long value) {
            addCriterion("TZPZ <>", value, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzGreaterThan(Long value) {
            addCriterion("TZPZ >", value, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzGreaterThanOrEqualTo(Long value) {
            addCriterion("TZPZ >=", value, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzLessThan(Long value) {
            addCriterion("TZPZ <", value, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzLessThanOrEqualTo(Long value) {
            addCriterion("TZPZ <=", value, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzIn(List<Long> values) {
            addCriterion("TZPZ in", values, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzNotIn(List<Long> values) {
            addCriterion("TZPZ not in", values, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzBetween(Long value1, Long value2) {
            addCriterion("TZPZ between", value1, value2, "tzpz");
            return (Criteria) this;
        }

        public Criteria andTzpzNotBetween(Long value1, Long value2) {
            addCriterion("TZPZ not between", value1, value2, "tzpz");
            return (Criteria) this;
        }

        public Criteria andCppjIsNull() {
            addCriterion("CPPJ is null");
            return (Criteria) this;
        }

        public Criteria andCppjIsNotNull() {
            addCriterion("CPPJ is not null");
            return (Criteria) this;
        }

        public Criteria andCppjEqualTo(Short value) {
            addCriterion("CPPJ =", value, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjNotEqualTo(Short value) {
            addCriterion("CPPJ <>", value, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjGreaterThan(Short value) {
            addCriterion("CPPJ >", value, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjGreaterThanOrEqualTo(Short value) {
            addCriterion("CPPJ >=", value, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjLessThan(Short value) {
            addCriterion("CPPJ <", value, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjLessThanOrEqualTo(Short value) {
            addCriterion("CPPJ <=", value, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjIn(List<Short> values) {
            addCriterion("CPPJ in", values, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjNotIn(List<Short> values) {
            addCriterion("CPPJ not in", values, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjBetween(Short value1, Short value2) {
            addCriterion("CPPJ between", value1, value2, "cppj");
            return (Criteria) this;
        }

        public Criteria andCppjNotBetween(Short value1, Short value2) {
            addCriterion("CPPJ not between", value1, value2, "cppj");
            return (Criteria) this;
        }

        public Criteria andJysIsNull() {
            addCriterion("JYS is null");
            return (Criteria) this;
        }

        public Criteria andJysIsNotNull() {
            addCriterion("JYS is not null");
            return (Criteria) this;
        }

        public Criteria andJysEqualTo(Long value) {
            addCriterion("JYS =", value, "jys");
            return (Criteria) this;
        }

        public Criteria andJysNotEqualTo(Long value) {
            addCriterion("JYS <>", value, "jys");
            return (Criteria) this;
        }

        public Criteria andJysGreaterThan(Long value) {
            addCriterion("JYS >", value, "jys");
            return (Criteria) this;
        }

        public Criteria andJysGreaterThanOrEqualTo(Long value) {
            addCriterion("JYS >=", value, "jys");
            return (Criteria) this;
        }

        public Criteria andJysLessThan(Long value) {
            addCriterion("JYS <", value, "jys");
            return (Criteria) this;
        }

        public Criteria andJysLessThanOrEqualTo(Long value) {
            addCriterion("JYS <=", value, "jys");
            return (Criteria) this;
        }

        public Criteria andJysIn(List<Long> values) {
            addCriterion("JYS in", values, "jys");
            return (Criteria) this;
        }

        public Criteria andJysNotIn(List<Long> values) {
            addCriterion("JYS not in", values, "jys");
            return (Criteria) this;
        }

        public Criteria andJysBetween(Long value1, Long value2) {
            addCriterion("JYS between", value1, value2, "jys");
            return (Criteria) this;
        }

        public Criteria andJysNotBetween(Long value1, Long value2) {
            addCriterion("JYS not between", value1, value2, "jys");
            return (Criteria) this;
        }

        public Criteria andFxjgIsNull() {
            addCriterion("FXJG is null");
            return (Criteria) this;
        }

        public Criteria andFxjgIsNotNull() {
            addCriterion("FXJG is not null");
            return (Criteria) this;
        }

        public Criteria andFxjgEqualTo(Long value) {
            addCriterion("FXJG =", value, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgNotEqualTo(Long value) {
            addCriterion("FXJG <>", value, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgGreaterThan(Long value) {
            addCriterion("FXJG >", value, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgGreaterThanOrEqualTo(Long value) {
            addCriterion("FXJG >=", value, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgLessThan(Long value) {
            addCriterion("FXJG <", value, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgLessThanOrEqualTo(Long value) {
            addCriterion("FXJG <=", value, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgIn(List<Long> values) {
            addCriterion("FXJG in", values, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgNotIn(List<Long> values) {
            addCriterion("FXJG not in", values, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgBetween(Long value1, Long value2) {
            addCriterion("FXJG between", value1, value2, "fxjg");
            return (Criteria) this;
        }

        public Criteria andFxjgNotBetween(Long value1, Long value2) {
            addCriterion("FXJG not between", value1, value2, "fxjg");
            return (Criteria) this;
        }

        public Criteria andJgdmIsNull() {
            addCriterion("JGDM is null");
            return (Criteria) this;
        }

        public Criteria andJgdmIsNotNull() {
            addCriterion("JGDM is not null");
            return (Criteria) this;
        }

        public Criteria andJgdmEqualTo(String value) {
            addCriterion("JGDM =", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotEqualTo(String value) {
            addCriterion("JGDM <>", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmGreaterThan(String value) {
            addCriterion("JGDM >", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmGreaterThanOrEqualTo(String value) {
            addCriterion("JGDM >=", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmLessThan(String value) {
            addCriterion("JGDM <", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmLessThanOrEqualTo(String value) {
            addCriterion("JGDM <=", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmLike(String value) {
            addCriterion("JGDM like", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotLike(String value) {
            addCriterion("JGDM not like", value, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmIn(List<String> values) {
            addCriterion("JGDM in", values, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotIn(List<String> values) {
            addCriterion("JGDM not in", values, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmBetween(String value1, String value2) {
            addCriterion("JGDM between", value1, value2, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJgdmNotBetween(String value1, String value2) {
            addCriterion("JGDM not between", value1, value2, "jgdm");
            return (Criteria) this;
        }

        public Criteria andJglbIsNull() {
            addCriterion("JGLB is null");
            return (Criteria) this;
        }

        public Criteria andJglbIsNotNull() {
            addCriterion("JGLB is not null");
            return (Criteria) this;
        }

        public Criteria andJglbEqualTo(Long value) {
            addCriterion("JGLB =", value, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbNotEqualTo(Long value) {
            addCriterion("JGLB <>", value, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbGreaterThan(Long value) {
            addCriterion("JGLB >", value, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbGreaterThanOrEqualTo(Long value) {
            addCriterion("JGLB >=", value, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbLessThan(Long value) {
            addCriterion("JGLB <", value, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbLessThanOrEqualTo(Long value) {
            addCriterion("JGLB <=", value, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbIn(List<Long> values) {
            addCriterion("JGLB in", values, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbNotIn(List<Long> values) {
            addCriterion("JGLB not in", values, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbBetween(Long value1, Long value2) {
            addCriterion("JGLB between", value1, value2, "jglb");
            return (Criteria) this;
        }

        public Criteria andJglbNotBetween(Long value1, Long value2) {
            addCriterion("JGLB not between", value1, value2, "jglb");
            return (Criteria) this;
        }

        public Criteria andJgmcIsNull() {
            addCriterion("JGMC is null");
            return (Criteria) this;
        }

        public Criteria andJgmcIsNotNull() {
            addCriterion("JGMC is not null");
            return (Criteria) this;
        }

        public Criteria andJgmcEqualTo(String value) {
            addCriterion("JGMC =", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotEqualTo(String value) {
            addCriterion("JGMC <>", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcGreaterThan(String value) {
            addCriterion("JGMC >", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcGreaterThanOrEqualTo(String value) {
            addCriterion("JGMC >=", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLessThan(String value) {
            addCriterion("JGMC <", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLessThanOrEqualTo(String value) {
            addCriterion("JGMC <=", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcLike(String value) {
            addCriterion("JGMC like", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotLike(String value) {
            addCriterion("JGMC not like", value, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcIn(List<String> values) {
            addCriterion("JGMC in", values, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotIn(List<String> values) {
            addCriterion("JGMC not in", values, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcBetween(String value1, String value2) {
            addCriterion("JGMC between", value1, value2, "jgmc");
            return (Criteria) this;
        }

        public Criteria andJgmcNotBetween(String value1, String value2) {
            addCriterion("JGMC not between", value1, value2, "jgmc");
            return (Criteria) this;
        }

        public Criteria andZlxsIsNull() {
            addCriterion("ZLXS is null");
            return (Criteria) this;
        }

        public Criteria andZlxsIsNotNull() {
            addCriterion("ZLXS is not null");
            return (Criteria) this;
        }

        public Criteria andZlxsEqualTo(Long value) {
            addCriterion("ZLXS =", value, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsNotEqualTo(Long value) {
            addCriterion("ZLXS <>", value, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsGreaterThan(Long value) {
            addCriterion("ZLXS >", value, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsGreaterThanOrEqualTo(Long value) {
            addCriterion("ZLXS >=", value, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsLessThan(Long value) {
            addCriterion("ZLXS <", value, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsLessThanOrEqualTo(Long value) {
            addCriterion("ZLXS <=", value, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsIn(List<Long> values) {
            addCriterion("ZLXS in", values, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsNotIn(List<Long> values) {
            addCriterion("ZLXS not in", values, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsBetween(Long value1, Long value2) {
            addCriterion("ZLXS between", value1, value2, "zlxs");
            return (Criteria) this;
        }

        public Criteria andZlxsNotBetween(Long value1, Long value2) {
            addCriterion("ZLXS not between", value1, value2, "zlxs");
            return (Criteria) this;
        }

        public Criteria andSfrxIsNull() {
            addCriterion("SFRX is null");
            return (Criteria) this;
        }

        public Criteria andSfrxIsNotNull() {
            addCriterion("SFRX is not null");
            return (Criteria) this;
        }

        public Criteria andSfrxEqualTo(Long value) {
            addCriterion("SFRX =", value, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxNotEqualTo(Long value) {
            addCriterion("SFRX <>", value, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxGreaterThan(Long value) {
            addCriterion("SFRX >", value, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxGreaterThanOrEqualTo(Long value) {
            addCriterion("SFRX >=", value, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxLessThan(Long value) {
            addCriterion("SFRX <", value, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxLessThanOrEqualTo(Long value) {
            addCriterion("SFRX <=", value, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxIn(List<Long> values) {
            addCriterion("SFRX in", values, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxNotIn(List<Long> values) {
            addCriterion("SFRX not in", values, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxBetween(Long value1, Long value2) {
            addCriterion("SFRX between", value1, value2, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfrxNotBetween(Long value1, Long value2) {
            addCriterion("SFRX not between", value1, value2, "sfrx");
            return (Criteria) this;
        }

        public Criteria andSfxcpIsNull() {
            addCriterion("SFXCP is null");
            return (Criteria) this;
        }

        public Criteria andSfxcpIsNotNull() {
            addCriterion("SFXCP is not null");
            return (Criteria) this;
        }

        public Criteria andSfxcpEqualTo(Long value) {
            addCriterion("SFXCP =", value, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpNotEqualTo(Long value) {
            addCriterion("SFXCP <>", value, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpGreaterThan(Long value) {
            addCriterion("SFXCP >", value, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpGreaterThanOrEqualTo(Long value) {
            addCriterion("SFXCP >=", value, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpLessThan(Long value) {
            addCriterion("SFXCP <", value, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpLessThanOrEqualTo(Long value) {
            addCriterion("SFXCP <=", value, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpIn(List<Long> values) {
            addCriterion("SFXCP in", values, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpNotIn(List<Long> values) {
            addCriterion("SFXCP not in", values, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpBetween(Long value1, Long value2) {
            addCriterion("SFXCP between", value1, value2, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andSfxcpNotBetween(Long value1, Long value2) {
            addCriterion("SFXCP not between", value1, value2, "sfxcp");
            return (Criteria) this;
        }

        public Criteria andCxgxIsNull() {
            addCriterion("CXGX is null");
            return (Criteria) this;
        }

        public Criteria andCxgxIsNotNull() {
            addCriterion("CXGX is not null");
            return (Criteria) this;
        }

        public Criteria andCxgxEqualTo(Long value) {
            addCriterion("CXGX =", value, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxNotEqualTo(Long value) {
            addCriterion("CXGX <>", value, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxGreaterThan(Long value) {
            addCriterion("CXGX >", value, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxGreaterThanOrEqualTo(Long value) {
            addCriterion("CXGX >=", value, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxLessThan(Long value) {
            addCriterion("CXGX <", value, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxLessThanOrEqualTo(Long value) {
            addCriterion("CXGX <=", value, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxIn(List<Long> values) {
            addCriterion("CXGX in", values, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxNotIn(List<Long> values) {
            addCriterion("CXGX not in", values, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxBetween(Long value1, Long value2) {
            addCriterion("CXGX between", value1, value2, "cxgx");
            return (Criteria) this;
        }

        public Criteria andCxgxNotBetween(Long value1, Long value2) {
            addCriterion("CXGX not between", value1, value2, "cxgx");
            return (Criteria) this;
        }

        public Criteria andZycdIsNull() {
            addCriterion("ZYCD is null");
            return (Criteria) this;
        }

        public Criteria andZycdIsNotNull() {
            addCriterion("ZYCD is not null");
            return (Criteria) this;
        }

        public Criteria andZycdEqualTo(Long value) {
            addCriterion("ZYCD =", value, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdNotEqualTo(Long value) {
            addCriterion("ZYCD <>", value, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdGreaterThan(Long value) {
            addCriterion("ZYCD >", value, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdGreaterThanOrEqualTo(Long value) {
            addCriterion("ZYCD >=", value, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdLessThan(Long value) {
            addCriterion("ZYCD <", value, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdLessThanOrEqualTo(Long value) {
            addCriterion("ZYCD <=", value, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdIn(List<Long> values) {
            addCriterion("ZYCD in", values, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdNotIn(List<Long> values) {
            addCriterion("ZYCD not in", values, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdBetween(Long value1, Long value2) {
            addCriterion("ZYCD between", value1, value2, "zycd");
            return (Criteria) this;
        }

        public Criteria andZycdNotBetween(Long value1, Long value2) {
            addCriterion("ZYCD not between", value1, value2, "zycd");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(Long value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(Long value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(Long value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(Long value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(Long value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(Long value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<Long> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<Long> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(Long value1, Long value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(Long value1, Long value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andCpztIsNull() {
            addCriterion("CPZT is null");
            return (Criteria) this;
        }

        public Criteria andCpztIsNotNull() {
            addCriterion("CPZT is not null");
            return (Criteria) this;
        }

        public Criteria andCpztEqualTo(Long value) {
            addCriterion("CPZT =", value, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztNotEqualTo(Long value) {
            addCriterion("CPZT <>", value, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztGreaterThan(Long value) {
            addCriterion("CPZT >", value, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztGreaterThanOrEqualTo(Long value) {
            addCriterion("CPZT >=", value, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztLessThan(Long value) {
            addCriterion("CPZT <", value, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztLessThanOrEqualTo(Long value) {
            addCriterion("CPZT <=", value, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztIn(List<Long> values) {
            addCriterion("CPZT in", values, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztNotIn(List<Long> values) {
            addCriterion("CPZT not in", values, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztBetween(Long value1, Long value2) {
            addCriterion("CPZT between", value1, value2, "cpzt");
            return (Criteria) this;
        }

        public Criteria andCpztNotBetween(Long value1, Long value2) {
            addCriterion("CPZT not between", value1, value2, "cpzt");
            return (Criteria) this;
        }

        public Criteria andSjbzIsNull() {
            addCriterion("SJBZ is null");
            return (Criteria) this;
        }

        public Criteria andSjbzIsNotNull() {
            addCriterion("SJBZ is not null");
            return (Criteria) this;
        }

        public Criteria andSjbzEqualTo(Long value) {
            addCriterion("SJBZ =", value, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzNotEqualTo(Long value) {
            addCriterion("SJBZ <>", value, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzGreaterThan(Long value) {
            addCriterion("SJBZ >", value, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzGreaterThanOrEqualTo(Long value) {
            addCriterion("SJBZ >=", value, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzLessThan(Long value) {
            addCriterion("SJBZ <", value, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzLessThanOrEqualTo(Long value) {
            addCriterion("SJBZ <=", value, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzIn(List<Long> values) {
            addCriterion("SJBZ in", values, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzNotIn(List<Long> values) {
            addCriterion("SJBZ not in", values, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzBetween(Long value1, Long value2) {
            addCriterion("SJBZ between", value1, value2, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjbzNotBetween(Long value1, Long value2) {
            addCriterion("SJBZ not between", value1, value2, "sjbz");
            return (Criteria) this;
        }

        public Criteria andSjrqIsNull() {
            addCriterion("SJRQ is null");
            return (Criteria) this;
        }

        public Criteria andSjrqIsNotNull() {
            addCriterion("SJRQ is not null");
            return (Criteria) this;
        }

        public Criteria andSjrqEqualTo(Integer value) {
            addCriterion("SJRQ =", value, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqNotEqualTo(Integer value) {
            addCriterion("SJRQ <>", value, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqGreaterThan(Integer value) {
            addCriterion("SJRQ >", value, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("SJRQ >=", value, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqLessThan(Integer value) {
            addCriterion("SJRQ <", value, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqLessThanOrEqualTo(Integer value) {
            addCriterion("SJRQ <=", value, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqIn(List<Integer> values) {
            addCriterion("SJRQ in", values, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqNotIn(List<Integer> values) {
            addCriterion("SJRQ not in", values, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqBetween(Integer value1, Integer value2) {
            addCriterion("SJRQ between", value1, value2, "sjrq");
            return (Criteria) this;
        }

        public Criteria andSjrqNotBetween(Integer value1, Integer value2) {
            addCriterion("SJRQ not between", value1, value2, "sjrq");
            return (Criteria) this;
        }

        public Criteria andCpjzIsNull() {
            addCriterion("CPJZ is null");
            return (Criteria) this;
        }

        public Criteria andCpjzIsNotNull() {
            addCriterion("CPJZ is not null");
            return (Criteria) this;
        }

        public Criteria andCpjzEqualTo(BigDecimal value) {
            addCriterion("CPJZ =", value, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzNotEqualTo(BigDecimal value) {
            addCriterion("CPJZ <>", value, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzGreaterThan(BigDecimal value) {
            addCriterion("CPJZ >", value, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CPJZ >=", value, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzLessThan(BigDecimal value) {
            addCriterion("CPJZ <", value, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CPJZ <=", value, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzIn(List<BigDecimal> values) {
            addCriterion("CPJZ in", values, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzNotIn(List<BigDecimal> values) {
            addCriterion("CPJZ not in", values, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPJZ between", value1, value2, "cpjz");
            return (Criteria) this;
        }

        public Criteria andCpjzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPJZ not between", value1, value2, "cpjz");
            return (Criteria) this;
        }

        public Criteria andLjjzIsNull() {
            addCriterion("LJJZ is null");
            return (Criteria) this;
        }

        public Criteria andLjjzIsNotNull() {
            addCriterion("LJJZ is not null");
            return (Criteria) this;
        }

        public Criteria andLjjzEqualTo(BigDecimal value) {
            addCriterion("LJJZ =", value, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzNotEqualTo(BigDecimal value) {
            addCriterion("LJJZ <>", value, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzGreaterThan(BigDecimal value) {
            addCriterion("LJJZ >", value, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LJJZ >=", value, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzLessThan(BigDecimal value) {
            addCriterion("LJJZ <", value, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LJJZ <=", value, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzIn(List<BigDecimal> values) {
            addCriterion("LJJZ in", values, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzNotIn(List<BigDecimal> values) {
            addCriterion("LJJZ not in", values, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LJJZ between", value1, value2, "ljjz");
            return (Criteria) this;
        }

        public Criteria andLjjzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LJJZ not between", value1, value2, "ljjz");
            return (Criteria) this;
        }

        public Criteria andZspIsNull() {
            addCriterion("ZSP is null");
            return (Criteria) this;
        }

        public Criteria andZspIsNotNull() {
            addCriterion("ZSP is not null");
            return (Criteria) this;
        }

        public Criteria andZspEqualTo(BigDecimal value) {
            addCriterion("ZSP =", value, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspNotEqualTo(BigDecimal value) {
            addCriterion("ZSP <>", value, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspGreaterThan(BigDecimal value) {
            addCriterion("ZSP >", value, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZSP >=", value, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspLessThan(BigDecimal value) {
            addCriterion("ZSP <", value, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZSP <=", value, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspIn(List<BigDecimal> values) {
            addCriterion("ZSP in", values, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspNotIn(List<BigDecimal> values) {
            addCriterion("ZSP not in", values, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZSP between", value1, value2, "zsp");
            return (Criteria) this;
        }

        public Criteria andZspNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZSP not between", value1, value2, "zsp");
            return (Criteria) this;
        }

        public Criteria andZxjIsNull() {
            addCriterion("ZXJ is null");
            return (Criteria) this;
        }

        public Criteria andZxjIsNotNull() {
            addCriterion("ZXJ is not null");
            return (Criteria) this;
        }

        public Criteria andZxjEqualTo(BigDecimal value) {
            addCriterion("ZXJ =", value, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjNotEqualTo(BigDecimal value) {
            addCriterion("ZXJ <>", value, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjGreaterThan(BigDecimal value) {
            addCriterion("ZXJ >", value, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZXJ >=", value, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjLessThan(BigDecimal value) {
            addCriterion("ZXJ <", value, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZXJ <=", value, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjIn(List<BigDecimal> values) {
            addCriterion("ZXJ in", values, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjNotIn(List<BigDecimal> values) {
            addCriterion("ZXJ not in", values, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZXJ between", value1, value2, "zxj");
            return (Criteria) this;
        }

        public Criteria andZxjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZXJ not between", value1, value2, "zxj");
            return (Criteria) this;
        }

        public Criteria andClrqIsNull() {
            addCriterion("CLRQ is null");
            return (Criteria) this;
        }

        public Criteria andClrqIsNotNull() {
            addCriterion("CLRQ is not null");
            return (Criteria) this;
        }

        public Criteria andClrqEqualTo(Integer value) {
            addCriterion("CLRQ =", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotEqualTo(Integer value) {
            addCriterion("CLRQ <>", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThan(Integer value) {
            addCriterion("CLRQ >", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLRQ >=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThan(Integer value) {
            addCriterion("CLRQ <", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqLessThanOrEqualTo(Integer value) {
            addCriterion("CLRQ <=", value, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqIn(List<Integer> values) {
            addCriterion("CLRQ in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotIn(List<Integer> values) {
            addCriterion("CLRQ not in", values, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqBetween(Integer value1, Integer value2) {
            addCriterion("CLRQ between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andClrqNotBetween(Integer value1, Integer value2) {
            addCriterion("CLRQ not between", value1, value2, "clrq");
            return (Criteria) this;
        }

        public Criteria andDqrqIsNull() {
            addCriterion("DQRQ is null");
            return (Criteria) this;
        }

        public Criteria andDqrqIsNotNull() {
            addCriterion("DQRQ is not null");
            return (Criteria) this;
        }

        public Criteria andDqrqEqualTo(Integer value) {
            addCriterion("DQRQ =", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotEqualTo(Integer value) {
            addCriterion("DQRQ <>", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqGreaterThan(Integer value) {
            addCriterion("DQRQ >", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("DQRQ >=", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqLessThan(Integer value) {
            addCriterion("DQRQ <", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqLessThanOrEqualTo(Integer value) {
            addCriterion("DQRQ <=", value, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqIn(List<Integer> values) {
            addCriterion("DQRQ in", values, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotIn(List<Integer> values) {
            addCriterion("DQRQ not in", values, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqBetween(Integer value1, Integer value2) {
            addCriterion("DQRQ between", value1, value2, "dqrq");
            return (Criteria) this;
        }

        public Criteria andDqrqNotBetween(Integer value1, Integer value2) {
            addCriterion("DQRQ not between", value1, value2, "dqrq");
            return (Criteria) this;
        }

        public Criteria andFxgmIsNull() {
            addCriterion("FXGM is null");
            return (Criteria) this;
        }

        public Criteria andFxgmIsNotNull() {
            addCriterion("FXGM is not null");
            return (Criteria) this;
        }

        public Criteria andFxgmEqualTo(Integer value) {
            addCriterion("FXGM =", value, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmNotEqualTo(Integer value) {
            addCriterion("FXGM <>", value, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmGreaterThan(Integer value) {
            addCriterion("FXGM >", value, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmGreaterThanOrEqualTo(Integer value) {
            addCriterion("FXGM >=", value, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmLessThan(Integer value) {
            addCriterion("FXGM <", value, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmLessThanOrEqualTo(Integer value) {
            addCriterion("FXGM <=", value, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmIn(List<Integer> values) {
            addCriterion("FXGM in", values, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmNotIn(List<Integer> values) {
            addCriterion("FXGM not in", values, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmBetween(Integer value1, Integer value2) {
            addCriterion("FXGM between", value1, value2, "fxgm");
            return (Criteria) this;
        }

        public Criteria andFxgmNotBetween(Integer value1, Integer value2) {
            addCriterion("FXGM not between", value1, value2, "fxgm");
            return (Criteria) this;
        }

        public Criteria andCpgmIsNull() {
            addCriterion("CPGM is null");
            return (Criteria) this;
        }

        public Criteria andCpgmIsNotNull() {
            addCriterion("CPGM is not null");
            return (Criteria) this;
        }

        public Criteria andCpgmEqualTo(Integer value) {
            addCriterion("CPGM =", value, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmNotEqualTo(Integer value) {
            addCriterion("CPGM <>", value, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmGreaterThan(Integer value) {
            addCriterion("CPGM >", value, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmGreaterThanOrEqualTo(Integer value) {
            addCriterion("CPGM >=", value, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmLessThan(Integer value) {
            addCriterion("CPGM <", value, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmLessThanOrEqualTo(Integer value) {
            addCriterion("CPGM <=", value, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmIn(List<Integer> values) {
            addCriterion("CPGM in", values, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmNotIn(List<Integer> values) {
            addCriterion("CPGM not in", values, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmBetween(Integer value1, Integer value2) {
            addCriterion("CPGM between", value1, value2, "cpgm");
            return (Criteria) this;
        }

        public Criteria andCpgmNotBetween(Integer value1, Integer value2) {
            addCriterion("CPGM not between", value1, value2, "cpgm");
            return (Criteria) this;
        }

        public Criteria andYqsylIsNull() {
            addCriterion("YQSYL is null");
            return (Criteria) this;
        }

        public Criteria andYqsylIsNotNull() {
            addCriterion("YQSYL is not null");
            return (Criteria) this;
        }

        public Criteria andYqsylEqualTo(BigDecimal value) {
            addCriterion("YQSYL =", value, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylNotEqualTo(BigDecimal value) {
            addCriterion("YQSYL <>", value, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylGreaterThan(BigDecimal value) {
            addCriterion("YQSYL >", value, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YQSYL >=", value, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylLessThan(BigDecimal value) {
            addCriterion("YQSYL <", value, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YQSYL <=", value, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylIn(List<BigDecimal> values) {
            addCriterion("YQSYL in", values, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylNotIn(List<BigDecimal> values) {
            addCriterion("YQSYL not in", values, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YQSYL between", value1, value2, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andYqsylNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YQSYL not between", value1, value2, "yqsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylIsNull() {
            addCriterion("SJSYL is null");
            return (Criteria) this;
        }

        public Criteria andSjsylIsNotNull() {
            addCriterion("SJSYL is not null");
            return (Criteria) this;
        }

        public Criteria andSjsylEqualTo(BigDecimal value) {
            addCriterion("SJSYL =", value, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylNotEqualTo(BigDecimal value) {
            addCriterion("SJSYL <>", value, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylGreaterThan(BigDecimal value) {
            addCriterion("SJSYL >", value, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SJSYL >=", value, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylLessThan(BigDecimal value) {
            addCriterion("SJSYL <", value, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SJSYL <=", value, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylIn(List<BigDecimal> values) {
            addCriterion("SJSYL in", values, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylNotIn(List<BigDecimal> values) {
            addCriterion("SJSYL not in", values, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJSYL between", value1, value2, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andSjsylNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SJSYL not between", value1, value2, "sjsyl");
            return (Criteria) this;
        }

        public Criteria andTzfgIsNull() {
            addCriterion("TZFG is null");
            return (Criteria) this;
        }

        public Criteria andTzfgIsNotNull() {
            addCriterion("TZFG is not null");
            return (Criteria) this;
        }

        public Criteria andTzfgEqualTo(Long value) {
            addCriterion("TZFG =", value, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgNotEqualTo(Long value) {
            addCriterion("TZFG <>", value, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgGreaterThan(Long value) {
            addCriterion("TZFG >", value, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgGreaterThanOrEqualTo(Long value) {
            addCriterion("TZFG >=", value, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgLessThan(Long value) {
            addCriterion("TZFG <", value, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgLessThanOrEqualTo(Long value) {
            addCriterion("TZFG <=", value, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgIn(List<Long> values) {
            addCriterion("TZFG in", values, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgNotIn(List<Long> values) {
            addCriterion("TZFG not in", values, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgBetween(Long value1, Long value2) {
            addCriterion("TZFG between", value1, value2, "tzfg");
            return (Criteria) this;
        }

        public Criteria andTzfgNotBetween(Long value1, Long value2) {
            addCriterion("TZFG not between", value1, value2, "tzfg");
            return (Criteria) this;
        }

        public Criteria andZjtxIsNull() {
            addCriterion("ZJTX is null");
            return (Criteria) this;
        }

        public Criteria andZjtxIsNotNull() {
            addCriterion("ZJTX is not null");
            return (Criteria) this;
        }

        public Criteria andZjtxEqualTo(Long value) {
            addCriterion("ZJTX =", value, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxNotEqualTo(Long value) {
            addCriterion("ZJTX <>", value, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxGreaterThan(Long value) {
            addCriterion("ZJTX >", value, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxGreaterThanOrEqualTo(Long value) {
            addCriterion("ZJTX >=", value, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxLessThan(Long value) {
            addCriterion("ZJTX <", value, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxLessThanOrEqualTo(Long value) {
            addCriterion("ZJTX <=", value, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxIn(List<Long> values) {
            addCriterion("ZJTX in", values, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxNotIn(List<Long> values) {
            addCriterion("ZJTX not in", values, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxBetween(Long value1, Long value2) {
            addCriterion("ZJTX between", value1, value2, "zjtx");
            return (Criteria) this;
        }

        public Criteria andZjtxNotBetween(Long value1, Long value2) {
            addCriterion("ZJTX not between", value1, value2, "zjtx");
            return (Criteria) this;
        }

        public Criteria andGljgIsNull() {
            addCriterion("GLJG is null");
            return (Criteria) this;
        }

        public Criteria andGljgIsNotNull() {
            addCriterion("GLJG is not null");
            return (Criteria) this;
        }

        public Criteria andGljgEqualTo(Long value) {
            addCriterion("GLJG =", value, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgNotEqualTo(Long value) {
            addCriterion("GLJG <>", value, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgGreaterThan(Long value) {
            addCriterion("GLJG >", value, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgGreaterThanOrEqualTo(Long value) {
            addCriterion("GLJG >=", value, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgLessThan(Long value) {
            addCriterion("GLJG <", value, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgLessThanOrEqualTo(Long value) {
            addCriterion("GLJG <=", value, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgIn(List<Long> values) {
            addCriterion("GLJG in", values, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgNotIn(List<Long> values) {
            addCriterion("GLJG not in", values, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgBetween(Long value1, Long value2) {
            addCriterion("GLJG between", value1, value2, "gljg");
            return (Criteria) this;
        }

        public Criteria andGljgNotBetween(Long value1, Long value2) {
            addCriterion("GLJG not between", value1, value2, "gljg");
            return (Criteria) this;
        }

        public Criteria andJjsIsNull() {
            addCriterion("JJS is null");
            return (Criteria) this;
        }

        public Criteria andJjsIsNotNull() {
            addCriterion("JJS is not null");
            return (Criteria) this;
        }

        public Criteria andJjsEqualTo(Long value) {
            addCriterion("JJS =", value, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsNotEqualTo(Long value) {
            addCriterion("JJS <>", value, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsGreaterThan(Long value) {
            addCriterion("JJS >", value, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsGreaterThanOrEqualTo(Long value) {
            addCriterion("JJS >=", value, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsLessThan(Long value) {
            addCriterion("JJS <", value, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsLessThanOrEqualTo(Long value) {
            addCriterion("JJS <=", value, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsIn(List<Long> values) {
            addCriterion("JJS in", values, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsNotIn(List<Long> values) {
            addCriterion("JJS not in", values, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsBetween(Long value1, Long value2) {
            addCriterion("JJS between", value1, value2, "jjs");
            return (Criteria) this;
        }

        public Criteria andJjsNotBetween(Long value1, Long value2) {
            addCriterion("JJS not between", value1, value2, "jjs");
            return (Criteria) this;
        }

        public Criteria andCpjlIsNull() {
            addCriterion("CPJL is null");
            return (Criteria) this;
        }

        public Criteria andCpjlIsNotNull() {
            addCriterion("CPJL is not null");
            return (Criteria) this;
        }

        public Criteria andCpjlEqualTo(BigDecimal value) {
            addCriterion("CPJL =", value, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlNotEqualTo(BigDecimal value) {
            addCriterion("CPJL <>", value, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlGreaterThan(BigDecimal value) {
            addCriterion("CPJL >", value, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CPJL >=", value, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlLessThan(BigDecimal value) {
            addCriterion("CPJL <", value, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CPJL <=", value, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlIn(List<BigDecimal> values) {
            addCriterion("CPJL in", values, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlNotIn(List<BigDecimal> values) {
            addCriterion("CPJL not in", values, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPJL between", value1, value2, "cpjl");
            return (Criteria) this;
        }

        public Criteria andCpjlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CPJL not between", value1, value2, "cpjl");
            return (Criteria) this;
        }

        public Criteria andJzzsIsNull() {
            addCriterion("JZZS is null");
            return (Criteria) this;
        }

        public Criteria andJzzsIsNotNull() {
            addCriterion("JZZS is not null");
            return (Criteria) this;
        }

        public Criteria andJzzsEqualTo(BigDecimal value) {
            addCriterion("JZZS =", value, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsNotEqualTo(BigDecimal value) {
            addCriterion("JZZS <>", value, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsGreaterThan(BigDecimal value) {
            addCriterion("JZZS >", value, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZZS >=", value, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsLessThan(BigDecimal value) {
            addCriterion("JZZS <", value, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZZS <=", value, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsIn(List<BigDecimal> values) {
            addCriterion("JZZS in", values, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsNotIn(List<BigDecimal> values) {
            addCriterion("JZZS not in", values, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZZS between", value1, value2, "jzzs");
            return (Criteria) this;
        }

        public Criteria andJzzsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZZS not between", value1, value2, "jzzs");
            return (Criteria) this;
        }

        public Criteria andNtsIsNull() {
            addCriterion("NTS is null");
            return (Criteria) this;
        }

        public Criteria andNtsIsNotNull() {
            addCriterion("NTS is not null");
            return (Criteria) this;
        }

        public Criteria andNtsEqualTo(BigDecimal value) {
            addCriterion("NTS =", value, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsNotEqualTo(BigDecimal value) {
            addCriterion("NTS <>", value, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsGreaterThan(BigDecimal value) {
            addCriterion("NTS >", value, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NTS >=", value, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsLessThan(BigDecimal value) {
            addCriterion("NTS <", value, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NTS <=", value, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsIn(List<BigDecimal> values) {
            addCriterion("NTS in", values, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsNotIn(List<BigDecimal> values) {
            addCriterion("NTS not in", values, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NTS between", value1, value2, "nts");
            return (Criteria) this;
        }

        public Criteria andNtsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NTS not between", value1, value2, "nts");
            return (Criteria) this;
        }

        public Criteria andJzrqIsNull() {
            addCriterion("JZRQ is null");
            return (Criteria) this;
        }

        public Criteria andJzrqIsNotNull() {
            addCriterion("JZRQ is not null");
            return (Criteria) this;
        }

        public Criteria andJzrqEqualTo(BigDecimal value) {
            addCriterion("JZRQ =", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotEqualTo(BigDecimal value) {
            addCriterion("JZRQ <>", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqGreaterThan(BigDecimal value) {
            addCriterion("JZRQ >", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JZRQ >=", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLessThan(BigDecimal value) {
            addCriterion("JZRQ <", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JZRQ <=", value, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqIn(List<BigDecimal> values) {
            addCriterion("JZRQ in", values, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotIn(List<BigDecimal> values) {
            addCriterion("JZRQ not in", values, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZRQ between", value1, value2, "jzrq");
            return (Criteria) this;
        }

        public Criteria andJzrqNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JZRQ not between", value1, value2, "jzrq");
            return (Criteria) this;
        }

        public Criteria andSfqwfxIsNull() {
            addCriterion("SFQWFX is null");
            return (Criteria) this;
        }

        public Criteria andSfqwfxIsNotNull() {
            addCriterion("SFQWFX is not null");
            return (Criteria) this;
        }

        public Criteria andSfqwfxEqualTo(Long value) {
            addCriterion("SFQWFX =", value, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxNotEqualTo(Long value) {
            addCriterion("SFQWFX <>", value, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxGreaterThan(Long value) {
            addCriterion("SFQWFX >", value, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxGreaterThanOrEqualTo(Long value) {
            addCriterion("SFQWFX >=", value, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxLessThan(Long value) {
            addCriterion("SFQWFX <", value, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxLessThanOrEqualTo(Long value) {
            addCriterion("SFQWFX <=", value, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxIn(List<Long> values) {
            addCriterion("SFQWFX in", values, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxNotIn(List<Long> values) {
            addCriterion("SFQWFX not in", values, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxBetween(Long value1, Long value2) {
            addCriterion("SFQWFX between", value1, value2, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andSfqwfxNotBetween(Long value1, Long value2) {
            addCriterion("SFQWFX not between", value1, value2, "sfqwfx");
            return (Criteria) this;
        }

        public Criteria andFxfwIsNull() {
            addCriterion("FXFW is null");
            return (Criteria) this;
        }

        public Criteria andFxfwIsNotNull() {
            addCriterion("FXFW is not null");
            return (Criteria) this;
        }

        public Criteria andFxfwEqualTo(String value) {
            addCriterion("FXFW =", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwNotEqualTo(String value) {
            addCriterion("FXFW <>", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwGreaterThan(String value) {
            addCriterion("FXFW >", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwGreaterThanOrEqualTo(String value) {
            addCriterion("FXFW >=", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwLessThan(String value) {
            addCriterion("FXFW <", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwLessThanOrEqualTo(String value) {
            addCriterion("FXFW <=", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwLike(String value) {
            addCriterion("FXFW like", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwNotLike(String value) {
            addCriterion("FXFW not like", value, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwIn(List<String> values) {
            addCriterion("FXFW in", values, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwNotIn(List<String> values) {
            addCriterion("FXFW not in", values, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwBetween(String value1, String value2) {
            addCriterion("FXFW between", value1, value2, "fxfw");
            return (Criteria) this;
        }

        public Criteria andFxfwNotBetween(String value1, String value2) {
            addCriterion("FXFW not between", value1, value2, "fxfw");
            return (Criteria) this;
        }

        public Criteria andZffsIsNull() {
            addCriterion("ZFFS is null");
            return (Criteria) this;
        }

        public Criteria andZffsIsNotNull() {
            addCriterion("ZFFS is not null");
            return (Criteria) this;
        }

        public Criteria andZffsEqualTo(BigDecimal value) {
            addCriterion("ZFFS =", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotEqualTo(BigDecimal value) {
            addCriterion("ZFFS <>", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsGreaterThan(BigDecimal value) {
            addCriterion("ZFFS >", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZFFS >=", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsLessThan(BigDecimal value) {
            addCriterion("ZFFS <", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZFFS <=", value, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsIn(List<BigDecimal> values) {
            addCriterion("ZFFS in", values, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotIn(List<BigDecimal> values) {
            addCriterion("ZFFS not in", values, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZFFS between", value1, value2, "zffs");
            return (Criteria) this;
        }

        public Criteria andZffsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZFFS not between", value1, value2, "zffs");
            return (Criteria) this;
        }

        public Criteria andRgqdIsNull() {
            addCriterion("RGQD is null");
            return (Criteria) this;
        }

        public Criteria andRgqdIsNotNull() {
            addCriterion("RGQD is not null");
            return (Criteria) this;
        }

        public Criteria andRgqdEqualTo(Long value) {
            addCriterion("RGQD =", value, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdNotEqualTo(Long value) {
            addCriterion("RGQD <>", value, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdGreaterThan(Long value) {
            addCriterion("RGQD >", value, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdGreaterThanOrEqualTo(Long value) {
            addCriterion("RGQD >=", value, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdLessThan(Long value) {
            addCriterion("RGQD <", value, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdLessThanOrEqualTo(Long value) {
            addCriterion("RGQD <=", value, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdIn(List<Long> values) {
            addCriterion("RGQD in", values, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdNotIn(List<Long> values) {
            addCriterion("RGQD not in", values, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdBetween(Long value1, Long value2) {
            addCriterion("RGQD between", value1, value2, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgqdNotBetween(Long value1, Long value2) {
            addCriterion("RGQD not between", value1, value2, "rgqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdIsNull() {
            addCriterion("RGZJQD is null");
            return (Criteria) this;
        }

        public Criteria andRgzjqdIsNotNull() {
            addCriterion("RGZJQD is not null");
            return (Criteria) this;
        }

        public Criteria andRgzjqdEqualTo(Integer value) {
            addCriterion("RGZJQD =", value, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdNotEqualTo(Integer value) {
            addCriterion("RGZJQD <>", value, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdGreaterThan(Integer value) {
            addCriterion("RGZJQD >", value, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdGreaterThanOrEqualTo(Integer value) {
            addCriterion("RGZJQD >=", value, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdLessThan(Integer value) {
            addCriterion("RGZJQD <", value, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdLessThanOrEqualTo(Integer value) {
            addCriterion("RGZJQD <=", value, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdIn(List<Integer> values) {
            addCriterion("RGZJQD in", values, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdNotIn(List<Integer> values) {
            addCriterion("RGZJQD not in", values, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdBetween(Integer value1, Integer value2) {
            addCriterion("RGZJQD between", value1, value2, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgzjqdNotBetween(Integer value1, Integer value2) {
            addCriterion("RGZJQD not between", value1, value2, "rgzjqd");
            return (Criteria) this;
        }

        public Criteria andRgjsIsNull() {
            addCriterion("RGJS is null");
            return (Criteria) this;
        }

        public Criteria andRgjsIsNotNull() {
            addCriterion("RGJS is not null");
            return (Criteria) this;
        }

        public Criteria andRgjsEqualTo(Long value) {
            addCriterion("RGJS =", value, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsNotEqualTo(Long value) {
            addCriterion("RGJS <>", value, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsGreaterThan(Long value) {
            addCriterion("RGJS >", value, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsGreaterThanOrEqualTo(Long value) {
            addCriterion("RGJS >=", value, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsLessThan(Long value) {
            addCriterion("RGJS <", value, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsLessThanOrEqualTo(Long value) {
            addCriterion("RGJS <=", value, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsIn(List<Long> values) {
            addCriterion("RGJS in", values, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsNotIn(List<Long> values) {
            addCriterion("RGJS not in", values, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsBetween(Long value1, Long value2) {
            addCriterion("RGJS between", value1, value2, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgjsNotBetween(Long value1, Long value2) {
            addCriterion("RGJS not between", value1, value2, "rgjs");
            return (Criteria) this;
        }

        public Criteria andRgqdJgIsNull() {
            addCriterion("RGQD_JG is null");
            return (Criteria) this;
        }

        public Criteria andRgqdJgIsNotNull() {
            addCriterion("RGQD_JG is not null");
            return (Criteria) this;
        }

        public Criteria andRgqdJgEqualTo(Long value) {
            addCriterion("RGQD_JG =", value, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgNotEqualTo(Long value) {
            addCriterion("RGQD_JG <>", value, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgGreaterThan(Long value) {
            addCriterion("RGQD_JG >", value, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgGreaterThanOrEqualTo(Long value) {
            addCriterion("RGQD_JG >=", value, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgLessThan(Long value) {
            addCriterion("RGQD_JG <", value, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgLessThanOrEqualTo(Long value) {
            addCriterion("RGQD_JG <=", value, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgIn(List<Long> values) {
            addCriterion("RGQD_JG in", values, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgNotIn(List<Long> values) {
            addCriterion("RGQD_JG not in", values, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgBetween(Long value1, Long value2) {
            addCriterion("RGQD_JG between", value1, value2, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgqdJgNotBetween(Long value1, Long value2) {
            addCriterion("RGQD_JG not between", value1, value2, "rgqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgIsNull() {
            addCriterion("RGZJQD_JG is null");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgIsNotNull() {
            addCriterion("RGZJQD_JG is not null");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgEqualTo(Integer value) {
            addCriterion("RGZJQD_JG =", value, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgNotEqualTo(Integer value) {
            addCriterion("RGZJQD_JG <>", value, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgGreaterThan(Integer value) {
            addCriterion("RGZJQD_JG >", value, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgGreaterThanOrEqualTo(Integer value) {
            addCriterion("RGZJQD_JG >=", value, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgLessThan(Integer value) {
            addCriterion("RGZJQD_JG <", value, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgLessThanOrEqualTo(Integer value) {
            addCriterion("RGZJQD_JG <=", value, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgIn(List<Integer> values) {
            addCriterion("RGZJQD_JG in", values, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgNotIn(List<Integer> values) {
            addCriterion("RGZJQD_JG not in", values, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgBetween(Integer value1, Integer value2) {
            addCriterion("RGZJQD_JG between", value1, value2, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgzjqdJgNotBetween(Integer value1, Integer value2) {
            addCriterion("RGZJQD_JG not between", value1, value2, "rgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgIsNull() {
            addCriterion("RGJS_JG is null");
            return (Criteria) this;
        }

        public Criteria andRgjsJgIsNotNull() {
            addCriterion("RGJS_JG is not null");
            return (Criteria) this;
        }

        public Criteria andRgjsJgEqualTo(Long value) {
            addCriterion("RGJS_JG =", value, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgNotEqualTo(Long value) {
            addCriterion("RGJS_JG <>", value, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgGreaterThan(Long value) {
            addCriterion("RGJS_JG >", value, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgGreaterThanOrEqualTo(Long value) {
            addCriterion("RGJS_JG >=", value, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgLessThan(Long value) {
            addCriterion("RGJS_JG <", value, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgLessThanOrEqualTo(Long value) {
            addCriterion("RGJS_JG <=", value, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgIn(List<Long> values) {
            addCriterion("RGJS_JG in", values, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgNotIn(List<Long> values) {
            addCriterion("RGJS_JG not in", values, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgBetween(Long value1, Long value2) {
            addCriterion("RGJS_JG between", value1, value2, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andRgjsJgNotBetween(Long value1, Long value2) {
            addCriterion("RGJS_JG not between", value1, value2, "rgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgqdIsNull() {
            addCriterion("SGQD is null");
            return (Criteria) this;
        }

        public Criteria andSgqdIsNotNull() {
            addCriterion("SGQD is not null");
            return (Criteria) this;
        }

        public Criteria andSgqdEqualTo(Long value) {
            addCriterion("SGQD =", value, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdNotEqualTo(Long value) {
            addCriterion("SGQD <>", value, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdGreaterThan(Long value) {
            addCriterion("SGQD >", value, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdGreaterThanOrEqualTo(Long value) {
            addCriterion("SGQD >=", value, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdLessThan(Long value) {
            addCriterion("SGQD <", value, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdLessThanOrEqualTo(Long value) {
            addCriterion("SGQD <=", value, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdIn(List<Long> values) {
            addCriterion("SGQD in", values, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdNotIn(List<Long> values) {
            addCriterion("SGQD not in", values, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdBetween(Long value1, Long value2) {
            addCriterion("SGQD between", value1, value2, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgqdNotBetween(Long value1, Long value2) {
            addCriterion("SGQD not between", value1, value2, "sgqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdIsNull() {
            addCriterion("SGZJQD is null");
            return (Criteria) this;
        }

        public Criteria andSgzjqdIsNotNull() {
            addCriterion("SGZJQD is not null");
            return (Criteria) this;
        }

        public Criteria andSgzjqdEqualTo(Integer value) {
            addCriterion("SGZJQD =", value, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdNotEqualTo(Integer value) {
            addCriterion("SGZJQD <>", value, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdGreaterThan(Integer value) {
            addCriterion("SGZJQD >", value, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SGZJQD >=", value, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdLessThan(Integer value) {
            addCriterion("SGZJQD <", value, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdLessThanOrEqualTo(Integer value) {
            addCriterion("SGZJQD <=", value, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdIn(List<Integer> values) {
            addCriterion("SGZJQD in", values, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdNotIn(List<Integer> values) {
            addCriterion("SGZJQD not in", values, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdBetween(Integer value1, Integer value2) {
            addCriterion("SGZJQD between", value1, value2, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgzjqdNotBetween(Integer value1, Integer value2) {
            addCriterion("SGZJQD not between", value1, value2, "sgzjqd");
            return (Criteria) this;
        }

        public Criteria andSgjsIsNull() {
            addCriterion("SGJS is null");
            return (Criteria) this;
        }

        public Criteria andSgjsIsNotNull() {
            addCriterion("SGJS is not null");
            return (Criteria) this;
        }

        public Criteria andSgjsEqualTo(Long value) {
            addCriterion("SGJS =", value, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsNotEqualTo(Long value) {
            addCriterion("SGJS <>", value, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsGreaterThan(Long value) {
            addCriterion("SGJS >", value, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsGreaterThanOrEqualTo(Long value) {
            addCriterion("SGJS >=", value, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsLessThan(Long value) {
            addCriterion("SGJS <", value, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsLessThanOrEqualTo(Long value) {
            addCriterion("SGJS <=", value, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsIn(List<Long> values) {
            addCriterion("SGJS in", values, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsNotIn(List<Long> values) {
            addCriterion("SGJS not in", values, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsBetween(Long value1, Long value2) {
            addCriterion("SGJS between", value1, value2, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgjsNotBetween(Long value1, Long value2) {
            addCriterion("SGJS not between", value1, value2, "sgjs");
            return (Criteria) this;
        }

        public Criteria andSgqdJgIsNull() {
            addCriterion("SGQD_JG is null");
            return (Criteria) this;
        }

        public Criteria andSgqdJgIsNotNull() {
            addCriterion("SGQD_JG is not null");
            return (Criteria) this;
        }

        public Criteria andSgqdJgEqualTo(Long value) {
            addCriterion("SGQD_JG =", value, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgNotEqualTo(Long value) {
            addCriterion("SGQD_JG <>", value, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgGreaterThan(Long value) {
            addCriterion("SGQD_JG >", value, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgGreaterThanOrEqualTo(Long value) {
            addCriterion("SGQD_JG >=", value, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgLessThan(Long value) {
            addCriterion("SGQD_JG <", value, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgLessThanOrEqualTo(Long value) {
            addCriterion("SGQD_JG <=", value, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgIn(List<Long> values) {
            addCriterion("SGQD_JG in", values, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgNotIn(List<Long> values) {
            addCriterion("SGQD_JG not in", values, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgBetween(Long value1, Long value2) {
            addCriterion("SGQD_JG between", value1, value2, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgqdJgNotBetween(Long value1, Long value2) {
            addCriterion("SGQD_JG not between", value1, value2, "sgqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgIsNull() {
            addCriterion("SGZJQD_JG is null");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgIsNotNull() {
            addCriterion("SGZJQD_JG is not null");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgEqualTo(Integer value) {
            addCriterion("SGZJQD_JG =", value, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgNotEqualTo(Integer value) {
            addCriterion("SGZJQD_JG <>", value, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgGreaterThan(Integer value) {
            addCriterion("SGZJQD_JG >", value, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgGreaterThanOrEqualTo(Integer value) {
            addCriterion("SGZJQD_JG >=", value, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgLessThan(Integer value) {
            addCriterion("SGZJQD_JG <", value, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgLessThanOrEqualTo(Integer value) {
            addCriterion("SGZJQD_JG <=", value, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgIn(List<Integer> values) {
            addCriterion("SGZJQD_JG in", values, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgNotIn(List<Integer> values) {
            addCriterion("SGZJQD_JG not in", values, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgBetween(Integer value1, Integer value2) {
            addCriterion("SGZJQD_JG between", value1, value2, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgzjqdJgNotBetween(Integer value1, Integer value2) {
            addCriterion("SGZJQD_JG not between", value1, value2, "sgzjqdJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgIsNull() {
            addCriterion("SGJS_JG is null");
            return (Criteria) this;
        }

        public Criteria andSgjsJgIsNotNull() {
            addCriterion("SGJS_JG is not null");
            return (Criteria) this;
        }

        public Criteria andSgjsJgEqualTo(Long value) {
            addCriterion("SGJS_JG =", value, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgNotEqualTo(Long value) {
            addCriterion("SGJS_JG <>", value, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgGreaterThan(Long value) {
            addCriterion("SGJS_JG >", value, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgGreaterThanOrEqualTo(Long value) {
            addCriterion("SGJS_JG >=", value, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgLessThan(Long value) {
            addCriterion("SGJS_JG <", value, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgLessThanOrEqualTo(Long value) {
            addCriterion("SGJS_JG <=", value, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgIn(List<Long> values) {
            addCriterion("SGJS_JG in", values, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgNotIn(List<Long> values) {
            addCriterion("SGJS_JG not in", values, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgBetween(Long value1, Long value2) {
            addCriterion("SGJS_JG between", value1, value2, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andSgjsJgNotBetween(Long value1, Long value2) {
            addCriterion("SGJS_JG not between", value1, value2, "sgjsJg");
            return (Criteria) this;
        }

        public Criteria andShqdIsNull() {
            addCriterion("SHQD is null");
            return (Criteria) this;
        }

        public Criteria andShqdIsNotNull() {
            addCriterion("SHQD is not null");
            return (Criteria) this;
        }

        public Criteria andShqdEqualTo(Long value) {
            addCriterion("SHQD =", value, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdNotEqualTo(Long value) {
            addCriterion("SHQD <>", value, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdGreaterThan(Long value) {
            addCriterion("SHQD >", value, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdGreaterThanOrEqualTo(Long value) {
            addCriterion("SHQD >=", value, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdLessThan(Long value) {
            addCriterion("SHQD <", value, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdLessThanOrEqualTo(Long value) {
            addCriterion("SHQD <=", value, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdIn(List<Long> values) {
            addCriterion("SHQD in", values, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdNotIn(List<Long> values) {
            addCriterion("SHQD not in", values, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdBetween(Long value1, Long value2) {
            addCriterion("SHQD between", value1, value2, "shqd");
            return (Criteria) this;
        }

        public Criteria andShqdNotBetween(Long value1, Long value2) {
            addCriterion("SHQD not between", value1, value2, "shqd");
            return (Criteria) this;
        }

        public Criteria andShjsIsNull() {
            addCriterion("SHJS is null");
            return (Criteria) this;
        }

        public Criteria andShjsIsNotNull() {
            addCriterion("SHJS is not null");
            return (Criteria) this;
        }

        public Criteria andShjsEqualTo(BigDecimal value) {
            addCriterion("SHJS =", value, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsNotEqualTo(BigDecimal value) {
            addCriterion("SHJS <>", value, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsGreaterThan(BigDecimal value) {
            addCriterion("SHJS >", value, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHJS >=", value, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsLessThan(BigDecimal value) {
            addCriterion("SHJS <", value, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHJS <=", value, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsIn(List<BigDecimal> values) {
            addCriterion("SHJS in", values, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsNotIn(List<BigDecimal> values) {
            addCriterion("SHJS not in", values, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHJS between", value1, value2, "shjs");
            return (Criteria) this;
        }

        public Criteria andShjsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHJS not between", value1, value2, "shjs");
            return (Criteria) this;
        }

        public Criteria andBfshyexxIsNull() {
            addCriterion("BFSHYEXX is null");
            return (Criteria) this;
        }

        public Criteria andBfshyexxIsNotNull() {
            addCriterion("BFSHYEXX is not null");
            return (Criteria) this;
        }

        public Criteria andBfshyexxEqualTo(Long value) {
            addCriterion("BFSHYEXX =", value, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxNotEqualTo(Long value) {
            addCriterion("BFSHYEXX <>", value, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxGreaterThan(Long value) {
            addCriterion("BFSHYEXX >", value, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxGreaterThanOrEqualTo(Long value) {
            addCriterion("BFSHYEXX >=", value, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxLessThan(Long value) {
            addCriterion("BFSHYEXX <", value, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxLessThanOrEqualTo(Long value) {
            addCriterion("BFSHYEXX <=", value, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxIn(List<Long> values) {
            addCriterion("BFSHYEXX in", values, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxNotIn(List<Long> values) {
            addCriterion("BFSHYEXX not in", values, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxBetween(Long value1, Long value2) {
            addCriterion("BFSHYEXX between", value1, value2, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andBfshyexxNotBetween(Long value1, Long value2) {
            addCriterion("BFSHYEXX not between", value1, value2, "bfshyexx");
            return (Criteria) this;
        }

        public Criteria andDbjesxIsNull() {
            addCriterion("DBJESX is null");
            return (Criteria) this;
        }

        public Criteria andDbjesxIsNotNull() {
            addCriterion("DBJESX is not null");
            return (Criteria) this;
        }

        public Criteria andDbjesxEqualTo(Integer value) {
            addCriterion("DBJESX =", value, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxNotEqualTo(Integer value) {
            addCriterion("DBJESX <>", value, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxGreaterThan(Integer value) {
            addCriterion("DBJESX >", value, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxGreaterThanOrEqualTo(Integer value) {
            addCriterion("DBJESX >=", value, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxLessThan(Integer value) {
            addCriterion("DBJESX <", value, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxLessThanOrEqualTo(Integer value) {
            addCriterion("DBJESX <=", value, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxIn(List<Integer> values) {
            addCriterion("DBJESX in", values, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxNotIn(List<Integer> values) {
            addCriterion("DBJESX not in", values, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxBetween(Integer value1, Integer value2) {
            addCriterion("DBJESX between", value1, value2, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDbjesxNotBetween(Integer value1, Integer value2) {
            addCriterion("DBJESX not between", value1, value2, "dbjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxIsNull() {
            addCriterion("DHJESX is null");
            return (Criteria) this;
        }

        public Criteria andDhjesxIsNotNull() {
            addCriterion("DHJESX is not null");
            return (Criteria) this;
        }

        public Criteria andDhjesxEqualTo(Integer value) {
            addCriterion("DHJESX =", value, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxNotEqualTo(Integer value) {
            addCriterion("DHJESX <>", value, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxGreaterThan(Integer value) {
            addCriterion("DHJESX >", value, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxGreaterThanOrEqualTo(Integer value) {
            addCriterion("DHJESX >=", value, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxLessThan(Integer value) {
            addCriterion("DHJESX <", value, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxLessThanOrEqualTo(Integer value) {
            addCriterion("DHJESX <=", value, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxIn(List<Integer> values) {
            addCriterion("DHJESX in", values, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxNotIn(List<Integer> values) {
            addCriterion("DHJESX not in", values, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxBetween(Integer value1, Integer value2) {
            addCriterion("DHJESX between", value1, value2, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhjesxNotBetween(Integer value1, Integer value2) {
            addCriterion("DHJESX not between", value1, value2, "dhjesx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxIsNull() {
            addCriterion("DHDRLJSX is null");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxIsNotNull() {
            addCriterion("DHDRLJSX is not null");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxEqualTo(Long value) {
            addCriterion("DHDRLJSX =", value, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxNotEqualTo(Long value) {
            addCriterion("DHDRLJSX <>", value, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxGreaterThan(Long value) {
            addCriterion("DHDRLJSX >", value, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxGreaterThanOrEqualTo(Long value) {
            addCriterion("DHDRLJSX >=", value, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxLessThan(Long value) {
            addCriterion("DHDRLJSX <", value, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxLessThanOrEqualTo(Long value) {
            addCriterion("DHDRLJSX <=", value, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxIn(List<Long> values) {
            addCriterion("DHDRLJSX in", values, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxNotIn(List<Long> values) {
            addCriterion("DHDRLJSX not in", values, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxBetween(Long value1, Long value2) {
            addCriterion("DHDRLJSX between", value1, value2, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDhdrljsxNotBetween(Long value1, Long value2) {
            addCriterion("DHDRLJSX not between", value1, value2, "dhdrljsx");
            return (Criteria) this;
        }

        public Criteria andDxzedIsNull() {
            addCriterion("DXZED is null");
            return (Criteria) this;
        }

        public Criteria andDxzedIsNotNull() {
            addCriterion("DXZED is not null");
            return (Criteria) this;
        }

        public Criteria andDxzedEqualTo(Integer value) {
            addCriterion("DXZED =", value, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedNotEqualTo(Integer value) {
            addCriterion("DXZED <>", value, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedGreaterThan(Integer value) {
            addCriterion("DXZED >", value, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedGreaterThanOrEqualTo(Integer value) {
            addCriterion("DXZED >=", value, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedLessThan(Integer value) {
            addCriterion("DXZED <", value, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedLessThanOrEqualTo(Integer value) {
            addCriterion("DXZED <=", value, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedIn(List<Integer> values) {
            addCriterion("DXZED in", values, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedNotIn(List<Integer> values) {
            addCriterion("DXZED not in", values, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedBetween(Integer value1, Integer value2) {
            addCriterion("DXZED between", value1, value2, "dxzed");
            return (Criteria) this;
        }

        public Criteria andDxzedNotBetween(Integer value1, Integer value2) {
            addCriterion("DXZED not between", value1, value2, "dxzed");
            return (Criteria) this;
        }

        public Criteria andZrsxzIsNull() {
            addCriterion("ZRSXZ is null");
            return (Criteria) this;
        }

        public Criteria andZrsxzIsNotNull() {
            addCriterion("ZRSXZ is not null");
            return (Criteria) this;
        }

        public Criteria andZrsxzEqualTo(Short value) {
            addCriterion("ZRSXZ =", value, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzNotEqualTo(Short value) {
            addCriterion("ZRSXZ <>", value, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzGreaterThan(Short value) {
            addCriterion("ZRSXZ >", value, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzGreaterThanOrEqualTo(Short value) {
            addCriterion("ZRSXZ >=", value, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzLessThan(Short value) {
            addCriterion("ZRSXZ <", value, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzLessThanOrEqualTo(Short value) {
            addCriterion("ZRSXZ <=", value, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzIn(List<Short> values) {
            addCriterion("ZRSXZ in", values, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzNotIn(List<Short> values) {
            addCriterion("ZRSXZ not in", values, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzBetween(Short value1, Short value2) {
            addCriterion("ZRSXZ between", value1, value2, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrsxzNotBetween(Short value1, Short value2) {
            addCriterion("ZRSXZ not between", value1, value2, "zrsxz");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsIsNull() {
            addCriterion("ZRRXZRS is null");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsIsNotNull() {
            addCriterion("ZRRXZRS is not null");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsEqualTo(Short value) {
            addCriterion("ZRRXZRS =", value, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsNotEqualTo(Short value) {
            addCriterion("ZRRXZRS <>", value, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsGreaterThan(Short value) {
            addCriterion("ZRRXZRS >", value, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsGreaterThanOrEqualTo(Short value) {
            addCriterion("ZRRXZRS >=", value, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsLessThan(Short value) {
            addCriterion("ZRRXZRS <", value, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsLessThanOrEqualTo(Short value) {
            addCriterion("ZRRXZRS <=", value, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsIn(List<Short> values) {
            addCriterion("ZRRXZRS in", values, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsNotIn(List<Short> values) {
            addCriterion("ZRRXZRS not in", values, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsBetween(Short value1, Short value2) {
            addCriterion("ZRRXZRS between", value1, value2, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andZrrxzrsNotBetween(Short value1, Short value2) {
            addCriterion("ZRRXZRS not between", value1, value2, "zrrxzrs");
            return (Criteria) this;
        }

        public Criteria andRgdxxzIsNull() {
            addCriterion("RGDXXZ is null");
            return (Criteria) this;
        }

        public Criteria andRgdxxzIsNotNull() {
            addCriterion("RGDXXZ is not null");
            return (Criteria) this;
        }

        public Criteria andRgdxxzEqualTo(Long value) {
            addCriterion("RGDXXZ =", value, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzNotEqualTo(Long value) {
            addCriterion("RGDXXZ <>", value, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzGreaterThan(Long value) {
            addCriterion("RGDXXZ >", value, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzGreaterThanOrEqualTo(Long value) {
            addCriterion("RGDXXZ >=", value, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzLessThan(Long value) {
            addCriterion("RGDXXZ <", value, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzLessThanOrEqualTo(Long value) {
            addCriterion("RGDXXZ <=", value, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzIn(List<Long> values) {
            addCriterion("RGDXXZ in", values, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzNotIn(List<Long> values) {
            addCriterion("RGDXXZ not in", values, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzBetween(Long value1, Long value2) {
            addCriterion("RGDXXZ between", value1, value2, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andRgdxxzNotBetween(Long value1, Long value2) {
            addCriterion("RGDXXZ not between", value1, value2, "rgdxxz");
            return (Criteria) this;
        }

        public Criteria andSfyyIsNull() {
            addCriterion("SFYY is null");
            return (Criteria) this;
        }

        public Criteria andSfyyIsNotNull() {
            addCriterion("SFYY is not null");
            return (Criteria) this;
        }

        public Criteria andSfyyEqualTo(Long value) {
            addCriterion("SFYY =", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyNotEqualTo(Long value) {
            addCriterion("SFYY <>", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyGreaterThan(Long value) {
            addCriterion("SFYY >", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyGreaterThanOrEqualTo(Long value) {
            addCriterion("SFYY >=", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyLessThan(Long value) {
            addCriterion("SFYY <", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyLessThanOrEqualTo(Long value) {
            addCriterion("SFYY <=", value, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyIn(List<Long> values) {
            addCriterion("SFYY in", values, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyNotIn(List<Long> values) {
            addCriterion("SFYY not in", values, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyBetween(Long value1, Long value2) {
            addCriterion("SFYY between", value1, value2, "sfyy");
            return (Criteria) this;
        }

        public Criteria andSfyyNotBetween(Long value1, Long value2) {
            addCriterion("SFYY not between", value1, value2, "sfyy");
            return (Criteria) this;
        }

        public Criteria andYyshIsNull() {
            addCriterion("YYSH is null");
            return (Criteria) this;
        }

        public Criteria andYyshIsNotNull() {
            addCriterion("YYSH is not null");
            return (Criteria) this;
        }

        public Criteria andYyshEqualTo(Long value) {
            addCriterion("YYSH =", value, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshNotEqualTo(Long value) {
            addCriterion("YYSH <>", value, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshGreaterThan(Long value) {
            addCriterion("YYSH >", value, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshGreaterThanOrEqualTo(Long value) {
            addCriterion("YYSH >=", value, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshLessThan(Long value) {
            addCriterion("YYSH <", value, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshLessThanOrEqualTo(Long value) {
            addCriterion("YYSH <=", value, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshIn(List<Long> values) {
            addCriterion("YYSH in", values, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshNotIn(List<Long> values) {
            addCriterion("YYSH not in", values, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshBetween(Long value1, Long value2) {
            addCriterion("YYSH between", value1, value2, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshNotBetween(Long value1, Long value2) {
            addCriterion("YYSH not between", value1, value2, "yysh");
            return (Criteria) this;
        }

        public Criteria andYyshqdIsNull() {
            addCriterion("YYSHQD is null");
            return (Criteria) this;
        }

        public Criteria andYyshqdIsNotNull() {
            addCriterion("YYSHQD is not null");
            return (Criteria) this;
        }

        public Criteria andYyshqdEqualTo(Integer value) {
            addCriterion("YYSHQD =", value, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdNotEqualTo(Integer value) {
            addCriterion("YYSHQD <>", value, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdGreaterThan(Integer value) {
            addCriterion("YYSHQD >", value, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYSHQD >=", value, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdLessThan(Integer value) {
            addCriterion("YYSHQD <", value, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdLessThanOrEqualTo(Integer value) {
            addCriterion("YYSHQD <=", value, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdIn(List<Integer> values) {
            addCriterion("YYSHQD in", values, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdNotIn(List<Integer> values) {
            addCriterion("YYSHQD not in", values, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdBetween(Integer value1, Integer value2) {
            addCriterion("YYSHQD between", value1, value2, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andYyshqdNotBetween(Integer value1, Integer value2) {
            addCriterion("YYSHQD not between", value1, value2, "yyshqd");
            return (Criteria) this;
        }

        public Criteria andQyjexzIsNull() {
            addCriterion("QYJEXZ is null");
            return (Criteria) this;
        }

        public Criteria andQyjexzIsNotNull() {
            addCriterion("QYJEXZ is not null");
            return (Criteria) this;
        }

        public Criteria andQyjexzEqualTo(Long value) {
            addCriterion("QYJEXZ =", value, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzNotEqualTo(Long value) {
            addCriterion("QYJEXZ <>", value, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzGreaterThan(Long value) {
            addCriterion("QYJEXZ >", value, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzGreaterThanOrEqualTo(Long value) {
            addCriterion("QYJEXZ >=", value, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzLessThan(Long value) {
            addCriterion("QYJEXZ <", value, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzLessThanOrEqualTo(Long value) {
            addCriterion("QYJEXZ <=", value, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzIn(List<Long> values) {
            addCriterion("QYJEXZ in", values, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzNotIn(List<Long> values) {
            addCriterion("QYJEXZ not in", values, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzBetween(Long value1, Long value2) {
            addCriterion("QYJEXZ between", value1, value2, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andQyjexzNotBetween(Long value1, Long value2) {
            addCriterion("QYJEXZ not between", value1, value2, "qyjexz");
            return (Criteria) this;
        }

        public Criteria andJytdIsNull() {
            addCriterion("JYTD is null");
            return (Criteria) this;
        }

        public Criteria andJytdIsNotNull() {
            addCriterion("JYTD is not null");
            return (Criteria) this;
        }

        public Criteria andJytdEqualTo(String value) {
            addCriterion("JYTD =", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdNotEqualTo(String value) {
            addCriterion("JYTD <>", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdGreaterThan(String value) {
            addCriterion("JYTD >", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdGreaterThanOrEqualTo(String value) {
            addCriterion("JYTD >=", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdLessThan(String value) {
            addCriterion("JYTD <", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdLessThanOrEqualTo(String value) {
            addCriterion("JYTD <=", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdLike(String value) {
            addCriterion("JYTD like", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdNotLike(String value) {
            addCriterion("JYTD not like", value, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdIn(List<String> values) {
            addCriterion("JYTD in", values, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdNotIn(List<String> values) {
            addCriterion("JYTD not in", values, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdBetween(String value1, String value2) {
            addCriterion("JYTD between", value1, value2, "jytd");
            return (Criteria) this;
        }

        public Criteria andJytdNotBetween(String value1, String value2) {
            addCriterion("JYTD not between", value1, value2, "jytd");
            return (Criteria) this;
        }

        public Criteria andCdkzIsNull() {
            addCriterion("CDKZ is null");
            return (Criteria) this;
        }

        public Criteria andCdkzIsNotNull() {
            addCriterion("CDKZ is not null");
            return (Criteria) this;
        }

        public Criteria andCdkzEqualTo(Long value) {
            addCriterion("CDKZ =", value, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzNotEqualTo(Long value) {
            addCriterion("CDKZ <>", value, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzGreaterThan(Long value) {
            addCriterion("CDKZ >", value, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzGreaterThanOrEqualTo(Long value) {
            addCriterion("CDKZ >=", value, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzLessThan(Long value) {
            addCriterion("CDKZ <", value, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzLessThanOrEqualTo(Long value) {
            addCriterion("CDKZ <=", value, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzIn(List<Long> values) {
            addCriterion("CDKZ in", values, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzNotIn(List<Long> values) {
            addCriterion("CDKZ not in", values, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzBetween(Long value1, Long value2) {
            addCriterion("CDKZ between", value1, value2, "cdkz");
            return (Criteria) this;
        }

        public Criteria andCdkzNotBetween(Long value1, Long value2) {
            addCriterion("CDKZ not between", value1, value2, "cdkz");
            return (Criteria) this;
        }

        public Criteria andQyfsIsNull() {
            addCriterion("QYFS is null");
            return (Criteria) this;
        }

        public Criteria andQyfsIsNotNull() {
            addCriterion("QYFS is not null");
            return (Criteria) this;
        }

        public Criteria andQyfsEqualTo(Long value) {
            addCriterion("QYFS =", value, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsNotEqualTo(Long value) {
            addCriterion("QYFS <>", value, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsGreaterThan(Long value) {
            addCriterion("QYFS >", value, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsGreaterThanOrEqualTo(Long value) {
            addCriterion("QYFS >=", value, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsLessThan(Long value) {
            addCriterion("QYFS <", value, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsLessThanOrEqualTo(Long value) {
            addCriterion("QYFS <=", value, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsIn(List<Long> values) {
            addCriterion("QYFS in", values, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsNotIn(List<Long> values) {
            addCriterion("QYFS not in", values, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsBetween(Long value1, Long value2) {
            addCriterion("QYFS between", value1, value2, "qyfs");
            return (Criteria) this;
        }

        public Criteria andQyfsNotBetween(Long value1, Long value2) {
            addCriterion("QYFS not between", value1, value2, "qyfs");
            return (Criteria) this;
        }

        public Criteria andZbqyIsNull() {
            addCriterion("ZBQY is null");
            return (Criteria) this;
        }

        public Criteria andZbqyIsNotNull() {
            addCriterion("ZBQY is not null");
            return (Criteria) this;
        }

        public Criteria andZbqyEqualTo(Long value) {
            addCriterion("ZBQY =", value, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyNotEqualTo(Long value) {
            addCriterion("ZBQY <>", value, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyGreaterThan(Long value) {
            addCriterion("ZBQY >", value, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyGreaterThanOrEqualTo(Long value) {
            addCriterion("ZBQY >=", value, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyLessThan(Long value) {
            addCriterion("ZBQY <", value, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyLessThanOrEqualTo(Long value) {
            addCriterion("ZBQY <=", value, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyIn(List<Long> values) {
            addCriterion("ZBQY in", values, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyNotIn(List<Long> values) {
            addCriterion("ZBQY not in", values, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyBetween(Long value1, Long value2) {
            addCriterion("ZBQY between", value1, value2, "zbqy");
            return (Criteria) this;
        }

        public Criteria andZbqyNotBetween(Long value1, Long value2) {
            addCriterion("ZBQY not between", value1, value2, "zbqy");
            return (Criteria) this;
        }

        public Criteria andFxbppxzIsNull() {
            addCriterion("FXBPPXZ is null");
            return (Criteria) this;
        }

        public Criteria andFxbppxzIsNotNull() {
            addCriterion("FXBPPXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFxbppxzEqualTo(Long value) {
            addCriterion("FXBPPXZ =", value, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzNotEqualTo(Long value) {
            addCriterion("FXBPPXZ <>", value, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzGreaterThan(Long value) {
            addCriterion("FXBPPXZ >", value, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzGreaterThanOrEqualTo(Long value) {
            addCriterion("FXBPPXZ >=", value, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzLessThan(Long value) {
            addCriterion("FXBPPXZ <", value, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzLessThanOrEqualTo(Long value) {
            addCriterion("FXBPPXZ <=", value, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzIn(List<Long> values) {
            addCriterion("FXBPPXZ in", values, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzNotIn(List<Long> values) {
            addCriterion("FXBPPXZ not in", values, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzBetween(Long value1, Long value2) {
            addCriterion("FXBPPXZ between", value1, value2, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andFxbppxzNotBetween(Long value1, Long value2) {
            addCriterion("FXBPPXZ not between", value1, value2, "fxbppxz");
            return (Criteria) this;
        }

        public Criteria andJyztIsNull() {
            addCriterion("JYZT is null");
            return (Criteria) this;
        }

        public Criteria andJyztIsNotNull() {
            addCriterion("JYZT is not null");
            return (Criteria) this;
        }

        public Criteria andJyztEqualTo(Long value) {
            addCriterion("JYZT =", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotEqualTo(Long value) {
            addCriterion("JYZT <>", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztGreaterThan(Long value) {
            addCriterion("JYZT >", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztGreaterThanOrEqualTo(Long value) {
            addCriterion("JYZT >=", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztLessThan(Long value) {
            addCriterion("JYZT <", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztLessThanOrEqualTo(Long value) {
            addCriterion("JYZT <=", value, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztIn(List<Long> values) {
            addCriterion("JYZT in", values, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotIn(List<Long> values) {
            addCriterion("JYZT not in", values, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztBetween(Long value1, Long value2) {
            addCriterion("JYZT between", value1, value2, "jyzt");
            return (Criteria) this;
        }

        public Criteria andJyztNotBetween(Long value1, Long value2) {
            addCriterion("JYZT not between", value1, value2, "jyzt");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNull() {
            addCriterion("XGSJ is null");
            return (Criteria) this;
        }

        public Criteria andXgsjIsNotNull() {
            addCriterion("XGSJ is not null");
            return (Criteria) this;
        }

        public Criteria andXgsjEqualTo(Date value) {
            addCriterion("XGSJ =", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotEqualTo(Date value) {
            addCriterion("XGSJ <>", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThan(Date value) {
            addCriterion("XGSJ >", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjGreaterThanOrEqualTo(Date value) {
            addCriterion("XGSJ >=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThan(Date value) {
            addCriterion("XGSJ <", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjLessThanOrEqualTo(Date value) {
            addCriterion("XGSJ <=", value, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjIn(List<Date> values) {
            addCriterion("XGSJ in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotIn(List<Date> values) {
            addCriterion("XGSJ not in", values, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjBetween(Date value1, Date value2) {
            addCriterion("XGSJ between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgsjNotBetween(Date value1, Date value2) {
            addCriterion("XGSJ not between", value1, value2, "xgsj");
            return (Criteria) this;
        }

        public Criteria andXgrIsNull() {
            addCriterion("XGR is null");
            return (Criteria) this;
        }

        public Criteria andXgrIsNotNull() {
            addCriterion("XGR is not null");
            return (Criteria) this;
        }

        public Criteria andXgrEqualTo(BigDecimal value) {
            addCriterion("XGR =", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotEqualTo(BigDecimal value) {
            addCriterion("XGR <>", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThan(BigDecimal value) {
            addCriterion("XGR >", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XGR >=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThan(BigDecimal value) {
            addCriterion("XGR <", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XGR <=", value, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrIn(List<BigDecimal> values) {
            addCriterion("XGR in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotIn(List<BigDecimal> values) {
            addCriterion("XGR not in", values, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XGR between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andXgrNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XGR not between", value1, value2, "xgr");
            return (Criteria) this;
        }

        public Criteria andYyksrqIsNull() {
            addCriterion("YYKSRQ is null");
            return (Criteria) this;
        }

        public Criteria andYyksrqIsNotNull() {
            addCriterion("YYKSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYyksrqEqualTo(Integer value) {
            addCriterion("YYKSRQ =", value, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqNotEqualTo(Integer value) {
            addCriterion("YYKSRQ <>", value, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqGreaterThan(Integer value) {
            addCriterion("YYKSRQ >", value, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYKSRQ >=", value, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqLessThan(Integer value) {
            addCriterion("YYKSRQ <", value, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqLessThanOrEqualTo(Integer value) {
            addCriterion("YYKSRQ <=", value, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqIn(List<Integer> values) {
            addCriterion("YYKSRQ in", values, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqNotIn(List<Integer> values) {
            addCriterion("YYKSRQ not in", values, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqBetween(Integer value1, Integer value2) {
            addCriterion("YYKSRQ between", value1, value2, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyksrqNotBetween(Integer value1, Integer value2) {
            addCriterion("YYKSRQ not between", value1, value2, "yyksrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqIsNull() {
            addCriterion("YYJSRQ is null");
            return (Criteria) this;
        }

        public Criteria andYyjsrqIsNotNull() {
            addCriterion("YYJSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andYyjsrqEqualTo(Integer value) {
            addCriterion("YYJSRQ =", value, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqNotEqualTo(Integer value) {
            addCriterion("YYJSRQ <>", value, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqGreaterThan(Integer value) {
            addCriterion("YYJSRQ >", value, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("YYJSRQ >=", value, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqLessThan(Integer value) {
            addCriterion("YYJSRQ <", value, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqLessThanOrEqualTo(Integer value) {
            addCriterion("YYJSRQ <=", value, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqIn(List<Integer> values) {
            addCriterion("YYJSRQ in", values, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqNotIn(List<Integer> values) {
            addCriterion("YYJSRQ not in", values, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqBetween(Integer value1, Integer value2) {
            addCriterion("YYJSRQ between", value1, value2, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andYyjsrqNotBetween(Integer value1, Integer value2) {
            addCriterion("YYJSRQ not between", value1, value2, "yyjsrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqIsNull() {
            addCriterion("RGKSRQ is null");
            return (Criteria) this;
        }

        public Criteria andRgksrqIsNotNull() {
            addCriterion("RGKSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andRgksrqEqualTo(Integer value) {
            addCriterion("RGKSRQ =", value, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqNotEqualTo(Integer value) {
            addCriterion("RGKSRQ <>", value, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqGreaterThan(Integer value) {
            addCriterion("RGKSRQ >", value, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("RGKSRQ >=", value, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqLessThan(Integer value) {
            addCriterion("RGKSRQ <", value, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqLessThanOrEqualTo(Integer value) {
            addCriterion("RGKSRQ <=", value, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqIn(List<Integer> values) {
            addCriterion("RGKSRQ in", values, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqNotIn(List<Integer> values) {
            addCriterion("RGKSRQ not in", values, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqBetween(Integer value1, Integer value2) {
            addCriterion("RGKSRQ between", value1, value2, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgksrqNotBetween(Integer value1, Integer value2) {
            addCriterion("RGKSRQ not between", value1, value2, "rgksrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqIsNull() {
            addCriterion("RGJSRQ is null");
            return (Criteria) this;
        }

        public Criteria andRgjsrqIsNotNull() {
            addCriterion("RGJSRQ is not null");
            return (Criteria) this;
        }

        public Criteria andRgjsrqEqualTo(Integer value) {
            addCriterion("RGJSRQ =", value, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqNotEqualTo(Integer value) {
            addCriterion("RGJSRQ <>", value, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqGreaterThan(Integer value) {
            addCriterion("RGJSRQ >", value, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqGreaterThanOrEqualTo(Integer value) {
            addCriterion("RGJSRQ >=", value, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqLessThan(Integer value) {
            addCriterion("RGJSRQ <", value, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqLessThanOrEqualTo(Integer value) {
            addCriterion("RGJSRQ <=", value, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqIn(List<Integer> values) {
            addCriterion("RGJSRQ in", values, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqNotIn(List<Integer> values) {
            addCriterion("RGJSRQ not in", values, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqBetween(Integer value1, Integer value2) {
            addCriterion("RGJSRQ between", value1, value2, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andRgjsrqNotBetween(Integer value1, Integer value2) {
            addCriterion("RGJSRQ not between", value1, value2, "rgjsrq");
            return (Criteria) this;
        }

        public Criteria andJykssjIsNull() {
            addCriterion("JYKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJykssjIsNotNull() {
            addCriterion("JYKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJykssjEqualTo(String value) {
            addCriterion("JYKSSJ =", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjNotEqualTo(String value) {
            addCriterion("JYKSSJ <>", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjGreaterThan(String value) {
            addCriterion("JYKSSJ >", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjGreaterThanOrEqualTo(String value) {
            addCriterion("JYKSSJ >=", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjLessThan(String value) {
            addCriterion("JYKSSJ <", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjLessThanOrEqualTo(String value) {
            addCriterion("JYKSSJ <=", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjLike(String value) {
            addCriterion("JYKSSJ like", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjNotLike(String value) {
            addCriterion("JYKSSJ not like", value, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjIn(List<String> values) {
            addCriterion("JYKSSJ in", values, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjNotIn(List<String> values) {
            addCriterion("JYKSSJ not in", values, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjBetween(String value1, String value2) {
            addCriterion("JYKSSJ between", value1, value2, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJykssjNotBetween(String value1, String value2) {
            addCriterion("JYKSSJ not between", value1, value2, "jykssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjIsNull() {
            addCriterion("JYJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andJyjssjIsNotNull() {
            addCriterion("JYJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andJyjssjEqualTo(String value) {
            addCriterion("JYJSSJ =", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjNotEqualTo(String value) {
            addCriterion("JYJSSJ <>", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjGreaterThan(String value) {
            addCriterion("JYJSSJ >", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjGreaterThanOrEqualTo(String value) {
            addCriterion("JYJSSJ >=", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjLessThan(String value) {
            addCriterion("JYJSSJ <", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjLessThanOrEqualTo(String value) {
            addCriterion("JYJSSJ <=", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjLike(String value) {
            addCriterion("JYJSSJ like", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjNotLike(String value) {
            addCriterion("JYJSSJ not like", value, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjIn(List<String> values) {
            addCriterion("JYJSSJ in", values, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjNotIn(List<String> values) {
            addCriterion("JYJSSJ not in", values, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjBetween(String value1, String value2) {
            addCriterion("JYJSSJ between", value1, value2, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyjssjNotBetween(String value1, String value2) {
            addCriterion("JYJSSJ not between", value1, value2, "jyjssj");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsIsNull() {
            addCriterion("JYRLSZFS is null");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsIsNotNull() {
            addCriterion("JYRLSZFS is not null");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsEqualTo(Long value) {
            addCriterion("JYRLSZFS =", value, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsNotEqualTo(Long value) {
            addCriterion("JYRLSZFS <>", value, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsGreaterThan(Long value) {
            addCriterion("JYRLSZFS >", value, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsGreaterThanOrEqualTo(Long value) {
            addCriterion("JYRLSZFS >=", value, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsLessThan(Long value) {
            addCriterion("JYRLSZFS <", value, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsLessThanOrEqualTo(Long value) {
            addCriterion("JYRLSZFS <=", value, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsIn(List<Long> values) {
            addCriterion("JYRLSZFS in", values, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsNotIn(List<Long> values) {
            addCriterion("JYRLSZFS not in", values, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsBetween(Long value1, Long value2) {
            addCriterion("JYRLSZFS between", value1, value2, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andJyrlszfsNotBetween(Long value1, Long value2) {
            addCriterion("JYRLSZFS not between", value1, value2, "jyrlszfs");
            return (Criteria) this;
        }

        public Criteria andWtxxIsNull() {
            addCriterion("WTXX is null");
            return (Criteria) this;
        }

        public Criteria andWtxxIsNotNull() {
            addCriterion("WTXX is not null");
            return (Criteria) this;
        }

        public Criteria andWtxxEqualTo(BigDecimal value) {
            addCriterion("WTXX =", value, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxNotEqualTo(BigDecimal value) {
            addCriterion("WTXX <>", value, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxGreaterThan(BigDecimal value) {
            addCriterion("WTXX >", value, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WTXX >=", value, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxLessThan(BigDecimal value) {
            addCriterion("WTXX <", value, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WTXX <=", value, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxIn(List<BigDecimal> values) {
            addCriterion("WTXX in", values, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxNotIn(List<BigDecimal> values) {
            addCriterion("WTXX not in", values, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WTXX between", value1, value2, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtxxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WTXX not between", value1, value2, "wtxx");
            return (Criteria) this;
        }

        public Criteria andWtsxIsNull() {
            addCriterion("WTSX is null");
            return (Criteria) this;
        }

        public Criteria andWtsxIsNotNull() {
            addCriterion("WTSX is not null");
            return (Criteria) this;
        }

        public Criteria andWtsxEqualTo(BigDecimal value) {
            addCriterion("WTSX =", value, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxNotEqualTo(BigDecimal value) {
            addCriterion("WTSX <>", value, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxGreaterThan(BigDecimal value) {
            addCriterion("WTSX >", value, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WTSX >=", value, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxLessThan(BigDecimal value) {
            addCriterion("WTSX <", value, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WTSX <=", value, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxIn(List<BigDecimal> values) {
            addCriterion("WTSX in", values, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxNotIn(List<BigDecimal> values) {
            addCriterion("WTSX not in", values, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WTSX between", value1, value2, "wtsx");
            return (Criteria) this;
        }

        public Criteria andWtsxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WTSX not between", value1, value2, "wtsx");
            return (Criteria) this;
        }

        public Criteria andJydwIsNull() {
            addCriterion("JYDW is null");
            return (Criteria) this;
        }

        public Criteria andJydwIsNotNull() {
            addCriterion("JYDW is not null");
            return (Criteria) this;
        }

        public Criteria andJydwEqualTo(BigDecimal value) {
            addCriterion("JYDW =", value, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwNotEqualTo(BigDecimal value) {
            addCriterion("JYDW <>", value, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwGreaterThan(BigDecimal value) {
            addCriterion("JYDW >", value, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JYDW >=", value, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwLessThan(BigDecimal value) {
            addCriterion("JYDW <", value, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JYDW <=", value, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwIn(List<BigDecimal> values) {
            addCriterion("JYDW in", values, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwNotIn(List<BigDecimal> values) {
            addCriterion("JYDW not in", values, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYDW between", value1, value2, "jydw");
            return (Criteria) this;
        }

        public Criteria andJydwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYDW not between", value1, value2, "jydw");
            return (Criteria) this;
        }

        public Criteria andJyjsIsNull() {
            addCriterion("JYJS is null");
            return (Criteria) this;
        }

        public Criteria andJyjsIsNotNull() {
            addCriterion("JYJS is not null");
            return (Criteria) this;
        }

        public Criteria andJyjsEqualTo(BigDecimal value) {
            addCriterion("JYJS =", value, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsNotEqualTo(BigDecimal value) {
            addCriterion("JYJS <>", value, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsGreaterThan(BigDecimal value) {
            addCriterion("JYJS >", value, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JYJS >=", value, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsLessThan(BigDecimal value) {
            addCriterion("JYJS <", value, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JYJS <=", value, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsIn(List<BigDecimal> values) {
            addCriterion("JYJS in", values, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsNotIn(List<BigDecimal> values) {
            addCriterion("JYJS not in", values, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYJS between", value1, value2, "jyjs");
            return (Criteria) this;
        }

        public Criteria andJyjsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYJS not between", value1, value2, "jyjs");
            return (Criteria) this;
        }

        public Criteria andZdbjIsNull() {
            addCriterion("ZDBJ is null");
            return (Criteria) this;
        }

        public Criteria andZdbjIsNotNull() {
            addCriterion("ZDBJ is not null");
            return (Criteria) this;
        }

        public Criteria andZdbjEqualTo(BigDecimal value) {
            addCriterion("ZDBJ =", value, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjNotEqualTo(BigDecimal value) {
            addCriterion("ZDBJ <>", value, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjGreaterThan(BigDecimal value) {
            addCriterion("ZDBJ >", value, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDBJ >=", value, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjLessThan(BigDecimal value) {
            addCriterion("ZDBJ <", value, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZDBJ <=", value, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjIn(List<BigDecimal> values) {
            addCriterion("ZDBJ in", values, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjNotIn(List<BigDecimal> values) {
            addCriterion("ZDBJ not in", values, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDBJ between", value1, value2, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZdbjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZDBJ not between", value1, value2, "zdbj");
            return (Criteria) this;
        }

        public Criteria andZgbjIsNull() {
            addCriterion("ZGBJ is null");
            return (Criteria) this;
        }

        public Criteria andZgbjIsNotNull() {
            addCriterion("ZGBJ is not null");
            return (Criteria) this;
        }

        public Criteria andZgbjEqualTo(BigDecimal value) {
            addCriterion("ZGBJ =", value, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjNotEqualTo(BigDecimal value) {
            addCriterion("ZGBJ <>", value, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjGreaterThan(BigDecimal value) {
            addCriterion("ZGBJ >", value, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZGBJ >=", value, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjLessThan(BigDecimal value) {
            addCriterion("ZGBJ <", value, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZGBJ <=", value, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjIn(List<BigDecimal> values) {
            addCriterion("ZGBJ in", values, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjNotIn(List<BigDecimal> values) {
            addCriterion("ZGBJ not in", values, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZGBJ between", value1, value2, "zgbj");
            return (Criteria) this;
        }

        public Criteria andZgbjNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZGBJ not between", value1, value2, "zgbj");
            return (Criteria) this;
        }

        public Criteria andJyjwIsNull() {
            addCriterion("JYJW is null");
            return (Criteria) this;
        }

        public Criteria andJyjwIsNotNull() {
            addCriterion("JYJW is not null");
            return (Criteria) this;
        }

        public Criteria andJyjwEqualTo(BigDecimal value) {
            addCriterion("JYJW =", value, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwNotEqualTo(BigDecimal value) {
            addCriterion("JYJW <>", value, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwGreaterThan(BigDecimal value) {
            addCriterion("JYJW >", value, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JYJW >=", value, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwLessThan(BigDecimal value) {
            addCriterion("JYJW <", value, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JYJW <=", value, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwIn(List<BigDecimal> values) {
            addCriterion("JYJW in", values, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwNotIn(List<BigDecimal> values) {
            addCriterion("JYJW not in", values, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYJW between", value1, value2, "jyjw");
            return (Criteria) this;
        }

        public Criteria andJyjwNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JYJW not between", value1, value2, "jyjw");
            return (Criteria) this;
        }

        public Criteria andXqxzIsNull() {
            addCriterion("XQXZ is null");
            return (Criteria) this;
        }

        public Criteria andXqxzIsNotNull() {
            addCriterion("XQXZ is not null");
            return (Criteria) this;
        }

        public Criteria andXqxzEqualTo(String value) {
            addCriterion("XQXZ =", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzNotEqualTo(String value) {
            addCriterion("XQXZ <>", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzGreaterThan(String value) {
            addCriterion("XQXZ >", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzGreaterThanOrEqualTo(String value) {
            addCriterion("XQXZ >=", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzLessThan(String value) {
            addCriterion("XQXZ <", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzLessThanOrEqualTo(String value) {
            addCriterion("XQXZ <=", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzLike(String value) {
            addCriterion("XQXZ like", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzNotLike(String value) {
            addCriterion("XQXZ not like", value, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzIn(List<String> values) {
            addCriterion("XQXZ in", values, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzNotIn(List<String> values) {
            addCriterion("XQXZ not in", values, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzBetween(String value1, String value2) {
            addCriterion("XQXZ between", value1, value2, "xqxz");
            return (Criteria) this;
        }

        public Criteria andXqxzNotBetween(String value1, String value2) {
            addCriterion("XQXZ not between", value1, value2, "xqxz");
            return (Criteria) this;
        }

        public Criteria andZrfsIsNull() {
            addCriterion("ZRFS is null");
            return (Criteria) this;
        }

        public Criteria andZrfsIsNotNull() {
            addCriterion("ZRFS is not null");
            return (Criteria) this;
        }

        public Criteria andZrfsEqualTo(BigDecimal value) {
            addCriterion("ZRFS =", value, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsNotEqualTo(BigDecimal value) {
            addCriterion("ZRFS <>", value, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsGreaterThan(BigDecimal value) {
            addCriterion("ZRFS >", value, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ZRFS >=", value, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsLessThan(BigDecimal value) {
            addCriterion("ZRFS <", value, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ZRFS <=", value, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsIn(List<BigDecimal> values) {
            addCriterion("ZRFS in", values, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsNotIn(List<BigDecimal> values) {
            addCriterion("ZRFS not in", values, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZRFS between", value1, value2, "zrfs");
            return (Criteria) this;
        }

        public Criteria andZrfsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ZRFS not between", value1, value2, "zrfs");
            return (Criteria) this;
        }

        public Criteria andJyxzIsNull() {
            addCriterion("JYXZ is null");
            return (Criteria) this;
        }

        public Criteria andJyxzIsNotNull() {
            addCriterion("JYXZ is not null");
            return (Criteria) this;
        }

        public Criteria andJyxzEqualTo(String value) {
            addCriterion("JYXZ =", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzNotEqualTo(String value) {
            addCriterion("JYXZ <>", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzGreaterThan(String value) {
            addCriterion("JYXZ >", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzGreaterThanOrEqualTo(String value) {
            addCriterion("JYXZ >=", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzLessThan(String value) {
            addCriterion("JYXZ <", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzLessThanOrEqualTo(String value) {
            addCriterion("JYXZ <=", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzLike(String value) {
            addCriterion("JYXZ like", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzNotLike(String value) {
            addCriterion("JYXZ not like", value, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzIn(List<String> values) {
            addCriterion("JYXZ in", values, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzNotIn(List<String> values) {
            addCriterion("JYXZ not in", values, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzBetween(String value1, String value2) {
            addCriterion("JYXZ between", value1, value2, "jyxz");
            return (Criteria) this;
        }

        public Criteria andJyxzNotBetween(String value1, String value2) {
            addCriterion("JYXZ not between", value1, value2, "jyxz");
            return (Criteria) this;
        }

        public Criteria andXjmsIsNull() {
            addCriterion("XJMS is null");
            return (Criteria) this;
        }

        public Criteria andXjmsIsNotNull() {
            addCriterion("XJMS is not null");
            return (Criteria) this;
        }

        public Criteria andXjmsEqualTo(String value) {
            addCriterion("XJMS =", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsNotEqualTo(String value) {
            addCriterion("XJMS <>", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsGreaterThan(String value) {
            addCriterion("XJMS >", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsGreaterThanOrEqualTo(String value) {
            addCriterion("XJMS >=", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsLessThan(String value) {
            addCriterion("XJMS <", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsLessThanOrEqualTo(String value) {
            addCriterion("XJMS <=", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsLike(String value) {
            addCriterion("XJMS like", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsNotLike(String value) {
            addCriterion("XJMS not like", value, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsIn(List<String> values) {
            addCriterion("XJMS in", values, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsNotIn(List<String> values) {
            addCriterion("XJMS not in", values, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsBetween(String value1, String value2) {
            addCriterion("XJMS between", value1, value2, "xjms");
            return (Criteria) this;
        }

        public Criteria andXjmsNotBetween(String value1, String value2) {
            addCriterion("XJMS not between", value1, value2, "xjms");
            return (Criteria) this;
        }

        public Criteria andMmxzIsNull() {
            addCriterion("MMXZ is null");
            return (Criteria) this;
        }

        public Criteria andMmxzIsNotNull() {
            addCriterion("MMXZ is not null");
            return (Criteria) this;
        }

        public Criteria andMmxzEqualTo(BigDecimal value) {
            addCriterion("MMXZ =", value, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzNotEqualTo(BigDecimal value) {
            addCriterion("MMXZ <>", value, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzGreaterThan(BigDecimal value) {
            addCriterion("MMXZ >", value, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MMXZ >=", value, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzLessThan(BigDecimal value) {
            addCriterion("MMXZ <", value, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MMXZ <=", value, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzIn(List<BigDecimal> values) {
            addCriterion("MMXZ in", values, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzNotIn(List<BigDecimal> values) {
            addCriterion("MMXZ not in", values, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MMXZ between", value1, value2, "mmxz");
            return (Criteria) this;
        }

        public Criteria andMmxzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MMXZ not between", value1, value2, "mmxz");
            return (Criteria) this;
        }

        public Criteria andSphyxywIsNull() {
            addCriterion("SPHYXYW is null");
            return (Criteria) this;
        }

        public Criteria andSphyxywIsNotNull() {
            addCriterion("SPHYXYW is not null");
            return (Criteria) this;
        }

        public Criteria andSphyxywEqualTo(String value) {
            addCriterion("SPHYXYW =", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywNotEqualTo(String value) {
            addCriterion("SPHYXYW <>", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywGreaterThan(String value) {
            addCriterion("SPHYXYW >", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywGreaterThanOrEqualTo(String value) {
            addCriterion("SPHYXYW >=", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywLessThan(String value) {
            addCriterion("SPHYXYW <", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywLessThanOrEqualTo(String value) {
            addCriterion("SPHYXYW <=", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywLike(String value) {
            addCriterion("SPHYXYW like", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywNotLike(String value) {
            addCriterion("SPHYXYW not like", value, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywIn(List<String> values) {
            addCriterion("SPHYXYW in", values, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywNotIn(List<String> values) {
            addCriterion("SPHYXYW not in", values, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywBetween(String value1, String value2) {
            addCriterion("SPHYXYW between", value1, value2, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andSphyxywNotBetween(String value1, String value2) {
            addCriterion("SPHYXYW not between", value1, value2, "sphyxyw");
            return (Criteria) this;
        }

        public Criteria andFhfsIsNull() {
            addCriterion("FHFS is null");
            return (Criteria) this;
        }

        public Criteria andFhfsIsNotNull() {
            addCriterion("FHFS is not null");
            return (Criteria) this;
        }

        public Criteria andFhfsEqualTo(Long value) {
            addCriterion("FHFS =", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotEqualTo(Long value) {
            addCriterion("FHFS <>", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsGreaterThan(Long value) {
            addCriterion("FHFS >", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsGreaterThanOrEqualTo(Long value) {
            addCriterion("FHFS >=", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsLessThan(Long value) {
            addCriterion("FHFS <", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsLessThanOrEqualTo(Long value) {
            addCriterion("FHFS <=", value, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsIn(List<Long> values) {
            addCriterion("FHFS in", values, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotIn(List<Long> values) {
            addCriterion("FHFS not in", values, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsBetween(Long value1, Long value2) {
            addCriterion("FHFS between", value1, value2, "fhfs");
            return (Criteria) this;
        }

        public Criteria andFhfsNotBetween(Long value1, Long value2) {
            addCriterion("FHFS not between", value1, value2, "fhfs");
            return (Criteria) this;
        }

        public Criteria andSffsIsNull() {
            addCriterion("SFFS is null");
            return (Criteria) this;
        }

        public Criteria andSffsIsNotNull() {
            addCriterion("SFFS is not null");
            return (Criteria) this;
        }

        public Criteria andSffsEqualTo(Long value) {
            addCriterion("SFFS =", value, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsNotEqualTo(Long value) {
            addCriterion("SFFS <>", value, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsGreaterThan(Long value) {
            addCriterion("SFFS >", value, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsGreaterThanOrEqualTo(Long value) {
            addCriterion("SFFS >=", value, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsLessThan(Long value) {
            addCriterion("SFFS <", value, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsLessThanOrEqualTo(Long value) {
            addCriterion("SFFS <=", value, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsIn(List<Long> values) {
            addCriterion("SFFS in", values, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsNotIn(List<Long> values) {
            addCriterion("SFFS not in", values, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsBetween(Long value1, Long value2) {
            addCriterion("SFFS between", value1, value2, "sffs");
            return (Criteria) this;
        }

        public Criteria andSffsNotBetween(Long value1, Long value2) {
            addCriterion("SFFS not between", value1, value2, "sffs");
            return (Criteria) this;
        }

        public Criteria andXefzIsNull() {
            addCriterion("XEFZ is null");
            return (Criteria) this;
        }

        public Criteria andXefzIsNotNull() {
            addCriterion("XEFZ is not null");
            return (Criteria) this;
        }

        public Criteria andXefzEqualTo(BigDecimal value) {
            addCriterion("XEFZ =", value, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzNotEqualTo(BigDecimal value) {
            addCriterion("XEFZ <>", value, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzGreaterThan(BigDecimal value) {
            addCriterion("XEFZ >", value, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XEFZ >=", value, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzLessThan(BigDecimal value) {
            addCriterion("XEFZ <", value, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XEFZ <=", value, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzIn(List<BigDecimal> values) {
            addCriterion("XEFZ in", values, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzNotIn(List<BigDecimal> values) {
            addCriterion("XEFZ not in", values, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XEFZ between", value1, value2, "xefz");
            return (Criteria) this;
        }

        public Criteria andXefzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XEFZ not between", value1, value2, "xefz");
            return (Criteria) this;
        }

        public Criteria andFbkssjIsNull() {
            addCriterion("FBKSSJ is null");
            return (Criteria) this;
        }

        public Criteria andFbkssjIsNotNull() {
            addCriterion("FBKSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFbkssjEqualTo(Date value) {
            addCriterion("FBKSSJ =", value, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjNotEqualTo(Date value) {
            addCriterion("FBKSSJ <>", value, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjGreaterThan(Date value) {
            addCriterion("FBKSSJ >", value, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjGreaterThanOrEqualTo(Date value) {
            addCriterion("FBKSSJ >=", value, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjLessThan(Date value) {
            addCriterion("FBKSSJ <", value, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjLessThanOrEqualTo(Date value) {
            addCriterion("FBKSSJ <=", value, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjIn(List<Date> values) {
            addCriterion("FBKSSJ in", values, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjNotIn(List<Date> values) {
            addCriterion("FBKSSJ not in", values, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjBetween(Date value1, Date value2) {
            addCriterion("FBKSSJ between", value1, value2, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbkssjNotBetween(Date value1, Date value2) {
            addCriterion("FBKSSJ not between", value1, value2, "fbkssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjIsNull() {
            addCriterion("FBYYJSSJ is null");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjIsNotNull() {
            addCriterion("FBYYJSSJ is not null");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjEqualTo(Date value) {
            addCriterion("FBYYJSSJ =", value, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjNotEqualTo(Date value) {
            addCriterion("FBYYJSSJ <>", value, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjGreaterThan(Date value) {
            addCriterion("FBYYJSSJ >", value, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjGreaterThanOrEqualTo(Date value) {
            addCriterion("FBYYJSSJ >=", value, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjLessThan(Date value) {
            addCriterion("FBYYJSSJ <", value, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjLessThanOrEqualTo(Date value) {
            addCriterion("FBYYJSSJ <=", value, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjIn(List<Date> values) {
            addCriterion("FBYYJSSJ in", values, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjNotIn(List<Date> values) {
            addCriterion("FBYYJSSJ not in", values, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjBetween(Date value1, Date value2) {
            addCriterion("FBYYJSSJ between", value1, value2, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbyyjssjNotBetween(Date value1, Date value2) {
            addCriterion("FBYYJSSJ not between", value1, value2, "fbyyjssj");
            return (Criteria) this;
        }

        public Criteria andFbzedIsNull() {
            addCriterion("FBZED is null");
            return (Criteria) this;
        }

        public Criteria andFbzedIsNotNull() {
            addCriterion("FBZED is not null");
            return (Criteria) this;
        }

        public Criteria andFbzedEqualTo(BigDecimal value) {
            addCriterion("FBZED =", value, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedNotEqualTo(BigDecimal value) {
            addCriterion("FBZED <>", value, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedGreaterThan(BigDecimal value) {
            addCriterion("FBZED >", value, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBZED >=", value, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedLessThan(BigDecimal value) {
            addCriterion("FBZED <", value, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBZED <=", value, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedIn(List<BigDecimal> values) {
            addCriterion("FBZED in", values, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedNotIn(List<BigDecimal> values) {
            addCriterion("FBZED not in", values, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBZED between", value1, value2, "fbzed");
            return (Criteria) this;
        }

        public Criteria andFbzedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBZED not between", value1, value2, "fbzed");
            return (Criteria) this;
        }

        public Criteria andDbfbsxIsNull() {
            addCriterion("DBFBSX is null");
            return (Criteria) this;
        }

        public Criteria andDbfbsxIsNotNull() {
            addCriterion("DBFBSX is not null");
            return (Criteria) this;
        }

        public Criteria andDbfbsxEqualTo(BigDecimal value) {
            addCriterion("DBFBSX =", value, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxNotEqualTo(BigDecimal value) {
            addCriterion("DBFBSX <>", value, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxGreaterThan(BigDecimal value) {
            addCriterion("DBFBSX >", value, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DBFBSX >=", value, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxLessThan(BigDecimal value) {
            addCriterion("DBFBSX <", value, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DBFBSX <=", value, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxIn(List<BigDecimal> values) {
            addCriterion("DBFBSX in", values, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxNotIn(List<BigDecimal> values) {
            addCriterion("DBFBSX not in", values, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBFBSX between", value1, value2, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andDbfbsxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DBFBSX not between", value1, value2, "dbfbsx");
            return (Criteria) this;
        }

        public Criteria andFbedxzblIsNull() {
            addCriterion("FBEDXZBL is null");
            return (Criteria) this;
        }

        public Criteria andFbedxzblIsNotNull() {
            addCriterion("FBEDXZBL is not null");
            return (Criteria) this;
        }

        public Criteria andFbedxzblEqualTo(BigDecimal value) {
            addCriterion("FBEDXZBL =", value, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblNotEqualTo(BigDecimal value) {
            addCriterion("FBEDXZBL <>", value, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblGreaterThan(BigDecimal value) {
            addCriterion("FBEDXZBL >", value, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBEDXZBL >=", value, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblLessThan(BigDecimal value) {
            addCriterion("FBEDXZBL <", value, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBEDXZBL <=", value, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblIn(List<BigDecimal> values) {
            addCriterion("FBEDXZBL in", values, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblNotIn(List<BigDecimal> values) {
            addCriterion("FBEDXZBL not in", values, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBEDXZBL between", value1, value2, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbedxzblNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBEDXZBL not between", value1, value2, "fbedxzbl");
            return (Criteria) this;
        }

        public Criteria andFbslxzIsNull() {
            addCriterion("FBSLXZ is null");
            return (Criteria) this;
        }

        public Criteria andFbslxzIsNotNull() {
            addCriterion("FBSLXZ is not null");
            return (Criteria) this;
        }

        public Criteria andFbslxzEqualTo(BigDecimal value) {
            addCriterion("FBSLXZ =", value, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzNotEqualTo(BigDecimal value) {
            addCriterion("FBSLXZ <>", value, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzGreaterThan(BigDecimal value) {
            addCriterion("FBSLXZ >", value, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FBSLXZ >=", value, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzLessThan(BigDecimal value) {
            addCriterion("FBSLXZ <", value, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FBSLXZ <=", value, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzIn(List<BigDecimal> values) {
            addCriterion("FBSLXZ in", values, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzNotIn(List<BigDecimal> values) {
            addCriterion("FBSLXZ not in", values, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBSLXZ between", value1, value2, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andFbslxzNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FBSLXZ not between", value1, value2, "fbslxz");
            return (Criteria) this;
        }

        public Criteria andPxgzIsNull() {
            addCriterion("PXGZ is null");
            return (Criteria) this;
        }

        public Criteria andPxgzIsNotNull() {
            addCriterion("PXGZ is not null");
            return (Criteria) this;
        }

        public Criteria andPxgzEqualTo(String value) {
            addCriterion("PXGZ =", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzNotEqualTo(String value) {
            addCriterion("PXGZ <>", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzGreaterThan(String value) {
            addCriterion("PXGZ >", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzGreaterThanOrEqualTo(String value) {
            addCriterion("PXGZ >=", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzLessThan(String value) {
            addCriterion("PXGZ <", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzLessThanOrEqualTo(String value) {
            addCriterion("PXGZ <=", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzLike(String value) {
            addCriterion("PXGZ like", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzNotLike(String value) {
            addCriterion("PXGZ not like", value, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzIn(List<String> values) {
            addCriterion("PXGZ in", values, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzNotIn(List<String> values) {
            addCriterion("PXGZ not in", values, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzBetween(String value1, String value2) {
            addCriterion("PXGZ between", value1, value2, "pxgz");
            return (Criteria) this;
        }

        public Criteria andPxgzNotBetween(String value1, String value2) {
            addCriterion("PXGZ not between", value1, value2, "pxgz");
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