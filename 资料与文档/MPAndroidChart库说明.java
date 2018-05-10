核心功能:
http://www.2cto.com/kf/201606/519449.html
https://github.com/25sprout/ChartLib-Demo-Android#ValueFormatter
https://jitpack.io/com/github/PhilJay/MPAndroidChart/v3.0.0-beta1/javadoc/
https://github.com/zhuanghongji/MPAndroidChart/tree/master/1.官方文档译文
支持x，y轴缩放
支持拖拽
支持手指滑动
支持高亮显示
支持保存图表到文件中
支持从文件（txt）中读取数据
预先定义颜色模板
自动生成标注
支持自定义x，y轴的显示标签
支持x，y轴动画
支持x，y轴设置最大值和附加信息
支持自定义字体，颜色，背景，手势，虚线等

主要的Api方法:
setDescription(String desc) : 设置表格的描述
setDescriptionTypeface(Typeface t) :自定义表格中显示的字体
setDrawYValues(boolean enabled) : 设置是否显示y轴的值的数据
setValuePaintColor(int color) :设置表格中y轴的值的颜色，但是必须设置setDrawYValues（true）
setValueTypeface(Typeface t):设置字体
setValueFormatter(DecimalFormat format) : 设置显示的格式
setPaint(Paint p, int which) : 自定义笔刷
public ChartData getDataCurrent() :返回ChartData对象当前显示的图表。它包含了所有信息的显示值最小和最大值等
public float getYChartMin() : 返回当前最小值
public float getYChartMax() : 返回当前最大值
public float getAverage() : 返回所有值的平均值。
public float getAverage(int type) : 返回平均值
public PointF getCenter() : 返回中间点
public Paint getPaint(int which) : 得到笔刷
setTouchEnabled(boolean enabled) : 设置是否可以触摸，如为false，则不能拖动，缩放等
setDragScaleEnabled(boolean enabled) : 设置是否可以拖拽，缩放
setOnChartValueSelectedListener(OnChartValueSelectedListener l) : 设置表格上的点，被点击的时候，的回调函数
setHighlightEnabled(boolean enabled) : 设置点击value的时候，是否高亮显示
public void highlightValues(Highlight[] highs) : 设置高亮显示
saveToGallery(String title) : 保存图表到图库中
saveToPath(String title, String pathOnSD) : 保存.
setScaleMinima(float x, float y) : 设置最小的缩放
centerViewPort(int xIndex, float val) : 设置视口
fitScreen() : 适应屏幕
setNoDataTextDescription("You need to provide data for the chart.");如果没有数据的时候，会显示这个
barChart.setDrawGridBackground(false); 是否显示表格颜色 
setTouchEnabled(true); 设置是否可以触摸
setDragEnabled(false); 是否可以拖拽
setScaleEnabled(false);是否可以缩放
setPinchZoom(false);集双指缩放
setBackgroundColor(Color.parseColor("#01000000"));设置背景
setDrawGridBackground(false);如果打开，背景矩形将出现在已经画好的绘图区域的后边
setDrawBarShadow(false);集拉杆阴影
getLegend().setEnabled(false);图例
setData(barData); 设置数据
getAxisRight().setEnabled(false)隐藏右边的坐标轴
getAxisLeft().setEnabled(false);隐藏左边的左边轴 (同上)
setGridBackgroundColor(Color.parseColor("#00000000"))网格背景颜色
setDrawGridBackground(false);是否显示表格颜色
setBorderColor(Color.parseColor("#00000000"));设置边框颜色
setDescriptionColor(Color.parseColor("#00000000"));说明颜色
setDrawBarShadow(false);拉杆阴影
setDrawBorders(false);打开或关闭绘制的图表边框
setForm(LegendForm.CIRCLE);设置窗体样式
setFormSize(4f);字体
setTextColor(Color.parseColor("#00000000"));字体颜色
setDrawValues(true);绘制值
setLineWidth(1.0f);线宽
setCircleColor(Color.parseColor("#00A918"));圈颜色
setCircleSize(0f);圆的大小
setDrawFilled(true) 设置是否填充
setFillColor(Color.parseColor("#00A918"));填充颜色
setDrawCubic(true);绘制立方
setAxisDependency(YAxis.AxisDependency.LEFT);轴依赖
setHoleRadius(60f);  //半径 
setTransparentCircleRadius(64f); // 半透明圈   
setDrawCenterText(true);  //饼状图中间可以添加文字 
setRotationAngle(90); // 初始旋转角度
setRotationEnabled(true); // 可以手动旋转  
setUsePercentValues(true);  //显示成百分比
setCenterText("Quarterly Revenue");  //饼状图中间的文字 
Legend mLegend = pieChart.getLegend();  //设置比例图    
mLegend.setPosition(LegendPosition.RIGHT_OF_CHART);  //最右边显示    
mLegend.setForm(LegendForm.LINE);  //设置比例图的形状，默认是方形    
mLegend.setXEntrySpace(7f);    
mLegend.setYEntrySpace(5f);  
setSliceSpace(0f); //设置个饼状图之间的距离
setSelectionShift(px); // 选中态多出的长度  
setDawCubic(true) 设置允许曲线平滑
setCubicIntensity(0.6f) 设置曲线平滑度
mLineChart.getLowestVisibleXIndex();  //返回 能见到的X的最小值下标 返回值是int类型
mLineChart.getHighestVisibleXIndex();  //返回 能见到的X的最大值下标 返回值是int类型
mLineChart.getYMin();  //返回 数据Y的最小值 返回值是float类型
mLineChart.getYMax();  //返回 数据Y的最大值 返回值是float类型
setDoubleTapToZoomEnabled(true);//设置是否可以通过双击屏幕放大图表。默认是true
setHighlightPerDragEnabled(true);//能否拖拽高亮线(数据点与坐标的提示线)，默认是true
setDragDecelerationEnabled(true);//拖拽滚动时，手放开是否会持续滚动，默认是true（false是拖到哪是哪，true拖拽之后还会有缓冲）
setDragDecelerationFrictionCoef(0.99f);//与上面那个属性配合，持续滚动时的速度快慢，[0,1) 0代表立即停止。
 //可以设置一条警戒线，如下：
        LimitLine ll = new LimitLine(40f, "警戒线");
        ll.setLineColor(Color.RED);
        ll.setLineWidth(4f);
        ll.setTextColor(Color.GRAY);
        ll.setTextSize(12f);
        // .. and more styling options
        xAxis.addLimitLine(ll);
 xAxis.setLabelsToSkip(1);    //设置坐标相隔多少，参数是int类型
        xAxis.resetLabelsToSkip();   //将自动计算坐标相隔多少
Y轴专用
        yAxis.setStartAtZero(true);    //设置Y轴坐标是否从0开始
        yAxis.setAxisMaxValue(50);    //设置Y轴坐标最大为多少
        yAxis.resetAxisMaxValue();    //重新设置Y轴坐标最大为多少，自动调整
        yAxis.setAxisMinValue(10);    //设置Y轴坐标最小为多少
        yAxis.resetAxisMinValue();    //重新设置Y轴坐标，自动调整
        yAxis.setInverted(false);    //Y轴坐标反转,默认是false,即下小上大
        yAxis.setSpaceTop(0);    //Y轴坐标距顶有多少距离，即留白
        yAxis.setSpaceBottom(0);    //Y轴坐标距底有多少距离，即留白
        yAxis.setShowOnlyMinMax(false);    //参数如果为true Y轴坐标只显示最大值和最小值
        yAxis.setLabelCount(10, false);    //第一个参数是Y轴坐标的个数，第二个参数是 是否不均匀分布，true是不均匀分布
 The Axis 坐标轴相关的,XY轴通用
        xAxis.setEnabled(true);     //是否显示X坐标轴 及 对应的刻度竖线，默认是true
        xAxis.setDrawAxisLine(true); //是否绘制坐标轴的线，即含有坐标的那条线，默认是true
        xAxis.setDrawGridLines(true); //是否显示X坐标轴上的刻度竖线，默认是true
        xAxis.setDrawLabels(true); //是否显示X坐标轴上的刻度，默认是true

        xAxis.setTextColor(Color.rgb(145, 13, 64)); //X轴上的刻度的颜色
        xAxis.setTextSize(5); //X轴上的刻度的字的大小 单位dp
//      xAxis.setTypeface(Typeface tf); //X轴上的刻度的字体
        xAxis.setGridColor(Color.rgb(145, 13, 64)); //X轴上的刻度竖线的颜色
        xAxis.setGridLineWidth(1); //X轴上的刻度竖线的宽 float类型
        xAxis.enableGridDashedLine(40, 3, 0); //虚线表示X轴上的刻度竖线(float lineLength, float spaceLength, float phase)三个参数，1.线长，2.虚线间距，3.虚线开始坐标
candleDataSet.setShowCandleBar(false); 不画蜡烛线的边框
动画:
所有的图表类型都支持下面三种动画，分别是x方向，y方向，xy方向。
animateX(int durationMillis) : x轴方向
animateY(int durationMillis) : y轴方向
animateXY(int xDuration, int yDuration) : xy轴方向
mChart.animateX(3000f); // animate horizontal 3000 milliseconds// or:
mChart.animateY(3000f); // animate vertical 3000 milliseconds// or:
mChart.animateXY(3000f, 3000f); // animate horizontal and vertical 3000 milliseconds
注意：如果调用动画方法后，就没有必要调用 invalidate（）方法，来刷新界面了。

显示的图表类型:
LineChart (with legend, simple design) (线性图)
  

LineChart (with legend, simple design) (线性图)


 


LineChart (cubic lines) (线性图)


 


LineChart (single DataSet) (线性图)





BarChart2D (with legend, simple design) (柱状图)


BarChart2D (grouped DataSets) (柱状图)
 
BarChart2D

PieChart (with selection, ...) (饼状图)

ScatterChart  (with squares, triangles, circles, ... and more)（散列图）

CandleStickChart  (for financial data)
 
RadarChart  (spider web chart)（螂蛛网图）

1、直接使用jar方式，需要导入mpchartlib.jar，nineoldandroidsjar。
2、使用libproject的方式，作为项目依赖。
步骤:
如果使用 LineChart, BarChart, ScatterChart, CandleStickChart or PieChart
, 可以直接在xml中定义。
<com.github.mikephil.charting.charts.LineChart        android:id="@+id/chart"
        android:layout_width="match_parent"
        android:layout_height="match_parent" />
LineChart chart = (LineChart) findViewById(R.id.chart);
或则直接在代码中声明和实例化。
LineChart chart = new LineChart(Context);