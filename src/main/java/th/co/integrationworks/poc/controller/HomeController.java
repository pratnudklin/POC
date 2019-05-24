package th.co.integrationworks.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import th.co.integrationworks.poc.entity.Wifi;
import th.co.integrationworks.poc.repository.AssetRepository;
import th.co.integrationworks.poc.repository.TenantRepository;
import th.co.integrationworks.poc.repository.UserRepository;
import th.co.integrationworks.poc.repository.WifiRepository;

import java.util.LinkedList;
import java.util.List;

@RestController
public class HomeController {


    @Autowired
    private WifiRepository wifiRepository;

    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AssetRepository assetRepository;

    @RequestMapping("/")
    public List<Object> show(){
        List list = new LinkedList();

        System.out.println(wifiRepository.count());
        System.out.println(tenantRepository.count());
        System.out.println(userRepository.count());
        System.out.println(assetRepository.count());
        wifiRepository.findAll().stream().forEach((a)->{

            list.add(a);

        });
        return list;
    }

}
