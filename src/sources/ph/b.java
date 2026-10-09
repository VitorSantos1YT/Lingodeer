package ph;

import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f46847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f46848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f46849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f46850d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, vy.d dVar) {
        super(4, dVar);
        this.f46850d = kVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        b bVar = new b(this.f46850d, (vy.d) obj4);
        bVar.f46847a = zBooleanValue;
        bVar.f46848b = (List) obj2;
        bVar.f46849c = (List) obj3;
        return bVar.invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        boolean z11 = this.f46847a;
        List list = this.f46848b;
        List list2 = this.f46849c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        return new a(this.f46850d.f46878a, z11, list, list2);
    }
}
