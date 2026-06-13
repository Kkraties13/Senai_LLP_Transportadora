public class VeiculoTerreste extends Veiculo {
    private int qtdeRodas;
    private int qtdePortas;
    private String placa;
    private String chassi;
    
    public VeiculoTerreste(int anoFabricacao, String marca, String modelo, String propulsao,
                          int qtdeRodas, int qtdePortas, String placa, String chassi) {
        super(anoFabricacao, marca, modelo, propulsao);
        this.qtdeRodas = qtdeRodas;
        this.qtdePortas = qtdePortas;
        this.placa = placa;
        this.chassi = chassi;
    }
    
    public int getQtdeRodas() {
        return qtdeRodas;
    }
    
    public void setQtdeRodas(int qtdeRodas) {
        this.qtdeRodas = qtdeRodas;
    }
    
    public int getQtdePortas() {
        return qtdePortas;
    }
    
    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }
    
    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public String getChassi() {
        return chassi;
    }
    
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    
    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        double precoDiesel = 6.99;
        return (peso + (altura * largura)) * (distancia * precoDiesel);
    }
}
