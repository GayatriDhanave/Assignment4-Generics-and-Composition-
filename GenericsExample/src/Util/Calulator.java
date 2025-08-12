package Util;

public class Calulator <T extends Number>{
    public double sum(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }
    public double sub(T a, T b){
        return a.doubleValue()-b.doubleValue();
    }

}
