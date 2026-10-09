package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class AppData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f18234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f18235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f18236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DevelopmentPlatformProvider f18237h;

    public AppData(String str, String str2, ArrayList arrayList, String str3, String str4, String str5, String str6, DevelopmentPlatformProvider developmentPlatformProvider) {
        this.f18230a = str;
        this.f18231b = str2;
        this.f18232c = arrayList;
        this.f18233d = str3;
        this.f18234e = str4;
        this.f18235f = str5;
        this.f18236g = str6;
        this.f18237h = developmentPlatformProvider;
    }

    public static AppData a(Context context, IdManager idManager, String str, String str2, ArrayList arrayList, DevelopmentPlatformProvider developmentPlatformProvider) {
        String packageName = context.getPackageName();
        String strD = idManager.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String string = Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, arrayList, strD, packageName, string, str3, developmentPlatformProvider);
    }
}
