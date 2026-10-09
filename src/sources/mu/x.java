package mu;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.type.bACG.scNRoQgKSYX;
import com.tbruyelle.rxpermissions3.BuildConfig;
import dv.u0;
import fr.o0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import rz.e0;
import uz.a1;
import uz.i1;
import uz.r0;
import uz.x0;
import vt.h1;
import vt.m0;
import vt.n0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class x extends ViewModel {
    public final i1 H;
    public final i1 K;
    public final r0 L;
    public final i1 M;
    public final r0 N;
    public final i1 O;
    public final i1 P;
    public final r0 Q;
    public final r0 R;
    public final List S;
    public final r0 T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lu.b f42182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f42183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vt.c f42184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f42185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f42186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f42187f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f42188t;

    public final void a(h hVar) {
        hVar.toString();
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new v(hVar, this, null), 3);
    }

    public final void b(Activity activity, i type, fz.a loginNow) {
        com.android.billingclient.api.o productDetails;
        String str;
        com.android.billingclient.api.n nVar;
        kotlin.jvm.internal.m.f(activity, "activity");
        kotlin.jvm.internal.m.f(type, "type");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        if (((o0) this.f42183b).f27733a.isUnloginUser()) {
            loginNow.invoke();
            return;
        }
        i1 i1Var = this.H;
        if (((List) i1Var.getValue()).isEmpty()) {
            return;
        }
        xt.b.f56283e = true;
        this.f42188t = type;
        int i11 = r.f42162a[type.ordinal()];
        if (i11 == 1) {
            productDetails = (com.android.billingclient.api.o) ((List) i1Var.getValue()).get(0);
        } else if (i11 == 2) {
            productDetails = (com.android.billingclient.api.o) ((List) i1Var.getValue()).get(1);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            productDetails = (com.android.billingclient.api.o) ((List) i1Var.getValue()).get(2);
        }
        lu.b bVar = this.f42182a;
        bVar.getClass();
        kotlin.jvm.internal.m.f(productDetails, "productDetails");
        ArrayList arrayList = productDetails.f7569h;
        if (arrayList == null || (nVar = (com.android.billingclient.api.n) ry.m.s0(arrayList)) == null || (str = nVar.f7560a) == null) {
            str = BuildConfig.VERSION_NAME;
        }
        ob.u uVar = new ob.u(3, false);
        uVar.F(productDetails);
        if (kotlin.jvm.internal.m.a(productDetails.f7565d, "subs")) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("offerToken can not be empty");
            }
            uVar.f44892c = str;
        }
        if (((com.android.billingclient.api.o) uVar.f44891b) == null) {
            throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
        }
        com.android.billingclient.api.f fVar = new com.android.billingclient.api.f(uVar);
        ob.i iVar = new ob.i(3);
        com.android.billingclient.api.g gVar = new com.android.billingclient.api.g();
        gVar.f7506b = 0;
        gVar.f7505a = true;
        iVar.f44816e = gVar;
        iVar.f44815d = new ArrayList(ns.o.K(fVar));
        com.android.billingclient.api.h hVarE = iVar.e();
        com.android.billingclient.api.d dVar = bVar.f40331c;
        if (dVar.r()) {
            bVar.f40329a.set(true);
            kotlin.jvm.internal.m.e(dVar.c(activity, hVarE), "launchBillingFlow(...)");
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        com.android.billingclient.api.d dVar = this.f42182a.f40331c;
        if (dVar.r()) {
            dVar.b();
        }
    }

    public x(lu.b bVar, n0 n0Var, vt.c cVar, u0 u0Var, h1 h1Var, wt.o0 o0Var, m0 m0Var) {
        this.f42182a = bVar;
        this.f42183b = n0Var;
        this.f42184c = cVar;
        this.f42185d = u0Var;
        this.f42186e = h1Var;
        this.f42187f = m0Var;
        i1 i1VarC = x0.c(ry.r.f50854a);
        this.H = i1VarC;
        Boolean bool = Boolean.FALSE;
        i1 i1VarC2 = x0.c(bool);
        this.K = i1VarC2;
        this.L = new r0(i1VarC2);
        i1 i1VarC3 = x0.c(BuildConfig.VERSION_NAME);
        this.M = i1VarC3;
        this.N = new r0(i1VarC3);
        i1 i1VarC4 = x0.c(0);
        this.O = i1VarC4;
        i1 i1VarC5 = x0.c(bool);
        this.P = i1VarC5;
        this.Q = new r0(i1VarC5);
        this.R = x0.A(o0Var.f55339f, ViewModelKt.getViewModelScope(this), a1.a(2), bool);
        this.S = ns.o.L(scNRoQgKSYX.nIFR, "s35_gem_level_2_android", "s35_gem_level_3_android");
        bVar.f40330b = new hh.c(this, 11);
        vy.d dVar = null;
        this.T = x0.A(x0.j(x0.B(((vt.d) cVar).f54195e, new dt.x(dVar, this, 8)), i1VarC, i1VarC4, new w(this, dVar, 0)), ViewModelKt.getViewModelScope(this), a1.a(2), j.f42143a);
        bVar.f40331c.f(new l.s(new m(this, 0), 2));
        e0.B(ViewModelKt.getViewModelScope(this), null, null, new p(this, dVar, 1), 3);
    }
}
