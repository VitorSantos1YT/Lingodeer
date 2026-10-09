package ph;

import java.util.Map;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f46853c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Map map, vy.d dVar, int i11) {
        super(2, dVar);
        this.f46851a = i11;
        this.f46853c = map;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f46851a) {
            case 0:
                c cVar = new c(this.f46853c, dVar, 0);
                cVar.f46852b = obj;
                return cVar;
            default:
                c cVar2 = new c(this.f46853c, dVar, 1);
                cVar2.f46852b = obj;
                return cVar2;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        mh.i iVar = (mh.i) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f46851a) {
            case 0:
                break;
        }
        return ((c) create(iVar, dVar)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f46851a;
        Map map = this.f46853c;
        switch (i11) {
            case 0:
                mh.i iVar = (mh.i) this.f46852b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Boolean bool = (Boolean) map.get(new Long(iVar.f41135a));
                return bool != null ? mh.i.a(iVar, null, false, bool.booleanValue(), 255) : iVar;
            default:
                mh.i iVar2 = (mh.i) this.f46852b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Boolean bool2 = (Boolean) map.get(new Long(iVar2.f41135a));
                return bool2 != null ? mh.i.a(iVar2, null, false, bool2.booleanValue(), 255) : iVar2;
        }
    }
}
