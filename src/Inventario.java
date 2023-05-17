
public class Inventario {
	
	//ATRIBUTOS BOLSAS DEL INVENTARIO//
	int NumBolsas; 
	String KG;
	
	public Inventario(int numBolsas, String kg) {
		super();
		NumBolsas = numBolsas;
		KG = kg;
	}

	public int getNumBolsas() {
		return NumBolsas;
	}

	public void setNumBolsas(int numBolsas) {
		NumBolsas = numBolsas;
	}

	public String getKG() {
		return KG;
	}

	public void setKG(String kg) {
		KG = kg;
	}

}
