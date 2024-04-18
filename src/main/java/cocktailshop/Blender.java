/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailshop;

import java.awt.Color;
import java.util.HashSet;

/**
 *
 * @author barah
 */
public class Blender {
        private double capacity;
        private HashSet<Ingredients>ingredients;// use hash set to avoid rpetitions 

    public Blender(double capacity) {
        this.capacity = capacity;
        this.ingredients = new HashSet<>(); 

    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setIngredients(HashSet<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public double getCapacity() {
        return capacity;
    }

    public HashSet<Ingredients> getIngredients() {
        return ingredients;
    }
    public void addIngredients( Ingredients ingredients ){ //just for part one  
        this.ingredients.add(ingredients);
        
        
        
    }  
      public Cocktail blend(){ //just for the first part
        return new Cocktail(0, 0, Color.white); 
    }
    public void pourCocktail(Cup cup ){ //just for the frist part  
        System.out.println("Cocktail pouring ");
   }
    public int getTotalCalories(){ //just for the first part
        return 0;
    }
    public double getVolume(){ //just for the first part
        return 0;
    }
   
    public void getCocktailColor (){ //just for the first part
    }
    public String getInfo(){ //get info method 
        return "Capcity :" + this.capacity + "\n" 
        + "Ingredients" + this.ingredients ;
    }
    
}
