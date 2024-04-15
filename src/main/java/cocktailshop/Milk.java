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
public class Milk extends Ingredients{
    
     double vloume ;
     Color color ;

    public Milk(String name, int calories,double volume,Color color) {
        super(name, calories);
        this.vloume=volume;
        this.color=color;
    }

    public void setVloume(double vloume) {
        this.vloume = vloume;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getVloume() {
        return vloume;
    }

    public Color getColor() {
        return color;
    }
     @Override
    public String getInfo(){
    return  "Vloume: "  + this.vloume  + "\n" + "color: " + this.color  + "\n"+ super.getInfo();
}
     
}
