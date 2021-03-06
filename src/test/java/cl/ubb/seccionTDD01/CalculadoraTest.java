package cl.ubb.seccionTDD01;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import cl.ubb.seccionTDD01.Calculadora;

public class CalculadoraTest {

	@Test	
	public void DosMasTresCinco(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.sumar(2,3);
		/*Assert*/
		assertThat(resultado,is(5));
	}
	@Test
	public void MenosUnoMasSieteEsSeis(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.sumar(-1,7);
		/*Assert*/
		assertThat(resultado,is(6));
	}
	@Test
	public void DocientosMenosSetentaytresEsCientoVeinteysiete(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.restar(200,73);
		/*Assert*/
		assertThat(resultado,is(127));
	}
	@Test
	public void MenosDiezMenosCincoEsMenosQuince(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.restar(-10,5);
		/*Assert*/
		assertThat(resultado,is(-15));
	}
	@Test
	public void DoceDivididoTresEsCuatro(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.division(12,3);
		/*Assert*/
		assertThat(resultado,is(4));
	}
	@Test
	public void TreintayseisDivididoseisEsSeis(){
		/*Arrange*/		
		Calculadora calculo = new Calculadora();
		/*Act*/
		int resultado= calculo.division(36,6);
		/*Assert*/
		assertThat(resultado,is(6));
	}
}
