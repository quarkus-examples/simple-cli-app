package org.acme;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreeterService {

  @ConfigProperty(name = "simple-cli-app.greeting.suffix")
  String suffix;

  public String greet(String name) {
    if(name==null) {
      return "Hello, World" + suffix;
    } else {
      return "Hello, " + name + suffix;
    }

  }
}