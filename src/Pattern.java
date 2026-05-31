void main() {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    System.out.println("enter value of n: " + n);

        //Patter 1
//    for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= i; j++ ){
//           System.out.print("* ");
//       }
//       System.out.println();
//    }

    //Pattern 2
//    for(int row = 1; row<=n; row++){
//        for(int col = 1; col<=6; col++){
//            if(row == 1 || row == n){
//                System.out.print("* ");
//            }
//            else{
//                if(col == 1 || col == 6){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//            }
//        }
//        //move to next row
//        System.out.println();
//    }
//


    //Pattern 3

    //Part1
    // for(int row = 1; row<=n; row++){

    //     for(int col = 1; col<=n-row; col++){
    //         System.out.print("  ");
    //     }

    //     if(row==1){
    //         for(int col=1; col<=2*row-1;col++){
    //             System.out.print("* ");
    //         }
    //     }
    //     else{
    //         System.out.print("* ");

    //         for(int col=1; col<=2*row-3; col++){
    //             System.out.print("  ");
    //         }

    //         System.out.print("* ");

    //     }
    //     //move to next row
    //     System.out.println();
    // }

    //part2 (below)
        //part1
    //     for(int col = 1; col<=row; col++){
    //         System.out.print("  ");
    //     }

    //     if(row == (n-1)){
    //         System.out.print("* ");
    //     }
    //     else{
    //         System.out.print("* ");

    //         for(int col=1; col<=2*(n-row)-3; col++){
    //             System.out.print("  ");
    //         }

    //         System.out.print("* ");

    //     }
    //     System.out.println();
    // }

    //Pattern4"
            int n = 5;
            for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++)
                System.out.print(" ");

            for(int k = 1; k <= 2*i-1; k++) {
                if(k == 1 || k == 2*i-1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }


    //Pattern5
    

}
