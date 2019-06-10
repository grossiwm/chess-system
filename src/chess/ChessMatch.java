package chess;

import chess.pieces.King;
import chess.pieces.Rook;
import gameboard.Board;
import gameboard.Position;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}
	
	public ChessPiece[][] getPieces() {
		ChessPiece[][] matrix = new ChessPiece[board.getRows()][board.getColumns()];
		
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				matrix[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		
		return matrix;
	}
	
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	private void initialSetup() {
		placeNewPiece('B', 6, new Rook(board, Color.WHITE));
		placeNewPiece('E', 7, new King(board, Color.BLACK));
		
	}

}
