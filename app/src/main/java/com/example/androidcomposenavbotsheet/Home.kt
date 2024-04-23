package com.example.androidcomposenavbotsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomposenavbotsheet.data.DataProvider
import com.example.androidcomposenavbotsheet.ui.theme.GreenJC

@Composable
fun Home(){
    val puppies = remember { DataProvider.puppyList }
    LazyColumn (
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 75.dp)
    ){
        items(
            items = puppies,
            itemContent = {
                PuppyListItem(puppy = it)
            }
        )
    }
}