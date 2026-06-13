public class Aviao extends VeiculoAereo {
    private double capacidadeCarga;
    private double pesoMaximoDecolagem; // MTOW
    
    public Aviao(int anoFabricacao, String marca, String modelo, String propulsao,
                String rab, int qtdeMotores,
                double capacidadeCarga, double pesoMaximoDecolagem) {
        super(anoFabricacao, marca, modelo, propulsao, rab, qtdeMotores);
        this.capacidadeCarga = capacidadeCarga;
        this.pesoMaximoDecolagem = pesoMaximoDecolagem;
    }
    
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public double getPesoMaximoDecolagem() {
        return pesoMaximoDecolagem;
    }
    
    public void setPesoMaximoDecolagem(double pesoMaximoDecolagem) {
        this.pesoMaximoDecolagem = pesoMaximoDecolagem;
    }
    
    @Override
    public double calcularFrete(double peso, double altura, double largura, double distancia) {
        double precoQuerosene = 9.99;
        return ((peso * getQtdeMotores()) * (altura * largura)) * (distancia * precoQuerosene);
    }
}
