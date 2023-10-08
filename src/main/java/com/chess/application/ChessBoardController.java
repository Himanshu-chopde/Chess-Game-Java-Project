package com.chess.application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;

public class ChessBoardController implements Initializable {
	private boolean playerFlag;
	private Pane previousSelectedPane;
	private Color previousPaneColor;
	private ImageView imageView;
	private Pane[][] paneArray;
	private boolean[][] isValidPane;
	private ImageView[] blackPieces;
	private ImageView[] whitePieces;

	@FXML
	private Pane b01, b03, b05, b07, b10, b12, b14, b16, b21, b23, b25, b27, b30, b32, b34, b36, b41, b43, b45, b47,
			b50, b52, b54, b56, b61, b63, b65, b67, b70, b72, b74, b76;

	@FXML
	private ImageView blackCrown, blackKing, blackBishop1, blackBishop2, blackKnight1, blackKnight2, blackPawn1,
			blackPawn2, blackPawn3, blackPawn4, blackPawn5, blackPawn6, blackPawn7, blackPawn8, blackRook1, blackRook2;

	@FXML
	private ImageView whiteCrown, whiteKing, whiteBishop1, whiteBishop2, whiteKnight1, whiteKnight2, whitePawn1,
			whitePawn2, whitePawn3, whitePawn4, whitePawn5, whitePawn6, whitePawn7, whitePawn8, whiteRook1, whiteRook2;

	@FXML
	private Pane w00, w02, w04, w06, w11, w13, w15, w17, w20, w22, w24, w26, w31, w33, w35, w37, w40, w42, w44, w46,
			w51, w53, w55, w57, w60, w62, w64, w66, w71, w73, w75, w77;
	@FXML
	private TilePane blackOutTilePane, whiteOutTilePane;

	@FXML
	void replayAction(ActionEvent event) {
		resetGame();
	}

	@FXML
	void blackBishop1Click(MouseEvent event) {
		if (isRemovablePiece(blackBishop1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackBishop1.getParent());
		} else {
			changePaneColor(blackBishop1);
		}
	}

	@FXML
	void blackBishop2Click(MouseEvent event) {
		if (isRemovablePiece(blackBishop2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackBishop2.getParent());
		} else {
			changePaneColor(blackBishop2);
		}
	}

	@FXML
	void blackCrownClick(MouseEvent event) {
		if (isRemovablePiece(blackCrown)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackCrown.getParent());
		} else {
			changePaneColor(blackCrown);
		}
	}

	@FXML
	void blackKingClick(MouseEvent event) {
		if (isRemovablePiece(blackKing)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackKing.getParent());
		} else {
			changePaneColor(blackKing);
		}
	}

	@FXML
	void blackKnight1Click(MouseEvent event) {
		if (isRemovablePiece(blackKnight1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackKnight1.getParent());
		} else {
			changePaneColor(blackKnight1);
		}
	}

	@FXML
	void blackKnight2Click(MouseEvent event) {
		if (isRemovablePiece(blackKnight2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackKnight2.getParent());
		} else {
			changePaneColor(blackKnight2);
		}
	}

	@FXML
	void blackPawn1Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn1.getParent());
		} else {
			changePaneColor(blackPawn1);
		}
	}

	@FXML
	void blackPawn2Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn2.getParent());
		} else {
			changePaneColor(blackPawn2);
		}
	}

	@FXML
	void blackPawn3Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn3)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn3.getParent());
		} else {
			changePaneColor(blackPawn3);
		}
	}

	@FXML
	void blackPawn4Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn4)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn4.getParent());
		} else {
			changePaneColor(blackPawn4);
		}
	}

	@FXML
	void blackPawn5Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn5)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn5.getParent());
		} else {
			changePaneColor(blackPawn5);
		}
	}

	@FXML
	void blackPawn6Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn6)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn6.getParent());
		} else {
			changePaneColor(blackPawn6);
		}
	}

	@FXML
	void blackPawn7Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn7)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn7.getParent());
		} else {
			changePaneColor(blackPawn7);
		}
	}

	@FXML
	void blackPawn8Click(MouseEvent event) {
		if (isRemovablePiece(blackPawn8)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackPawn8.getParent());
		} else {
			changePaneColor(blackPawn8);
		}
	}

	@FXML
	void blackRook1Click(MouseEvent event) {
		if (isRemovablePiece(blackRook1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackRook1.getParent());
		} else {
			changePaneColor(blackRook1);
		}
	}

	@FXML
	void blackRook2Click(MouseEvent event) {
		if (isRemovablePiece(blackRook2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) blackRook2.getParent());
		} else {
			changePaneColor(blackRook2);
		}
	}

	@FXML
	void whiteBishop1Click(MouseEvent event) {
		if (isRemovablePiece(whiteBishop1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteBishop1.getParent());
		} else {
			changePaneColor(whiteBishop1);
		}
	}

	@FXML
	void whiteBishop2Click(MouseEvent event) {
		if (isRemovablePiece(whiteBishop2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteBishop2.getParent());
		} else {
			changePaneColor(whiteBishop2);
		}
	}

	@FXML
	void whiteCrownClick(MouseEvent event) {
		if (isRemovablePiece(whiteCrown)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteCrown.getParent());
		} else {
			changePaneColor(whiteCrown);
		}
	}

	@FXML
	void whiteKingClick(MouseEvent event) {
		if (isRemovablePiece(whiteKing)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteKing.getParent());
		} else {
			changePaneColor(whiteKing);
		}
	}

	@FXML
	void whiteKnight1Click(MouseEvent event) {
		if (isRemovablePiece(whiteKnight1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteKnight1.getParent());
		} else {
			changePaneColor(whiteKnight1);
		}
	}

	@FXML
	void whiteKnight2Click(MouseEvent event) {
		if (isRemovablePiece(whiteKnight2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteKnight2.getParent());
		} else {
			changePaneColor(whiteKnight2);
		}
	}

	@FXML
	void whitePawn1Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn1.getParent());
		} else {
			changePaneColor(whitePawn1);
		}
	}

	@FXML
	void whitePawn2Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn2.getParent());
		} else {
			changePaneColor(whitePawn2);
		}
	}

	@FXML
	void whitePawn3Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn3)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn3.getParent());
		} else {
			changePaneColor(whitePawn3);
		}
	}

	@FXML
	void whitePawn4Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn4)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn4.getParent());
		} else {
			changePaneColor(whitePawn4);
		}
	}

	@FXML
	void whitePawn5Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn5)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn5.getParent());
		} else {
			changePaneColor(whitePawn5);
		}
	}

	@FXML
	void whitePawn6Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn6)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn6.getParent());
		} else {
			changePaneColor(whitePawn6);
		}
	}

	@FXML
	void whitePawn7Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn7)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn7.getParent());
		} else {
			changePaneColor(whitePawn7);
		}
	}

	@FXML
	void whitePawn8Click(MouseEvent event) {
		if (isRemovablePiece(whitePawn8)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whitePawn8.getParent());
		} else {
			changePaneColor(whitePawn8);
		}
	}

	@FXML
	void whiteRook1Click(MouseEvent event) {
		if (isRemovablePiece(whiteRook1)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteRook1.getParent());
		} else {
			changePaneColor(whiteRook1);
		}
	}

	@FXML
	void whiteRook2Click(MouseEvent event) {
		if (isRemovablePiece(whiteRook2)) {
			if (imageView != null) {
				resetIsValidPane();
				pieceValidation(imageView);
			}
			changePiecePosition((Pane) whiteRook2.getParent());
		} else {
			changePaneColor(whiteRook2);
		}
	}

	@FXML
	void b01Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b01);
	}

	@FXML
	void b03Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b03);
	}

	@FXML
	void b05Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b05);
	}

	@FXML
	void b07Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b07);
	}

	@FXML
	void b10Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b10);
	}

	@FXML
	void b12Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b12);
	}

	@FXML
	void b14Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b14);
	}

	@FXML
	void b16Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b16);
	}

	@FXML
	void b21Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b21);
	}

	@FXML
	void b23Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b23);
	}

	@FXML
	void b25Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b25);
	}

	@FXML
	void b27Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b27);
	}

	@FXML
	void b30Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b30);
	}

	@FXML
	void b32Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b32);
	}

	@FXML
	void b34Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b34);
	}

	@FXML
	void b36Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b36);
	}

	@FXML
	void b41Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b41);
	}

	@FXML
	void b43Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b43);
	}

	@FXML
	void b45Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b45);
	}

	@FXML
	void b47Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b47);
	}

	@FXML
	void b50Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b50);
	}

	@FXML
	void b52Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b52);
	}

	@FXML
	void b54Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b54);
	}

	@FXML
	void b56Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b56);
	}

	@FXML
	void b61Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b61);
	}

	@FXML
	void b63Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b63);
	}

	@FXML
	void b65Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b65);
	}

	@FXML
	void b67Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b67);
	}

	@FXML
	void b70Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b70);
	}

	@FXML
	void b72Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b72);
	}

	@FXML
	void b74Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b74);
	}

	@FXML
	void b76Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(b76);
	}

	@FXML
	void w00Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w00);
	}

	@FXML
	void w02Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w02);
	}

	@FXML
	void w04Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w04);
	}

	@FXML
	void w06Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w06);
	}

	@FXML
	void w11Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w11);
	}

	@FXML
	void w13Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w13);
	}

	@FXML
	void w15Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w15);
	}

	@FXML
	void w17Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w17);
	}

	@FXML
	void w20Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w20);
	}

	@FXML
	void w22Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w22);
	}

	@FXML
	void w24Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w24);
	}

	@FXML
	void w26Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w26);
	}

	@FXML
	void w31Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w31);
	}

	@FXML
	void w33Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w33);
	}

	@FXML
	void w35Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w35);
	}

	@FXML
	void w37Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w37);
	}

	@FXML
	void w40Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w40);
	}

	@FXML
	void w42Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w42);
	}

	@FXML
	void w44Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w44);
	}

	@FXML
	void w46Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w46);
	}

	@FXML
	void w51Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w51);
	}

	@FXML
	void w53Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w53);
	}

	@FXML
	void w55Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w55);
	}

	@FXML
	void w57Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w57);
	}

	@FXML
	void w60Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w60);
	}

	@FXML
	void w62Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w62);
	}

	@FXML
	void w64Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w64);
	}

	@FXML
	void w66Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w66);
	}

	@FXML
	void w71Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w71);
	}

	@FXML
	void w73Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w73);
	}

	@FXML
	void w75Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w75);
	}

	@FXML
	void w77Click(MouseEvent event) {
		if (imageView != null) {
			resetIsValidPane();
			pieceValidation(imageView);
		}
		changePiecePosition(w77);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		insertPaneIntoArray();
		insertBlackPiecesIntoArray();
		insertWhitePiecesIntoArray();
		
		playerFlag = true;
	}

	private void changePaneColor(ImageView imageView) {
		this.imageView = imageView;
		Pane pane = ((Pane) imageView.getParent());
		if (previousSelectedPane != null || previousSelectedPane == pane) {
			previousSelectedPane.setBackground(new Background(new BackgroundFill(previousPaneColor, null, null)));
		}
		previousPaneColor = (Color) pane.getBackground().getFills().get(0).getFill();
		pane.setBackground(new Background(new BackgroundFill(Color.valueOf("#AAAFFF"), null, null)));
		previousSelectedPane = pane;

	}

	private void changePiecePosition(Pane pane) {
		if (imageView != null) {
			int[] arr = getIndexOfPane(pane);
			if (isValidPane[arr[0]][arr[1]]) {
				if (!pane.getChildren().isEmpty()) {

					if (getIndexOfPiece(blackPieces, (ImageView) pane.getChildren().get(0)) >= 0) {

						blackOutTilePane.getChildren().add((ImageView) pane.getChildren().get(0));

					} else if (getIndexOfPiece(whitePieces, (ImageView) pane.getChildren().get(0)) >= 0) {

						whiteOutTilePane.getChildren().add((ImageView) pane.getChildren().get(0));

					}
				}
				pane.getChildren().add(imageView);
				changePaneColor(imageView);
				Pane p = (Pane) imageView.getParent();
				p.setBackground(new Background(new BackgroundFill(previousPaneColor, null, null)));
				imageView = null;
				resetIsValidPane();
				playerFlag = !playerFlag;
				
				for(int i = 0; i < blackOutTilePane.getChildren().size(); i++) {
					if(getIndexOfPiece(blackPieces, (ImageView) blackOutTilePane.getChildren().get(i)) == 7) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Game Finished");
						alert.setHeaderText("Congratulations!");
						alert.setContentText("Player 2 Won.");
						alert.showAndWait();
						resetGame();
						playerFlag = true;
					}
				}
				
				for(int i = 0; i < whiteOutTilePane.getChildren().size(); i++) {
					if(getIndexOfPiece(whitePieces, (ImageView) whiteOutTilePane.getChildren().get(i)) == 7) {
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Game Finished");
						alert.setHeaderText("Congratulations!");
						alert.setContentText("Player 1 Won.");
						alert.showAndWait();
						resetGame();
						playerFlag = true;
					}
				}
			}
		}
	}

	private boolean isRemovablePiece(ImageView piece) {
		Pane pane = (Pane) piece.getParent();
		if (((Color) pane.getBackground().getFills().get(0).getFill()).equals(Color.valueOf("#CCFFCC"))) {
			return true;
		}
		return false;
	}

	private void insertPaneIntoArray() {
		paneArray = new Pane[8][8];
		isValidPane = new boolean[8][8];

		paneArray[0][0] = w00;
		paneArray[0][1] = b01;
		paneArray[0][2] = w02;
		paneArray[0][3] = b03;
		paneArray[0][4] = w04;
		paneArray[0][5] = b05;
		paneArray[0][6] = w06;
		paneArray[0][7] = b07;

		paneArray[1][0] = b10;
		paneArray[1][1] = w11;
		paneArray[1][2] = b12;
		paneArray[1][3] = w13;
		paneArray[1][4] = b14;
		paneArray[1][5] = w15;
		paneArray[1][6] = b16;
		paneArray[1][7] = w17;

		paneArray[2][0] = w20;
		paneArray[2][1] = b21;
		paneArray[2][2] = w22;
		paneArray[2][3] = b23;
		paneArray[2][4] = w24;
		paneArray[2][5] = b25;
		paneArray[2][6] = w26;
		paneArray[2][7] = b27;

		paneArray[3][0] = b30;
		paneArray[3][1] = w31;
		paneArray[3][2] = b32;
		paneArray[3][3] = w33;
		paneArray[3][4] = b34;
		paneArray[3][5] = w35;
		paneArray[3][6] = b36;
		paneArray[3][7] = w37;

		paneArray[4][0] = w40;
		paneArray[4][1] = b41;
		paneArray[4][2] = w42;
		paneArray[4][3] = b43;
		paneArray[4][4] = w44;
		paneArray[4][5] = b45;
		paneArray[4][6] = w46;
		paneArray[4][7] = b47;

		paneArray[5][0] = b50;
		paneArray[5][1] = w51;
		paneArray[5][2] = b52;
		paneArray[5][3] = w53;
		paneArray[5][4] = b54;
		paneArray[5][5] = w55;
		paneArray[5][6] = b56;
		paneArray[5][7] = w57;

		paneArray[6][0] = w60;
		paneArray[6][1] = b61;
		paneArray[6][2] = w62;
		paneArray[6][3] = b63;
		paneArray[6][4] = w64;
		paneArray[6][5] = b65;
		paneArray[6][6] = w66;
		paneArray[6][7] = b67;

		paneArray[7][0] = b70;
		paneArray[7][1] = w71;
		paneArray[7][2] = b72;
		paneArray[7][3] = w73;
		paneArray[7][4] = b74;
		paneArray[7][5] = w75;
		paneArray[7][6] = b76;
		paneArray[7][7] = w77;
	}

	private void insertBlackPiecesIntoArray() {
		blackPieces = new ImageView[16];

		blackPieces[0] = blackRook1;
		blackPieces[1] = blackRook2;
		blackPieces[2] = blackKnight1;
		blackPieces[3] = blackKnight2;
		blackPieces[4] = blackBishop1;
		blackPieces[5] = blackBishop2;
		blackPieces[6] = blackCrown;
		blackPieces[7] = blackKing;

		blackPieces[8] = blackPawn1;
		blackPieces[9] = blackPawn2;
		blackPieces[10] = blackPawn3;
		blackPieces[11] = blackPawn4;
		blackPieces[12] = blackPawn5;
		blackPieces[13] = blackPawn6;
		blackPieces[14] = blackPawn7;
		blackPieces[15] = blackPawn8;
	}

	private void insertWhitePiecesIntoArray() {
		whitePieces = new ImageView[16];

		whitePieces[0] = whiteRook1;
		whitePieces[1] = whiteRook2;
		whitePieces[2] = whiteKnight1;
		whitePieces[3] = whiteKnight2;
		whitePieces[4] = whiteBishop1;
		whitePieces[5] = whiteBishop2;
		whitePieces[6] = whiteCrown;
		whitePieces[7] = whiteKing;

		whitePieces[8] = whitePawn1;
		whitePieces[9] = whitePawn2;
		whitePieces[10] = whitePawn3;
		whitePieces[11] = whitePawn4;
		whitePieces[12] = whitePawn5;
		whitePieces[13] = whitePawn6;
		whitePieces[14] = whitePawn7;
		whitePieces[15] = whitePawn8;
	}

	private int getIndexOfPiece(ImageView[] arr, ImageView imageView) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(imageView)) {
				return i;
			}
		}
		return -1;
	}

	private int[] getIndexOfPane(Pane pane) {
		int[] arr = new int[2];
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (paneArray[i][j] == pane) {
					arr[0] = i;
					arr[1] = j;
					return arr;
				}
			}
		}
		return null;
	}

	private void resetGame() {
		blackOutTilePane.getChildren().clear();
		whiteOutTilePane.getChildren().clear();
		playerFlag = true;

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				paneArray[i][j].getChildren().clear();
			}
		}

		w00.getChildren().add(blackRook1);
		b10.getChildren().add(blackKnight1);
		w20.getChildren().add(blackBishop1);
		b30.getChildren().add(blackCrown);
		w40.getChildren().add(blackKing);
		b50.getChildren().add(blackBishop2);
		w60.getChildren().add(blackKnight2);
		b70.getChildren().add(blackRook2);

		b01.getChildren().add(blackPawn1);
		w11.getChildren().add(blackPawn2);
		b21.getChildren().add(blackPawn3);
		w31.getChildren().add(blackPawn4);
		b41.getChildren().add(blackPawn5);
		w51.getChildren().add(blackPawn6);
		b61.getChildren().add(blackPawn7);
		w71.getChildren().add(blackPawn8);

		w06.getChildren().add(whitePawn1);
		b16.getChildren().add(whitePawn2);
		w26.getChildren().add(whitePawn3);
		b36.getChildren().add(whitePawn4);
		w46.getChildren().add(whitePawn5);
		b56.getChildren().add(whitePawn6);
		w66.getChildren().add(whitePawn7);
		b76.getChildren().add(whitePawn8);

		b07.getChildren().add(whiteRook1);
		w17.getChildren().add(whiteKnight1);
		b27.getChildren().add(whiteBishop1);
		w37.getChildren().add(whiteCrown);
		b47.getChildren().add(whiteKing);
		w57.getChildren().add(whiteBishop2);
		b67.getChildren().add(whiteKnight2);
		w77.getChildren().add(whiteRook2);

		resetIsValidPane();
	}

	private void blackRookValidation(ImageView rook) {
		changePaneColor(rook);
		Pane pane = (Pane) rook.getParent();
		int[] arr = getIndexOfPane(pane);

		if (arr[0] < 7) {
			for (int i = arr[0] + 1; i <= 7; i++) {
				if (paneArray[i][arr[1]].getChildren().size() > 0) {
					if (getIndexOfPiece(blackPieces, (ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(whitePieces,
							(ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						isValidPane[i][arr[1]] = true;
						paneArray[i][arr[1]].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[i][arr[1]] = true;
				paneArray[i][arr[1]]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[1] < 7) {
			for (int i = arr[1] + 1; i <= 7; i++) {
				if (paneArray[arr[0]][i].getChildren().size() > 0) {
					if (getIndexOfPiece(blackPieces, (ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(whitePieces,
							(ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						isValidPane[arr[0]][i] = true;
						paneArray[arr[0]][i].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[arr[0]][i] = true;
				paneArray[arr[0]][i]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[0] > 0) {
			for (int i = arr[0] - 1; i >= 0; i--) {
				if (paneArray[i][arr[1]].getChildren().size() > 0) {
					if (getIndexOfPiece(blackPieces, (ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(whitePieces,
							(ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						isValidPane[i][arr[1]] = true;
						paneArray[i][arr[1]].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[i][arr[1]] = true;
				paneArray[i][arr[1]]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[1] > 0) {
			for (int i = arr[1] - 1; i >= 0; i--) {
				if (paneArray[arr[0]][i].getChildren().size() > 0) {
					if (getIndexOfPiece(blackPieces, (ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(whitePieces,
							(ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						isValidPane[arr[0]][i] = true;
						paneArray[arr[0]][i].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[arr[0]][i] = true;
				paneArray[arr[0]][i]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
	}

	private void whiteRookValidation(ImageView rook) {
		changePaneColor(rook);
		Pane pane = (Pane) rook.getParent();
		int[] arr = getIndexOfPane(pane);

		if (arr[0] < 7) {
			for (int i = arr[0] + 1; i <= 7; i++) {
				if (paneArray[i][arr[1]].getChildren().size() > 0) {
					if (getIndexOfPiece(whitePieces, (ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(blackPieces,
							(ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						isValidPane[i][arr[1]] = true;
						paneArray[i][arr[1]].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[i][arr[1]] = true;
				paneArray[i][arr[1]]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[1] < 7) {
			for (int i = arr[1] + 1; i <= 7; i++) {
				if (paneArray[arr[0]][i].getChildren().size() > 0) {
					if (getIndexOfPiece(whitePieces, (ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(blackPieces,
							(ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						isValidPane[arr[0]][i] = true;
						paneArray[arr[0]][i].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[arr[0]][i] = true;
				paneArray[arr[0]][i]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[0] > 0) {
			for (int i = arr[0] - 1; i >= 0; i--) {
				if (paneArray[i][arr[1]].getChildren().size() > 0) {
					if (getIndexOfPiece(whitePieces, (ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(blackPieces,
							(ImageView) (paneArray[i][arr[1]].getChildren().get(0))) >= 0) {
						isValidPane[i][arr[1]] = true;
						paneArray[i][arr[1]].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[i][arr[1]] = true;
				paneArray[i][arr[1]]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[1] > 0) {
			for (int i = arr[1] - 1; i >= 0; i--) {
				if (paneArray[arr[0]][i].getChildren().size() > 0) {
					if (getIndexOfPiece(whitePieces, (ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						break;
					} else if (getIndexOfPiece(blackPieces,
							(ImageView) (paneArray[arr[0]][i].getChildren().get(0))) >= 0) {
						isValidPane[arr[0]][i] = true;
						paneArray[arr[0]][i].setBackground(
								new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
						break;
					}
				}
				isValidPane[arr[0]][i] = true;
				paneArray[arr[0]][i]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
	}

	private void blackKnightValidation(ImageView knight) {
		changePaneColor(knight);
		int[][] arr = { { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -2, 1 }, { -1, 2 }, { -2, -1 }, { -1, -2 } };
		Pane pane = (Pane) knight.getParent();
		int[] brr = getIndexOfPane(pane);
		int a = brr[0], b = brr[1];
		for (int i = 0; i < arr.length; i++) {
			if (a + arr[i][0] < 8 && a + arr[i][0] >= 0 && b + arr[i][1] < 8 && b + arr[i][1] >= 0) {
				if (paneArray[a + arr[i][0]][b + arr[i][1]].getChildren().size() > 0 && getIndexOfPiece(whitePieces,
						(ImageView) paneArray[a + arr[i][0]][b + arr[i][1]].getChildren().get(0)) > 0) {
					isValidPane[a + arr[i][0]][b + arr[i][1]] = true;
					paneArray[a + arr[i][0]][b + arr[i][1]]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				} else if (paneArray[a + arr[i][0]][b + arr[i][1]].getChildren().size() == 0) {
					isValidPane[a + arr[i][0]][b + arr[i][1]] = true;
					paneArray[a + arr[i][0]][b + arr[i][1]]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			}
		}
	}

	private void whiteKnightValidation(ImageView knight) {
		changePaneColor(knight);
		int[][] arr = { { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 }, { -2, 1 }, { -1, 2 }, { -2, -1 }, { -1, -2 } };
		Pane pane = (Pane) knight.getParent();
		int[] brr = getIndexOfPane(pane);
		int a = brr[0], b = brr[1];
		for (int i = 0; i < arr.length; i++) {
			if (a + arr[i][0] < 8 && a + arr[i][0] >= 0 && b + arr[i][1] < 8 && b + arr[i][1] >= 0) {
				if (paneArray[a + arr[i][0]][b + arr[i][1]].getChildren().size() > 0 && getIndexOfPiece(blackPieces,
						(ImageView) paneArray[a + arr[i][0]][b + arr[i][1]].getChildren().get(0)) > 0) {
					isValidPane[a + arr[i][0]][b + arr[i][1]] = true;
					paneArray[a + arr[i][0]][b + arr[i][1]]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				} else if (paneArray[a + arr[i][0]][b + arr[i][1]].getChildren().size() == 0) {
					isValidPane[a + arr[i][0]][b + arr[i][1]] = true;
					paneArray[a + arr[i][0]][b + arr[i][1]]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			}
		}
	}

	private void blackBishopValidation(ImageView bishop) {
		changePaneColor(bishop);
		int[] arr = getIndexOfPane((Pane) bishop.getParent());
		int a = arr[0], b = arr[1];
		for (int i = 1, j = 1; a + i <= 7 && b + j <= 7; i++, j++) {
			if (paneArray[a + i][b + j].getChildren().size() < 1 || (paneArray[a + i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a + i][b + j].getChildren().get(0)) == -1)) {
				isValidPane[a + i][b + j] = true;
				paneArray[a + i][b + j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a + i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a + i][b + j].getChildren().get(0)) == -1)) {
				break;
			}
		}

		for (int i = 1, j = 1; a - i >= 0 && b - j >= 0; i++, j++) {
			if (paneArray[a - i][b - j].getChildren().size() < 1 || (paneArray[a - i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a - i][b - j].getChildren().get(0)) == -1)) {
				isValidPane[a - i][b - j] = true;
				paneArray[a - i][b - j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a - i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a - i][b - j].getChildren().get(0)) == -1)) {
				break;
			}
		}

		for (int i = 1, j = 1; a + i <= 7 && b - j >= 0; i++, j++) {
			if (paneArray[a + i][b - j].getChildren().size() < 1 || (paneArray[a + i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a + i][b - j].getChildren().get(0)) == -1)) {
				isValidPane[a + i][b - j] = true;
				paneArray[a + i][b - j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a + i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a + i][b - j].getChildren().get(0)) == -1)) {
				break;
			}
		}

		for (int i = 1, j = 1; a - i >= 0 && b + j <= 7; i++, j++) {
			if (paneArray[a - i][b + j].getChildren().size() < 1 || (paneArray[a - i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a - i][b + j].getChildren().get(0)) == -1)) {
				isValidPane[a - i][b + j] = true;
				paneArray[a - i][b + j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a - i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(blackPieces, (ImageView) paneArray[a - i][b + j].getChildren().get(0)) == -1)) {
				break;
			}
		}
	}

	private void whiteBishopValidation(ImageView bishop) {
		changePaneColor(bishop);
		int[] arr = getIndexOfPane((Pane) bishop.getParent());
		int a = arr[0], b = arr[1];
		for (int i = 1, j = 1; a + i <= 7 && b + j <= 7; i++, j++) {
			if (paneArray[a + i][b + j].getChildren().size() < 1 || (paneArray[a + i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a + i][b + j].getChildren().get(0)) == -1)) {
				isValidPane[a + i][b + j] = true;
				paneArray[a + i][b + j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a + i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a + i][b + j].getChildren().get(0)) == -1)) {
				break;
			}
		}

		for (int i = 1, j = 1; a - i >= 0 && b - j >= 0; i++, j++) {
			if (paneArray[a - i][b - j].getChildren().size() < 1 || (paneArray[a - i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a - i][b - j].getChildren().get(0)) == -1)) {
				isValidPane[a - i][b - j] = true;
				paneArray[a - i][b - j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a - i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a - i][b - j].getChildren().get(0)) == -1)) {
				break;
			}
		}

		for (int i = 1, j = 1; a + i <= 7 && b - j >= 0; i++, j++) {
			if (paneArray[a + i][b - j].getChildren().size() < 1 || (paneArray[a + i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a + i][b - j].getChildren().get(0)) == -1)) {
				isValidPane[a + i][b - j] = true;
				paneArray[a + i][b - j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a + i][b - j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a + i][b - j].getChildren().get(0)) == -1)) {
				break;
			}
		}

		for (int i = 1, j = 1; a - i >= 0 && b + j <= 7; i++, j++) {
			if (paneArray[a - i][b + j].getChildren().size() < 1 || (paneArray[a - i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a - i][b + j].getChildren().get(0)) == -1)) {
				isValidPane[a - i][b + j] = true;
				paneArray[a - i][b + j]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			} else {
				break;
			}
			if ((paneArray[a - i][b + j].getChildren().size() > 0
					&& getIndexOfPiece(whitePieces, (ImageView) paneArray[a - i][b + j].getChildren().get(0)) == -1)) {
				break;
			}
		}
	}

	private void kingValidation(ImageView king, ImageView[] pieceArray) {
		changePaneColor(king);
		int[] ind = getIndexOfPane((Pane) king.getParent());
		int[][] arr = { { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 }, { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		for (int i = 0; i < 8; i++) {
			int a = ind[0] + arr[i][0];
			int b = ind[1] + arr[i][1];
			if (a <= 7 && a >= 0 && b <= 7 && b >= 0) {
				if (paneArray[a][b].getChildren().size() > 0
						&& getIndexOfPiece(pieceArray, (ImageView) paneArray[a][b].getChildren().get(0)) != -1) {
					continue;
				}
				isValidPane[a][b] = true;
				paneArray[a][b].setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
	}

	private void blackPawnValidation(ImageView pawn) {
		changePaneColor(pawn);
		Pane pane = (Pane) pawn.getParent();
		int[] arr = getIndexOfPane(pane);

		if (getIndexOfPiece(blackPieces, pawn) >= 0 && arr[0] <= 7 && arr[1] < 7
				&& paneArray[arr[0]][arr[1] + 1].getChildren().size() == 0) {
			isValidPane[arr[0]][arr[1] + 1] = true;
			paneArray[arr[0]][arr[1] + 1]
					.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			if ((arr[1] + 1 < 7 && paneArray[arr[0]][arr[1] + 2].getChildren().size() == 0) && arr[1] == 1) {
				isValidPane[arr[0]][arr[1] + 2] = true;
				paneArray[arr[0]][arr[1] + 2]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[0] >= 0 && arr[0] <= 7 && arr[1] < 7) {
			if (arr[0] == 0) {
				if (paneArray[arr[0] + 1][arr[1] + 1].getChildren().size() == 1 && getIndexOfPiece(whitePieces,
						(ImageView) paneArray[arr[0] + 1][arr[1] + 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] + 1][arr[1] + 1] = true;
					paneArray[arr[0] + 1][arr[1] + 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			} else if (arr[0] == 7) {
				if (paneArray[arr[0] - 1][arr[1] + 1].getChildren().size() == 1 && getIndexOfPiece(whitePieces,
						(ImageView) paneArray[arr[0] - 1][arr[1] + 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] - 1][arr[1] + 1] = true;
					paneArray[arr[0] - 1][arr[1] + 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			} else {
				if (paneArray[arr[0] - 1][arr[1] + 1].getChildren().size() == 1 && getIndexOfPiece(whitePieces,
						(ImageView) paneArray[arr[0] - 1][arr[1] + 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] - 1][arr[1] + 1] = true;
					paneArray[arr[0] - 1][arr[1] + 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
				if (paneArray[arr[0] + 1][arr[1] + 1].getChildren().size() == 1 && getIndexOfPiece(whitePieces,
						(ImageView) paneArray[arr[0] + 1][arr[1] + 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] + 1][arr[1] + 1] = true;
					paneArray[arr[0] + 1][arr[1] + 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			}
		}
	}

	private void whitePawnValidation(ImageView pawn) {
		changePaneColor(pawn);
		Pane pane = (Pane) pawn.getParent();
		int[] arr = getIndexOfPane(pane);

		if (getIndexOfPiece(whitePieces, pawn) >= 0 && arr[0] >= 0 && arr[1] > 0
				&& paneArray[arr[0]][arr[1] - 1].getChildren().size() == 0) {
			isValidPane[arr[0]][arr[1] - 1] = true;
			paneArray[arr[0]][arr[1] - 1]
					.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			if (arr[1] - 2 > 0 && paneArray[arr[0]][arr[1] - 2].getChildren().size() == 0 && arr[1] == 6) {
				isValidPane[arr[0]][arr[1] - 2] = true;
				paneArray[arr[0]][arr[1] - 2]
						.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
			}
		}
		if (arr[0] >= 0 && arr[0] <= 7 && arr[1] > 0) {
			if (arr[0] == 0) {
				if (paneArray[arr[0] + 1][arr[1] - 1].getChildren().size() == 1 && getIndexOfPiece(blackPieces,
						(ImageView) paneArray[arr[0] + 1][arr[1] - 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] + 1][arr[1] - 1] = true;
					paneArray[arr[0] + 1][arr[1] - 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			} else if (arr[0] == 7) {
				if (paneArray[arr[0] - 1][arr[1] - 1].getChildren().size() == 1 && getIndexOfPiece(blackPieces,
						(ImageView) paneArray[arr[0] - 1][arr[1] - 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] - 1][arr[1] - 1] = true;
					paneArray[arr[0] - 1][arr[1] - 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			} else {
				if (paneArray[arr[0] - 1][arr[1] - 1].getChildren().size() == 1 && getIndexOfPiece(blackPieces,
						(ImageView) paneArray[arr[0] - 1][arr[1] - 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] - 1][arr[1] - 1] = true;
					paneArray[arr[0] - 1][arr[1] - 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
				if (paneArray[arr[0] + 1][arr[1] - 1].getChildren().size() == 1 && getIndexOfPiece(blackPieces,
						(ImageView) paneArray[arr[0] + 1][arr[1] - 1].getChildren().get(0)) >= 0) {
					isValidPane[arr[0] + 1][arr[1] - 1] = true;
					paneArray[arr[0] + 1][arr[1] - 1]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#CCFFCC"), null, null)));
				}
			}
		}
	}

	private void resetIsValidPane() {
		for (int i = 0; i < isValidPane.length; i++) {
			for (int j = 0; j < isValidPane.length; j++) {
				isValidPane[i][j] = false;
				if ((j % 2 != 0 && i % 2 == 0) || (j % 2 == 0 && i % 2 != 0)) {
					paneArray[i][j]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#999999"), null, null)));
				} else {
					paneArray[i][j]
							.setBackground(new Background(new BackgroundFill(Color.valueOf("#FFFFFF"), null, null)));
				}
			}
		}
	}

	private void pieceValidation(ImageView piece) {
		int ind = getIndexOfPiece(blackPieces, piece);
		if (ind >= 0 && playerFlag) {
			if (ind == 0 || ind == 1) {
				blackRookValidation(piece);
			} else if (ind == 2 || ind == 3) {
				blackKnightValidation(piece);
			} else if (ind == 4 || ind == 5) {
				blackBishopValidation(piece);
			} else if (ind >= 8 && ind <= 15) {
				blackPawnValidation(piece);
			} else if (ind == 6) {
				blackBishopValidation(piece);
				blackRookValidation(piece);
			} else if (ind == 7) {
				kingValidation(piece, blackPieces);
			}

		} else if (ind == -1) {
			ind = getIndexOfPiece(whitePieces, piece);
			if (ind >= 0 && !playerFlag) {
				if (ind == 0 || ind == 1) {
					whiteRookValidation(piece);
				} else if (ind == 2 || ind == 3) {
					whiteKnightValidation(piece);
				} else if (ind == 4 || ind == 5) {
					whiteBishopValidation(piece);
				} else if (ind >= 8 && ind <= 15) {
					whitePawnValidation(piece);
				} else if (ind == 6) {
					whiteBishopValidation(piece);
					whiteRookValidation(piece);
				} else if (ind == 7) {
					kingValidation(piece, whitePieces);
				}
			}
		}
	}
}
