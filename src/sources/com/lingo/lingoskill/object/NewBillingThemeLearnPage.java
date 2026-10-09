package com.lingo.lingoskill.object;

import c00.e;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class NewBillingThemeLearnPage {
    private String countDownBgColor;
    private String countDownColor;
    private MainBtmCardData mainBtmCardPadPicData;
    private MainBtmCardData mainBtmCardPicData;
    private String newTopBarBtnColor;
    private String newTopBarBtnEndColor;
    private String newTopBarBtnTextColor;
    private String newTopBarColor;
    private String newTopBarCountDownColor;
    private String newTopBarDeeplink;
    private String newTopBarEndColor;
    private String newTopBarLeftIconUrl;
    private String newTopBarTextColor;
    private String topBarColor;
    private String topBarEndColor;
    private String topBarFreeTrialColor;
    private String topBarFreeTrialEndColor;
    private String topBarFreeTrialTextColor;
    private String topBarTextColor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return NewBillingThemeLearnPage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public NewBillingThemeLearnPage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MainBtmCardData) null, (MainBtmCardData) null, 524287, (f) null);
    }

    public static final /* synthetic */ void write$Self$app_release(NewBillingThemeLearnPage newBillingThemeLearnPage, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.topBarColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, newBillingThemeLearnPage.topBarColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.topBarEndColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, newBillingThemeLearnPage.topBarEndColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.topBarTextColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, newBillingThemeLearnPage.topBarTextColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.topBarFreeTrialTextColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, newBillingThemeLearnPage.topBarFreeTrialTextColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.topBarFreeTrialColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, newBillingThemeLearnPage.topBarFreeTrialColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.topBarFreeTrialEndColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, newBillingThemeLearnPage.topBarFreeTrialEndColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.countDownColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 6, newBillingThemeLearnPage.countDownColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.countDownBgColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 7, newBillingThemeLearnPage.countDownBgColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 8, newBillingThemeLearnPage.newTopBarColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarEndColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 9, newBillingThemeLearnPage.newTopBarEndColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarCountDownColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 10, newBillingThemeLearnPage.newTopBarCountDownColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarTextColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 11, newBillingThemeLearnPage.newTopBarTextColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarBtnColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 12, newBillingThemeLearnPage.newTopBarBtnColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarBtnEndColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 13, newBillingThemeLearnPage.newTopBarBtnEndColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarBtnTextColor, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 14, newBillingThemeLearnPage.newTopBarBtnTextColor);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarLeftIconUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 15, newBillingThemeLearnPage.newTopBarLeftIconUrl);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.newTopBarDeeplink, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 16, newBillingThemeLearnPage.newTopBarDeeplink);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeLearnPage.mainBtmCardPicData, new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null))) {
            bVar.A(gVar, 17, MainBtmCardData$$serializer.INSTANCE, newBillingThemeLearnPage.mainBtmCardPicData);
        }
        if (!bVar.G(gVar) && m.a(newBillingThemeLearnPage.mainBtmCardPadPicData, new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null))) {
            return;
        }
        bVar.A(gVar, 18, MainBtmCardData$$serializer.INSTANCE, newBillingThemeLearnPage.mainBtmCardPadPicData);
    }

    public final String getCountDownBgColor() {
        return this.countDownBgColor;
    }

    public final String getCountDownColor() {
        return this.countDownColor;
    }

    public final MainBtmCardData getMainBtmCardPadPicData() {
        return this.mainBtmCardPadPicData;
    }

    public final MainBtmCardData getMainBtmCardPicData() {
        return this.mainBtmCardPicData;
    }

    public final String getNewTopBarBtnColor() {
        return this.newTopBarBtnColor;
    }

    public final String getNewTopBarBtnEndColor() {
        return this.newTopBarBtnEndColor;
    }

    public final String getNewTopBarBtnTextColor() {
        return this.newTopBarBtnTextColor;
    }

    public final String getNewTopBarColor() {
        return this.newTopBarColor;
    }

    public final String getNewTopBarCountDownColor() {
        return this.newTopBarCountDownColor;
    }

    public final String getNewTopBarDeeplink() {
        return this.newTopBarDeeplink;
    }

    public final String getNewTopBarEndColor() {
        return this.newTopBarEndColor;
    }

    public final String getNewTopBarLeftIconUrl() {
        return this.newTopBarLeftIconUrl;
    }

    public final String getNewTopBarTextColor() {
        return this.newTopBarTextColor;
    }

    public final String getTopBarColor() {
        return this.topBarColor;
    }

    public final String getTopBarEndColor() {
        return this.topBarEndColor;
    }

    public final String getTopBarFreeTrialColor() {
        return this.topBarFreeTrialColor;
    }

    public final String getTopBarFreeTrialEndColor() {
        return this.topBarFreeTrialEndColor;
    }

    public final String getTopBarFreeTrialTextColor() {
        return this.topBarFreeTrialTextColor;
    }

    public final String getTopBarTextColor() {
        return this.topBarTextColor;
    }

    public final void setCountDownBgColor(String str) {
        m.f(str, "<set-?>");
        this.countDownBgColor = str;
    }

    public final void setCountDownColor(String str) {
        m.f(str, "<set-?>");
        this.countDownColor = str;
    }

    public final void setMainBtmCardPadPicData(MainBtmCardData mainBtmCardData) {
        m.f(mainBtmCardData, "<set-?>");
        this.mainBtmCardPadPicData = mainBtmCardData;
    }

    public final void setMainBtmCardPicData(MainBtmCardData mainBtmCardData) {
        m.f(mainBtmCardData, "<set-?>");
        this.mainBtmCardPicData = mainBtmCardData;
    }

    public final void setNewTopBarBtnColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarBtnColor = str;
    }

    public final void setNewTopBarBtnEndColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarBtnEndColor = str;
    }

    public final void setNewTopBarBtnTextColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarBtnTextColor = str;
    }

    public final void setNewTopBarColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarColor = str;
    }

    public final void setNewTopBarCountDownColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarCountDownColor = str;
    }

    public final void setNewTopBarDeeplink(String str) {
        m.f(str, "<set-?>");
        this.newTopBarDeeplink = str;
    }

    public final void setNewTopBarEndColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarEndColor = str;
    }

    public final void setNewTopBarLeftIconUrl(String str) {
        m.f(str, "<set-?>");
        this.newTopBarLeftIconUrl = str;
    }

    public final void setNewTopBarTextColor(String str) {
        m.f(str, "<set-?>");
        this.newTopBarTextColor = str;
    }

    public final void setTopBarColor(String str) {
        m.f(str, "<set-?>");
        this.topBarColor = str;
    }

    public final void setTopBarEndColor(String str) {
        m.f(str, "<set-?>");
        this.topBarEndColor = str;
    }

    public final void setTopBarFreeTrialColor(String str) {
        m.f(str, "<set-?>");
        this.topBarFreeTrialColor = str;
    }

    public final void setTopBarFreeTrialEndColor(String str) {
        m.f(str, "<set-?>");
        this.topBarFreeTrialEndColor = str;
    }

    public final void setTopBarFreeTrialTextColor(String str) {
        m.f(str, "<set-?>");
        this.topBarFreeTrialTextColor = str;
    }

    public final void setTopBarTextColor(String str) {
        m.f(str, "<set-?>");
        this.topBarTextColor = str;
    }

    public /* synthetic */ NewBillingThemeLearnPage(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, MainBtmCardData mainBtmCardData, MainBtmCardData mainBtmCardData2, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.topBarColor = BuildConfig.VERSION_NAME;
        } else {
            this.topBarColor = str;
        }
        if ((i11 & 2) == 0) {
            this.topBarEndColor = BuildConfig.VERSION_NAME;
        } else {
            this.topBarEndColor = str2;
        }
        if ((i11 & 4) == 0) {
            this.topBarTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.topBarTextColor = str3;
        }
        if ((i11 & 8) == 0) {
            this.topBarFreeTrialTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.topBarFreeTrialTextColor = str4;
        }
        if ((i11 & 16) == 0) {
            this.topBarFreeTrialColor = BuildConfig.VERSION_NAME;
        } else {
            this.topBarFreeTrialColor = str5;
        }
        if ((i11 & 32) == 0) {
            this.topBarFreeTrialEndColor = BuildConfig.VERSION_NAME;
        } else {
            this.topBarFreeTrialEndColor = str6;
        }
        if ((i11 & 64) == 0) {
            this.countDownColor = BuildConfig.VERSION_NAME;
        } else {
            this.countDownColor = str7;
        }
        if ((i11 & 128) == 0) {
            this.countDownBgColor = BuildConfig.VERSION_NAME;
        } else {
            this.countDownBgColor = str8;
        }
        if ((i11 & 256) == 0) {
            this.newTopBarColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarColor = str9;
        }
        if ((i11 & 512) == 0) {
            this.newTopBarEndColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarEndColor = str10;
        }
        if ((i11 & 1024) == 0) {
            this.newTopBarCountDownColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarCountDownColor = str11;
        }
        if ((i11 & 2048) == 0) {
            this.newTopBarTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarTextColor = str12;
        }
        if ((i11 & 4096) == 0) {
            this.newTopBarBtnColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarBtnColor = str13;
        }
        if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
            this.newTopBarBtnEndColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarBtnEndColor = str14;
        }
        if ((i11 & 16384) == 0) {
            this.newTopBarBtnTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarBtnTextColor = str15;
        }
        if ((32768 & i11) == 0) {
            this.newTopBarLeftIconUrl = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarLeftIconUrl = str16;
        }
        if ((65536 & i11) == 0) {
            this.newTopBarDeeplink = BuildConfig.VERSION_NAME;
        } else {
            this.newTopBarDeeplink = str17;
        }
        if ((131072 & i11) == 0) {
            this.mainBtmCardPicData = new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
        } else {
            this.mainBtmCardPicData = mainBtmCardData;
        }
        this.mainBtmCardPadPicData = (i11 & 262144) == 0 ? new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : mainBtmCardData2;
    }

    public NewBillingThemeLearnPage(String topBarColor, String topBarEndColor, String topBarTextColor, String topBarFreeTrialTextColor, String topBarFreeTrialColor, String topBarFreeTrialEndColor, String countDownColor, String countDownBgColor, String newTopBarColor, String newTopBarEndColor, String newTopBarCountDownColor, String newTopBarTextColor, String newTopBarBtnColor, String newTopBarBtnEndColor, String newTopBarBtnTextColor, String newTopBarLeftIconUrl, String newTopBarDeeplink, MainBtmCardData mainBtmCardPicData, MainBtmCardData mainBtmCardPadPicData) {
        m.f(topBarColor, "topBarColor");
        m.f(topBarEndColor, "topBarEndColor");
        m.f(topBarTextColor, "topBarTextColor");
        m.f(topBarFreeTrialTextColor, "topBarFreeTrialTextColor");
        m.f(topBarFreeTrialColor, "topBarFreeTrialColor");
        m.f(topBarFreeTrialEndColor, "topBarFreeTrialEndColor");
        m.f(countDownColor, "countDownColor");
        m.f(countDownBgColor, "countDownBgColor");
        m.f(newTopBarColor, "newTopBarColor");
        m.f(newTopBarEndColor, "newTopBarEndColor");
        m.f(newTopBarCountDownColor, "newTopBarCountDownColor");
        m.f(newTopBarTextColor, "newTopBarTextColor");
        m.f(newTopBarBtnColor, "newTopBarBtnColor");
        m.f(newTopBarBtnEndColor, "newTopBarBtnEndColor");
        m.f(newTopBarBtnTextColor, "newTopBarBtnTextColor");
        m.f(newTopBarLeftIconUrl, "newTopBarLeftIconUrl");
        m.f(newTopBarDeeplink, "newTopBarDeeplink");
        m.f(mainBtmCardPicData, "mainBtmCardPicData");
        m.f(mainBtmCardPadPicData, "mainBtmCardPadPicData");
        this.topBarColor = topBarColor;
        this.topBarEndColor = topBarEndColor;
        this.topBarTextColor = topBarTextColor;
        this.topBarFreeTrialTextColor = topBarFreeTrialTextColor;
        this.topBarFreeTrialColor = topBarFreeTrialColor;
        this.topBarFreeTrialEndColor = topBarFreeTrialEndColor;
        this.countDownColor = countDownColor;
        this.countDownBgColor = countDownBgColor;
        this.newTopBarColor = newTopBarColor;
        this.newTopBarEndColor = newTopBarEndColor;
        this.newTopBarCountDownColor = newTopBarCountDownColor;
        this.newTopBarTextColor = newTopBarTextColor;
        this.newTopBarBtnColor = newTopBarBtnColor;
        this.newTopBarBtnEndColor = newTopBarBtnEndColor;
        this.newTopBarBtnTextColor = newTopBarBtnTextColor;
        this.newTopBarLeftIconUrl = newTopBarLeftIconUrl;
        this.newTopBarDeeplink = newTopBarDeeplink;
        this.mainBtmCardPicData = mainBtmCardPicData;
        this.mainBtmCardPadPicData = mainBtmCardPadPicData;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NewBillingThemeLearnPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, MainBtmCardData mainBtmCardData, MainBtmCardData mainBtmCardData2, int i11, f fVar) {
        int i12 = i11 & 1;
        String str18 = BuildConfig.VERSION_NAME;
        this(i12 != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i11 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i11 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i11 & 1024) != 0 ? BuildConfig.VERSION_NAME : str11, (i11 & 2048) != 0 ? BuildConfig.VERSION_NAME : str12, (i11 & 4096) != 0 ? BuildConfig.VERSION_NAME : str13, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str14, (i11 & 16384) != 0 ? BuildConfig.VERSION_NAME : str15, (i11 & 32768) != 0 ? BuildConfig.VERSION_NAME : str16, (i11 & 65536) == 0 ? str17 : str18, (i11 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : mainBtmCardData, (i11 & 262144) != 0 ? new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : mainBtmCardData2);
    }
}
