import java.util.Date;

public class Bakery {
    private String name;
    private double price;
    private String date;
    private int quantity;

    private boolean gluten,dairy,egg,soy,peanut,sesame, treenut,vegan;

    public Bakery(){}
    public Bakery(String name, double price,String date,int quantity,boolean gluten,
                boolean dairy,boolean egg, boolean soy, boolean peanut,
                  boolean treenut , boolean vegan){
        this.name = name;
        this.price = price;
        this.date = date;
        this.quantity = quantity;
        this. gluten = gluten;
        this.dairy = dairy;
        this.egg = egg;
        this.soy = soy;
        this.peanut = peanut;
        this. treenut = treenut;
        this. vegan = vegan;
        this.sesame = sesame;

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

    public boolean isSesame() {
        return sesame;
    }

    public void setSesame(boolean sesame) {
        this.sesame = sesame;
    }

    public boolean isTreenut() {
        return treenut;
    }

    public void setTreenut(boolean treenut) {
        this.treenut = treenut;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }
}
