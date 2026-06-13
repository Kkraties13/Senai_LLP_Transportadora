public class VeiculoFluvial extends Veiculo {
    private String nroRegistroMarinha;
    private double boca; // largura
    private double caladoAereo; // altura
    
    public VeiculoFluvial(int anoFabricacao, String marca, String modelo, String propulsao,
                         String nroRegistroMarinha, double boca, double caladoAereo) {
        super(anoFabricacao, marca, modelo, propulsao);
        this.nroRegistroMarinha = nroRegistroMarinha;
        this.boca = boca;
        this.caladoAereo = caladoAereo;
    }
    
    public String getNroRegistroMarinha() {
        return nroRegistroMarinha;
    }
    
    public void setNroRegistroMarinha(String nroRegistroMarinha) {
        this.nroRegistroMarinha = nroRegistroMarinha;
    }
    
    public double getBoca() {
        return boca;
    }
    
    public void setBoca(double boca) {
        this.boca = boca;
    }
    
    public double getCaladoAereo() {
        return caladoAereo;
    }
    
    public void setCaladoAereo(double caladoAereo) {
        this.caladoAereo = caladoAereo;
    }
    
    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura)) * distancia;
    }
}
