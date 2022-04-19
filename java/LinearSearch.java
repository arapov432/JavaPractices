public class LinearSearch {
    int Search(int data[], int item){
        int n = data.length;
        for(int i=0; i<n; i++){
            if(data[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch search = new LinearSearch();

        int []array = {1,2,3,4,5,6,7,8,9,20};
        int x = 9;
        int result = search.Search(array, x);
        if (result == -1){
            System.out.println("Item not found");
        }
        else{
            System.out.println("item found at " +result);
        }
    }
}
