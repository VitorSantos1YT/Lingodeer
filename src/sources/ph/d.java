package ph;

import java.util.List;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f46856c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f46854a = i11;
        this.f46856c = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f46854a) {
            case 0:
                d dVar2 = new d(this.f46856c, dVar, 0);
                dVar2.f46855b = obj;
                return dVar2;
            default:
                d dVar3 = new d(this.f46856c, dVar, 1);
                dVar3.f46855b = obj;
                return dVar3;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        mh.i iVar = (mh.i) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f46854a) {
            case 0:
                break;
        }
        return ((d) create(iVar, dVar)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f46854a;
        List list = this.f46856c;
        switch (i11) {
            case 0:
                mh.i iVar = (mh.i) this.f46855b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return mh.i.a(iVar, list.contains(new Long(iVar.f41135a)) ? mh.f.IN_PROGRESS : mh.f.NOT_STUDY, false, false, 447);
            default:
                mh.i iVar2 = (mh.i) this.f46855b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return mh.i.a(iVar2, list.contains(new Long(iVar2.f41135a)) ? mh.f.IN_PROGRESS : mh.f.NOT_STUDY, false, false, 447);
        }
    }
}
