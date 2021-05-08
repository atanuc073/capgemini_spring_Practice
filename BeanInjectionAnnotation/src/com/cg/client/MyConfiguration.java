package com.cg.client;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com")
// it scans annotations @component,@Service,@Controller,@RestController
//Repository
// under com package having annotated component find classes
public class MyConfiguration {

}
