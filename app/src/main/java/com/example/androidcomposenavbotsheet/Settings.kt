package com.example.androidcomposenavbotsheet

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.TabRowDefaults
import androidx.compose.material3.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcomposenavbotsheet.ui.theme.Black
import com.example.androidcomposenavbotsheet.ui.theme.GreenJC
import kotlinx.coroutines.launch

val paddingValues = 0.dp
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Settings(){
    Column(modifier = Modifier.padding(top = 20.dp)) {
        val pagerState = rememberPagerState(
            pageCount = { 3 }
        )
        val coroutineScope = rememberCoroutineScope()
        TabRow(
            selectedTabIndex = pagerState.currentPage,
            containerColor = Black,
            contentColor = Color.White,
            divider = {},
            indicator = { tabPositions ->
                TabRowDefaults.Indicator(
                    modifier = Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                    height = 2.dp,
                    color = Color.White
                )
            }
        ){
            Tab(
                selected = pagerState.currentPage == 0,
                text = {
                    Text(text = "Sound", fontSize = 18.sp)
                },
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(0)
                    }
                }
            )

            Tab(
                selected = pagerState.currentPage == 1,
                text = {
                    Text(text = "Screen Bright", fontSize = 18.sp)
                },
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(1)
                    }
                }
            )

            Tab(
                selected = pagerState.currentPage == 2,
                text = {
                    Text(text = "System", fontSize = 18.sp)
                },
                onClick = {
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(2)
                    }
                }
            )

        }
        HorizontalPager(
            state = pagerState,
            userScrollEnabled = false
        ){
            page ->
            Column (
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ){
                Text(text = "Hello from Page: ${page}")
            }
        }
    }
}