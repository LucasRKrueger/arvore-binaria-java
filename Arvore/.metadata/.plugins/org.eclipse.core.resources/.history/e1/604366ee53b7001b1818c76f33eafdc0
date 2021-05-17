
public class ArvoreBinaria<T> {
	
	NoArvoreBinaria<T> raiz;
	
	public ArvoreBinaria() {
		raiz = null;
	}
	
	public void setRaiz(NoArvoreBinaria<T> no) {
		raiz = no;
	}
	
	public NoArvoreBinaria<T> getRaiz() {
		return raiz;
	}
	
	public boolean pertence(int info) {
		return pertence(this.raiz, info);
	}
	
	private boolean pertence (NoArvoreBinaria<T> no, int info) {
		if(no == null) {
			return false;
		} else {
			return no.info == info ||
			       pertence(no.esquerda, info) ||
			       pertence(no.direita, info);
		}
	}
	
	public String toString() {
		return arvorePre(this.raiz);
	}
	
	private String arvorePre(NoArvoreBinaria<T> no) {
		return no == null ?
				"<>"       :
		        "<" + no.getInfo() + arvorePre(no.getEsquerda()) + arvorePre(no.getDireita()) + ">";
	}
	
	public boolean estaVazia() {
		return this.raiz == null;
	}
	
	public int contarNos(NoArvoreBinaria<T> no) {
		 return no == null ? 0 : 1 + contarNos(no.getEsquerda()) + contarNos(no.getDireita());
	}
}
