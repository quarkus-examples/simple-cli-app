package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterService {

  public String greet(String name) {
    if(name==null) {
      return "Hello, World";
    } else {
      return "Hello, " + name;
    }

  }
}