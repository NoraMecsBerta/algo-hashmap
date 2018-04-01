

public class KeyValue <K,V> {

    public String key;
    public Integer value;


    public KeyValue(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {

        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "key: " + key + ", value: " + value;
    }
}
