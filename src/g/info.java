package g;
//数据库中的信息
public class info {
	//book表
	public String ISBN;
	public String Title;
	public int AuthorID;
	public String Publisher;
	public String PDate;
	public double Price;
	//author表
	public String Name;
	public int Age;
	public String Country;
	//get到book表中的所有信息
	public String getISBN() {
		return ISBN;}
	public String getTitle() {
		return Title;}
	public int getAuthorID() {
		return AuthorID;}
	public String getPublisher() {
		return Publisher;}
	public String getPDate() {
		return PDate;}
	public double getPrice() {
		return Price;}
	//set一下book表中的信息
	public void setISBN(String iSBN) {
		ISBN = iSBN;}
	public void setTitle(String title) {
		Title = title;}
	public void setAuthorID(int authorID) {
		AuthorID = authorID;}
	public void setPublisher(String publisher) {
		Publisher = publisher;}
	public void setPDate(String pDate) {
		PDate = pDate;}
	public void setPrice(double price) {
		Price = price;}
	//get到author表中的所有信息
	public String getName() {
		return Name;}
	public void setName(String name) {
		Name = name;}
	public int getAge() {
		return Age;}
	//set一下author表中的信息
	public void setAge(int age) {
		Age = age;}
	public String getCountry() {
		return Country;}
	public void setCountry(String country) {
		Country = country;}
}
