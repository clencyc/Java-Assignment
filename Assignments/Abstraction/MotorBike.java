package Abstraction;

abstract class MotorBike {
    abstract void brake();
  }
  
  class SportsBike extends MotorBike {
      
    // implementation of abstract method
    public void brake() {
      System.out.println("SportsBike Brake");
    }
  }
  
  class MountainBike extends MotorBike {
    // implementation of abstract method
    public void brake() {
      System.out.println("MountainBike Brake");
    }
  }