package ad;

import kotlin.NoWhenBranchMatchedException;
import l1.k1;
import rz.e0;
import rz.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends xy.i implements fz.c {
    public final /* synthetic */ n H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wc.h f588f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f589t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, int i11, int i12, float f5, wc.h hVar, float f11, n nVar, vy.d dVar) {
        super(1, dVar);
        this.f584b = iVar;
        this.f585c = i11;
        this.f586d = i12;
        this.f587e = f5;
        this.f588f = hVar;
        this.f589t = f11;
        this.H = nVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        return new e(this.f584b, this.f585c, this.f586d, this.f587e, this.f588f, this.f589t, this.H, dVar);
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        return ((e) create((vy.d) obj)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        vy.i iVar;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f583a;
        qy.b0 b0Var = qy.b0.f48488a;
        i iVar2 = this.f584b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                iVar2.h(this.f585c);
                k1 k1Var = iVar2.f599a;
                k1 k1Var2 = iVar2.f601c;
                int i12 = this.f586d;
                k1Var2.setValue(Integer.valueOf(i12));
                k1 k1Var3 = iVar2.f602d;
                Boolean bool = Boolean.FALSE;
                k1Var3.setValue(bool);
                k1 k1Var4 = iVar2.f604f;
                float f5 = this.f587e;
                k1Var4.setValue(Float.valueOf(f5));
                iVar2.f603e.setValue(null);
                k1 k1Var5 = iVar2.K;
                wc.h hVar = this.f588f;
                k1Var5.setValue(hVar);
                iVar2.j(this.f589t);
                iVar2.f605t.setValue(bool);
                iVar2.N.setValue(Long.MIN_VALUE);
                if (hVar == null) {
                    k1Var.setValue(bool);
                    return b0Var;
                }
                if (Float.isInfinite(f5)) {
                    iVar2.j(iVar2.f());
                    k1Var.setValue(bool);
                    iVar2.h(i12);
                    return b0Var;
                }
                k1Var.setValue(Boolean.TRUE);
                int i13 = d.f582a[this.H.ordinal()];
                if (i13 == 1) {
                    iVar = v1.f50964a;
                } else {
                    if (i13 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar = vy.j.f54321a;
                }
                c cVar = new c(this.H, e0.s(getContext()), this.f586d, this.f585c, this.f584b, null);
                this.f583a = 1;
                if (e0.M(iVar, cVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            e0.n(getContext());
            i.d(iVar2, false);
            return b0Var;
        } catch (Throwable th2) {
            i.d(iVar2, false);
            throw th2;
        }
    }
}
