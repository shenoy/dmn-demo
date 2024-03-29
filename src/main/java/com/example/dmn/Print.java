package com.example.dmn;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class Print implements JavaDelegate {
    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        System.out.println("***************************************************");
        System.out.println(delegateExecution.getVariable("currentSeason"));
        System.out.println(delegateExecution.getVariable("numberOfGuests"));
        System.out.println(delegateExecution.getVariable("resultVariable"));
    }
}
