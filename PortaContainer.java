public class PortaContainer extends VeiculoFluvial {
    private double capacidadeCargaTEU; // TEU = Twenty-foot Equivalent Unit
    private String categoria; // Feeders, Panamax, Ultra Large Container Vessels (ULCV), etc
    
    public PortaContainer(int anoFabricacao, String marca, String modelo, String propulsao,
                         String nroRegistroMarinha, double boca, double caladoAereo,
                         double capacidadeCargaTEU, String categoria) {
        super(anoFabricacao, marca, modelo, propulsao, nroRegistroMarinha, boca, caladoAereo);
        this.capacidadeCargaTEU = capacidadeCargaTEU;
        this.categoria = categoria;
    }
    
    public double getCapacidadeCargaTEU() {
        return capacidadeCargaTEU;
    }
    
    public void setCapacidadeCargaTEU(double capacidadeCargaTEU) {
        this.capacidadeCargaTEU = capacidadeCargaTEU;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        return (peso + (altura * largura)) * distancia;
    }
}
