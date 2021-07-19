package test.lvchao.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(value = {MyBeanPostProcessor.class})
@ComponentScan(basePackages = "test.lvchao")
public class CustomConfig {

}