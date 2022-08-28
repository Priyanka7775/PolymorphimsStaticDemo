public class Calculation {


    public int add(int num1, int num2){
        return num1+num2;
    }
    public float add(float num1,float num2){
        return num1+num2;
    }
    public int add(int num1, int num2,int num3){
        return num1+num2+num3;
    }


    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        calculation.add(10,20);
        calculation.add(10f,20f);
        calculation.add(10,20,30);
        //calculation.add(10,20,30);
    }
}
