package sesschool.bank.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.jasper.tagplugins.jstl.core.ForEach;

import sesschool.bank.vo.Account;
import sesschool.bank.vo.Board;

public class BoardDAO {
	private SqlSessionFactory sqlSessFac = MybatisConfig.getSqlSessionFactory();
	private SqlSession ss;
	private HashMap<String, String> map = new HashMap<String, String>();

	public BoardDAO() {
	}

	public void insertBoard(Board board) {
		System.out.println("BoardDAO.insertBoard()");
		ss = sqlSessFac.openSession();
		try {
			ss.insert("board.insertBoard", board);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 검색조건과 일치하는 게시물의 수를 구하는 메소드
	 * 
	 * @param searchField
	 * @param searchText
	 * @return BoardAction.listBaoard()에서 pageNavigator를 만들 때 사용
	 */
	public int getTotal(String searchField, String searchText) {
		System.out.println("BoardDAO.getTotal()");
		int result = 0;
		ss = sqlSessFac.openSession();
		try {
			// TODO 뭔데
			map.put("searchText", searchText);
			map.put("searchText", searchText);
			System.out.println("===============1");
			result = ss.selectOne("board.getTotal", map);
			ss.commit();
			System.out.println("===============2");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	/**
	 * @param searchField
	 *            검색타입
	 * @param searchText
	 *            검색단어
	 * @param startRecord
	 *            시작지점 pagenavi.getStartRecord() : startPageGroup = currentGroup
	 *            * pagePerGroup + 1;
	 * @param countPerPage
	 *            //현재 그룹 currentGroup = (currentPage - 1) / pagePerGroup;
	 * @return
	 */
	public List<Board> listBoard(String searchField, String searchText, int startRecord, int countPerPage) {
		System.out.println("BoardDAO.listBoard()");
		List<Board> result = null;
		ss = sqlSessFac.openSession();
		try {
			map.put("searchField", searchField);
			map.put("searchText", searchText);

			// 결과 레코드 중 읽을 위치와 개수(시작그룹,시작페이지 기준)
			RowBounds bound = new RowBounds(startRecord, countPerPage);

			result = ss.selectList("board.listBoard", map, bound); // FIXME 파라미터
																	// 뭘까
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;

	}

	public Board getBoard(int data) {
		System.out.println("BoardDAO.getBoard()");
		Board board = null;
		ss = sqlSessFac.openSession();
		try {
			board = ss.selectOne("board.getBoard", data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return board;

	}

	public int deleteBoard(int data) {
		System.out.println("BoardDAO.deleteBoard()");
		int result = 0;
		ss = sqlSessFac.openSession();
		try {
			result = ss.delete("board.deleteBoard", data);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;

	}

	public int insertReply(Board board) {
		System.out.println("BoardDAO.insertReply()");
		int result = 0;
		ss = sqlSessFac.openSession();
		try {
			result = ss.insert("board.insertReply", board);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	public int updateBoard(Board board) {
		System.out.println("BoardDAO.updateBoard()");
		int result = 0;
		ss = sqlSessFac.openSession();
		try {
			result = ss.update("board.updateBoard", board);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ss != null)
					ss.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}

}
