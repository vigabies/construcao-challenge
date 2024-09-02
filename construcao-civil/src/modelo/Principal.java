package modelo;

import javax.swing.JOptionPane; // Importação necessária para a interface gráfica

public class Principal {
    public static void main(String[] args) {
        // Coletar dados do usuário -- o str é porque é string
        String baseStr = JOptionPane.showInputDialog("Informe a base da viga (em metros):");
        String alturaStr = JOptionPane.showInputDialog("Informe a altura da viga (em metros):");
        String comprimentoStr = JOptionPane.showInputDialog("Informe o comprimento da viga (em metros):");

        // Converter dados para tipo double
        double base = Double.parseDouble(baseStr);
        double altura = Double.parseDouble(alturaStr);
        double comprimento = Double.parseDouble(comprimentoStr);

        // Criar uma instância da viga
        Viga viga = new Viga(base, altura, comprimento);

        // Calcular o volume
        double volume = viga.calcularVolume();

        // Exibir o resultado
        JOptionPane.showMessageDialog(null, "O volume da viga é: " + volume + " metros cúbicos.");
    }
}
