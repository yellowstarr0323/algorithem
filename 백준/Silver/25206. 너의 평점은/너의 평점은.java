import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float number =0;
    float sum = 0;
    for(int i=0;i<20;i++){

      String subject = sc.next();
      float score = sc.nextFloat();
      String avr = sc.next();
      if(avr.equals("A+")){
        sum+=score*4.5;
        number+=score;
      }
      else if(avr.equals("A0")){
        sum+=score*4.0;
        number+=score;
      }
      else if(avr.equals("B+")){
        sum+=score*3.5;
        number+=score;
      }
      else if(avr.equals("B0")){
        sum+=score*3.0;
        number+=score;
      }
      else if(avr.equals("C+")){
        sum+=score*2.5;
        number+=score;
      }
      else if(avr.equals("C0")){
        sum+=score*2.0;
        number+=score;
      }
      else if(avr.equals("D+")){
        sum+=score*1.5;
        number+=score;
      }
      else if(avr.equals("D0")){
        sum+=score*1.0;
        number+=score;
      }
      else if(avr.equals("F")){
        sum+=score*0.0;
        number+=score;
      }
      else {
        continue;
      }

    }
    float result = sum/number;
    System.out.printf("%.6f",result);





  }
}