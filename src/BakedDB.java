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
    public void search(String [] array){
        ArrayList<Bakery> results = new ArrayList<>();
        /*for(String s : array) {
            if (s.equalsIgnoreCase("all")) {
                results = list;
            }
            if (s.equalsIgnoreCase("gluten")) {
                results.addAll(glutenSearch());
            }
            if (s.equalsIgnoreCase("dairy")) {
                results.addAll(dairySearch());
            }
            if (s.equalsIgnoreCase("egg")) {
                results = eggSearch();
            }
            if (s.equalsIgnoreCase("peanut")) {
                results = peanutSearch();
            }
            if (s.equalsIgnoreCase("soy")) {
                results = soySearch();
            }
        }*/
        for(Bakery b : list){
            boolean bool = false;
            for(String s : array){
                for(int i = 0; i < b.getStrings().length; i++){
                    if(b.getStrings()[i].equalsIgnoreCase(s)){
                        if(b.getAllergies()[i]){
                            bool = true;
                        }
                    }
                }
            }
            if(!bool){
                results.add(b);
            }
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
