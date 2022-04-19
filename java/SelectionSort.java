import java.util.Arrays;

public class SelectionSort {
    void Select(int data[]){
        int size = data.length;
        for(int step = 0; step <size; step++){
            int minind = step;
            for(int i = step +1; i< size; i++){
                if(data[i] <data[minind]){
                    minind = i;
                }
            }
            int swap = data[step];
            data[step] = data[minind];
            data[minind]= swap;
        }

    }

    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        int list[] = {3,1,100, 0, 200, 40};
        sort.Select(list);
        System.out.println(Arrays.toString(list));

    }
}
