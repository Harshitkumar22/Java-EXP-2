public class Pattern1 {
    public static void main(String[] args) {
        int n=5; //rows

        for (int i=0; i<n; i++){
            for (int j=0; j<i; j++){ // used for spaces
                System.out.print(" "); //mistake occured here i use println instead of print
            }
            for (int j=0; j<n-i; j++){

                System.out.print("*"); //same mistake occurred here
            }
            System.out.print("\n");
        }
    }
}
