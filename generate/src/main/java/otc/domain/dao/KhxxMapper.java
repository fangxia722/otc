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
import otc.domain.model.Khxx;

public interface KhxxMapper {
    @Delete({
        "delete from TFP_KHXX",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into TFP_KHXX (ID, KHH, ",
        "KHXM, KHQC, PYDM, ",
        "YYB, KHLX, ZJLB, ",
        "ZJBH, ZJDZ, ZJYXQ, ",
        "KHZT, WTFS, FWXM, ",
        "KHJL, TZGW, KHKH, ",
        "KHRQ, XHRQ, KHSX, ",
        "TZZFL, FXCSNL, TZPZ, ",
        "TZQX, PCRQ, QDWD, ",
        "YWFW, KHJB, KHQZ, ",
        "SJ, DH, EMAIL, ",
        "CZ, QQ, MSN, ",
        "DZ, YZBM, PROVINCE, ",
        "CITY, SEC, SEX, ",
        "CSRQ, HYZK, ZYDM, ",
        "XL, DWMC, HYLB, ",
        "DWXZ, XZZW, DWDZ, ",
        "DWDH, DWYB, TBTS, ",
        "GJ, MZ)",
        "values (#{id,jdbcType=DECIMAL}, #{khh,jdbcType=VARCHAR}, ",
        "#{khxm,jdbcType=VARCHAR}, #{khqc,jdbcType=VARCHAR}, #{pydm,jdbcType=VARCHAR}, ",
        "#{yyb,jdbcType=DECIMAL}, #{khlx,jdbcType=DECIMAL}, #{zjlb,jdbcType=DECIMAL}, ",
        "#{zjbh,jdbcType=VARCHAR}, #{zjdz,jdbcType=VARCHAR}, #{zjyxq,jdbcType=VARCHAR}, ",
        "#{khzt,jdbcType=DECIMAL}, #{wtfs,jdbcType=DECIMAL}, #{fwxm,jdbcType=DECIMAL}, ",
        "#{khjl,jdbcType=DECIMAL}, #{tzgw,jdbcType=DECIMAL}, #{khkh,jdbcType=VARCHAR}, ",
        "#{khrq,jdbcType=DECIMAL}, #{xhrq,jdbcType=DECIMAL}, #{khsx,jdbcType=DECIMAL}, ",
        "#{tzzfl,jdbcType=DECIMAL}, #{fxcsnl,jdbcType=DECIMAL}, #{tzpz,jdbcType=DECIMAL}, ",
        "#{tzqx,jdbcType=DECIMAL}, #{pcrq,jdbcType=DECIMAL}, #{qdwd,jdbcType=DECIMAL}, ",
        "#{ywfw,jdbcType=DECIMAL}, #{khjb,jdbcType=DECIMAL}, #{khqz,jdbcType=VARCHAR}, ",
        "#{sj,jdbcType=VARCHAR}, #{dh,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{cz,jdbcType=VARCHAR}, #{qq,jdbcType=VARCHAR}, #{msn,jdbcType=VARCHAR}, ",
        "#{dz,jdbcType=VARCHAR}, #{yzbm,jdbcType=VARCHAR}, #{province,jdbcType=DECIMAL}, ",
        "#{city,jdbcType=DECIMAL}, #{sec,jdbcType=DECIMAL}, #{sex,jdbcType=DECIMAL}, ",
        "#{csrq,jdbcType=DECIMAL}, #{hyzk,jdbcType=DECIMAL}, #{zydm,jdbcType=DECIMAL}, ",
        "#{xl,jdbcType=DECIMAL}, #{dwmc,jdbcType=VARCHAR}, #{hylb,jdbcType=DECIMAL}, ",
        "#{dwxz,jdbcType=DECIMAL}, #{xzzw,jdbcType=DECIMAL}, #{dwdz,jdbcType=VARCHAR}, ",
        "#{dwdh,jdbcType=VARCHAR}, #{dwyb,jdbcType=VARCHAR}, #{tbts,jdbcType=VARCHAR}, ",
        "#{gj,jdbcType=DECIMAL}, #{mz,jdbcType=DECIMAL})"
    })
    int insert(Khxx record);

    @InsertProvider(type=KhxxSqlProvider.class, method="insertSelective")
    int insertSelective(Khxx record);

    @Select({
        "select",
        "ID, KHH, KHXM, KHQC, PYDM, YYB, KHLX, ZJLB, ZJBH, ZJDZ, ZJYXQ, KHZT, WTFS, FWXM, ",
        "KHJL, TZGW, KHKH, KHRQ, XHRQ, KHSX, TZZFL, FXCSNL, TZPZ, TZQX, PCRQ, QDWD, YWFW, ",
        "KHJB, KHQZ, SJ, DH, EMAIL, CZ, QQ, MSN, DZ, YZBM, PROVINCE, CITY, SEC, SEX, ",
        "CSRQ, HYZK, ZYDM, XL, DWMC, HYLB, DWXZ, XZZW, DWDZ, DWDH, DWYB, TBTS, GJ, MZ",
        "from TFP_KHXX",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL, id=true),
        @Result(column="KHH", property="khh", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHXM", property="khxm", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHQC", property="khqc", jdbcType=JdbcType.VARCHAR),
        @Result(column="PYDM", property="pydm", jdbcType=JdbcType.VARCHAR),
        @Result(column="YYB", property="yyb", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHLX", property="khlx", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZJLB", property="zjlb", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZJBH", property="zjbh", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZJDZ", property="zjdz", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZJYXQ", property="zjyxq", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHZT", property="khzt", jdbcType=JdbcType.DECIMAL),
        @Result(column="WTFS", property="wtfs", jdbcType=JdbcType.DECIMAL),
        @Result(column="FWXM", property="fwxm", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHJL", property="khjl", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZGW", property="tzgw", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHKH", property="khkh", jdbcType=JdbcType.VARCHAR),
        @Result(column="KHRQ", property="khrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="XHRQ", property="xhrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHSX", property="khsx", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZZFL", property="tzzfl", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXCSNL", property="fxcsnl", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZPZ", property="tzpz", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZQX", property="tzqx", jdbcType=JdbcType.DECIMAL),
        @Result(column="PCRQ", property="pcrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="QDWD", property="qdwd", jdbcType=JdbcType.DECIMAL),
        @Result(column="YWFW", property="ywfw", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHJB", property="khjb", jdbcType=JdbcType.DECIMAL),
        @Result(column="KHQZ", property="khqz", jdbcType=JdbcType.VARCHAR),
        @Result(column="SJ", property="sj", jdbcType=JdbcType.VARCHAR),
        @Result(column="DH", property="dh", jdbcType=JdbcType.VARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="CZ", property="cz", jdbcType=JdbcType.VARCHAR),
        @Result(column="QQ", property="qq", jdbcType=JdbcType.VARCHAR),
        @Result(column="MSN", property="msn", jdbcType=JdbcType.VARCHAR),
        @Result(column="DZ", property="dz", jdbcType=JdbcType.VARCHAR),
        @Result(column="YZBM", property="yzbm", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.DECIMAL),
        @Result(column="CITY", property="city", jdbcType=JdbcType.DECIMAL),
        @Result(column="SEC", property="sec", jdbcType=JdbcType.DECIMAL),
        @Result(column="SEX", property="sex", jdbcType=JdbcType.DECIMAL),
        @Result(column="CSRQ", property="csrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="HYZK", property="hyzk", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZYDM", property="zydm", jdbcType=JdbcType.DECIMAL),
        @Result(column="XL", property="xl", jdbcType=JdbcType.DECIMAL),
        @Result(column="DWMC", property="dwmc", jdbcType=JdbcType.VARCHAR),
        @Result(column="HYLB", property="hylb", jdbcType=JdbcType.DECIMAL),
        @Result(column="DWXZ", property="dwxz", jdbcType=JdbcType.DECIMAL),
        @Result(column="XZZW", property="xzzw", jdbcType=JdbcType.DECIMAL),
        @Result(column="DWDZ", property="dwdz", jdbcType=JdbcType.VARCHAR),
        @Result(column="DWDH", property="dwdh", jdbcType=JdbcType.VARCHAR),
        @Result(column="DWYB", property="dwyb", jdbcType=JdbcType.VARCHAR),
        @Result(column="TBTS", property="tbts", jdbcType=JdbcType.VARCHAR),
        @Result(column="GJ", property="gj", jdbcType=JdbcType.DECIMAL),
        @Result(column="MZ", property="mz", jdbcType=JdbcType.DECIMAL)
    })
    Khxx selectByPrimaryKey(Long id);

    @UpdateProvider(type=KhxxSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Khxx record);

    @Update({
        "update TFP_KHXX",
        "set KHH = #{khh,jdbcType=VARCHAR},",
          "KHXM = #{khxm,jdbcType=VARCHAR},",
          "KHQC = #{khqc,jdbcType=VARCHAR},",
          "PYDM = #{pydm,jdbcType=VARCHAR},",
          "YYB = #{yyb,jdbcType=DECIMAL},",
          "KHLX = #{khlx,jdbcType=DECIMAL},",
          "ZJLB = #{zjlb,jdbcType=DECIMAL},",
          "ZJBH = #{zjbh,jdbcType=VARCHAR},",
          "ZJDZ = #{zjdz,jdbcType=VARCHAR},",
          "ZJYXQ = #{zjyxq,jdbcType=VARCHAR},",
          "KHZT = #{khzt,jdbcType=DECIMAL},",
          "WTFS = #{wtfs,jdbcType=DECIMAL},",
          "FWXM = #{fwxm,jdbcType=DECIMAL},",
          "KHJL = #{khjl,jdbcType=DECIMAL},",
          "TZGW = #{tzgw,jdbcType=DECIMAL},",
          "KHKH = #{khkh,jdbcType=VARCHAR},",
          "KHRQ = #{khrq,jdbcType=DECIMAL},",
          "XHRQ = #{xhrq,jdbcType=DECIMAL},",
          "KHSX = #{khsx,jdbcType=DECIMAL},",
          "TZZFL = #{tzzfl,jdbcType=DECIMAL},",
          "FXCSNL = #{fxcsnl,jdbcType=DECIMAL},",
          "TZPZ = #{tzpz,jdbcType=DECIMAL},",
          "TZQX = #{tzqx,jdbcType=DECIMAL},",
          "PCRQ = #{pcrq,jdbcType=DECIMAL},",
          "QDWD = #{qdwd,jdbcType=DECIMAL},",
          "YWFW = #{ywfw,jdbcType=DECIMAL},",
          "KHJB = #{khjb,jdbcType=DECIMAL},",
          "KHQZ = #{khqz,jdbcType=VARCHAR},",
          "SJ = #{sj,jdbcType=VARCHAR},",
          "DH = #{dh,jdbcType=VARCHAR},",
          "EMAIL = #{email,jdbcType=VARCHAR},",
          "CZ = #{cz,jdbcType=VARCHAR},",
          "QQ = #{qq,jdbcType=VARCHAR},",
          "MSN = #{msn,jdbcType=VARCHAR},",
          "DZ = #{dz,jdbcType=VARCHAR},",
          "YZBM = #{yzbm,jdbcType=VARCHAR},",
          "PROVINCE = #{province,jdbcType=DECIMAL},",
          "CITY = #{city,jdbcType=DECIMAL},",
          "SEC = #{sec,jdbcType=DECIMAL},",
          "SEX = #{sex,jdbcType=DECIMAL},",
          "CSRQ = #{csrq,jdbcType=DECIMAL},",
          "HYZK = #{hyzk,jdbcType=DECIMAL},",
          "ZYDM = #{zydm,jdbcType=DECIMAL},",
          "XL = #{xl,jdbcType=DECIMAL},",
          "DWMC = #{dwmc,jdbcType=VARCHAR},",
          "HYLB = #{hylb,jdbcType=DECIMAL},",
          "DWXZ = #{dwxz,jdbcType=DECIMAL},",
          "XZZW = #{xzzw,jdbcType=DECIMAL},",
          "DWDZ = #{dwdz,jdbcType=VARCHAR},",
          "DWDH = #{dwdh,jdbcType=VARCHAR},",
          "DWYB = #{dwyb,jdbcType=VARCHAR},",
          "TBTS = #{tbts,jdbcType=VARCHAR},",
          "GJ = #{gj,jdbcType=DECIMAL},",
          "MZ = #{mz,jdbcType=DECIMAL}",
        "where ID = #{id,jdbcType=DECIMAL}"
    })
    int updateByPrimaryKey(Khxx record);
}