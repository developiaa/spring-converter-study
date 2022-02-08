package study.developia.converter.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import study.developia.converter.enums.ImageStatus;

@Slf4j
@RestController
@RequestMapping("/enums")
public class EnumTestController {

    @GetMapping
    public String converterView(@RequestParam(name = "status", required = false, defaultValue = "PENDING")
                                        ImageStatus status) {
        log.info("ImageStatus : {}", status);
        return "OK";
    }
}
