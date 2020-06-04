package scfchapter6.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：huabin
 * @date ：Created in 2020/6/4 15:10
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class ConfigController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/hi")
    public String getFoo(){
        return foo;
    }

}
