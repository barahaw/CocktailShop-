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
public class Fruits extends Ingredients {

    double vloume;
    Color color;

    public Fruits(String name, int calories, double volume, Color color) {
        super(name, calories);
        this.vloume = volume;
        this.color = color;
    }

    @Override
    public double getVolume() {
        return vloume;
    }

    public Color getColor() {
        return color;
    }

    public void setVloume(double vloume) {
        this.vloume = vloume;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Vloume: " + this.vloume + "\n" + "color: " + this.color + super.getInfo();
    }

}
