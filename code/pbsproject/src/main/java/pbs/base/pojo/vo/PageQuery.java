package pbs.base.pojo.vo;

public class PageQuery {

	private int start;
	private int rows;
	
	public void handle(int page, int rows) {

		this.start = (page-1)*rows;
		this.rows = rows;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
	
	
}
