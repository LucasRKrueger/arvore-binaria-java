
public class NoArvoreBinaria<T> {
	int info;
	NoArvoreBinaria<T> esquerda;
	NoArvoreBinaria<T> direita;
	
	public NoArvoreBinaria(int info) {
		this.info = info;
		this.esquerda = null;
		this.direita = null;
	}
	
	public NoArvoreBinaria(int info, NoArvoreBinaria<T> esquerda, NoArvoreBinaria<T> direita) {
		this.info = info;
		this.esquerda = esquerda;
		this.direita = direita;
	}
	
	public int getInfo() {
		return this.info;
	}
	
	public NoArvoreBinaria<T> getEsquerda() {
		return this.esquerda;
	}
	
	public NoArvoreBinaria<T> getDireita() {
		return this.direita;
	}
	
	public void setEsquerda(NoArvoreBinaria<T> esquerda) {
		this.esquerda = esquerda;
	}
	
	public void setDireita(NoArvoreBinaria<T> direita) {
		this.direita = direita;
	}	
}

