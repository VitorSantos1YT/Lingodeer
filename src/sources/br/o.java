package br;

import androidx.lifecycle.ViewModelKt;
import gp.l1;
import gp.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f5074b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(l1 l1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f5073a = i11;
        this.f5074b = l1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f5073a) {
            case 0:
                return new o(this.f5074b, dVar, 0);
            default:
                return new o(this.f5074b, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5073a) {
            case 0:
                o oVar = (o) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                oVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                o oVar2 = (o) create((tt.a) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                oVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f5073a;
        qy.b0 b0Var = qy.b0.f48488a;
        l1 l1Var = this.f5074b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                l1Var.a();
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                rz.e0.B(ViewModelKt.getViewModelScope(l1Var), null, null, new o0(l1Var, null, 3), 3);
                break;
        }
        return b0Var;
    }
}
