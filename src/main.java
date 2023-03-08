import java.util.Arrays;
public class main {
    public static void main(String[]args){
        int randNum = (int)(Math.random()*10)+1;
        int[][]randArray = new int[5][5];
        for(int r=0;r<randArray.length;r++){
            for(int c=0;c<randArray[0].length;c++){
                randArray[r][c]=randNum;
            }
        }
      //sum each row
        int sum =0;
        int c =0;
        int row=0;
        for(int r=0;r<randArray.length;r++){
            while(c<5){
              //  System.out.println(randArray[row][c]);
                sum+=randArray[row][c];
                c++;
            }
            System.out.println("Sum: " + sum);
            sum=0;
            row++;

        }
       //sum each column
        int s =0;
        int x=0;
        int column =0;
        for(int co=0;co<randArray[0].length;co++){
            while(x<5) {
               x++;
            }
            System.out.println("Sum: " + randArray[x][column]);
            column++;
        }

    }
}
