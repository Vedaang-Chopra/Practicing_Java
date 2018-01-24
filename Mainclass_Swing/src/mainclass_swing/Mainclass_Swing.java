/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainclass_swing;


/**
 *
 * @author Atharva Sahani*
 */class A extends Thread{
       ss myFrame;
       
       A(){
        ss myFrame = new ss();
         System.out.println("Normal screen  started");
         try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
          System.out.println("Normal screen  ended");
         myFrame.disposefunction();
         
       }
               }
  class A1 extends Thread{
       ss1 myFrame1;
       public void run (){
    try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
      myFrame1 = new ss1();
      System.out.println("start thread screen 1");
      try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
          System.out.println(" thread screen 1  ended");
         myFrame1.disposefunction();
   }
  }   
class A2 extends Thread{
        ss2 myFrame2;
      public void run(){
    try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
      myFrame2 = new ss2();
       System.out.println("start thread screen 2");   
        try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
          System.out.println(" thread screen 2  ended");
         myFrame2.disposefunction();
   }
  }   
class A3 extends Thread{
        ss3 myFrame3;
       public void run(){
    try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
      myFrame3 = new ss3();
      System.out.println("start thread screen 3");
       try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
          System.out.println(" thread screen 3  ended");
         myFrame3.disposefunction();
   }
  }   
class A4 extends Thread{
        ss4 myFrame4;
      public void run(){ 
    try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
      myFrame4 = new ss4();
      System.out.println("start thread screen 4");
       try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
          System.out.println(" thread screen 4  ended");
         myFrame4.disposefunction();
   }
  }  

 public class Mainclass_Swing{
   
    
    public static void main(String[] args){
           int flag=0;
            A b=new A();
            A1 b1=new A1();
            A2 b2=new A2();
            A3 b3=new A3();
            A4 b4=new A4();
            b1.start();
            
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
            b2.start();
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
            b3.start();
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
            b4.start();
             try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);}
       //you can edit myFrame's properties here.
    }
} 
 
