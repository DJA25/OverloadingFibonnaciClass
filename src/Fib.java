public class Fib {
    int value;
    int index;
    int numsAdded;
    //Fibonnaci object with index, value, and numsAdded
    //Could be useful for making a more efficient getValue function,
    //Or user might use a Fib object instead of an array to store info

   //constructors
    Fib() {

    }

    Fib(int value, int index) {
        this.value = value;
        this.index = index;
        //assumes 2 for numsAdded
        numsAdded = 2;
    }

    Fib(int value, int index, int numsAdded) {
        this.value = value;
        this.index = index;
        this.numsAdded = numsAdded;
    }

    //getters for value, index, and numsAdded
    public int getValue() {
        return value;
    }
    public int getIndex() {
        return index;
    }
    public int numsAdded() {
        return numsAdded;
    }
    // setters
    public void setValue(int value){
        this.value = value;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setNumsAdded(int numsAdded) {
        this.numsAdded = numsAdded;
    }
    // static function to getValue, assumes to add 2 previous numbers
    //overloads getter
    public static int getValue(int index) {
        return getValue(index, 2);
    }
    // overloads other recursive function,
    // allows any number of previous numbers to sum as next value
    public static int getValue(int index, int numsToAdd) {
        if(index<=numsToAdd) return 1;
        int result = 0;
        for(int i = 0; i<numsToAdd; i++) {
            index-=1;
            result+=getValue(index);
        }
        return result;
    }
}
