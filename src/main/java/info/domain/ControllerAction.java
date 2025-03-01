package info.domain;

public class ControllerAction {

	private String where;
	private boolean isRedirect;
	
	public ControllerAction() {}

	public ControllerAction(String where, boolean isRedirect) {
		this.where = where;
		this.isRedirect = isRedirect;
	}

	public String getWhere() {
		return where;
	}

	public void setWhere(String where) {
		this.where = where;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	
	

	
	
	
}
