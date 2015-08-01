package hashmap;

/**
 * Created by tylerfolkman on 8/1/15.
 */
public class HashMapTFTest {
    public static void main(String args[]){

        HashMapTF<String, Integer> hashMapTF = new HashMapTF<>();

        hashMapTF.put("0", 10);
        hashMapTF.put("10", 20);
        hashMapTF.put("20", 30);
        hashMapTF.put("30", 40);
        hashMapTF.put("40", 50);
        hashMapTF.put("50", 60);
        hashMapTF.put("60", 70);
        hashMapTF.put("70", 80);
        hashMapTF.put("80", 90);
        hashMapTF.put("90", 100);
        hashMapTF.put("100", 110);
        hashMapTF.put("110", 120);
        hashMapTF.put("120", 130);
        hashMapTF.put("130", 140);
        hashMapTF.put("140", 150);
        hashMapTF.put("150", 160);
        hashMapTF.put("160", 170);
        hashMapTF.put("170", 180);


        System.out.println("100 Value: " + hashMapTF.get("110"));


    }
}
