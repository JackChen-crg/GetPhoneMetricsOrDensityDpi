# GetPhoneMetricsOrDensityDpi
获得手机设备屏幕分辨率信息，方便适配

可以使用如下 adb 命令，在命令行获取设备屏幕分辨率信息
adb shell dumpsys window displays

结果如下：

	WINDOW MANAGER DISPLAY CONTENTS (dumpsys window displays)
  Display: mDisplayId=0
    init=720x1280 320dpi cur=720x1280 app=720x1184 rng=720x670-1196x1134
    layoutNeeded=false
  StackBox #0
    mParent=null
    mBounds=[0,50][720,1184] mVertical=false layoutNeeded=true

