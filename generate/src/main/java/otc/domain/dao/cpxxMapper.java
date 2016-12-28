package otc.domain.dao;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import otc.domain.model.cpxx;

public interface cpxxMapper {
    @Select({"SELECT ID, CPDM, ",
        "CPDM_XT, CPJP, CPFL, ",
        "CPMC, CPQC, SYLX, ",
        "CPLX, FXPJ, FXJB_FXF, ",
        "TZQX, TZPZ, CPPJ, ",
        "JYS, FXJG, JGDM, ",
        "JGLB, JGMC, ZLXS, ",
        "SFRX, SFXCP, CXGX, ",
        "ZYCD, BZ, CPZT, ",
        "SJBZ, SJRQ, CPJZ, ",
        "LJJZ, ZSP, ZXJ, ",
        "CLRQ, DQRQ, FXGM, ",
        "CPGM, YQSYL, SJSYL, ",
        "TZFG, ZJTX, GLJG, ",
        "JJS, CPJL, JZZS, ",
        "NTS, JZRQ, SFQWFX, ",
        "FXFW, ZFFS, RGQD, ",
        "RGZJQD, RGJS, RGQD_JG, ",
        "RGZJQD_JG, RGJS_JG, ",
        "SGQD, SGZJQD, SGJS, ",
        "SGQD_JG, SGZJQD_JG, ",
        "SGJS_JG, SHQD, SHJS, ",
        "BFSHYEXX, DBJESX, ",
        "DHJESX, DHDRLJSX, ",
        "DXZED, ZRSXZ, ZRRXZRS, ",
        "RGDXXZ, SFYY, YYSH, ",
        "YYSHQD, QYJEXZ, ",
        "JYTD, CDKZ, QYFS, ",
        "ZBQY, FXBPPXZ, JYZT, ",
        "XGSJ, XGR, YYKSRQ, ",
        "YYJSRQ, RGKSRQ, ",
        "RGJSRQ, JYKSSJ, JYJSSJ, ",
        "JYRLSZFS, WTXX, ",
        "WTSX, JYDW, JYJS, ",
        "ZDBJ, ZGBJ, JYJW, ",
        "XQXZ, ZRFS, JYXZ, ",
        "XJMS, MMXZ, SPHYXYW, ",
        "FHFS, SFFS, XEFZ, ",
        "FBKSSJ, FBYYJSSJ, ",
        "FBZED, DBFBSX, FBEDXZBL, ",
        "FBSLXZ, PXGZ  FROM VFP_CPXX_ALL WHERE CPDM =#{cpdm,jdbcType=JdbcType.VARCHAR}"})
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.DECIMAL),
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
        @Result(column="JGDM", property="jgdm", jdbcType=JdbcType.VARCHAR),
        @Result(column="JGLB", property="jglb", jdbcType=JdbcType.DECIMAL),
        @Result(column="JGMC", property="jgmc", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZLXS", property="zlxs", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFRX", property="sfrx", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFXCP", property="sfxcp", jdbcType=JdbcType.DECIMAL),
        @Result(column="CXGX", property="cxgx", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZYCD", property="zycd", jdbcType=JdbcType.DECIMAL),
        @Result(column="BZ", property="bz", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPZT", property="cpzt", jdbcType=JdbcType.DECIMAL),
        @Result(column="SJBZ", property="sjbz", jdbcType=JdbcType.DECIMAL),
        @Result(column="SJRQ", property="sjrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPJZ", property="cpjz", jdbcType=JdbcType.DECIMAL),
        @Result(column="LJJZ", property="ljjz", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZSP", property="zsp", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZXJ", property="zxj", jdbcType=JdbcType.DECIMAL),
        @Result(column="CLRQ", property="clrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="DQRQ", property="dqrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXGM", property="fxgm", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPGM", property="cpgm", jdbcType=JdbcType.DECIMAL),
        @Result(column="YQSYL", property="yqsyl", jdbcType=JdbcType.DECIMAL),
        @Result(column="SJSYL", property="sjsyl", jdbcType=JdbcType.DECIMAL),
        @Result(column="TZFG", property="tzfg", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZJTX", property="zjtx", jdbcType=JdbcType.DECIMAL),
        @Result(column="GLJG", property="gljg", jdbcType=JdbcType.DECIMAL),
        @Result(column="JJS", property="jjs", jdbcType=JdbcType.DECIMAL),
        @Result(column="CPJL", property="cpjl", jdbcType=JdbcType.DECIMAL),
        @Result(column="JZZS", property="jzzs", jdbcType=JdbcType.DECIMAL),
        @Result(column="NTS", property="nts", jdbcType=JdbcType.DECIMAL),
        @Result(column="JZRQ", property="jzrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFQWFX", property="sfqwfx", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXFW", property="fxfw", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZFFS", property="zffs", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGQD", property="rgqd", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGZJQD", property="rgzjqd", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGJS", property="rgjs", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGQD_JG", property="rgqdJg", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGZJQD_JG", property="rgzjqdJg", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGJS_JG", property="rgjsJg", jdbcType=JdbcType.DECIMAL),
        @Result(column="SGQD", property="sgqd", jdbcType=JdbcType.DECIMAL),
        @Result(column="SGZJQD", property="sgzjqd", jdbcType=JdbcType.DECIMAL),
        @Result(column="SGJS", property="sgjs", jdbcType=JdbcType.DECIMAL),
        @Result(column="SGQD_JG", property="sgqdJg", jdbcType=JdbcType.DECIMAL),
        @Result(column="SGZJQD_JG", property="sgzjqdJg", jdbcType=JdbcType.DECIMAL),
        @Result(column="SGJS_JG", property="sgjsJg", jdbcType=JdbcType.DECIMAL),
        @Result(column="SHQD", property="shqd", jdbcType=JdbcType.DECIMAL),
        @Result(column="SHJS", property="shjs", jdbcType=JdbcType.DECIMAL),
        @Result(column="BFSHYEXX", property="bfshyexx", jdbcType=JdbcType.DECIMAL),
        @Result(column="DBJESX", property="dbjesx", jdbcType=JdbcType.DECIMAL),
        @Result(column="DHJESX", property="dhjesx", jdbcType=JdbcType.DECIMAL),
        @Result(column="DHDRLJSX", property="dhdrljsx", jdbcType=JdbcType.DECIMAL),
        @Result(column="DXZED", property="dxzed", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZRSXZ", property="zrsxz", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZRRXZRS", property="zrrxzrs", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGDXXZ", property="rgdxxz", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFYY", property="sfyy", jdbcType=JdbcType.DECIMAL),
        @Result(column="YYSH", property="yysh", jdbcType=JdbcType.DECIMAL),
        @Result(column="YYSHQD", property="yyshqd", jdbcType=JdbcType.DECIMAL),
        @Result(column="QYJEXZ", property="qyjexz", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYTD", property="jytd", jdbcType=JdbcType.VARCHAR),
        @Result(column="CDKZ", property="cdkz", jdbcType=JdbcType.DECIMAL),
        @Result(column="QYFS", property="qyfs", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZBQY", property="zbqy", jdbcType=JdbcType.DECIMAL),
        @Result(column="FXBPPXZ", property="fxbppxz", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYZT", property="jyzt", jdbcType=JdbcType.DECIMAL),
        @Result(column="XGSJ", property="xgsj", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="XGR", property="xgr", jdbcType=JdbcType.DECIMAL),
        @Result(column="YYKSRQ", property="yyksrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="YYJSRQ", property="yyjsrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGKSRQ", property="rgksrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="RGJSRQ", property="rgjsrq", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYKSSJ", property="jykssj", jdbcType=JdbcType.CHAR),
        @Result(column="JYJSSJ", property="jyjssj", jdbcType=JdbcType.CHAR),
        @Result(column="JYRLSZFS", property="jyrlszfs", jdbcType=JdbcType.DECIMAL),
        @Result(column="WTXX", property="wtxx", jdbcType=JdbcType.DECIMAL),
        @Result(column="WTSX", property="wtsx", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYDW", property="jydw", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYJS", property="jyjs", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZDBJ", property="zdbj", jdbcType=JdbcType.DECIMAL),
        @Result(column="ZGBJ", property="zgbj", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYJW", property="jyjw", jdbcType=JdbcType.DECIMAL),
        @Result(column="XQXZ", property="xqxz", jdbcType=JdbcType.VARCHAR),
        @Result(column="ZRFS", property="zrfs", jdbcType=JdbcType.DECIMAL),
        @Result(column="JYXZ", property="jyxz", jdbcType=JdbcType.VARCHAR),
        @Result(column="XJMS", property="xjms", jdbcType=JdbcType.VARCHAR),
        @Result(column="MMXZ", property="mmxz", jdbcType=JdbcType.DECIMAL),
        @Result(column="SPHYXYW", property="sphyxyw", jdbcType=JdbcType.VARCHAR),
        @Result(column="FHFS", property="fhfs", jdbcType=JdbcType.DECIMAL),
        @Result(column="SFFS", property="sffs", jdbcType=JdbcType.DECIMAL),
        @Result(column="XEFZ", property="xefz", jdbcType=JdbcType.DECIMAL),
        @Result(column="FBKSSJ", property="fbkssj", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FBYYJSSJ", property="fbyyjssj", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="FBZED", property="fbzed", jdbcType=JdbcType.DECIMAL),
        @Result(column="DBFBSX", property="dbfbsx", jdbcType=JdbcType.DECIMAL),
        @Result(column="FBEDXZBL", property="fbedxzbl", jdbcType=JdbcType.DECIMAL),
        @Result(column="FBSLXZ", property="fbslxz", jdbcType=JdbcType.DECIMAL),
        @Result(column="PXGZ", property="pxgz", jdbcType=JdbcType.VARCHAR)
    })
    cpxx selectByExample(String cpdm);
}