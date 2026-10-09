package mv;

import rt.fb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f42248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ fb f42249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f42247a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        fb fbVar = (fb) obj2;
        vy.d dVar = (vy.d) obj3;
        switch (this.f42247a) {
            case 0:
                m mVar = new m(3, 0, dVar);
                mVar.f42248b = str;
                mVar.f42249c = fbVar;
                return mVar.invokeSuspend(qy.b0.f48488a);
            default:
                m mVar2 = new m(3, 1, dVar);
                mVar2.f42248b = str;
                mVar2.f42249c = fbVar;
                return mVar2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f42247a) {
            case 0:
                String str = this.f42248b;
                fb fbVar = this.f42249c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new j(fbVar, str);
            default:
                String str2 = this.f42248b;
                fb fbVar2 = this.f42249c;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new sv.b(fbVar2, str2);
        }
    }
}
