


import java.util.Scanner;

class myexception extends  Exception{
public  String toString(){
    return "i am toString()";
}    public  String getMessage(){
    return "i am getMessege()";
}
}
public class exceptionpr {

    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        int  a = sc.nextInt();
        if(a <99){

            try {
                throw new myexception();
            }catch (Exception e){
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
            System.out.println("fineished");
        }


    }
}
