package mv;

import androidx.lifecycle.ViewModelKt;
import fr.o0;
import java.util.List;
import uz.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f42242c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(n nVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f42240a = i11;
        this.f42242c = nVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f42240a) {
            case 0:
                return new l(this.f42242c, dVar, 0);
            default:
                return new l(this.f42242c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f42240a) {
            case 0:
                break;
        }
        return ((l) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f42240a;
        int i12 = 4;
        n nVar = this.f42242c;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f42241b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                fv.c cVar = nVar.f42252b;
                List list = r.f42271a;
                List list2 = r.f42272b;
                rz.b0 viewModelScope = ViewModelKt.getViewModelScope(nVar);
                iv.h hVar = new iv.h(nVar, i12);
                this.f42241b = 1;
                return r.a(cVar, list, list2, viewModelScope, hVar, this) == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f42241b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.b bVar = nVar.f42253c;
                    this.f42241b = 1;
                    o0 o0Var = (o0) ((fr.k) bVar).f27639a;
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new fr.g0(i12, o0Var, null), this);
                    if (objM != aVar2) {
                        objM = b0Var;
                    }
                    if (objM != aVar2) {
                        objM = b0Var;
                    }
                    if (objM != aVar2) {
                    }
                    return aVar2;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                w0 w0Var = nVar.f42256f;
                this.f42241b = 2;
                if (w0Var.emit(a.f42189a, this) != aVar2) {
                    return b0Var;
                }
                return aVar2;
        }
    }
}
