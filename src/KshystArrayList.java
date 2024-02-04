public class KshystArrayList {

    int[] array = new int[100000000];
    int length = 0;

    public void add(int num){
        array[length] = num;
        length++;
    }
    public void pop(){
        array[length - 1] = 0 ;
        length--;
    }

    public void addAt(int index , int num){
        for (int i = index; i < length; i++) {
            array[i + 1] = array[i];
        }
        array[index] = num;
        length++;
    }

    public void remove(int index){
        for (int i = index; i < length; i++) {
            array[i] = array[i + 1];
        }
        length--;
    }

    public boolean contains(int num){
        for (int i = 0; i < length; i++) {
            if (array[i] == num){
                return true;
            }
        }
        return false;
    }

    public int get(int index){
        return array[index];
    }

    public void print(){
        for (int i = 0; i < length; i++) {
            System.out.println(array[i]);
        }
    }

    public void clear(){
        for (int i = 0; i < length; i++) {
            array[i] = 0;
        }
        length = 0;
    }

    public void addAll(KshystArrayList kshystArrayList){
        for (int i = 0; i < kshystArrayList.length; i++) {
            array[length] = kshystArrayList.array[i];
            length++;
        }
    }


}
