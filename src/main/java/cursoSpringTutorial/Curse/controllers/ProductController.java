package cursoSpringTutorial.Curse.controllers;

import cursoSpringTutorial.Curse.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productService;


}
