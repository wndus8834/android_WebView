## android_WebView
### 웹 뷰로 웹 앱 만들기!

![kakaotalk_20190302_040100548](https://user-images.githubusercontent.com/38427658/53659903-03efec80-3ca0-11e9-82a5-f39fe65329dd.jpg)

가장 빠르게 모바일 애플리케이션을 만드는 방법 중 하나는 바로 웹 앱 형태로 앱을 개발하는 것입니다. 반응형 웨 기술을 이용해서 웹 사이트를 만든 이후에, 앱에서는 단순히 웹 사이트를 웹 뷰로 보여주기만 하는 것입니다. 이렇게 하면 웹 페이지로 개발된 부분과 네이티브로 개발된 부분이 분리된다는 장점이 있습니다.

* 레이아웃 디자인하기

    ```xml
    <WebView
        android:id="@+id/webView"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
    ```
    레이아웃에는 단순히 웹 뷰만 들어가도록 코딩한다.

* 메인 액티비티 작업하기
    ```java
    webView.loadUrl("https://pei5171.wixsite.com/letspark/blank");
    ```
    메인 액티비티에서 웹 뷰에서 특정한 URL로 접속하도록 작업한다.

* AndroidManifest.xml
    ```xml
    <uses-permission android:name="android.permission.INTERNET"/>
    ```
    웹뷰는 기본적으로 인터넷 접속 권한 설정이 되어 있어야 하므로 <Manifest> 태그 안에 인터넷 퍼미션 문구를 입력해야 한다.