package com.example.android.unscramble.ui

data class GameUiState(
    val currenScrambledWord: String = "",
    val currentWordCount: Int = 0,
    val isGuessedWordWrong: Boolean = false,
    val score: Int = 0 ,
    val isGameOver: Boolean = false



)