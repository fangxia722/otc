package otc.domain.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import otc.domain.model.cpdm;
import otc.domain.model.cpdmExample.Criteria;
import otc.domain.model.cpdmExample.Criterion;
import otc.domain.model.cpdmExample;

public class cpdmSqlProvider {

    public String insertSelective(cpdm record) {
        BEGIN();
        INSERT_INTO("TFP_CPDM");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getCpdm() != null) {
            VALUES("CPDM", "#{cpdm,jdbcType=VARCHAR}");
        }
        
        if (record.getCpdmXt() != null) {
            VALUES("CPDM_XT", "#{cpdmXt,jdbcType=VARCHAR}");
        }
        
        if (record.getCpjp() != null) {
            VALUES("CPJP", "#{cpjp,jdbcType=VARCHAR}");
        }
        
        if (record.getCpfl() != null) {
            VALUES("CPFL", "#{cpfl,jdbcType=DECIMAL}");
        }
        
        if (record.getCpmc() != null) {
            VALUES("CPMC", "#{cpmc,jdbcType=VARCHAR}");
        }
        
        if (record.getCpqc() != null) {
            VALUES("CPQC", "#{cpqc,jdbcType=VARCHAR}");
        }
        
        if (record.getSylx() != null) {
            VALUES("SYLX", "#{sylx,jdbcType=DECIMAL}");
        }
        
        if (record.getCplx() != null) {
            VALUES("CPLX", "#{cplx,jdbcType=DECIMAL}");
        }
        
        if (record.getFxpj() != null) {
            VALUES("FXPJ", "#{fxpj,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjbFxf() != null) {
            VALUES("FXJB_FXF", "#{fxjbFxf,jdbcType=DECIMAL}");
        }
        
        if (record.getTzqx() != null) {
            VALUES("TZQX", "#{tzqx,jdbcType=DECIMAL}");
        }
        
        if (record.getTzpz() != null) {
            VALUES("TZPZ", "#{tzpz,jdbcType=DECIMAL}");
        }
        
        if (record.getCppj() != null) {
            VALUES("CPPJ", "#{cppj,jdbcType=DECIMAL}");
        }
        
        if (record.getJys() != null) {
            VALUES("JYS", "#{jys,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjg() != null) {
            VALUES("FXJG", "#{fxjg,jdbcType=DECIMAL}");
        }
        
        if (record.getZlxs() != null) {
            VALUES("ZLXS", "#{zlxs,jdbcType=DECIMAL}");
        }
        
        if (record.getSfrx() != null) {
            VALUES("SFRX", "#{sfrx,jdbcType=DECIMAL}");
        }
        
        if (record.getSfxcp() != null) {
            VALUES("SFXCP", "#{sfxcp,jdbcType=DECIMAL}");
        }
        
        if (record.getCxgx() != null) {
            VALUES("CXGX", "#{cxgx,jdbcType=DECIMAL}");
        }
        
        if (record.getZycd() != null) {
            VALUES("ZYCD", "#{zycd,jdbcType=DECIMAL}");
        }
        
        if (record.getBz() != null) {
            VALUES("BZ", "#{bz,jdbcType=DECIMAL}");
        }
        
        if (record.getCpzt() != null) {
            VALUES("CPZT", "#{cpzt,jdbcType=DECIMAL}");
        }
        
        if (record.getSjbz() != null) {
            VALUES("SJBZ", "#{sjbz,jdbcType=DECIMAL}");
        }
        
        if (record.getSjrq() != null) {
            VALUES("SJRQ", "#{sjrq,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    public String selectByExample(cpdmExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("CPDM");
        SELECT("CPDM_XT");
        SELECT("CPJP");
        SELECT("CPFL");
        SELECT("CPMC");
        SELECT("CPQC");
        SELECT("SYLX");
        SELECT("CPLX");
        SELECT("FXPJ");
        SELECT("FXJB_FXF");
        SELECT("TZQX");
        SELECT("TZPZ");
        SELECT("CPPJ");
        SELECT("JYS");
        SELECT("FXJG");
        SELECT("ZLXS");
        SELECT("SFRX");
        SELECT("SFXCP");
        SELECT("CXGX");
        SELECT("ZYCD");
        SELECT("BZ");
        SELECT("CPZT");
        SELECT("SJBZ");
        SELECT("SJRQ");
        FROM("TFP_CPDM");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(cpdm record) {
        BEGIN();
        UPDATE("TFP_CPDM");
        
        if (record.getCpdm() != null) {
            SET("CPDM = #{cpdm,jdbcType=VARCHAR}");
        }
        
        if (record.getCpdmXt() != null) {
            SET("CPDM_XT = #{cpdmXt,jdbcType=VARCHAR}");
        }
        
        if (record.getCpjp() != null) {
            SET("CPJP = #{cpjp,jdbcType=VARCHAR}");
        }
        
        if (record.getCpfl() != null) {
            SET("CPFL = #{cpfl,jdbcType=DECIMAL}");
        }
        
        if (record.getCpmc() != null) {
            SET("CPMC = #{cpmc,jdbcType=VARCHAR}");
        }
        
        if (record.getCpqc() != null) {
            SET("CPQC = #{cpqc,jdbcType=VARCHAR}");
        }
        
        if (record.getSylx() != null) {
            SET("SYLX = #{sylx,jdbcType=DECIMAL}");
        }
        
        if (record.getCplx() != null) {
            SET("CPLX = #{cplx,jdbcType=DECIMAL}");
        }
        
        if (record.getFxpj() != null) {
            SET("FXPJ = #{fxpj,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjbFxf() != null) {
            SET("FXJB_FXF = #{fxjbFxf,jdbcType=DECIMAL}");
        }
        
        if (record.getTzqx() != null) {
            SET("TZQX = #{tzqx,jdbcType=DECIMAL}");
        }
        
        if (record.getTzpz() != null) {
            SET("TZPZ = #{tzpz,jdbcType=DECIMAL}");
        }
        
        if (record.getCppj() != null) {
            SET("CPPJ = #{cppj,jdbcType=DECIMAL}");
        }
        
        if (record.getJys() != null) {
            SET("JYS = #{jys,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjg() != null) {
            SET("FXJG = #{fxjg,jdbcType=DECIMAL}");
        }
        
        if (record.getZlxs() != null) {
            SET("ZLXS = #{zlxs,jdbcType=DECIMAL}");
        }
        
        if (record.getSfrx() != null) {
            SET("SFRX = #{sfrx,jdbcType=DECIMAL}");
        }
        
        if (record.getSfxcp() != null) {
            SET("SFXCP = #{sfxcp,jdbcType=DECIMAL}");
        }
        
        if (record.getCxgx() != null) {
            SET("CXGX = #{cxgx,jdbcType=DECIMAL}");
        }
        
        if (record.getZycd() != null) {
            SET("ZYCD = #{zycd,jdbcType=DECIMAL}");
        }
        
        if (record.getBz() != null) {
            SET("BZ = #{bz,jdbcType=DECIMAL}");
        }
        
        if (record.getCpzt() != null) {
            SET("CPZT = #{cpzt,jdbcType=DECIMAL}");
        }
        
        if (record.getSjbz() != null) {
            SET("SJBZ = #{sjbz,jdbcType=DECIMAL}");
        }
        
        if (record.getSjrq() != null) {
            SET("SJRQ = #{sjrq,jdbcType=DECIMAL}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }

    protected void applyWhere(cpdmExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}