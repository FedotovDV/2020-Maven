package ru.uandex.fed3375546.gomoku;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ru.yandex.fed3375546.gomoku.CellValue;

public class CellValueTest {
	
	@Test
	public void testGetValue() {
		assertEquals("O", CellValue.COMPUTER.getValue());
		assertEquals("X", CellValue.HUMAN.getValue());
		assertEquals(" ", CellValue.EMPTY.getValue());
	}

}
