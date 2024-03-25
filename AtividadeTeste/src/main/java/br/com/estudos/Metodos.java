package br.com.estudos;
import java.util.Objects;
public class Metodos {
    Double a;
    Double  b;
    Double  c;
    Double  d;
    Double  e;
    Double f;
    public double expressao1(Double a, Double b, Double c){
        Objects.nonNull(a);
        Objects.nonNull(b);
        Objects.nonNull(c);

        Double  resultado = a + b * c;
        return resultado;
    }

    public double expressao2(Double a, Double b, Double c){
        Objects.nonNull(a);
        Objects.nonNull(b);
        Objects.nonNull(c);

        double  resultado = (a + b) % c;
        return resultado;
    }

    public double expressao3(Double a, Double b, Double c, Double d){
        Objects.nonNull(a);
        Objects.nonNull(b);
        Objects.nonNull(c);

        double  resultado = a + b * c / d;
        return resultado;
    }

    public double expressao4(Double a, Double b, Double c, Double d, Double e, Double f){
        Objects.nonNull(a);
        Objects.nonNull(b);
        Objects.nonNull(c);

        double  resultado = a + b / c * d - e % f;
        return resultado;
    }

}
