package recipeFinder.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "recipe_info")
@EntityListeners(AuditingEntityListener.class)
public class RecipeModel implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "recipe_id")
	@NotNull
	private Long recipeId;
	
	@NotNull
	@Column(name = "title")
	private String title;
	
	@NotNull
	@Column(name = "time_to_make")
	private Long time;
	
	@Column(name = "difficulty")
	private Long difficulty;
	
	@Column(name = "ingredients")
	private String ingredients;
	
	@Column(name = "weight")
	private Long weight;
	
	@Column(name = "prep")
	private String prep;

	public Long getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(Long recipeId) {
		this.recipeId = recipeId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getTime() {
		return time;
	}

	public void setTime(Long time) {
		this.time = time;
	}

	public Long getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(Long difficulty) {
		this.difficulty = difficulty;
	}

	public String getIngredients() {
		return ingredients;
	}

	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}

	public Long getWeight() {
		return weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getPrep() {
		return prep;
	}

	public void setPrep(String prep) {
		this.prep = prep;
	}

	public RecipeModel() {
		
	}
	
	public RecipeModel(Long recipeId, String title, Long time, Long difficulty, String ingredients, Long weight,
			String prep) {
		this.recipeId = recipeId;
		this.title = title;
		this.time = time;
		this.difficulty = difficulty;
		this.ingredients = ingredients;
		this.weight = weight;
		this.prep = prep;
	}
	
	

}
