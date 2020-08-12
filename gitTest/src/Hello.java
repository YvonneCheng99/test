public class Hello {

    public static void printHello(String str){
        System.out.println("Hello,"+str);
    }

    public static String test1(String str){
        String s = "This is test1, the parameter is "+str;
        return s;
    }
    public static void main(String[] args){
        printHello("this is my first change on branch3.");
        printHello("this is my second change on branch3.");
        printHello("this is my first change on branch4.");
        System.out.println("change on master.");
        System.out.println("change on branch2");
    }
}
