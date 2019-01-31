package recipeFinder.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import recipeFinder.model.RecipeModel;

@Repository
public interface RecipeRepository {
	
	public List<RecipeModel> getAllRecipes();
	public List<RecipeModel> getRecipes(String ingredients);

}
