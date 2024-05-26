package baitap3;

public class XeOto {
	  private String hangXe;
	  private int namSanXuat;
	  private float dongCo;

	  public XeOto() {
	  }

	  public XeOto(String hangXe, int namSanXuat, float dongCo) {
	    this.hangXe = hangXe;
	    this.namSanXuat = namSanXuat;
	    this.dongCo = dongCo;
	  }
	}

	public class XeBus extends XeOto {
	  private int soGhe;

	  public XeBus() {
	  }

	  public XeBus(String hangXe, int namSanXuat, float dongCo, int soGhe) {
	    super(hangXe, namSanXuat, dongCo);
	    this.soGhe = soGhe;
	  }
	}

