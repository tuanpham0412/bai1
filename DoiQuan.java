
package blt2.model;

public class DoiQuan extends NhanVat {
	private String phepthuat;

	/**
	 * @param nangluong
	 * @param ten
	 * @param phepthuat
	 */
	public DoiQuan(double nangluong, String ten, String phepthuat) {
		super(nangluong, ten);
		this.phepthuat = phepthuat;
	}

	/**
	 * @return the phepthuat
	 */
	public String getPhepthuat() {
		return phepthuat;
	}

	/**
	 * @param phepthuat the phepthuat to set
	 */
	public void setPhepthuat(String phepthuat) {
		this.phepthuat = phepthuat;
	}

	

	@Override
	public String toString() {
		return "PhuThuy [phepthuat=" + phepthuat + ", getNangluong()=" + getNangluong() + ", getTen()=" + getTen()
				+ ", getDsvk()=" + getDsvk() + "]";
	}

	@Override
	public void sangTrai() {
		System.out.println("Bay sang trai 15m");
	}

	@Override
	public void sangPhai() {
		System.out.println("Bay sang phai 10m");
	}
	
	
}

