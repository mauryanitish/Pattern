public class k {
    public static void main(String[] arg){
        int n = 11;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                if (i==0 ||j==0 ||i==n-1 ||j==n-1){
                    System.out.print("$ ");
                } else if ((j==2&&i>=2&&i<=n-3) ||(i<=n/2&&j==n-i-3&&i>=2) || (i>=n/2&&j==i-2&&i<=n-3)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
