package com.lingo.lingoskill.object;

import c00.e;
import com.tbruyelle.rxpermissions3.BuildConfig;
import e00.g;
import f00.b;
import fa.EQx.nuRcCS;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class BillingPageConfig {
    private BillingPage billingPage;
    private IntroPage introPage;
    private IntroPage introPagePadLand;
    private String mainBtmCardPadLandPicUrl;
    private MainBtmCardData mainBtmCardPadPicData;
    private MainBtmCardData mainBtmCardPicData;
    private String mainBtmCardPicUrl;
    private boolean opensBillingPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return BillingPageConfig$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BillingPageConfig() {
        this((String) null, (MainBtmCardData) null, false, (String) null, (MainBtmCardData) null, (IntroPage) null, (IntroPage) null, (BillingPage) null, 255, (f) null);
    }

    public static /* synthetic */ BillingPageConfig copy$default(BillingPageConfig billingPageConfig, String str, MainBtmCardData mainBtmCardData, boolean z11, String str2, MainBtmCardData mainBtmCardData2, IntroPage introPage, IntroPage introPage2, BillingPage billingPage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = billingPageConfig.mainBtmCardPicUrl;
        }
        if ((i11 & 2) != 0) {
            mainBtmCardData = billingPageConfig.mainBtmCardPicData;
        }
        if ((i11 & 4) != 0) {
            z11 = billingPageConfig.opensBillingPage;
        }
        if ((i11 & 8) != 0) {
            str2 = billingPageConfig.mainBtmCardPadLandPicUrl;
        }
        if ((i11 & 16) != 0) {
            mainBtmCardData2 = billingPageConfig.mainBtmCardPadPicData;
        }
        if ((i11 & 32) != 0) {
            introPage = billingPageConfig.introPage;
        }
        if ((i11 & 64) != 0) {
            introPage2 = billingPageConfig.introPagePadLand;
        }
        if ((i11 & 128) != 0) {
            billingPage = billingPageConfig.billingPage;
        }
        IntroPage introPage3 = introPage2;
        BillingPage billingPage2 = billingPage;
        MainBtmCardData mainBtmCardData3 = mainBtmCardData2;
        IntroPage introPage4 = introPage;
        return billingPageConfig.copy(str, mainBtmCardData, z11, str2, mainBtmCardData3, introPage4, introPage3, billingPage2);
    }

    public static final /* synthetic */ void write$Self$app_release(BillingPageConfig billingPageConfig, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(billingPageConfig.mainBtmCardPicUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 0, billingPageConfig.mainBtmCardPicUrl);
        }
        if (bVar.G(gVar) || !m.a(billingPageConfig.mainBtmCardPicData, new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null))) {
            bVar.A(gVar, 1, MainBtmCardData$$serializer.INSTANCE, billingPageConfig.mainBtmCardPicData);
        }
        if (bVar.G(gVar) || billingPageConfig.opensBillingPage) {
            bVar.B(gVar, 2, billingPageConfig.opensBillingPage);
        }
        if (bVar.G(gVar) || !m.a(billingPageConfig.mainBtmCardPadLandPicUrl, BuildConfig.VERSION_NAME)) {
            bVar.w(gVar, 3, billingPageConfig.mainBtmCardPadLandPicUrl);
        }
        if (bVar.G(gVar) || !m.a(billingPageConfig.mainBtmCardPadPicData, new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null))) {
            bVar.A(gVar, 4, MainBtmCardData$$serializer.INSTANCE, billingPageConfig.mainBtmCardPadPicData);
        }
        if (bVar.G(gVar) || !m.a(billingPageConfig.introPage, new IntroPage((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null))) {
            bVar.A(gVar, 5, IntroPage$$serializer.INSTANCE, billingPageConfig.introPage);
        }
        if (bVar.G(gVar) || !m.a(billingPageConfig.introPagePadLand, new IntroPage((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null))) {
            bVar.A(gVar, 6, IntroPage$$serializer.INSTANCE, billingPageConfig.introPagePadLand);
        }
        if (!bVar.G(gVar) && m.a(billingPageConfig.billingPage, new BillingPage((String) null, (String) null, (String) null, (String) null, (String) null, 31, (f) null))) {
            return;
        }
        bVar.A(gVar, 7, BillingPage$$serializer.INSTANCE, billingPageConfig.billingPage);
    }

    public final String component1() {
        return this.mainBtmCardPicUrl;
    }

    public final MainBtmCardData component2() {
        return this.mainBtmCardPicData;
    }

    public final boolean component3() {
        return this.opensBillingPage;
    }

    public final String component4() {
        return this.mainBtmCardPadLandPicUrl;
    }

    public final MainBtmCardData component5() {
        return this.mainBtmCardPadPicData;
    }

    public final IntroPage component6() {
        return this.introPage;
    }

    public final IntroPage component7() {
        return this.introPagePadLand;
    }

    public final BillingPage component8() {
        return this.billingPage;
    }

    public final BillingPageConfig copy(String mainBtmCardPicUrl, MainBtmCardData mainBtmCardPicData, boolean z11, String mainBtmCardPadLandPicUrl, MainBtmCardData mainBtmCardPadPicData, IntroPage introPage, IntroPage introPagePadLand, BillingPage billingPage) {
        m.f(mainBtmCardPicUrl, "mainBtmCardPicUrl");
        m.f(mainBtmCardPicData, "mainBtmCardPicData");
        m.f(mainBtmCardPadLandPicUrl, "mainBtmCardPadLandPicUrl");
        m.f(mainBtmCardPadPicData, "mainBtmCardPadPicData");
        m.f(introPage, "introPage");
        m.f(introPagePadLand, "introPagePadLand");
        m.f(billingPage, "billingPage");
        return new BillingPageConfig(mainBtmCardPicUrl, mainBtmCardPicData, z11, mainBtmCardPadLandPicUrl, mainBtmCardPadPicData, introPage, introPagePadLand, billingPage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingPageConfig)) {
            return false;
        }
        BillingPageConfig billingPageConfig = (BillingPageConfig) obj;
        return m.a(this.mainBtmCardPicUrl, billingPageConfig.mainBtmCardPicUrl) && m.a(this.mainBtmCardPicData, billingPageConfig.mainBtmCardPicData) && this.opensBillingPage == billingPageConfig.opensBillingPage && m.a(this.mainBtmCardPadLandPicUrl, billingPageConfig.mainBtmCardPadLandPicUrl) && m.a(this.mainBtmCardPadPicData, billingPageConfig.mainBtmCardPadPicData) && m.a(this.introPage, billingPageConfig.introPage) && m.a(this.introPagePadLand, billingPageConfig.introPagePadLand) && m.a(this.billingPage, billingPageConfig.billingPage);
    }

    public final BillingPage getBillingPage() {
        return this.billingPage;
    }

    public final IntroPage getIntroPage() {
        return this.introPage;
    }

    public final IntroPage getIntroPagePadLand() {
        return this.introPagePadLand;
    }

    public final String getMainBtmCardPadLandPicUrl() {
        return this.mainBtmCardPadLandPicUrl;
    }

    public final MainBtmCardData getMainBtmCardPadPicData() {
        return this.mainBtmCardPadPicData;
    }

    public final MainBtmCardData getMainBtmCardPicData() {
        return this.mainBtmCardPicData;
    }

    public final String getMainBtmCardPicUrl() {
        return this.mainBtmCardPicUrl;
    }

    public final boolean getOpensBillingPage() {
        return this.opensBillingPage;
    }

    public int hashCode() {
        return this.billingPage.hashCode() + ((this.introPagePadLand.hashCode() + ((this.introPage.hashCode() + ((this.mainBtmCardPadPicData.hashCode() + defpackage.e.d(defpackage.e.e((this.mainBtmCardPicData.hashCode() + (this.mainBtmCardPicUrl.hashCode() * 31)) * 31, 31, this.opensBillingPage), 31, this.mainBtmCardPadLandPicUrl)) * 31)) * 31)) * 31);
    }

    public final void setBillingPage(BillingPage billingPage) {
        m.f(billingPage, "<set-?>");
        this.billingPage = billingPage;
    }

    public final void setIntroPage(IntroPage introPage) {
        m.f(introPage, "<set-?>");
        this.introPage = introPage;
    }

    public final void setIntroPagePadLand(IntroPage introPage) {
        m.f(introPage, "<set-?>");
        this.introPagePadLand = introPage;
    }

    public final void setMainBtmCardPadLandPicUrl(String str) {
        m.f(str, "<set-?>");
        this.mainBtmCardPadLandPicUrl = str;
    }

    public final void setMainBtmCardPadPicData(MainBtmCardData mainBtmCardData) {
        m.f(mainBtmCardData, "<set-?>");
        this.mainBtmCardPadPicData = mainBtmCardData;
    }

    public final void setMainBtmCardPicData(MainBtmCardData mainBtmCardData) {
        m.f(mainBtmCardData, "<set-?>");
        this.mainBtmCardPicData = mainBtmCardData;
    }

    public final void setMainBtmCardPicUrl(String str) {
        m.f(str, "<set-?>");
        this.mainBtmCardPicUrl = str;
    }

    public final void setOpensBillingPage(boolean z11) {
        this.opensBillingPage = z11;
    }

    public /* synthetic */ BillingPageConfig(int i11, String str, MainBtmCardData mainBtmCardData, boolean z11, String str2, MainBtmCardData mainBtmCardData2, IntroPage introPage, IntroPage introPage2, BillingPage billingPage, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.mainBtmCardPicUrl = BuildConfig.VERSION_NAME;
        } else {
            this.mainBtmCardPicUrl = str;
        }
        if ((i11 & 2) == 0) {
            this.mainBtmCardPicData = new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
        } else {
            this.mainBtmCardPicData = mainBtmCardData;
        }
        this.opensBillingPage = (i11 & 4) == 0 ? false : z11;
        if ((i11 & 8) == 0) {
            this.mainBtmCardPadLandPicUrl = BuildConfig.VERSION_NAME;
        } else {
            this.mainBtmCardPadLandPicUrl = str2;
        }
        if ((i11 & 16) == 0) {
            this.mainBtmCardPadPicData = new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
        } else {
            this.mainBtmCardPadPicData = mainBtmCardData2;
        }
        if ((i11 & 32) == 0) {
            this.introPage = new IntroPage((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
        } else {
            this.introPage = introPage;
        }
        if ((i11 & 64) == 0) {
            this.introPagePadLand = new IntroPage((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null);
        } else {
            this.introPagePadLand = introPage2;
        }
        this.billingPage = (i11 & 128) == 0 ? new BillingPage((String) null, (String) null, (String) null, (String) null, (String) null, 31, (f) null) : billingPage;
    }

    public String toString() {
        return "BillingPageConfig(mainBtmCardPicUrl=" + this.mainBtmCardPicUrl + nuRcCS.GWzOAD + this.mainBtmCardPicData + ", opensBillingPage=" + this.opensBillingPage + ", mainBtmCardPadLandPicUrl=" + this.mainBtmCardPadLandPicUrl + ", mainBtmCardPadPicData=" + this.mainBtmCardPadPicData + ", introPage=" + this.introPage + ", introPagePadLand=" + this.introPagePadLand + ", billingPage=" + this.billingPage + ")";
    }

    public BillingPageConfig(String mainBtmCardPicUrl, MainBtmCardData mainBtmCardPicData, boolean z11, String mainBtmCardPadLandPicUrl, MainBtmCardData mainBtmCardPadPicData, IntroPage introPage, IntroPage introPagePadLand, BillingPage billingPage) {
        m.f(mainBtmCardPicUrl, "mainBtmCardPicUrl");
        m.f(mainBtmCardPicData, "mainBtmCardPicData");
        m.f(mainBtmCardPadLandPicUrl, "mainBtmCardPadLandPicUrl");
        m.f(mainBtmCardPadPicData, "mainBtmCardPadPicData");
        m.f(introPage, "introPage");
        m.f(introPagePadLand, "introPagePadLand");
        m.f(billingPage, "billingPage");
        this.mainBtmCardPicUrl = mainBtmCardPicUrl;
        this.mainBtmCardPicData = mainBtmCardPicData;
        this.opensBillingPage = z11;
        this.mainBtmCardPadLandPicUrl = mainBtmCardPadLandPicUrl;
        this.mainBtmCardPadPicData = mainBtmCardPadPicData;
        this.introPage = introPage;
        this.introPagePadLand = introPagePadLand;
        this.billingPage = billingPage;
    }

    public /* synthetic */ BillingPageConfig(String str, MainBtmCardData mainBtmCardData, boolean z11, String str2, MainBtmCardData mainBtmCardData2, IntroPage introPage, IntroPage introPage2, BillingPage billingPage, int i11, f fVar) {
        this((i11 & 1) != 0 ? BuildConfig.VERSION_NAME : str, (i11 & 2) != 0 ? new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : mainBtmCardData, (i11 & 4) != 0 ? false : z11, (i11 & 8) == 0 ? str2 : BuildConfig.VERSION_NAME, (i11 & 16) != 0 ? new MainBtmCardData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : mainBtmCardData2, (i11 & 32) != 0 ? new IntroPage((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : introPage, (i11 & 64) != 0 ? new IntroPage((LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (LanConfig) null, (String) null, (String) null, (String) null, (String) null, 131071, (f) null) : introPage2, (i11 & 128) != 0 ? new BillingPage((String) null, (String) null, (String) null, (String) null, (String) null, 31, (f) null) : billingPage);
    }
}
