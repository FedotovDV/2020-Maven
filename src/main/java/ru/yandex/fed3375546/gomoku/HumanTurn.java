package ru.yandex.fed3375546.gomoku;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public interface HumanTurn {
	
	void setGameTable(GameTable gameTable);

	Cell makeTurn(int row, int col);
}