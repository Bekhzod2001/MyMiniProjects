package org.example.bekhzod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.bekhzod")
public class SpringConfig {
    @Bean
    public FinancialDepartment financialDepartment(){
        return new FinancialDepartment();
    }

    @Bean
    public SalesDepartment salesDepartment(){
        return new SalesDepartment();
    }

    @Bean
    public TransportDepartment transportDepartment(){
        return new TransportDepartment();
    }

    @Bean(name = "list")
    public ListOfDepartments listOfDepartments(){
        return new ListOfDepartments(financialDepartment(),
                salesDepartment(), transportDepartment());
    }
}
