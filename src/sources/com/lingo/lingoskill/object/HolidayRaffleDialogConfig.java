package com.lingo.lingoskill.object;

import c00.e;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.material.datepicker.d;
import com.lingo.lingoskill.http.oss.MYmT.bjXGJ;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import pt.ImS.aYZzTH;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class HolidayRaffleDialogConfig {
    private String dialogButtonColor;
    private String dialogButtonText;
    private String dialogButtonTextColor;
    private String dialogCodeBgColor;
    private String dialogCodeColor;
    private String dialogCodeErrorText;
    private String dialogCopyButtonColor;
    private String dialogCopyButtonText;
    private String dialogCopyButtonTextColor;
    private String dialogExplainText;
    private String dialogExplainTextColor;
    private String dialogTitle;
    private String dialogTitleColor;
    private String linkUrl;
    private String meEntranceDrawableUrl;
    private String meEntranceTitle;
    private String meEntranceTitleColor;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return HolidayRaffleDialogConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public HolidayRaffleDialogConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
    }

    public static /* synthetic */ HolidayRaffleDialogConfig copy$default(HolidayRaffleDialogConfig holidayRaffleDialogConfig, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11, Object obj) {
        String str18;
        String str19;
        String str20 = (i11 & 1) != 0 ? holidayRaffleDialogConfig.linkUrl : str;
        String str21 = (i11 & 2) != 0 ? holidayRaffleDialogConfig.dialogTitle : str2;
        String str22 = (i11 & 4) != 0 ? holidayRaffleDialogConfig.dialogCodeErrorText : str3;
        String str23 = (i11 & 8) != 0 ? holidayRaffleDialogConfig.dialogCopyButtonText : str4;
        String str24 = (i11 & 16) != 0 ? holidayRaffleDialogConfig.dialogButtonText : str5;
        String str25 = (i11 & 32) != 0 ? holidayRaffleDialogConfig.dialogExplainText : str6;
        String str26 = (i11 & 64) != 0 ? holidayRaffleDialogConfig.dialogTitleColor : str7;
        String str27 = (i11 & 128) != 0 ? holidayRaffleDialogConfig.dialogCodeColor : str8;
        String str28 = (i11 & 256) != 0 ? holidayRaffleDialogConfig.dialogCodeBgColor : str9;
        String str29 = (i11 & 512) != 0 ? holidayRaffleDialogConfig.dialogCopyButtonColor : str10;
        String str30 = (i11 & 1024) != 0 ? holidayRaffleDialogConfig.dialogCopyButtonTextColor : str11;
        String str31 = (i11 & 2048) != 0 ? holidayRaffleDialogConfig.dialogButtonColor : str12;
        String str32 = (i11 & 4096) != 0 ? holidayRaffleDialogConfig.dialogButtonTextColor : str13;
        String str33 = (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? holidayRaffleDialogConfig.dialogExplainTextColor : str14;
        String str34 = str20;
        String str35 = (i11 & 16384) != 0 ? holidayRaffleDialogConfig.meEntranceTitle : str15;
        String str36 = (i11 & 32768) != 0 ? holidayRaffleDialogConfig.meEntranceDrawableUrl : str16;
        if ((i11 & 65536) != 0) {
            str19 = str36;
            str18 = holidayRaffleDialogConfig.meEntranceTitleColor;
        } else {
            str18 = str17;
            str19 = str36;
        }
        return holidayRaffleDialogConfig.copy(str34, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str35, str19, str18);
    }

    public final String component1() {
        return this.linkUrl;
    }

    public final String component10() {
        return this.dialogCopyButtonColor;
    }

    public final String component11() {
        return this.dialogCopyButtonTextColor;
    }

    public final String component12() {
        return this.dialogButtonColor;
    }

    public final String component13() {
        return this.dialogButtonTextColor;
    }

    public final String component14() {
        return this.dialogExplainTextColor;
    }

    public final String component15() {
        return this.meEntranceTitle;
    }

    public final String component16() {
        return this.meEntranceDrawableUrl;
    }

    public final String component17() {
        return this.meEntranceTitleColor;
    }

    public final String component2() {
        return this.dialogTitle;
    }

    public final String component3() {
        return this.dialogCodeErrorText;
    }

    public final String component4() {
        return this.dialogCopyButtonText;
    }

    public final String component5() {
        return this.dialogButtonText;
    }

    public final String component6() {
        return this.dialogExplainText;
    }

    public final String component7() {
        return this.dialogTitleColor;
    }

    public final String component8() {
        return this.dialogCodeColor;
    }

    public final String component9() {
        return this.dialogCodeBgColor;
    }

    public final HolidayRaffleDialogConfig copy(String linkUrl, String dialogTitle, String dialogCodeErrorText, String dialogCopyButtonText, String dialogButtonText, String dialogExplainText, String dialogTitleColor, String dialogCodeColor, String dialogCodeBgColor, String dialogCopyButtonColor, String dialogCopyButtonTextColor, String dialogButtonColor, String dialogButtonTextColor, String dialogExplainTextColor, String meEntranceTitle, String meEntranceDrawableUrl, String meEntranceTitleColor) {
        m.f(linkUrl, "linkUrl");
        m.f(dialogTitle, "dialogTitle");
        m.f(dialogCodeErrorText, "dialogCodeErrorText");
        m.f(dialogCopyButtonText, "dialogCopyButtonText");
        m.f(dialogButtonText, "dialogButtonText");
        m.f(dialogExplainText, "dialogExplainText");
        m.f(dialogTitleColor, "dialogTitleColor");
        m.f(dialogCodeColor, "dialogCodeColor");
        m.f(dialogCodeBgColor, "dialogCodeBgColor");
        m.f(dialogCopyButtonColor, "dialogCopyButtonColor");
        m.f(dialogCopyButtonTextColor, "dialogCopyButtonTextColor");
        m.f(dialogButtonColor, "dialogButtonColor");
        m.f(dialogButtonTextColor, "dialogButtonTextColor");
        m.f(dialogExplainTextColor, "dialogExplainTextColor");
        m.f(meEntranceTitle, "meEntranceTitle");
        m.f(meEntranceDrawableUrl, "meEntranceDrawableUrl");
        m.f(meEntranceTitleColor, "meEntranceTitleColor");
        return new HolidayRaffleDialogConfig(linkUrl, dialogTitle, dialogCodeErrorText, dialogCopyButtonText, dialogButtonText, dialogExplainText, dialogTitleColor, dialogCodeColor, dialogCodeBgColor, dialogCopyButtonColor, dialogCopyButtonTextColor, dialogButtonColor, dialogButtonTextColor, dialogExplainTextColor, meEntranceTitle, meEntranceDrawableUrl, meEntranceTitleColor);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolidayRaffleDialogConfig)) {
            return false;
        }
        HolidayRaffleDialogConfig holidayRaffleDialogConfig = (HolidayRaffleDialogConfig) obj;
        return m.a(this.linkUrl, holidayRaffleDialogConfig.linkUrl) && m.a(this.dialogTitle, holidayRaffleDialogConfig.dialogTitle) && m.a(this.dialogCodeErrorText, holidayRaffleDialogConfig.dialogCodeErrorText) && m.a(this.dialogCopyButtonText, holidayRaffleDialogConfig.dialogCopyButtonText) && m.a(this.dialogButtonText, holidayRaffleDialogConfig.dialogButtonText) && m.a(this.dialogExplainText, holidayRaffleDialogConfig.dialogExplainText) && m.a(this.dialogTitleColor, holidayRaffleDialogConfig.dialogTitleColor) && m.a(this.dialogCodeColor, holidayRaffleDialogConfig.dialogCodeColor) && m.a(this.dialogCodeBgColor, holidayRaffleDialogConfig.dialogCodeBgColor) && m.a(this.dialogCopyButtonColor, holidayRaffleDialogConfig.dialogCopyButtonColor) && m.a(this.dialogCopyButtonTextColor, holidayRaffleDialogConfig.dialogCopyButtonTextColor) && m.a(this.dialogButtonColor, holidayRaffleDialogConfig.dialogButtonColor) && m.a(this.dialogButtonTextColor, holidayRaffleDialogConfig.dialogButtonTextColor) && m.a(this.dialogExplainTextColor, holidayRaffleDialogConfig.dialogExplainTextColor) && m.a(this.meEntranceTitle, holidayRaffleDialogConfig.meEntranceTitle) && m.a(this.meEntranceDrawableUrl, holidayRaffleDialogConfig.meEntranceDrawableUrl) && m.a(this.meEntranceTitleColor, holidayRaffleDialogConfig.meEntranceTitleColor);
    }

    public final String getDialogButtonColor() {
        return this.dialogButtonColor;
    }

    public final String getDialogButtonText() {
        return this.dialogButtonText;
    }

    public final String getDialogButtonTextColor() {
        return this.dialogButtonTextColor;
    }

    public final String getDialogCodeBgColor() {
        return this.dialogCodeBgColor;
    }

    public final String getDialogCodeColor() {
        return this.dialogCodeColor;
    }

    public final String getDialogCodeErrorText() {
        return this.dialogCodeErrorText;
    }

    public final String getDialogCopyButtonColor() {
        return this.dialogCopyButtonColor;
    }

    public final String getDialogCopyButtonText() {
        return this.dialogCopyButtonText;
    }

    public final String getDialogCopyButtonTextColor() {
        return this.dialogCopyButtonTextColor;
    }

    public final String getDialogExplainText() {
        return this.dialogExplainText;
    }

    public final String getDialogExplainTextColor() {
        return this.dialogExplainTextColor;
    }

    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    public final String getDialogTitleColor() {
        return this.dialogTitleColor;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getMeEntranceDrawableUrl() {
        return this.meEntranceDrawableUrl;
    }

    public final String getMeEntranceTitle() {
        return this.meEntranceTitle;
    }

    public final String getMeEntranceTitleColor() {
        return this.meEntranceTitleColor;
    }

    public int hashCode() {
        return this.meEntranceTitleColor.hashCode() + defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(defpackage.e.d(this.linkUrl.hashCode() * 31, 31, this.dialogTitle), 31, this.dialogCodeErrorText), 31, this.dialogCopyButtonText), 31, this.dialogButtonText), 31, this.dialogExplainText), 31, this.dialogTitleColor), 31, this.dialogCodeColor), 31, this.dialogCodeBgColor), 31, this.dialogCopyButtonColor), 31, this.dialogCopyButtonTextColor), 31, this.dialogButtonColor), 31, this.dialogButtonTextColor), 31, this.dialogExplainTextColor), 31, this.meEntranceTitle), 31, this.meEntranceDrawableUrl);
    }

    public final void setDialogButtonColor(String str) {
        m.f(str, "<set-?>");
        this.dialogButtonColor = str;
    }

    public final void setDialogButtonText(String str) {
        m.f(str, "<set-?>");
        this.dialogButtonText = str;
    }

    public final void setDialogButtonTextColor(String str) {
        m.f(str, "<set-?>");
        this.dialogButtonTextColor = str;
    }

    public final void setDialogCodeBgColor(String str) {
        m.f(str, "<set-?>");
        this.dialogCodeBgColor = str;
    }

    public final void setDialogCodeColor(String str) {
        m.f(str, "<set-?>");
        this.dialogCodeColor = str;
    }

    public final void setDialogCodeErrorText(String str) {
        m.f(str, "<set-?>");
        this.dialogCodeErrorText = str;
    }

    public final void setDialogCopyButtonColor(String str) {
        m.f(str, "<set-?>");
        this.dialogCopyButtonColor = str;
    }

    public final void setDialogCopyButtonText(String str) {
        m.f(str, "<set-?>");
        this.dialogCopyButtonText = str;
    }

    public final void setDialogCopyButtonTextColor(String str) {
        m.f(str, "<set-?>");
        this.dialogCopyButtonTextColor = str;
    }

    public final void setDialogExplainText(String str) {
        m.f(str, "<set-?>");
        this.dialogExplainText = str;
    }

    public final void setDialogExplainTextColor(String str) {
        m.f(str, "<set-?>");
        this.dialogExplainTextColor = str;
    }

    public final void setDialogTitle(String str) {
        m.f(str, "<set-?>");
        this.dialogTitle = str;
    }

    public final void setDialogTitleColor(String str) {
        m.f(str, "<set-?>");
        this.dialogTitleColor = str;
    }

    public final void setLinkUrl(String str) {
        m.f(str, "<set-?>");
        this.linkUrl = str;
    }

    public final void setMeEntranceDrawableUrl(String str) {
        m.f(str, "<set-?>");
        this.meEntranceDrawableUrl = str;
    }

    public final void setMeEntranceTitle(String str) {
        m.f(str, "<set-?>");
        this.meEntranceTitle = str;
    }

    public final void setMeEntranceTitleColor(String str) {
        m.f(str, "<set-?>");
        this.meEntranceTitleColor = str;
    }

    public String toString() {
        String str = this.linkUrl;
        String str2 = this.dialogTitle;
        String str3 = this.dialogCodeErrorText;
        String str4 = this.dialogCopyButtonText;
        String str5 = this.dialogButtonText;
        String str6 = this.dialogExplainText;
        String str7 = this.dialogTitleColor;
        String str8 = this.dialogCodeColor;
        String str9 = this.dialogCodeBgColor;
        String str10 = this.dialogCopyButtonColor;
        String str11 = this.dialogCopyButtonTextColor;
        String str12 = this.dialogButtonColor;
        String str13 = this.dialogButtonTextColor;
        String str14 = this.dialogExplainTextColor;
        String str15 = this.meEntranceTitle;
        String str16 = this.meEntranceDrawableUrl;
        String str17 = this.meEntranceTitleColor;
        StringBuilder sbS = defpackage.e.s("HolidayRaffleDialogConfig(linkUrl=", str, ", dialogTitle=", str2, ", dialogCodeErrorText=");
        d.w(sbS, str3, ", dialogCopyButtonText=", str4, ", dialogButtonText=");
        d.w(sbS, str5, ", dialogExplainText=", str6, ", dialogTitleColor=");
        d.w(sbS, str7, ", dialogCodeColor=", str8, ", dialogCodeBgColor=");
        d.w(sbS, str9, ", dialogCopyButtonColor=", str10, ", dialogCopyButtonTextColor=");
        d.w(sbS, str11, ", dialogButtonColor=", str12, ", dialogButtonTextColor=");
        d.w(sbS, str13, ", dialogExplainTextColor=", str14, ", meEntranceTitle=");
        d.w(sbS, str15, ", meEntranceDrawableUrl=", str16, ", meEntranceTitleColor=");
        return ep.a.k(sbS, str17, ")");
    }

    public /* synthetic */ HolidayRaffleDialogConfig(int i11, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.linkUrl = BuildConfig.VERSION_NAME;
        } else {
            this.linkUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.dialogTitle = BuildConfig.VERSION_NAME;
        } else {
            this.dialogTitle = str2;
        }
        if ((i11 & 4) == 0) {
            this.dialogCodeErrorText = BuildConfig.VERSION_NAME;
        } else {
            this.dialogCodeErrorText = str3;
        }
        if ((i11 & 8) == 0) {
            this.dialogCopyButtonText = BuildConfig.VERSION_NAME;
        } else {
            this.dialogCopyButtonText = str4;
        }
        if ((i11 & 16) == 0) {
            this.dialogButtonText = BuildConfig.VERSION_NAME;
        } else {
            this.dialogButtonText = str5;
        }
        if ((i11 & 32) == 0) {
            this.dialogExplainText = BuildConfig.VERSION_NAME;
        } else {
            this.dialogExplainText = str6;
        }
        if ((i11 & 64) == 0) {
            this.dialogTitleColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogTitleColor = str7;
        }
        if ((i11 & 128) == 0) {
            this.dialogCodeColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogCodeColor = str8;
        }
        if ((i11 & 256) == 0) {
            this.dialogCodeBgColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogCodeBgColor = str9;
        }
        if ((i11 & 512) == 0) {
            this.dialogCopyButtonColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogCopyButtonColor = str10;
        }
        if ((i11 & 1024) == 0) {
            this.dialogCopyButtonTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogCopyButtonTextColor = str11;
        }
        if ((i11 & 2048) == 0) {
            this.dialogButtonColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogButtonColor = str12;
        }
        if ((i11 & 4096) == 0) {
            this.dialogButtonTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogButtonTextColor = str13;
        }
        if ((i11 & OSSConstants.DEFAULT_BUFFER_SIZE) == 0) {
            this.dialogExplainTextColor = BuildConfig.VERSION_NAME;
        } else {
            this.dialogExplainTextColor = str14;
        }
        if ((i11 & 16384) == 0) {
            this.meEntranceTitle = BuildConfig.VERSION_NAME;
        } else {
            this.meEntranceTitle = str15;
        }
        if ((32768 & i11) == 0) {
            this.meEntranceDrawableUrl = BuildConfig.VERSION_NAME;
        } else {
            this.meEntranceDrawableUrl = str16;
        }
        if ((i11 & 65536) == 0) {
            this.meEntranceTitleColor = BuildConfig.VERSION_NAME;
        } else {
            this.meEntranceTitleColor = str17;
        }
    }

    public HolidayRaffleDialogConfig(String str, String dialogTitle, String dialogCodeErrorText, String dialogCopyButtonText, String dialogButtonText, String dialogExplainText, String dialogTitleColor, String dialogCodeColor, String dialogCodeBgColor, String dialogCopyButtonColor, String dialogCopyButtonTextColor, String dialogButtonColor, String dialogButtonTextColor, String dialogExplainTextColor, String meEntranceTitle, String meEntranceDrawableUrl, String meEntranceTitleColor) {
        m.f(str, bjXGJ.zBGqhJoJ);
        m.f(dialogTitle, "dialogTitle");
        m.f(dialogCodeErrorText, "dialogCodeErrorText");
        m.f(dialogCopyButtonText, "dialogCopyButtonText");
        m.f(dialogButtonText, "dialogButtonText");
        m.f(dialogExplainText, "dialogExplainText");
        m.f(dialogTitleColor, "dialogTitleColor");
        m.f(dialogCodeColor, "dialogCodeColor");
        m.f(dialogCodeBgColor, "dialogCodeBgColor");
        m.f(dialogCopyButtonColor, "dialogCopyButtonColor");
        m.f(dialogCopyButtonTextColor, "dialogCopyButtonTextColor");
        m.f(dialogButtonColor, "dialogButtonColor");
        m.f(dialogButtonTextColor, "dialogButtonTextColor");
        m.f(dialogExplainTextColor, "dialogExplainTextColor");
        m.f(meEntranceTitle, "meEntranceTitle");
        m.f(meEntranceDrawableUrl, "meEntranceDrawableUrl");
        m.f(meEntranceTitleColor, "meEntranceTitleColor");
        this.linkUrl = str;
        this.dialogTitle = dialogTitle;
        this.dialogCodeErrorText = dialogCodeErrorText;
        this.dialogCopyButtonText = dialogCopyButtonText;
        this.dialogButtonText = dialogButtonText;
        this.dialogExplainText = dialogExplainText;
        this.dialogTitleColor = dialogTitleColor;
        this.dialogCodeColor = dialogCodeColor;
        this.dialogCodeBgColor = dialogCodeBgColor;
        this.dialogCopyButtonColor = dialogCopyButtonColor;
        this.dialogCopyButtonTextColor = dialogCopyButtonTextColor;
        this.dialogButtonColor = dialogButtonColor;
        this.dialogButtonTextColor = dialogButtonTextColor;
        this.dialogExplainTextColor = dialogExplainTextColor;
        this.meEntranceTitle = meEntranceTitle;
        this.meEntranceDrawableUrl = meEntranceDrawableUrl;
        this.meEntranceTitleColor = meEntranceTitleColor;
    }

    public static final /* synthetic */ void write$Self$app_release(HolidayRaffleDialogConfig holidayRaffleDialogConfig, b bVar, g gVar) {
        boolean zG = bVar.G(gVar);
        String str = aYZzTH.ppiDMAOEIJclXtx;
        if (zG || !m.a(holidayRaffleDialogConfig.linkUrl, str)) {
            bVar.w(gVar, 0, holidayRaffleDialogConfig.linkUrl);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogTitle, str)) {
            bVar.w(gVar, 1, holidayRaffleDialogConfig.dialogTitle);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogCodeErrorText, str)) {
            bVar.w(gVar, 2, holidayRaffleDialogConfig.dialogCodeErrorText);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogCopyButtonText, str)) {
            bVar.w(gVar, 3, holidayRaffleDialogConfig.dialogCopyButtonText);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogButtonText, str)) {
            bVar.w(gVar, 4, holidayRaffleDialogConfig.dialogButtonText);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogExplainText, str)) {
            bVar.w(gVar, 5, holidayRaffleDialogConfig.dialogExplainText);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogTitleColor, str)) {
            bVar.w(gVar, 6, holidayRaffleDialogConfig.dialogTitleColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogCodeColor, str)) {
            bVar.w(gVar, 7, holidayRaffleDialogConfig.dialogCodeColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogCodeBgColor, str)) {
            bVar.w(gVar, 8, holidayRaffleDialogConfig.dialogCodeBgColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogCopyButtonColor, str)) {
            bVar.w(gVar, 9, holidayRaffleDialogConfig.dialogCopyButtonColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogCopyButtonTextColor, str)) {
            bVar.w(gVar, 10, holidayRaffleDialogConfig.dialogCopyButtonTextColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogButtonColor, str)) {
            bVar.w(gVar, 11, holidayRaffleDialogConfig.dialogButtonColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogButtonTextColor, str)) {
            bVar.w(gVar, 12, holidayRaffleDialogConfig.dialogButtonTextColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.dialogExplainTextColor, str)) {
            bVar.w(gVar, 13, holidayRaffleDialogConfig.dialogExplainTextColor);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.meEntranceTitle, str)) {
            bVar.w(gVar, 14, holidayRaffleDialogConfig.meEntranceTitle);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.meEntranceDrawableUrl, str)) {
            bVar.w(gVar, 15, holidayRaffleDialogConfig.meEntranceDrawableUrl);
        }
        if (bVar.G(gVar) || !m.a(holidayRaffleDialogConfig.meEntranceTitleColor, str)) {
            bVar.w(gVar, 16, holidayRaffleDialogConfig.meEntranceTitleColor);
        }
    }

    public /* synthetic */ HolidayRaffleDialogConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? BuildConfig.VERSION_NAME : str2, (i11 & 4) != 0 ? BuildConfig.VERSION_NAME : str3, (i11 & 8) != 0 ? BuildConfig.VERSION_NAME : str4, (i11 & 16) != 0 ? BuildConfig.VERSION_NAME : str5, (i11 & 32) != 0 ? BuildConfig.VERSION_NAME : str6, (i11 & 64) != 0 ? BuildConfig.VERSION_NAME : str7, (i11 & 128) != 0 ? BuildConfig.VERSION_NAME : str8, (i11 & 256) != 0 ? BuildConfig.VERSION_NAME : str9, (i11 & 512) != 0 ? BuildConfig.VERSION_NAME : str10, (i11 & 1024) != 0 ? BuildConfig.VERSION_NAME : str11, (i11 & 2048) != 0 ? BuildConfig.VERSION_NAME : str12, (i11 & 4096) != 0 ? BuildConfig.VERSION_NAME : str13, (i11 & OSSConstants.DEFAULT_BUFFER_SIZE) != 0 ? BuildConfig.VERSION_NAME : str14, (i11 & 16384) != 0 ? BuildConfig.VERSION_NAME : str15, (i11 & 32768) != 0 ? BuildConfig.VERSION_NAME : str16, (i11 & 65536) != 0 ? BuildConfig.VERSION_NAME : str17);
    }
}
