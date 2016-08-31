package sesschool.bank.action;

import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class FileDownloadAction extends ActionSupport {
	private int boardno; 
	private String contentType;
	private String contentDisposition;
	private InputStream inputStream;
	private long contentLength; 
	
	public FileDownloadAction() {
		// TODO Auto-generated constructor stub
	}
	
	public String execute(){
		System.out.println("FileDownload.execute()");
		return SUCCESS;
	}

	public int getBoardno() {
		return boardno;
	}

	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getContentDisposition() {
		return contentDisposition;
	}

	public void setContentDisposition(String contentDisposition) {
		this.contentDisposition = contentDisposition;
	}

	public InputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public long getContentLength() {
		return contentLength;
	}

	public void setContentLength(long contentLength) {
		this.contentLength = contentLength;
	}
	
	
}
