package com.example.testingsystem.entity;

public enum Mark {
    A("ОТЛ"),
    B("ХОР"),
    C("УДОВ"),
    D("НЕУД");

    public final String value;

    Mark(String value){
        this.value=value;
    }
}
