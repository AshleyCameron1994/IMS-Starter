package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;



@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {
	
	
	@Mock
	private Utils utils;
	
	@Mock
	private ItemDAO itemDAO;
	
	@InjectMocks
	private ItemController item;
	
	@Test
	public void testCreate() {
		final long i_id = 1L;
		final String i_name = "Red dead redemtion";
		final double i_price = 49.99d;
		
		final Item created = new Item(i_id, i_name, i_price);
		
		Mockito.when(utils.getString()).thenReturn(i_name);
		Mockito.when(utils.getDouble()).thenReturn(i_price);
		Mockito.when(itemDAO.create(new Item(i_name, i_price))).thenReturn(created);
		assertEquals(created, item.create());
		
		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(itemDAO, Mockito.times(1)).create(new Item(i_name, i_price));
	}

	
	@Test
	public void testReadAll() {
		
		List<Item> items = new ArrayList<>();
		
		items.add(new Item(1L,"FIFA 21", 45.99));
		
		Mockito.when(itemDAO.readAll()).thenReturn(items);
		
		assertEquals(items, item.readAll());
		
		Mockito.verify(itemDAO, Mockito.times(1)).readAll();
	}
	@Test
	public void testUpdate() {
		final String itemName = "mohito";
		final double itemPrice = 9.99;
		final long ID = 2l;
		final Item updated = new Item(ID, itemName, itemPrice);
		
		Mockito.when(this.utils.getLong()).thenReturn(2L);
		Mockito.when(this.utils.getString()).thenReturn(itemName);
		Mockito.when(this.utils.getDouble()).thenReturn(itemPrice);
		Mockito.when(this.itemDAO.update(updated)).thenReturn(updated);

		assertEquals(updated, this.item.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(itemDAO, Mockito.times(1)).update(updated);
	}
	
	@Test
	public void testDelete() {
		final long id = 1L;
		
		Mockito.when(utils.getLong()).thenReturn(id);
		Mockito.when(itemDAO.delete(id)).thenReturn(1);
		
		assertEquals(1l, this.item.delete());
		
		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(itemDAO, Mockito.times(1)).delete(id);
	}

}