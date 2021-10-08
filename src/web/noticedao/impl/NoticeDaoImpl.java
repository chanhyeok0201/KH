package web.noticedao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import web.noticedao.face.BoardFile;
import web.noticedao.face.Notice;
import web.util.Paging;

public class NoticeDaoImpl {

	private PreparedStatement ps = null; //SQL수행 객체
	private ResultSet rs = null; //SQL조회 결과 객체
	
	public List<Notice> selectAll(Connection conn);
	public List<Notice> selectAll(Connection conn, Paging paging);
	public int selectCntAll(Connection conn);
	public Notice selectBoardByBoardno(Connection conn, Notice boardno);
	public int updateHit(Connection conn, Notice boardno);
	public String selectNickByUserid(Connection conn, Notice viewBoard);
	public int insert(Connection conn, Notice board);
	public int delete(Connection conn, Notice board);
	public int update(Connection conn, Notice board);
	public int selectNextBoardno(Connection conn);
	public int selectinsertFile(Connection conn, BoardFile boardFile);
	public BoardFile File(Connection conn, Notice viewBoard);
	public int commentsinsert(Connection conn, Notice board);
	public int commentsdelete(Connection conn, Notice board);
}
