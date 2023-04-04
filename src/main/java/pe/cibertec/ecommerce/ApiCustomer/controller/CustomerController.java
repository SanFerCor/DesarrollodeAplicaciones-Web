
package pe.cibertec.ecommerce.ApiCustomer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiCustomer.entity.Customer;
import pe.cibertec.ecommerce.ApiCustomer.service.CustomerService;

@RestController
@RequestMapping ("/api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    
    @GetMapping ("/findAll")
    public List<Customer> findAll (){
        return customerService.findAll();
        
    }
    @GetMapping("/finddById/{id}")
    public Customer findById(@PathVariable long id){
        return customerService.findById(id);
        
      }  
    }
    

