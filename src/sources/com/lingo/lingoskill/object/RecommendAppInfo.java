package com.lingo.lingoskill.object;

import c00.e;
import com.google.android.material.datepicker.d;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dt.Xk.wuoM;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class RecommendAppInfo {
    private String appleID;
    private String iconUrl;
    private String openURL;
    private String packageName;
    private String platform;
    private String subTitle;
    private String title;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return RecommendAppInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public RecommendAppInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (f) null);
    }

    public static /* synthetic */ RecommendAppInfo copy$default(RecommendAppInfo recommendAppInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = recommendAppInfo.title;
        }
        if ((i11 & 2) != 0) {
            str2 = recommendAppInfo.subTitle;
        }
        if ((i11 & 4) != 0) {
            str3 = recommendAppInfo.iconUrl;
        }
        if ((i11 & 8) != 0) {
            str4 = recommendAppInfo.packageName;
        }
        if ((i11 & 16) != 0) {
            str5 = recommendAppInfo.openURL;
        }
        if ((i11 & 32) != 0) {
            str6 = recommendAppInfo.appleID;
        }
        if ((i11 & 64) != 0) {
            str7 = recommendAppInfo.platform;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return recommendAppInfo.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public static final /* synthetic */ void write$Self$app_release(RecommendAppInfo recommendAppInfo, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(recommendAppInfo.title, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, recommendAppInfo.title);
        }
        if (bVar.G(gVar) || !m.a(recommendAppInfo.subTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, recommendAppInfo.subTitle);
        }
        if (bVar.G(gVar) || !m.a(recommendAppInfo.iconUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, recommendAppInfo.iconUrl);
        }
        if (bVar.G(gVar) || !m.a(recommendAppInfo.packageName, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, recommendAppInfo.packageName);
        }
        if (bVar.G(gVar) || !m.a(recommendAppInfo.openURL, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, recommendAppInfo.openURL);
        }
        if (bVar.G(gVar) || !m.a(recommendAppInfo.appleID, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, recommendAppInfo.appleID);
        }
        if (!bVar.G(gVar) && m.a(recommendAppInfo.platform, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 6, recommendAppInfo.platform);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.subTitle;
    }

    public final String component3() {
        return this.iconUrl;
    }

    public final String component4() {
        return this.packageName;
    }

    public final String component5() {
        return this.openURL;
    }

    public final String component6() {
        return this.appleID;
    }

    public final String component7() {
        return this.platform;
    }

    public final RecommendAppInfo copy(String title, String subTitle, String iconUrl, String packageName, String openURL, String appleID, String platform) {
        m.f(title, "title");
        m.f(subTitle, "subTitle");
        m.f(iconUrl, "iconUrl");
        m.f(packageName, "packageName");
        m.f(openURL, "openURL");
        m.f(appleID, "appleID");
        m.f(platform, "platform");
        return new RecommendAppInfo(title, subTitle, iconUrl, packageName, openURL, appleID, platform);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendAppInfo)) {
            return false;
        }
        RecommendAppInfo recommendAppInfo = (RecommendAppInfo) obj;
        return m.a(this.title, recommendAppInfo.title) && m.a(this.subTitle, recommendAppInfo.subTitle) && m.a(this.iconUrl, recommendAppInfo.iconUrl) && m.a(this.packageName, recommendAppInfo.packageName) && m.a(this.openURL, recommendAppInfo.openURL) && m.a(this.appleID, recommendAppInfo.appleID) && m.a(this.platform, recommendAppInfo.platform);
    }

    public final String getAppleID() {
        return this.appleID;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getOpenURL() {
        return this.openURL;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.platform.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.title.hashCode() * 31, 31, this.subTitle), 31, this.iconUrl), 31, this.packageName), 31, this.openURL), 31, this.appleID);
    }

    public final void setAppleID(String str) {
        m.f(str, "<set-?>");
        this.appleID = str;
    }

    public final void setIconUrl(String str) {
        m.f(str, "<set-?>");
        this.iconUrl = str;
    }

    public final void setPackageName(String str) {
        m.f(str, "<set-?>");
        this.packageName = str;
    }

    public final void setPlatform(String str) {
        m.f(str, "<set-?>");
        this.platform = str;
    }

    public final void setSubTitle(String str) {
        m.f(str, "<set-?>");
        this.subTitle = str;
    }

    public final void setTitle(String str) {
        m.f(str, "<set-?>");
        this.title = str;
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        String str3 = this.iconUrl;
        String str4 = this.packageName;
        String str5 = this.openURL;
        String str6 = this.appleID;
        String str7 = this.platform;
        StringBuilder sbS = defpackage.e.s("RecommendAppInfo(title=", str, ", subTitle=", str2, ", iconUrl=");
        d.w(sbS, str3, ", packageName=", str4, ", openURL=");
        d.w(sbS, str5, ", appleID=", str6, ", platform=");
        return ep.a.k(sbS, str7, ")");
    }

    public /* synthetic */ RecommendAppInfo(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.title = BuildConfig.VERSION_NAME;
        } else {
            this.title = str;
        }
        if ((i11 & 2) == 0) {
            this.subTitle = BuildConfig.VERSION_NAME;
        } else {
            this.subTitle = str2;
        }
        if ((i11 & 4) == 0) {
            this.iconUrl = BuildConfig.VERSION_NAME;
        } else {
            this.iconUrl = str3;
        }
        if ((i11 & 8) == 0) {
            this.packageName = BuildConfig.VERSION_NAME;
        } else {
            this.packageName = str4;
        }
        if ((i11 & 16) == 0) {
            this.openURL = BuildConfig.VERSION_NAME;
        } else {
            this.openURL = str5;
        }
        if ((i11 & 32) == 0) {
            this.appleID = BuildConfig.VERSION_NAME;
        } else {
            this.appleID = str6;
        }
        if ((i11 & 64) == 0) {
            this.platform = BuildConfig.VERSION_NAME;
        } else {
            this.platform = str7;
        }
    }

    public final void setOpenURL(String str) {
        m.f(str, wuoM.RXxKLIzSzZ);
        this.openURL = str;
    }

    public RecommendAppInfo(String title, String subTitle, String iconUrl, String packageName, String openURL, String appleID, String platform) {
        m.f(title, "title");
        m.f(subTitle, "subTitle");
        m.f(iconUrl, "iconUrl");
        m.f(packageName, "packageName");
        m.f(openURL, "openURL");
        m.f(appleID, "appleID");
        m.f(platform, "platform");
        this.title = title;
        this.subTitle = subTitle;
        this.iconUrl = iconUrl;
        this.packageName = packageName;
        this.openURL = openURL;
        this.appleID = appleID;
        this.platform = platform;
    }

    public /* synthetic */ RecommendAppInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7);
    }
}
