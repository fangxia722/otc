package otc.domain.dao;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import otc.domain.model.Khxx;

public class KhxxSqlProvider {

    public String insertSelective(Khxx record) {
        BEGIN();
        INSERT_INTO("TFP_KHXX");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=DECIMAL}");
        }
        
        if (record.getKhh() != null) {
            VALUES("KHH", "#{khh,jdbcType=VARCHAR}");
        }
        
        if (record.getKhxm() != null) {
            VALUES("KHXM", "#{khxm,jdbcType=VARCHAR}");
        }
        
        if (record.getKhqc() != null) {
            VALUES("KHQC", "#{khqc,jdbcType=VARCHAR}");
        }
        
        if (record.getPydm() != null) {
            VALUES("PYDM", "#{pydm,jdbcType=VARCHAR}");
        }
        
        if (record.getYyb() != null) {
            VALUES("YYB", "#{yyb,jdbcType=DECIMAL}");
        }
        
        if (record.getKhlx() != null) {
            VALUES("KHLX", "#{khlx,jdbcType=DECIMAL}");
        }
        
        if (record.getZjlb() != null) {
            VALUES("ZJLB", "#{zjlb,jdbcType=DECIMAL}");
        }
        
        if (record.getZjbh() != null) {
            VALUES("ZJBH", "#{zjbh,jdbcType=VARCHAR}");
        }
        
        if (record.getZjdz() != null) {
            VALUES("ZJDZ", "#{zjdz,jdbcType=VARCHAR}");
        }
        
        if (record.getZjyxq() != null) {
            VALUES("ZJYXQ", "#{zjyxq,jdbcType=VARCHAR}");
        }
        
        if (record.getKhzt() != null) {
            VALUES("KHZT", "#{khzt,jdbcType=DECIMAL}");
        }
        
        if (record.getWtfs() != null) {
            VALUES("WTFS", "#{wtfs,jdbcType=DECIMAL}");
        }
        
        if (record.getFwxm() != null) {
            VALUES("FWXM", "#{fwxm,jdbcType=DECIMAL}");
        }
        
        if (record.getKhjl() != null) {
            VALUES("KHJL", "#{khjl,jdbcType=DECIMAL}");
        }
        
        if (record.getTzgw() != null) {
            VALUES("TZGW", "#{tzgw,jdbcType=DECIMAL}");
        }
        
        if (record.getKhkh() != null) {
            VALUES("KHKH", "#{khkh,jdbcType=VARCHAR}");
        }
        
        if (record.getKhrq() != null) {
            VALUES("KHRQ", "#{khrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXhrq() != null) {
            VALUES("XHRQ", "#{xhrq,jdbcType=DECIMAL}");
        }
        
        if (record.getKhsx() != null) {
            VALUES("KHSX", "#{khsx,jdbcType=DECIMAL}");
        }
        
        if (record.getTzzfl() != null) {
            VALUES("TZZFL", "#{tzzfl,jdbcType=DECIMAL}");
        }
        
        if (record.getFxcsnl() != null) {
            VALUES("FXCSNL", "#{fxcsnl,jdbcType=DECIMAL}");
        }
        
        if (record.getTzpz() != null) {
            VALUES("TZPZ", "#{tzpz,jdbcType=DECIMAL}");
        }
        
        if (record.getTzqx() != null) {
            VALUES("TZQX", "#{tzqx,jdbcType=DECIMAL}");
        }
        
        if (record.getPcrq() != null) {
            VALUES("PCRQ", "#{pcrq,jdbcType=DECIMAL}");
        }
        
        if (record.getQdwd() != null) {
            VALUES("QDWD", "#{qdwd,jdbcType=DECIMAL}");
        }
        
        if (record.getYwfw() != null) {
            VALUES("YWFW", "#{ywfw,jdbcType=DECIMAL}");
        }
        
        if (record.getKhjb() != null) {
            VALUES("KHJB", "#{khjb,jdbcType=DECIMAL}");
        }
        
        if (record.getKhqz() != null) {
            VALUES("KHQZ", "#{khqz,jdbcType=VARCHAR}");
        }
        
        if (record.getSj() != null) {
            VALUES("SJ", "#{sj,jdbcType=VARCHAR}");
        }
        
        if (record.getDh() != null) {
            VALUES("DH", "#{dh,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            VALUES("EMAIL", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getCz() != null) {
            VALUES("CZ", "#{cz,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            VALUES("QQ", "#{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getMsn() != null) {
            VALUES("MSN", "#{msn,jdbcType=VARCHAR}");
        }
        
        if (record.getDz() != null) {
            VALUES("DZ", "#{dz,jdbcType=VARCHAR}");
        }
        
        if (record.getYzbm() != null) {
            VALUES("YZBM", "#{yzbm,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("PROVINCE", "#{province,jdbcType=DECIMAL}");
        }
        
        if (record.getCity() != null) {
            VALUES("CITY", "#{city,jdbcType=DECIMAL}");
        }
        
        if (record.getSec() != null) {
            VALUES("SEC", "#{sec,jdbcType=DECIMAL}");
        }
        
        if (record.getSex() != null) {
            VALUES("SEX", "#{sex,jdbcType=DECIMAL}");
        }
        
        if (record.getCsrq() != null) {
            VALUES("CSRQ", "#{csrq,jdbcType=DECIMAL}");
        }
        
        if (record.getHyzk() != null) {
            VALUES("HYZK", "#{hyzk,jdbcType=DECIMAL}");
        }
        
        if (record.getZydm() != null) {
            VALUES("ZYDM", "#{zydm,jdbcType=DECIMAL}");
        }
        
        if (record.getXl() != null) {
            VALUES("XL", "#{xl,jdbcType=DECIMAL}");
        }
        
        if (record.getDwmc() != null) {
            VALUES("DWMC", "#{dwmc,jdbcType=VARCHAR}");
        }
        
        if (record.getHylb() != null) {
            VALUES("HYLB", "#{hylb,jdbcType=DECIMAL}");
        }
        
        if (record.getDwxz() != null) {
            VALUES("DWXZ", "#{dwxz,jdbcType=DECIMAL}");
        }
        
        if (record.getXzzw() != null) {
            VALUES("XZZW", "#{xzzw,jdbcType=DECIMAL}");
        }
        
        if (record.getDwdz() != null) {
            VALUES("DWDZ", "#{dwdz,jdbcType=VARCHAR}");
        }
        
        if (record.getDwdh() != null) {
            VALUES("DWDH", "#{dwdh,jdbcType=VARCHAR}");
        }
        
        if (record.getDwyb() != null) {
            VALUES("DWYB", "#{dwyb,jdbcType=VARCHAR}");
        }
        
        if (record.getTbts() != null) {
            VALUES("TBTS", "#{tbts,jdbcType=VARCHAR}");
        }
        
        if (record.getGj() != null) {
            VALUES("GJ", "#{gj,jdbcType=DECIMAL}");
        }
        
        if (record.getMz() != null) {
            VALUES("MZ", "#{mz,jdbcType=DECIMAL}");
        }
        
        return SQL();
    }

    public String updateByPrimaryKeySelective(Khxx record) {
        BEGIN();
        UPDATE("TFP_KHXX");
        
        if (record.getKhh() != null) {
            SET("KHH = #{khh,jdbcType=VARCHAR}");
        }
        
        if (record.getKhxm() != null) {
            SET("KHXM = #{khxm,jdbcType=VARCHAR}");
        }
        
        if (record.getKhqc() != null) {
            SET("KHQC = #{khqc,jdbcType=VARCHAR}");
        }
        
        if (record.getPydm() != null) {
            SET("PYDM = #{pydm,jdbcType=VARCHAR}");
        }
        
        if (record.getYyb() != null) {
            SET("YYB = #{yyb,jdbcType=DECIMAL}");
        }
        
        if (record.getKhlx() != null) {
            SET("KHLX = #{khlx,jdbcType=DECIMAL}");
        }
        
        if (record.getZjlb() != null) {
            SET("ZJLB = #{zjlb,jdbcType=DECIMAL}");
        }
        
        if (record.getZjbh() != null) {
            SET("ZJBH = #{zjbh,jdbcType=VARCHAR}");
        }
        
        if (record.getZjdz() != null) {
            SET("ZJDZ = #{zjdz,jdbcType=VARCHAR}");
        }
        
        if (record.getZjyxq() != null) {
            SET("ZJYXQ = #{zjyxq,jdbcType=VARCHAR}");
        }
        
        if (record.getKhzt() != null) {
            SET("KHZT = #{khzt,jdbcType=DECIMAL}");
        }
        
        if (record.getWtfs() != null) {
            SET("WTFS = #{wtfs,jdbcType=DECIMAL}");
        }
        
        if (record.getFwxm() != null) {
            SET("FWXM = #{fwxm,jdbcType=DECIMAL}");
        }
        
        if (record.getKhjl() != null) {
            SET("KHJL = #{khjl,jdbcType=DECIMAL}");
        }
        
        if (record.getTzgw() != null) {
            SET("TZGW = #{tzgw,jdbcType=DECIMAL}");
        }
        
        if (record.getKhkh() != null) {
            SET("KHKH = #{khkh,jdbcType=VARCHAR}");
        }
        
        if (record.getKhrq() != null) {
            SET("KHRQ = #{khrq,jdbcType=DECIMAL}");
        }
        
        if (record.getXhrq() != null) {
            SET("XHRQ = #{xhrq,jdbcType=DECIMAL}");
        }
        
        if (record.getKhsx() != null) {
            SET("KHSX = #{khsx,jdbcType=DECIMAL}");
        }
        
        if (record.getTzzfl() != null) {
            SET("TZZFL = #{tzzfl,jdbcType=DECIMAL}");
        }
        
        if (record.getFxcsnl() != null) {
            SET("FXCSNL = #{fxcsnl,jdbcType=DECIMAL}");
        }
        
        if (record.getTzpz() != null) {
            SET("TZPZ = #{tzpz,jdbcType=DECIMAL}");
        }
        
        if (record.getTzqx() != null) {
            SET("TZQX = #{tzqx,jdbcType=DECIMAL}");
        }
        
        if (record.getPcrq() != null) {
            SET("PCRQ = #{pcrq,jdbcType=DECIMAL}");
        }
        
        if (record.getQdwd() != null) {
            SET("QDWD = #{qdwd,jdbcType=DECIMAL}");
        }
        
        if (record.getYwfw() != null) {
            SET("YWFW = #{ywfw,jdbcType=DECIMAL}");
        }
        
        if (record.getKhjb() != null) {
            SET("KHJB = #{khjb,jdbcType=DECIMAL}");
        }
        
        if (record.getKhqz() != null) {
            SET("KHQZ = #{khqz,jdbcType=VARCHAR}");
        }
        
        if (record.getSj() != null) {
            SET("SJ = #{sj,jdbcType=VARCHAR}");
        }
        
        if (record.getDh() != null) {
            SET("DH = #{dh,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getCz() != null) {
            SET("CZ = #{cz,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            SET("QQ = #{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getMsn() != null) {
            SET("MSN = #{msn,jdbcType=VARCHAR}");
        }
        
        if (record.getDz() != null) {
            SET("DZ = #{dz,jdbcType=VARCHAR}");
        }
        
        if (record.getYzbm() != null) {
            SET("YZBM = #{yzbm,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("PROVINCE = #{province,jdbcType=DECIMAL}");
        }
        
        if (record.getCity() != null) {
            SET("CITY = #{city,jdbcType=DECIMAL}");
        }
        
        if (record.getSec() != null) {
            SET("SEC = #{sec,jdbcType=DECIMAL}");
        }
        
        if (record.getSex() != null) {
            SET("SEX = #{sex,jdbcType=DECIMAL}");
        }
        
        if (record.getCsrq() != null) {
            SET("CSRQ = #{csrq,jdbcType=DECIMAL}");
        }
        
        if (record.getHyzk() != null) {
            SET("HYZK = #{hyzk,jdbcType=DECIMAL}");
        }
        
        if (record.getZydm() != null) {
            SET("ZYDM = #{zydm,jdbcType=DECIMAL}");
        }
        
        if (record.getXl() != null) {
            SET("XL = #{xl,jdbcType=DECIMAL}");
        }
        
        if (record.getDwmc() != null) {
            SET("DWMC = #{dwmc,jdbcType=VARCHAR}");
        }
        
        if (record.getHylb() != null) {
            SET("HYLB = #{hylb,jdbcType=DECIMAL}");
        }
        
        if (record.getDwxz() != null) {
            SET("DWXZ = #{dwxz,jdbcType=DECIMAL}");
        }
        
        if (record.getXzzw() != null) {
            SET("XZZW = #{xzzw,jdbcType=DECIMAL}");
        }
        
        if (record.getDwdz() != null) {
            SET("DWDZ = #{dwdz,jdbcType=VARCHAR}");
        }
        
        if (record.getDwdh() != null) {
            SET("DWDH = #{dwdh,jdbcType=VARCHAR}");
        }
        
        if (record.getDwyb() != null) {
            SET("DWYB = #{dwyb,jdbcType=VARCHAR}");
        }
        
        if (record.getTbts() != null) {
            SET("TBTS = #{tbts,jdbcType=VARCHAR}");
        }
        
        if (record.getGj() != null) {
            SET("GJ = #{gj,jdbcType=DECIMAL}");
        }
        
        if (record.getMz() != null) {
            SET("MZ = #{mz,jdbcType=DECIMAL}");
        }
        
        WHERE("ID = #{id,jdbcType=DECIMAL}");
        
        return SQL();
    }
}