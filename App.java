public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Below is output");
        printnumrev(20);
    }


   public static void  Printing(int n){

         if(n<=0){
            return;
         }
        
         System.out.println("Yash");

         Printing(n-1);
    }

    public static void printnum(int n){


          if(n<=0){

            return;
          }

          printnum(n-1);

          System.out.println(n);
    }

    public static void printnumrev(int n){


        if(n<=0){

          return;
        }

        System.out.println(n);

        printnumrev(n-1);

        
  }
}
