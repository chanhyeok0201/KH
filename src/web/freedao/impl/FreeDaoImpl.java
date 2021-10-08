package web.freedao.impl;

import java.sql.Connection;
import java.util.List;

import web.freedao.face.FreeDao;
import web.noticedao.impl.BoardFile;
import web.noticedao.impl.Notice;
import web.util.Paging;

public class FreeDaoImpl implements FreeDao {

	
	public List<Free> selectAll(Connection conn);
	public List<Free> selectAll(Connection conn, Paging paging);
	public int selectCntAll(Connection conn);
	public Free selectBoardByBoardno(Connection conn, Free boardno);
	public int updateHit(Connection conn, Free boardno);
	public String selectNickByUserid(Connection conn, Free viewBoard);
	public int insert(Connection conn, Free board);
	public int delete(Connection conn, Free board);
	public int update(Connection conn, Free board);
	public int selectNextBoardno(Connection conn);
	public int selectinsertFile(Connection conn, BoardFile boardFile);
	public BoardFile File(Connection conn, Free viewBoard);
	public int commentsinsert(Connection conn, Freecomments board);
	public int commentsdelete(Connection conn, Freecomments board);
	public int commentsupdate(Connection conn, Freecomments board);
	public int declare(Connection conn);
}
