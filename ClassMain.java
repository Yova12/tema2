import javax.swing.JOptionPane;

public class ClassMain {
    public static double precio;
    public static void main(String[] args) {
        precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor"));
        JOptionPane.showMessageDialog(null, "valor: " + precio + 
        "\n valor con iva" + calcularIva(precio));
    }
    public static double calcularIva(double precio){
        double iva = precio * 0.19;
        double precioIva = precio + iva;
        return precioIva;
    }
    
}
