

public class MenuItemFormula extends MenuItem {

	public MenuItemFormula()
	{
		_title = "Вычисление формулы y*y + 3*sqrt(x)+ z:";
	}
	
	public void execute()
	{
		double x = Input.getDouble("X");
		while(x<0) {
			x = Input.getDouble("X");
		}
		double y = Input.getDouble("Y");
		double z = Input.getDouble("Z");
		Output.println("y*y + 3*sqrt(x)+ z =\n"+y+"*"+y+" + 3*sqrt("+x+") + "+z+" =");
		double result=calc(x,y,z);
		Output.outDouble(result);
	}
	
	public Double calc(Double x,Double y,Double z)
	{        
		   return y*y+3*Math.sqrt(x)+z; 
	}
}
