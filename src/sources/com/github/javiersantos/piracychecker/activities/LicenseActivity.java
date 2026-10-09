package com.github.javiersantos.piracychecker.activities;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import l.a;
import l.m;
import oz.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class LicenseActivity extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7771e;

    @Override // androidx.fragment.app.p0, f.n, n4.h, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        CharSequence charSequence;
        String string2;
        CharSequence applicationLabel;
        View viewInflate;
        super.onCreate(bundle);
        setContentView(R.layout.activity_license);
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("content") : null;
        String string3 = BuildConfig.VERSION_NAME;
        if (stringExtra == null) {
            stringExtra = BuildConfig.VERSION_NAME;
        }
        this.f7767a = stringExtra;
        Intent intent2 = getIntent();
        this.f7768b = intent2 != null ? intent2.getIntExtra("colorPrimary", getColor(R.color.colorPrimary)) : getColor(R.color.colorPrimary);
        Intent intent3 = getIntent();
        this.f7769c = intent3 != null ? intent3.getIntExtra("colorPrimaryDark", getColor(R.color.colorPrimaryDark)) : getColor(R.color.colorPrimaryDark);
        Intent intent4 = getIntent();
        this.f7770d = intent4 != null ? intent4.getBooleanExtra("withLightStatusBar", false) : false;
        Intent intent5 = getIntent();
        this.f7771e = intent5 != null ? intent5.getIntExtra("layoutXML", -1) : -1;
        View viewFindViewById = findViewById(R.id.toolbar);
        if (!(viewFindViewById instanceof Toolbar)) {
            viewFindViewById = null;
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        if (toolbar != null) {
            toolbar.setBackgroundColor(getColor(this.f7768b));
        }
        setSupportActionBar(toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            try {
                PackageManager packageManager = getPackageManager();
                if (packageManager == null || (applicationLabel = packageManager.getApplicationLabel(getApplicationInfo())) == null) {
                    applicationLabel = BuildConfig.VERSION_NAME;
                }
                string = applicationLabel.toString();
            } catch (Exception unused) {
                string = BuildConfig.VERSION_NAME;
            }
            if (q.K0(string) || string.length() <= 0) {
                ApplicationInfo applicationInfo = getApplicationInfo();
                int i11 = applicationInfo != null ? applicationInfo.labelRes : 0;
                if (i11 == 0) {
                    ApplicationInfo applicationInfo2 = getApplicationInfo();
                    if (applicationInfo2 != null && (charSequence = applicationInfo2.nonLocalizedLabel) != null && (string2 = charSequence.toString()) != null) {
                        string3 = string2;
                    }
                } else {
                    try {
                        string3 = getString(i11);
                    } catch (Exception unused2) {
                    }
                    kotlin.jvm.internal.m.e(string3, "try {\n            getStr…\n            \"\"\n        }");
                }
                string = string3;
            }
            supportActionBar.s(string);
        }
        Window window = getWindow();
        kotlin.jvm.internal.m.e(window, "window");
        window.setStatusBarColor(getColor(this.f7769c));
        Window window2 = getWindow();
        kotlin.jvm.internal.m.e(window2, "window");
        View decorView = window2.getDecorView();
        kotlin.jvm.internal.m.e(decorView, "window.decorView");
        boolean z11 = this.f7770d;
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z11 ? systemUiVisibility | OSSConstants.DEFAULT_BUFFER_SIZE : systemUiVisibility & (-8193));
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mainContainer);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this);
        int i12 = this.f7771e;
        if (i12 == -1) {
            viewInflate = layoutInflaterFrom.inflate(R.layout.activity_license_default, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.piracy_checker_description);
            if (textView != null) {
                textView.setText(this.f7767a);
            }
        } else {
            viewInflate = layoutInflaterFrom.inflate(i12, (ViewGroup) null);
        }
        if (viewInflate == null || frameLayout == null) {
            return;
        }
        frameLayout.addView(viewInflate);
    }
}
