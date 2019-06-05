#ifndef _GAME_H__
#define _GAME_H__

#include <stdio.h>
#include <stdlib.h>
#include <stdlib.h>

#define COL 3
#define ROW 3


void initArr(char arr[ROW][COL], int row, int col);
void displayArr(char arr[ROW][COL], int row, int col);
void computerMove(char arr[ROW][COL], int row, int col);
void playerMove(char arr[ROW][COL], int row, int col);
char judgeWin(char arr[ROW][COL], int row, int col);
int isFull(char arr[ROW][COL], int row, int col);



#endif //_GAME_H__
