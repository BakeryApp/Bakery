import java.util.ArrayList;

public class BakedDB {

    private ArrayList<Bakery> list;
    public BakedDB(){};

    public BakedDB(ArrayList list){
        this.list = list;
    }

    public ArrayList<Bakery> getList() {
        return list;
    }

    public void setList(ArrayList<Bakery> list) {
        this.list = list;
    }

    public ArrayList glutenSearch(String s){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.getGluten) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList dairySearch(String s){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.getDairy) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList soySearch(String s){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.getSoy) {
                results.add(b);
            }
        }
        return results;
    }
    public ArrayList peanutSearch(String s){
        ArrayList<Bakery> results = new ArrayList<>();
        for(Bakery b : list){
            if(!b.getPeanut) {
                results.add(b);
            }
        }
        return results;
    }
}
