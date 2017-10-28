package com.example.anacarolina.dictionary.presentation.Search

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.example.anacarolina.dictionary.databinding.ActivitySearchBinding
import javax.inject.Inject

class SearchActivity() {

    companion object {
        fun start(context: Context){
            context.startActivity(Intent(context, SearchActivity::class.java))
        }
    }

    @Inject protected lateinit var viewModel: SearchViewModel

    private lateinit var binding: ActivitySearchBinding

    fun onCreate(savedInstanceState: Bundle?) {


    }

}
