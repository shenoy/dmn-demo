package com.example.dmn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Print implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("***************************************************");
        System.out.println(delegateExecution.getVariable("age"));
        System.out.println(delegateExecution.getVariable("resultVariable"));
    }
}
