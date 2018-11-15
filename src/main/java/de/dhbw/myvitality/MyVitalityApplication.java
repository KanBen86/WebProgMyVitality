package de.dhbw.myvitality;

import de.dhbw.myvitality.entities.*;
import de.dhbw.myvitality.enums.ENUM_DEPARTMENT;
import de.dhbw.myvitality.enums.ENUM_ROLL;
import de.dhbw.myvitality.repositories.*;
import org.hibernate.Hibernate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Applicationsklasse mit Mainmethode
 * @author tamino.fischer
 *
 */
@SpringBootApplication
public class MyVitalityApplication extends SpringBootServletInitializer {

    private static final Logger log = LoggerFactory.getLogger(MyVitalityApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MyVitalityApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MyVitalityApplication.class);
    }

    /****
     * DEV
     * DB Load/Reload
     * @param empRepos
     * @return
     */
    @Bean
    public CommandLineRunner demoEmployee(EmployeeRepository empRepos) {
        return (args) -> {
            // save a couple of employees
            log.info("Erzeuge Employees und speichere sie");
            Employee e = new Employee("44444", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, "11111");
            e.setUsername("Max93");
            e.setPassword("123");
            empRepos.save(new Employee("11111", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, null));
            empRepos.save(new Employee("22222", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, "11111"));
            empRepos.save(new Employee("33333", ENUM_DEPARTMENT.CONTROLLING, ENUM_ROLL.ADMIN, "11111"));
            empRepos.save(e);
            // fetch all customers
            log.info("Employee found with findAll:");
            log.info("----------------------------");
            for (Employee employee : empRepos.findAll()) {
                log.info(employee.toString());
            }
            Optional<Employee> employee = empRepos.findById("mvu11111");
            log.info("----------------------------");
            log.info("Employee found with findById");
            log.info(employee.get().toString());
            log.info("----------------------------");
            log.info("Update the field superior of Employee mvu11111");
            employee.get().setSuperior("00000");
            empRepos.save(employee.get());
            log.info("----------------------------");
            log.info("Employee nach dem Update");
            log.info(empRepos.findById(employee.get().getEmployeeId()).toString());
            log.info("----------------------------------");
            log.info("finde mit Query Max93");
            log.info("----------------------------");
            Optional<Employee> empl = empRepos.findEmployeeByQuery("Max93");
            log.info(empl.toString());
            log.info("----------------------------");
        };
    }

    @Bean
    public CommandLineRunner demoCustomer(CustomerRepository customerRepository) {
        return (args) -> {
            //save a couple of customers
            log.info("Erzeuge Customer und speichere sie");
            log.info("----------------------------------");
            Customer c = new Customer("11111", null, null, null, null, "Banküberweisung");
            c.setUsername("StaplerfahrerKlaus");
            c.setPassword("123");
            c.setEmailAddress("klaus@staplerfahrer.de");
            customerRepository.save(c);
            log.info("Customer nach Id suchen");
            log.info("----------------------------------");
            Optional<Customer> customer = customerRepository.findById("11111");
            log.info(customer.get().toString());
            log.info("----------------------------------");
            log.info("StaplerfahrerKlaus suchen");
            log.info("----------------------------------");
            Optional<Customer> customer2 = customerRepository.findCustomerByQuery("StaplerfahrerKlaus");
            log.info(customer2.get().toString());
        };
    }

    //FitnessLevel testen
    @Bean
    public CommandLineRunner demoFitnessLevel(FitnessLevelRepository fitnessLevelRepository) {
        return (args) -> {
            //save a couple of customers
            log.info("Erzeuge FitnessLevel und speichere es");
            log.info("----------------------------------");
            FitnessLevel f = new FitnessLevel(null, null, null, null, "Banküberweisung", null, null,null,null,null,null,null,null,null);
            f.setWeight("100");
            f.setHeight("200");
            fitnessLevelRepository.save(f);
            log.info("FitnessLevel nach Id suchen");
            log.info("----------------------------------");
            Optional<FitnessLevel> fitnessLevel = fitnessLevelRepository.findById(f.getFitnessLevelId());
            log.info(fitnessLevel.get().toString());
            log.info("----------------------------------");
        };
    }

    @Bean
    public CommandLineRunner demoAdress(AdressRepository adressRepository) {
        return (args) -> {
            // DemoAdresse erzeugen und in der Datenbank speichern
            log.info("Erzeuge Adresse und spiechere sie");
            log.info("----------------------------------");
            adressRepository.save(new Adress("Musterstrasse", "2b", "00138", "Musterstadt", "MusterBayern", "Musterland"));
            // Adresse aus der Datenbank auslesen und ausgeben
            log.info("Adresse mit Query suchen");
            log.info("----------------------------------");
            Optional<Adress> adress = adressRepository.findAdressByQuery("Musterstrasse", "2b", "00138");
            log.info(adress.get().toString());
            log.info("----------------------------------");
        };
    }

    @Bean
    public CommandLineRunner demoBank(BankRepository bankRepository) {
        return (args) -> {
            //DemoBank erzeugen und in der Datenbank abspeichern
            log.info("Erzeuge Demobank");
            log.info("----------------------------------");
            bankRepository.save(new Bank("demoiban", "demobic", "demoInhaber", "demoInstutut"));
            //Demobamk aus der Datenbank auslesen und ausgeben
            log.info("Bank mit Query suchen");
            log.info("----------------------------------");
            Optional<Bank> bank = bankRepository.findBankByQuery("demoiban", "demobic");
            log.info(bank.get().toString());
            log.info("----------------------------------");
        };
    }

    @Bean
    public CommandLineRunner demoArtikel(ArticleRepository articleRepository,
                                         StorrageRepository storrageRepository) {
        return (args) -> {
            log.info("Erzeuge Demoartikel");
            log.info("----------------------------------");
            Storrage storrage = new Storrage();
            storrageRepository.save(storrage);
            articleRepository.save(new Article("Salz", "Nach dem Trainng nehmen", null, 1, 1,
                    null, null, storrage));
            storrage = new Storrage();
            storrageRepository.save(storrage);
            articleRepository.save(new Article("Protein", "Nach dem Trainng nehmen", null, 1, 1,
                    null, null, storrage));
            storrage = new Storrage();
            storrageRepository.save(storrage);
            articleRepository.save(new Article("Kreatin", "Nach dem Trainng nehmen", null, 1, 1,
                    null, null, storrage));
            storrage = new Storrage();
            storrageRepository.save(storrage);
            articleRepository.save(new Article("Fischöl", "Nach dem Trainng nehmen", null, 1, 1,
                    null, null, storrage));
            storrage = new Storrage();
            storrageRepository.save(storrage);
            articleRepository.save(new Article("Testo", "Nach dem Trainng nehmen", null, 1, 1,
                    null, null, storrage));
            log.info("Artikel mit Query suchen");
            log.info("----------------------------------");
            Optional<Article> article = articleRepository.findByQuery("Salz");
            log.info(article.get().toString());
            log.info("----------------------------------");
            article = articleRepository.findByQuery("Protein");
            log.info(article.get().toString());
            log.info("----------------------------------");
            article = articleRepository.findByQuery("Kreatin");
            log.info(article.get().toString());
            log.info("----------------------------------");
            article = articleRepository.findByQuery("Fischöl");
            log.info(article.get().toString());
            log.info("----------------------------------");
            article = articleRepository.findByQuery("Testo");
            log.info(article.get().toString());
            log.info("----------------------------------");
        };
    }

    @Bean
    public CommandLineRunner demoSuppConfig(SupplementConfigurationRepository supplementConfigurationRepository, ArticleRepository articleRepository) {
        return (args) -> {
            log.info("Erzeuge DemoSuppsConfig");
            log.info("----------------------------------");
            ArrayList<Article> list = new ArrayList<Article>();
            list.add(articleRepository.findByQuery("Salz").get());
            list.add(articleRepository.findByQuery("Protein").get());
            list.add(articleRepository.findByQuery("Kreatin").get());
            list.add(articleRepository.findByQuery("Fischöl").get());
            list.add(articleRepository.findByQuery("Testo").get());

            ArrayList<Double> quantityList = new ArrayList<>();
            quantityList.add(1.0);
            quantityList.add(2.0);
            quantityList.add(3.0);
            quantityList.add(4.0);
            quantityList.add(5.0);
            ArrayList<String> informationList = new ArrayList<>();
            informationList.add("Morgens nehmen");
            informationList.add("Mittags nehmen");
            informationList.add("Abends nehmen");
            informationList.add("Nachts nehmen");
            informationList.add("Nach dem Training nehmen");

            supplementConfigurationRepository.save(new SupplementConfiguration(list, quantityList, informationList,"11111"));
            log.info("Supplement Configuration mit Query suchen");
            log.info("----------------------------------");
            Optional<SupplementConfiguration> supplementConfiguration = supplementConfigurationRepository.findByQuery("11111");
            log.info(supplementConfiguration.get().toString());
            log.info("----------------------------------");
        };
    }

    @Bean
    public CommandLineRunner demoStorrage(ArticleRepository articleRepository,
                                          StorrageRepository storrageRepository) {
        return args -> {
            log.info("Auslesen der bestehenden Artikel aus der Datenbank");
            log.info("----------------------------------");
            log.info("Für jeden Artikel wir ein Storrage-Feld angelegt.");
            for (Article article : articleRepository.findAll()) {
                Hibernate.initialize(article.getStorrage());
                Storrage storrage = article.getStorrage();
                storrage.setLevel((byte)1);
                storrage.setRackcorridor('A');
                storrage.setRackSector('B');
                storrage.setAmount(100);
                log.info("Speichern des Storrage Eintrages: " + storrage.toString());
                storrageRepository.save(storrage);
                log.info(storrage.toString());
                article.setStorrage(storrage);
                log.info(article.getStorrage().toString());
                articleRepository.save(article);
            }
        };
    }

    @Bean
    public CommandLineRunner demoTrainingschedule(TrainingScheduleRepository trainingScheduleRepository, CustomerRepository customerRepository){
        return args -> {
            Optional<Customer> customer = customerRepository.findById("11111");
            log.info("Erstellen eines Trainingsplans");
            log.info("----------------------------------");
            TrainingSchedule trainingSchedule = new TrainingSchedule(1, "Demobezeichnung", 3, 20, 90, null, new Integer[]{1,2,3});
            trainingSchedule.setCustomer(customer.get());
            trainingScheduleRepository.save(trainingSchedule);
            log.info("Trainingsplan wurde erzeugt");
            for (TrainingSchedule trainingSchedule2 : trainingScheduleRepository.findAll()){
                log.info(trainingSchedule2.toString());
            }
        };
    }
}