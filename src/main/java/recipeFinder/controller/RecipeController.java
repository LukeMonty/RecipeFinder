package recipeFinder.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import recipeFinder.model.RecipeModel;
import recipeFinder.repository.RecipeRepository;
import recipeFinder.exception.*;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class RecipeController {
	
	@Autowired
	RecipeRepository repo;
	
	@GetMapping("/recipe")
	public List<RecipeModel> getAllRecipes() {
		return repo.getAllRecipes();
	}
	
	@GetMapping("/recipe")
	public List<RecipeModel> getRecipes(String ingredients) {
		return repo.getRecipes(ingredients).orElseThrow(() -> new ResourceNotFoundException("Ingredient", "id", ingredients));
	}
	
	
	

}
