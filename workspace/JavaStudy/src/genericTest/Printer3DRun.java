package genericTest;

interface Material {
	public abstract void doPrinting();
}

class Powder implements Material {
	public String toString() {
		return "사용물질: 파우더";
	}

	public void doPrinting() {
		System.out.println("파우더 제품 제작중...");
	}
}

class Plastic implements Material {
	public String toString() {
		return "사용물질: 플라스틱";
	}

	public void doPrinting() {
		System.out.println("플라스틱 제품 제작중...");
	}
}

class Print3D<T extends Material> {
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}

public class Printer3DRun {
	public static void main(String[] args) {
		Print3D<Powder> pPo = new Print3D<>();
		pPo.setMaterial(new Powder());
		Powder pow = pPo.getMaterial();
		System.out.println(pPo);
		pPo.printing();

		Print3D<Plastic> pPl = new Print3D<>();
		pPl.setMaterial(new Plastic());
		Plastic pla = pPl.getMaterial();
		System.out.println(pPl);
		pPl.printing();

		Print3D<Material> pMa = new Print3D<>();
		pMa.setMaterial(new Plastic());
		System.out.println(pMa);
		pMa.printing();
		
		pMa.setMaterial(new Powder());
		System.out.println(pMa);
		pMa.printing();
		
		
	
	
	}
}








