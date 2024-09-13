package com.example.femaleshoppingui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.femaleshoppingui.ui.theme.pink

@Composable
fun HomeUiContent() {
    Box(modifier = Modifier.fillMaxWidth().background(Color.White)) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            // Top Bar with heading and menu
            Row(
                modifier = Modifier.background(pink)
                    .fillMaxWidth()
                    .height(56.dp)
            ) {
                buttons(icon = R.drawable.baseline_menu_24, Color.White)
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Female Shopping App",
                        style = TextStyle(
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.W700
                        )
                    )
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    buttons(icon = R.drawable.baseline_manage_search_24)
                }
            }

            // Grid to display dresses
            LazyVerticalGrid(columns = GridCells.Fixed(2)) {
                items(Data.datalist) { dress ->
                    ShowDress(data = dress)
                }
            }
        }
    }
}

@Composable
fun buttons(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified,
) {
    IconButton(onClick = {}) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            modifier = Modifier.background(tint)
        )
    }
}

@Composable
fun ShowDress(
    data: Data.Demo
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .width(180.dp)
            .height(360.dp)
            .padding(8.dp),
        elevation = CardDefaults.elevatedCardElevation(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White // Clean, white background for the card
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Dress Image
            Image(
                painter = painterResource(id = data.img),
                contentDescription = "",
                modifier = Modifier
                    .size(120.dp)
                    .clip(RoundedCornerShape(15.dp)) // Rounded corners for image
                    .background(Color.LightGray), // Background for contrast
                contentScale = ContentScale.Crop
            )

            // Dress Name
            Text(
                text = data.name,
                style = TextStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.padding(top = 10.dp)
            )

            // Dress Description
            Text(
                text = data.disp,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.padding(vertical = 6.dp)
            )

            // Dress Price (added for shopping app context)
            Text(
                text = "$${data.price}",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = pink,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier.padding(vertical = 6.dp)
            )

            // Add to Cart Button
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(top = 8.dp),
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = pink
                )
            ) {
                Text(
                    text = "Add to Cart",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    ),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}
