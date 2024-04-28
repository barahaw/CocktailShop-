/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package cocktailshop;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author barah
 */
public class CocktailShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Blender blender = new Blender(500);
        Cocktail cocktail = new Cocktail();
        Cup cup = new Cup();
        ArrayList<Ingredients> ingredients = new ArrayList<>();
        System.out.println("Ingredients List:");
        System.out.println("Apple - 52 calories - Red, Green, Yellow - 150 ml");
        System.out.println("Banana - 89 calories - Yellow - 120 ml");
        System.out.println("Orange - 47 calories - Orange - 200 ml");
        System.out.println("Strawberry - 32 calories - Red - 100 ml");
        System.out.println("Grape - 69 calories - Green - 130 ml");
        System.out.println("Blueberry - 57 calories - Blue - 90 ml");
        System.out.println("Mango - 60 calories - Orange - 170 ml");
        System.out.println("Watermelon - 30 calories - Red, Green - 250 ml");
        System.out.println("Kiwi - 61 calories - Green - 110 ml");
        System.out.println("Pineapple - 50 calories - Yellow - 200 ml");
        System.out.println("Milk - 140 calories - White - 300 ml");
        System.out.println("Milk With chocolate - 340 calories - Black - 350 ml");
        System.out.println("Sugar - 240 calories - White - 30 g");
        System.out.println("Color represent RGB List:");
        System.out.println("Red: rgb(" + (255) + ", " + 0 + ", " + 0 + ")");
        System.out.println("Green: rgb(" + 0 + ", " + (255) + ", " + 0 + ")");
        System.out.println("Blue: rgb(" + 0 + ", " + 0 + ", " + (255) + ")");
        System.out.println("White: rgb(" + (255) + ", " + (255) + ", " + (255) + ")");
        System.out.println("Black: rgb(" + 0 + ", " + 0 + ", " + 0 + ")");
        System.out.println("Yellow: rgb(" + (255) + ", " + (255) + ", " + 0 + ")");
        System.out.println("Cyan: rgb(" + 0 + ", " + (255) + ", " + (255) + ")");
        System.out.println("Magenta: rgb(" + (255) + ", " + 0 + ", " + (255) + ")");
        System.out.println("Orange: rgb(" + (255) + ", " + (165) + ", " + 0 + ")");
        System.out.println("Purple: rgb(" + (128) + ", " + 0 + ", " + (128) + ")");
        System.out.println("Gray: rgb(" + (128) + ", " + (128) + ", " + (128) + ")");
        int option;
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Change Blender Capacity:");
            System.out.println("2. Add ingredients to the blender");
            System.out.println("3. Blend ingredients");
            System.out.println("4. Show Cocktail Info");
            System.out.println("5.Pour cocktail into cup");
            System.out.println("6. Show calories per cup");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            option = scanner.nextInt();

            switch (option) {
                case 1: {
                    System.out.println("Enter Blender Capacity to change it: ");
                    blender.setCapacity(scanner.nextDouble());
                }
                break;

                case 2: {
                    System.out.println("Enter fruit name, calories, volume, and color (R G B):");
                    Fruits fruits = new Fruits(scanner.next(), scanner.nextInt(), scanner.nextInt(), new Color(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
                    ingredients.add(fruits);
                    System.out.println("Enter milk name, calories, and volume:");

                    Milk milk = new Milk(scanner.next(), scanner.nextInt(), scanner.nextInt(), Color.white);
                    ingredients.add(milk);
                    System.out.println("Enter sugar name, calories, and volume:");

                    Sugar sugar = new Sugar(scanner.next(), scanner.nextInt(), scanner.nextInt());
                    ingredients.add(sugar);
                    for (Ingredients ingredient : ingredients) {
                        if (ingredient instanceof Fruits)
                            try {
                            blender.addIngredients(ingredient);
                        } catch (BlenderOverflowException ex) {
                            Logger.getLogger(CocktailShop.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        if (ingredient instanceof Milk)
                            try {
                            blender.addIngredients(ingredient);
                        } catch (BlenderOverflowException ex) {
                            System.out.println(ex.getMessage());;
                        }
                        if (ingredient instanceof Sugar)
                            try {
                            blender.addIngredients(ingredient);
                        } catch (BlenderOverflowException ex) {
                            System.out.println(ex.getMessage());;
                        }
                    }
                }
                break;

                case 3:
                    cocktail = blender.blend();
                    break;

                case 4:

                    System.out.println(cocktail.getInfo());

                    break;

                case 5:
                    System.out.println("Enter Cup capacity, Ml: ");
                    cup.setCapacity(scanner.nextDouble());
                     {
                        try {
                            blender.pourCocktail(cup);

                        } catch (BlenderIsEmptyException ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    break;

                case 6: {
                    System.out.println(cup.getCalories());
                    break;
                }
                case 7: {
                    System.exit(0);

                }
                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 6.");
            }
        }

    }
}
