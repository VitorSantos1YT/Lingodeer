package f0;

import android.content.Context;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends xy.i implements fz.e {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;
    public final /* synthetic */ Object L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f26297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f26300f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f26301t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, vy.d dVar, int i11) {
        super(2, dVar);
        this.f26295a = i11;
        this.f26298d = obj;
        this.f26299e = obj2;
        this.f26300f = obj3;
        this.f26301t = obj4;
        this.H = obj5;
        this.K = obj6;
        this.L = obj7;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f26295a) {
            case 0:
                i0 i0Var = new i0((s2.w) this.f26298d, (n0) this.f26299e, (at.p) this.f26300f, (aj.c) this.f26301t, (h0) this.H, (h0) this.K, (at.i) this.L, dVar, 0);
                i0Var.f26297c = obj;
                return i0Var;
            default:
                i0 i0Var2 = new i0((l1.d2) this.f26298d, (e6.l) this.f26299e, (uz.i1) this.f26300f, (Context) this.f26301t, (e6.k1) this.H, (m6.w) this.K, (m6.u) this.L, dVar, 1);
                i0Var2.f26297c = obj;
                return i0Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f26295a) {
            case 0:
                break;
        }
        return ((i0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        rz.b0 b0Var;
        int i11 = this.f26295a;
        qy.b0 b0Var2 = qy.b0.f48488a;
        Object obj2 = this.L;
        Object obj3 = this.K;
        Object obj4 = this.H;
        Object obj5 = this.f26301t;
        Object obj6 = this.f26300f;
        Object obj7 = this.f26299e;
        Object obj8 = this.f26298d;
        switch (i11) {
            case 0:
                n0 n0Var = (n0) obj7;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f26296b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rz.b0 b0Var3 = (rz.b0) this.f26297c;
                    try {
                        at.i iVar = (at.i) obj2;
                        this.f26297c = b0Var3;
                        this.f26296b = 1;
                        float f5 = g0.f26277a;
                        Object objC = t2.c((s2.w) obj8, new z((h0) obj3, new kotlin.jvm.internal.x(), n0Var.S, (at.p) obj6, iVar, (h0) obj4, (aj.c) obj5, null), this);
                        if (objC != aVar) {
                            objC = b0Var2;
                        }
                        return objC == aVar ? aVar : b0Var2;
                    } catch (CancellationException e8) {
                        e = e8;
                        b0Var = b0Var3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b0Var = (rz.b0) this.f26297c;
                    try {
                        com.bumptech.glide.e.F(obj);
                        return b0Var2;
                    } catch (CancellationException e10) {
                        e = e10;
                    }
                }
                tz.h hVar = n0Var.W;
                if (hVar != null) {
                    hVar.i(o.f26380a);
                }
                if (rz.e0.w(b0Var)) {
                    return b0Var2;
                }
                throw e;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f26296b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var2;
                }
                com.bumptech.glide.e.F(obj);
                rz.b0 b0Var4 = (rz.b0) this.f26297c;
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                l1.d2 d2Var = (l1.d2) obj8;
                xVar.f38360a = d2Var.f39256a;
                uz.i1 i1Var = d2Var.f39276v;
                ei.r rVar = new ei.r((e6.l) obj7, d2Var, xVar, (uz.i1) obj6, (Context) obj5, (e6.k1) obj4, (m6.w) obj3, (m6.u) obj2, b0Var4, (vy.d) null);
                this.f26296b = 1;
                return uz.x0.i(i1Var, rVar, this) == aVar2 ? aVar2 : b0Var2;
        }
    }
}
