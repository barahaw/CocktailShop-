/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailshop;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author barah
 */
public class Blender {


    private double capacity;
    private ArrayList<Ingredients> ingredients;
    private double volume;

    public Blender(double capacity, double volume, ArrayList<Ingredients> ingredients) {
        this.capacity = capacity;
        this.volume = volume;
        this.ingredients = ingredients;
    }

    public Blender(double capacity) {
        this.capacity = capacity;
        this.ingredients = new ArrayList<>();
    }
       

    public Blender() {
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setIngredients(ArrayList<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getCapacity() {
        return capacity;
    }

    public ArrayList<Ingredients> getIngredients() {
        return ingredients;
    }

    public void addIngredients(Ingredients ingredient) throws BlenderOverflowException {
        if (volume + ingredient.getVolume() <= capacity) {
            this.ingredients.add(ingredient);
            volume += ingredient.getVolume(); // Update the volume of the blender
        } else {
            throw new BlenderOverflowException();
        }
    }

    public Cocktail blend() {
        double totalVolume = getTotalVolume();
        int totalCalories = getTotalCalories();
        int totalRedFruits = 0;
        int totalGreenFruits = 0;
        int totalBlueFruits = 0;
        int countFruits = 0;
        int totalRedMilk = 0;
        int totalGreenMilk = 0;
        int totalBlueMilk = 0;
        int countMilk = 0;

        for (Ingredients ingredient : ingredients) {
            if (ingredient instanceof Fruits) {
                Color ingredientColor = ((Fruits) ingredient).getColor();
                totalRedFruits += ingredientColor.getRed();
                totalGreenFruits += ingredientColor.getGreen();
                totalBlueFruits += ingredientColor.getBlue();
                countFruits++;
            }
            if (ingredient instanceof Milk) {
                Color ingredientColor = ((Milk) ingredient).getColor();
                totalRedMilk += ingredientColor.getRed();
                totalGreenMilk += ingredientColor.getGreen();
                totalBlueMilk += ingredientColor.getBlue();
                countMilk++;
            }
        }

        Color mixedColorFruits = Color.WHITE;
        if (countFruits > 0) {
            int averageRedFruits = totalRedFruits / countFruits;
            int averageGreenFruits = totalGreenFruits / countFruits;
            int averageBlueFruits = totalBlueFruits / countFruits;
            mixedColorFruits = new Color(averageRedFruits, averageGreenFruits, averageBlueFruits);
        }

        Color mixedColorMilk = Color.WHITE;
        if (countMilk > 0) {
            int averageRedMilk = totalRedMilk / countMilk;
            int averageGreenMilk = totalGreenMilk / countMilk;
            int averageBlueMilk = totalBlueMilk / countMilk;
            mixedColorMilk = new Color(averageRedMilk, averageGreenMilk, averageBlueMilk);
        }

        int combinedRed = (mixedColorFruits.getRed() + mixedColorMilk.getRed()) / 2;
        int combinedGreen = (mixedColorFruits.getGreen() + mixedColorMilk.getGreen()) / 2;
        int combinedBlue = (mixedColorFruits.getBlue() + mixedColorMilk.getBlue()) / 2;
        Color blendedColor = new Color(combinedRed, combinedGreen, combinedBlue);

        Cocktail blendedCocktail = new Cocktail(totalCalories, totalVolume, blendedColor);

        return blendedCocktail;
    }

    public int getTotalCalories() {
        int totalCalories = 0;
        for (Ingredients ingredient : ingredients) {
            totalCalories += ingredient.getCalories();

        }
        return totalCalories;
    }

    public double getTotalVolume() {
        double totalValue = 0.0;
        for (Ingredients ingredient : ingredients) {
            totalValue += ingredient.getVolume();
        }
        return totalValue;
    }

    public void pourCocktail(Cup cup) throws BlenderIsEmptyException {
        // Check if the blender is empty
        if (this.volume == 0) {
            throw new BlenderIsEmptyException();
        }

        // Blend the cocktail first
        Cocktail blendedCocktail = blend();

        // Determine if the cup can hold the entire cocktail or just a portion
        if (cup.getCapacity() >= volume) {
            // If cup capacity is sufficient, pour the entire cocktail
            cup.setContentCocktail(blendedCocktail);
            cup.setCalories(blendedCocktail.getCalories()); // Set the calories directly
            volume = 0; // Set blender volume to zero
            ingredients.clear(); // Clear ingredients after pouring
        } else {
            // Partial pouring logic
            double pouredVolume = cup.getCapacity();
            // Calculate the calories based on the proportion of the cocktail poured using the provided equation
            int caloriesInCup = (int) ((blendedCocktail.getCalories() / blendedCocktail.getVolume()) * cup.getCapacity());

            // Create a new cocktail with calculated calories and poured volume
            Cocktail partialCocktail = new Cocktail(
                    caloriesInCup,
                    pouredVolume,
                    blendedCocktail.getColor()
            );

            // Set the cup's content with the new partial cocktail
            cup.setContentCocktail(partialCocktail);
            cup.setCalories(caloriesInCup); // Set the calories for the poured volume

            // Update the blender's remaining volume
            volume -= pouredVolume;
            ingredients.clear(); // Clear ingredients after pouring
        }
    }

    public String getInfo() {
        return "Capacity: " + this.capacity + "\n" + "Ingredients: " + this.ingredients;
    }
}
