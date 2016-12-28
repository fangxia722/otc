package otc.domain.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import otc.domain.model.Khtzzh;

public interface KhtzzhMapper {
    @Delete({
        "delete from TFP_KHTZZH",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into TFP_KHTZZH (ID, KHH, ",
        "YYB, FXJG, TZZH, ",
        "ZHMC, ZHMM, JYZH, ",
        "JSZH, JSLX, JSJG, ",
        "FHFS, ZHZT, ZHSX, ",
        "JYQX, ZDSX, HYBH, ",
        "PBU, JSBZ, ZHFXDJ, ",
        "FXJB_FXF, PCRQ, KHRQ, ",
        "XHRQ, SJ, DH, ",
        "CZ, DZ, YZBM, ",
        "KHH_DC, YDSQYBZ)",
        "values (#{id,jdbcType=DECIMAL}, #{khh,jdbcType=DECIMAL}, ",
        "#{yyb,jdbcType=DECIMAL}, #{fxjg,jdbcType=DECIMAL}, #{tzzh,jdbcType=VARCHAR}, ",
        "#{zhmc,jdbcType=VARCHAR}, #{zhmm,jdbcType=VARCHAR}, #{jyzh,jdbcType=VARCHAR}, ",
        "#{jszh,jdbcType=VARCHAR}, #{jslx,jdbcType=DECIMAL}, #{jsjg,jdbcType=VARCHAR}, ",
        "#{fhfs,jdbcType=DECIMAL}, #{zhzt,jdbcType=DECIMAL}, #{zhsx,jdbcType=DECIMAL}, ",
        "#{jyqx,jdbcType=DECIMAL}, #{zdsx,jdbcType=DECIMAL}, #{hybh,jdbcType=VARCHAR}, ",
        "#{pbu,jdbcType=VARCHAR}, #{jsbz,jdbcType=DECIMAL}, #{zhfxdj,jdbcType=DECIMAL}, ",
        "#{fxjbFxf,jdbcType=DECIMAL}, #{pcrq,jdbcType=DECIMAL}, #{khrq,jdbcType=DECIMAL}, ",
        "#{xhrq,jdbcType=DECIMAL}, #{sj,jdbcType=VARCHAR}, #{dh,jdbcType=VARCHAR}, ",
        "#{cz,jdbcType=VARCHAR}, #{dz,jdbcType=VARCHAR}, #{yzbm,jdbcType=VARCHAR}, ",
        "#{khhDc,jdbcType=VARCHAR}, #{ydsqybz,jdbcType=DECIMAL})"
    })
    int insert(Khtzzh record);

    @InsertProvider(type=KhtzzhSqlProvider.class, method="insertSelective")
    int insertSelective(Khtzzh record);

    @Select({
        "select",
        "ID, KHH, YYB, FXJG, TZZH, ZHMC, ZHMM, JYZH, JSZH, JSLX, JSJG, FHFS, ZHZT, ZHSX, ",
        "JYQX, ZDSX, HYBH, PBU, JSBZ, ZHFXDJ, FXJB_FXF, PCRQ, KHRQ, XHRQ, SJ, DH, CZ, ",
        "DZ, YZBM, KHH_DC, YDSQYBZ",
        "from TFP_KHTZZH",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="KHH", property="khh", jdbcType=JdbcType.DECIMAL),
        @Result(column="YYB", property="yyb", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXJG", property="fxjg", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZZH", property="tzzh", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZHMC", property="zhmc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZHMM", property="zhmm", jdbcType=JdbcType.VARCHAR),
        @Result(column="JYZH", property="jyzh", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSZH", property="jszh", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSLX", property="jslx", jdbcType=JdbcType.DECIMAL),
        @Result(column="JSJG", property="jsjg", jdbcType=JdbcType.VARCHAR),
        @Result(column="FHFS", property="fhfs", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZHZT", property="zhzt", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZHSX", property="zhsx", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYQX", property="jyqx", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZDSX", property="zdsx", jdbcType=JdbcType.DECIMAL),
        @Result(column="HYBH", property="hybh", jdbcType=JdbcType.VARCHAR),
        @Result(column="PBU", property="pbu", jdbcType=JdbcType.VARCHAR),
        @Result(column="JSBZ", property="jsbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZHFXDJ", property="zhfxdj", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXJB_FXF", property="fxjbFxf", jdbcType=JdbcType.DECIMAL),
        @Result(column="PCRQ", property="pcrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHRQ", property="khrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="XHRQ", property="xhrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="SJ", property="sj", jdbcType=JdbcType.VARCHAR),
        @Result(column="DH", property="dh", jdbcType=JdbcType.VARCHAR),
        @Result(column="CZ", property="cz", jdbcType=JdbcType.VARCHAR),
        @Result(column="DZ", property="dz", jdbcType=JdbcType.VARCHAR),
        @Result(column="YZBM", property="yzbm", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHH_DC", property="khhDc", jdbcType=JdbcType.VARCHAR),
        @Result(column="YDSQYBZ", property="ydsqybz", jdbcType=JdbcType.DECIMAL)
    })
    Khtzzh selectByPrimaryKey(Long id);

    @UpdateProvider(type=KhtzzhSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Khtzzh record);

    @Update({
        "update TFP_KHTZZH",
        "set KHH = #{khh,jdbcType=DECIMAL},",
          "YYB = #{yyb,jdbcType=DECIMAL},",
          "FXJG = #{fxjg,jdbcType=DECIMAL},",
          "TZZH = #{tzzh,jdbcType=VARCHAR},",
          "ZHMC = #{zhmc,jdbcType=VARCHAR},",
          "ZHMM = #{zhmm,jdbcType=VARCHAR},",
          "JYZH = #{jyzh,jdbcType=VARCHAR},",
          "JSZH = #{jszh,jdbcType=VARCHAR},",
          "JSLX = #{jslx,jdbcType=DECIMAL},",
          "JSJG = #{jsjg,jdbcType=VARCHAR},",
          "FHFS = #{fhfs,jdbcType=DECIMAL},",
          "ZHZT = #{zhzt,jdbcType=DECIMAL},",
          "ZHSX = #{zhsx,jdbcType=DECIMAL},",
          "JYQX = #{jyqx,jdbcType=DECIMAL},",
          "ZDSX = #{zdsx,jdbcType=DECIMAL},",
          "HYBH = #{hybh,jdbcType=VARCHAR},",
          "PBU = #{pbu,jdbcType=VARCHAR},",
          "JSBZ = #{jsbz,jdbcType=DECIMAL},",
          "ZHFXDJ = #{zhfxdj,jdbcType=DECIMAL},",
          "FXJB_FXF = #{fxjbFxf,jdbcType=DECIMAL},",
          "PCRQ = #{pcrq,jdbcType=DECIMAL},",
          "KHRQ = #{khrq,jdbcType=DECIMAL},",
          "XHRQ = #{xhrq,jdbcType=DECIMAL},",
          "SJ = #{sj,jdbcType=VARCHAR},",
          "DH = #{dh,jdbcType=VARCHAR},",
          "CZ = #{cz,jdbcType=VARCHAR},",
          "DZ = #{dz,jdbcType=VARCHAR},",
          "YZBM = #{yzbm,jdbcType=VARCHAR},",
          "KHH_DC = #{khhDc,jdbcType=VARCHAR},",
          "YDSQYBZ = #{ydsqybz,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Khtzzh record);
}