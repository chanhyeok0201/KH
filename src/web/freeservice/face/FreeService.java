package web.freeservice.face;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Free;
import web.freedao.face.FreeDao;
import web.freedao.impl.FreeDaoImpl;
import web.noticeservice.face.BoardFile;
import web.noticeservice.face.Notice;
import web.util.Paging;

public interface FreeService {

	FreeDao freedao = new FreeDaoImpl();
	
	public List<Free> getList();
	public List<Free> getList(Paging paging);
	public Paging getPaging(HttpServletRequest req);
	public Free getBoardno(HttpServletRequest req);
	public Free getview(Free boardNo);
	public String getNick(Free viewNotice);
	public void insert(HttpServletRequest req);
	public void delete(HttpServletRequest req);
	public void update(HttpServletRequest req);
	public BoardFile getviewFile(Free viewNotice);
	public void commentsinsert(HttpServletRequest req);
	public void commentsdelete(HttpServletRequest req);
	public void commentsupdate(HttpServletRequest req);
	public void declare(HttpServletRequest req)
}
