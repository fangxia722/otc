package otc.domain.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import otc.domain.model.cpdm;
import otc.domain.model.cpdmExample;

public interface cpdmMapper {
    @Delete({
        "delete from TFP_CPDM",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into TFP_CPDM (ID, CPDM, ",
        "CPDM_XT, CPJP, CPFL, ",
        "CPMC, CPQC, SYLX, ",
        "CPLX, FXPJ, FXJB_FXF, ",
        "TZQX, TZPZ, CPPJ, ",
        "JYS, FXJG, ZLXS, ",
        "SFRX, SFXCP, CXGX, ",
        "ZYCD, BZ, CPZT, ",
        "SJBZ, SJRQ)",
        "values (#{id,jdbcType=DECIMAL}, #{cpdm,jdbcType=VARCHAR}, ",
        "#{cpdmXt,jdbcType=VARCHAR}, #{cpjp,jdbcType=VARCHAR}, #{cpfl,jdbcType=DECIMAL}, ",
        "#{cpmc,jdbcType=VARCHAR}, #{cpqc,jdbcType=VARCHAR}, #{sylx,jdbcType=DECIMAL}, ",
        "#{cplx,jdbcType=DECIMAL}, #{fxpj,jdbcType=DECIMAL}, #{fxjbFxf,jdbcType=DECIMAL}, ",
        "#{tzqx,jdbcType=DECIMAL}, #{tzpz,jdbcType=DECIMAL}, #{cppj,jdbcType=DECIMAL}, ",
        "#{jys,jdbcType=DECIMAL}, #{fxjg,jdbcType=DECIMAL}, #{zlxs,jdbcType=DECIMAL}, ",
        "#{sfrx,jdbcType=DECIMAL}, #{sfxcp,jdbcType=DECIMAL}, #{cxgx,jdbcType=DECIMAL}, ",
        "#{zycd,jdbcType=DECIMAL}, #{bz,jdbcType=DECIMAL}, #{cpzt,jdbcType=DECIMAL}, ",
        "#{sjbz,jdbcType=DECIMAL}, #{sjrq,jdbcType=DECIMAL})"
    })
    int insert(cpdm record);

    @InsertProvider(type=cpdmSqlProvider.class, method="insertSelective")
    int insertSelective(cpdm record);

    @SelectProvider(type=cpdmSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="CPDM", property="cpdm", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPDM_XT", property="cpdmXt", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPJP", property="cpjp", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPFL", property="cpfl", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPMC", property="cpmc", jdbcType=JdbcType.VARCHAR),
        @Result(column="CPQC", property="cpqc", jdbcType=JdbcType.VARCHAR),
        @Result(column="SYLX", property="sylx", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPLX", property="cplx", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXPJ", property="fxpj", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXJB_FXF", property="fxjbFxf", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZQX", property="tzqx", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZPZ", property="tzpz", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPPJ", property="cppj", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYS", property="jys", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXJG", property="fxjg", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZLXS", property="zlxs", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFRX", property="sfrx", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFXCP", property="sfxcp", jdbcType=JdbcType.DECIMAL),
        @Result(column="CXGX", property="cxgx", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZYCD", property="zycd", jdbcType=JdbcType.DECIMAL),
        @Result(column="BZ", property="bz", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPZT", property="cpzt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SJBZ", property="sjbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="SJRQ", property="sjrq", jdbcType=JdbcType.DECIMAL)
    })
    List<cpdm> selectByExample(cpdmExample example);

    @UpdateProvider(type=cpdmSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(cpdm record);

    @Update({
        "update TFP_CPDM",
        "set CPDM = #{cpdm,jdbcType=VARCHAR},",
          "CPDM_XT = #{cpdmXt,jdbcType=VARCHAR},",
          "CPJP = #{cpjp,jdbcType=VARCHAR},",
          "CPFL = #{cpfl,jdbcType=DECIMAL},",
          "CPMC = #{cpmc,jdbcType=VARCHAR},",
          "CPQC = #{cpqc,jdbcType=VARCHAR},",
          "SYLX = #{sylx,jdbcType=DECIMAL},",
          "CPLX = #{cplx,jdbcType=DECIMAL},",
          "FXPJ = #{fxpj,jdbcType=DECIMAL},",
          "FXJB_FXF = #{fxjbFxf,jdbcType=DECIMAL},",
          "TZQX = #{tzqx,jdbcType=DECIMAL},",
          "TZPZ = #{tzpz,jdbcType=DECIMAL},",
          "CPPJ = #{cppj,jdbcType=DECIMAL},",
          "JYS = #{jys,jdbcType=DECIMAL},",
          "FXJG = #{fxjg,jdbcType=DECIMAL},",
          "ZLXS = #{zlxs,jdbcType=DECIMAL},",
          "SFRX = #{sfrx,jdbcType=DECIMAL},",
          "SFXCP = #{sfxcp,jdbcType=DECIMAL},",
          "CXGX = #{cxgx,jdbcType=DECIMAL},",
          "ZYCD = #{zycd,jdbcType=DECIMAL},",
          "BZ = #{bz,jdbcType=DECIMAL},",
          "CPZT = #{cpzt,jdbcType=DECIMAL},",
          "SJBZ = #{sjbz,jdbcType=DECIMAL},",
          "SJRQ = #{sjrq,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(cpdm record);
}