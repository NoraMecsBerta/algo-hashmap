import java.util.Arrays;
import java.util.LinkedList;


public class CustomHashMap {

    private int bucketSize = 16;
    private LinkedList<KeyValue>[] elements = new LinkedList[bucketSize];


    public void add(String key, Integer value) {
        int position = getHash(key);
        if (elements[position] == null || elements[position].isEmpty()) {
            LinkedList<KeyValue> listToadd = new LinkedList<KeyValue>();
            listToadd.add(new KeyValue(key, value));
            elements[position] = listToadd;
        } else {
            //I think it should update the value but the task said to throw Exception...
            throw new IllegalArgumentException();
        }
        resizeIfNeeded();
    }


    public Integer getValue(String key) {
        int position = getHash(key);
        try {
            for (KeyValue keyValue : elements[position]) {
                if (keyValue.getKey().equals(key)) {
                    return (Integer) keyValue.getValue();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("this key doesn't exist!");
        }
        return null;
    }


    private int getHash(String key) {
        return Math.abs(key.hashCode()) % bucketSize;
    }


    //I don't get it, arrays have fixed size so...?
    //in all linkedLists there can be more elements but you may need sooner a bigger size
    //In fact, I didn't have time to think about it and to implement
    private void resizeIfNeeded() {
    // If it holds more elements than bucketSize * 2, destroy and recreate it
    // with the double size of the elements array.
    // if it holds less elements than bucketSize / 2, destroy and recreate it
    // with half size of the elements array.
    }


    public void removeKey(String key) {
        int position = getHash(key);
        LinkedList<KeyValue> list = elements[position];
        try {
            for (KeyValue keyValue : list) {
                if (keyValue.getKey().equals(key)) {
                    list.remove(keyValue);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("the item you want to remove doesn't exist");
        }
    }


    public void clearAll() {
        elements = new LinkedList[bucketSize];
    }


    @Override
    public java.lang.String toString() {
        return Arrays.toString(elements);
    }
}
