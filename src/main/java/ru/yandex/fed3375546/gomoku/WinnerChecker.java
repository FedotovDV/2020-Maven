package ru.yandex.fed3375546.gomoku;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public interface WinnerChecker {
	
	void setGameTable(GameTable gameTable);

	WinnerResult isWinnerFound(CellValue cellValue);
}
