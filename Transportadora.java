import java.util.Scanner;

public class Transportadora {
    
    // Método que recebe a interface Transporte e calcula o frete
    public static double calcularFrete(Transporte transporte, double peso, double altura, 
                                       double largura, double distancia) {
        return transporte.calcularFrete(peso, altura, largura, distancia);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== CALCULADORA DE FRETE - TRANSPORTADORA ===\n");
        
        // Solicitar dados da encomenda
        System.out.print("Informe o peso (kg): ");
        double peso = sc.nextDouble();
        
        System.out.print("Informe a altura (cm): ");
        double altura = sc.nextDouble();
        
        System.out.print("Informe a largura (cm): ");
        double largura = sc.nextDouble();
        
        System.out.print("Informe a distância (km): ");
        double distancia = sc.nextDouble();
        
        // Criar instâncias de veículos
        Caminhao caminhao = new Caminhao(2023, "Volvo", "FH16", "Diesel",
                                         18, 2, "ABC1234", "CH123456",
                                         3, 5000, "Baú");
        
        Aviao aviao = new Aviao(2022, "Boeing", "737", "Querosene",
                               "RAB123456", 2,
                               25000, 70000);
        
        PortaContainer portaContainer = new PortaContainer(2021, "Maersk", "Container", "Diesel",
                                                          "MAR123456", 32.3, 32.9,
                                                          18000, "Panamax");
        
        // Calcular fretes
        double freteCaminhao = calcularFrete(caminhao, peso, altura, largura, distancia);
        double freteAviao = calcularFrete(aviao, peso, altura, largura, distancia);
        double freteContainer = calcularFrete(portaContainer, peso, altura, largura, distancia);
        
        // Exibir resultados
        System.out.println("\n=== RESULTADOS DO CÁLCULO ===\n");
        System.out.printf("Dados da Encomenda: %.2f kg | %.2f cm x %.2f cm | %.2f km\n\n",
                         peso, altura, largura, distancia);
        
        System.out.printf("Caminhão (Diesel):        R$ %.2f\n", freteCaminhao);
        System.out.printf("Avião (Querosene):        R$ %.2f\n", freteAviao);
        System.out.printf("Porta Container (Fluvial): R$ %.2f\n", freteContainer);
        
        // Opção mais econômica
        double menorFrete = Math.min(Math.min(freteCaminhao, freteAviao), freteContainer);
        System.out.println("\n--- OPÇÃO MAIS ECONÔMICA ---");
        
        if (menorFrete == freteCaminhao) {
            System.out.println("Caminhão: R$ " + String.format("%.2f", freteCaminhao));
        } else if (menorFrete == freteAviao) {
            System.out.println("Avião: R$ " + String.format("%.2f", freteAviao));
        } else {
            System.out.println("Porta Container: R$ " + String.format("%.2f", freteContainer));
        }
        
        sc.close();
    }
}
