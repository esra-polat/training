package L;

public class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}

// As our code describes, we have an engine that we can turn on, and we can increase the power.
// But wait — we are now living in the era of electric cars:

// One possible solution would be to rework our model into interfaces that take into account the engine-less state of our Car.