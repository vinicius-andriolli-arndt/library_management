package br.com.beatrizcarmo.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import br.com.beatrizcarmo.models.Book;
import br.com.beatrizcarmo.models.User;

public class BookServiceImplTest {
	
	public BookServiceImpl service;
	
	//Exemplo
	@Test
	public void checkBookingPossibility_shouldBePossible() {
		BookServiceImpl service = new BookServiceImpl();
		User user = new User();
		user.setIsPunished(false);
		
		Book book = new Book();
		book.setIsBorrowed(false);
		
		boolean result = service.checkBookingPossibility(user, book);
		
		assertEquals(true, result);;
	}

}
