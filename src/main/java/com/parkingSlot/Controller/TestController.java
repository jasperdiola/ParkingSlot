package com.parkingSlot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/Testing")
public class TestController {
    
    /*
        http://localhost:8080/Testing/{id}
     */
    @GetMapping("/{id}")
    public String testController(@PathVariable("id") int id) {
        return String.format("Pakyu ng madami mga %d....", id);
    }
    
    /*
        http://localhost:8080/Testing?keyword={keyword}
     */
    @GetMapping("/param")  
    public String testController(@RequestParam(name = "keyword", defaultValue = "none") String keyword) {
        return String.format("For Testing Only %s", keyword);
    }
}
