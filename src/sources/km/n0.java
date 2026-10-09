package km;

import androidx.lifecycle.livedata.HeRS.DytezVyM;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38245b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f38244a = i12;
        this.f38245b = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38244a) {
            case 0:
                return new n0(this.f38245b, 0, dVar);
            case 1:
                return new n0(this.f38245b, 1, dVar);
            case 2:
                return new n0(this.f38245b, 2, dVar);
            case 3:
                return new n0(2, dVar, 3, false);
            case 4:
                return new n0(2, dVar, 4, false);
            default:
                n0 n0Var = new n0(2, dVar, 5, false);
                n0Var.f38245b = ((Number) obj).intValue();
                return n0Var;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38244a) {
            case 0:
                return ((n0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((n0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((n0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((n0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((n0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((n0) create(Integer.valueOf(((Number) obj).intValue()), (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(int i11, vy.d dVar, int i12, boolean z11) {
        super(i11, dVar);
        this.f38244a = i12;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f38244a;
        String str = DytezVyM.fFAjmvxKvRhh;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ij.c.h(this.f38245b);
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ij.c.h(this.f38245b);
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return ij.c.h(this.f38245b);
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f38245b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f38245b = 1;
                    return ue.f.v(this) == aVar4 ? aVar4 : b0Var;
                }
                if (i12 != 1) {
                    throw new IllegalStateException(str);
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f38245b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException(str);
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.c cVar = (vt.c) ((c20.b) vc.a.m().f519c).f6515d.a(null, null, kotlin.jvm.internal.z.a(vt.c.class));
                this.f38245b = 1;
                ((vt.d) cVar).i(this);
                return b0Var == aVar5 ? aVar5 : b0Var;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return Boolean.valueOf(this.f38245b > 0);
        }
    }
}
