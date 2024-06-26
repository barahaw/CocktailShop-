/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailshop;

/**
 *
 * @author barah
 */
public abstract  class Ingredients {

    private String name;
    private int calories;

    public Ingredients(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public abstract double getVolume();

    public int getCalories() {
        return calories;
    }

    public abstract String getInfo() ;
       
}
