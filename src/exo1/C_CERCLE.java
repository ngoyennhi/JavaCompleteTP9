package exo1;

public class C_CERCLE {
	// les coordonnées x et y du centre du cercle
	private int x;
	private int y;
	private int rayon;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getRayon() {
		return rayon;
	}

	public void setRayon(int rayon) {
		this.rayon = rayon;
	}

	// les attributes
	public C_CERCLE() {
		// TODO Auto-generated constructor stub
		this.x = 1;
		this.y = 1;
		this.rayon = 1;
	}

	// les methodes
	public C_CERCLE(int abs, int ord, int rayon) {
		this.x = abs;
		this.y = ord;
		this.rayon = rayon;
	}

	public void deplace(int delta_x, int delta_y) {
		x += delta_x;
	 	y += delta_y;
	}

	public void affiche() {
		System.out.println("les coordonnées x et y du centre du cercle: x =  " + x + " , y = " + y);
		System.out.println("le rayon =  " + rayon);
	}

	public Boolean compare(C_CERCLE cerle1, C_CERCLE cerle2) {
		int rayon1 = cerle1.getRayon();
		int rayon2 = cerle2.getRayon();
		if (rayon1 > rayon2) {
			System.out.println("Cerle 1 est plus grand que Cerle 2");
			return true;
		} else {
			System.out.println("Cerle 2 est plus grand que Cerle 1");
			return false;
		}
	}

	public double surface() {
		double pi = 3.14;
		double surfaceCercle = pi * getRayon() * getRayon();
		System.out.println("La surface du cercle est : " + surfaceCercle);
		return surfaceCercle;
	}
}