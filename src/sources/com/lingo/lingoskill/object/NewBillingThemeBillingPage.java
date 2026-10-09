package com.lingo.lingoskill.object;

import c00.e;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import su.Mbl.tcppUUQxZjFdy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class NewBillingThemeBillingPage {
    private String bannerPicPadLandUrl;
    private String bannerPicUrl;
    private String colorAccent;
    private String colorActivityFAQ;
    private String colorBackgroundEnd;
    private String colorBackgroundStart;
    private String colorBottomText1;
    private String colorBottomText2;
    private String colorBottomText3;
    private String colorButton;
    private String colorButtonBuyYearly;
    private String colorButtonBuyYearlyEnd;
    private String colorButtonBuyYearlyText;
    private String colorButtonEnd;
    private String colorButtonText;
    private String colorCountDownClock;
    private String colorCountDownTitle;
    private String colorLifeTimeCard;
    private String colorLifeTimeCardEnd;
    private String colorLifeTimeCardStroke;
    private String colorLifeTimeCardText;
    private String colorLifeTimeCheckedIcon;
    private String colorLifeTimeCheckedIconBg;
    private String colorLifeTimeTag;
    private String colorLifeTimeTagEnd;
    private String colorLifeTimeTagText;
    private String colorOthersCard;
    private String colorOthersCardEnd;
    private String colorOthersCardStroke;
    private String colorOthersCardText;
    private String colorOthersCheckedIcon;
    private String colorOthersCheckedIconBg;
    private String colorTitle;
    private String colorYearlyCard;
    private String colorYearlyCardEnd;
    private String colorYearlyCardStroke;
    private String colorYearlyCardText;
    private String colorYearlyCheckedIcon;
    private String colorYearlyCheckedIconBg;
    private String colorYearlyCountDownTag;
    private String colorYearlyCountDownTagEnd;
    private String colorYearlyCountDownTagText;
    private String colorYearlyTag;
    private String colorYearlyTagEnd;
    private String colorYearlyTagText;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return NewBillingThemeBillingPage$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public NewBillingThemeBillingPage() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (f) null);
    }

    public static final /* synthetic */ void write$Self$app_release(NewBillingThemeBillingPage newBillingThemeBillingPage, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.bannerPicUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, newBillingThemeBillingPage.bannerPicUrl);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.bannerPicPadLandUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 1, newBillingThemeBillingPage.bannerPicPadLandUrl);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorBackgroundStart, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 2, newBillingThemeBillingPage.colorBackgroundStart);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorBackgroundEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, newBillingThemeBillingPage.colorBackgroundEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorAccent, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 4, newBillingThemeBillingPage.colorAccent);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 5, newBillingThemeBillingPage.colorTitle);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorBottomText1, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 6, newBillingThemeBillingPage.colorBottomText1);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorBottomText2, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 7, newBillingThemeBillingPage.colorBottomText2);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorBottomText3, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 8, newBillingThemeBillingPage.colorBottomText3);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorCountDownTitle, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 9, newBillingThemeBillingPage.colorCountDownTitle);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorCountDownClock, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 10, newBillingThemeBillingPage.colorCountDownClock);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyTag, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 11, newBillingThemeBillingPage.colorYearlyTag);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyTagEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 12, newBillingThemeBillingPage.colorYearlyTagEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyTagText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 13, newBillingThemeBillingPage.colorYearlyTagText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCountDownTag, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 14, newBillingThemeBillingPage.colorYearlyCountDownTag);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCountDownTagEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 15, newBillingThemeBillingPage.colorYearlyCountDownTagEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCountDownTagText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 16, newBillingThemeBillingPage.colorYearlyCountDownTagText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCheckedIcon, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 17, newBillingThemeBillingPage.colorYearlyCheckedIcon);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCheckedIconBg, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 18, newBillingThemeBillingPage.colorYearlyCheckedIconBg);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCard, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 19, newBillingThemeBillingPage.colorYearlyCard);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCardEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 20, newBillingThemeBillingPage.colorYearlyCardEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCardText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 21, newBillingThemeBillingPage.colorYearlyCardText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorYearlyCardStroke, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 22, newBillingThemeBillingPage.colorYearlyCardStroke);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorOthersCheckedIcon, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 23, newBillingThemeBillingPage.colorOthersCheckedIcon);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorOthersCheckedIconBg, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 24, newBillingThemeBillingPage.colorOthersCheckedIconBg);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorOthersCard, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 25, newBillingThemeBillingPage.colorOthersCard);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorOthersCardEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 26, newBillingThemeBillingPage.colorOthersCardEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorOthersCardText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 27, newBillingThemeBillingPage.colorOthersCardText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorOthersCardStroke, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 28, newBillingThemeBillingPage.colorOthersCardStroke);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeTag, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 29, newBillingThemeBillingPage.colorLifeTimeTag);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeTagEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 30, newBillingThemeBillingPage.colorLifeTimeTagEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeTagText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 31, newBillingThemeBillingPage.colorLifeTimeTagText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeCheckedIcon, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 32, newBillingThemeBillingPage.colorLifeTimeCheckedIcon);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeCheckedIconBg, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 33, newBillingThemeBillingPage.colorLifeTimeCheckedIconBg);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeCard, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 34, newBillingThemeBillingPage.colorLifeTimeCard);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeCardEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 35, newBillingThemeBillingPage.colorLifeTimeCardEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeCardText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 36, newBillingThemeBillingPage.colorLifeTimeCardText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorLifeTimeCardStroke, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 37, newBillingThemeBillingPage.colorLifeTimeCardStroke);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorActivityFAQ, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 38, newBillingThemeBillingPage.colorActivityFAQ);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorButton, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 39, newBillingThemeBillingPage.colorButton);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorButtonEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 40, newBillingThemeBillingPage.colorButtonEnd);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorButtonText, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 41, newBillingThemeBillingPage.colorButtonText);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorButtonBuyYearly, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 42, newBillingThemeBillingPage.colorButtonBuyYearly);
        }
        if (bVar.G(gVar) || !m.a(newBillingThemeBillingPage.colorButtonBuyYearlyEnd, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 43, newBillingThemeBillingPage.colorButtonBuyYearlyEnd);
        }
        if (!bVar.G(gVar) && m.a(newBillingThemeBillingPage.colorButtonBuyYearlyText, BuildConfig.VERSION_NAME)) {
            return;
        }
        bVar.w(gVar, 44, newBillingThemeBillingPage.colorButtonBuyYearlyText);
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

    public final String getColorActivityFAQ() {
        return this.colorActivityFAQ;
    }

    public final String getColorBackgroundEnd() {
        return this.colorBackgroundEnd;
    }

    public final String getColorBackgroundStart() {
        return this.colorBackgroundStart;
    }

    public final String getColorBottomText1() {
        return this.colorBottomText1;
    }

    public final String getColorBottomText2() {
        return this.colorBottomText2;
    }

    public final String getColorBottomText3() {
        return this.colorBottomText3;
    }

    public final String getColorButton() {
        return this.colorButton;
    }

    public final String getColorButtonBuyYearly() {
        return this.colorButtonBuyYearly;
    }

    public final String getColorButtonBuyYearlyEnd() {
        return this.colorButtonBuyYearlyEnd;
    }

    public final String getColorButtonBuyYearlyText() {
        return this.colorButtonBuyYearlyText;
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

    public final String getColorCountDownTitle() {
        return this.colorCountDownTitle;
    }

    public final String getColorLifeTimeCard() {
        return this.colorLifeTimeCard;
    }

    public final String getColorLifeTimeCardEnd() {
        return this.colorLifeTimeCardEnd;
    }

    public final String getColorLifeTimeCardStroke() {
        return this.colorLifeTimeCardStroke;
    }

    public final String getColorLifeTimeCardText() {
        return this.colorLifeTimeCardText;
    }

    public final String getColorLifeTimeCheckedIcon() {
        return this.colorLifeTimeCheckedIcon;
    }

    public final String getColorLifeTimeCheckedIconBg() {
        return this.colorLifeTimeCheckedIconBg;
    }

    public final String getColorLifeTimeTag() {
        return this.colorLifeTimeTag;
    }

    public final String getColorLifeTimeTagEnd() {
        return this.colorLifeTimeTagEnd;
    }

    public final String getColorLifeTimeTagText() {
        return this.colorLifeTimeTagText;
    }

    public final String getColorOthersCard() {
        return this.colorOthersCard;
    }

    public final String getColorOthersCardEnd() {
        return this.colorOthersCardEnd;
    }

    public final String getColorOthersCardStroke() {
        return this.colorOthersCardStroke;
    }

    public final String getColorOthersCardText() {
        return this.colorOthersCardText;
    }

    public final String getColorOthersCheckedIcon() {
        return this.colorOthersCheckedIcon;
    }

    public final String getColorOthersCheckedIconBg() {
        return this.colorOthersCheckedIconBg;
    }

    public final String getColorTitle() {
        return this.colorTitle;
    }

    public final String getColorYearlyCard() {
        return this.colorYearlyCard;
    }

    public final String getColorYearlyCardEnd() {
        return this.colorYearlyCardEnd;
    }

    public final String getColorYearlyCardStroke() {
        return this.colorYearlyCardStroke;
    }

    public final String getColorYearlyCardText() {
        return this.colorYearlyCardText;
    }

    public final String getColorYearlyCheckedIcon() {
        return this.colorYearlyCheckedIcon;
    }

    public final String getColorYearlyCheckedIconBg() {
        return this.colorYearlyCheckedIconBg;
    }

    public final String getColorYearlyCountDownTag() {
        return this.colorYearlyCountDownTag;
    }

    public final String getColorYearlyCountDownTagEnd() {
        return this.colorYearlyCountDownTagEnd;
    }

    public final String getColorYearlyCountDownTagText() {
        return this.colorYearlyCountDownTagText;
    }

    public final String getColorYearlyTag() {
        return this.colorYearlyTag;
    }

    public final String getColorYearlyTagEnd() {
        return this.colorYearlyTagEnd;
    }

    public final String getColorYearlyTagText() {
        return this.colorYearlyTagText;
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

    public final void setColorActivityFAQ(String str) {
        m.f(str, "<set-?>");
        this.colorActivityFAQ = str;
    }

    public final void setColorBackgroundEnd(String str) {
        m.f(str, "<set-?>");
        this.colorBackgroundEnd = str;
    }

    public final void setColorBackgroundStart(String str) {
        m.f(str, "<set-?>");
        this.colorBackgroundStart = str;
    }

    public final void setColorBottomText1(String str) {
        m.f(str, "<set-?>");
        this.colorBottomText1 = str;
    }

    public final void setColorBottomText2(String str) {
        m.f(str, "<set-?>");
        this.colorBottomText2 = str;
    }

    public final void setColorBottomText3(String str) {
        m.f(str, "<set-?>");
        this.colorBottomText3 = str;
    }

    public final void setColorButton(String str) {
        m.f(str, "<set-?>");
        this.colorButton = str;
    }

    public final void setColorButtonBuyYearly(String str) {
        m.f(str, "<set-?>");
        this.colorButtonBuyYearly = str;
    }

    public final void setColorButtonBuyYearlyEnd(String str) {
        m.f(str, "<set-?>");
        this.colorButtonBuyYearlyEnd = str;
    }

    public final void setColorButtonBuyYearlyText(String str) {
        m.f(str, "<set-?>");
        this.colorButtonBuyYearlyText = str;
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

    public final void setColorCountDownTitle(String str) {
        m.f(str, "<set-?>");
        this.colorCountDownTitle = str;
    }

    public final void setColorLifeTimeCard(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeCard = str;
    }

    public final void setColorLifeTimeCardEnd(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeCardEnd = str;
    }

    public final void setColorLifeTimeCardStroke(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeCardStroke = str;
    }

    public final void setColorLifeTimeCardText(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeCardText = str;
    }

    public final void setColorLifeTimeCheckedIcon(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeCheckedIcon = str;
    }

    public final void setColorLifeTimeCheckedIconBg(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeCheckedIconBg = str;
    }

    public final void setColorLifeTimeTag(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeTag = str;
    }

    public final void setColorLifeTimeTagEnd(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeTagEnd = str;
    }

    public final void setColorLifeTimeTagText(String str) {
        m.f(str, "<set-?>");
        this.colorLifeTimeTagText = str;
    }

    public final void setColorOthersCard(String str) {
        m.f(str, "<set-?>");
        this.colorOthersCard = str;
    }

    public final void setColorOthersCardEnd(String str) {
        m.f(str, "<set-?>");
        this.colorOthersCardEnd = str;
    }

    public final void setColorOthersCardStroke(String str) {
        m.f(str, "<set-?>");
        this.colorOthersCardStroke = str;
    }

    public final void setColorOthersCardText(String str) {
        m.f(str, "<set-?>");
        this.colorOthersCardText = str;
    }

    public final void setColorOthersCheckedIcon(String str) {
        m.f(str, "<set-?>");
        this.colorOthersCheckedIcon = str;
    }

    public final void setColorOthersCheckedIconBg(String str) {
        m.f(str, "<set-?>");
        this.colorOthersCheckedIconBg = str;
    }

    public final void setColorTitle(String str) {
        m.f(str, "<set-?>");
        this.colorTitle = str;
    }

    public final void setColorYearlyCard(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCard = str;
    }

    public final void setColorYearlyCardEnd(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCardEnd = str;
    }

    public final void setColorYearlyCardStroke(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCardStroke = str;
    }

    public final void setColorYearlyCheckedIcon(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCheckedIcon = str;
    }

    public final void setColorYearlyCheckedIconBg(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCheckedIconBg = str;
    }

    public final void setColorYearlyCountDownTag(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCountDownTag = str;
    }

    public final void setColorYearlyCountDownTagEnd(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCountDownTagEnd = str;
    }

    public final void setColorYearlyCountDownTagText(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyCountDownTagText = str;
    }

    public final void setColorYearlyTag(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyTag = str;
    }

    public final void setColorYearlyTagEnd(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyTagEnd = str;
    }

    public final void setColorYearlyTagText(String str) {
        m.f(str, "<set-?>");
        this.colorYearlyTagText = str;
    }

    public /* synthetic */ NewBillingThemeBillingPage(int i11, int i12, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, o1 o1Var) {
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
            this.colorBackgroundStart = BuildConfig.VERSION_NAME;
        } else {
            this.colorBackgroundStart = str3;
        }
        if ((i11 & 8) == 0) {
            this.colorBackgroundEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorBackgroundEnd = str4;
        }
        if ((i11 & 16) == 0) {
            this.colorAccent = BuildConfig.VERSION_NAME;
        } else {
            this.colorAccent = str5;
        }
        if ((i11 & 32) == 0) {
            this.colorTitle = BuildConfig.VERSION_NAME;
        } else {
            this.colorTitle = str6;
        }
        if ((i11 & 64) == 0) {
            this.colorBottomText1 = BuildConfig.VERSION_NAME;
        } else {
            this.colorBottomText1 = str7;
        }
        if ((i11 & 128) == 0) {
            this.colorBottomText2 = BuildConfig.VERSION_NAME;
        } else {
            this.colorBottomText2 = str8;
        }
        if ((i11 & 256) == 0) {
            this.colorBottomText3 = BuildConfig.VERSION_NAME;
        } else {
            this.colorBottomText3 = str9;
        }
        if ((i11 & 512) == 0) {
            this.colorCountDownTitle = BuildConfig.VERSION_NAME;
        } else {
            this.colorCountDownTitle = str10;
        }
        if ((i11 & 1024) == 0) {
            this.colorCountDownClock = BuildConfig.VERSION_NAME;
        } else {
            this.colorCountDownClock = str11;
        }
        if ((i11 & 2048) == 0) {
            this.colorYearlyTag = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyTag = str12;
        }
        if ((i11 & 4096) == 0) {
            this.colorYearlyTagEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyTagEnd = str13;
        }
        if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
            this.colorYearlyTagText = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyTagText = str14;
        }
        if ((i11 & 16384) == 0) {
            this.colorYearlyCountDownTag = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCountDownTag = str15;
        }
        if ((32768 & i11) == 0) {
            this.colorYearlyCountDownTagEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCountDownTagEnd = str16;
        }
        if ((65536 & i11) == 0) {
            this.colorYearlyCountDownTagText = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCountDownTagText = str17;
        }
        if ((131072 & i11) == 0) {
            this.colorYearlyCheckedIcon = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCheckedIcon = str18;
        }
        if ((262144 & i11) == 0) {
            this.colorYearlyCheckedIconBg = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCheckedIconBg = str19;
        }
        if ((524288 & i11) == 0) {
            this.colorYearlyCard = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCard = str20;
        }
        if ((1048576 & i11) == 0) {
            this.colorYearlyCardEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCardEnd = str21;
        }
        if ((2097152 & i11) == 0) {
            this.colorYearlyCardText = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCardText = str22;
        }
        if ((4194304 & i11) == 0) {
            this.colorYearlyCardStroke = BuildConfig.VERSION_NAME;
        } else {
            this.colorYearlyCardStroke = str23;
        }
        if ((8388608 & i11) == 0) {
            this.colorOthersCheckedIcon = BuildConfig.VERSION_NAME;
        } else {
            this.colorOthersCheckedIcon = str24;
        }
        if ((16777216 & i11) == 0) {
            this.colorOthersCheckedIconBg = BuildConfig.VERSION_NAME;
        } else {
            this.colorOthersCheckedIconBg = str25;
        }
        if ((33554432 & i11) == 0) {
            this.colorOthersCard = BuildConfig.VERSION_NAME;
        } else {
            this.colorOthersCard = str26;
        }
        if ((67108864 & i11) == 0) {
            this.colorOthersCardEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorOthersCardEnd = str27;
        }
        if ((134217728 & i11) == 0) {
            this.colorOthersCardText = BuildConfig.VERSION_NAME;
        } else {
            this.colorOthersCardText = str28;
        }
        if ((268435456 & i11) == 0) {
            this.colorOthersCardStroke = BuildConfig.VERSION_NAME;
        } else {
            this.colorOthersCardStroke = str29;
        }
        if ((536870912 & i11) == 0) {
            this.colorLifeTimeTag = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeTag = str30;
        }
        if ((1073741824 & i11) == 0) {
            this.colorLifeTimeTagEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeTagEnd = str31;
        }
        if ((i11 & Integer.MIN_VALUE) == 0) {
            this.colorLifeTimeTagText = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeTagText = str32;
        }
        if ((i12 & 1) == 0) {
            this.colorLifeTimeCheckedIcon = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeCheckedIcon = str33;
        }
        if ((i12 & 2) == 0) {
            this.colorLifeTimeCheckedIconBg = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeCheckedIconBg = str34;
        }
        if ((i12 & 4) == 0) {
            this.colorLifeTimeCard = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeCard = str35;
        }
        if ((i12 & 8) == 0) {
            this.colorLifeTimeCardEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeCardEnd = str36;
        }
        if ((i12 & 16) == 0) {
            this.colorLifeTimeCardText = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeCardText = str37;
        }
        if ((i12 & 32) == 0) {
            this.colorLifeTimeCardStroke = BuildConfig.VERSION_NAME;
        } else {
            this.colorLifeTimeCardStroke = str38;
        }
        if ((i12 & 64) == 0) {
            this.colorActivityFAQ = BuildConfig.VERSION_NAME;
        } else {
            this.colorActivityFAQ = str39;
        }
        if ((i12 & 128) == 0) {
            this.colorButton = BuildConfig.VERSION_NAME;
        } else {
            this.colorButton = str40;
        }
        if ((i12 & 256) == 0) {
            this.colorButtonEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonEnd = str41;
        }
        if ((i12 & 512) == 0) {
            this.colorButtonText = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonText = str42;
        }
        if ((i12 & 1024) == 0) {
            this.colorButtonBuyYearly = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonBuyYearly = str43;
        }
        if ((i12 & 2048) == 0) {
            this.colorButtonBuyYearlyEnd = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonBuyYearlyEnd = str44;
        }
        if ((i12 & 4096) == 0) {
            this.colorButtonBuyYearlyText = BuildConfig.VERSION_NAME;
        } else {
            this.colorButtonBuyYearlyText = str45;
        }
    }

    public final void setColorYearlyCardText(String str) {
        m.f(str, tcppUUQxZjFdy.PXPqPAvK);
        this.colorYearlyCardText = str;
    }

    public NewBillingThemeBillingPage(String bannerPicUrl, String bannerPicPadLandUrl, String colorBackgroundStart, String colorBackgroundEnd, String colorAccent, String colorTitle, String colorBottomText1, String colorBottomText2, String colorBottomText3, String colorCountDownTitle, String colorCountDownClock, String colorYearlyTag, String colorYearlyTagEnd, String colorYearlyTagText, String colorYearlyCountDownTag, String colorYearlyCountDownTagEnd, String colorYearlyCountDownTagText, String colorYearlyCheckedIcon, String colorYearlyCheckedIconBg, String colorYearlyCard, String colorYearlyCardEnd, String colorYearlyCardText, String colorYearlyCardStroke, String colorOthersCheckedIcon, String colorOthersCheckedIconBg, String colorOthersCard, String colorOthersCardEnd, String colorOthersCardText, String colorOthersCardStroke, String colorLifeTimeTag, String colorLifeTimeTagEnd, String colorLifeTimeTagText, String colorLifeTimeCheckedIcon, String colorLifeTimeCheckedIconBg, String colorLifeTimeCard, String colorLifeTimeCardEnd, String colorLifeTimeCardText, String colorLifeTimeCardStroke, String colorActivityFAQ, String colorButton, String colorButtonEnd, String colorButtonText, String colorButtonBuyYearly, String colorButtonBuyYearlyEnd, String colorButtonBuyYearlyText) {
        m.f(bannerPicUrl, "bannerPicUrl");
        m.f(bannerPicPadLandUrl, "bannerPicPadLandUrl");
        m.f(colorBackgroundStart, "colorBackgroundStart");
        m.f(colorBackgroundEnd, "colorBackgroundEnd");
        m.f(colorAccent, "colorAccent");
        m.f(colorTitle, "colorTitle");
        m.f(colorBottomText1, "colorBottomText1");
        m.f(colorBottomText2, "colorBottomText2");
        m.f(colorBottomText3, "colorBottomText3");
        m.f(colorCountDownTitle, "colorCountDownTitle");
        m.f(colorCountDownClock, "colorCountDownClock");
        m.f(colorYearlyTag, "colorYearlyTag");
        m.f(colorYearlyTagEnd, "colorYearlyTagEnd");
        m.f(colorYearlyTagText, "colorYearlyTagText");
        m.f(colorYearlyCountDownTag, "colorYearlyCountDownTag");
        m.f(colorYearlyCountDownTagEnd, "colorYearlyCountDownTagEnd");
        m.f(colorYearlyCountDownTagText, "colorYearlyCountDownTagText");
        m.f(colorYearlyCheckedIcon, "colorYearlyCheckedIcon");
        m.f(colorYearlyCheckedIconBg, "colorYearlyCheckedIconBg");
        m.f(colorYearlyCard, "colorYearlyCard");
        m.f(colorYearlyCardEnd, "colorYearlyCardEnd");
        m.f(colorYearlyCardText, "colorYearlyCardText");
        m.f(colorYearlyCardStroke, "colorYearlyCardStroke");
        m.f(colorOthersCheckedIcon, "colorOthersCheckedIcon");
        m.f(colorOthersCheckedIconBg, "colorOthersCheckedIconBg");
        m.f(colorOthersCard, "colorOthersCard");
        m.f(colorOthersCardEnd, "colorOthersCardEnd");
        m.f(colorOthersCardText, "colorOthersCardText");
        m.f(colorOthersCardStroke, "colorOthersCardStroke");
        m.f(colorLifeTimeTag, "colorLifeTimeTag");
        m.f(colorLifeTimeTagEnd, "colorLifeTimeTagEnd");
        m.f(colorLifeTimeTagText, "colorLifeTimeTagText");
        m.f(colorLifeTimeCheckedIcon, "colorLifeTimeCheckedIcon");
        m.f(colorLifeTimeCheckedIconBg, "colorLifeTimeCheckedIconBg");
        m.f(colorLifeTimeCard, "colorLifeTimeCard");
        m.f(colorLifeTimeCardEnd, "colorLifeTimeCardEnd");
        m.f(colorLifeTimeCardText, "colorLifeTimeCardText");
        m.f(colorLifeTimeCardStroke, "colorLifeTimeCardStroke");
        m.f(colorActivityFAQ, "colorActivityFAQ");
        m.f(colorButton, "colorButton");
        m.f(colorButtonEnd, "colorButtonEnd");
        m.f(colorButtonText, "colorButtonText");
        m.f(colorButtonBuyYearly, "colorButtonBuyYearly");
        m.f(colorButtonBuyYearlyEnd, "colorButtonBuyYearlyEnd");
        m.f(colorButtonBuyYearlyText, "colorButtonBuyYearlyText");
        this.bannerPicUrl = bannerPicUrl;
        this.bannerPicPadLandUrl = bannerPicPadLandUrl;
        this.colorBackgroundStart = colorBackgroundStart;
        this.colorBackgroundEnd = colorBackgroundEnd;
        this.colorAccent = colorAccent;
        this.colorTitle = colorTitle;
        this.colorBottomText1 = colorBottomText1;
        this.colorBottomText2 = colorBottomText2;
        this.colorBottomText3 = colorBottomText3;
        this.colorCountDownTitle = colorCountDownTitle;
        this.colorCountDownClock = colorCountDownClock;
        this.colorYearlyTag = colorYearlyTag;
        this.colorYearlyTagEnd = colorYearlyTagEnd;
        this.colorYearlyTagText = colorYearlyTagText;
        this.colorYearlyCountDownTag = colorYearlyCountDownTag;
        this.colorYearlyCountDownTagEnd = colorYearlyCountDownTagEnd;
        this.colorYearlyCountDownTagText = colorYearlyCountDownTagText;
        this.colorYearlyCheckedIcon = colorYearlyCheckedIcon;
        this.colorYearlyCheckedIconBg = colorYearlyCheckedIconBg;
        this.colorYearlyCard = colorYearlyCard;
        this.colorYearlyCardEnd = colorYearlyCardEnd;
        this.colorYearlyCardText = colorYearlyCardText;
        this.colorYearlyCardStroke = colorYearlyCardStroke;
        this.colorOthersCheckedIcon = colorOthersCheckedIcon;
        this.colorOthersCheckedIconBg = colorOthersCheckedIconBg;
        this.colorOthersCard = colorOthersCard;
        this.colorOthersCardEnd = colorOthersCardEnd;
        this.colorOthersCardText = colorOthersCardText;
        this.colorOthersCardStroke = colorOthersCardStroke;
        this.colorLifeTimeTag = colorLifeTimeTag;
        this.colorLifeTimeTagEnd = colorLifeTimeTagEnd;
        this.colorLifeTimeTagText = colorLifeTimeTagText;
        this.colorLifeTimeCheckedIcon = colorLifeTimeCheckedIcon;
        this.colorLifeTimeCheckedIconBg = colorLifeTimeCheckedIconBg;
        this.colorLifeTimeCard = colorLifeTimeCard;
        this.colorLifeTimeCardEnd = colorLifeTimeCardEnd;
        this.colorLifeTimeCardText = colorLifeTimeCardText;
        this.colorLifeTimeCardStroke = colorLifeTimeCardStroke;
        this.colorActivityFAQ = colorActivityFAQ;
        this.colorButton = colorButton;
        this.colorButtonEnd = colorButtonEnd;
        this.colorButtonText = colorButtonText;
        this.colorButtonBuyYearly = colorButtonBuyYearly;
        this.colorButtonBuyYearlyEnd = colorButtonBuyYearlyEnd;
        this.colorButtonBuyYearlyText = colorButtonBuyYearlyText;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ NewBillingThemeBillingPage(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, int i11, int i12, f fVar) {
        String str46 = (i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str;
        this(str46, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i11 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i11 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i11 & 1024) != 0 ? BuildConfig.VERSION_NAME : str11, (i11 & 2048) != 0 ? BuildConfig.VERSION_NAME : str12, (i11 & 4096) != 0 ? BuildConfig.VERSION_NAME : str13, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str14, (i11 & 16384) != 0 ? BuildConfig.VERSION_NAME : str15, (i11 & 32768) != 0 ? BuildConfig.VERSION_NAME : str16, (i11 & 65536) != 0 ? BuildConfig.VERSION_NAME : str17, (i11 & OSSConstants.DEFAULT_STREAM_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str18, (i11 & 262144) != 0 ? BuildConfig.VERSION_NAME : str19, (i11 & 524288) != 0 ? BuildConfig.VERSION_NAME : str20, (i11 & 1048576) != 0 ? BuildConfig.VERSION_NAME : str21, (i11 & 2097152) != 0 ? BuildConfig.VERSION_NAME : str22, (i11 & 4194304) != 0 ? BuildConfig.VERSION_NAME : str23, (i11 & 8388608) != 0 ? BuildConfig.VERSION_NAME : str24, (i11 & 16777216) != 0 ? BuildConfig.VERSION_NAME : str25, (i11 & 33554432) != 0 ? BuildConfig.VERSION_NAME : str26, (i11 & 67108864) != 0 ? BuildConfig.VERSION_NAME : str27, (i11 & 134217728) != 0 ? BuildConfig.VERSION_NAME : str28, (i11 & 268435456) != 0 ? BuildConfig.VERSION_NAME : str29, (i11 & 536870912) != 0 ? BuildConfig.VERSION_NAME : str30, (i11 & 1073741824) != 0 ? BuildConfig.VERSION_NAME : str31, (i11 & Integer.MIN_VALUE) != 0 ? BuildConfig.VERSION_NAME : str32, (i12 & 1) != 0 ? BuildConfig.VERSION_NAME : str33, (i12 & 2) != 0 ? BuildConfig.VERSION_NAME : str34, (i12 & 4) != 0 ? BuildConfig.VERSION_NAME : str35, (i12 & 8) != 0 ? BuildConfig.VERSION_NAME : str36, (i12 & 16) != 0 ? BuildConfig.VERSION_NAME : str37, (i12 & 32) != 0 ? BuildConfig.VERSION_NAME : str38, (i12 & 64) != 0 ? BuildConfig.VERSION_NAME : str39, (i12 & 128) != 0 ? BuildConfig.VERSION_NAME : str40, (i12 & 256) != 0 ? BuildConfig.VERSION_NAME : str41, (i12 & 512) != 0 ? BuildConfig.VERSION_NAME : str42, (i12 & 1024) != 0 ? BuildConfig.VERSION_NAME : str43, (i12 & 2048) != 0 ? BuildConfig.VERSION_NAME : str44, (i12 & 4096) != 0 ? BuildConfig.VERSION_NAME : str45);
    }
}
