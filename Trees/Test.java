package Trees;

class A{
    int a = 6;
    public void show(){
        
        System.out.println("A class");
    }
}
public class Test {
    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int c = 2;
        
        System.out.println(a>b?(a>c?a:c):(b>c?b:c));

    }
}
