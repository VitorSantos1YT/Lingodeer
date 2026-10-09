package kr;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f38455b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(int i11, l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.f38454a = i11;
        this.f38455b = l1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38454a) {
            case 0:
                return new e1(0, this.f38455b, dVar);
            default:
                return new e1(1, this.f38455b, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38454a) {
            case 0:
                e1 e1Var = (e1) create((tt.a) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                e1Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                return ((e1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objA;
        int i11 = this.f38454a;
        l1 l1Var = this.f38455b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                av.n nVar = l1Var.f38525c;
                vt.n0 n0Var = l1Var.f38524b;
                nVar.m(((fr.o0) n0Var).f27733a.audioSpeed / 100.0f, true);
                uz.i1 i1Var = l1Var.H;
                do {
                    value = i1Var.getValue();
                    objA = (d1) value;
                    if (objA instanceof c1) {
                        objA = c1.a((c1) objA, null, 0, false, ((fr.o0) n0Var).f27733a.showStoryTrans, 15);
                    }
                } while (!i1Var.j(value, objA));
                return qy.b0.f48488a;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return l1Var.f38528f.f();
        }
    }
}
