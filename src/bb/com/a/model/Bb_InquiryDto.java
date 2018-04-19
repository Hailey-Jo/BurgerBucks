package bb.com.a.model;

import java.io.Serializable;

public class Bb_InquiryDto implements Serializable {
	private int seq;
	private String title;
	private String email;
	private String regdate;
	private String content;
	private int status;
	
	public Bb_InquiryDto() {}

	public Bb_InquiryDto(int seq, String title, String email, String regdate, String content, int status) {
		super();
		this.seq = seq;
		this.title = title;
		this.email = email;
		this.regdate = regdate;
		this.content = content;
		this.status = status;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return seq + "-" + title + "-" + email + "-" + regdate
				+ "-" + content + "-" + status;
	}

	


	
	
	
}
