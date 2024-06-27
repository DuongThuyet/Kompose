package com.sugar.kompose

import Colors
import Colors.Green6
import NewTextStyles
import android.graphics.Shader
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RadialGradientShader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sugar.kompose.ui.theme.KomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InitComposeView()
        }
    }

    @Composable
    fun InitComposeView() {
        val largeRadialGradient = object : ShaderBrush() {
            override fun createShader(size: Size): Shader {
                val biggerDimension = maxOf(size.height, size.width)
                return RadialGradientShader(
                    colors = listOf(Color(0xFF2be4dc), Color(0xFF243484)),
                    center = size.center,
                    radius = biggerDimension / 2f,
                    colorStops = listOf(0f, 0.95f)
                )
            }
        }
        KomposeTheme {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    //.weight(weight = 1f, fill = false)
                    .background(largeRadialGradient)
                    .padding(top = 16.dp)
                    .padding(16.dp, 32.dp, 16.dp, 16.dp),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Colors.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Greeting("Android")
                }
//----------------------
                Row(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .background(Colors.White, shape = RoundedCornerShape(10.dp))
                        .padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_power),
                        contentDescription = "",
                        modifier = Modifier.size(24.dp),
                        colorFilter = ColorFilter.tint(color = Green6)
                    )
                    Text(
                        text = "Suppers", style = NewTextStyles.H5,
                        modifier = Modifier
                            .padding(start = 16.dp)
                            .weight(1f)
                    )

                    Switch(
                        checked = true,
                        onCheckedChange = {},
                        colors = SwitchDefaults.colors()
                    )
                }


                Row(modifier = Modifier
                    .padding(top = 16.dp)
                    .background(Colors.White, shape = RoundedCornerShape(10.dp))
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(painter = painterResource(id = R.drawable.ic_setup), contentDescription = "",
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(32.dp)
                    )
                    Column(modifier = Modifier
                        .weight(1f)
                        .padding(end = 16.dp)) {
                        Text(text = "Guardian",
                            style = NewTextStyles.H6
                        )
                        Text(text = "We are a galaxy team",
                            style = NewTextStyles.Body4,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                    Image(painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = ""
                    )
                }

    //--------------------------
                Row(modifier = Modifier
                    .padding(top = 16.dp)
                    .background(Colors.White, shape = RoundedCornerShape(10.dp))
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    UIDrawBehind()
                }

            }
        }
    }

    @Preview
    @Composable
    private fun InitTotalDebtView() {
        AnimatedVisibility(visible = true) {
            Card (
                modifier = Modifier
                    .padding(16.dp),
                elevation = CardDefaults.cardElevation(10.dp),
                border = BorderStroke(0.8.dp,Colors.Green6),
            ) {
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .clickable {

                    },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)) {

                        Text(
                            text = "Total Deposit",
                            style = NewTextStyles.OverlineTitle1,
                        )
                        Text(text =  "đ88.888",
                            style = NewTextStyles.H2,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
                        )
                        AnimatedVisibility(visible = true) {
                            Text(
                                text = "You need to deposit more",
                                style = NewTextStyles.Caption2,
                            )
                        }
                        AnimatedVisibility(visible = true) {
                            Text(
                                text =  "Dep Lung Link | $323232423",
                                style = NewTextStyles.Caption2,
                                modifier = Modifier.padding(top = 4.dp)
                            )
                        }
                    }

                    Image(painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(end = 16.dp)
                            .size(18.dp)
                        ,
                        colorFilter = ColorFilter.tint(Colors.Gray40)

                    )
                }
            }

        }
    }



    //    fun getProfileAndDocument() = viewModelScope.launch {
    //        repository.supplierProfile().asFlow().zip(repository.getUpdateDocuments().asFlow()){ profile, docRes->
    //            if (profile.isNonNull() && docRes.isNonNull()){
    //                val documents = ArrayList<PhotoDocument>()
    //                docRes.data?.let {
    //                    documents.addAll(it)
    //                }
    //                profile.data?.supplier?.extra?.vaccinationInfo?.forEach { info ->
    //                    if (info.certificateUrl != null && info.status != null) {
    //                        documents.add(
    //                            PhotoDocument(
    //                                imageUrl = info.certificateUrl.valueOrEmpty(),
    //                                type = info.type,
    //                                status =  info.status.valueOrEmpty(),
    //                                time = info.time,
    //                                vaccineType = info.vaccineType
    //                            )
    //                        )
    //                    }
    //                }
    //                _profileDocument.update { Pair(profile.data,documents) }
    //            }
    //        }.onCompletion { cause ->
    //            if (cause.isNonNull()) {
    //                _profileErrorState.update { cause }
    //            }
    //        }.collect()
    //    }
    @Composable
    @Preview
    fun UIDrawBehind(){
        Row(
            modifier = Modifier
                .background(Color.White, shape = RoundedCornerShape(10.dp))
                .fillMaxWidth()
                .padding(16.dp)
                .clickable { },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_combine_order_new),
                contentDescription = "",
                modifier = Modifier.size(40.dp)
            )
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(end = 16.dp, start = 16.dp)
            ) {
                Text(
                    text = "Connecting",
                    style = NewTextStyles.H5,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 6.dp)
                ) {
                    Text(
                        text = "Tim hieu them",
                        color = Colors.Gray50,
                        style = NewTextStyles.Body3,
                        modifier = Modifier
                            .padding(bottom = 4.dp)
                            .drawBehind {
                                val strokeWidthPx = 1.dp.toPx()
                                val verticalOffset = size.height - 2.sp.toPx()
                                drawLine(
                                    color = Colors.Gray50,
                                    strokeWidth = strokeWidthPx,
                                    start = Offset(0f, verticalOffset),
                                    end = Offset(size.width, verticalOffset)
                                )
                            }
                            .clickable {  },
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 2
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ic_arrow_right),
                        contentDescription = "",
                        modifier = Modifier.align(Alignment.CenterVertically)

                    )
                }

            }

            Switch(
                checked = true, onCheckedChange = { checked ->

                }, colors = SwitchDefaults.colors(
                    checkedTrackColor = Colors.Primary50,
                    checkedThumbColor = Colors.White,
                    uncheckedThumbColor = Colors.Gray7,
                    uncheckedTrackColor = Colors.Gray7
                )
            )
        }
    }

    @Composable
    @Preview
    private fun InitInstructionTakingProofView() {
        Column(
            Modifier
                .background(Colors.Secondary80, RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                .padding(16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable {

                    },
            ){
                Text(
                    text =  "Tutorial",
                    modifier = Modifier
                        .widthIn(0.dp, 350.dp)
                        .padding(top = 6.dp, bottom = 16.dp)
                        .align(Alignment.CenterVertically),
                    style = NewTextStyles.H5,
                    color = Colors.White,
                    textAlign = TextAlign.Center
                )
                Icon(
                    painterResource(id = R.drawable.ic_arrow_down),
                    contentDescription = "",
                    Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp, bottom = 6.dp)
                        .rotate(if (true) 0f else 180f),
                    tint = Colors.White
                )
            }

            AnimatedVisibility(visible = true) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(4.dp))),
                        contentScale = ContentScale.Crop
                    )

                    Text(
                        text = "description.value",
                        style = NewTextStyles.Caption2,
                        color = Colors.White,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 16.dp, bottom = 16.dp),
                        textAlign = TextAlign.Start
                    )

                    Text(
                        text = "stringResource(R.string.text_i_got_it)",
                        textAlign = TextAlign.Center,
                        style = NewTextStyles.Button3,
                        color = Colors.Secondary80,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp)
                            .clip(RoundedCornerShape(corner = CornerSize(8.dp)))
                            .background(Color.White)
                            .align(Alignment.CenterHorizontally)
                            .wrapContentHeight(Alignment.CenterVertically)
                    )
                }
            }
        }
    }



    @Composable
    fun InitPopupConfirmOptionView(
        titleConfirm: String,
        desConfirm: String,
        leftTitleConfirm: String,
        rightTitleConfirm: String
    ) {
        Box(
            Modifier
                .fillMaxSize()
                .background(Colors.Blur)) {
            Column(
                Modifier
                    .align(Alignment.Center)
                    .padding(start = 16.dp, end = 16.dp)
                    .background(Colors.White, RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp))
                    .padding(16.dp)
            ) {
                Text(
                    text = titleConfirm,
                    style = NewTextStyles.H4
                )

                Text(
                    text = desConfirm,
                    style = NewTextStyles.Body3,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )

                Row {
                    Text(
                        text = leftTitleConfirm,
                        style = NewTextStyles.Button3,
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 5.dp)
                            .clip(RoundedCornerShape(4.dp))
                            .align(Alignment.CenterVertically)
                            .background(Colors.Gray15)
                            .padding(14.dp)
                            .clickable {

                            },
                        textAlign = TextAlign.Center,
                        color = Colors.Black

                    )

                    Text(
                        text = rightTitleConfirm,
                        style = NewTextStyles.Button3,
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 5.dp)
                            .clip(RoundedCornerShape(4.dp))
                            .background(if (true) Colors.Red50 else Colors.Primary50)
                            .padding(14.dp)
                            .clickable {

                            },
                        textAlign = TextAlign.Center,
                        color = Colors.White
                    )
                }

            }

        }
    }



    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        InitComposeView()
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name",
        modifier = modifier,
        style = NewTextStyles.H3
    )
}

