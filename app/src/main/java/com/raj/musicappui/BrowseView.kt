package com.raj.musicappui

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
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BrowseView(){
    val  categories = listOf("Hits","Happy","Workout","Running","TGIF","Yoga")
    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories){cat->
            BrowserItem(cat = cat, drawable = R.drawable.ic_subscribe)

        }

    }
}
@Composable
fun BrowserItem(cat: String, drawable: Int) {
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