package gp;

import a0.b2;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.lingo.lingoskill.object.AzureAreaKey;
import com.lingo.lingoskill.object.BillingPageRecomConfig;
import com.lingo.lingoskill.object.LifetimeIapConfig;
import com.lingo.lingoskill.object.MergedBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingTheme;
import com.lingo.lingoskill.object.NewBillingThemeBillingPage;
import com.lingo.lingoskill.object.NewBillingThemeIntroPage;
import com.lingo.lingoskill.object.NewBillingThemeLearnPage;
import com.lingo.lingoskill.object.SaleActivityConfig;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.x4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1 extends ViewModel {
    public final uz.r0 H;
    public final uz.r0 K;
    public final uz.r0 L;
    public final uz.r0 M;
    public final uz.r0 N;
    public final uz.r0 O;
    public final uz.r0 P;
    public final uz.r0 Q;
    public final uz.r0 R;
    public final uz.r0 S;
    public final uz.r0 T;
    public final uz.r0 U;
    public final uz.r0 V;
    public final uz.r0 W;
    public final uz.r0 X;
    public final uz.i1 Y;
    public final uz.i1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt.c f29432a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final uz.r0 f29433a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vt.n0 f29434b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final uz.r0 f29435b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz.i1 f29436c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final uz.r0 f29437c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uz.i1 f29438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public jp.o f29439e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uz.r0 f29440f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final uz.r0 f29441t;

    public l1(vt.c cVar, vt.n0 n0Var, vt.h1 h1Var) {
        this.f29432a = cVar;
        this.f29434b = n0Var;
        uz.i1 i1VarC = uz.x0.c("00 : 00 : 00");
        this.f29436c = i1VarC;
        this.f29438d = i1VarC;
        vt.d dVar = (vt.d) cVar;
        uz.i1 i1Var = dVar.f54197g;
        int i11 = 2;
        this.f29440f = uz.x0.A(new t(i1Var, 8), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new AzureAreaKey(BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME));
        this.f29441t = uz.x0.A(new t(i1Var, 9), ViewModelKt.getViewModelScope(this), uz.a1.a(2), 0L);
        vy.d dVar2 = null;
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o0(this, dVar2, 0), 3);
        int i12 = 1;
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o0(this, dVar2, i12), 3);
        rz.e0.B(ViewModelKt.getViewModelScope(this), null, null, new o0(this, dVar2, i11), 3);
        uz.r0 r0VarA = uz.x0.A(new d1(i1Var, this, 0), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new NewBillingTheme((NewBillingThemeLearnPage) null, (NewBillingThemeIntroPage) null, (NewBillingThemeBillingPage) null, 7, (kotlin.jvm.internal.f) null));
        this.H = r0VarA;
        uz.r0 r0VarA2 = uz.x0.A(new d1(i1Var, this, 1), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new MergedBillingThemeBillingPage((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, -1, 255, (kotlin.jvm.internal.f) null));
        this.K = r0VarA2;
        this.L = uz.x0.A(new t(i1Var, 10), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new LifetimeIapConfig(false, false, 3, (kotlin.jvm.internal.f) null));
        this.M = uz.x0.A(new t(i1Var, 11), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new SaleActivityConfig((String) null, (String) null, (String) null, (String) null, 15, (kotlin.jvm.internal.f) null));
        this.N = uz.x0.A(new t(i1Var, 12), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.O = uz.x0.A(new t(i1Var, 13), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.P = uz.x0.A(new t(i1Var, 14), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.Q = uz.x0.A(new t(i1Var, i12), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.R = uz.x0.A(new t(i1Var, i11), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.S = uz.x0.A(new t(i1Var, 3), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.T = uz.x0.A(new t(i1Var, 4), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.U = uz.x0.A(new t(i1Var, 5), ViewModelKt.getViewModelScope(this), uz.a1.a(2), new BillingPageRecomConfig(0, 0L, false, false, 15, (kotlin.jvm.internal.f) null));
        uz.i iVar = ((x4) h1Var).f27974g;
        uz.m0 m0VarJ = uz.x0.j(iVar, i1Var, dVar.f54191a, new s0(this, null));
        rz.b0 viewModelScope = ViewModelKt.getViewModelScope(this);
        uz.f1 f1VarA = uz.a1.a(2);
        Boolean bool = Boolean.FALSE;
        this.V = uz.x0.A(m0VarJ, viewModelScope, f1VarA, bool);
        this.W = uz.x0.A(new t(i1Var, 6), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        this.X = uz.x0.A(new t(i1Var, 7), ViewModelKt.getViewModelScope(this), uz.a1.a(2), BuildConfig.VERSION_NAME);
        uz.i1 i1VarC2 = uz.x0.c(bool);
        this.Y = i1VarC2;
        uz.i1 i1VarC3 = uz.x0.c(BuildConfig.VERSION_NAME);
        this.Z = i1VarC3;
        this.f29433a0 = new uz.r0(i1VarC2);
        this.f29435b0 = new uz.r0(i1VarC3);
        this.f29437c0 = uz.x0.A(new uz.m0(new uz.i[]{i1VarC, r0VarA, r0VarA2, iVar}, new q0(5, null)), ViewModelKt.getViewModelScope(this), uz.a1.a(2), z.f29558a);
    }

    public final void a() {
        int[] iArr = bq.r.f4959a;
        if (bq.m.G()) {
            new com.lingo.lingoskill.http.service.d().b().f(new a5.j(this, 15)).k(ky.e.f38937b).g(px.b.a()).h(new dm.a(this, 12), new b2(this, 14));
            return;
        }
        Boolean bool = Boolean.FALSE;
        uz.i1 i1Var = this.Y;
        i1Var.getClass();
        i1Var.l(null, bool);
        uz.i1 i1Var2 = this.Z;
        i1Var2.getClass();
        i1Var2.l(null, BuildConfig.VERSION_NAME);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        jp.o oVar = this.f29439e;
        if (oVar != null) {
            oVar.cancel();
        }
    }
}
