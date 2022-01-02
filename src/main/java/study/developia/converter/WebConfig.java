package study.developia.converter;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import study.developia.converter.converter.IntegerToStringConverter;
import study.developia.converter.converter.IpPortToStringConverter;
import study.developia.converter.converter.StringToIntegerConverter;
import study.developia.converter.converter.StringToIpPortConverter;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //converter에 확장된 개념
        registry.addConverter(new StringToIpPortConverter());
        registry.addConverter(new StringToIntegerConverter());
        registry.addConverter(new IpPortToStringConverter());
        registry.addConverter(new IntegerToStringConverter());
    }
}
