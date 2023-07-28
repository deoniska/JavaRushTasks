package com.javarush.games.game2048;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    private void createGame() {
        createNewNumber();
        createNewNumber();

    }

    private void drawScene() {
        for (int x = 0; x < gameField.length; x++) {
            for (int y = 0; y < gameField.length; y++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
    }

    private void createNewNumber() {
        int x = getRandomNumber(SIDE);
        int y = getRandomNumber(SIDE);
        boolean flag = true;
        while (flag) {
            if (gameField[y][x] == 0) {
                int almost = getRandomNumber(10);
                if (almost > 8) {
                    gameField[y][x] = 4;
                } else {
                    gameField[y][x] = 2;
                }
                flag = false;
            } else {
                x = getRandomNumber(SIDE);
                y = getRandomNumber(SIDE);
            }
        }
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHITE;
            case 2:
                return Color.GREY;
            case 4:
                return Color.DARKGREY;
            case 8:
                return Color.ORANGE;
            case 16:
                return Color.DARKORANGE;
            case 32:
                return Color.ORANGERED;
            case 64:
                return Color.RED;
            case 128:
                return Color.YELLOW;
            case 256:
                return Color.CORAL;
            case 512:
                return Color.GREENYELLOW;
            case 1024:
                return Color.GREEN;
            case 2048:
                return Color.BLUE;
            default:
                return Color.NONE;
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String str = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, str);
    }

    private boolean compressRow(int[] row) {
        boolean isMove = false;
        boolean flag = true;
        boolean moved = false;
        while (flag) {

            for (int i = 1; i < row.length; i++) {
                moved = false;
                if (row[i] == 0) {
                    continue;
                } else if (row[i - 1] == 0) {
                    int temp;
                    temp = row[i - 1];
                    row[i - 1] = row[i];
                    row[i] = temp;
                    isMove = true;
                    moved = true;

                    break;
                }

            }
            if (!moved) {
                flag = false;
            }
        }
  
        return isMove;
    }
}
