public class J {
    public static void main(String[] arg){
        int n = 11;
        for (int i = 0;i < n;i++){
            for (int j = 0;j < n;j++){
                if (i==0||j==0||i==n-1||j==n-1){
                    System.out.print("$ ");
                }
                else if (((i==2)&&(j>=2&&j<=n-3)) || (j==n/2&&i>=3&&i<=n-4) || (i==n-3&&j>=3&&j<n/2) || (i==n-4&&j==2)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
