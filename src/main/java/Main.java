public class Main {

    public static void main(String[] args) {
        CustomHashMap myHashMap = new CustomHashMap();
        myHashMap.add("Something", 1);
        myHashMap.add("second", 2);
        myHashMap.add("third", 3);
        System.out.println(myHashMap.getValue("third"));
        System.out.println(myHashMap.getValue("Something"));
        System.out.println(myHashMap.getValue("kkk"));
        System.out.println(myHashMap);
        myHashMap.removeKey("third");
        System.out.println(myHashMap);
        myHashMap.add("third", 3);
        System.out.println(myHashMap);
        //myHashMap.add("second", 2);
        myHashMap.removeKey("thd");
        myHashMap.clearAll();
        System.out.println(myHashMap);
        //not possible: myHashMap.add(5, "ddd");
        //System.out.println(myHashMap);
    }
}
