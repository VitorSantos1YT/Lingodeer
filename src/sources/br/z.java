package br;

import com.lingo.main.ui.MainComposeActivity;
import tu.m0;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MainComposeActivity f5109c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(MainComposeActivity mainComposeActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5107a = i11;
        this.f5109c = mainComposeActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5107a) {
            case 0:
                return new z(this.f5109c, dVar, 0);
            case 1:
                return new z(this.f5109c, dVar, 1);
            case 2:
                return new z(this.f5109c, dVar, 2);
            default:
                return new z(this.f5109c, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f5107a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((z) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5107a;
        MainComposeActivity mainComposeActivity = this.f5109c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f5108b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                ((m0) mainComposeActivity.H.getValue()).b(tu.m.f52602a);
                i1 i1Var = ((vt.d) mainComposeActivity.k()).f54194d;
                y yVar = new y(mainComposeActivity, null, 0);
                this.f5108b = 1;
                return x0.i(i1Var, yVar, this) == aVar ? aVar : b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f5108b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                int i14 = MainComposeActivity.U;
                ar.e eVar = (ar.e) mainComposeActivity.P.getValue();
                this.f5108b = 1;
                return eVar.d(this) == aVar2 ? aVar2 : b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f5108b;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.c cVarK = mainComposeActivity.k();
                this.f5108b = 1;
                ((vt.d) cVarK).h(this);
                return b0Var == aVar3 ? aVar3 : b0Var;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f5108b;
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.c cVarK2 = mainComposeActivity.k();
                this.f5108b = 1;
                ((vt.d) cVarK2).c(this);
                return b0Var == aVar4 ? aVar4 : b0Var;
        }
    }
}
