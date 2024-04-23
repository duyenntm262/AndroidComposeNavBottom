package com.example.androidcomposenavbotsheet

sealed class Screens (val screen: String){
    object Home: Screens("home")
    object Search: Screens("search")
    object Notification: Screens("notification")
    object Profile: Screens("profile")
    object Post: Screens("post")
    object Settings: Screens("settings")
}