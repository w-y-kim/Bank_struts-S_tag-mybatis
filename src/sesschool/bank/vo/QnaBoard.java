package sesschool.bank.vo;

public class QnaBoard {
	int boardno;
	String custid;
	String title;
	String content;
	String regdate;
	String originalfile;
	String savedfile;
	int hitcount;
	String replytext;
	String repdate ;
	
	
	
	public QnaBoard(int boardno, String custid, String title, String content, String regdate, String originalfile,
			String savedfile, int hitcount, String replytext, String repdate) {
		super();
		this.boardno = boardno;
		this.custid = custid;
		this.title = title;
		this.content = content;
		this.regdate = regdate;
		this.originalfile = originalfile;
		this.savedfile = savedfile;
		this.hitcount = hitcount;
		this.replytext = replytext;
		this.repdate = repdate;
	}
	public int getBoardno() {
		return boardno;
	}
	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getOriginalfile() {
		return originalfile;
	}
	public void setOriginalfile(String originalfile) {
		this.originalfile = originalfile;
	}
	public String getSavedfile() {
		return savedfile;
	}
	public void setSavedfile(String savedfile) {
		this.savedfile = savedfile;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public String getReplytext() {
		return replytext;
	}
	public void setReplytext(String replytext) {
		this.replytext = replytext;
	}
	public String getRepdate() {
		return repdate;
	}
	public void setRepdate(String repdate) {
		this.repdate = repdate;
	}
	@Override
	public String toString() {
		return "QnaBoard [boardno=" + boardno + ", custid=" + custid + ", title=" + title + ", content=" + content
				+ ", regdate=" + regdate + ", originalfile=" + originalfile + ", savedfile=" + savedfile + ", hitcount="
				+ hitcount + ", replytext=" + replytext + ", repdate=" + repdate + "]";
	}


}

