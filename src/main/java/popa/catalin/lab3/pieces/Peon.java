package popa.catalin.lab3.pieces;

import popa.catalin.lab3.Position;
import popa.catalin.lab3.command.MoveForward;
import popa.catalin.lab3.command.MovementCommand;

public class Peon extends ChessPiece {
    public Peon(int vertPos, int horizPos, boolean isAlive, ChessPieceColor color) {
        super(new Position(vertPos, horizPos), isAlive, color);
    }
}
