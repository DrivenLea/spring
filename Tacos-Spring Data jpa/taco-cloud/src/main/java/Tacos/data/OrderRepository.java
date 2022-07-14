package Tacos.data;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import Tacos.TacoOrder;

/*
public interface OrderRepository 
{
	
	
	TacoOrder save(TacoOrder order);
	Optional<TacoOrder> findById(Long id);

}
*/
public interface OrderRepository
extends CrudRepository<TacoOrder, Long> {

}
