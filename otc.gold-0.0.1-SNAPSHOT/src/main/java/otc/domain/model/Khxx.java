package otc.domain.model;

import java.math.BigDecimal;
import java.util.List;

public class Khxx {
	private Long id;

	private String khh;

	private String khxm;

	private String khqc;

	private String pydm;

	private Long yyb;

	private Long khlx;

	private Long zjlb;

	private String zjbh;

	private String zjdz;

	private String zjyxq;

	private Long khzt;

	private BigDecimal wtfs;

	private BigDecimal fwxm;

	private Long khjl;

	private Long tzgw;

	private String khkh;

	private Integer khrq;

	private Integer xhrq;

	private BigDecimal khsx;

	private Long tzzfl;

	private Long fxcsnl;

	private BigDecimal tzpz;

	private BigDecimal tzqx;

	private Integer pcrq;

	private Long qdwd;

	private BigDecimal ywfw;

	private Long khjb;

	private String khqz;

	private String sj;

	private String dh;

	private String email;

	private String cz;

	private String qq;

	private String msn;

	private String dz;

	private String yzbm;

	private Long province;

	private Long city;

	private Long sec;

	private Long sex;

	private Integer csrq;

	private Long hyzk;

	private Long zydm;

	private Long xl;

	private String dwmc;

	private Long hylb;

	private Long dwxz;

	private Long xzzw;

	private String dwdz;

	private String dwdh;

	private String dwyb;

	private String tbts;

	private Long gj;

	private Long mz;
	private List<Khtzzh> khtzzhs;
	private List<Khjszfzh> khjszfzhs;

	/**
	 * 获取相应的理财账号
	 * 
	 * @return
	 */
	public Khjszfzh getLczh() {
		for (Khjszfzh khjszfzh : khjszfzhs) {
			if (khjszfzh.getJslx() == 2) {
				return khjszfzh;
			}
		}
		return null;
	}
    /**
     * 根据发行机构代码查询相应的投资账户信息
     * @param fxjg 发行机构代码
     * @return
     */
	public Khtzzh getKhtzzh(Long fxjg) {
		for(Khtzzh khtzzh:khtzzhs){
			if(khtzzh.getFxjg().equals(fxjg)){
				return khtzzh;
			}
		}
		return null;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKhh() {
		return khh;
	}

	public void setKhh(String khh) {
		this.khh = khh == null ? null : khh.trim();
	}

	public String getKhxm() {
		return khxm;
	}

	public void setKhxm(String khxm) {
		this.khxm = khxm == null ? null : khxm.trim();
	}

	public String getKhqc() {
		return khqc;
	}

	public void setKhqc(String khqc) {
		this.khqc = khqc == null ? null : khqc.trim();
	}

	public String getPydm() {
		return pydm;
	}

	public void setPydm(String pydm) {
		this.pydm = pydm == null ? null : pydm.trim();
	}

	public Long getYyb() {
		return yyb;
	}

	public void setYyb(Long yyb) {
		this.yyb = yyb;
	}

	public Long getKhlx() {
		return khlx;
	}

	public void setKhlx(Long khlx) {
		this.khlx = khlx;
	}

	public Long getZjlb() {
		return zjlb;
	}

	public void setZjlb(Long zjlb) {
		this.zjlb = zjlb;
	}

	public String getZjbh() {
		return zjbh;
	}

	public void setZjbh(String zjbh) {
		this.zjbh = zjbh == null ? null : zjbh.trim();
	}

	public String getZjdz() {
		return zjdz;
	}

	public void setZjdz(String zjdz) {
		this.zjdz = zjdz == null ? null : zjdz.trim();
	}

	public String getZjyxq() {
		return zjyxq;
	}

	public void setZjyxq(String zjyxq) {
		this.zjyxq = zjyxq == null ? null : zjyxq.trim();
	}

	public Long getKhzt() {
		return khzt;
	}

	public void setKhzt(Long khzt) {
		this.khzt = khzt;
	}

	public BigDecimal getWtfs() {
		return wtfs;
	}

	public void setWtfs(BigDecimal wtfs) {
		this.wtfs = wtfs;
	}

	public BigDecimal getFwxm() {
		return fwxm;
	}

	public void setFwxm(BigDecimal fwxm) {
		this.fwxm = fwxm;
	}

	public Long getKhjl() {
		return khjl;
	}

	public void setKhjl(Long khjl) {
		this.khjl = khjl;
	}

	public Long getTzgw() {
		return tzgw;
	}

	public void setTzgw(Long tzgw) {
		this.tzgw = tzgw;
	}

	public String getKhkh() {
		return khkh;
	}

	public void setKhkh(String khkh) {
		this.khkh = khkh == null ? null : khkh.trim();
	}

	public Integer getKhrq() {
		return khrq;
	}

	public void setKhrq(Integer khrq) {
		this.khrq = khrq;
	}

	public Integer getXhrq() {
		return xhrq;
	}

	public void setXhrq(Integer xhrq) {
		this.xhrq = xhrq;
	}

	public BigDecimal getKhsx() {
		return khsx;
	}

	public void setKhsx(BigDecimal khsx) {
		this.khsx = khsx;
	}

	public Long getTzzfl() {
		return tzzfl;
	}

	public void setTzzfl(Long tzzfl) {
		this.tzzfl = tzzfl;
	}

	public Long getFxcsnl() {
		return fxcsnl;
	}

	public void setFxcsnl(Long fxcsnl) {
		this.fxcsnl = fxcsnl;
	}

	public BigDecimal getTzpz() {
		return tzpz;
	}

	public void setTzpz(BigDecimal tzpz) {
		this.tzpz = tzpz;
	}

	public BigDecimal getTzqx() {
		return tzqx;
	}

	public void setTzqx(BigDecimal tzqx) {
		this.tzqx = tzqx;
	}

	public Integer getPcrq() {
		return pcrq;
	}

	public void setPcrq(Integer pcrq) {
		this.pcrq = pcrq;
	}

	public Long getQdwd() {
		return qdwd;
	}

	public void setQdwd(Long qdwd) {
		this.qdwd = qdwd;
	}

	public BigDecimal getYwfw() {
		return ywfw;
	}

	public void setYwfw(BigDecimal ywfw) {
		this.ywfw = ywfw;
	}

	public Long getKhjb() {
		return khjb;
	}

	public void setKhjb(Long khjb) {
		this.khjb = khjb;
	}

	public String getKhqz() {
		return khqz;
	}

	public void setKhqz(String khqz) {
		this.khqz = khqz == null ? null : khqz.trim();
	}

	public String getSj() {
		return sj;
	}

	public void setSj(String sj) {
		this.sj = sj == null ? null : sj.trim();
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh == null ? null : dh.trim();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	public String getCz() {
		return cz;
	}

	public void setCz(String cz) {
		this.cz = cz == null ? null : cz.trim();
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq == null ? null : qq.trim();
	}

	public String getMsn() {
		return msn;
	}

	public void setMsn(String msn) {
		this.msn = msn == null ? null : msn.trim();
	}

	public String getDz() {
		return dz;
	}

	public void setDz(String dz) {
		this.dz = dz == null ? null : dz.trim();
	}

	public String getYzbm() {
		return yzbm;
	}

	public void setYzbm(String yzbm) {
		this.yzbm = yzbm == null ? null : yzbm.trim();
	}

	public Long getProvince() {
		return province;
	}

	public void setProvince(Long province) {
		this.province = province;
	}

	public Long getCity() {
		return city;
	}

	public void setCity(Long city) {
		this.city = city;
	}

	public Long getSec() {
		return sec;
	}

	public void setSec(Long sec) {
		this.sec = sec;
	}

	public Long getSex() {
		return sex;
	}

	public void setSex(Long sex) {
		this.sex = sex;
	}

	public Integer getCsrq() {
		return csrq;
	}

	public void setCsrq(Integer csrq) {
		this.csrq = csrq;
	}

	public Long getHyzk() {
		return hyzk;
	}

	public void setHyzk(Long hyzk) {
		this.hyzk = hyzk;
	}

	public Long getZydm() {
		return zydm;
	}

	public void setZydm(Long zydm) {
		this.zydm = zydm;
	}

	public Long getXl() {
		return xl;
	}

	public void setXl(Long xl) {
		this.xl = xl;
	}

	public String getDwmc() {
		return dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc == null ? null : dwmc.trim();
	}

	public Long getHylb() {
		return hylb;
	}

	public void setHylb(Long hylb) {
		this.hylb = hylb;
	}

	public Long getDwxz() {
		return dwxz;
	}

	public void setDwxz(Long dwxz) {
		this.dwxz = dwxz;
	}

	public Long getXzzw() {
		return xzzw;
	}

	public void setXzzw(Long xzzw) {
		this.xzzw = xzzw;
	}

	public String getDwdz() {
		return dwdz;
	}

	public void setDwdz(String dwdz) {
		this.dwdz = dwdz == null ? null : dwdz.trim();
	}

	public String getDwdh() {
		return dwdh;
	}

	public void setDwdh(String dwdh) {
		this.dwdh = dwdh == null ? null : dwdh.trim();
	}

	public String getDwyb() {
		return dwyb;
	}

	public void setDwyb(String dwyb) {
		this.dwyb = dwyb == null ? null : dwyb.trim();
	}

	public String getTbts() {
		return tbts;
	}

	public void setTbts(String tbts) {
		this.tbts = tbts == null ? null : tbts.trim();
	}

	public Long getGj() {
		return gj;
	}

	public void setGj(Long gj) {
		this.gj = gj;
	}

	public Long getMz() {
		return mz;
	}

	public void setMz(Long mz) {
		this.mz = mz;
	}

	public List<Khtzzh> getKhtzzhs() {
		return khtzzhs;
	}

	public void setKhtzzhs(List<Khtzzh> khtzzhs) {
		this.khtzzhs = khtzzhs;
	}

	public List<Khjszfzh> getKhjszfzhs() {
		return khjszfzhs;
	}

	public void setKhjszfzhs(List<Khjszfzh> khjszfzhs) {
		this.khjszfzhs = khjszfzhs;
	}
}