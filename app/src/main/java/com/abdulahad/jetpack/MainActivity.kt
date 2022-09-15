package com.abdulahad.jetpack

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abdulahad.jetpack.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            rawColumn()
        }
    }

    @SuppressLint("ComposableNaming")
    @Composable
    fun rawColumn() {

        Row(modifier = Modifier.fillMaxSize()) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1.0f)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
                ) {

                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(0.75f)
                    ) {

                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.3f)
                        ) {

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.8f)
                                    .background(bir),
                            ) {

                                Text(modifier = Modifier.fillMaxSize(), text = "1", fontSize = 20.sp)

                            }
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.2f)
                                    .background(ikki)
                            ) {

                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.6f)
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.4f)
                                    .background(besh)
                            ) {

                            }
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.6f)
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.5f)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.5f)
                                            .background(olti)
                                    ) {

                                    }
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.5f)
                                            .background(qora)
                                    ) {

                                    }
                                    Box(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .weight(0.5f)
                                            .background(ikki)
                                    ) {

                                    }
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.5f)
                                        .background(yetti)
                                ) {

                                }
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(0.25f)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.6f)
                                .background(sakkiz)
                        ) {

                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.4f)
                                .background(toqqiz)
                        ) {

                        }
                    }
                }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
                ) {

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(0.3f)
                            .background(alphabet)
                    ) {

                    }
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(0.7f)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.25f)
                                .background(A)
                        ) {

                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .weight(0.75f)
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.5f)
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.3f)
                                        .background(B)
                                ) {

                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.6f)
                                        .background(C)
                                ) {

                                }

                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.5f)
                            ) {

                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.6f)
                                        .background(D)
                                ) {

                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.3f)
                                        .background(E)
                                ) {

                                }
                            }
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.2f)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.125f)
                        .background(uch)
                ) {

                }
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.875f)
                        .background(tort)
                ) {

                }
            }
        }
    }
}