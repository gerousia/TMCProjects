public class HashMap<K, V> {
    private List<Pair<K, V>>[] values;
    private int firstFreeIndex;

    public HashMap() {
        this.values = new List[32];
        this.firstFreeIndex = 0;
    }

    public void add(K key, V value) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(this.values, key);
        int index = getIndexOfKey(valuesAtIndex, key);

        if (index < 0) {
            valuesAtIndex.add(new Pair<>(key, value));
            ++this.firstFreeIndex;
        } else {
            valuesAtIndex.getValue(index).setValue(value);
        }

        if (1.0 * this.firstFreeIndex / this.values.length > 0.75) {
            grow();
        }
    }

    public V remove(K key) {
        List<Pair<K, V>> valuesAtIndex = getListBasedOnKey(this.values, key);
        if (valuesAtIndex.size() == 0) {
            return null;
        }

        int index = getIndexOfKey(valuesAtIndex, key);
        if (index < 0) {
            return null;
        }

        Pair<K, V> pair = valuesAtIndex.getValue(index);
        valuesAtIndex.remove(pair);
        return pair.getValue();
    }

    private void grow() {
        List<Pair<K, V>>[] newValues = new List[this.values.length * 2];
        for (int i = 0; i < this.values.length; ++i) {
            copy(newValues, i);
        }
        this.values = newValues;
    }

    private void copy(List<Pair<K, V>>[] newArray, int fromIdx) {
        for (int i = 0; i < this.values[fromIdx].size(); i++) {
            Pair<K, V> value = this.values[fromIdx].getValue(i);
            getListBasedOnKey(newArray, value.getKey()).add(value);
        }
    }

    private List<Pair<K, V>> getListBasedOnKey(List<Pair<K, V>>[] lists, K key) {
        int hashValue = getHashValue(lists, key);
        if (lists[hashValue] == null) {
            lists[hashValue] = new List<>();
        }
        return lists[hashValue];
    }

    private int getIndexOfKey(List<Pair<K, V>> listAtIndex, K key) {
        for (int i =0; i < listAtIndex.size(); ++i) {
            if (containsKey(listAtIndex, i, key)) {
                return i;
            }
        }
        return -1;
    }

    public V getValue(K key) {
        int hashValue = getHashValue(this.values, key);
        if (this.values[hashValue] == null) {
            return null;
        }

        List<Pair<K, V>> valuesAtIndex = this.values[hashValue];

        for (int i = 0; i < valuesAtIndex.size(); ++i) {
            if (containsKey(valuesAtIndex, i, key)) {
                return valuesAtIndex.getValue(i).getValue();
            }
        }
        return null;
    }

    public boolean containsKey(List<Pair<K, V>> listAtIndex, int index, K key) {
        return listAtIndex.getValue(index).getKey().equals(key);
    }

    private int getHashValue(List<Pair<K, V>>[] list, K key) {
        return Math.abs(key.hashCode() % list.length);
    }
}
