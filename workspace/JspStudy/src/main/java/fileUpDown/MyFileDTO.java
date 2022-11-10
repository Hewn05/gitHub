package fileUpDown;

public class MyFileDTO {
	private String idx;
	private String name;
	private String title;
	private String cate;
	private String ofile;
	private String nfile;
	private String regdate;
	
	
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getIdx(){
		return idx;
	}
	public String getName() {
		return name;
	}
	public String getTitle() {
		return title;
	}
	public String getCate() {
		return cate;
	}
	public String getOfile() {
		return ofile;
	}
	public String getNfile() {
		return nfile;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public void setOfile(String ofile) {
		this.ofile = ofile;
	}
	public void setNfile(String nfile) {
		this.nfile = nfile;
	}
	
	
}
