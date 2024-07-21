package com.example.appbuildingguide

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.appbuildingguide.navgraph.NavGraph
import com.example.appbuildingguide.ui.theme.AppBuildingGuideTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppBuildingGuideTheme {
                NavGraph()
            }
        }
    }
}