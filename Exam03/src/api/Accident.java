package api;

import java.io.Serializable;

public class Accident implements Serializable {

	private static final long serialVersionUID = 6630769263431006799L;
	private String occrrncDt;
	private String occrrncDayCd;
	private int dthDnvCnt;
	private int injpsnCnt;
	
	public Accident() {
		
	}
	
	public Accident(String occrrncDt, String occrrncDayCd, int dthDnvCnt, int injpsnCnt) {
		super();
		this.occrrncDt = occrrncDt;
		this.occrrncDayCd = occrrncDayCd;
		this.dthDnvCnt = dthDnvCnt;
		this.injpsnCnt = injpsnCnt;
	}

	public String getOccrrncDt() {
		return occrrncDt;
	}

	public void setOccrrncDt(String occrrncDt) {
		this.occrrncDt = occrrncDt;
	}

	public String getOccrrncDayCd() {
		return occrrncDayCd;
	}

	public void setOccrrncDayCd(String occrrncDayCd) {
		this.occrrncDayCd = occrrncDayCd;
	}

	public int getDthDnvCnt() {
		return dthDnvCnt;
	}

	public void setDthDnvCnt(int dthDnvCnt) {
		this.dthDnvCnt = dthDnvCnt;
	}

	public int getInjpsnCnt() {
		return injpsnCnt;
	}

	public void setInjpsnCnt(int injpsnCnt) {
		this.injpsnCnt = injpsnCnt;
	}

	@Override
	public String toString() {
		return "Accident [occrrncDt=" + occrrncDt + ", occrrncDayCd=" + occrrncDayCd + ", dthDnvCnt=" + dthDnvCnt
				+ ", injpsnCnt=" + injpsnCnt + "]";
	}
	
	
}
