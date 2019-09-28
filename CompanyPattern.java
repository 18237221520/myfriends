import company.*;
import product.*;
public class CompanyPattern {
    public static void main(String[] args){
         CompanyCE mCompanyCE= new CompanyCE();
         mCompanyCE.manu().Show();
         CompanyMAC mCompanyMAC= new CompanyMAC();
         mCompanyMAC.manu().Show();
         CompanyYSL mCompanyYSL= new CompanyYSL();
         mCompanyYSL.manu().Show();
     }
}