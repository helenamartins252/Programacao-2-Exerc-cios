

public class Retangulo {
    private double altura = 1;
    private double largura = 1;

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        if(altura>0 && altura<20){
            this.altura=altura;
        }else {
            System.out.println("Altura Inválida!");
        }
    }
    public double getLargura(){
        return largura;
    }
    public void setLargura(Double largura){
        if (largura > 0 && largura<20 ){
            this.largura=largura;
        }else{
            System.out.println("Largura Inválida!");
        }
    }

    public double calcularArea(){
        return altura*largura;
    }
    public double calcularPerimetro(){
        return 2*(altura+largura);
    }

}
