package web.freeservice.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import web.dto.Free;
import web.freedao.face.FreeDao;
import web.freedao.impl.FreeDaoImpl;
import web.freeservice.face.FreeService;
import web.noticeservice.impl.BoardFile;
import web.noticeservice.impl.Notice;
import web.util.Paging;

public class FreeServiceImpl implements FreeService {

	public List<Free> getList() {}
	public List<Free> getList(Paging paging) {}
	public Paging getPaging(HttpServletRequest req) {}
	public Free getNoticeno(HttpServletRequest req) {}
	public Free getview(Free boardno) {}
	public String getNick(Free viewBoard) {}
	public void insert(HttpServletRequest req) {}
	public void delete(HttpServletRequest req) {}
	public void update(HttpServletRequest req) {}
	public BoardFile getviewFile(Free viewBoard) {}
	public void commentsinsert(HttpServletRequest req);
	public void commentselete(HttpServletRequest req);
	public void commentupdate(HttpServletRequest req);
	public void declare(HttpServletRequest req);
}
