
public class Client {
	public static void main(String args[]) {
		//ע�����ְ취��ͨ��abstract class�����õģ�����һ����ֱ����interface�����õ�
//		Product product = Factory.getProduct("B");
//		product.methodSame();
//		product.methodDiff();
		Chart chart;
		chart = ChartFactory.getChart("histogram");
		chart.display();
	}
}
