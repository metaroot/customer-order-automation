package com.cms.orderservices.customerorderautomation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class TestController {

    @GetMapping(path="/test")
    public String test() {
        return "Test";
    }

    @GetMapping(path="/test-bean")
    public TestBean testBean() {
        return new TestBean("Test");
    }

    @GetMapping(path="/test-bean/path-variable/{name}")
    public TestBean testBeanPathVar(@PathVariable String name) {
        return new TestBean(String.format("Test %s", name) );
    }
}
