package et;

import f0.n1;
import i0.pKy.shrCcjmOhAmRC;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l0.w f25836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25837d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l0.w wVar, int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f25834a = 5;
        this.f25836c = wVar;
        this.f25835b = i11;
        this.f25837d = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f25834a) {
            case 0:
                return new b0(this.f25836c, this.f25837d, dVar, 0);
            case 1:
                return new b0(this.f25836c, this.f25837d, dVar, 1);
            case 2:
                return new b0(this.f25836c, this.f25837d, dVar, 2);
            case 3:
                return new b0(this.f25836c, this.f25837d, dVar, 3);
            case 4:
                return new b0(this.f25836c, this.f25837d, dVar, 4);
            default:
                return new b0(this.f25836c, this.f25835b, this.f25837d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25834a) {
            case 0:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((b0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                b0 b0Var = (b0) create((n1) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                b0Var.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b0(l0.w wVar, int i11, vy.d dVar, int i12) {
        super(2, dVar);
        this.f25834a = i12;
        this.f25836c = wVar;
        this.f25837d = i11;
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f25834a;
        String str = shrCcjmOhAmRC.xCb;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = this.f25837d;
        l0.w wVar = this.f25836c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f25835b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException(str);
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f25835b = 1;
                o2 o2Var = l0.w.f39201x;
                return wVar.f(i12, 0, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f25835b;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException(str);
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f25835b = 1;
                o2 o2Var2 = l0.w.f39201x;
                return wVar.f(i12, 0, this) == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f25835b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException(str);
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f25835b = 1;
                o2 o2Var3 = l0.w.f39201x;
                return wVar.f(i12, 0, this) == aVar3 ? aVar3 : b0Var;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f25835b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException(str);
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                this.f25835b = 1;
                o2 o2Var4 = l0.w.f39201x;
                return wVar.f(i12, 0, this) == aVar4 ? aVar4 : b0Var;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f25835b;
                if (i17 != 0) {
                    if (i17 != 1) {
                        throw new IllegalStateException(str);
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                if (wVar.f39206e.f39181b.l() == i12) {
                    return b0Var;
                }
                this.f25835b = 1;
                return wVar.j(i12, 0, this) == aVar5 ? aVar5 : b0Var;
            default:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                wVar.k(this.f25835b, i12);
                return b0Var;
        }
    }
}
