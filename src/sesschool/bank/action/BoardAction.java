package sesschool.bank.action;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import sesschool.bank.dao.BoardDAO;
import sesschool.bank.util.FileService;
import sesschool.bank.util.PageNavigator;
import sesschool.bank.vo.Board;

public class BoardAction extends ActionSupport implements SessionAware{
	
	private Board board;
	private int boardno;
	private List<Board> boardlist; 
	
	private PageNavigator pagenavi;// 페이징 관련 정보 
	private int currentPage = 1; //게시물 목록의 현재 페이지
	private String searchField;// 검색대상필드
	private String searchText; //검색어
	
	
	private File upload; // jsp에서 file s태그의 name 속성과 같아야함 , java.io의 file
	private String uploadFileName; // 업로드할 파일의 파일명 
	private String uploadContentType;//업로드할 파일의 컨텐츠 
	
	Map<String, Object> session; //세션정보 
	
	BoardDAO dao = new BoardDAO(); 

	public BoardAction() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String insertBoard() throws Exception{
		//세션으로부터 로그인한 ID 읽어서 board 객체에 저장
		String loginId = (String) session.get("loginId");
		board.setCustid(loginId); 
		
		//첨부파일이 이씅면 저장처리 
		if(upload != null){
			FileService fs = new FileService();
			String basePath = getText("board.uploadpath");
			String svedfile = fs.saveFile(upload, basePath, uploadFileName);
			board.setSavedfile("");
			board.setOriginalfile(uploadFileName); 
			
			dao.insertBoard(board); 
		}
		return loginId;
	}

	public String listBoard(){
		return null;
		
	}
	public String readBoard(){
		//전달된 글번호로 검색, 해당 번호의 글이 없으면 리턴 
		board = dao.getBoard(boardno); 
		if(board == null) return INPUT; 
		return SUCCESS;
	}
	public String deleteBoard(){
		
		return SUCCESS;
	}
	
	//getter & setter
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public Board getBoard() {
		return board;
	}


	public void setBoard(Board board) {
		this.board = board;
	}


	public int getBoardno() {
		return boardno;
	}


	public void setBoardno(int boardno) {
		this.boardno = boardno;
	}


	public List<Board> getBoardlist() {
		return boardlist;
	}


	public void setBoardlist(List<Board> boardlist) {
		this.boardlist = boardlist;
	}


	public PageNavigator getPagenavi() {
		return pagenavi;
	}


	public void setPagenavi(PageNavigator pagenavi) {
		this.pagenavi = pagenavi;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public String getSearchField() {
		return searchField;
	}


	public void setSearchField(String searchField) {
		this.searchField = searchField;
	}


	public String getSearchText() {
		return searchText;
	}


	public void setSearchText(String searchText) {
		this.searchText = searchText;
	}


	public File getUpload() {
		return upload;
	}


	public void setUpload(File upload) {
		this.upload = upload;
	}


	public String getUploadFileName() {
		return uploadFileName;
	}


	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}


	public String getUploadContentType() {
		return uploadContentType;
	}


	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}

}
