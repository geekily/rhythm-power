package rhythm_power;

import java.io.Serializable;

public class Rhythm_LoginVO implements Serializable{

	private String id; // ���̵�
	private String pw; // ��й�ȣ
	private String pwc; // ��й�ȣ ��Ȯ��
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPwc() {
		return pwc;
	}
	public void setPwc(String pwc) {
		this.pwc = pwc;
	}

}
