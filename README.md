# VerificationCode
短信验证码输入框，简单例子！

### 如何使用？

#### 步骤一：将 JitPack添加到项目最外层的build.gradle文件中 

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
#### 步骤二：在module中引入依赖

	dependencies {
		implementation 'com.github.wxianing:VerificationCode:1.0'
	}

#### 步骤三：在XML中引用

	<com.alliky.verificationcode.VerificationCode
        android:id="@+id/mVerificationCode"
        android:layout_width="180dp"
        android:layout_height="wrap_content"
        android:layout_marginTop="100dp" />
	
宽高自行设定

### 实现效果

.<img src="https://github.com/wxianing/VerificationCode/blob/master/image/20191008140031.jpg" width="375" height="667" />
