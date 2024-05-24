package tool;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Action {
	public abstract void execute(HttpServletRequest request, HttpServletResponse response) throws Exception;

	public String getSuccessUrl() {
		// TODO 自動生成されたメソッド・スタブ
		return null;

	}
}
