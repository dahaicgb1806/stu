package cn.tedu.sverlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.tedu.pojo.Door;
import cn.tedu.pojo.OrderDetail;

/**
 * Servlet implementation class ELsverlet
 */
@WebServlet("/ELsverlet")
public class ELsverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ELsverlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//  Auto-generated method stub页面想要通过el取值，servlet需要准备数据。
		//request.setAttribute("doorname", "永和大王");
		//request.setAttribute("tel", "666");
		//request.setAttribute("hai", "秦臻海");  
		
		//完成简单对象传递  
		//在servlet准备数据（对象）
		//在jsp中通过el表达式来获取数据
		Door d =new Door();
		d.setId(10);
		d.setDoorName("永和大王1店");
		d.setTel("010-45679155");
		
		request.setAttribute("dd",d);
		
		OrderDetail e=new OrderDetail();
		e.setId(20);
		e.setItem("油条豆浆");
		e.setNum(1);
		e.setPrice(15.23);
		request.setAttribute("ee",e);
		
		
		
		
		
		request.getRequestDispatcher("/eltest.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO Auto-generated method stub

	}

}
