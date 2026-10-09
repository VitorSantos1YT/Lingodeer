package rt;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class u6 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x6 f50479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Set f50480e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6(x6 x6Var, Set set, vy.d dVar, int i11) {
        super(2, dVar);
        this.f50476a = i11;
        this.f50479d = x6Var;
        this.f50480e = set;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f50476a) {
            case 0:
                u6 u6Var = new u6(this.f50479d, this.f50480e, dVar, 0);
                u6Var.f50478c = obj;
                return u6Var;
            default:
                u6 u6Var2 = new u6(this.f50479d, this.f50480e, dVar, 1);
                u6Var2.f50478c = obj;
                return u6Var2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f50476a) {
            case 0:
                break;
        }
        return ((u6) create(list, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f50476a) {
            case 0:
                List list = (List) this.f50478c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f50477b;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f50478c = null;
                this.f50477b = 1;
                Object objB = x6.b(this.f50479d, list, this.f50480e, this);
                return objB == aVar ? aVar : objB;
            default:
                List list2 = (List) this.f50478c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f50477b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                this.f50478c = null;
                this.f50477b = 1;
                Serializable serializableA = x6.a(this.f50479d, list2, this.f50480e, this);
                return serializableA == aVar2 ? aVar2 : serializableA;
        }
    }
}
