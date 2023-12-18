public class fraction
{ 
    public int fst;
    public int scd;
    public double value;
    fraction a;
    fraction b;
    public fraction(int one, int two){
        fst=one/GCF(one, two);
        scd=two/GCF(one, two);
        value=(double)fst/(double)scd;
    }
    
    public fraction(fraction one, fraction two){
        a=one;
        b=two;
    }
    
    public int GCF(int one, int two){
        while (one!=two){
            if (one>two) one=one-two;
            if (two>one) two=two-one;
            if (one==0||two==0) {
               one=0;
               two=one;
            }
        }
        return one;
    }
    
    public int multiplyD(){
        int den=a.scd*b.scd;
        int num=a.fst*b.fst;
        int gcf=GCF(den, num);
        den=den/gcf;
        num=num/gcf;
        return den;
    }
    
    public int multiplyN(){
        int den=a.scd*b.scd;
        int num=a.fst*b.fst;
        int gcf=GCF(den, num);
        den=den/gcf;
        num=num/gcf;
        return num;
    }
    
    public int addD(){
        int den=a.scd*b.scd;
        int num=a.fst*b.scd+b.fst*a.scd;
        int gcf=GCF(den, num);
        den=den/gcf;
        num=num/gcf;
        return den;
    }
    
    public int addN(){
        int den=a.scd*b.scd;
        int num=a.fst*b.scd+b.fst*a.scd;
        int gcf=GCF(den, num);
        den=den/gcf;
        num=num/gcf;
        return num;
    }
    
    public int subtractD(){
        int den=a.scd*b.scd;
        int num=a.fst*b.scd-b.fst*a.scd;
        int gcf=GCF(den, Math.abs(num));
        den=den/gcf;
        num=num/gcf;
        return den;
    }
    
    public int subtractN(){
        int den=a.scd*b.scd;
        int num=a.fst*b.scd-b.fst*a.scd;
        int gcf=GCF(den, Math.abs(num));
        den=den/gcf;
        num=num/gcf;
        return num;
    }
    
    public int divideD(){
        int den=a.scd*b.fst;
        int num=a.fst*b.scd;
        int gcf=GCF(den, num);
        den=den/gcf;
        num=num/gcf;
        return den;
    }
    
    public int divideN(){
        int den=a.scd*b.fst;
        int num=a.fst*b.scd;
        int gcf=GCF(den, num);
        den=den/gcf;
        num=num/gcf;
        return num;
    }
}
