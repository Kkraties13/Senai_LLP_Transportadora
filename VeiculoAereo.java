public class VeiculoAereo extends Veiculo {
    private String rab; // Registro Aeronáutico Brasileiro
    private int qtdeMotores;
    
    public VeiculoAereo(int anoFabricacao, String marca, String modelo, String propulsao,
                        String rab, int qtdeMotores) {
        super(anoFabricacao, marca, modelo, propulsao);
        this.rab = rab;
        this.qtdeMotores = qtdeMotores;
    }
    
    public String getRab() {
        return rab;
    }
    
    public void setRab(String rab) {
        this.rab = rab;
    }
    
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    
    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        double precoQuerosene = 9.99;
        return ((peso * qtdeMotores) * (altura * largura)) * (distancia * precoQuerosene);
    }
}
