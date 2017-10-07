package g;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class action extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String AthrNmS; //author's name for searching…
	
	private String AName;
	private String AAge;
	private String ACountry;

	private String ISt;     //input
	private String Tit;     //input
	private String Aut;     //input
	private String Pst;     //input
	private String Pdt;     //input
	private String Prt;     //input
	

	private ArrayList<info> srst = new ArrayList<info>();
	private ArrayList<info> srst1 = new ArrayList<info>();
	public String Isb;
	
	public String Dsb;
	
	public String tishi = null;
	
	public String gettishi() {
		return tishi;
	}

	public String getDsb() {
		return Dsb;
	}
	public void setDsb(String Dsb) {
		this.Dsb = Dsb;
	}
	public String getIsb() {
		return Isb;
	}
	public void setIsb(String Isb) {
		this.Isb = Isb;
	}

	public ArrayList<info> getSrst1() {
		return srst1;
	}
	public void setSrst1(ArrayList<info> srst1) {
		this.srst1 = srst1;
	}
	public ArrayList<info> getSrst() {
		return srst;
	}
	public void setSrst(ArrayList<info> srst) {
		this.srst = srst;
	}
	public String getAName() {
		return AName;
	}
	public void setAName(String AName) {
		this.AName = AName;
	}

	public String getAAge() {
		return AAge;
	}
	public void setAAge(String AAge) {
		this.AAge = AAge;
	}

	public String getACountry() {
		return ACountry;
	}
	public void setACountry(String ACountry) {
		this.ACountry = ACountry;
	}

	public String getISt() {
		return ISt;
	}
	public void setISt(String ISt) {
		this.ISt = ISt;
	}

	public String getTit() {
		return Tit;
	}
	public void setTit(String Tit) {
		this.Tit = Tit;
	}

	public String getAut() {
		return Aut;
	}
	public void setAut(String Aut) {
		this.Aut = Aut;
	}

	public String getPst() {
		return Pst;
	}
	public void setPst(String Pst) {
		this.Pst = Pst;
	}

	public String getPdt() {
		return Pdt;
	}
	public void setPdt(String Pdt) {
		this.Pdt = Pdt;
	}

	public String getPrt() {
		return Prt;
	}
	public void setPrt(String Prt) {
		this.Prt = Prt;
	}
	

	public String getAthrNms() {
		return AthrNmS;
	}
	public void setAthrNmS(String AthrNmS) {
		this.AthrNmS = AthrNmS;
	}
	public String ADDin()      //新增一本书
	{
		service db1 = new service();
		db1.connect();
		int bookex = db1.chisbn(ISt);
		if(bookex==1)
		{
			tishi = "ISBN重复！不能添加！";
			return SUCCESS;
		}
		int exist = db1.chid(Aut);
		if(exist == 0)
		{
			String ins = "insert Author value(" + Aut + ",null,null,null)";
			db1.exS(ins);
		}
		
		String sql = "insert Book value(" + "\"" + ISt + "\",\"" + Tit + "\"," + Aut + ",\"" + Pst + "\",\"" + Pdt + "\"," + Prt +")"; 
		db1.exS(sql);
		db1.close();
		
		if(exist == 0)
		{
			return "input";
		}
		else
		{
			tishi = "成功加入!";
			return SUCCESS;	
		}
	}
	public String execute()    
	{
		tishi = "欢迎使用！";
		return SUCCESS;
	}
	public String SearchA()
	{
		service db1 = new service();
		db1.connect();
		String sql="select * from Author a join Book b where a.AuthorID = b.AuthorID and a.Name = '" + AthrNmS + "'";
		srst = db1.findjoin(sql);
		return SUCCESS;
	}
	
	public String SearchB()
	{
		service db1 = new service();
		db1.connect();
		String sql="select * from Author a join Book b where a.AuthorID = b.AuthorID";
		srst = db1.findjoin(sql);
		return SUCCESS;
	}
	public String Delis()
	{
		service db1 = new service();
		db1.connect();
		String temp = "delete from Book where ISBN = " + "\"" + Dsb + "\"";
		db1.exS(temp);
		db1.close();
		tishi="删除成功！";
		return SUCCESS;
	}
	

	
	public String ADDAu()           //更新作者信息
	{
		service db1 = new service();
		db1.connect();
		String temp = "update Author set Name = '" + AName + "' where AuthorID =" + Aut;
		db1.exS(temp);
		temp = "update Author set Age = " + AAge + " where AuthorID =" + Aut;
		db1.exS(temp);
		temp = "update Author set Country = '" + ACountry + "' where AuthorID =" + Aut;
		db1.exS(temp);
		db1.close();
		tishi = "作者加入成功!";
		return SUCCESS;
	}
	
	public String UpBook()           //更新图书信息
	{
		service db1 = new service();
		db1.connect();
		
		int exist = db1.chid(Aut);
		if(exist == 0)
		{
			String ins = "insert Author value(" + Aut + ",null,null,null)";
			db1.exS(ins);
		}
		
		String temp = "update Book set AuthorID = " + Aut + " where ISBN ='" + ISt + "'";
		db1.exS(temp);
		temp = "update Book set Publisher = '" + Pst + "' where ISBN ='" + ISt + "'";
		db1.exS(temp);
		temp = "update Book set PublishDate = '" + Pdt + "' where ISBN ='" + ISt + "'";
		db1.exS(temp);
		temp = "update Book set Price = " + Prt + " where ISBN ='" + ISt + "'";
		db1.exS(temp);
		db1.close();
		
		if(exist == 0)
		{
			return "input";
		}
		else
		{
			tishi = "更新成功!";
			return SUCCESS;	
		}
	}
	public String FindBook()
	{
		service db1 = new service();
		db1.connect();
		String temp = "select * from Book where ISBN=\""+ Dsb + "\"";
		srst = db1.findbook(temp);
		db1.close();
		return SUCCESS;
	}
	public String SISBN()
	{
		service db1 = new service();
		db1.connect();
		String temp = "select * from Author a JOIN Book b where b.AuthorID = a.AuthorID and b.ISBN = " + "\"" + Isb + "\"";
		srst1 = db1.findjoin(temp);
		db1.close();
		return SUCCESS;
	}
}
//这是一次修改！！！！！！！！！！！
//第二次修改！！！