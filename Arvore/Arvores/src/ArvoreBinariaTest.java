import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArvoreBinariaTest {

	@Test
	void testEstaVazio() {		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		
		assertEquals(arvore.estaVazia(), true);
	}
	
	@Test
	void testNaoEstaVazio() {
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);

		assertEquals(arvore.estaVazia(), false);
	}
	
	@Test
	void testToString() {
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, null, no4);
		
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, no5, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.toString(), "<1<2<><4<><>>><3<5<><>><6<><>>>>");
	}
	
	@Test
	void testPertence1() {
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);

		assertEquals(arvore.pertence(1), true);
	}
	
	@Test
	void testPertence2() {		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.pertence(3), true);	
	}
	
	@Test
	void testPertence6() {		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.pertence(6), true);	
	}
	
	@Test
	void testNaoPertence() {		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.pertence(10), false);	
	}
	
	@Test
	void testContarNos() {		
		NoArvoreBinaria<Integer> no4 = new NoArvoreBinaria<>(4);
		NoArvoreBinaria<Integer> no5 = new NoArvoreBinaria<>(5);
		NoArvoreBinaria<Integer> no2 = new NoArvoreBinaria<>(2, no4, no5);
		
		NoArvoreBinaria<Integer> no7 = new NoArvoreBinaria<>(7);
		NoArvoreBinaria<Integer> no6 = new NoArvoreBinaria<>(6, no7, null);
		
		NoArvoreBinaria<Integer> no3 = new NoArvoreBinaria<>(3, null, no6);

		NoArvoreBinaria<Integer> no1 = new NoArvoreBinaria<>(1, no2, no3);
		
		ArvoreBinaria<Integer> arvore = new ArvoreBinaria<>();
		arvore.setRaiz(no1);
		
		assertEquals(arvore.contarNos(), 7);	
	}
}
