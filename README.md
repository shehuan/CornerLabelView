# CornerLabelView

### 效果图：

![](https://github.com/Othershe/CornerLabelView/blob/master/screenshort/scan.PNG)

### 原理：<http://www.jianshu.com/p/d5027463208e>

### 基本用法：
**Step 1. 添加JitPack仓库**
在当前项目等根目录下的 `build.gradle` 文件中添加如下内容:
``` gradle
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}
```
**Step 2. 添加项目依赖**
``` gradle
dependencies {
        compile 'com.github.Othershe:CornerLabelView:1.0.0'
}
```
**Step 3. 在布局文件中添加CornerLabelView**
```
<com.othershe.cornerlabelview.CornerLabelView
        android:layout_width="100dp"
        android:layout_height="100dp"
        clv:bg_color="#FFAD2C"
        clv:position="right_top"
        clv:side_length="50dp"
        clv:text="Android"
        clv:text_color="#000000"
        clv:text_size="16sp" />
```

### CornerLabelView相关方法：
|方法名|描述|
|---|---|
|setBgColorId(int bgColorId)|设置角标背景色（资源id）|
|setBgColor(int bgColor)|设置角标背景色|
|setTextColorId(int colorId)|设置文字颜色（资源id）|
|setTextColor(int color)|设置文字颜色|
|setText(int textId)|设置文字（资源id）|
|setText(String text)|设置文字|

### CornerLabelView的自定义属性
namespace：xmlns:clv="http://schemas.android.com/apk/res-auto"

|属性名|格式|描述|默认值|
|---|---|---|---|
|side_length|dimension|角标水平显示宽度（当该值和CornerLabelView宽度相等时，角标显示为三角形）|40dp|
|bg_color|color|角标背景色|RED|
|text_color|color|文字颜色|WHITE|
|text_size|dimension|文字尺寸|14sp|
|text|string|文字|
|position|enum|角标位置：right_top、right_bottom、left_bottom、left_top|right_top|
|margin_lean_side|dimension|文字到角最长标斜边的距离（因为有默认距离，则此属性可选）|-1|
