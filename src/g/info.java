package g;
//���ݿ��е���Ϣ
public class info {
	//book��
	public String ISBN;
	public String Title;
	public int AuthorID;
	public String Publisher;
	public String PDate;
	public double Price;
	//author��
	public String Name;
	public int Age;
	public String Country;
	//get��book���е�������Ϣ
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
	//setһ��book���е���Ϣ
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
	//get��author���е�������Ϣ
	public String getName() {
		return Name;}
	public void setName(String name) {
		Name = name;}
	public int getAge() {
		return Age;}
	//setһ��author���е���Ϣ
	public void setAge(int age) {
		Age = age;}
	public String getCountry() {
		return Country;}
	public void setCountry(String country) {
		Country = country;}
}
