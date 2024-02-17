package com.productservice.productservice;

import com.productservice.productservice.models.Category;
import com.productservice.productservice.models.Price;
import com.productservice.productservice.models.Product;
import com.productservice.productservice.repositories.CategoryRepository;
import com.productservice.productservice.repositories.PriceRepository;
import com.productservice.productservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
@EnableDiscoveryClient
public class ProductServiceApplication {

//    private final CategoryRepository categoryRepository;
//    private final ProductRepository productRepository;
//    private final PriceRepository priceRepository;
////
//    public ProductServiceApplication(CategoryRepository categoryRepository,
//                                     ProductRepository productRepository,
//                                     PriceRepository priceRepository) {
//        this.categoryRepository = categoryRepository;
//        this.productRepository = productRepository;
//        this.priceRepository = priceRepository;
//    }
//    private MentorRepository mentorRepository;
//    private UserRepository userRepository;
//    private StudentRepository studentRepository;
//
//    ProductServiceApplication(@Qualifier("st_mentorrepo") MentorRepository mentorRepository,
//                              @Qualifier("st_userrepo") UserRepository userRepository,
//                              @Qualifier("st_studentrepo") StudentRepository studentRepository) {
//        this.mentorRepository = mentorRepository;
//        this.userRepository = userRepository;
//        this.studentRepository = studentRepository;
//    }


//    private final MentorRepository mentorRepository;
//    private final StudentRepository studentRepository;
//
//    private final UserRepository userRepository;
//
//    ProductServiceApplication(@Qualifier("tpc_mentorrepository") MentorRepository mentorRepository,
//                              StudentRepository studentRepository,
//                              UserRepository userRepository) {
//        this.mentorRepository = mentorRepository;
//        this.studentRepository = studentRepository;
//        this.userRepository = userRepository;
//    }

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Category category = new Category();
//        category.setName("Apple Devices");
//
//        Category savedCategory = categoryRepository.save(category);
//

//        Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("f41ebf01-5cc5-4f4c-a8aa-6dcd149e481d"));
//        if (optionalCategory.isEmpty()) {
//            throw new Exception("Category was null");
//        }

        //Category category1 = optionalCategory.get();
//        Product product = new Product();
//        product.setTitle("iPhone 15 pro");
//        product.setDescription("Best iPhone ever");
//        product.setCategory(savedCategory);
//
//        Product savedProduct = productRepository.save(product);


        //Find all the products with category = Apple Devices.
//        List<Product> products = category.getProducts();
//        for (Product product : products) {
//            System.out.println(product.getTitle());
//        }

//        Price price = new Price();
//        price.setCurrency("INR");
//        price.setValue(100000);
//        //Price savedPrice = priceRepository.save(price);
//
//        Category category2 = new Category();
//        category2.setName("Apple Devices");
//        Category savedCategoy = categoryRepository.save(category2);
//
//        Product product1 = new Product();
//        product1.setTitle("iPhone 15 pro");
//        product1.setDescription("Best iPhone ever");
//        product1.setCategory(savedCategoy);
//        product1.setPrice(price);
//
//        Product savedProduct1 = productRepository.save(product);
    }

//    @Override
//    //@Transactional
//    public void run(String... args) throws Exception {
//        Mentor mentor = new Mentor();
//        mentor.setName("Deepak");
//        mentor.setEmail("deepak.kasera@scaler.com");
//        mentor.setAvgRating(4.8);
//
//        mentorRepository.save(mentor);


        //tpc_mentor
//        Mentor mentor = new Mentor();
//        mentor.setName("Deepak");
//        mentor.setEmail("deepak.kasera@scaler.com");
//        mentor.setAvgRating(4.7);
//        mentorRepository.save(mentor);
//
//
//        Student student = new Student();
//        student.setEmail("abhishek@scaler.com");
//        student.setName("Abhishek");
//        student.setPsp(90.0);
//        studentRepository.save(student);
//
//        User user = new User();
//        user.setEmail("arshi@gmail.com");
//        user.setName("Arshi");
//        userRepository.save(user);
//
//        //Get all the Users.
//        List<User> users = userRepository.findAll();
//
//        for (User user1 : users) {
//            System.out.println(user1.toString());
//        }


//        User user = new User();
//        user.setName("Arshi");
//        user.setEmail("arshi@gmail.com");
//        userRepository.save(user);
//
//        Mentor mentor = new Mentor();
//        mentor.setName("Deepak");
//        mentor.setEmail("deepak.kasera@scaler.com");
//        mentor.setAvgRating(4.7);
//        mentorRepository.save(mentor);
//
//        Student student = new Student();
//        student.setName("harsh");
//        student.setEmail("harsh@gmail.com");
//        student.setPsp(99.0);
//        studentRepository.save(student);

//        Category category = new Category();
//        category.setName("Apple Devices");
//
//        Category savedCategory = categoryRepository.save(category);


//        Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("f41ebf01-5cc5-4f4c-a8aa-6dcd149e481d"));
//        if (optionalCategory.isEmpty()) {
//            throw new Exception("Category was null");
//        }
//
//        Category category = optionalCategory.get();
//        Product product = new Product();
//        product.setTitle("iPhone 15 pro");
//        product.setDescription("Best iPhone ever");
//        product.setCategory(category.get());
//
//        Product savedProduct = productRepository.save(product);


        //Find all the products with category = Apple Devices.
//        List<Product> products = category.getProducts();
//        for (Product product : products) {
//            System.out.println(product.getTitle());
//        }

//        Price price = new Price();
//        price.setCurrency("INR");
//        price.setValue(100000);
//        //Price savedPrice = priceRepository.save(price);
//
//        Category category = new Category();
//        category.setName("Apple Devices");
//        Category savedCategoy = categoryRepository.save(category);
//
//        Product product = new Product();
//        product.setTitle("iPhone 15 pro");
//        product.setDescription("Best iPhone ever");
//        product.setCategory(savedCategoy);
//        product.setPrice(price);
//
//        Product savedProduct = productRepository.save(product);

        //productRepository.deleteById(UUID.fromString("4f4f6d2d-111d-4a98-8fb1-14ac807db354"));

//        Category category = new Category();
//        category.setName("Apple Device");
//        Category savedCategory = categoryRepository.save(category);
//
//        Price price = new Price();
//        price.setValue(100000);
//        price.setCurrency("INR");
//
//        Product product1 = new Product();
//        product1.setPrice(price);
//        product1.setTitle("iPhone 15 pro max");
//        product1.setDescription("Best iPhone ever.");
//        product1.setImage("IMG");
//        product1.setCategory(category);
//        Product savedProduct = productRepository.save(product1);
//
//
//        Price price1 = new Price();
//        price1.setValue(100000);
//        price1.setCurrency("INR");
//
//
//        Product product2 = new Product();
//        product2.setPrice(price1);
//        product2.setTitle("iPhone 15 pro max");
//        product2.setDescription("Best iPhone ever.");
//        product2.setImage("IMG");
//        product2.setCategory(category);
//        Product savedProduct1 = productRepository.save(product2);
//
//        Price price2 = new Price();
//        price2.setValue(100000);
//        price2.setCurrency("INR");
//
//
//        Product product3 = new Product();
//        product3.setPrice(price2);
//        product3.setTitle("iPhone 15 pro max");
//        product3.setDescription("Best iPhone ever.");
//        product3.setImage("IMG");
//        product3.setCategory(category);
//        Product savedProduct2 = productRepository.save(product3);

//        Optional<Category> optionalCategory = categoryRepository.findById(UUID.fromString("be0bd1ad-abe4-477e-a66e-faff0f2fa03f"));
//
//        Category category = optionalCategory.get();

//        List<Product> products = category.getProducts();
//
//        for (Product product : products) {
//            System.out.println(product.getTitle());
//        }

        //select * from products
        //List<Product> products = productRepository.findAllByTitleAndDescription("iPhone 15 pro max", "Best iPhone ever.");

        //List<Product> products = productRepository.findAllByPrice_ValueLessThan(50000);

//        Category category = new Category();
//        category.setName("Samsung");
//        Category category1 = categoryRepository.save(category);
//
//        Price price = new Price();
//        price.setValue(49000);
//        price.setCurrency("INR");
//
//        Product product = new Product("Samsung Fold 5", "Samsung's Foldable phone", "XYZ",
//                category1, price);
//
//        productRepository.save(product);

        //List<Product> products1 = productRepository.findAllByPrice_ValueBetween(29000, 50000);
//}
