package otc.domain.dao;

import java.math.BigDecimal;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import otc.domain.model.khjszfzh;

public interface khjszfzhMapper {
    @Delete({
        "delete from TFP_KHJSZFZH",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(BigDecimal id);

    @Insert({
        "insert into TFP_KHJSZFZH (ID, NAME, ",
        "KHID, KHH, JSJG, ",
        "JGDM, JSZH, ZHMC, ",
        "KHYH, ZHLB, JSLX, ",
        "ZHZT, ZJSYSJ, ",
        "KHRQ, XHRQ, XYBZ, ",
        "MRBZ, BZ)",
        "values (#{id,jdbcType=DECIMAL}, #{name,jdbcType=VARCHAR}, ",
        "#{khid,jdbcType=DECIMAL}, #{khh,jdbcType=VARCHAR}, #{jsjg,jdbcType=DECIMAL}, ",
        "#{jgdm,jdbcType=VARCHAR}, #{jszh,jdbcType=VARCHAR}, #{zhmc,jdbcType=VARCHAR}, ",
        "#{khyh,jdbcType=VARCHAR}, #{zhlb,jdbcType=DECIMAL}, #{jslx,jdbcType=DECIMAL}, ",
        "#{zhzt,jdbcType=DECIMAL}, #{zjsysj,jdbcType=TIMESTAMP}, ",
        "#{khrq,jdbcType=DECIMAL}, #{xhrq,jdbcType=DECIMAL}, #{xybz,jdbcType=DECIMAL}, ",
        "#{mrbz,jdbcType=DECIMAL}, #{bz,jdbcType=DECIMAL})"
    })
    int insert(khjszfzh record);

    @InsertProvider(type=khjszfzhSqlProvider.class, method="insertSelective")
    int insertSelective(khjszfzh record);

    @Select({
        "select",
        "ID, NAME, KHID, KHH, JSJG, JGDM, JSZH, ZHMC, KHYH, ZHLB, JSLX, ZHZT, ZJSYSJ, ",
        "KHRQ, XHRQ, XYBZ, MRBZ, BZ",
        "from TFP_KHJSZFZH",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHID", property="khid", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHH", property="khh", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSJG", property="jsjg", jdbcType=JdbcType.DECIMAL),
        @Result(column="JGDM", property="jgdm", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSZH", property="jszh", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZHMC", property="zhmc", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHYH", property="khyh", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZHLB", property="zhlb", jdbcType=JdbcType.DECIMAL),
        @Result(column="JSLX", property="jslx", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZHZT", property="zhzt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZJSYSJ", property="zjsysj", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="KHRQ", property="khrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="XHRQ", property="xhrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="XYBZ", property="xybz", jdbcType=JdbcType.DECIMAL),
        @Result(column="MRBZ", property="mrbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="BZ", property="bz", jdbcType=JdbcType.DECIMAL)
    })
    khjszfzh selectByPrimaryKey(BigDecimal id);

    @UpdateProvider(type=khjszfzhSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(khjszfzh record);

    @Update({
        "update TFP_KHJSZFZH",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "KHID = #{khid,jdbcType=DECIMAL},",
          "KHH = #{khh,jdbcType=VARCHAR},",
          "JSJG = #{jsjg,jdbcType=DECIMAL},",
          "JGDM = #{jgdm,jdbcType=VARCHAR},",
          "JSZH = #{jszh,jdbcType=VARCHAR},",
          "ZHMC = #{zhmc,jdbcType=VARCHAR},",
          "KHYH = #{khyh,jdbcType=VARCHAR},",
          "ZHLB = #{zhlb,jdbcType=DECIMAL},",
          "JSLX = #{jslx,jdbcType=DECIMAL},",
          "ZHZT = #{zhzt,jdbcType=DECIMAL},",
          "ZJSYSJ = #{zjsysj,jdbcType=TIMESTAMP},",
          "KHRQ = #{khrq,jdbcType=DECIMAL},",
          "XHRQ = #{xhrq,jdbcType=DECIMAL},",
          "XYBZ = #{xybz,jdbcType=DECIMAL},",
          "MRBZ = #{mrbz,jdbcType=DECIMAL},",
          "BZ = #{bz,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(khjszfzh record);
}