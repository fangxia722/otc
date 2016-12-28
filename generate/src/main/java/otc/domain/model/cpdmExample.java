package otc.domain.model;

import java.util.ArrayList;
import java.util.List;

public class cpdmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public cpdmExample() {
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