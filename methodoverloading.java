package cie3;

public class methodoverloading {
    public void display(int num){
        System.out.println("Number: "+num);
    }
    public void display(double num){
        System.out.println("Double: "+num);
    }
    public void display(int a ,int b){
        System.out.println("Number: "+a+"and"+b);
    }
    public static void main(String[] args) {
        methodoverloading m = new methodoverloading();
        m.display(5);
        m.display(3.14);
        m.display(10,20);
    }
}
