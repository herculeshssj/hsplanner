package br.com.hslife.hsplanner.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "helloworld")
@ViewScoped
public class HelloWorldBean implements Serializable {

    public String getMessage() {
        return "Hello World from Fuertefentura";
    }
    
}
