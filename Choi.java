
package blt2.model;

public class Choi extends VuKhi {
	private double tamdanh;
	public Choi(double tamdanh, String tenvk, int soluong) {
		this.soluong = soluong;
		this.tenvk = tenvk;
		this.tamdanh = tamdanh;
	}
	
	

	/**
	 * @return the tamdanh
	 */
	public double getTamdanh() {
		return tamdanh;
	}



	@Override
	public String toString() {
		return "Choi [tamdanh=" + tamdanh + ", getTenvk()=" + getTenvk() + ", getSoluong()=" + getSoluong() + "]";
	}



	private String getSoluong() {
		return null;
	}



	/**
	 * @param tamdanh the tamdanh to set
	 */
	public void setTamdanh(double tamdanh) {
		this.tamdanh = tamdanh;
	}



	@Override
	public void tanCong() {
		System.out.println("Vac choi dap");
	}

	@Override
	public void phongThu() {
		System.out.println("Mua choi");
	}

}
