package ar.com.eduducactionit.resources;

import ar.com.eduducactionit.dto.CategoryMeliDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/category-meli")
public class CategoryMeliResource {

    @Autowired
    private RestTemplate restTemplateClient;

    @Value("${spring.external.service-meli-category-url}")
    private String categoryPathUrlBase;


    @GetMapping(value="/{id}")
    public ResponseEntity<CategoryMeliDTO> getCategoryById(@PathVariable(name = "id", required = true) String id) {

        CategoryMeliDTO categoryDTO = restTemplateClient
                .getForObject(categoryPathUrlBase + id, CategoryMeliDTO.class);

        if (categoryDTO == null) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(categoryDTO);
    }

}
