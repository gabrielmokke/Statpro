package com.statpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.textview)
        textView.text = FeatureList.features.joinToString(separator = "\n") { "\u2022 $it" }
    }
}

object FeatureList {
    val features = listOf(
        // Análise Estatística
        "Análise de Over/Under",
        "Análise de Ambas Marcam (BTTS)",
        "Análise de Handicap Asiático",
        "Probabilidade de Vitória por Time (1X2)",
        "Média de Gols por Partida",
        "Média de Escanteios",
        "Média de Cartões",
        "Análise de Primeiros e Segundos Tempos (HT/FT)",
        "Análise de Tendências de Resultado",
        "Percentual de Clean Sheets",

        // Momentos de Partida
        "Gol nos primeiros minutos",
        "Gol antes do intervalo",
        "Gol no fim do jogo",
        "Períodos com mais gols",
        "Tendência de gols nos últimos 10 minutos",
        "Times que fazem ou sofrem gols no final",

        // Volume de Mercado
        "Volume de Apostas por Resultado (1X2)",
        "Volume de Dinheiro Movimentado",
        "Variação do Volume ao longo das últimas horas",
        "Porcentagem de Apostas por Mercado",
        "Análise de Variação das Odds",

        // IA e Machine Learning
        "Previsão de Resultado com base em estatísticas",
        "Probabilidade de Gol ao Vivo",
        "Score Expected (XG)",
        "Score Simulado",
        "Probabilidade de Over/Under por IA",
        "Sinal de Valor",
        "Detecção de Odds Desajustadas",

        // Alertas Inteligentes
        "Alerta de Over Limit",
        "Alerta de Virada Improvável",
        "Alerta de Anomalias de Mercado",
        "Alerta de Padrão de Gols",

        // Performance Recente
        "Últimos 5 jogos (Home/Away)",
        "Sequência de Vitórias/Derrotas",
        "Performance como mandante/visitante",
        "Aproveitamento contra times do mesmo nível",

        // Confronto Direto
        "Resultados dos últimos confrontos",
        "Média de gols em confrontos diretos",
        "Tendência de ambas marcam em confrontos diretos",

        // Fatores Externos
        "Condição do Gramado",
        "Clima (Chuva, calor, etc)",
        "Público e Estádio",
        "Desfalques Importantes",

        // Estratégias Sugeridas
        "Sinal para Over 2.5",
        "Sinal para Ambas Marcam",
        "Sinal para Handicap",
        "Sinal para Vitória Limpa",
        "Sugestão de Entrada ao Vivo",
        "Sugestão de Cash Out",
        "Sugestão de Esperar"
    )
}
