package web.freedao.face;



public interface FreeDao {

	private PreparedStatement ps = null; //SQL수행 객체
	private ResultSet rs = null; //SQL조회 결과 객체
	
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
