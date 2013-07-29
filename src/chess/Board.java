package chess;

import java.util.ArrayList;
import static util.StringUtil.NEWLINE;
import chess.Row;
import pieces.Pieces;

public class Board {
	public static final int COLUMN_SIZE = 8;
	public static final int ROW_SIZE = 8;
	ArrayList<ArrayList<Pieces>> Board = new ArrayList<ArrayList<Pieces>>();

	public Board() {
	}

	public void initialize() {
		Board.add(Row.CreateBlackMain());
		Board.add(Row.CreateBlackPawns());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateBlankRow());
		Board.add(Row.CreateWhitePawns());
		Board.add(Row.CreateWhiteMain());
	}

	public String print() {
		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < ROW_SIZE; i++) {
			sb1.append(Row.getSymbols(Board.get(i)));
			sb1.append(NEWLINE);
		}

		return sb1.toString();
	}

}