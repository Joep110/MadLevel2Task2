package com.example.madlevel2task2

data class Question(
    var question: String,
    var answer: Boolean
) {
    companion object {
        val QUESTION_QUESTIONS = arrayOf(
            "Deze vraag is waar",
            "Deze vraag is waar",
            "Deze vraag is niet waar",
            "Deze vraag is waar"
        )

        val QUESTION_ANSWERS = arrayOf(
            true,
            true,
            false,
            true
        )
    }
}