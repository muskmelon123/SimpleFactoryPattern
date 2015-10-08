public class ChartFactory {

	public static Chart getChart(String type) {
		Chart chart = null;

		if (type == "histogram") {
			chart = new HistogramChart();
			return chart;
		} else if (type == "line") {
			chart = new LineChart();
			return chart;
		} else if (type == "pie") {
			chart = new PieChart();
			return chart;
		}
		return chart;
	}
}
