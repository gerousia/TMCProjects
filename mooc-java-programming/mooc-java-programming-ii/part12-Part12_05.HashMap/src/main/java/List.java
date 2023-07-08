public class List<Type> {
    private Type[] values;
    private int firstFreeIndex;

    public List() {
        this.values = (Type[]) new Object[10];
        this.firstFreeIndex = 0;
    }

    public void add(Type value) {
        if (this.firstFreeIndex == this.values.length) {
            grow();
        }

        this.values[firstFreeIndex++] = value;
    }

    private void grow() {
        int newSize = values.length + (values.length / 2);
        Type[] newValues = (Type[]) new Object[newSize];
        for (int i = 0; i < this.values.length; ++i) {
            newValues[i] = this.values[i];
        }
        this.values = newValues;
    }

    public boolean contains(Type value) {
        return getIndex(value) >= 0;
    }

    public void remove(Type value) {
        int indexOfValue = getIndex(value);
        if (indexOfValue < 0) {
            return;
        }
        moveToLeft(indexOfValue);
        --this.firstFreeIndex;
    }

    public int getIndex(Type value) {
        for (int i = 0; i < this.firstFreeIndex; ++i) {
            if (this.values.equals(value)) {
                return i;
            }
        }
        return -1;
    }

    private void moveToLeft(int fromWhere) {
        for (int i = fromWhere; i < this.firstFreeIndex; ++i) {
            this.values[i] = this.values[i + 1];
        }
    }

    public Type getValue(int index) {
        if (index < 0 || index > this.firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is outside of list range.");
        }
        return this.values[index];
    }

    public int size() {
        return this.firstFreeIndex;
    }

}
