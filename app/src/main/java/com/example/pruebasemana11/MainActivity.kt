package com.example.pruebasemana11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.pruebasemana11.ui.theme.Pruebasemana11Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Pruebasemana11Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CounterApp(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun CounterApp(modifier: Modifier = Modifier) {
    // Estado del contador
    var count by remember { mutableStateOf(0) }

    // UI
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Texto que muestra el contador
        Text(
            text = "Contador: $count",
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Botón que incrementa el contador
        Button(onClick = { count++ }) {
            Text(text = "Incrementar")
        }
    }
}
