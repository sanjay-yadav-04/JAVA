public class Object {
    int a;
    void sum(){
        System.out.println("sum function");
}
public static void main(String[]args){
    Object obj=new Object();
    obj.a=122;
    System.out.println(obj.a);
    obj.sum();
}
}
