import java.io.*;
class TestBase{
    int  a = 5;


}
public class test extends TestBase{
    int c  = 7;
    public static void main(String args[]){
        test t = new test();
        System.out.println(t.c);
        System.out.println(t.a);


    }
}
