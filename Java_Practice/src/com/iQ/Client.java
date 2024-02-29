package com.iQ;

//Example of Chain of Responsibility

//Handler interface
interface Handler {
 void handleRequest(String request);
}

//Concrete Handlers
class ConcreteHandler1 implements Handler {
 private Handler nextHandler;

 public void setNextHandler(Handler handler) {
     nextHandler = handler;
 }

 @Override
 public void handleRequest(String request) {
     if (request.equals("Type1")) {
         System.out.println("Handled by ConcreteHandler1");
     } else if (nextHandler != null) {
         nextHandler.handleRequest(request);
     }
 }
}

class ConcreteHandler2 implements Handler {
 private Handler nextHandler;

 public void setNextHandler(Handler handler) {
     nextHandler = handler;
 }

 @Override
 public void handleRequest(String request) {
     if (request.equals("Type2")) {
         System.out.println("Handled by ConcreteHandler2");
     } else if (nextHandler != null) {
         nextHandler.handleRequest(request);
     }
 }
}


public class Client {
	
	public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();

        ((ConcreteHandler1) handler1).setNextHandler(handler2);

        handler1.handleRequest("Type1"); // Output: Handled by ConcreteHandler1
        handler1.handleRequest("Type2"); // Output: Handled by ConcreteHandler2
        handler1.handleRequest("Type3"); // No output, as no handler can process Type3
    }
}

