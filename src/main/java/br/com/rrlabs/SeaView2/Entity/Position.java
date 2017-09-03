package br.com.rrlabs.SeaView2.Entity;

public class Position {
	
	int X;
	int Y;
	int Z;
	String Pos;
	

	public Position() {
		super();
	}

	public Position(int x, int y, int z, String pos) {
		super();
		X = x;
		Y = y;
		Z = z;
		Pos = pos;
	}
	
	public void reset() {
		setX(0);
		setY(0);
		setZ(0);
		setPos(Constantes.NORTE);
	}
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}
	public int getZ() {
		return Z;
	}
	public void setZ(int z) {
		Z = z;
	}
	public String getPos() {
		return Pos;
	}
	public void setPos(String pos) {
		Pos = pos;
	}
	
	

}
