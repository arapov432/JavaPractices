import java.io.OutputStream;

public class BinarySearch {
    int Binary(int data[], int a, int low, int high){
        while (low <= high){
            int mid = (low +high)/2;
            if (data[mid] ==a){
                return mid;
            }
            if(data[mid] < a){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int list[] = {1,2,3,4,5,6,7,8,9,10};
        int a = 1;
        BinarySearch search = new BinarySearch();
        int fn = search.Binary(list, a, 0, list.length);
        if( fn ==-1){
            System.out.println("Not found ");
        }
        else {
            System.out.println("Found at index " + fn);
        }

    }
}
