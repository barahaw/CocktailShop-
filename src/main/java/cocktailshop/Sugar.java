/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cocktailshop;

/**
 *
 * @author barah
 */
public class Sugar extends Ingredients {

    private double volume;

    public Sugar(String name, int calories, double volume) {
        super(name, calories);
        this.volume = volume;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return "Volume: " + this.volume + "\n" + super.getInfo();
    }

}
