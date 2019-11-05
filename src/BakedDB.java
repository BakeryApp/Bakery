import java.util.ArrayList;

public class BakedDB {

    private ArrayList<Bakery> list;
    public BakedDB(){    }

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
