import java.util.Scanner;
public class Lab04_Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reverseString;
        int digitSum;
        int divisor;
        int accescode;
        String stringcode;
        String encrypted;
        System.out.print("Enter target sum between 10 and 30: ");
        digitSum=scanner.nextInt();
        while (!(digitSum>=10&&digitSum<=30)){
            System.out.print("Enter target sum between 10 and 30: ");
            digitSum=scanner.nextInt();
        }
        System.out.print("Enter between 2 and 9: ");
        divisor=scanner.nextInt();
        while (!(divisor>=2&&divisor<=9)){
            System.out.print("Enter between 2 and 9: ");
            divisor=scanner.nextInt();
        }
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        accescode=a*1000+b*100+c*10+d;
                        if (a != b && a != c && a != d && b != c && b != d && c != d && a < b && c < d && a + b + c + d == digitSum && accescode % divisor == 0)
                        {
                            stringcode=String.valueOf(accescode);
                            reverseString="";
                            for (int i=stringcode.length()-1;i>=0;i--){
                                reverseString+=stringcode.charAt(i);
                            }
                            encrypted="";
                            for(int i=0;i<reverseString.length();i++){
                                int value = Character.getNumericValue(reverseString.charAt(i));
                                if (value==1){
                                    encrypted+="A";
                                }else if (value==2){
                                    encrypted+="B";
                                }else if (value==3){
                                    encrypted+="C";
                                }else if (value==4){
                                    encrypted+="D";
                                }else if (value==5){
                                    encrypted+="E";
                                }else if (value==6){
                                    encrypted+="F";
                                }else if (value==7){
                                    encrypted+="G";
                                }else if (value==8){
                                    encrypted+="H";
                                }else{
                                    encrypted+="I";
                                }
                            }
                            System.out.println("code: " + encrypted);
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
