tag:^(?!.*(viewrootimpl)).*$
移除无用import shift+ctrl+o
代码自动对齐 shift+ctrl+f


微信小程序AppID:wx91a639d6282a251c


Evenbus使用：

    public void onEventMainThread(EmptyEvent event) {
        switch (event.method) {
            case Constant.EVENT_SWITCH_COLOR_SETTING:
               
                break;
            default:
                break;
        }
    
    
    EmptyEvent event = new EmptyEvent();
                event.method = Constant.EVENT_SWITCH_COLOR_SETTING;
                EventBus.getDefault().post(event);
                
            
SVN错误解决：
1， svn: E155004: 'E:\AndroidProject\myIBest\Now\IBest' is already locked. 方法：在报错的目录上一级右击，找svn cleanup 执行下清理，文件夹被锁定了

//命令行打包apk gradlew assemblerelease

armeabiv-v7a: Version 7 or higher of the ARM processor. Most Android phones released from 2011-15 are using this. arm64-v8a: 64-bit ARM processors. Found on new devices, like the Samsung Galaxy S6. armeabi: Older phones using v5 or v6 of the ARM processor. x86: Mostly used by tablets, and by emulators. x86_64: Used by 64-bit tablets.