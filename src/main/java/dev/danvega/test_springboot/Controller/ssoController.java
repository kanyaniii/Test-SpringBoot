package dev.danvega.test_springboot.Controller;

import dev.danvega.test_springboot.Entity.ssoEntity;
import dev.danvega.test_springboot.Service.ssoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apitest")
@Tag(name = "SSO Test API", description = "API for generating SSO tokens")
public class ssoController {
    private final ssoService service;

    @Autowired
    public ssoController(ssoService service) {
        this.service = service;
    }

    @PostMapping("/gentoken")
    @Operation(summary = "Generate a token and store user test data")
    public ssoEntity generateToken(@RequestBody ssoEntity request) {
        request.setRequestDate(java.time.LocalDateTime.now());
        return service.save(request);
    }
}
