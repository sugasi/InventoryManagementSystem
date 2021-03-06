package inv.servlet;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import inv.bean.Item;
import inv.service.ItemService;

@WebServlet("/item")
public class ItemServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		ItemService itemService = new ItemService();
		ResultSet result = itemService.getItem();
		if(null != result ) {
			httpServletRequest.setAttribute("result", result);
		} else {
			httpServletRequest.setAttribute("result", null);
		}
	}
	
	protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
		Item item = new Item();
		item.setItemName(httpServletRequest.getParameter("itemName"));
		item.setItemImage(httpServletRequest.getInputStream());
		item.setItemCategory(httpServletRequest.getParameter("itemCategory"));
		item.setItemQuantity(httpServletRequest.getParameter("itemQuantity"));
		item.setItemUnit(httpServletRequest.getParameter("itemUnit"));
		item.setItemUnitPrice(httpServletRequest.getParameter("itemUnitPrice"));
		item.setItemStatus(httpServletRequest.getParameter("itemStatus"));
		item.setItemId(Integer.valueOf(httpServletRequest.getParameter("itemId")));
		ItemService itemService = new ItemService();
		boolean status = itemService.updateItem(item);
		if(status) {
			httpServletRequest.setAttribute("status", "success");
		} else {
			httpServletRequest.setAttribute("status", "failure");
		}
	}
}
