import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

class Mainclass{


    public static void main(String[] args){
        //declear Hashmap

    HashMap<Integer,String> hmap = new HashMap<Integer,String>();

    //Adding elements to hashmap

    hmap.put(101,"Saloni");
    hmap.put(102,"Gulnaz");
    hmap.put(103,"Aakash");

    //Printing Element one by one

    //Removing an element from Hashmap

        hmap.remove(101);

    String name=hmap.get(101);

    System.out.println(name);

    //Display content using iterator

    Set<Entry<Integer, String>> set =  hmap.entrySet();

    Iterator iterator=set.iterator();

    while(iterator.hasNext()){
        Map.Entry mentry = (Map.Entry) iterator.next();
        System.out.println("key : "+ mentry.getKey() + "\nValue : "+ mentry.getValue());
    }
    }

}