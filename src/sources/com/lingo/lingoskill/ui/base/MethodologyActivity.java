package com.lingo.lingoskill.ui.base;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import androidx.appcompat.widget.Toolbar;
import bp.h3;
import bp.i3;
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
public final class MethodologyActivity extends b {
    public MethodologyActivity() {
        super(BuildConfig.VERSION_NAME, h3.f4621a);
    }

    @Override // ji.b
    public final void r(Bundle bundle) {
        String str;
        String string = getString(R.string.methodology);
        m.e(string, "getString(...)");
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(string);
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            p0.A(supportActionBar, true, R.drawable.ic_arrow_back_black);
        }
        toolbar.setNavigationOnClickListener(new bq.a(this, 0));
        WebSettings settings = ((q0) j()).f33132c.getSettings();
        m.e(settings, "getSettings(...)");
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        settings.setSupportZoom(true);
        ((q0) j()).f33132c.setWebViewClient(new i3(this, 0));
        ((q0) j()).f33132c.setWebChromeClient(new WebChromeClient());
        LollipopFixedWebView lollipopFixedWebView = ((q0) j()).f33132c;
        int i11 = ((o0) l()).f27733a.locateLanguage;
        if (i11 == 1) {
            str = "https://support.lingodeer.com/ja-JP/support/solutions/articles/61000194372-lingodeer%E3%81%AE%E7%89%B9%E5%BE%B4%E3%81%AF%E4%BD%95%E3%81%A7%E3%81%99%E3%81%8B-";
        } else if (i11 == 2) {
            str = "https://support.lingodeer.com/ko/support/solutions/articles/61000194372-lingodeer%EB%8A%94-%EB%8B%A4%EB%A5%B8-%EC%95%B1%EA%B3%BC-%EC%96%B4%EB%96%BB%EA%B2%8C-%EB%8B%A4%EB%A5%B8%EA%B0%80%EC%9A%94-";
        } else if (i11 == 18) {
            str = "https://support.lingodeer.com/id/support/solutions/articles/61000194372-apa-beda-lingodeer-dengan-aplikasi-lain-";
        } else if (i11 != 57) {
            switch (i11) {
                case 4:
                    str = "https://support.lingodeer.com/es-LA/support/solutions/articles/61000194372--en-qu%C3%A9-se-diferencia-lingodeer-de-otras-aplicaciones-";
                    break;
                case 5:
                    str = "https://support.lingodeer.com/fr/support/solutions/articles/61000194372-en-quoi-se-lingoddeer-diff%C3%A9rencie-t-il-des-autres-produits-";
                    break;
                case 6:
                    str = "https://support.lingodeer.com/de/support/solutions/articles/61000194372-was-unterscheidet-lingodeer-von-anderen-sprach-apps-";
                    break;
                case 7:
                    str = "https://support.lingodeer.com/vi/support/solutions/articles/61000194372-t%E1%BA%A1i-sao-lingodeer-l%E1%BA%A1i-kh%C3%A1c-bi%E1%BB%87t-so-v%E1%BB%9Bi-nh%E1%BB%AFng-%E1%BB%A9ng-d%E1%BB%A5ng-kh%C3%A1c-";
                    break;
                case 8:
                    str = "https://support.lingodeer.com/pt-BR/support/solutions/articles/61000194372-como-o-lingodeer-%C3%A9-diferente-dos-outros-aplicativos-";
                    break;
                case 9:
                    str = "https://support.lingodeer.com/zh-TW/support/solutions/articles/61000194372-lingodeer%E9%80%99%E6%AC%BE%E6%87%89%E7%94%A8%E7%9A%84%E7%89%B9%E9%BB%9E%E5%9C%A8%E5%93%AA%E8%A3%A1-";
                    break;
                case 10:
                    str = "https://support.lingodeer.com/ru-RU/support/solutions/articles/61000194372-%D0%A7%D0%B5%D0%BC-lingodeer-%D0%BE%D1%82%D0%BB%D0%B8%D1%87%D0%B0%D0%B5%D1%82%D1%81%D1%8F-%D0%BE%D1%82-%D0%B4%D1%80%D1%83%D0%B3%D0%B8%D1%85-%D0%BF%D1%80%D0%B8%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B9-";
                    break;
                default:
                    str = "https://support.lingodeer.com/en/support/solutions/articles/61000194372-how-is-lingodeer-different-from-other-apps-";
                    break;
            }
        } else {
            str = "https://support.lingodeer.com/th/support/solutions/articles/61000194372-lingodeer-%E0%B8%95%E0%B9%88%E0%B8%B2%E0%B8%87%E0%B8%88%E0%B8%B2%E0%B8%81%E0%B9%81%E0%B8%AD%E0%B8%9B%E0%B8%AD%E0%B8%B7%E0%B9%88%E0%B8%99%E0%B8%AD%E0%B8%A2%E0%B9%88%E0%B8%B2%E0%B8%87%E0%B9%84%E0%B8%A3-";
        }
        lollipopFixedWebView.loadUrl(str);
    }
}
