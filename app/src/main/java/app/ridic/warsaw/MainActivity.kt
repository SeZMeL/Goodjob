package app.ridic.warsaw

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Column(
                        modifier = Modifier.padding(20.dp),
                        verticalArrangement = Arrangement.spacedBy(16.dp)
                    ) {
                        Text("Ridic Warsaw", style = MaterialTheme.typography.headlineMedium)
                        Text("Uber Driver • Bolt Driver", style = MaterialTheme.typography.titleMedium)
                        Card {
                            Column(modifier = Modifier.padding(16.dp)) {
                                Text("LPG yakıt ayarı", style = MaterialTheme.typography.titleLarge)
                                Spacer(Modifier.height(8.dp))
                                Text("Tüketim: 7,0 L / 100 km")
                                Text("LPG fiyatı: 3,90 PLN / L")
                                Text("Tahmini yakıt maliyeti: 0,273 PLN / km")
                            }
                        }
                        Text(
                            "Teklif analizi ve sürüş özeti sonraki geliştirme adımında eklenecek.",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
