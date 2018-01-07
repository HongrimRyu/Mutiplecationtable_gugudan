package multiplecationtable;

public class Multiplecationtable {
   public Multiplecationtable(){

   }
   public static void calfunc(int times)
   {
	   int result;

	   for(int i=0 ; i < times ; i++)
	   {
		   System.out.println("NOW->" + (i+1));
		   for(int j=0 ; j < times ; j++)
		   {
			   result = (i+1)*(j+1);
			   System.out.println(result);
		   }
	       
	   }
	   return ;
   }
   public static void calfunc(int n1, int n2)
   {
	   int result;
	   for(int i=0 ; i < n1 ; i++)
	   {
		   for(int j=0 ; j < n2 ; j++)
		   {
			   result = (i+1)*(j+1);
			   System.out.println(result);
		   }
		   System.out.println("finish");
	   }
   }

	
}

