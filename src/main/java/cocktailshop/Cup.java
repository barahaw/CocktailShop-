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

    public Cup(double capacity, Cocktail conteCocktail) {
        this.capacity = capacity;
        this.contentCocktail = conteCocktail;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public Cocktail getConteCocktail() {
        return contentCocktail;
    }

    public void setConteCocktail(Cocktail contentCocktail) {
        this.contentCocktail = contentCocktail;
    }
    public void pourCocktail(Cocktail cocktail){
        
    }
    
    public int getContentCalories(){
        return 0;
    }
    
}
