
public class Economic extends TripMethod {
	private double priceMultiplier;

	public double getPriceMultiplier() {
		return priceMultiplier;
	}

	public void setPriceMultiplier(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	@Override
	public void setBasicPrice() {
		basicPrice = 5000;
	}

	@Override
	public double trafficAndRainy() {
		priceMultiplier = 1.4;
		return priceMultiplier;
	}

	@Override
	public double traffic() {
		priceMultiplier = 1.2;
		return priceMultiplier;
	}

	@Override
	public double rainy() {
		priceMultiplier = 1.2;
		return priceMultiplier;
	}

	@Override
	public double normal() {
		priceMultiplier = 1;
		return priceMultiplier;
	}
}
