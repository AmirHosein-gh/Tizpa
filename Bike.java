
public class Bike extends TripMethod {
	private double priceMultiplier;

	public double getPriceMultiplier() {
		return priceMultiplier;
	}

	public void setPriceMultiplier(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	@Override
	public void setBasicPrice() {
		basicPrice = 4000;
	}

	@Override
	public double trafficAndRainy() {
		priceMultiplier = 1.5;
		return priceMultiplier;
	}

	@Override
	public double traffic() {
		priceMultiplier = 2;
		return priceMultiplier;
	}

	@Override
	public double rainy() {
		priceMultiplier = 0.8;
		return priceMultiplier;
	}

	@Override
	public double normal() {
		priceMultiplier = 1;
		return priceMultiplier;
	}
}
