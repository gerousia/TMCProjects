import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Stack {
    private ArrayList<String> list;

    public Stack() {
        this.list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void add(String value) {
        this.list.add(value);
    }

    public String take() {
        if (!this.list.isEmpty()) {
            int topMostIndex = this.list.size() - 1;
            String topMostValue = this.list.get(topMostIndex);
            this.list.remove(topMostIndex);
            return topMostValue;
        }
        return "";
    }
    public ArrayList<String> values() {
        ArrayList<String> _list = new ArrayList<>();
        if (!this.list.isEmpty()) {
            _list.add(this.list.get(0));
        }
        return _list;
    }

}
