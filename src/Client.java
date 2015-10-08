
public class Client {
	public static void main(String args[]) {
		//注意这种办法是通过abstract class来引用的，还有一种是直接用interface来引用的
//		Product product = Factory.getProduct("B");
//		product.methodSame();
//		product.methodDiff();
		Chart chart;
		chart = ChartFactory.getChart("histogram");
		chart.display();
	}
}
