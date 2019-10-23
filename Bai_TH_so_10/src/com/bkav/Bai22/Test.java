//package com.bkav.Bai22;
//
//public interface IBrakeBehavior {
//    public void brake();
//}
//
//public class BrakeWithABS implements IBrakeBehavior {
//    public void brake() {
//        System.out.println("Brake with ABS applied");
//    }
//}
//
//public class Brake implements IBrakeBehavior {
//    public void brake() {
//        System.out.println("Simple Brake applied");
//    }
//}
//
///* Client that can use the algorithms above interchangeably */
//public abstract class Car {
//    private IBrakeBehavior brakeBehavior;
//
//    public Car(IBrakeBehavior brakeBehavior) {
//      this.brakeBehavior = brakeBehavior;
//    }
//
//    public void applyBrake() {
//        brakeBehavior.brake();
//    }
//
//    public void setBrakeBehavior(IBrakeBehavior brakeType) {
//        this.brakeBehavior = brakeType;
//    }
//}
//
///* Client 1 uses one algorithm (Brake) in the constructor */
//public class Sedan extends Car {
//    public Sedan() {
//        super(new Brake());
//    }
//}
//
///* Client 2 uses another algorithm (BrakeWithABS) in the constructor */
//public class SUV extends Car {
//    public SUV() {
//        super(new BrakeWithABS());
//    }
//}
//
///* Using the Car example */
//public class Test {
//    public static void main(final String[] arguments) {
//        Car sedanCar = new Sedan();
//        sedanCar.applyBrake();  // This will invoke class "Brake"
//
//        Car suvCar = new SUV();
//        suvCar.applyBrake();    // This will invoke class "BrakeWithABS"
//
//        // set brake behavior dynamically
//        suvCar.setBrakeBehavior( new Brake() );
//        suvCar.applyBrake();    // This will invoke class "Brake"
//    }
//}
