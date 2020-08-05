package org.acme;

import io.quarkus.runtime.Quarkus;

public class JavaMain {

  public static void main(String[] args) {
    Quarkus.run(HelloWorldMain.class, args);
  }

    
}