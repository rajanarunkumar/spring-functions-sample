package com.example.serverless.xplatform.functions;

import java.util.Objects;
import java.util.function.Function;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ObjectUtils;

@Configuration
public class Greeter implements Function<String, String> {

  @Override
  public String apply(String s) {
    return "Hello ".concat(Objects.isNull(s) || ObjectUtils.isEmpty(s) ? "World" : s);
  }
}
