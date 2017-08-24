如何添加?
I. 在你的 build.grade 文件里添加最新版本的 appcompat 库。
dependencies {  
    compile 'com.android.support:appcompat-v7:X.X.X'
    // where X.X.X version
}
II. 使你的 activity 继承自 android.support.v7.app.AppCompatActivity.
public class MyActivity extends AppCompatActivity {  
   ...
}
III. 在 layout.xml 文件内声明你的 Toolbar。
<android.support.v7.widget.Toolbar  
    android:layout_width="fill_parent"
    android:layout_height="?attr/actionBarSize"
    android:background="?colorPrimary"
    app:theme="@style/ThemeOverlay.AppCompat.Dark.ActionBar" />
如何设置样式?
 
I. 在你的 style.xml 文件里声明自定义的样式。
<style name="ToolbarTextAppearance">  
    <item name="android:fontFamily">sans-serif-condensed</item>
    <item name="android:textColor">@android:color/white</item>
    <item name="android:shadowDx">1</item>
    <item name="android:shadowDy">1</item>
    <item name="android:shadowRadius">2</item>
    <item name="android:shadowColor">?colorAccent</item>
</style>

<style name="ToolbarTextAppearance.Title">  
    <item name="android:textSize">20sp</item>
</style>

<style name="ToolbarTextAppearance.Subtitle">  
    <item name="android:textSize">14sp</item>
</style>

<style name="MyToolbar">  
    <item name="theme">@style/ThemeOverlay.AppCompat.Dark</item>
    <item name="android:background">?colorPrimary</item>
    <item name="android:elevation">4dp</item>
</style>  
II. 应用样式到你的 Toolbar 的 titleTextAppearance 和 subtitleTextAppearance 属性。
<android.support.v7.widget.Toolbar  
    android:id="@+id/toolbar"
    android:layout_width="match_parent"
    android:layout_height="?actionBarSize"
    app:title="Toolbar"
    app:subtitle="Toolbars are amazing"
    app:titleTextAppearance="@style/ToolbarTextAppearance.Title"
    app:subtitleTextAppearance="@style/ToolbarTextAppearance.Subtitle"
    style="@style/MyToolbar" />
Toolbar 菜单图标

I. 创建每一个 Action 项。
<menu xmlns:android="http://schemas.android.com/apk/res/android"  
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">
    <item
        android:id="@+id/action_favorite"
        android:icon="@drawable/ic_favorite"
        app:showAsAction="always"/>
    <item
        android:id="@+id/action_search"
        android:icon="@drawable/ic_search"
        app:showAsAction="always"/>
    <item
        android:id="@+id/action_settings"
        android:orderInCategory="100"
        android:title="@string/action_settings"
        app:showAsAction="never"/>
</menu>  
II. 通过 inflateMenu 方法生成你的菜单。
Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);  
toolbar.inflateMenu(R.menu.main);  
II. 使你的 activity 实现 Toolbar.OnMenuItemClickListener.
public class MyActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {  
III. 在你的 Toolbar上设置实现了 listener 的 Activity的引用。
toolbar.setOnMenuItemClickListener(this);  
IV. 在 onMenuItemClick 方法内实现你的 actions。
@Override
public boolean onMenuItemClick(MenuItem item) {  
    switch (item.getItemId()) {
        case R.id.action_favorite:
            Toast.makeText(this, "Favorite", Toast.LENGTH_SHORT).show();
            return true;

        case R.id.action_search:
            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
            return true;
    }

    return true;
}
Toolbar 的导航返回图标
 
I. 在你的 styles.xml 文件内定义自定义样式。
<style name="MyToolbar">  
    <item name="theme">@style/ThemeOverlay.AppCompat.Dark</item>
    <item name="navigationIcon">@drawable/abc_ic_ab_back_mtrl_am_alpha</item>
    <item name="android:background">?colorPrimary</item>
    <item name="android:elevation">4dp</item>
</style>  
II. 通过 style 属性应用这个样式到你的 Toolbar。
<android.support.v7.widget.Toolbar  
    android:id="@+id/toolbar"
    android:layout_width="match_parent"
    android:layout_height="?actionBarSize"
    app:title="Toolbar"
    app:subtitle="Toolbars are amazing"
    style="@style/MyToolbar" />
III. 设置导航返回动作的监听器。
toolbar.setNavigationOnClickListener(new View.OnClickListener() {  
    @Override
    public void onClick(View v) {
        onBackPressed();
    }
});
Toolbar 的留白
 
I. 在你的 styles.xml 文件内定义自定义样式。
<style name="MyToolbar">  
    <item name="theme">@style/ThemeOverlay.AppCompat.Dark</item>
    <item name="navigationIcon">@drawable/abc_ic_ab_back_mtrl_am_alpha</item>
    <item name="titleMarginTop">?actionBarSize</item>
    <item name="android:background">?colorPrimary</item>
    <item name="android:elevation">4dp</item>
</style>  
II. 通过 style 属性应用这个样式到你的 Toolbar。
<android.support.v7.widget.Toolbar  
    android:id="@+id/toolbar"
    android:layout_width="match_parent"
    android:layout_height="112dp"
    app:title="Toolbar"
    app:subtitle="Toolbars are really cool"
    style="@style/MyToolbar" />