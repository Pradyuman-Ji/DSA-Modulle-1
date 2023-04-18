// Time complexity = O(n)
// Space complexity = O(1)


package DSA;

public class PallindromArray {
    public static void main(String[] args) {
        int arr []={1,2,3,2,1};
        int flag=0;
        for(int i =0;i<(arr.length)-1;i++){
            if(arr[i]!=arr[(arr.length)-i-1]) {
                flag=1;
                System.out.println("Not a pallindromic array");
                break;
            }
        }
        if(flag==0)
            System.out.println("Pallindromic array");
    }
}
