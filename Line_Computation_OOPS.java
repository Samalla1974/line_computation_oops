package usecases;


	public class Line_Computation_OOPS
	{
		public static void main(String[] args) 
		{
			
			double x1 = 2;
			double y1 = 2;

		
			double x2 = 6;
			double y2 = 6;

			double length1;

			length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1)* (y2 - y1));
			System.out.println("length of a line1 :" + length1);
		
		
	                double lx1 = 8;
	                double ly1 = 8;

	  
	                double lx2 = 5;
	                double ly2 = 5;

	                double length2;

	                length2 = Math.sqrt((lx2 - lx1) * (lx2 - lx1) + (ly2 - ly1)* (ly2 - ly1));
	                System.out.println("length of a line2 :" + length2);
			
			if ( length1 == length2 )
			{
				System.out.println ("length of two lines are equal");
			}
			else if ( length1 > length2)
			{
				System.out.println ("length1 is greater than length2");
			}
			else
			{
				System.out.println ("length1 is lesser than length2");
			}
		}
	}




