package hello.springmvc.basic.requestmapping;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MappingController {
    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/hello-basic")
    public String helloBasic(){
        log.info("hello-basic");
        return "ok";
    }


    @GetMapping( "/mapping/{userId}")
    public String mappingPat(@PathVariable("userId") String userId){
        log.info("mappingPath userId={}", userId);
        return "ok";
    }
}
