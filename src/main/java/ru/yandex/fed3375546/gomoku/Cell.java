package ru.yandex.fed3375546.gomoku;
/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public class Cell {
	private final int rowIndex;
	private final int colIndex;

	public Cell(int rowIndex, int colIndex) {
		super();
		this.rowIndex = rowIndex;
		this.colIndex = colIndex;
	}

	public int getRowIndex() {
		return rowIndex;
	}

	public int getColIndex() {
		return colIndex;
	}

	@Override
	public String toString() {
		return rowIndex + ":" + colIndex;
	}
}
