package atu.ie.studentservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name= "Connected", url = "http:localhost8081/details")
public interface Communication {
    @PostMapping("/confirm-details")
    String somedetails(Student student);
}
