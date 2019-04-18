package popa.catalin.lab3.command;

import popa.catalin.lab3.pieces.ChessPiece;

public interface MovementCommand {

    void executeCommand(ChessPiece piece);
}
