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

public class BoardAction extends ActionSupport implements SessionAware {

	private Board board;
	private int boardno;
	private List<Board> boardlist;

	private PageNavigator pagenavi;// 페이징 관련 정보
	private int currentPage = 1; // 게시물 목록의 현재 페이지
	private String searchField;// 검색대상필드
	private String searchText; // 검색어

	private File upload; // jsp에서 file s태그의 name 속성과 같아야함 , java.io의 file
	private String uploadFileName; // 업로드할 파일의 파일명
	private String uploadContentType;// 업로드할 파일의 컨텐츠

	private Map<String, Object> session; // 세션정보

	BoardDAO dao = new BoardDAO();

	public BoardAction() {
		// TODO Auto-generated constructor stub
	}

	public String insertBoard() throws Exception {
		// 세션으로부터 로그인한 ID 읽어서 board 객체에 저장
		String loginId = (String) session.get("loginId");
		board.setCustid(loginId);

		// 첨부파일이 이씅면 저장처리
		if (upload != null) {
			FileService fs = new FileService();
			String basePath = getText("board.uploadpath");
			String svedfile = fs.saveFile(upload, basePath, uploadFileName);
			board.setSavedfile("");
			board.setOriginalfile(uploadFileName);

			dao.insertBoard(board);
		}
		return SUCCESS;
	}

	public String listBoard() {
		System.out.println("BoardAction.listBoard()");
		// 전체 글수 구하기
		System.out.println("검색필드:" + searchField + ",검색어:" + searchText);
		int totalRecordsCount = dao.getTotal(searchField, searchText);
		if(totalRecordsCount ==0){
			return NONE; 
		}
		System.out.println("전체글 구하기 완료");
		// user.properties에서 지정한 페이지 광련 상수들 읽기
		int countPerPage = Integer.parseInt(getText("board.countperpage")); // 상수읽어옴
		int pagePerGroup = Integer.parseInt(getText("board.pagepergroup"));
		System.out.println(countPerPage+"//"+pagePerGroup);
		System.out.println("상수읽기 완료");

		
		//page info : 
		pagenavi = new PageNavigator(countPerPage, pagePerGroup, currentPage, totalRecordsCount);
		System.out.println("creating navigation SUCCESS");
		// 현재 페이지에 해당하는 글 목록 읽기(전체 레코드 중 보여주는 페이지)
		boardlist = dao.listBoard(searchField, searchText, pagenavi.getStartRecord(), pagenavi.getCountPerPage());
		System.out.println("creating boardlist SUCCESS");

		return SUCCESS;

	}

	public String readBoard() {
		// 전달된 글번호로 검색, 해당 번호의 글이 없으면 리턴
		board = dao.getBoard(boardno);
		if (board == null)
			return INPUT;
		return SUCCESS;
	}

	public String deleteBoard() {
		int result = dao.deleteBoard(boardno);
		if(result == 0){return ERROR;}
		return SUCCESS;
	}

	// getter & setter
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
