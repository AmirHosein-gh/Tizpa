
public abstract class TripMethod {
	public DistrictPriceCalculation district = new DistrictPriceCalculation();
	protected int time = 0;
	protected long basicPrice;

	public abstract void setBasicPrice();

	public abstract double trafficAndRainy();

	public abstract double traffic();

	public abstract double rainy();

	public abstract double normal();

	public long getBasicPrice() {
		return basicPrice;
	}

	{
		setBasicPrice();
	}

	public double tripConditionPrice(Boolean rain, double time) {
		double condition = 0;
		// High Traffic Time is Between 17 and 21 O'clock:
		if (rain && time > 17 && time < 21) {
			condition = trafficAndRainy();
		} else if (!rain && time > 17 && time < 21) {
			condition = traffic();
		} else if (rain) {
			condition = rainy();
		} else {
			condition = normal();
		}
		return condition * getBasicPrice();
	}
}
