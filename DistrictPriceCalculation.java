
public class DistrictPriceCalculation {
	public int districtPrice(int origin, int destination) {
		int finalDistrictPrice = 0;
		switch (origin) {
		case 0:
			switch (destination) {
			case 0:
				finalDistrictPrice = 1;
				break;
			case 1:
				finalDistrictPrice = 2;
				break;
			case 2:
				finalDistrictPrice = 2;
				break;
			case 3:
				finalDistrictPrice = 4;
				break;
			case 4:
				finalDistrictPrice = 3;
				break;
			}
			break;
		case 1:
			switch (destination) {
			case 0:
				finalDistrictPrice = 2;
				break;
			case 1:
				finalDistrictPrice = 1;
				break;
			case 2:
				finalDistrictPrice = 4;
				break;
			case 3:
				finalDistrictPrice = 2;
				break;
			case 4:
				finalDistrictPrice = 3;
				break;
			}
			break;
		case 2:
			switch (destination) {
			case 0:
				finalDistrictPrice = 3;
				break;
			case 1:
				finalDistrictPrice = 5;
				break;
			case 2:
				finalDistrictPrice = 1;
				break;
			case 3:
				finalDistrictPrice = 3;
				break;
			case 4:
				finalDistrictPrice = 2;
				break;
			}
			break;
		case 3:
			switch (destination) {
			case 0:
				finalDistrictPrice = 4;
				break;
			case 1:
				finalDistrictPrice = 3;
				break;
			case 2:
				finalDistrictPrice = 3;
				break;
			case 3:
				finalDistrictPrice = 1;
				break;
			case 4:
				finalDistrictPrice = 2;
				break;
			}
			break;
		case 4:
			switch (destination) {
			case 0:
				finalDistrictPrice = 3;
				break;
			case 1:
				finalDistrictPrice = 3;
				break;
			case 2:
				finalDistrictPrice = 2;
				break;
			case 3:
				finalDistrictPrice = 2;
				break;
			case 4:
				finalDistrictPrice = 1;
				break;
			}
			break;
		}
		return finalDistrictPrice;
	}
}
