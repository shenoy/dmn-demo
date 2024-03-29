package com.example.dmn;

import java.util.HashMap;
import java.util.Map;
import org.camunda.bpm.engine.ProcessEngines;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    Map<String,Object> variables = new HashMap<>();
    variables.put("age", 19);
    ProcessEngines.getDefaultProcessEngine()
        .getRuntimeService()
        .startProcessInstanceByKey("dmn-process", variables);
  }
}