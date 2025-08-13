package com.example.composepracticetaskcompleted

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepracticetaskcompleted.ui.theme.ComposePracticeTaskCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposePracticeTaskCompletedTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTaskCompleted()
                }
            }
        }
    }
}

@Composable
fun ComposeTaskCompleted() {
    TaskCompleted(
        message = stringResource(R.string.all_tasks_completed),
        string = stringResource(R.string.nice_work),
        imagePainter = painterResource(R.drawable.ic_task_completed)
    )
}

@Composable
fun TaskCompleted(message: String,
                  string: String,
                  imagePainter: Painter,
                  modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Image(
            painter = imagePainter,
            contentDescription = null,
            alignment = Alignment.Center
        )
        Text(
            text = message,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = string,
            fontSize = 16.sp,
            modifier = Modifier.align(alignment = Alignment.CenterHorizontally)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
    ComposePracticeTaskCompletedTheme {
        ComposeTaskCompleted();
    }
}