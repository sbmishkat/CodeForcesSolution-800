import java.util.*;
public class QueueAtTheSchool {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int length=scanner.nextInt();
        int times=scanner.nextInt();
        String line= scanner.next();
        char[] line2= line.toCharArray();
        for(int i=0;i<times;i++){
            for(int j=0;j<line.length()-1;j++){
                if(line2[j]=='B'&&line2[j+1]=='G'){
                    line2[j]='G';
                    line2[j+1]='B';
                    j++;
                }
            }
        }
        System.out.println(line2);
    }
}