package C실습문제2;

public class Pair <K, P>{

	private K fisrt;
	private P second;
	
	public K getFisrt() {
		return fisrt;
	}
	public void setFisrt(K fisrt) {
		this.fisrt = fisrt;
	}
	public P getSecond() {
		return second;
	}
	public void setSecond(P second) {
		this.second = second;
	}
	@Override
	public String toString() {
		return "Pair {fisrt=" + fisrt + ", second=" + second + "}";
	}
	
	
	
	
}
