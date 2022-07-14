package Tacos.data;


import java.util.Optional;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.CrudRepository;
import Tacos.Ingredient;

/*
public interface IngredientRepository 
{
	
	Iterable<Ingredient> findAll();
	
	Optional<Ingredient> findById(String id);
	
	Ingredient save(Ingredient ingredient);

}

public interface IngredientRepository
extends Repository<Ingredient, String> {

Iterable<Ingredient> findAll();

Optional<Ingredient> findById(String id);

Ingredient save(Ingredient ingredient);

}
*/
public interface IngredientRepository
extends CrudRepository<Ingredient, String> {
}