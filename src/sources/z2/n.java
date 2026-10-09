package z2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f58626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f58627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f58628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f58629e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58630a;

    static {
        int i11 = 1;
        f58626b = new n(i11, 0);
        f58627c = new n(i11, 1);
        f58628d = new n(i11, 2);
        f58629e = new n(i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i11, int i12) {
        super(i11);
        this.f58630a = i12;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f58630a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                g3.o oVarK = ((g3.t) obj).k();
                return Boolean.valueOf(oVarK.f28691a.c(g3.x.A));
            case 2:
                l1.q1 q1Var = (l1.q1) obj;
                l1.d0 d0Var = AndroidCompositionLocals_androidKt.f1199a;
                q1Var.getClass();
                l1.t.E(q1Var, d0Var);
                return ((Context) l1.t.E(q1Var, AndroidCompositionLocals_androidKt.f1200b)).getResources();
            default:
                return Boolean.valueOf(g0.p(obj));
        }
    }
}
