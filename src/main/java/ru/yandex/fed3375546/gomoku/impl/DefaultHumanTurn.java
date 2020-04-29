package ru.yandex.fed3375546.gomoku.impl;
import java.util.Objects;

import ru.yandex.fed3375546.gomoku.Cell;
import ru.yandex.fed3375546.gomoku.CellValue;
import ru.yandex.fed3375546.gomoku.GameTable;
import ru.yandex.fed3375546.gomoku.HumanTurn;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class DefaultHumanTurn implements HumanTurn{
	private GameTable gameTable;
	
	@Override
	public void setGameTable(GameTable gameTable) {
		Objects.requireNonNull(gameTable, "Game table can't be null");
		this.gameTable = gameTable;
	}

	@Override
	public Cell makeTurn(int row, int col) {
		gameTable.setValue(row, col, CellValue.HUMAN);
		return new Cell(row, col);
	}
}
