package com.citytechinc.aem.hermes;


public class HelloApp {

    private HelloService helloService;

    public void init(){
        helloService.sayHello();

    }

    public HelloService getHelloService() {
        return helloService;
    }

    public void setHelloService(HelloService helloService) {
        this.helloService = helloService;
    }
}
