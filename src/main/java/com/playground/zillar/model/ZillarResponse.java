package com.playground.zillar.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ZillarResponse<T> {

    private T data;
    private String code;
    private String msg;
    
}
