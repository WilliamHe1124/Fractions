import java.util.Scanner;
public class fraction_driver
{
    /*public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("First numerator: ");
        int ft=input.nextInt();
        System.out.print("First denominator: ");
        int sd=input.nextInt();
        System.out.print("Second numerator: ");
        int ft1=input.nextInt();
        System.out.print("Second denominator: ");
        int sd1=input.nextInt();
        fraction obj1=new fraction(ft, sd);
        fraction obj2=new fraction(ft1, sd1);
        fraction instance1=new fraction(obj1, obj2);
        instance1.add();
        instance1.subtract();
        instance1.multiply();
        instance1.divide();
    }*/
    
    public static void pi(){
        fraction appr=new fraction(355, 113);
        final double EPSILON=Math.abs(Math.PI-appr.value);
        while (Math.abs(Math.PI-appr.value)>=EPSILON){
            if (Math.PI-appr.value>=EPSILON) appr.fst++;
            if (Math.PI-appr.value<0) appr.scd++;
            appr.value=(double)appr.fst/(double)appr.scd;
        }
        System.out.print("The closest approximation is "+appr.fst+"/"+appr.scd);
    }
    
    public static void qst(){
        Scanner input=new Scanner(System.in);
        boolean conti=true;
        String[] jjcc=new String[4];
        jjcc[0]=" + ";
        jjcc[1]=" - ";
        jjcc[2]=" x ";
        jjcc[3]=" / ";
        int tot=0;
        int totw=0;
        while (conti){
            int de=(int)(Math.random()*9)+1;
            int nu=(int)(Math.random()*9)+1;
            int de1=(int)(Math.random()*9)+1;
            int nu1=(int)(Math.random()*9)+1;
            fraction a=new fraction(de, nu);
            fraction b=new fraction(de1, nu1);
            fraction ans=new fraction(a, b);
            int index=(int)(Math.random()*3);
            System.out.print(de+"/"+nu+jjcc[index]+de1+"/"+nu1+"=");
            tot++;
            int answer1=0;
            int answer2=0;
            if (index==0) {
               answer1=ans.addD();
               answer2=ans.addN();
            } else if (index==1) {
               answer1=ans.subtractD();
               answer2=ans.subtractN();
            } else if (index==2) {
               answer1=ans.multiplyD();
               answer2=ans.multiplyN();
            } else if (index==3) {
               answer1=ans.divideD();
               answer2=ans.divideN();
            } 
            int gcf=ans.GCF(answer1, answer2);
            answer1=answer1/gcf;
            answer2=answer2/gcf;
            String myans=input.nextLine();
            int ind=myans.indexOf("/");
            if (myans.equals("quit")){
                conti=false;
                tot--;
            } else if (answer2==Integer.parseInt(myans.substring(0, ind))&&answer1==Integer.parseInt(myans.substring(ind+1))){
                conti=true;
                totw++;
                System.out.println("Correct!");
            } else {
                conti=true;
                System.out.println("Wrong! The answer is "+answer2+"/"+answer1);
            }
        }
        System.out.print("Your win/loss ratio is "+totw+"/"+tot+", for a score of "+Math.round(((double)totw/(double)tot)*100.00)+" percent!");
    }
}
