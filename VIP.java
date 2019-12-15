
public class VIP extends TripMethod {
	private double priceMultiplier;

	public double getPriceMultiplier() {
		return priceMultiplier;
	}

	public void setPriceMultiplier(double priceMultiplier) {
		this.priceMultiplier = priceMultiplier;
	}

	@Override
	public void setBasicPrice() {
		basicPrice = 10000;
	}

	@Override
	public double trafficAndRainy() {
		priceMultiplier = 3;
		return priceMultiplier;
	}

	@Override
	public double traffic() {
		priceMultiplier = 2;
		return priceMultiplier;
	}

	@Override
	public double rainy() {
		priceMultiplier = 2;
		return priceMultiplier;
	}

	@Override
	public double normal() {
		priceMultiplier = 1;
		return priceMultiplier;
	}
}
