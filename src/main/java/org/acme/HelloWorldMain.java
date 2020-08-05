package org.acme;

import javax.enterprise.context.control.ActivateRequestContext;
import javax.inject.Inject;

import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class HelloWorldMain implements QuarkusApplication {

  @Inject
  GreeterService greeterService;

  @Override
  @ActivateRequestContext
  public int run(String... args) throws Exception {   
    System.out.println(greeterService.greet(args.length > 0 ? args[0] : null));
    return 0;
  }
    
}