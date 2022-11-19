package Assignmnet2.dataCoupling;

public class DataCoupling {
    int a,b,c;
    public DataCoupling(int a,int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void GetSum(int a, int b, int c) {
        int sum = a+b+c;
        System.out.println("Sum of three numbers are :" + sum);
    }

    // the values of a,b and c get passed on to the function getSum().
    // By making a call to the function getSum( ), and mentioning a, b and c in the parentheses,
    // the input values form the main function gets passed into the getSum function,
    // thereby establishing the data coupling
}
