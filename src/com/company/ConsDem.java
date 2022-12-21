package com.company;

class Myclass{
    int passenger;
    int fuelcap;
    int mpg;

    Myclass(int p, int f, int m) {
        passenger = p;
        fuelcap = f;
        mpg = m;
    }
    int range(){
        return mpg * fuelcap;
    }
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}

public class ConsDem {
    public static void main(String[] args) {
        Myclass minivan = new Myclass(7,3,2);
        Myclass sportcar  = new Myclass(8,33,8);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println(dist + " " + gallons);
        gallons = sportcar.fuelneeded(dist);
        System.out.println(dist+" "+ gallons);
    }
}
