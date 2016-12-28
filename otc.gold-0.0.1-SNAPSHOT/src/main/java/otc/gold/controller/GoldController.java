package otc.gold.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.chinastock.security.apexfix.FixAdapter;
import cn.com.chinastock.security.apexfix.FixException;
import cn.com.chinastock.security.apexfix.FixOutput;
import otc.domain.dao.KhtzzhDao;
import otc.domain.dao.KhxxDao;
import otc.domain.model.Khjszfzh;
import otc.domain.model.Khxx;

@RestController
@EnableAutoConfiguration
public class GoldController {
	@Autowired
	private KhtzzhDao khtzzhDao;
	@Autowired
	private KhxxDao khxxDao;

	public KhtzzhDao getKhtzzhDao() {
		return khtzzhDao;
	}

	public void setKhtzzhDao(KhtzzhDao khtzzhDao) {
		this.khtzzhDao = khtzzhDao;
	}

	@RequestMapping("/receive")
	public Map<String, Object> receive(Khxx khxx) {
		Map<String, Object> result = new HashMap<String, Object>();
		List<Khxx> khxxs = khxxDao.selectKhs(khxx);
		if (khxxs.size() > 1) {
			result.put("FID_CODE", "-1");
			result.put("FID_MESSAGE", "MUT CUSTOMS GET!");
			return result;
		}
		if (khxxs.size() == 0) {
			result.put("FID_CODE", "-2");
			result.put("FID_MESSAGE", "CUSTOMS NOT EXSIT!");
			return result;
		}
		khxx = khxxs.get(0);
		Khjszfzh khjszfzh = null;
		if ((khjszfzh = khxx.getLczh()) == null) {
			result.put("FID_CODE", "-3");
			result.put("FID_MESSAGE", "LCZH NOT EXSIT!");
			return result;
		}
		/* 如果没有开通产品账户，则进行开通 */
		if (khxx.getKhtzzh(Long.valueOf(484)) == null) {
			try {
				ArrayList<String> inputParms = new ArrayList<String>();
				inputParms.add("OprUserCode" + "^^" + "wwyh");
				inputParms.add("OprMode" + "^^" + "8");
				inputParms.add("OprOrgNo" + "^^" + khxx.getYyb());
				inputParms.add("FID_KHH" + "^^" + khxx.getKhh());
				inputParms.add("FID_NODE" + "^^" + InetAddress.getLocalHost().toString());
				inputParms.add("FID_YYB" + "^^" + khxx.getYyb().toString());
				inputParms.add("FID_JGDM" + "^^" + "BSGS");
				inputParms.add("FID_JSJG" + "^^" + (khjszfzh.getJsjg() == 0 ? "0000" : khjszfzh.getJsjg().toString()));
				inputParms.add("FID_ZJZH" + "^^" + khjszfzh.getJszh());
				inputParms.add("FID_JSLX" + "^^" + khjszfzh.getJslx().toString());
				inputParms.add("FID_BZ" + "^^" + "0");
				String[] input = new String[inputParms.size()];
				input = inputParms.toArray(input);
				ArrayList<String> outputParms = new ArrayList<String>();
				outputParms.add("FID_FEZH");
				outputParms.add("FID_LSH");
				outputParms.add("FID_CODE");
				outputParms.add("FID_MESSAGE");
				String[] output = new String[outputParms.size()];
				output = outputParms.toArray(output);

				FixOutput out = FixAdapter.invokeFixServerEx("665107", "", input, output);
				if (Long.valueOf(out.getReturnCode()) < 0) {
					result.put("FID_CODE", out.getReturnCode());
					result.put("FID_MESSAGE", out.getResultMessage());
					return result;
				}
			} catch (FixException e) {
				result.put("FID_CODE", "-4");
				result.put("FID_MESSAGE", e.toString());
				return result;
			} catch (UnknownHostException e) {
				result.put("FID_CODE", "-5");
				result.put("FID_MESSAGE", e.toString());
				return result;
			}
		}
		// 做非交易过户
		try {
			ArrayList<String> inputParms = new ArrayList<String>();
			inputParms.add("OprUserCode" + "^^" + "wwyh");
			inputParms.add("OprMode" + "^^" + "8");
			inputParms.add("OprOrgNo" + "^^" + khxx.getYyb());
			inputParms.add("FID_KHH" + "^^" + khxx.getKhh());
			inputParms.add("FID_NODE" + "^^" + InetAddress.getLocalHost().toString());
			inputParms.add("FID_FSYYB" + "^^" + khxx.getYyb().toString());
			inputParms.add("FID_JGDM" + "^^" + "BSGS");
			inputParms.add("FID_CPDM" + "^^" + "000929");
			inputParms.add("FID_YWDM" + "^^" + "098");
			inputParms.add("FID_FEZH" + "^^" + khxx.getKhtzzh(Long.valueOf(484)).getTzzh());
			inputParms.add("FID_WTSL" + "^^" + 1000);
			inputParms.add("FID_GYDM" + "^^" + "wwyh");
			inputParms.add("FID_DFJJZH" + "^^" +"051112879996");
			inputParms.add("FID_DFJYZH" + "^^" +"202800003989");
			inputParms.add("FID_GHYY" + "^^" +"3");			
			String[] input = new String[inputParms.size()];
			input = inputParms.toArray(input);
			ArrayList<String> outputParms = new ArrayList<String>();
			outputParms.add("FID_WTH");
			outputParms.add("FID_CODE");
			outputParms.add("FID_MESSAGE");
			String[] output = new String[outputParms.size()];
			output = outputParms.toArray(output);
			FixOutput out = FixAdapter.invokeFixServerEx("8686", "", input, output);
			if (Long.valueOf(out.getReturnCode()) < 0) {
				result.put("FID_CODE", out.getReturnCode());
				result.put("FID_MESSAGE", out.getResultMessage());
				return result;
			}
		} catch (UnknownHostException e) {
			result.put("FID_CODE", "-5");
			result.put("FID_MESSAGE", e.toString());
			return result;
		} catch (FixException e) {
			result.put("FID_CODE", "-4");
			result.put("FID_MESSAGE", e.toString());
			return result;
		}
		result.put("FID_CODE", "1");
		result.put("FID_MESSAGE", "SUCCESS");
		return result;
	}

	public KhxxDao getKhxxDao() {
		return khxxDao;
	}

	public void setKhxxDao(KhxxDao khxxDao) {
		this.khxxDao = khxxDao;
	}
}
