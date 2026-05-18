package Test;

import Dao.ProductoDaoImpl;
import Interface.IProducto;
import Model.Productos;
import java.util.List;

public class TestProducto {

    public static IProducto dao = new ProductoDaoImpl();

    public static void main(String[] args) {
        TestProducto test = new TestProducto();
        //test.insertar();      
test.listar();

    }

    public static void listar() {
        List<Productos> lista = dao.lista(); 

        if (lista != null && !lista.isEmpty()) {
            System.out.println("ID\t|Nombre\t|Precio\t|Stock");
            for (Productos p : lista) {
                System.out.println(p.getId_producto()+"\t|"+p.getNombre()+"\t|"+p.getPrecio()+"\t|"+p.getStock());
            }
        } else {
            System.out.println("No hay productos registrados");
        }
    }
    
    public static void insertar(){
        Productos p = new Productos();
        p.setNombre("Teclado mecanico");
        p.setDescripcion("Retroiluminado");
        p.setPrecio(56.99);
        p.setStock(20);
        p.setImagen("/resouces/img/teclado.jpg");
        
        boolean result = dao.insert(p);
        if (result) {
            System.out.println("Producto insertado");
        } else {
            System.out.println("Error");
        }
    }
}
