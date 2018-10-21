package de.dhbw.myvitality.services;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.dhbw.myvitality.entities.Customer;
import de.dhbw.myvitality.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    public CustomerRepository customerRepository;

    @Autowired
    private CustomerService customerService;

    /*public void customerLogin(String un, String pw){

        String username = un;
        String password = pw;

        Customer customer = customerService.customerRepository.findCustomerByQuery(username).get();
        System.out.println(customer.toString());

        if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())){
            response.sendRedirect("/customerhome");
        }else{
            //Sind username und password nicht korrekt, gebe Meldung aus.
            request.setAttribute("error", "Falscher Nutzername oder Passwort");
            request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        }
    }*/
}
