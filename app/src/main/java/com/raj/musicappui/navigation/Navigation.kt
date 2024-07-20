package com.raj.musicappui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.raj.musicappui.viewmodel.MainViewModel
import com.raj.musicappui.presentation.AccountView
import com.raj.musicappui.presentation.BrowseView
import com.raj.musicappui.presentation.HomeView
import com.raj.musicappui.presentation.LibraryView
import com.raj.musicappui.presentation.SubscriptionView

@Composable
fun Navigation(navController: NavController, viewModel: MainViewModel, pd:PaddingValues){
    NavHost(navController = navController as NavHostController,
        startDestination = Screen.BottomScreen.Home.bRoute,
        modifier = Modifier.padding(pd)
        ) {
        composable(Screen.DrawerScreen.Account.route){
            AccountView()

        }
        composable(Screen.DrawerScreen.Subscription.route){
            SubscriptionView()

        }
        composable(Screen.BottomScreen.Home.bRoute){
            HomeView()

        }
        composable(Screen.BottomScreen.Browse.bRoute){
            BrowseView()

        }
        composable(Screen.BottomScreen.Library.bRoute){
            LibraryView()

        }


    }
}