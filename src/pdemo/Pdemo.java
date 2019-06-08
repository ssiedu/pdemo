package pdemo;




public class Pdemo 
{
     public static void main(String[] args) 
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Class loaded Successfully");
        }
        catch(ClassNotFoundException e)
        
        {
            System.out.println("Error");
        }
    }
}     

   
   
