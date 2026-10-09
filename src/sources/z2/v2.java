package z2;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v2 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f58685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f58686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.y f58687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.d2 f58688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f58689e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w2 f58690f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f58691t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(kotlin.jvm.internal.y yVar, l1.d2 d2Var, LifecycleOwner lifecycleOwner, w2 w2Var, View view, vy.d dVar) {
        super(2, dVar);
        this.f58687c = yVar;
        this.f58688d = d2Var;
        this.f58689e = lifecycleOwner;
        this.f58690f = w2Var;
        this.f58691t = view;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        v2 v2Var = new v2(this.f58687c, this.f58688d, this.f58689e, this.f58690f, this.f58691t, dVar);
        v2Var.f58686b = obj;
        return v2Var;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((v2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        rz.g1 g1Var;
        rz.z1 z1VarB;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f58685a;
        w2 w2Var = this.f58690f;
        LifecycleOwner lifecycleOwner = this.f58689e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1Var = (rz.g1) this.f58686b;
            try {
                com.bumptech.glide.e.F(obj);
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
                lifecycleOwner.getLifecycle().removeObserver(w2Var);
                return qy.b0.f48488a;
            } catch (Throwable th2) {
                th = th2;
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
                lifecycleOwner.getLifecycle().removeObserver(w2Var);
                throw th;
            }
        }
        com.bumptech.glide.e.F(obj);
        rz.b0 b0Var = (rz.b0) this.f58686b;
        try {
            y1 y1Var = (y1) this.f58687c.f38361a;
            if (y1Var != null) {
                uz.g1 g1VarA = x2.a(this.f58691t.getContext().getApplicationContext());
                y1Var.f58729a.m(((Number) g1VarA.getValue()).floatValue());
                z1VarB = rz.e0.B(b0Var, null, null, new xg.b(10, g1VarA, y1Var, null), 3);
            } else {
                z1VarB = null;
            }
            try {
                l1.d2 d2Var = this.f58688d;
                this.f58686b = z1VarB;
                this.f58685a = 1;
                if (d2Var.M(this) == aVar) {
                    return aVar;
                }
                g1Var = z1VarB;
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
                lifecycleOwner.getLifecycle().removeObserver(w2Var);
                return qy.b0.f48488a;
            } catch (Throwable th3) {
                g1Var = z1VarB;
                th = th3;
                if (g1Var != null) {
                    g1Var.cancel(null);
                }
                lifecycleOwner.getLifecycle().removeObserver(w2Var);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            g1Var = null;
        }
    }
}
