package com.example.learncompose

 import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
 import androidx.compose.material.*
 import androidx.compose.runtime.*
 import androidx.compose.ui.Alignment
 import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.learncompose.ui.theme.SteveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SteveTheme {
                // A surface container using the 'background' color from the theme
               myApp()
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    var expanded = remember {
        mutableStateOf(false)
    }

    var extraPadding = if (expanded.value) 48.dp else 0.dp

    Surface(color = MaterialTheme.colors.primary, modifier = Modifier.padding(8.dp, vertical = 4.dp)) {
        Row(modifier = Modifier.padding(24.dp)) {

            Column(modifier = Modifier.weight(1f)) {

                Text(text = "Hello, ")
                Text(text = "$name !")
            }
            OutlinedButton(onClick = { expanded.value = !expanded.value }) {
                Text(if (expanded.value)"Show Less" else "Show More")
                
            }

        }


    }
}

@Composable
//登机画面
fun OnboardingScreen(onContinueClicked:() -> Unit) {

    Surface {
        Column(
            //尽可能填充空间
            modifier = Modifier.fillMaxSize(),
            //垂直排列             布局      中心
            verticalArrangement = Arrangement.Center,
            //水平对齐             对齐     水平居中
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("欢迎来到基础代码实验室！")
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = onContinueClicked
            ) {
                Text("Continue")
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnboardingPreview() {
    SteveTheme{
        OnboardingScreen(onContinueClicked = {})
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SteveTheme {
        myApp()
    }
}

@Composable
fun myApp() {
    // TODO: This state should be hoisted 这个状态应该被提升
//shouldShowOnboarding 应该在此时显示
    var shouldShowOnboarding by remember { mutableStateOf(true) }

    if (shouldShowOnboarding) {
        OnboardingScreen(onContinueClicked = {shouldShowOnboarding = false})
    } else {
        Greetings()
    }
}


@Composable
fun Greetings(name: List<String> = listOf("World", "Kotlin", "Steve", "Guys", "Compose", "Android")) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colors.background
    ) {
        Column(modifier = Modifier.padding(vertical = 4.dp)) {

            Greeting("${name[0]}")
            Greeting("${name[1]}")
            Greeting("${name[2]}")
            Greeting("${name[3]}")
            Greeting("${name[4]}")
        }
    }
}