@SuppressWarnings("serial")
class myexception extends Exception{
    

      public myexception(String message){
           super(message);
      }

}
public class custumizeException{

   public static void main(String[] args){


   try{
          throw new myexception("myexception");

   }  

    catch(myexception ex){

             System.out.println(ex.getMessage());
     }
}
}
