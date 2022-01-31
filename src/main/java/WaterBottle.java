public class WaterBottle {

    private double volume = 100;

    public double drink(){
        this.volume -= 10;
        return this.volume;
    }

    public double drinkAll(){
        this.volume = 0;
        return this.volume;
    }

    public double fillAll(){
        this.volume = 100;
        return this.volume;
    }

}
