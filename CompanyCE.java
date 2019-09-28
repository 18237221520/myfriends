package company;
import product.*;
public class CompanyCE extends Company{
    public Product manu() {
        return new ProductCE();
    }
}

