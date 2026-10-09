package mv;

import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rz.o0;
import uz.i1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f42279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(y yVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f42277a = i11;
        this.f42279c = yVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f42277a) {
            case 0:
                return new v(this.f42279c, dVar, 0);
            default:
                return new v(this.f42279c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f42277a) {
            case 0:
                break;
        }
        return ((v) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i11 = this.f42277a;
        qy.b0 b0Var = qy.b0.f48488a;
        y yVar = this.f42279c;
        int i12 = 1;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f42278b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                fv.c cVar = yVar.f42292c;
                List list = yVar.f42293d.f38753f;
                ArrayList arrayList = new ArrayList(ry.n.W(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kv.l0) it.next()).f38779c);
                }
                rz.b0 viewModelScope = ViewModelKt.getViewModelScope(yVar);
                iv.t tVar = new iv.t(yVar, i12);
                this.f42278b = 1;
                return r.a(cVar, arrayList, ry.r.f50854a, viewModelScope, tVar, this) == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f42278b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar = o0.f50940a;
                    yz.e eVar = yz.e.f58387a;
                    cu.c cVar2 = new cu.c(yVar, null);
                    this.f42278b = 1;
                    obj = rz.e0.M(eVar, cVar2, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list2 = (List) obj;
                i1 i1Var = yVar.f42294e;
                do {
                    value = i1Var.getValue();
                } while (!i1Var.j(value, list2));
                return b0Var;
        }
    }
}
