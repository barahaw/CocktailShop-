/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailshop;

/**
 *
 * @author barah
 */
public class Cup {

    private double capacity;
    private Cocktail contentCocktail;
    private int calories;

    public Cup() {
    }

    
    public Cup(double capacity) {
        this.capacity = capacity;
    }



    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Cocktail getContentCocktail() {
        return contentCocktail;
    }

    public void setContentCocktail(Cocktail contentCocktail) {
        this.contentCocktail = contentCocktail;
    }


    public String getInfo() {
        return "Cup Capacity: " + this.capacity + "ml" + "\n" + "Calories per cup" + this.getCalories()   ;
    }
}
