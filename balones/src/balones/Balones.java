package balones;
public class Balones
{
        String color;
        String marca;
        String tamaño;
        String tipo;
        int precio;
        
        public Balones(String color)
        {
            this.color = color;
        }
        public Balones(String color, String marca)
        {
            this.color = color;
            this.marca = marca;
        }
        public Balones(String color, String marca, int precio)
        {
            this.color = color;
            this.marca = marca;
            this.precio = precio;
        }
        public Balones(String color, String marca, int precio, String tamaño)
        {
            this.color = color;
            this.marca = marca;
            this.precio = precio;
            this.tamaño = tamaño;
        }
        public Balones(String color, String marca, int precio, String tamaño, String tipo)
        {
            this.color = color;
            this.marca = marca;
            this.precio = precio;
            this.tamaño = tamaño;
            this.tipo = tipo;
        }
    public static void main(String[] args) {
        Balones b1 = new Balones("rojo");
        Balones b2 = new Balones("azul", "nike");
        Balones b3 = new Balones("negro", "adidas", 700);
        Balones b4 = new Balones("amarillo", "puma", 500, "mediano");
        Balones b5 = new Balones("blanco", "fila", 800, "chico", "profesional");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }

    @Override
    public String toString() {
        return "Balones{" + "color=" + color + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", tipo=" + tipo + ", precio=" + precio + '}';
    }
    
}
