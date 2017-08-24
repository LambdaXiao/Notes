android是单线程模型，存在线程安全问题
很多时候容易忘记在manifest.xml文件中添加所需要的权限，因而导致程序出现问题。
写入数据处理时最好try{  } catch (Exception e) {
			e.printStackTrace();
		} 抛出未知异常，以防程序异常退出

setFocusable(true); // 确保我们的View能获得输入焦点  
        setFocusableInTouchMode(true); // 确保能接收到触屏事件  
fSChartView.invalidate();//重绘视图

if(!"".equals(code)&&code!=null){

Toast.makeText(getApplicationContext(), "默认Toast样式",
     Toast.LENGTH_SHORT).show();

System.out.println(System.currentTimeMillis());

Intent intent = new Intent(oThis,Activity_a_hq_fsKx.class);
intent.putExtra("code", 123456);
startActivity(intent);
oThis.finish();

String code = getIntent().getStringExtra("code");

Fragment_set_modify_pwd f=new Fragment_set_modify_pwd() ;
ft=fManager.beginTransaction();
f.setArguments(b);
ft.replace(R.id.hq_id, f);
ft.addToBackStack(null);
ft.commit();

getColor 过时用ContextCompat.getColor(context, R.color.my_color)代替

Logger.e("  简体中文");
for(int i=0;i<rs.length;i++){
	Logger.printTCRS(rs[i], "", true);
}

view.setText(Html.fromHtml( "<font color=\"#000000\">" +sname + " </font><br/>"
						+ "<font size=\"3\" color=\"#969696\">" + scode
						+ "</font>"));
GTD_spinner.getSelectedItemPosition()

LayoutInflater factorys = LayoutInflater.from(当前类.this);
                final View textEntryView = factorys.inflate(R.layout.你要获取的另一个XML, null);  //获取指定布局中的控件
                TextView y_type = (TextView) textEntryView.findViewById(R.id.控件ID);

1、Log.v 的调试颜色为(VERBOSE)黑色的，任何消息都会输出，这里的v代表verbose啰嗦的意思，平时使用就是Log.v("","");

2、Log.d的输出颜色是   (DEBUG)蓝色的，仅输出debug调试的意思，但他会输出上层的信息，过滤起来可以通过DDMS的Logcat标签来选择.

3、Log.i的输出为        (INFO)绿色，一般提示性的消息information，它不会输出Log.v和Log.d的信息，但会显示i、w和e的信息

4、Log.w的意思为        (WARN)橙色，可以看作为warning警告，一般需要我们注意优化Android代码，同时选择它后还会输出Log.e的信息。

5、Log.e为             (ERROR)红色，可以想到error错误，这里仅显示红色的错误信息，这些错误就需要我们认真的分析，查看栈的信息了。

if (com.eno.net.utils.Logger.DEBUG) {
if(tc[i].IsError()){
while(!tc[1].IsEof()){
if (bundle == null) {
	return false;
}
1,--------------------------------------------------弹出框----------------------------------------------------

//发现新版本，提示用户更新
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("软件升级")
             .setMessage("发现新版本,建议立即更新使用.")
             .setPositiveButton("更新", new DialogInterface.OnClickListener() {
                 public void onClick(DialogInterface dialog, int which) {
                     //开启更新服务UpdateService
                     //这里为了把update更好模块化，可以传一些updateService依赖的值
                     //如布局ID，资源ID，动态获取的标题,这里以app_name为例
                     Intent updateIntent =new Intent(SubwayActivity.this, UpdateService.class);
                     updateIntent.putExtra("titleId",R.string.app_name);
                     startService(updateIntent);
                 }
             })
             .setNegativeButton("取消",new DialogInterface.OnClickListener(){
                 public void onClick(DialogInterface dialog, int which) {
                     dialog.dismiss();
                 }
             });
		.setCanceledOnTouchOutside(false);看看意思就是说在对话框的外面点击，是否让对话框消失,按返回键还起作用
		.setCancelable(false);在对话框的外面点击，是否让对话框消失,按返回键也不起作用
		.setView(view, 0, 0, 0, 0);自定义的dialog去除黑边框
		.setCustomTitle(title)标题居中
        alert.create().show();

popowindow点击外围不消失方法
可去掉setBackgroundDrawable(new BitmapDrawable())

1.
new AlertDialog.Builder(oThis).setTitle(R.string.Eno_cdcg)
			.setMessage(R.string.XML_MSG_R0013)
			.setPositiveButton(R.string.Eno_Ok, new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialoginterface, int i) {
					dialoginterface.cancel();
				}
			}).show();
2.
LayoutInflater inflater = LayoutInflater.from(oThis);
			final View textEntryView = inflater.inflate(R.layout.orderconfirm, null);
			TextView textView1 = (TextView) textEntryView.findViewById(R.id.ORDER_BSN);
			TextView textView2 = (TextView) textEntryView.findViewById(R.id.ORDER_ID);
			
			textView1.setText(order_bsn);
			textView2.setText(order_id);
			AlertDialog.Builder builder = new AlertDialog.Builder(oThis);
//			builder.setTitle(R.string.Eno_jinggao);
			builder.setView(textEntryView);
//			builder.setMessage(R.string.Eno_jinggaocontent);
			builder.setPositiveButton(R.string.Eno_Ok,
					new DialogInterface.OnClickListener() {
						public void onClick(DialogInterface dialog,
								int whichButton) {
						}
					});

			builder.create();
			builder.show();
15,--------------------------------------------切换fragment---------------------------------------
modifyPwd = (RelativeLayout) view.findViewById(R.id.tableLayout02);
		modifyPwd .setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Fragment_set_modify_pwd f=new Fragment_set_modify_pwd() ;
				ft=fManager.beginTransaction();
				ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);//Fragment转场动画
				f.setArguments(b);
				ft.replace(R.id.hq_id, f);
				ft.addToBackStack(null);
				ft.commit();
			}
		});
注：只有activity管理
public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			int count = fManager.getBackStackEntryCount() ;
			System.out.println("   count=== "+count);
			if(count>0){
				fManager.popBackStack() ;
			}else{
				AlertDialog.Builder ad = new AlertDialog.Builder(this);
				ad.setTitle("退出");
				ad.setMessage("是否退出软件?");
				ad.setPositiveButton("是", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int i) {
	//					enoSystem.m_tradeInfo = ""; // 清空登录信息
	//					enoSystem.m_marginTradeInfo = "";
	//					enoSystem.m_guaranteeTradeInfo = "";
						finish();
						/*
						android.os.Process
						.killProcess(android.os.Process
								.myPid());
						*/
					}
				});
				ad.setNegativeButton("否", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int i) {
						;
					}
				});
				ad.show();
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
21,-------------------------------------------------PopupWindow用法-----------------------------------

Android的对话框有两种：PopupWindow和AlertDialog。它们的不同点在于：
AlertDialog的位置固定，而PopupWindow的位置可以随意
AlertDialog是非阻塞线程的，而PopupWindow是阻塞线程的
PopupWindow的位置按照有无偏移分，可以分为偏移和无偏移两种；按照参照物的不同，可以分为相对于某个控件（Anchor锚）和相对于父控件。
showAsDropDown(View anchor)：相对某个控件的位置（正左下方），无偏移
showAsDropDown(View anchor, int xoff, int yoff)：相对某个控件的位置，有偏移
showAtLocation(View parent, int gravity, int x, int y)：相对于父控件的位置（例如正中央Gravity.CENTER，下方Gravity.BOTTOM等），可以设置偏移或无偏移
popupWindow.setAnimationStyle(R.style.PopupAnimation);／／设置窗口显示的动画效果

Style.xml文件：
    <style name="PopupAnimation" parent="android:Animation">
        <item name="android:windowEnterAnimation">@anim/menu_up</item>
    </style>
Meun_up.xml文件：
<set  xmlns:android="http://schemas.android.com/apk/res/android">
    <translate android:duration="500" android:fromXDelta="0.0" android:toXDelta="0.0" android:fromYDelta="100%" android:toYDelta="50%" />
</set>

// 设置SelectPicPopupWindow弹出窗体的宽  
        this.setWidth(w / 2 + 50);  
        // 设置SelectPicPopupWindow弹出窗体的高  
        this.setHeight(LayoutParams.WRAP_CONTENT);  
        // 设置SelectPicPopupWindow弹出窗体可点击  
        this.setFocusable(true);  
        this.setOutsideTouchable(true);  
        // 刷新状态  
        this.update();  
        // 实例化一个ColorDrawable颜色为半透明  
        ColorDrawable dw = new ColorDrawable(0000000000);  
        // 点back键和其他地方使其消失,设置了这个才能触发OnDismisslistener ，设置其他控件变化等操作  
        this.setBackgroundDrawable(dw);  

使用PopupWindow注意事项：必须设置PopupWindow的backgroundDrawable，否则会出现各种意想不到的bug。

        // mPopupWindow.setAnimationStyle(android.R.style.Animation_Dialog);  
        // 设置SelectPicPopupWindow弹出窗体动画效果  
        this.setAnimationStyle(R.style.AnimationPreview);  

mPopupWindow.showAsDropDown(v); // 相对某个控件的位置（正左下方），无偏移 
mPopupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);  // 相对于父控件的位置，无偏移 
21,-------------------------------------------------spinner用法-----------------------------------


 mySpinner = (Spinner)findViewById(R.id.Spinner_city);    
        //第二步：为下拉列表定义一个适配器，这里就用到里前面定义的list。    
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, list);    
        //第三步：为适配器设置下拉列表下拉时的菜单样式。    
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);    
        //第四步：将适配器添加到下拉列表上    
        mySpinner.setAdapter(adapter);    
        //第五步：为下拉列表设置各种事件的响应，这个事响应菜单被选中    
        mySpinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){    
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {    
                // TODO Auto-generated method stub    
                /* 将所选mySpinner 的值带入myTextView 中*/    
                myTextView.setText("您选择的是："+ adapter.getItem(arg2));    
                /* 将mySpinner 显示*/    
                arg0.setVisibility(View.VISIBLE);    
            }    
            public void onNothingSelected(AdapterView<?> arg0) {    
                // TODO Auto-generated method stub    
                myTextView.setText("NONE");    
                arg0.setVisibility(View.VISIBLE);    
            }    
        });    
        /*下拉菜单弹出的内容选项触屏事件处理*/    
        mySpinner.setOnTouchListener(new Spinner.OnTouchListener(){    
            public boolean onTouch(View v, MotionEvent event) {    
                // TODO Auto-generated method stub    
                /** 
                 *  
                 */  
                return false;    
            }  
        });    
        /*下拉菜单弹出的内容选项焦点改变事件处理*/    
        mySpinner.setOnFocusChangeListener(new Spinner.OnFocusChangeListener(){    
        public void onFocusChange(View v, boolean hasFocus) {              // TODO Auto-generated method stub    
  
        }    
        });    

 //设置默认选中
    mSpinner.setSelection(2,true);

int pos=adapter.getPosition(str);
mSpinnerCity.setSelection(pos);
banks.getItemIdAtPosition(position);
banks.getItemAtPosition(position)

android:spinnerMode="dialog" 
android:spinnerMode="dropdown"
android:entries="@array/beijing" 
 android:prompt="@string/beij_prompt"
4,---------------------------------------------获取时间---------------------------------------
long startTime = System.currentTimeMillis();
5,-------------------------------------单击事件方式--------------------------------------------------
devlopBtn.setOnLongClickListener(new OnLongClickListener() {			
			@Override
			public boolean onLongClick(View v) {
				getPopupWindow().showAtLocation(progressBar[0].getRootView(), Gravity.CENTER
					, 0, 0) ;
				return true;
			}
		}) ;

rb[2].setOnClickListener(new OnCheckedListener());
class OnCheckedListener implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			int isSelected=(Integer) arg0.getTag();
			for(int i=0;i<3;i++){
				if(isSelected==i){
					rb[isSelected].setChecked(true);
				}else{
					rb[i].setChecked(false);
				}
			}
			enoSystem.setLocale(isSelected);
			editor.putInt("local", isSelected) ;
			editor.commit();
			selectLanguage(isSelected);
		}
	}

rb[2].setOnClickListener(allOnClickListener );

//页面单击事件
View.OnClickListener allOnClickListener = new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			switch(v.getId()){
			case R.id.viewTagParent:
					break ;
			}
		}
};
6,--------------------------------------------------------登入-----------------------------------------------------
if("".equals(name)){
			login_name.setError(getResources().getString(R.string.ENOUserErrorDisplay));
			login_name.requestFocus();
		}else if("".equals(password)){
			login_password.setError(getResources().getString(R.string.XML_MSG_R0003));
			login_password.requestFocus();
		}else{
			login_name.setEnabled(false);
			login_password.setEnabled(false);
			login_sure.setEnabled(false);
			login_reset.setEnabled(false);
			
			String  str=enoSystem.getM_session();

			b=false;

			if(str==null||"".equals(str))
				b=false;
			else
				b=true;

			if(b){   //没有获取到session 重新请求
				sendClient();
			}else{
				sendLoginClient();
			}
7,-------------------------------------------切换语言--------------------------------------------
ipEdit.setEnabled(isChecked);

updateLange(Locale.SIMPLIFIED_CHINESE);
updateLange(Locale.TRADITIONAL_CHINESE);			
updateLange(new Locale(""));

private void updateLange(Locale locale){    	
		 Resources res = getResources();
		 Configuration config = res.getConfiguration();
		 config.locale = locale;
		 DisplayMetrics dm = res.getDisplayMetrics();
		 res.updateConfiguration(config, dm);
	}

8，------------------------------------split(" ")----------------------------------------
String[] s01=s.split(" ");这句话的作用是把字符串s中用空格符来分隔开的内容分离成一个一个的元素并组成一个新的字符类型的数组s01,即s01={"My","name","is","Ada"}
9，------------------------------------------------------------------------------------
if (values != null && !"".equals(values)) {
switch (view.getId()) {
		case R.id.button1:

11,-------------------------------去掉界面的标题栏-----------------------------------------------------
 requestWindowFeature(Window.FEATURE_NO_TITLE);// 填充标题栏 ,这句需要在setContentView之前使用
或者在AndroidManifest.xml文件中的application中修改android:theme="@android:style/Theme.NoTitleBar"即可

android:theme="@android:style/Theme.Dialog" 将一个Activity显示为能话框模式 
android:theme="@android:style/Theme.NoTitleBar" 不显示应用程序标题栏 
android:theme="@android:style/Theme.NoTitleBar.Fullscreen" 不显示应用程序标题栏，并全屏 
android:theme="Theme.Light" 背景为白色 
android:theme="Theme.Light.NoTitleBar" 白色背景并无标题栏 
android:theme="Theme.Light.NoTitleBar.Fullscreen" 白色背景，无标题栏，全屏 
android:theme="Theme.Black" 背景黑色 
android:theme="Theme.Black.NoTitleBar" 黑色背景并无标题栏 
android:theme="Theme.Black.NoTitleBar.Fullscreen" 黑色背景，无标题栏，全屏 
android:theme="Theme.Wallpaper" 用系统桌面为应用程序背景 
android:theme="Theme.Wallpaper.NoTitleBar" 用系统桌面为应用程序背景，且无标题栏 
android:theme="Theme.Wallpaper.NoTitleBar.Fullscreen" 用系统桌面为应用程序背景，无标题栏，全屏 
android:theme="Translucent"  透明背景
android:theme="Theme.Translucent.NoTitleBar"  透明背景并无标题
android:theme="Theme.Translucent.NoTitleBar.Fullscreen"  透明背景并无标题，全屏
android:theme="Theme.Panel"   面板风格显示
android:theme="Theme.Light.Panel" 平板风格显示
12,------------------------------------------获取各类资源---------------------------------------------------------
width= this.getWindowManager().getDefaultDisplay().getWidth()/5;
getApplication()
String code = getIntent().getStringExtra("code");
getActivity()
Resources  res =getResources();
str=res.getString(R.string.ENOOrderAcceptedDisplay) ;
oThis.getPackageName()


获取string.xml文件里面的值有几个不同的地方。

1.在AndroidManifest.xml与layout等xml文件里:

android:text=”@string/resource_name” 

 

2.在activity里：

方法一:this.getString(R.string.resource_name);  

方法二:getResources().getString(R.string.resource_name); 


3.在其他java文件（必须有Context或application）

方法一: context.getString(R.string.resource_name); 

方法二: application.getString(R.string.resource_name);

获取其他的资源文件比如colors.xml的值也是一样直接用getResources().getColor(R.string.black);

当然这里也可以用getResources().getDrawable(R.string.black);
13,--------------------------------------if判断------------------------------------------------------
是否相等"SUC".equals(vaule)
是否为空 TextUtils.isEmpty(code) && code.indexOf(".")>-1

14,------------------------------------可视与不可视-------------------------------------------
radioBtn.setVisibility(View.VISIBLE) ;
radioBtn.setVisibility(View.GONE) ;


16，--------------------------------------------------------------handler -----------
Message msg=Message.obtain();
msg.what=3;
msg.arg1=3;
handler.sendMessage(msg);

Handler handler =new Handler(){

		@Override
		public void handleMessage(Message msg) {
			switch(msg.what){
			case 0:
			
				break;
			case 1:
				Intent intent =new Intent(oThis,LoginPage_Sywg.class);
				startActivity(intent); 
				android.os.Process.killProcess(android.os.Process.myPid());   
				oThis.finish();
				handler.removeCallbacks(run);
				break;
			case 2:  //系统错误提示
				showErrorDialog(oThis);
				break;
			case 3:   //跳转到 网页 电邮提示
				createAlertDialog(msg.arg1);
				break;
			case 4:   //拨电话  提示
				crateDialog((String)msg.obj);
				break;
			}
		}
		
	};

17,--------------------------错误提示------------------------------------------------
oldPwd.setError(oldErr);
oldPwd.requestFocus();

18，------------------------------ArrayList<HashMap>使用------------------------------------------
ArrayList<HashMap> list = new ArrayList<HashMap>();  //长度是list.size()
HashMap<String, Object> map=new HashMap<String, Object>();
map.put("bj1", rs.toString("bj1")); // 买1
map.put("sj1", rs.toString("sj1")); // 卖1
myList.add(map);

HashMap<String, Object> map = list.get(position);
String name = map.get("name") + "";

19,------------------------------从Activity带数据到Fragment或两个Fragment之间传数据-------------------------------------
Bundle b=new Bundle();
b.putString("code", code);
b.putString("price", price);
trade= Fragment_trade_trade.newInstance();
trade.setArguments(b);

Bundle b=getArguments() ;
	if(b!=null){
		code = b.getString("code");
	}

20，----------------------------------利用intent从另外的Activity返回数据到原来的界面----------------
startActivityForResult与startActivity的不同之处在于：
1、startActivity( ) 
仅仅是跳转到目标页面，若是想跳回当前页面，则必须再使用一次startActivity( )。
2、startActivityForResult( ) 
可以一次性完成这项任务，当程序执行到这段代码的时候，假若从T1Activity跳转到下一个Text2Activity，而当这个Text2Activity调用了finish()方法以后，程序会自动跳转回T1Activity，并调用前一个T1Activity中的onActivityResult( )方法。

相关函数:
startActivityForResult(Intent intent, Int requestCode)
setResut(int resultCode, Intent intent)
onActivityResult(int requestCode, int resultCode, Intent intent)

Intent intent=new Intent(oThis,Activity_trade_editNumPrice.class);
intent.putExtra("price", stkPrice.getText().toString().trim() );
startActivityForResult(intent, 1);
//记住不要调用finish()去结束当前的界面
需要调用方法：
public void onActivityResult(int requestCode, int resultCode, Intent data) {
		
		//Logger.d("onActivityResult");
		if(data!=null){
			//Logger.d(msg)
			String price = data.getStringExtra("price");
			String num = data.getStringExtra("num");
			stkPrice.setText(price);
			this.price=price ;
			stkNum.setText(num);
		}
	}
编辑返回数据的界面
intent = new Intent();
intent.putExtra("num", numText.getText().toString().trim());
intent.putExtra("price", prices[index]);
setResult(RESULT_OK, intent);

finish();

22,-----------------------------------------intent.setFlags()------------------------------------------------------
Intent.FLAG_ACTIVITY_CLEAR_TOP:如果在当前Task中，有要启动的Activity，那么把该Acitivity之前的所有Activity都关掉，并把此Activity置前以避免创建Activity的实例
23,---------------------------------------------------------------------------------------------------
用adapter显示listview的自动更新方法
有时候我们需要修改已经生成的列表，添加或者修改数据，notifyDataSetChanged()可以在修改适配器绑定的数组后，不用重新刷新Activity，通知Activity更新ListView。

24,---------------------------------------抛异常-------------------------------------------------------------
错误一定要看logcat，才能定位到问题，方可解决问题
就是抛异常，什么找不到对象啊，空指针啊，类型不匹配啊，数组越界等等。

if (!com.eno.net.utils.Logger.DEBUG) {
						enoSystem.setDefault_url(rs[0].toString("default_help_page_url"));
					}

25,------------------------------------真机的屏幕高宽--------------------------------
DisplayMetrics pm = new DisplayMetrics() ;
		getWindowManager().getDefaultDisplay().getMetrics(pm) ;
		heightPx = pm.heightPixels ;
		widthPx = pm.widthPixels ;
与

this.getWindowManager().getDefaultDisplay().getWidth()

WindowManager wm = (WindowManager) context
				.getSystemService(Context.WINDOW_SERVICE);
		DisplayMetrics outMetrics = new DisplayMetrics();
		wm.getDefaultDisplay().getMetrics(outMetrics);
26,-------------------------------------反编译-----------------------------------------
android-sdk-windows\tools\lib\proguard.cfg的内容： 
让proguard.cfg起作用的做法很简单，就是在eclipse自动生成的default.properties文件中加上一句“proguard.config=proguard.cfg”就可以了 


27,--------------------------------------JNI-------------------------------------------------------
可以看到Android上层的Application和ApplicationFramework都是使用Java编写，

底层包括系统和使用众多的LIiraries都是C/C++编写的。

　　所以上层Java要调用底层的C/C++函数库必须通过Java的JNI来实现。

下面将学习Android是如何通过Jni来实现Java对C/C++函数的调用。
28,-------------------------------------%d/手---------------------------------
formatlotSizeDisplay=String.format(lotSizeDisplay, lotSizeNum);//500/手

29,---------------------------------------------------
stkCode.setSelection(stkCode.getText().length()); //EditText中好像可以设置光标在内容的最尾端

30.-------------------------------定时计划执行任务---------------------------------------------
public void startTs(int time) {
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			@Override
			public void run() {
				ENOSystem.getTS_ENOCommServ2().setCommand(new FormatUrl_open(),
						new FormatData());// 发送请求
			}

		}, time);
	}
Timer是一种定时器工具，用来在一个后台线程计划执行指定任务。它可以计划执行一个任务一次或反复多次。
TimerTask一个抽象类，它的子类代表一个可以被Timer计划的任务。
第二个参数表示开始执行前的延时时间
三个参数的第二个参数是开始执行时间，第三个参数是执行的间隔时间

31----------------------------------是用来帮助我们监听某些View的某些变化的--------------------------------------------------------
ViewTreeObserver vto = zh_get_token.getViewTreeObserver();
		vto.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
		{
			public boolean onPreDraw()

32--------------------------------------获取手机号码-------------------------------------------------
TelephonyManager tm =
(TelephonyManager)LoginPage.this.getSystemService(Context.TELEPHONY_SERVICE);
String imei = tm.getDeviceId();
tel = tm.getLine1Number();
Log.v("tel-------------------"," "+tel);

33-----------------------------------定时做一些操作-------------------------------------------
runnable = new Runnable() {

				public void run() {
					// TODO Auto-generated method stub
					// 要做的事情

					handler.postDelayed(this, autoRequestTime);

					timingUpdate();

				}
			};
			// 2.啟動計時器：
			handler.postDelayed(runnable, autoRequestTime);// 每兩秒執行一次runnable.
			// 3.停止計時器：
			// handler.removeCallbacks(runnable);

34-------------------------------------判断字符----------------------------------------------
Character.isDigit()判断否是数字字符 即'0'~'9'

35----------------------------------------------------------------------------------------
获取string.xml文件里面的值有几个不同的地方。
1.在AndroidManifest.xml与layout等xml文件里:
android:text="@string/resource_name" 
  
2.在activity里：
方法一:this.getString(R.string.resource_name);  
方法二:getResources().getString(R.string.resource_name); 
 
3.在其他java文件（必须有Context或pplication）
方法一: context.getString(R.string.resource_name); 
方法二: application.getString(R.string.resource_name);  
36----------------------------------------------------------布局填充及动态添加布局元素----------------
View view = LayoutInflater.from(oThis).inflate(R.layout.fragment_trade_msg, null);

37----------------------------------------------------------------------------------------
数组：	String[] array=new String[3]
	String[] array={1,2,3}
	array[i]

列表list:
	ArrayList<AccTrade> accArray =new ArrayList<AccTrade>()
	if(!accArray.contains(acc)){
		accArray.add(acc) ;
	}
	accArray.get(index) ;

map://键值对
	GTDTimeMap.size()
	GTDTimeMap.put(market, gTDTime) ;
	GTDTimeMap.get(market);

Activity数据传递：//键值对
	Intent intent = new Intent(oThis,Activity_a_hq_fsKx.class);
	intent.putExtra("code", 123456);
	startActivity(intent);
	oThis.finish();

	String code = getIntent().getStringExtra("code");

Fragment数据传递：//键值对
	Bundle b=new Bundle();
	b.putString("code", code);
	trade.setArguments(b);

	Bundle b=getArguments() ;
	code = b.getString("code");

Bundle://键值对
	Bundle b=new Bundle();
	b.putString("code", code);
	code = b.getString("code");

editor://键值对
	editor.putString(ENO_Constant.BrokerData.ISTEST, "0");
	isTest=sp.getString(ENO_Constant.BrokerData.ISTEST, "");


40================================drawel按钮的两种状态切换===================================================
<?xml version="1.0" encoding="utf-8"?>
<selector xmlns:android="http://schemas.android.com/apk/res/android" >

      <item android:state_checked="false" 
        android:drawable="@drawable/log_unchecked"></item>
    <item android:state_checked="true" 
        android:drawable="@drawable/log_checked"></item>

</selector>

41.========================================枚举enum=====================================================
ordinal()，返回成员的声明顺序编号，这是一个整数，值从0开始编号，
另一个方法叫做name()，返回枚举成员的名称。

枚举类型可以直接用于switch语句，这个功能看起来是突破了Java中switch只能用于整数和字符的限制，不过其实是Java编译器的障眼法，Java编译器会自动在枚举成员上调用ordinal()方法，如果像遍历Weekday，那么可以使用它隐含的静态方法values()，
枚举类型本质上其实就是一个类，枚举中的常量都是该枚举类型的实例
enum Weekday {   
    SUNDAY("SUN"),    
    MONDAY("MON"),    
  
    private String abbr;   
  
    public Weekday(String abbr) {   
        this.abbr = abbr;   
    }   
  
    public getAbbreviation() {   
        return abbr;   
    }    
} 这个构造函数是不能通过new语句调用的，不过可以在声明常量的时候进行调用，只要要常量后面加上括号并传递参数进去就可以了，这样不同的常量对象都有了不同的属性值，这个值存储在字段abbr中。另外这个枚举类型还定义了方法，在获得了对某个常量的引用后，就可以调用它的getAbbreviation()方法 


42=========================================转打电话页面========================================================================
String telphone = "+"+AePhone.getText().toString().trim();
				Intent intent =new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+telphone));
				startActivity(intent);

43=================SparseArray<E>替代Hashmap<Interger,Object>==仅仅是代替int类型的hashmap========================================================

翻译过来就是：用SparseArray<E>来代替会有更好性能。
那我们就来看看源码中SparseArray到底做了哪些事情：

一、构造
从构造方法我们可以看出，它和一般的List一样，可以预先设置容器大小，默认的大小是10：
[java] view plaincopy
public SparseArray() {  
    this(10);  
}  
  
  
public SparseArray(int initialCapacity) {  
    ......  
}  


二、增
它有两个方法可以添加键值对：
[java] view plaincopy
public void put(int key, E value)  
public void append(int key, E value)   



在存储数据的时候，是采用了二分法方式，以下是它采用二分法的源码：
[java] view plaincopy
private static int binarySearch(int[] a, int start, int len, int key) {  
    int high = start + len;  
    int low = start - 1;  
  
  
    while (high - low > 1) {  
        int guess = (high + low) / 2;  
  
  
        if (a[guess] < key) {  
            low = guess;  
            continue;  
        }  
        high = guess;  
    }  
  
  
    if (high == start + len)  
        return start + len ^ 0xFFFFFFFF;  
    if (a[high] == key) {  
        return high;  
    }  
    return high ^ 0xFFFFFFFF;  
}  



所以，它存储的数值都是按键值从小到大的顺序排列好的。


三、查
它有两个方法可以取值：
[java] view plaincopy
public E get(int key)  
public E get(int key, E valueIfKeyNotFound)  
最后一个从传参的变量名就能看出，传入的是找不到的时候返回的值


查看第几个位置的键：
[java] view plaincopy
public int keyAt(int index)  
查看第几个位置的值：
[java] view plaincopy
public E valueAt(int index)  
查看键所在位置，由于采用二分法查找键的位置，所以没有的话返回小于0的数值，而不是返回-1，这点要注意，返回的负数其实是表示它在哪个位置就找不到了，如果你存了5个，查找的键大于5个值的话，返回就是-6：
[java] view plaincopy
public int indexOfKey(int key)  
查看值所在位置，没有的话返回-1：
[java] view plaincopy
public int indexOfValue(E value)  


四、删
它有四个方法：
[java] view plaincopy
public void delete(int key)  
public void remove(int key)  

但其实，delete和remove的效果是一样的，remove方法中调用了delete方法，remove源码：

[java] view plaincopy
public void remove(int key) {  
        delete(key);  
    }  


[java] view plaincopy
public void removeAt(int index)  
public void clear()  

最后一个就是清除全部


五、改
[java] view plaincopy
public void setValueAt(int index, E value)  
public void put(int key, E value)  

put方法还可以修改键值对，注意：如果键不存在，就会变为添加新键值对


六、其他：
SparseArray实现了Cloneable接口，还可以调用clone方法。


小结：既然android系统建议我们用SparseArray<E>来代替HashMap<Integer, E>，那我们还是按它说的做吧。里面的一些方法，我在这里也已经剖析清楚了，希望能对你们有所帮助

44==============================================Vector 实现List===============================================
首先看这两类都实现List接口，而List接口一共有三个实现类，分别是ArrayList、Vector和LinkedList。List用于存放多个元素，能够维护元素的次序，并且允许元素的重复。3个具体实现类的相关区别如下：

ArrayList是最常用的List实现类，内部是通过数组实现的，它允许对元素进行快速随机访问。数组的缺点是每个元素之间不能有间隔，当数组大小不满足时需要增加存储能力，就要讲已经有数组的数据复制到新的存储空间中。当从ArrayList的中间位置插入或者删除元素时，需要对数组进行复制、移动、代价比较高。因此，它适合随机查找和遍历，不适合插入和删除。
Vector与ArrayList一样，也是通过数组实现的，不同的是它支持线程的同步，即某一时刻只有一个线程能够写Vector，避免多线程同时写而引起的不一致性，但实现同步需要很高的花费，因此，访问它比访问ArrayList慢。
LinkedList是用链表结构存储数据的，很适合数据的动态插入和删除，随机访问和遍历速度比较慢。另外，他还提供了List接口中没有定义的方法，专门用于操作表头和表尾元素，可以当作堆栈、队列和双向队列使用。

ArrayList在内存不够时默认是扩展50% + 1个，Vector是默认扩展1倍。
Vector提供indexOf(obj, start)接口，ArrayList没有。
Vector属于线程安全级别的，但是大多数情况下不使用Vector，因为线程安全需要更大的系统开销。



45=========================================Iterator ====================================================
Iterator it = collection.iterator(); // 获得一个迭代子
while(it.hasNext()) {
Object obj = it.next(); // 得到下一个元素
}



46====================================Collections============================
我们都知道，Java中常用的集合框架中的实现类HashSet、TreeSet、ArrayList、ArrayDeque、LinkedList、HashMap、TreeMap都是线程不安全的，如果有多个线程同时访问它们，且同时有多个线程修改他们的时候，将会出现如读脏数据等错误。Collections提供了synchronizedXxx()方法来帮助其实现线程安全

static Collection cl = Collections.synchronizedCollection(new ArrayList());
static List list = Collections.synchronizedList(new ArrayList());
static Set set = Collections.synchronizedSet(new HashSet());
static Map map = Collections.synchronizedMap(new HashMap());

排序
Collections.sort(mHashMapEntryList, new 
Comparator>() {
　　@Override
　　public int compare(Map.Entry firstMapEntry,
　　Map.Entry secondMapEntry) {
　　return firstMapEntry.getKey().compareTo(secondMapEntry.getKey());
　　}
　　});

随机打乱顺序
 Collections.shuffle(list); 

47,================================RecyclerView=====================================
 <android.support.v7.widget.RecyclerView  
        android:id="@+id/recyclerView"  
        android:layout_width="wrap_content"  
        android:layout_height="wrap_content"/>  

然后需要开发者在代码中实现RecyclerView的组装，大体可概括为以下步骤：
实例化RecyclerView
为RecyclerView设置LayoutManager
为RecyclerView设置Adapater
如果有需求，可以设置一个或多个ItemDecorations，当然，也可以不设置
如果有需求，可以设置ItemAnimator


类名
说明
RecyclerView.Adapter

托管数据集合，为每个Item创建视图

RecyclerView.ViewHolder	承载Item视图的子视图
RecyclerView.LayoutManager	负责Item视图的布局
RecyclerView.ItemDecoration	为每个Item视图添加子视图，在Demo中被用来绘制Divider
RecyclerView.ItemAnimator	负责添加、删除数据时的动画效果


RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
recyclerView.setHasFixedSize(true);
recyclerView.setAdapter(new MyRecyclerAdapter(createMockList(), R.layout.item));
recyclerView.setLayoutManager(new LinearLayoutManager(this));
recyclerView.setItemAnimator(new DefaultItemAnimator());
setHasFixedSize()方法用来使RecyclerView保持固定的大小，该信息被用于自身的优化。

======================================onTouchEvent事件===========================================================
public boolean onTouchEvent(MotionEvent event) {

		// 获得触摸的坐标
		//float x = event.getX();
		//float y = event.getY();
		// 获得触摸的坐标

		switch (event.getAction()) {
		// 触摸屏幕时刻
		case MotionEvent.ACTION_DOWN:
		break;
			// 触摸并移动时刻
		case MotionEvent.ACTION_MOVE:

			setTouchCursorLine(event);
			invalidate();

			break;
			// 终止触摸时刻
		case MotionEvent.ACTION_UP:

			break;
		}

		// mGestureDetector.onTouchEvent(event);

		return true;
	}
===========================================Parcelable和Serializable的区别:=======================================================
 Parcelable和Serializable的区别:
 * 内存间数据传输时推荐使用Parcelable,如activity间传输数据

 * 保存到本地或者网络传输时推荐使用Serializable

==================================数组=========================================
private String[] texts;
private final String[] tab={"自选","指数","沪深","板块","港股","沪港通"};

texts=new String[]{};
texts=new String[5];
this.texts = new String[]{"1","2","3"};

================================保存数据==============================================
1、通过Context.getExternalFilesDir()方法可以获取到 SDCard/Android/data/你的应用的包名/files/ 目录，一般放一些长时间保存的数据
通过Context.getExternalCacheDir()方法可以获取到 SDCard/Android/data/你的应用包名/cache/目录，一般存放临时缓存数据

2、Context.getFilesDir()可以获取到"/data/data/<package name>/files" 这个方法获取的目录不是在sdcard上，而是在应用安装的目录

Context.getCacheDir可以获取到"/data/data/<package name>/cache" 这个方法获取的目录不是在sdcard上，而是在应用安装的目录，这个文件里面的数据在设备内存不足的时候，会被系统删除数据。注意：你不能依赖系统帮你删除这些文件，当这个文件夹里面的数据超过1MB的时候，系统会删除这个文件夹里面的数据。

缓存没有写到sd卡上，写到手机内存的/data/data/net.oschina.app/files/目录下了。 

缓存是在手机内存中的数据，清除之后手机可能运行就快了。
清理数据清除的是应用软件残留在手机存储卡里的数据，清除后手机存储卡容量变大

========================================动态设置高宽，相对布局对齐方式==============================================
RelativeLayout.LayoutParams params =  new RelativeLayout.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
params.addRule(RelativeLayout.CENTER_IN_PARENT);
layout.addView(view, params);
layout.setLayoutParams(params);

refresh.getLayoutParams().height

==========================================android arrts文件===================================================
android arrts文件中定义了控件的所有属性以及所用控件的声明

android style 对所有控件的属性值进行了设定
1:
<declare-styleable name="custom">
		<attr name="arrayId" format="reference" />
		<attr name="width" format="integer" />
</declare-styleable>
2:
TypedArray a=context.obtainStyledAttributes(attrs,R.styleable.custom);  
	arrayId=a.getResourceId(R.styleable.custom_arrayId, 0);
	mwidth=a.getInt(R.styleable.custom_width, 0);
3:
<com.eno.selfview.TabSwitcher
            xmlns:app="http://schemas.android.com/apk/res/com.eno.page"
            android:id="@+id/tabSwitcher"
           
            app:width="50"
            app:arrayId="@array/fskx_news"
            />

====================================主题Theme===============================================
 
?android:theme="@android:style/Theme.Dialog"   将一个Activity显示为能话框模式
?android:theme="@android:style/Theme.NoTitleBar"  不显示应用程序标题栏
?android:theme="@android:style/Theme.NoTitleBar.Fullscreen"  不显示应用程序标题栏，并全屏
?android:theme="Theme.Light"  背景为白色
?android:theme="Theme.Light.NoTitleBar"  白色背景并无标题栏
?android:theme="Theme.Light.NoTitleBar.Fullscreen"  白色背景，无标题栏，全屏
?android:theme="Theme.Black"  背景黑色
?android:theme="Theme.Black.NoTitleBar"  黑色背景并无标题栏
?android:theme="Theme.Black.NoTitleBar.Fullscreen"    黑色背景，无标题栏，全屏
?android:theme="Theme.Wallpaper"  用系统桌面为应用程序背景
?android:theme="Theme.Wallpaper.NoTitleBar"  用系统桌面为应用程序背景，且无标题栏
?android:theme="Theme.Wallpaper.NoTitleBar.Fullscreen"  用系统桌面为应用程序背景，无标题栏，全屏
?android:theme="Translucent"  半透明
?android:theme="Theme.Translucent.NoTitleBar" 半透明、无标题栏
?android:theme="Theme.Translucent.NoTitleBar.Fullscreen" 半透明、无标题栏、全屏
?android:theme="Theme.Panel"
?android:theme="Theme.Light.Panel"
 
 
 
 
这些主题可以应用到整个应用Application范围或者某个活动Activity范围中。

应用Application范围
在AndroidManifest.xml中的application节点中设置theme属性，主题theme应用到整个应用程序中。
<application
    Android:icon=”@drawable/icon”
    Android:icon=”@string/app_name”
    Android:icon=”@android:style/ Theme.Black.NoTitleBar”>

活动Activity范围
使用java代码或者在AndroidManifest.xml中对活动Activity的主题进行设置，主题仅应用到当前活动中。
在AndroidMainifest.xml设置方法：
<activity
android:name=“.About”
android:label=“@string/app_name”
android:theme=“@android:style/ Theme.Black.NoTitleBar” >

使用java代码进行设置，在当前活动Activity的onCreate中进行设置：
@Override
public void onCreate(Bundle savedInstanceState){
super.onCreate(savedInstanceState);
setTheme(android.R.style.Theme_Translucent_NoTitleBar);
setContentView(R.layout.main);
}

===========================================获取版本号=========================================

versionCode = this.getPackageManager().getPackageInfo("com.eno.page", 0).versionCode;

versionName = getPackageManager().getPackageInfo("com.eno.page", 0).versionName;

===============================================各种adapter===============================================

GTDAdapter = new ArrayAdapter<String>(oThis, R.layout.spinner_single_text_view,GTDDisplay);
GTDAdapter.setDropDownViewResource(R.layout.spinner_dialog_single_select);
GTD_spinner.setAdapter(GTDAdapter);

 adapter = new SimpleAdapter(ListOnLongClickActivity.this, 
                                getListData(), R.layout.listviewrow, new String[] { "name", 
                                                "price" }, new int[] { R.id.tv_name, R.id.tv_price }); 
                mListView.setAdapter(adapter); 
=========================================================================================线程使用===============
ArrayList和Vector都是使用数组方式存储数据

区别大概就是Vector本身所有方法都是用synchronized修饰的，所以线程安全，而ArrayList没有

还有一个区别就是新增元素的时候Vector的增量是原来的一倍，而ArrayList增加原来的一半


TtableView.mCoverView1.post(new Runnable() { 
			       public void run() { 
			    	   TtableView.mCoverView1.fullScroll(TtableView.mCoverView1.FOCUS_RIGHT); 	    	   
			       } 		 
			});

==========================================================================================抛异常==========
try{

} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
}
		}

========================================================================================Android Activity和Fragment的转场动画=================

Activity转场动画
　　Activity的转场动画是通过overridePendingTransition(int enterAnim, int exitAnim)实现的。
这个方法在startActivity(Intent) or finish()之后被调用，指定接下来的这个转场动画。

　　方法的第一个参数：enterAnim，是新的Activity的进入动画的resource ID；

　　第二个参数exitAnim，是旧的Activity(当前的Activity)离开动画的resource ID。

　　所以这两个参数的对象是两个Activity。　　

　　如果上面两个参数没有动画要设置，则用0作为参数。

　　动画的资源文件放在res\anim\目录下，是View Animation。
<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android">
    <translate android:fromYDelta="100%p" android:toYDelta="0"
            android:duration="2000"/>
    <alpha android:fromAlpha="0.0" android:toAlpha="1.0"
            android:duration="2000" />
</set>
Fragment转场动画
　　Fragment的转场动画实现分为使用v4包和不使用v4包两种情况，不使用v4包的话，最低API Level需要是11。

标准转场动画：
　　可以给Fragment指定标准的转场动画，通过setTransition(int transit)方法。

　　该方法可传入的三个参数是：

　　TRANSIT_NONE,

　　TRANSIT_FRAGMENT_OPEN,

　　TRANSIT_FRAGMENT_CLOSE

　　分别对应无动画、打开形式的动画和关闭形式的动画。

　　标准动画设置好后，在Fragment添加和移除的时候都会有。

自定义转场动画
　　自定义转场动画是通过setCustomAnimations()方法，因为Fragment添加时可以指定加入到Back Stack中，所以转场动画有添加、移除、从Back stack中pop出来，还有进入四种情况。

　　注意setCustomAnimations()方法必须在add、remove、replace调用之前被设置，否则不起作用。

===============================================================================================调整android dialog对话框显示位置===========


menuDialog = new AlertDialog.Builder(this).create();  
 Window mWindow = menuDialog.getWindow();     
 WindowManager.LayoutParams lp = mWindow.getAttributes();     
  lp.x = 10;   //新位置X坐标  
 lp.y = 120; //新位置Y坐标  
menuDialog.onWindowAttributesChanged(lp);   
menuDialog.show(); 

=====================================================================================SharedPreferences 用法================

private SharedPreferences sp;
private SharedPreferences.Editor editor;

sp=oThis.getSharedPreferences(ENO_Constant.BrokerData.ENO_BROKER_DATA,Context.MODE_PRIVATE);
editor=sp.edit();

marketsposition=sp.getInt("trade_pos", 0)

editor.putInt("accNumId", num);
editor.commit();

===============================================================================

注：\n 回车(\u000a)   

\t 水平制表符(\u0009)   

\s 空格(\u0008)   

\r 换行(\u000d)*/

=============================================================================横屏竖屏======================

Configuration newConfig = getResources().getConfiguration();
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
			// 横屏
			view =inflater.inflate(R.layout.fragment_setting, null); 
		} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			// 竖屏
			view =inflater.inflate(R.layout.fragment_hq, null); 
		}


@Override 
	public void onConfigurationChanged(Configuration newConfig) {	 
		super.onConfigurationChanged(newConfig); 
		// 检测屏幕的方向：纵向或横向 
		if (this.getResources().getConfiguration().orientation  
				== Configuration.ORIENTATION_LANDSCAPE) { 
			//当前为横屏， 在此处添加额外的处理代码 
		} 
		else if (this.getResources().getConfiguration().orientation  
				== Configuration.ORIENTATION_PORTRAIT) { 
			//当前为竖屏， 在此处添加额外的处理代码 
		} 
		//检测实体键盘的状态：推出或者合上     
		if (newConfig.hardKeyboardHidden  
				== Configuration.HARDKEYBOARDHIDDEN_NO){  
			//实体键盘处于推出状态，在此处添加额外的处理代码 
		}  
		else if (newConfig.hardKeyboardHidden 
				== Configuration.HARDKEYBOARDHIDDEN_YES){  
			//实体键盘处于合上状态，在此处添加额外的处理代码 
		} 
	}

MainActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

关于Android中Activity的横竖屏切换问题可以通过AndroidManifest.xml文件中的Activity来配置：
android:screenOrientation=["unspecified" | "user" | "behind" |
"landscape" | "portrait" | 
"sensor" | "nonsensor"]
screenOrientation 用来指定Activity的在设备上显示的方向，每个值代表如下含义：
"unspecified"	默认值 由系统来判断显示方向.判定的策略是和设备相关的，所以不同的设备会有不同的显示方向.
"landscape"	横屏显示（宽比高要长）
"portrait"	竖屏显示(高比宽要长)
 
"user"	用户当前首选的方向
"behind"	和该Activity下面的那个Activity的方向一致(在Activity堆栈中的)
"sensor"	有物理的感应器来决定。如果用户旋转设备这屏幕会横竖屏切换。
"nosensor"	忽略物理感应器，这样就不会随着用户旋转设备而更改了 （ "unspecified"设置除外 ）。

android:configChanges="orientation|keyboardHidden|screenSize"  一定要加上screenSize才有用


=================================================WebView=============================================================

webView.loadUrl("http://baidu.com");
webview.loadUrl("file:///android_asset/liebiao.html");//加载本地html

//覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
webView.setWebViewClient(new WebViewClient(){
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
	 // TODO Auto-generated method stub
	      //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
	      view.loadUrl(url);
	      return true;
	 }
});
//启用支持javascript
WebSettings settings = webView.getSettings();
settings.setJavaScriptEnabled(true);//在webview添加对js的支持
setting.setDefaultTextEncodingName("GBK");//设置字符编码 

webView.setScrollBarStyle(0);//滚动条风格，为0指滚动条不占用空间，直接覆盖在网页上  

addJavascriptInterface(new InJavaScriptLocalObj(),"eno");//js调用的本地代码放这里

android如何调用js。
mWebView.loadUrl("javascript:wave()");

js如何调用android。
<a onClick="window.demo.clickOnAndroid()">
代码中的“demo”是在android中指定的调用名称，即

 mWebView.addJavascriptInterface(new DemoJavaScriptInterface(), "demo");
代码中的clickOnAndroid()是“demo”对应的对象：new DemoJavaScriptInterface() 中的一个方法。

setWebViewClient和setWebChromeClient的作用：前者主要用于处理webView的控制问题，如加载、关闭、错误处理等；后者主要处理js对话框、图标、页面标题等。

============================================================================

listView.setCacheColorHint(0); 或者android:cacheColorHint="#00000000" 去除listview的拖动背景色


=======================================================================
drawable-mdpi:   48X48 
drawable-hdpi:   72X72
drawable-xhdpi:  96X96
drawable-xxhdpi: 144X144

==============================================instanceof =======================

if (context instanceof Activity) {  
    Log.i(LOGTAG, "Callback Activity...");  
    Activity callbackActivity = (Activity) context;  
    callbackActivityPackageName = callbackActivity.getPackageName();  
    callbackActivityClassName = callbackActivity.getClass().getName();  
}  
他是java里面的二元运算符，判断左边的对象是否是右边类的实例。假如是的话，返回true；假如不是的话，返回false。

上面那个if判断里面的意思是：context对象是否来自actvity。android里面context还可能代表application和service。

==============================================================synchronized =======================

双重检查加锁
使用双重检查加锁，首先进入该方法时进行null == sInstance检查，如果第一次检查通过，即没有实例创建，则进入synchronized控制的同步块,并再次检查实例是否创建，如果仍未创建，则创建该实例。

双重检查加锁保证了多线程下只创建一个实例，并且加锁代码块只在实例创建的之前进行同步。如果实例已经创建后，进入该方法，则不会执行到同步块的代码。

public class SingleInstance {
  private static volatile SingleInstance sInstance;
  private SingleInstance() {
  }
   
  public static SingleInstance getInstance() {
      if (null == sInstance) {
          synchronized (SingleInstance.class) {
              if (null == sInstance) {
                  sInstance = new SingleInstance();
              }
          }
      }
      return sInstance;
  }
}
volatile是什么

Volatile是轻量级的synchronized，它在多处理器开发中保证了共享变量的“可见性”。可见性的意思是当一个线程修改一个共享变量 时，另外一个线程能读到这个修改的值。使用volatile修饰sInstance变量之后，可以确保多个线程之间正确处理sInstance变量。
关于volatile，可以访问深入分析Volatile的实现原理了解更多。

=====================================================================
public boolean dispatchTouchEvent(MotionEvent ev)	事件分发 
public boolean onInterceptTouchEvent(MotionEvent ev)    事件拦截 
public boolean onTouchEvent(MotionEvent ev)	事件响应 

事件分发：public boolean dispatchTouchEvent(MotionEvent ev)

Touch 事件发生时 Activity 的 dispatchTouchEvent(MotionEvent ev) 方法会以隧道方式（从根元素依次往下传递直到最内层子元素或在中间某一元素中由于某一条件停止传递）将事件传递给最外层 View 的 dispatchTouchEvent(MotionEvent ev) 方法，并由该 View 的 dispatchTouchEvent(MotionEvent ev) 方法对事件进行分发。dispatchTouchEvent 的事件分发逻辑如下：

如果 return true，事件会分发给当前 View 并由 dispatchTouchEvent 方法进行消费，同时事件会停止向下传递；
如果 return false，事件分发分为两种情况：
如果当前 View 获取的事件直接来自 Activity，则会将事件返回给 Activity 的 onTouchEvent 进行消费；
如果当前 View 获取的事件来自外层父控件，则会将事件返回给父 View 的  onTouchEvent 进行消费。
如果返回系统默认的 super.dispatchTouchEvent(ev)，事件会自动的分发给当前 View 的 onInterceptTouchEvent 方法。
? 事件拦截：public boolean onInterceptTouchEvent(MotionEvent ev) 

在外层 View 的 dispatchTouchEvent(MotionEvent ev) 方法返回系统默认的 super.dispatchTouchEvent(ev) 情况下，事件会自动的分发给当前 View 的 onInterceptTouchEvent 方法。onInterceptTouchEvent 的事件拦截逻辑如下：

如果 onInterceptTouchEvent 返回 true，则表示将事件进行拦截，并将拦截到的事件交由当前 View 的 onTouchEvent 进行处理；
如果 onInterceptTouchEvent 返回 false，则表示将事件放行，当前 View 上的事件会被传递到子 View 上，再由子 View 的 dispatchTouchEvent 来开始这个事件的分发；
如果 onInterceptTouchEvent 返回 super.onInterceptTouchEvent(ev)，事件默认会被拦截，并将拦截到的事件交由当前 View 的 onTouchEvent 进行处理。
? 事件响应：public boolean onTouchEvent(MotionEvent ev)

在 dispatchTouchEvent 返回 super.dispatchTouchEvent(ev) 并且 onInterceptTouchEvent 返回 true 或返回 super.onInterceptTouchEvent(ev) 的情况下 onTouchEvent 会被调用。onTouchEvent 的事件响应逻辑如下：

如果事件传递到当前 View 的 onTouchEvent 方法，而该方法返回了 false，那么这个事件会从当前 View 向上传递，并且都是由上层 View 的 onTouchEvent 来接收，如果传递到上面的 onTouchEvent 也返回 false，这个事件就会“消失”，而且接收不到下一次事件。
如果返回了 true 则会接收并消费该事件。
如果返回 super.onTouchEvent(ev) 默认处理事件的逻辑和返回 false 时相同。


=======================================================onCreate中获取控件宽度为0的解决=========

//-----------------------------------------------方法三     
ViewTreeObserver vto2 = imageView.getViewTreeObserver();    
vto2.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {  
    @Override    
    public void onGlobalLayout() {  
        imageView.getViewTreeObserver().removeGlobalOnLayoutListener(this);    
        textView.append("\n\n"+imageView.getHeight()+","+imageView.getWidth());  
    }    
});    

=============================================================================================
Android中如何从一个Activity中ArrayList<HashMap<String,Object>>传递到另一个activity？

如：
存：intent.putExtra("arrayList", dataList);
取：
ArrayList<HashMap<String, Object>> dataList = new ArrayList<HashMap<String, Object>>(); 
dataList = (ArrayList<HashMap<String, Object>>) getIntent().getSerializableExtra("arrayList");

=====================================================界面切换动画方式=========================
Activity：
Intent intent = new Intent();
                intent.setClass(LeftRightSlideActivity.this, SlideSecondActivity.class);
                startActivity(intent);
                //设置切换动画，从右边进入，左边退出
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);

overridePendingTransition 方法必须在startActivity()或者 finish()方法的后面。

Fragment：
标准转场动画：
　　可以给Fragment指定标准的转场动画，通过setTransition(int transit)方法。

　　该方法可传入的三个参数是：

　　TRANSIT_NONE,

　　TRANSIT_FRAGMENT_OPEN,

　　TRANSIT_FRAGMENT_CLOSE

　　分别对应无动画、打开形式的动画和关闭形式的动画。

　　标准动画设置好后，在Fragment添加和移除的时候都会有。

自定义转场动画
　　自定义转场动画是通过setCustomAnimations()方法，因为Fragment添加时可以指定加入到Back Stack中，所以转场动画有添加、移除、从Back stack中pop出来，还有进入四种情况。

　　注意setCustomAnimations()方法必须在add、remove、replace调用之前被设置，否则不起作用。
===========================================================================================

android:descendantFocusability
复制代码

　　该属性是当一个为view获取焦点时，定义viewGroup和其子控件两者之间的关系。

　　属性的值有三种：

　　beforeDescendants：viewgroup会优先其子类控件而获取到焦点

　　afterDescendants：viewgroup只有当其子类控件不需要获取焦点时才获取焦点

　　blocksDescendants：viewgroup会覆盖子类控件而直接获得焦点

　　通常我们用到的是第三种，即在Item布局的根布局加上android:descendantFocusability=”blocksDescendants”的属性就好了。

================================================================Android View.post(Runnable )=================
Handler mHandler=new Handler(); 
     mHandler.post(new Runnable(){ 
        @Override public void run() 
        { // TODO Auto-generated method stub 
         } 
     });
view.post()方法内会创建一个handler，并调用handler.post()
上面所述两种方法，分别是Thread方法，和TimerTask方法。在Java中是常用的，因为线程安全。但是在单线程模型的android中，是不能用的。正确的方法有2个。

1.Thread+handler

2.TimerTask+handler

3.Runnable+Handler.postDelayed(runnable,time)
记住，处理都是在handleMessage里面

Android中实现view的更新有两组方法，一组是invalidate，另一组是postInvalidate，其中前者是在UI线程自身中使用，而后者在非UI线程中使用

==================================================================BigDecimal================================

用来对超过16位有效位的数进行精确的运算。双精度浮点型变量double可以处理16位有效数

 NumberFormat currency = NumberFormat.getCurrencyInstance(); //建立货币格式化引用 
    NumberFormat percent = NumberFormat.getPercentInstance();  //建立百分比格式化引用 
    percent.setMaximumFractionDigits(3); //百分比小数点最多3位 
    
    BigDecimal loanAmount = new BigDecimal("15000.48"); //贷款金额 ￥15,000.48
    BigDecimal interestRate = new BigDecimal("0.008"); //利率 0.8%

BigDecimal aDouble =new BigDecimal(1.22);
        1.2199999999999999733546474089962430298328399658203125
BigDecimal aString = new BigDecimal("1.22");
	1.22
String 构造方法是完全可预知的,通常建议优先使用String构造方法

==============================================================================Base64=====================

Base64编码要求把3个8位字节（3*8=24）转化为4个6位的字节（4*6=24），之后在6位的前面补两个0，形成8位一个字节的形式。 如果剩下的字符不足3个字节，则用0填充，输出字符使用'='，因此编码后输出的文本末尾可能会出现1或2个'='。

===========================================使页面一进来编辑框不获取焦点================================
在编辑框前面加一个linerlayout,加以下两个属性
android:focusable="true"
android:focusableInTouchMode="true" 

====================================================byte ===========================================
1、字节数组转换为字符串
byte[] byBuffer = new byte[20];
... ...
String strRead = new String(byBuffer);
strRead = String.copyValueOf(strRead.toCharArray(), 0, byBuffer.length]);
2、字符串转换成字节数组
byte[] byBuffer = new byte[200];
String strInput="abcdefg";
byBuffer= strInput.getBytes();
注意：如果字符串里面含有中文，要特别注意，在android系统下，默认是UTF8编码，一个中文字符相当于3个字节，只有gb2312下一个中文相当于2字节。这种情况下可采取以下办法：
byte[] byBuffer = new byte[200];
String strInput="我是字符串";
byBuffer= strInput.getBytes("gb2312");

========================================================打电话，开网页===========================================
补充，使用Intent.ACTION_CALL时，必须在AndroidManifest.xml中添加<uses-permission android:name="android.permission.CALL_PHONE" />已获取拨打电话的权限。Intent.ACTION_CALL与Intent.ACTION_DIALOG不同，Intent.ACTION_DIALOG只是调用拨号键盘，将电话号码复制上去，而Intent.ACTION_CALL则是直接拨打电话

2 Intent.Action_CALL

呼叫指定的电话号码。

Input:电话号码。数据格式为：tel:+phone number 

Intent intent=new Intent(); 
intent.setAction(Intent.ACTION_CALL);   
intent.setData(Uri.parse("tel:1320010001");
startActivity(intent);

3 Intent.Action.DIAL

调用拨号面板

Intent intent=new Intent();
intent.setAction(Intent.ACTION_DIAL);   //android.intent.action.DIAL
intent.setData(Uri.parse("tel:1320010001");
startActivity(intent); 


11 Intent.ACTION_VIEW

用于显示用户的数据。

比较通用，会根据用户的数据类型打开相应的Activity。

比如 tel:13400010001打开拨号程序，http://www.g.cn则会打开浏览器等。

	 
Uri uri = Uri.parse("http://www.google.com"); //浏览器 
Uri uri =Uri.parse("tel:1232333"); //拨号程序 
Uri uri=Uri.parse("geo:39.899533,116.036476"); //打开地图定位 
Intent it = new Intent(Intent.ACTION_VIEW,uri); 
startActivity(it); 


//播放视频 
Intent intent = new Intent(Intent.ACTION_VIEW); 
Uri uri = Uri.parse("file:///sdcard/media.mp4"); 
intent.setDataAndType(uri, "video/*"); 
startActivity(intent);

//调用发送短信的程序 
Intent it = new Intent(Intent.ACTION_VIEW);
it.putExtra("sms_body", "信息内容..."); 
it.setType("vnd.android-dir/mms-sms"); 
startActivity(it);

==========================================Math方法=========================
Math.max()
Math.min()
Math.abs(-10.4) abs求绝对值
Math.ceil(-10.1)ceil天花板的意思，就是返回大的值，注意一些特殊值 
Math.floor(-10.1)floor地板的意思，就是返回小的值
Math.random()random 取得一个大于或者等于0.0小于不等于1.0的随机数 
Math.rint(10.1)rint 四舍五入，返回double值 * 注意.5的时候会取偶数 
Math.round(10.1)round 四舍五入，float时返回int值，double时返回long值

====================================================计时组件使用TimeCount======================
TimeCount timeCount = new TimeCount(60000, 1000);
class TimeCount extends CountDownTimer {
        public TimeCount(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        public void onFinish() {
            btn_reget_captcha.setText("发送激活码");
            btn_reget_captcha.setClickable(true);
        }

        public void onTick(long millisUntilFinished) {
            btn_reget_captcha.setClickable(false);
            btn_reget_captcha.setText("在" + millisUntilFinished / 1000 + "秒后点击重发激活码");
        }
    }

==============================Android开发中完全退出程序的三种方法==============

1. Dalvik VM的本地方法

　　android.os.Process.killProcess(android.os.Process.myPid());
　　获取PID，目前获取自己的也只有该API，否则从/proc中自己的枚举其他进程吧，不过要说明的是，结束其他进程不一定有权限，不然就乱套了。
　　System.exit(0);
　　常规java、c#的标准退出法，返回值为0代表正常退出

2. 任务管理器方法

　　首先要说明该方法运行在Android 1.5 API Level为3以上才可以，同时需要权限android.permission.RESTART_PACKAGES，我们直接结束自己的package即可，直接使用ActivityManager类的restartPackage方法即可，参数为package name，该类通过getSystemService(Context.ACTIVITY_SERVICE)来实例化ActivityManager对象，这种方法系统提供的，但需要显示声明权限，所以使用中需要综合考虑。

3. 根据Activity的声明周期

　　我们知道Android的窗口类提供了历史栈，我们可以通过stack的原理来巧妙的实现，这里我们在A窗口打开B窗口时在Intent中直接加入标志Intent.FLAG_ACTIVITY_CLEAR_TOP，这样开启B时将会清除该进程空间的所有Activity。

　　在A窗口中使用下面的代码调用B窗口
　　Intent intent = new Intent(); 
　　intent.setClass(Android123.this, CWJ.class);
　　intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);  //注意本行的FLAG设置
　　startActivity(intent);
　　接下来在B窗口中需要退出时直接使用finish方法即可全部退出。

==================================================数组与List之间转换===================

List<String> list=Arrays.asList(array); 
String[] array = (String[])list.toArray(new String[size]); 
==========================================================生成随机汉字==============

/**
     * 生成随机汉字
     * @return
     */
    private String getRandomChar() {
        String str = "";
        int hightPos;
        int lowPos;

        Random random = new Random();
        for(int i=0;i<3;i++) {
            hightPos = (176 + Math.abs(random.nextInt(39)));
            lowPos = (161 + Math.abs(random.nextInt(93)));

            byte[] b = new byte[2];
            b[0] = (Integer.valueOf(hightPos)).byteValue();
            b[1] = (Integer.valueOf(lowPos)).byteValue();

            try {
                str += new String(b, "GBK");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

=====================================================手机上文件路径===================

File file = new File(Environment.getExternalStorageDirectory()
                .getAbsolutePath() + File.separator + pcmName);

1、手机内存数据读写
     getFileDir( ) ：   得到当前app在手机内存存储数据的位置 /data/data/当前app包名/files
     getCacheDir( ) ： 得到当前app在手机内存存储数据的位置/data/data/当前app包名/cache
     openFileInput(String name) ： 直接得到/data/data/当前app包名/files/name文件的输入流
     openFileOutput(String name,int mode) ： 直接得到/data/data/当前app包名/files/name文件的输出流，mode为写入文件时的权限
2、sdcard数据读写
     Environment.getExternalStorageDirectory( ) ：   得到当前app所在手机的sdcard位置/storage/sdcard    
      Environment.getExternalStoragePublicDirectory(String type) ：   得到当前app所在手机的sdcard位置下的公共子文件夹/storage/sdcard/....    

一、 files
1. Context.getFilesDir()，该方法返回/data/data/youPackageName/files的File对象。
2. Context.openFileInput()与Context.openFileOutput()，只能读取和写入files下的文件，返回的是FileInputStream和FileOutputStream对象。www.2cto.com
3. Context.fileList()，返回files下所有的文件名，返回的是String[]对象。
4. Context.deleteFile(String)，删除files下指定名称的文件。
 
二、cache
1. Context.getCacheDir()，该方法返回/data/data/youPackageName/cache的File对象。
 
三、custom dir
getDir(String name, int mode)，返回/data/data/youPackageName/下的指定名称的文件夹File对象，如果该文件夹不存在则用指定名称创建一个新的文件夹。

保存
注：Context context=getApplicationContext();contectText为文件内容

=============================================测量view的高宽=========================

int width =View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED);
int height =View.MeasureSpec.makeMeasureSpec(0,View.MeasureSpec.UNSPECIFIED);

view.measure(width,height);

height=view.getMeasuredHeight(); 
width=view.getMeasuredWidth();

=================================================状态栏====================

隐藏状态栏
oThis.getWindow().addFlags(
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);// 状态栏透明
状态栏透明

=============================================== android:exported 属性==========================

总体来说它的主要作用是：是否支持其它应用调用当前组件。 
默认值：如果包含有intent-filter 默认值为true; 没有intent-filter默认值为false。

=============================Android应用内切换语言=========================
简体把文件夹名values改为values-zh-rCN
繁体把文件夹名values改为values-zh-rTW
英文把文件夹名values改为 values-en

1 首先获取Configuration 类：
  Resources resource = getResources(); 
  Configuration config = resource.getConfiguration();  
2 设置config的local属性
  locale属性为一个Locale类的对象，   
  Locale locale = getResources().getConfiguration().locale;//获得local对象
  String country = locale.getCountry(); //可以通过local获得相关的属性  如国家
3 设置config属性
  //设置应用的语言为英语
  config.locale = Locale.ENGLISH;
  //设置应用的语言为简体
  config.locale = Locale.SIMPLIFIED_CHINESE
  //设置应用的语言为繁体
  config.locale = Locale.TRADITIONAL_CHINESE
 //设置成系统默认的语言：
  config.locale = Locale.getDefault();
4 设置好config属性后，需要更新
  getBaseContext().getResources().updateConfiguration(config, null);  
  
  语言设置完成后，应用并不会自动刷新当前已经打开的Activity，所以为了刷新整个应用，需要重新启动一下应用：
Intent intent = new Intent();   
intent.setClass(this, MainActivity.class);   
intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);   
this.startActivity(intent);  

如：
private void updateLange(Locale locale){    	
		
		 Resources res = getResources();
		 Configuration config = res.getConfiguration();
		 config.locale = locale;
		 DisplayMetrics dm = res.getDisplayMetrics();
		 res.updateConfiguration(config, dm);
		 refresh();//更新当前页面
	}

   =====================列表排序==============================
   List<ChannelInfoBean> channelInfoBeanList = DianZhenUtils.getTitlesData(this);
        Collections.sort(channelInfoBeanList, new Comparator<ChannelInfoBean>() {
            @Override
            public int compare(ChannelInfoBean lhs, ChannelInfoBean rhs) {
                if (lhs.isChoose() && !rhs.isChoose()) {
                    return -1;
                }
                return 0;
            }
        });
    
    
=========================textview旁边显示图标======================
Drawable drawable3 = ContextCompat.getDrawable(mActivity, R.drawable.pieview_trade_view3);
    drawable3.setBounds(0, 0, PhoneUtils.dip2px(12), PhoneUtils.dip2px(12));//必须设置图片大小，否则不显示
    frozenAmountName.setCompoundDrawablePadding(5);
    frozenAmountName.setCompoundDrawables(drawable3, null, null, null);
    
    
======线程池ExecutorService==========
new Thread有弊端：用这个那你就out太多了，
 1.）new Thread()的缺点
每次new Thread()耗费性能 调用new Thread()创建的线程缺乏管理，被称为野线程，而且可以无限制创建，之间相互竞争，会导致过多占用系统资源导致系统瘫痪。 不利于扩展，比如如定时执行、定期执行、线程中断 2.）采用线程池的优点

重用存在的线程，减少对象创建、消亡的开销，性能佳 可有效控制最大并发线程数，提高系统资源的使用率，同时避免过多资源竞争，避免堵塞 提供定时执行、定期执行、单线程、并发数控制等功能

Java通过Executors提供四种线程池，分别为：
newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。 newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。 newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。 newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。

if (threadPool == null) {
        threadPool = Executors.newFixedThreadPool(Constant.MAX_THREAD_NUM);
    }
二、 ExecutorService 的submit（） 与execute（）区别 1、接收的参数不一样 submit（）可以接受runnable无返回值和callable有返回值 execute（）接受runnable 无返回值

2、submit有返回值，而execute没有 3、submit方便Exception处理