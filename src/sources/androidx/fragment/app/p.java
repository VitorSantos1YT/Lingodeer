package androidx.fragment.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import com.tbruyelle.rxpermissions3.BuildConfig;
import h1.b6;
import h1.e8;
import h1.f8;
import h1.n9;
import h1.o5;
import h1.o9;
import h1.p5;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.n implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1786e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
        super(0);
        this.f1782a = i11;
        this.f1783b = obj;
        this.f1784c = obj2;
        this.f1785d = obj3;
        this.f1786e = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    /* JADX WARN: Code duplicated, block: B:22:0x00c0  */
    @Override // fz.a
    public final Object invoke() {
        String strA;
        switch (this.f1782a) {
            case 0:
                q qVar = (q) this.f1783b;
                h2 h2Var = qVar.f1791f;
                ViewGroup viewGroup = (ViewGroup) this.f1784c;
                Object obj = this.f1785d;
                Object objI = h2Var.i(viewGroup, obj);
                qVar.f1801q = objI;
                if (objI == null) {
                    qVar.f1802r = true;
                } else {
                    ((kotlin.jvm.internal.y) this.f1786e).f38361a = new o(qVar, obj, viewGroup);
                    if (k1.L(2)) {
                        Objects.toString(qVar.f1789d);
                        Objects.toString(qVar.f1790e);
                    }
                }
                return qy.b0.f48488a;
            case 1:
                Intent intent = (Intent) this.f1785d;
                Activity activity = (Activity) this.f1784c;
                int i11 = f6.b.f26620a[f6.c.valueOf((String) this.f1783b).ordinal()];
                if (i11 == 1) {
                    activity.startActivity(intent, (Bundle) this.f1786e);
                } else if (i11 == 2 || i11 == 3) {
                    activity.sendBroadcast(intent);
                } else if (i11 == 4) {
                    activity.startService(intent);
                } else if (i11 == 5) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        f6.e.f26624a.a(activity, intent);
                    } else {
                        activity.startService(intent);
                    }
                }
                return qy.b0.f48488a;
            case 2:
                Long l9 = (Long) this.f1783b;
                if (l9 != null) {
                    i1.x xVar = (i1.x) this.f1784c;
                    i1.a0 a0Var = (i1.a0) this.f1785d;
                    strA = xVar.a(l9.longValue(), a0Var.f33969c, (Locale) this.f1786e);
                    if (strA == null) {
                        strA = BuildConfig.VERSION_NAME;
                    }
                } else {
                    strA = BuildConfig.VERSION_NAME;
                }
                return l1.t.B(new o3.w(strA, j3.t.b(0, 0), 4));
            case 3:
                rz.b0 b0Var = (rz.b0) this.f1784c;
                e8 e8Var = (e8) this.f1783b;
                vy.d dVar = null;
                if (((f8) ((l1.k1) e8Var.f30211b.f44881g).getValue()) == f8.Expanded) {
                    i1.o0 o0VarH = e8Var.f30211b.h();
                    if (o0VarH.f34055a.containsKey(f8.PartiallyExpanded)) {
                        rz.e0.B(b0Var, null, null, new bt.f0((b0.d) this.f1785d, dVar, 3), 3);
                        rz.e0.B(b0Var, null, null, new o5(e8Var, dVar, 0), 3);
                    } else {
                        rz.e0.B(b0Var, null, null, new o5(e8Var, dVar, 1), 3).invokeOnCompletion(new p5(0, (fz.a) this.f1786e));
                    }
                } else {
                    rz.e0.B(b0Var, null, null, new o5(e8Var, dVar, 1), 3).invokeOnCompletion(new p5(0, (fz.a) this.f1786e));
                }
                return qy.b0.f48488a;
            case 4:
                ((androidx.compose.material3.b) this.f1783b).c((fz.a) this.f1784c, (b6) this.f1785d, (v3.m) this.f1786e);
                return qy.b0.f48488a;
            case 5:
                return new n9((o9) this.f1783b, (v3.c) this.f1784c, (fz.c) this.f1785d, (fz.c) this.f1786e);
            default:
                ((androidx.compose.ui.window.d) this.f1783b).d((fz.a) this.f1784c, (z3.r) this.f1785d, (v3.m) this.f1786e);
                return qy.b0.f48488a;
        }
    }
}
