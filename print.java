import java.until.HashMap;

public class CustomHashMap {

    private HashMap<String, String>map;

    public CustomHashMap() {
        map = new HashMap<String, String>();
    }

    @Overrid 

    public String toString(){
        StringBuilder StringBuilder = new StringBuilder();

        for (HashMap.Entry<String, String> entry: map.entrySet()){

        String key = entry.getKey();

        String value = entry.getValue();

        StringBuilder.append(key).append(" -> ").append(value).append("n");
    }

    return StringBuilder.toString();


}

public void  put(String key, String value) {
    map.put(key, value);
}

public static void main(String[] args) {
    CustomHashMap customHashMap = new CustomHashMap();
    customHashMap.put("1", "first");
    customHashMap.put("2", "second");
    customHashMap.put("3", "third");

    System.out.println(customHashMap.toString());
  
}

}