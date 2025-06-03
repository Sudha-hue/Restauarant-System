public class pizza extends FoodRes 
{
   public void deli(){
    deliv = true;
	System.out.println("Pizza is delivered");
   }
    public void notDeli(){
	 deliv = false;
	 System.out.println("Pizza is not delivered");
	}
}