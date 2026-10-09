package com.lingo.lingoskill.object;

import c00.e;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class NewBillingThemeIntroPage {
    private String bannerPicPadLandUrl;
    private String bannerPicUrl;
    private String colorAccent;
    private String colorButton;
    private String colorButtonBtm;
    private String colorButtonBtmEnd;
    private String colorButtonBtmText;
    private String colorButtonEnd;
    private String colorButtonText;
    private String colorCountDownClock;
    private String colorCountDownClockBtm;
    private String colorCountDownTitle;
    private String colorTitle;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return NewBillingThemeIntroPage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public NewBillingThemeIntroPage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (f) null);
    }

    public static final /* synthetic */ void write$Self$app_release(NewBillingThemeIntroPage newBillingThemeIntroPage, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.bannerPicUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, newBillingThemeIntroPage.bannerPicUrl);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.bannerPicPadLandUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, newBillingThemeIntroPage.bannerPicPadLandUrl);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorAccent, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, newBillingThemeIntroPage.colorAccent);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, newBillingThemeIntroPage.colorTitle);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorCountDownTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, newBillingThemeIntroPage.colorCountDownTitle);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorCountDownClock, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, newBillingThemeIntroPage.colorCountDownClock);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorCountDownClockBtm, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 6, newBillingThemeIntroPage.colorCountDownClockBtm);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorButton, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 7, newBillingThemeIntroPage.colorButton);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorButtonEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 8, newBillingThemeIntroPage.colorButtonEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorButtonText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 9, newBillingThemeIntroPage.colorButtonText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorButtonBtm, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 10, newBillingThemeIntroPage.colorButtonBtm);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeIntroPage.colorButtonBtmEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 11, newBillingThemeIntroPage.colorButtonBtmEnd);
        }
        if (!bVar.G(gVar) && m.a(newBillingThemeIntroPage.colorButtonBtmText, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 12, newBillingThemeIntroPage.colorButtonBtmText);
    }

    public final String getBannerPicPadLandUrl() {
        return this.bannerPicPadLandUrl;
    }

    public final String getBannerPicUrl() {
        return this.bannerPicUrl;
    }

    public final String getColorAccent() {
        return this.colorAccent;
    }

    public final String getColorButton() {
        return this.colorButton;
    }

    public final String getColorButtonBtm() {
        return this.colorButtonBtm;
    }

    public final String getColorButtonBtmEnd() {
        return this.colorButtonBtmEnd;
    }

    public final String getColorButtonBtmText() {
        return this.colorButtonBtmText;
    }

    public final String getColorButtonEnd() {
        return this.colorButtonEnd;
    }

    public final String getColorButtonText() {
        return this.colorButtonText;
    }

    public final String getColorCountDownClock() {
        return this.colorCountDownClock;
    }

    public final String getColorCountDownClockBtm() {
        return this.colorCountDownClockBtm;
    }

    public final String getColorCountDownTitle() {
        return this.colorCountDownTitle;
    }

    public final String getColorTitle() {
        return this.colorTitle;
    }

    public final void setBannerPicPadLandUrl(String str) {
        m.f(str, "<set-?>");
        this.bannerPicPadLandUrl = str;
    }

    public final void setBannerPicUrl(String str) {
        m.f(str, "<set-?>");
        this.bannerPicUrl = str;
    }

    public final void setColorAccent(String str) {
        m.f(str, "<set-?>");
        this.colorAccent = str;
    }

    public final void setColorButton(String str) {
        m.f(str, "<set-?>");
        this.colorButton = str;
    }

    public final void setColorButtonBtm(String str) {
        m.f(str, "<set-?>");
        this.colorButtonBtm = str;
    }

    public final void setColorButtonBtmEnd(String str) {
        m.f(str, "<set-?>");
        this.colorButtonBtmEnd = str;
    }

    public final void setColorButtonBtmText(String str) {
        m.f(str, "<set-?>");
        this.colorButtonBtmText = str;
    }

    public final void setColorButtonEnd(String str) {
        m.f(str, "<set-?>");
        this.colorButtonEnd = str;
    }

    public final void setColorButtonText(String str) {
        m.f(str, "<set-?>");
        this.colorButtonText = str;
    }

    public final void setColorCountDownClock(String str) {
        m.f(str, "<set-?>");
        this.colorCountDownClock = str;
    }

    public final void setColorCountDownClockBtm(String str) {
        m.f(str, "<set-?>");
        this.colorCountDownClockBtm = str;
    }

    public final void setColorCountDownTitle(String str) {
        m.f(str, "<set-?>");
        this.colorCountDownTitle = str;
    }

    public final void setColorTitle(String str) {
        m.f(str, "<set-?>");
        this.colorTitle = str;
    }

    public /* synthetic */ NewBillingThemeIntroPage(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.bannerPicUrl = BuildConfig.VERSION_NAME;
        } else {
            this.bannerPicUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.bannerPicPadLandUrl = BuildConfig.VERSION_NAME;
        } else {
            this.bannerPicPadLandUrl = str2;
        }
        if ((i11 & 4) == 0) {
            this.colorAccent = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccent = str3;
        }
        if ((i11 & 8) == 0) {
            this.colorTitle = BuildConfig.VERSION_NAME;
        } else {
            this.colorTitle = str4;
        }
        if ((i11 & 16) == 0) {
            this.colorCountDownTitle = BuildConfig.VERSION_NAME;
        } else {
            this.colorCountDownTitle = str5;
        }
        if ((i11 & 32) == 0) {
            this.colorCountDownClock = BuildConfig.VERSION_NAME;
        } else {
            this.colorCountDownClock = str6;
        }
        if ((i11 & 64) == 0) {
            this.colorCountDownClockBtm = BuildConfig.VERSION_NAME;
        } else {
            this.colorCountDownClockBtm = str7;
        }
        if ((i11 & 128) == 0) {
            this.colorButton = BuildConfig.VERSION_NAME;
        } else {
            this.colorButton = str8;
        }
        if ((i11 & 256) == 0) {
            this.colorButtonEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonEnd = str9;
        }
        if ((i11 & 512) == 0) {
            this.colorButtonText = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonText = str10;
        }
        if ((i11 & 1024) == 0) {
            this.colorButtonBtm = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonBtm = str11;
        }
        if ((i11 & 2048) == 0) {
            this.colorButtonBtmEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonBtmEnd = str12;
        }
        if ((i11 & 4096) == 0) {
            this.colorButtonBtmText = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonBtmText = str13;
        }
    }

    public NewBillingThemeIntroPage(String bannerPicUrl, String bannerPicPadLandUrl, String colorAccent, String colorTitle, String colorCountDownTitle, String colorCountDownClock, String colorCountDownClockBtm, String colorButton, String colorButtonEnd, String colorButtonText, String colorButtonBtm, String colorButtonBtmEnd, String colorButtonBtmText) {
        m.f(bannerPicUrl, "bannerPicUrl");
        m.f(bannerPicPadLandUrl, "bannerPicPadLandUrl");
        m.f(colorAccent, "colorAccent");
        m.f(colorTitle, "colorTitle");
        m.f(colorCountDownTitle, "colorCountDownTitle");
        m.f(colorCountDownClock, "colorCountDownClock");
        m.f(colorCountDownClockBtm, "colorCountDownClockBtm");
        m.f(colorButton, "colorButton");
        m.f(colorButtonEnd, "colorButtonEnd");
        m.f(colorButtonText, "colorButtonText");
        m.f(colorButtonBtm, "colorButtonBtm");
        m.f(colorButtonBtmEnd, "colorButtonBtmEnd");
        m.f(colorButtonBtmText, "colorButtonBtmText");
        this.bannerPicUrl = bannerPicUrl;
        this.bannerPicPadLandUrl = bannerPicPadLandUrl;
        this.colorAccent = colorAccent;
        this.colorTitle = colorTitle;
        this.colorCountDownTitle = colorCountDownTitle;
        this.colorCountDownClock = colorCountDownClock;
        this.colorCountDownClockBtm = colorCountDownClockBtm;
        this.colorButton = colorButton;
        this.colorButtonEnd = colorButtonEnd;
        this.colorButtonText = colorButtonText;
        this.colorButtonBtm = colorButtonBtm;
        this.colorButtonBtmEnd = colorButtonBtmEnd;
        this.colorButtonBtmText = colorButtonBtmText;
    }

    public /* synthetic */ NewBillingThemeIntroPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i11 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i11 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i11 & 1024) != 0 ? BuildConfig.VERSION_NAME : str11, (i11 & 2048) != 0 ? BuildConfig.VERSION_NAME : str12, (i11 & 4096) != 0 ? BuildConfig.VERSION_NAME : str13);
    }
}
