package blt2.model;

public abstract class VuKhi implements Cloneable {
	protected String tenvk;
	protected int soluong;
	public abstract void tanCong();
	public abstract void phongThu();
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	@Override
	public String toString() {
		return "VuKhi [tenvk=" + tenvk + ", soluong=" + soluong + "]";
	} 
	
}
