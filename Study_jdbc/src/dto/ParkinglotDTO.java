package dto;

public class ParkinglotDTO {
	
	private String carNo;
	private String model;
	
	public ParkinglotDTO() {	}
	
	public ParkinglotDTO(String carNo, String model) {
		super();
		this.carNo = carNo;
		this.model = model;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "ParkinglotDTO [carNo=" + carNo + ", model=" + model + "]";
	}
	
}
