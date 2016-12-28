package otc.domain.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import otc.domain.model.Khtzzh;

public class KhtzzhSqlProvider {

    public String insertSelective(Khtzzh record) {
        BEGIN();
        INSERT_INTO("TFP_KHTZZH");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getKhh() != null) {
            VALUES("KHH", "#{khh,jdbcType=DECIMAL}");
        }
        
        if (record.getYyb() != null) {
            VALUES("YYB", "#{yyb,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjg() != null) {
            VALUES("FXJG", "#{fxjg,jdbcType=DECIMAL}");
        }
        
        if (record.getTzzh() != null) {
            VALUES("TZZH", "#{tzzh,jdbcType=VARCHAR}");
        }
        
        if (record.getZhmc() != null) {
            VALUES("ZHMC", "#{zhmc,jdbcType=VARCHAR}");
        }
        
        if (record.getZhmm() != null) {
            VALUES("ZHMM", "#{zhmm,jdbcType=VARCHAR}");
        }
        
        if (record.getJyzh() != null) {
            VALUES("JYZH", "#{jyzh,jdbcType=VARCHAR}");
        }
        
        if (record.getJszh() != null) {
            VALUES("JSZH", "#{jszh,jdbcType=VARCHAR}");
        }
        
        if (record.getJslx() != null) {
            VALUES("JSLX", "#{jslx,jdbcType=DECIMAL}");
        }
        
        if (record.getJsjg() != null) {
            VALUES("JSJG", "#{jsjg,jdbcType=VARCHAR}");
        }
        
        if (record.getFhfs() != null) {
            VALUES("FHFS", "#{fhfs,jdbcType=DECIMAL}");
        }
        
        if (record.getZhzt() != null) {
            VALUES("ZHZT", "#{zhzt,jdbcType=DECIMAL}");
        }
        
        if (record.getZhsx() != null) {
            VALUES("ZHSX", "#{zhsx,jdbcType=DECIMAL}");
        }
        
        if (record.getJyqx() != null) {
            VALUES("JYQX", "#{jyqx,jdbcType=DECIMAL}");
        }
        
        if (record.getZdsx() != null) {
            VALUES("ZDSX", "#{zdsx,jdbcType=DECIMAL}");
        }
        
        if (record.getHybh() != null) {
            VALUES("HYBH", "#{hybh,jdbcType=VARCHAR}");
        }
        
        if (record.getPbu() != null) {
            VALUES("PBU", "#{pbu,jdbcType=VARCHAR}");
        }
        
        if (record.getJsbz() != null) {
            VALUES("JSBZ", "#{jsbz,jdbcType=DECIMAL}");
        }
        
        if (record.getZhfxdj() != null) {
            VALUES("ZHFXDJ", "#{zhfxdj,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjbFxf() != null) {
            VALUES("FXJB_FXF", "#{fxjbFxf,jdbcType=DECIMAL}");
        }
        
        if (record.getPcrq() != null) {
            VALUES("PCRQ", "#{pcrq,jdbcType=DECIMAL}");
        }
        
        if (record.getKhrq() != null) {
            VALUES("KHRQ", "#{khrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXhrq() != null) {
            VALUES("XHRQ", "#{xhrq,jdbcType=DECIMAL}");
        }
        
        if (record.getSj() != null) {
            VALUES("SJ", "#{sj,jdbcType=VARCHAR}");
        }
        
        if (record.getDh() != null) {
            VALUES("DH", "#{dh,jdbcType=VARCHAR}");
        }
        
        if (record.getCz() != null) {
            VALUES("CZ", "#{cz,jdbcType=VARCHAR}");
        }
        
        if (record.getDz() != null) {
            VALUES("DZ", "#{dz,jdbcType=VARCHAR}");
        }
        
        if (record.getYzbm() != null) {
            VALUES("YZBM", "#{yzbm,jdbcType=VARCHAR}");
        }
        
        if (record.getKhhDc() != null) {
            VALUES("KHH_DC", "#{khhDc,jdbcType=VARCHAR}");
        }
        
        if (record.getYdsqybz() != null) {
            VALUES("YDSQYBZ", "#{ydsqybz,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Khtzzh record) {
        BEGIN();
        UPDATE("TFP_KHTZZH");
        
        if (record.getKhh() != null) {
            SET("KHH = #{khh,jdbcType=DECIMAL}");
        }
        
        if (record.getYyb() != null) {
            SET("YYB = #{yyb,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjg() != null) {
            SET("FXJG = #{fxjg,jdbcType=DECIMAL}");
        }
        
        if (record.getTzzh() != null) {
            SET("TZZH = #{tzzh,jdbcType=VARCHAR}");
        }
        
        if (record.getZhmc() != null) {
            SET("ZHMC = #{zhmc,jdbcType=VARCHAR}");
        }
        
        if (record.getZhmm() != null) {
            SET("ZHMM = #{zhmm,jdbcType=VARCHAR}");
        }
        
        if (record.getJyzh() != null) {
            SET("JYZH = #{jyzh,jdbcType=VARCHAR}");
        }
        
        if (record.getJszh() != null) {
            SET("JSZH = #{jszh,jdbcType=VARCHAR}");
        }
        
        if (record.getJslx() != null) {
            SET("JSLX = #{jslx,jdbcType=DECIMAL}");
        }
        
        if (record.getJsjg() != null) {
            SET("JSJG = #{jsjg,jdbcType=VARCHAR}");
        }
        
        if (record.getFhfs() != null) {
            SET("FHFS = #{fhfs,jdbcType=DECIMAL}");
        }
        
        if (record.getZhzt() != null) {
            SET("ZHZT = #{zhzt,jdbcType=DECIMAL}");
        }
        
        if (record.getZhsx() != null) {
            SET("ZHSX = #{zhsx,jdbcType=DECIMAL}");
        }
        
        if (record.getJyqx() != null) {
            SET("JYQX = #{jyqx,jdbcType=DECIMAL}");
        }
        
        if (record.getZdsx() != null) {
            SET("ZDSX = #{zdsx,jdbcType=DECIMAL}");
        }
        
        if (record.getHybh() != null) {
            SET("HYBH = #{hybh,jdbcType=VARCHAR}");
        }
        
        if (record.getPbu() != null) {
            SET("PBU = #{pbu,jdbcType=VARCHAR}");
        }
        
        if (record.getJsbz() != null) {
            SET("JSBZ = #{jsbz,jdbcType=DECIMAL}");
        }
        
        if (record.getZhfxdj() != null) {
            SET("ZHFXDJ = #{zhfxdj,jdbcType=DECIMAL}");
        }
        
        if (record.getFxjbFxf() != null) {
            SET("FXJB_FXF = #{fxjbFxf,jdbcType=DECIMAL}");
        }
        
        if (record.getPcrq() != null) {
            SET("PCRQ = #{pcrq,jdbcType=DECIMAL}");
        }
        
        if (record.getKhrq() != null) {
            SET("KHRQ = #{khrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXhrq() != null) {
            SET("XHRQ = #{xhrq,jdbcType=DECIMAL}");
        }
        
        if (record.getSj() != null) {
            SET("SJ = #{sj,jdbcType=VARCHAR}");
        }
        
        if (record.getDh() != null) {
            SET("DH = #{dh,jdbcType=VARCHAR}");
        }
        
        if (record.getCz() != null) {
            SET("CZ = #{cz,jdbcType=VARCHAR}");
        }
        
        if (record.getDz() != null) {
            SET("DZ = #{dz,jdbcType=VARCHAR}");
        }
        
        if (record.getYzbm() != null) {
            SET("YZBM = #{yzbm,jdbcType=VARCHAR}");
        }
        
        if (record.getKhhDc() != null) {
            SET("KHH_DC = #{khhDc,jdbcType=VARCHAR}");
        }
        
        if (record.getYdsqybz() != null) {
            SET("YDSQYBZ = #{ydsqybz,jdbcType=DECIMAL}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }
}