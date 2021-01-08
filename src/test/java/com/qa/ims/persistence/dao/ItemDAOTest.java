package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {

	private final ItemDAO DAO = new ItemDAO();

	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "pass");
	}

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test
	public void testCreate() {
		final Item created = new Item(5L, "red dead", 50d);
		assertEquals(created, DAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "cyberpunk 2077", 65d));
		expected.add(new Item(2L, "cyberpunk 2076", 65d));
		expected.add(new Item(3L, "cyberpunk 2075", 65d));
		expected.add(new Item(4L, "cyberpunk 2074", 65d));
		assertEquals(expected, DAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Item(4L, "cyberpunk 2074", 65d), DAO.readLatest());
	}

	@Test
	public void testRead() {
		final long ID = 1L;
		assertEquals(new Item(ID, "cyberpunk 2077", 65d), DAO.readItem(ID));
	}

	@Test
	public void testUpdate() {
		final Item updated = new Item(1L, "cyberpunk 2085", 45d);
		assertEquals(updated, DAO.update(updated));

	}
//
//	@Test
//	public void testDelete() {
//		assertEquals(1, DAO.delete(1));
//	}
}
