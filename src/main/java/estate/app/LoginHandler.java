package estate.app;

import com.google.gson.Gson;
import estate.common.util.LogUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by kangbiao on 15-9-27.
 *
 */
public class LoginHandler implements Filter
{
    @Override
    public void init(FilterConfig filterConfig) throws ServletException
    {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException,
            ServletException
    {
        HttpServletRequest reqeust = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

//
//        HttpSession session = reqeust.getSession();
//        if (session==null)
//        {
//            LogUtil.E("nosession");
//            return;
//        }
//        String name=(String) session.getAttribute("name");
//        if (name==null||name.equals(""))
//        {
//            session.setAttribute("name","kangbiao");
//            LogUtil.E("正在设置cookie");
//        }
//        LogUtil.E("name:"+name);


        LogUtil.E(reqeust.getParameter("phone"));
        // TODO 为适应验收而加的验证方法,以后都要改
        String phone = reqeust.getParameter("phone");
        String path = ((HttpServletRequest) req).getServletPath();
        if (!"/api/user/login".equals(path))
        {
            if (phone == null || phone.equals(""))
            {
                try
                {
                    response.setContentType("application/json");
                    response.setCharacterEncoding("UTF-8");
//                    LogUtil.E("没有登陆");
                    Gson gson=new Gson();

                    response.getWriter().print(gson.toJson(reqeust.getSession()));
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            else
            {
                chain.doFilter(req, res);
            }
        }
        else
        {
            chain.doFilter(req, res);
        }
    }

    @Override
    public void destroy()
    {

    }
}