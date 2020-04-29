package ru.yandex.fed3375546.gomoku;

/**
 * 
 * @author devstudy
 * @see http://devstudy.net
 */
public interface ComputerTurn {
	
	void setGameTable(GameTable gameTable);

	Cell makeTurn();
	
	Cell makeFirstTurn();
}