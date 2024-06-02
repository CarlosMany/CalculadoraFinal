package com.example.calculadorafinal

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.R
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.calculadorafinal.ui.theme.CalculadoraFinalTheme
import androidx.compose.ui.text.style.TextAlign



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CalculadoraFinalTheme {
                Surface {
                    Calculadora()
                }
                }
            }
        }
    }


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Calculadora() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Calculadora",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.LightGray
                )
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var valorA by remember { mutableStateOf("") }
                var valorB by remember { mutableStateOf("") }
                var resultado by remember { mutableStateOf("") }

                OutlinedTextField(
                    value = valorA,
                    label = { Text("Introduce el valor A") },
                    onValueChange = { valorA = it },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                OutlinedTextField(
                    value = valorB,
                    label = { Text("Introduce el valor B") },
                    onValueChange = { valorB = it },
                    modifier = Modifier.fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Spacer(modifier = Modifier.height(20.dp))
                //SUMA
                Button(
                    onClick = {
                        val vA: Double = valorA.toDoubleOrNull() ?: 0.0
                        val vB: Double = valorB.toDoubleOrNull() ?: 0.0
                        val suma = vA + vB
                        resultado = suma.toString()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Calcular Suma")
                }
                Spacer(modifier = Modifier.height(5.dp))
                //Resta
                Button(
                    onClick = {
                        val vA: Double = valorA.toDoubleOrNull() ?: 0.0
                        val vB: Double = valorB.toDoubleOrNull() ?: 0.0
                        val resta = vA - vB
                        resultado = resta.toString()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Magenta
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Calcular Resta")
                }
                Spacer(modifier = Modifier.height(5.dp))
                //Multiplicacion
                Button(
                    onClick = {
                        val vA: Double = valorA.toDoubleOrNull() ?: 0.0
                        val vB: Double = valorB.toDoubleOrNull() ?: 0.0
                        val mult = vA * vB
                        resultado = mult.toString()
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Black
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Calcular Multiplicacion")
                }
                Spacer(modifier = Modifier.height(5.dp))
                //Divison
                Button(
                    onClick = {
                        val vA: Double = valorA.toDoubleOrNull() ?: 0.0
                        val vB: Double = valorB.toDoubleOrNull() ?: 0.0
                        val div = vA / vB
                        resultado = div.toString()
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Calcular Division")
                }
                Spacer(modifier = Modifier.height(20.dp))
                //Resultado
                OutlinedTextField(
                    value = resultado,
                    label = { Text("Resultado") },
                    onValueChange = {resultado = it},
                    readOnly = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Spacer(modifier = Modifier.height(20.dp))
                // Lottie Animation
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(com.example.calculadorafinal.R.raw.cat))
                //val progress by animateLottieCompositionAsState(composition)

                LottieAnimation(
                    composition = composition,
                    iterations = LottieConstants.IterateForever,
                    modifier = Modifier
                        .size(200.dp)
                        .fillMaxWidth()
                        .align(alignment = Alignment.CenterHorizontally)
                )
            }
        }
    )
}