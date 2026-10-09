package jt;

import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37235a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fr.o0 f37237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(fr.o0 o0Var, l1.b1 b1Var, vy.d dVar) {
        super(1, dVar);
        this.f37237c = o0Var;
        this.f37238d = b1Var;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f37235a) {
            case 0:
                return new v1(this.f37238d, this.f37237c, dVar);
            default:
                return new v1(this.f37237c, this.f37238d, dVar);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f37235a) {
            case 0:
                break;
        }
        return ((v1) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f37235a;
        l1.b1 b1Var = this.f37238d;
        fr.o0 o0Var = this.f37237c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f37236b;
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
                this.f37236b = 1;
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var, zBooleanValue, null, 6), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                Env env = o0Var.f27733a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f37236b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    boolean z11 = !env.enableM13OptionLuoma;
                    this.f37236b = 1;
                    yz.f fVar2 = rz.o0.f50940a;
                    Object objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var, z11, null, 7), this);
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
                b1Var.setValue(Boolean.valueOf(env.enableM13OptionLuoma));
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(l1.b1 b1Var, fr.o0 o0Var, vy.d dVar) {
        super(1, dVar);
        this.f37238d = b1Var;
        this.f37237c = o0Var;
    }
}
