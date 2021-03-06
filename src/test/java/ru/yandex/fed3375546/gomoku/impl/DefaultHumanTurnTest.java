package ru.yandex.fed3375546.gomoku.impl;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import ru.yandex.fed3375546.gomoku.Cell;
import ru.yandex.fed3375546.gomoku.CellValue;
import ru.yandex.fed3375546.gomoku.GameTable;
import ru.yandex.fed3375546.gomoku.HumanTurn;

public class DefaultHumanTurnTest {
	@Rule
	public final ExpectedException thrown = ExpectedException.none();
	private HumanTurn humanTurn;

	@Before
	public void before() {
		humanTurn = new DefaultHumanTurn();
	}

	@Test
	public void testSetGameTableNotNull() {
		thrown.expect(NullPointerException.class);
		thrown.expectMessage(new IsEqual<String>("Game table can't be null"));
		humanTurn.setGameTable(null);
	}

	@Test
	public void testMakeTurn() {
		GameTable gameTable = mock(GameTable.class);
		humanTurn.setGameTable(gameTable);
		Cell cell = humanTurn.makeTurn(0, 1);
		assertEquals(0, cell.getRowIndex());
		assertEquals(1, cell.getColIndex());
		verify(gameTable).setValue(0, 1, CellValue.HUMAN);
	}
}