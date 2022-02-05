package com.cookandroid.hairshop

import android.app.Application
import com.kakao.sdk.commom.KakaoSdk

class GlobalApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        var instance = this
        // 다른 초기화 코드들


        // Kakao SDK 초기화
        KakaoSdk.init(this, "7d73ad51a6a4a5808b30eb48286e214c")
    }