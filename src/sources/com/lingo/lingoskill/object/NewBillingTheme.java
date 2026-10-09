package com.lingo.lingoskill.object;

import c00.e;
import e00.g;
import f00.b;
import g00.o1;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class NewBillingTheme {
    private NewBillingThemeBillingPage billingPage;
    private NewBillingThemeIntroPage introPage;
    private NewBillingThemeLearnPage learnPage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return NewBillingTheme$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public NewBillingTheme() {
        this((NewBillingThemeLearnPage) null, (NewBillingThemeIntroPage) null, (NewBillingThemeBillingPage) null, 7, (f) null);
    }

    public static /* synthetic */ NewBillingTheme copy$default(NewBillingTheme newBillingTheme, NewBillingThemeLearnPage newBillingThemeLearnPage, NewBillingThemeIntroPage newBillingThemeIntroPage, NewBillingThemeBillingPage newBillingThemeBillingPage, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            newBillingThemeLearnPage = newBillingTheme.learnPage;
        }
        if ((i11 & 2) != 0) {
            newBillingThemeIntroPage = newBillingTheme.introPage;
        }
        if ((i11 & 4) != 0) {
            newBillingThemeBillingPage = newBillingTheme.billingPage;
        }
        return newBillingTheme.copy(newBillingThemeLearnPage, newBillingThemeIntroPage, newBillingThemeBillingPage);
    }

    public static final /* synthetic */ void write$Self$app_release(NewBillingTheme newBillingTheme, b bVar, g gVar) {
        if (bVar.G(gVar) || !m.a(newBillingTheme.learnPage, new NewBillingThemeLearnPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MainBtmCardData) null, (MainBtmCardData) null, 524287, (f) null))) {
            bVar.A(gVar, 0, NewBillingThemeLearnPage$$serializer.INSTANCE, newBillingTheme.learnPage);
        }
        if (bVar.G(gVar) || !m.a(newBillingTheme.introPage, new NewBillingThemeIntroPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (f) null))) {
            bVar.A(gVar, 1, NewBillingThemeIntroPage$$serializer.INSTANCE, newBillingTheme.introPage);
        }
        if (!bVar.G(gVar) && m.a(newBillingTheme.billingPage, new NewBillingThemeBillingPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (f) null))) {
            return;
        }
        bVar.A(gVar, 2, NewBillingThemeBillingPage$$serializer.INSTANCE, newBillingTheme.billingPage);
    }

    public final NewBillingThemeLearnPage component1() {
        return this.learnPage;
    }

    public final NewBillingThemeIntroPage component2() {
        return this.introPage;
    }

    public final NewBillingThemeBillingPage component3() {
        return this.billingPage;
    }

    public final NewBillingTheme copy(NewBillingThemeLearnPage learnPage, NewBillingThemeIntroPage introPage, NewBillingThemeBillingPage billingPage) {
        m.f(learnPage, "learnPage");
        m.f(introPage, "introPage");
        m.f(billingPage, "billingPage");
        return new NewBillingTheme(learnPage, introPage, billingPage);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewBillingTheme)) {
            return false;
        }
        NewBillingTheme newBillingTheme = (NewBillingTheme) obj;
        return m.a(this.learnPage, newBillingTheme.learnPage) && m.a(this.introPage, newBillingTheme.introPage) && m.a(this.billingPage, newBillingTheme.billingPage);
    }

    public final NewBillingThemeBillingPage getBillingPage() {
        return this.billingPage;
    }

    public final NewBillingThemeIntroPage getIntroPage() {
        return this.introPage;
    }

    public final NewBillingThemeLearnPage getLearnPage() {
        return this.learnPage;
    }

    public int hashCode() {
        return this.billingPage.hashCode() + ((this.introPage.hashCode() + (this.learnPage.hashCode() * 31)) * 31);
    }

    public final void setBillingPage(NewBillingThemeBillingPage newBillingThemeBillingPage) {
        m.f(newBillingThemeBillingPage, "<set-?>");
        this.billingPage = newBillingThemeBillingPage;
    }

    public final void setIntroPage(NewBillingThemeIntroPage newBillingThemeIntroPage) {
        m.f(newBillingThemeIntroPage, "<set-?>");
        this.introPage = newBillingThemeIntroPage;
    }

    public final void setLearnPage(NewBillingThemeLearnPage newBillingThemeLearnPage) {
        m.f(newBillingThemeLearnPage, "<set-?>");
        this.learnPage = newBillingThemeLearnPage;
    }

    public String toString() {
        return "NewBillingTheme(learnPage=" + this.learnPage + ", introPage=" + this.introPage + ", billingPage=" + this.billingPage + ")";
    }

    public /* synthetic */ NewBillingTheme(int i11, NewBillingThemeLearnPage newBillingThemeLearnPage, NewBillingThemeIntroPage newBillingThemeIntroPage, NewBillingThemeBillingPage newBillingThemeBillingPage, o1 o1Var) {
        if ((i11 & 1) == 0) {
            this.learnPage = new NewBillingThemeLearnPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MainBtmCardData) null, (MainBtmCardData) null, 524287, (f) null);
        } else {
            this.learnPage = newBillingThemeLearnPage;
        }
        if ((i11 & 2) == 0) {
            this.introPage = new NewBillingThemeIntroPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (f) null);
        } else {
            this.introPage = newBillingThemeIntroPage;
        }
        if ((i11 & 4) == 0) {
            this.billingPage = new NewBillingThemeBillingPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (f) null);
        } else {
            this.billingPage = newBillingThemeBillingPage;
        }
    }

    public NewBillingTheme(NewBillingThemeLearnPage learnPage, NewBillingThemeIntroPage introPage, NewBillingThemeBillingPage newBillingThemeBillingPage) {
        m.f(learnPage, "learnPage");
        m.f(introPage, "introPage");
        m.f(newBillingThemeBillingPage, OYAvlbfUyD.YpZ);
        this.learnPage = learnPage;
        this.introPage = introPage;
        this.billingPage = newBillingThemeBillingPage;
    }

    public /* synthetic */ NewBillingTheme(NewBillingThemeLearnPage newBillingThemeLearnPage, NewBillingThemeIntroPage newBillingThemeIntroPage, NewBillingThemeBillingPage newBillingThemeBillingPage, int i11, f fVar) {
        this((i11 & 1) != 0 ? new NewBillingThemeLearnPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (MainBtmCardData) null, (MainBtmCardData) null, 524287, (f) null) : newBillingThemeLearnPage, (i11 & 2) != 0 ? new NewBillingThemeIntroPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (f) null) : newBillingThemeIntroPage, (i11 & 4) != 0 ? new NewBillingThemeBillingPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (f) null) : newBillingThemeBillingPage);
    }
}
