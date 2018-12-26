
public class Mark {
    private int firstAttestation;
    private int secondAttestation;
    private int exam;
    private int total;
    Mark(){}
    Mark(int firstAttestation,int secondAttestation,int exam){
        this.firstAttestation = firstAttestation;
        this.secondAttestation = secondAttestation;
        this.exam = exam;
        this.total = calculateTotal();
    }
    private int calculateTotal(){
        int total = 0;
        if(this.firstAttestation + this.secondAttestation >=30 && this.exam>=20){
            total+=(this.firstAttestation + this.secondAttestation + this.exam);
        }
        return total;
    }
    public String toLetter(){
        String res = "F";
        if(total<50) res = "F";
        if(total>=50 && total< 55) res = "D";
        if(total>=55 && total< 60) res = "D+";
        if(total>=60 && total< 65) res = "C-";
        if(total>=65 && total< 70) res = "C";
        if(total>=70 && total< 75) res = "C+";
        if(total>=75 && total< 80) res = "B-";
        if(total>=80 && total< 85) res = "B";
        if(total>=85 && total< 90) res = "B+";
        if(total>=90 && total< 95) res = "A-";
        if(total>=95 && total<= 100) res = "A";
        return res;
    }

    public String toString(){
        return firstAttestation + " " + secondAttestation + " " + exam + " " + total + " " + toLetter();
    }

}
