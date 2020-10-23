
public class Assignment1 
{
	public static void main(String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		int z = Integer.parseInt(args[2]);
		int square_x = x * x;
		int square_y = y * y;
		int square_z = z * z;
		if (x <= 0 || y <= 0 || z <= 0 ) {
			System.out.println("Invalid input!");
		}
		else if ((x + y < z) || (x + z < y) || (y + z < x)) {
			System.out.println("The input ("+x+", "+y+", "+z+") does not define a valid triangle!");
		}
		else if ((square_x + square_y == square_z) || (square_x + square_z == square_y) || (square_y + square_z == square_x)) {
			System.out.println("The input ("+x+", "+y+", "+z+") defines a valid right triangle!");
		}
		else {
			System.out.println("The input ("+x+", "+y+", "+z+") defines a valid triangle!");
		}
	}
}
	

