package com.example.anacarolina.dictionary.data

import com.google.gson.annotations.SerializedName

class ApiWord(
        @SerializedName("text")
        val text: String,
        @SerializedName("word")
        val word: String,
        @SerializedName("sequence")
        val sequence: String
)
