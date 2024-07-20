package com.raj.musicappui.presentation

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.raj.musicappui.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeView(){
    val  categories = listOf("Hits","Happy","Workout","Running","TGIF","Yoga")
    val grouped = listOf("New Release","Favorite","Top Rated").groupBy { it[0] }
    LazyColumn {
        grouped.forEach{
            stickyHeader { 
                Text(text = it.value[0], modifier = Modifier.padding(16.dp))
                LazyRow {
                    items(categories){
                       cat->
                        HomeItem(cat=cat, drawable = R.drawable.baseline_music_video_24)
                    }
                }
            }
        }
    }
}
@Composable
fun HomeItem(cat: String, drawable: Int) {
    androidx.compose.material.Card(
        modifier = Modifier
            .padding(16.dp)
            .size(200.dp),
        border = BorderStroke(3.dp, Color.DarkGray),
        elevation = 4.dp // Adding elevation for a shadow effect
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp), // Adding padding inside the card
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = cat,
                style = MaterialTheme.typography.h6, // Using a text style from the theme
                color = Color.Black // Setting the text color
            )
            Spacer(modifier = Modifier.height(8.dp)) // Adding space between text and icon
            Icon(
                painter = painterResource(id = drawable),
                contentDescription = cat,
                modifier = Modifier.size(48.dp), // Specifying the size of the icon
                tint = Color.Unspecified // Preventing the icon from being tinted by default color
            )
        }
    }
}
