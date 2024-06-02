# Calculadora Final

Esta es una aplicación de calculadora simple desarrollada en Kotlin utilizando Jetpack Compose. La aplicación permite realizar operaciones básicas como suma, 
resta, multiplicación y división.

## Características

- **Suma**: Calcula la suma de dos números.
- **Resta**: Calcula la resta de dos números.
- **Multiplicación**: Calcula la multiplicación de dos números.
- **División**: Calcula la división de dos números.
- **Animación**: Muestra una animación Lottie después de la operación.

## Requisitos

- Android Studio
- SDK de Android
- Conexión a Internet para descargar dependencias

1. Clona el repositorio:
    ```HTTPS
    https://github.com/CarlosMany/CalculadoraFinal.git
    ```

2. Abre el proyecto en Android Studio.

3. Asegúrate de tener todas las dependencias necesarias en el archivo `build.gradle`:
    ```gradle
    dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.lottie.compose)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
   }

4. Sincroniza el proyecto con Gradle.

## Uso

1. Ejecuta la aplicación en un emulador o dispositivo Android.

2. Ingresa los valores en los campos "Introduce el valor A" y "Introduce el valor B".

3. Haz clic en uno de los botones para realizar la operación deseada:
   - **Calcular Suma**
   - **Calcular Resta**
   - **Calcular Multiplicación**
   - **Calcular División**

4. El resultado aparecerá en el campo "Resultado".
