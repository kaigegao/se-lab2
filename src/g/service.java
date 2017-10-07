package g;
import java.sql.*;
import java.util.ArrayList;

public class service{
	private static String DRIVER_MYSQL = "com.mysql.jdbc.Driver";   
    private static String URL = "jdbc:mysql://localhost:3306/BookDB?useUnicode=true&amp;characterEncoding=utf-8";//使用云平台需要更改
    private static Statement sta;
    private Connection con = null;
	public static void main()
	{	}
	//mysql的连接
	public void connect()                           
	{
		 try
	        {
	            Class.forName(DRIVER_MYSQL);     
	            con = DriverManager.getConnection(URL,"root","19970219gkg");   //使用云平台需要更改
	            sta = con.createStatement();     
	        } 
		 catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	}
    public ResultSet query(String sql)                   
    {
        ResultSet rst = null;
        try
        {  rst = sta.executeQuery(sql); } catch (SQLException e)
        { e.printStackTrace(); }
        return rst;
    }  

    
    
    public void exS(String sql) {    
    	try
        {  sta.execute(sql);
        } catch (SQLException e)
        {
      
            e.printStackTrace();
        }
    }
	
	public ArrayList<info> findjoin(String sql)  
	{
		ResultSet rst = null;
		ArrayList<info> bkli = new ArrayList<info>();//bklist
		
		try
        {
            rst = sta.executeQuery(sql);
            while(rst.next())
            {
            	info boo = new info();
            	boo.setName(rst.getString(2));
            	boo.setAge(rst.getInt(3));
            	boo.setCountry(rst.getString(4));
            	boo.setISBN(rst.getString(5));
            	boo.setTitle(rst.getString(6));
            	boo.setAuthorID(rst.getInt(7));
            	boo.setPublisher(rst.getString(8));
            	boo.setPDate(rst.getString(9));
            	boo.setPrice(rst.getDouble(10));
            	bkli.add(boo);
            }
        } 
		catch (SQLException e)
        {
            e.printStackTrace();
        }
		return bkli;
	}
	

    public ArrayList<info> findbook(String sql)                    
    {
        ResultSet rst = null;
        ArrayList<info> bkli = new ArrayList<info>();//booklist
        try
        {
            rst = sta.executeQuery(sql);
            while(rst.next())
            {
            	info bo = new info();//info book
            	bo.setISBN(rst.getString(1));
            	bo.setTitle(rst.getString(2));
            	bo.setAuthorID(rst.getInt(3));
            	bo.setPublisher(rst.getString(4));
            	bo.setPDate(rst.getString(5));
            	bo.setPrice(rst.getDouble(6));
            	bkli.add(bo);
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        return bkli;
    }
	
	public int chisbn(String isbn)    //check_isbn检查新加入的书籍的ISBN码是否已经出现过
	{
		try
        {
            ResultSet rst = sta.executeQuery("select count(*) exist from Book where ISBN = \"" + isbn + "\"");
            int temp = 0;
            while(rst.next())
            {temp = rst.getInt(1);}
            if(temp == 1 )
            {return 1;}
            else 
            {return 0;}
        } catch (SQLException e)
        { e.printStackTrace();}
		return 0;
	}
	public int chid(String existid)     //check_id检查新加入图书对应的作者是否存在
	{
		try
        {
            ResultSet rst = sta.executeQuery("select count(*) exist from Author where AuthorID = " + existid);
            int temp = 0;
            while(rst.next())
            {
            	temp = rst.getInt(1);
            }
            
            if(temp == 1 )
            {
            	return 1;
            }
            else 
            {
            	return 0;
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
		return 0;
	}
	
	public void Update(String ud)    
	{
		try {
			sta.executeUpdate(ud);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close()   //断开sql连接
	{
		try {
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return ;
	}
}
