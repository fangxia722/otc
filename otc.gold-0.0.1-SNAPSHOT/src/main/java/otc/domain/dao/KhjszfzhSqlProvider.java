package otc.domain.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import otc.domain.model.Khjszfzh;

public class KhjszfzhSqlProvider {

    public String insertSelective(Khjszfzh record) {
        BEGIN();
        INSERT_INTO("TFP_KHJSZFZH");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getName() != null) {
            VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getKhid() != null) {
            VALUES("KHID", "#{khid,jdbcType=DECIMAL}");
        }
        
        if (record.getKhh() != null) {
            VALUES("KHH", "#{khh,jdbcType=VARCHAR}");
        }
        
        if (record.getJsjg() != null) {
            VALUES("JSJG", "#{jsjg,jdbcType=DECIMAL}");
        }
        
        if (record.getJgdm() != null) {
            VALUES("JGDM", "#{jgdm,jdbcType=VARCHAR}");
        }
        
        if (record.getJszh() != null) {
            VALUES("JSZH", "#{jszh,jdbcType=VARCHAR}");
        }
        
        if (record.getZhmc() != null) {
            VALUES("ZHMC", "#{zhmc,jdbcType=VARCHAR}");
        }
        
        if (record.getKhyh() != null) {
            VALUES("KHYH", "#{khyh,jdbcType=VARCHAR}");
        }
        
        if (record.getZhlb() != null) {
            VALUES("ZHLB", "#{zhlb,jdbcType=DECIMAL}");
        }
        
        if (record.getJslx() != null) {
            VALUES("JSLX", "#{jslx,jdbcType=DECIMAL}");
        }
        
        if (record.getZhzt() != null) {
            VALUES("ZHZT", "#{zhzt,jdbcType=DECIMAL}");
        }
        
        if (record.getZjsysj() != null) {
            VALUES("ZJSYSJ", "#{zjsysj,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKhrq() != null) {
            VALUES("KHRQ", "#{khrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXhrq() != null) {
            VALUES("XHRQ", "#{xhrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXybz() != null) {
            VALUES("XYBZ", "#{xybz,jdbcType=DECIMAL}");
        }
        
        if (record.getMrbz() != null) {
            VALUES("MRBZ", "#{mrbz,jdbcType=DECIMAL}");
        }
        
        if (record.getBz() != null) {
            VALUES("BZ", "#{bz,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Khjszfzh record) {
        BEGIN();
        UPDATE("TFP_KHJSZFZH");
        
        if (record.getName() != null) {
            SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getKhid() != null) {
            SET("KHID = #{khid,jdbcType=DECIMAL}");
        }
        
        if (record.getKhh() != null) {
            SET("KHH = #{khh,jdbcType=VARCHAR}");
        }
        
        if (record.getJsjg() != null) {
            SET("JSJG = #{jsjg,jdbcType=DECIMAL}");
        }
        
        if (record.getJgdm() != null) {
            SET("JGDM = #{jgdm,jdbcType=VARCHAR}");
        }
        
        if (record.getJszh() != null) {
            SET("JSZH = #{jszh,jdbcType=VARCHAR}");
        }
        
        if (record.getZhmc() != null) {
            SET("ZHMC = #{zhmc,jdbcType=VARCHAR}");
        }
        
        if (record.getKhyh() != null) {
            SET("KHYH = #{khyh,jdbcType=VARCHAR}");
        }
        
        if (record.getZhlb() != null) {
            SET("ZHLB = #{zhlb,jdbcType=DECIMAL}");
        }
        
        if (record.getJslx() != null) {
            SET("JSLX = #{jslx,jdbcType=DECIMAL}");
        }
        
        if (record.getZhzt() != null) {
            SET("ZHZT = #{zhzt,jdbcType=DECIMAL}");
        }
        
        if (record.getZjsysj() != null) {
            SET("ZJSYSJ = #{zjsysj,jdbcType=TIMESTAMP}");
        }
        
        if (record.getKhrq() != null) {
            SET("KHRQ = #{khrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXhrq() != null) {
            SET("XHRQ = #{xhrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXybz() != null) {
            SET("XYBZ = #{xybz,jdbcType=DECIMAL}");
        }
        
        if (record.getMrbz() != null) {
            SET("MRBZ = #{mrbz,jdbcType=DECIMAL}");
        }
        
        if (record.getBz() != null) {
            SET("BZ = #{bz,jdbcType=DECIMAL}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }
}