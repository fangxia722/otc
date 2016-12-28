package otc.gold.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import cn.com.chinastock.security.apexfix.DictException;
import cn.com.chinastock.security.apexfix.FixAdapter;
import otc.gold.controller.ApexCfg;

public class ApexConnReadyListener implements ApplicationListener<ApplicationReadyEvent> {

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		ApexCfg cfg = event.getApplicationContext().getBean(ApexCfg.class);
		try {
			FixAdapter.initialize(cfg.getCvs(), cfg.getUrl(), cfg.getUser(), cfg.getPwd(), true);
		} catch (DictException e) {
			e.printStackTrace();
		}
	}

}
