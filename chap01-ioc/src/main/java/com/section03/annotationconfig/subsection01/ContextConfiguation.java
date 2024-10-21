package com.section03.annotationconfig.subsection01;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration("configurationSection03")
@ComponentScan(basePackages = "com.common")
public class ContextConfiguation {

}
