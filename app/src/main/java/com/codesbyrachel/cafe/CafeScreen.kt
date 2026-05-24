package com.codesbyrachel.cafe

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.codesbyrachel.cafe.ui.theme.CafeTheme
import com.codesbyrachel.cafe.ui.theme.SuccessGreen

@Composable
fun CafeScreen() {
    var nomeCliente by remember { mutableStateOf("") }
    var tamanhoSelecionado by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.cafe),
            contentDescription = "Imagem de um café",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        )

        Column(modifier = Modifier.padding(24.dp)) {
            Text(
                text = "Cappuccino Especial",
                style = MaterialTheme.typography.titleLarge
            )

            Text(
                text = "R$ 12,90",
                color = MaterialTheme.colorScheme.secondary,
                modifier = Modifier.padding(vertical = 4.dp),
                style = MaterialTheme.typography.bodyLarge
            )
            Text(
                text = "Café encorpado com leite vaporizado",
                style = MaterialTheme.typography.bodyLarge
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = nomeCliente,
                onValueChange = {
                    nomeCliente = it
                },
                label = { Text("Nome no copo", style = MaterialTheme.typography.labelSmall) },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Tamanho:",
                style = MaterialTheme.typography.titleMedium
            )

            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                listOf("P", "M", "G").forEach { tamanho ->
                    Button(
                        onClick = {
                            tamanhoSelecionado = tamanho
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (tamanhoSelecionado == tamanho)
                                MaterialTheme.colorScheme.primary
                            else
                                MaterialTheme.colorScheme.surfaceVariant,

                            contentColor = if (tamanhoSelecionado == tamanho)
                                MaterialTheme.colorScheme.onPrimary
                            else
                                MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    ) {
                        Text(tamanho, style = MaterialTheme.typography.bodyLarge)
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = if (tamanhoSelecionado.isNotEmpty())
                    "Tamanho selecionado: $tamanhoSelecionado"
                else
                    "Selecione um tamanho",
                color = if (tamanhoSelecionado.isEmpty()) MaterialTheme.colorScheme.error else MaterialTheme.colorScheme.onSurface
            )

            Spacer(modifier = Modifier.weight(1f))

            Button(
                onClick = { },
                enabled = nomeCliente.isNotBlank() && tamanhoSelecionado.isNotEmpty(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = SuccessGreen
                )
            ) {
                Text(
                    text = "Fazer Pedido",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CafeScreenPreview() {
    CafeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            CafeScreen()
        }
    }
}