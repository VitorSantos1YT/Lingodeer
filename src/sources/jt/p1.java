package jt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37108a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f37110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37111d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(l1.b1 b1Var, vt.n0 n0Var, vy.d dVar) {
        super(1, dVar);
        this.f37111d = b1Var;
        this.f37110c = n0Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f37108a) {
            case 0:
                return new p1(this.f37111d, this.f37110c, dVar);
            default:
                return new p1(this.f37110c, this.f37111d, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f37108a) {
            case 0:
                break;
        }
        return ((p1) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f37108a;
        l1.b1 b1Var = this.f37111d;
        vy.d dVar = null;
        vt.n0 n0Var = this.f37110c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f37109b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                b1Var.setValue(Boolean.valueOf(!((Boolean) b1Var.getValue()).booleanValue()));
                boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
                this.f37109b = 1;
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new fr.j0((fr.o0) n0Var, zBooleanValue, dVar, 6), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f37109b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    fr.o0 o0Var = (fr.o0) n0Var;
                    boolean z11 = !o0Var.f27733a.enableM13OptionLuoma;
                    this.f37109b = 1;
                    yz.f fVar2 = rz.o0.f50940a;
                    Object objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var, z11, dVar, 7), this);
                    if (objM2 != aVar2) {
                        objM2 = b0Var;
                    }
                    if (objM2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var.setValue(Boolean.valueOf(((fr.o0) n0Var).f27733a.enableM13OptionLuoma));
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(vt.n0 n0Var, l1.b1 b1Var, vy.d dVar) {
        super(1, dVar);
        this.f37110c = n0Var;
        this.f37111d = b1Var;
    }
}
