package otc.Ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import otc.domain.model.Cpxx;
@RestController
@EnableAutoConfiguration
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "callback")
    @RequestMapping(value = "/cp", method = RequestMethod.GET)
    public Cpxx cp() {
        return restTemplate.getForEntity("http://cpxx.interface/abtain?cpdm=000929", Cpxx.class).getBody();
    }
    public Cpxx callback(){
    	Cpxx result = new Cpxx();
    	result.setCpdm("000929");
    	return result;
    }
}
