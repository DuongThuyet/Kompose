
//fun Modifier.shimmer(): Modifier = composed {
//    val shimmerColors = listOf(
//        Color(0XFFFBFBFC).copy(alpha = 0.6f),
//        Color(0XFFE6E9EC).copy(alpha = 0.6f),
//        Color.Transparent,
//    )
//    val transition = rememberInfiniteTransition(label = "infiniteTransition")
//    val translateAnimation = transition.animateFloat(
//        initialValue = 0f,
//        targetValue = 1000f,
//        animationSpec = infiniteRepeatable(
//            animation = tween(1500),
//            repeatMode = RepeatMode.Restart
//        ),
//        label = "floatAnimation"
//    )
//    drawBehind {
//        drawRect(
//            Color(0XFFE6E9EC).copy(alpha = 0.6f),
//        )
//        drawRect(
//            brush = Brush.linearGradient(
//                colors = shimmerColors,
//                start = Offset.Zero,
//                end = Offset(x = translateAnimation.value, y = translateAnimation.value)
//            )
//        )
//    }
//}
//
//@Composable
//fun ShimmerAsyncImage(
//    model: Any?,
//    contentDescription: String?,
//    modifier: Modifier = Modifier,
//    transform: (State) -> State = DefaultTransform,
//    alignment: Alignment = Alignment.Center,
//    contentScale: ContentScale = ContentScale.Fit,
//    alpha: Float = DefaultAlpha,
//    colorFilter: ColorFilter? = null,
//    filterQuality: FilterQuality = DrawScope.DefaultFilterQuality,
//    @DrawableRes placeholder: Int? = null,
//) {
//    val imageLoadedSuccess = remember {
//        mutableStateOf(false)
//    }
//    val imageLoadedFailed = remember {
//        mutableStateOf(false)
//    }
//    AsyncImage(
//        model = if (imageLoadedFailed.value) placeholder ?: model else model,
//        contentDescription = contentDescription,
//        modifier = if (imageLoadedSuccess.value) modifier else modifier.shimmer(),
//        transform = transform,
//        onState = { state ->
//            if (state is State.Success) {
//                imageLoadedSuccess.value = true
//            }
//            if (state is State.Error) {
//                imageLoadedFailed.value = true
//            }
//        },
//        alignment = alignment,
//        contentScale = contentScale,
//        alpha = alpha,
//        colorFilter = colorFilter,
//        filterQuality = filterQuality,
//    )
//}
