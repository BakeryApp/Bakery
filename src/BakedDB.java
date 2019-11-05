import java.text.NumberFormat;
import java.util.ArrayList;

public class BakedDB {

    private ArrayList<Bakery> list;
    public BakedDB(){
        list = new ArrayList<>();
    }

    public BakedDB(ArrayList list){
        this.list = list;
    }

    public ArrayList<Bakery> getList() {
        return list;
    }

    public void setList(ArrayList<Bakery> list) {
        this.list = list;
    }
    public void search(String s){
        ArrayList<Bakery> results = new ArrayList<>();
        if(s.equalsIgnoreCase("all")){
            results = list;
        }
        else if(s.equalsIgnoreCase("gluten")){
            results = glutenSearch();
        }
        else if(s.equalsIgnoreCase("dairy")){
            results = dairySearch();
        }
        else if(s.equalsIgnoreCase("egg")){
            results = eggSearch();
        }
        else if(s.equalsIgnoreCase("peanut")){
            results = peanutSearch();
        }
        else if(s.equalsIgnoreCase("soy")){
            results = soySearch();
        }
        for( Bakery b : results){
            System.out.println(b.getName());
        }
    }
    public void display(String s){
        for(Bakery b : list){
            if(s.equalsIgnoreCase(b.getName())){
                b.displayText();
            }
        }
    }
    public void displayAll(){
        System.out.println("Cart: ");
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        double total = 0;
        for(Bakery b : list){
            System.out.println(b.getName() + " - Quantity: " + b.getQuantity());
            total += (b.getPrice()*b.getQuantity());
        }
        System.out.println("Total: " + formatter.format(total));
    }
    public ArrayList<Bakery> addToCart(String choice, int q, ArrayList<Bakery> all){
        for(int i = 0; i < all.size(); i++) {
            if (choice.equalsIgnoreCase(all.get(i).getName())) {
                if(q <= all.get(i).getQuantity()) {
                    this.list.add(all.get(i));
                    this.list.get(list.size()-1).setQuantity(q);
                }
                else{
                    System.out.println("We do not have that many in stock.");
                }
            }
        }
        return all;
    }
    public ArrayList glutenSearch(){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.isGluten()) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList dairySearch(){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.isDairy()) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList soySearch(){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.isSoy()) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList peanutSearch(){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.isPeanut()) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList eggSearch(){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.isEgg()) {
                results.add(b);
            }
        }
        return results;
    }
}
