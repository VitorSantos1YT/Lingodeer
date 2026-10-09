package rt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v9 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f50536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f50537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f50538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y9 f50539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(y9 y9Var, vy.d dVar) {
        super(4, dVar);
        this.f50539d = y9Var;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        v9 v9Var = new v9(this.f50539d, (vy.d) obj4);
        v9Var.f50536a = iIntValue;
        v9Var.f50537b = (List) obj2;
        v9Var.f50538c = iIntValue2;
        return v9Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f50536a;
        List list = this.f50537b;
        int i12 = this.f50538c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        if (list.isEmpty()) {
            return ec.f49694a;
        }
        int size = list.size();
        y9 y9Var = this.f50539d;
        if (i11 >= size) {
            return new fc(y9Var.Q, 1.0f, i12);
        }
        return new fc(y9Var.Q, i11 / list.size(), i12);
    }
}
