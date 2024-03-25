package br.com.estudos;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class MetodosTest {

    @Test
    public void testMetodo1soma() {

        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao1(2.0,4.0,6.0);
        Assert.assertEquals(Double.valueOf(26.0), resultado);

    }
    @Test
    public void testMetodo2soma(){
        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao1(1.0,2.0,3.0);
        Assert.assertNotNull(resultado);

    }
    @Test
    public void testMetodo3soma(){
        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao1(0.0,0.0,0.0);
        Assert.assertEquals(0,0 ,resultado);
    }

    @Test
    public void testMetodo1sub(){

        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao2(2.0,8.5,5.0);
        Assert.assertEquals(Double.valueOf(0.5),resultado);


    }
    @Test
    public void testMetodo2sub(){

        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao2(2.0,8.5,5.0);
        Assert.assertNotNull(resultado);
    }

    @Test
    public void testMetodo3sub(){

        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao2(0.0,0.0,0.0);
        Assert.assertEquals(0,0 ,resultado);
    }

    @Test
    public void testMetodo1mul(){
        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao3(2.0,4.0,2.6,2.0);
        Assert.assertEquals(Double.valueOf(7.2), resultado);

    }
    @Test
    public void testMetodo2mul(){
        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao3(2.0,3.0,4.0,5.0);
        Assert.assertNotNull(resultado);
        Assert.assertEquals(Double.valueOf(4.4),resultado);
    }
    @Test
    public void testMetodo3mul(){
        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao3(0.0,0.0,0.0,0.0);
        Assert.assertEquals(0,0, resultado);
    }

    @Test
    public void testMetodo1Div(Double a, Double b, Double c, Double d, Double e, Double f){
        Metodos metodos = new Metodos();
        Double resultado = metodos.expressao4(20.0,9.0,6.0,1.0,0.0,0.0);
        Assert.assertEquals(Double.valueOf(200.9), resultado);
    }

    @Test
    public void test

}
