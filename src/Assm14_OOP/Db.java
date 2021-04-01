package Assm14_OOP;

public class Db {

	private String data;
	private int yint;

	public String getData() {
		return data;
	}

	public int getYint() {
		return yint;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setYint(int yint) {
		this.yint = yint;
	}

	public void insertData(String data, int yint) {
		this.data = data;
		this.yint = yint;
	}

	public static void main(String[] args) {

		Db db = new Db();
		db.insertData("aaa", 123);
		System.out.println(db.getData());
		System.out.println(db.getYint());

		db.setData("zzz");
		db.setYint(200);
		System.out.println(db.getData());
		System.out.println(db.getYint());

	}
}
