# ToastUtilsDemo
吐司工具类

## 使用方式
### Step 1. Add the JitPack repository to your build file
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
### Step 2. Add the dependency
```
dependencies {
        implementation 'com.github.SeedsOfLove:ToastUtils_SOL:1.0.0'
	}
```

### Step 3. 在App启动时使用
```
ToastUtils.initToast(context);		//context可以使用全局Context,只需调用一次
```

### Step 4. 在需要显示Toast的地方使用
```
ToastUtils.onDefaultWithoutIconShowToast("DefaultText");
ToastUtils.onSuccessShowToast("Success");
ToastUtils.onErrorShowToast("Error");
ToastUtils.onInfoShowToast("Info");
ToastUtils.onWarnShowToast("Warning");
ToastUtils.onDefaultShowToast("Default");
```