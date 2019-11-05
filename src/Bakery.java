import java.lang.reflect.Array;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

public class Bakery {
    private String name;
    private double price;
    private String date;
    private int quantity;

    private boolean gluten,dairy,egg,soy,peanut;
    private boolean[] allergies;
    private String[] strings = {"gluten", "dairy", "egg", "soy", "peanut"};

    public Bakery(){}
    public Bakery(String name, double price,String date,int quantity,boolean gluten,
                boolean dairy,boolean egg, boolean soy, boolean peanut){
        this.name = name;
        this.price = price;
        this.date = date;
        this.quantity = quantity;
        this.gluten = gluten;
        this.dairy = dairy;
        this.egg = egg;
        this.soy = soy;
        this.peanut = peanut;
        this.allergies = new boolean[]{gluten, dairy, egg, soy, peanut};
    }
    public void displayText(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.print("Name: " + name + ", Price: " + formatter.format(price) + ", Exp. date: " + date + ", Quantity: " + quantity);
        boolean show = false;
        ArrayList<Allergy> l = new ArrayList<>();
        for(int i=0; i<allergies.length; i++){
            if(allergies[i]){
                show=true;
                l.add(new Allergy(strings[i], allergies[i]));
            }
        }
        if(show) {
            System.out.print(", Contains: ");
            for(int i = 0; i<l.size(); i++){
                if(i==l.size()-1){
                    System.out.print(l.get(i).getName());
                }
                else {
                    System.out.print(l.get(i).getName() + ", ");
                }
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public boolean isDairy() {
        return dairy;
    }

    public void setDairy(boolean dairy) {
        this.dairy = dairy;
    }

    public boolean isEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean isPeanut() {
        return peanut;
    }

    public void setPeanut(boolean peanut) {
        this.peanut = peanut;
    }

}
