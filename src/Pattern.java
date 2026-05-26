void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println("enter value of n: " + n);

//    for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= i; j++ ){
//           System.out.print("* ");
//       }
//       System.out.println();
//    }

    for(int row = 1; row<=n; row++){
        for(int col = 1; col<=6; col++){
            if(row == 1 || row == n){
                System.out.print("* ");
            }
            else{
                if(col == 1 || col == 6){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
        }
        //move to next row
        System.out.println();
    }



}