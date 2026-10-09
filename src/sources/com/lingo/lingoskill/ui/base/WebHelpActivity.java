package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import androidx.appcompat.widget.Toolbar;
import bp.t5;
import bp.u5;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.o0;
import hh.p0;
import hj.q0;
import ji.b;
import kotlin.jvm.internal.m;
import l.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class WebHelpActivity extends b {
    public WebHelpActivity() {
        super(BuildConfig.VERSION_NAME, t5.f4826a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String strG;
        String string = getString(R.string.faq);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        ((q0) j()).f33132c.setWebViewClient(new u5());
        ((q0) j()).f33132c.setWebChromeClient(new WebChromeClient());
        LollipopFixedWebView lollipopFixedWebView = ((q0) j()).f33132c;
        int i11 = ((o0) l()).f27733a.locateLanguage;
        if (i11 == 1) {
            strG = ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/ja/sections/360003529254-%E7%B7%8F%E5%90%88%E7%9A%84%E3%81%AA");
        } else if (i11 == 2) {
            strG = ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/ko/sections/360003529254-%EC%A0%84%EB%B6%80");
        } else if (i11 == 4) {
            strG = ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/es/sections/360003529254-General");
        } else if (i11 == 5) {
            strG = ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/fr/sections/360003529254-%C3%A0-propos-de-LingoDeer");
        } else if (i11 == 6) {
            strG = ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/de/sections/360003529254-Allgemeines");
        } else if (i11 != 8) {
            strG = i11 != 9 ? ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/en-us/sections/360003529254-About-LingoDeer") : ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/zh-hk/sections/360003529254-%E9%97%9C%E6%96%BCLingoDeer%E6%87%89%E7%94%A8");
        } else {
            strG = ep.a.g("https://support.", FirebaseRemoteConfig.d().f("end_point"), "/hc/pt/articles/360019723393-Como-o-LingoDeer-%C3%A9-diferente-dos-outros-aplicativos-");
        }
        lollipopFixedWebView.loadUrl(strG);
    }
}
