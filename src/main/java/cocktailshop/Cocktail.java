/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailshop;

import java.awt.Color;

/**
 *
 * @author barah
 */
public class Cocktail {

    private int calories;
    private double volume;
    Color color;

    public Cocktail(int calories, double volume, Color cololr) {
        this.calories = calories;
        this.volume = volume;
        this.color = cololr;
    }

    public Cocktail() {
    }
    

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color cololr) {
        this.color = cololr;
    }

    public String getInfo() {
        return "Cocktail info: " + "\n"
                + "Calories: " + this.calories + "\n"
                + "Volume: " + this.volume + "ml\n"
                + "Color: " + this.color.toString();
    }
}
