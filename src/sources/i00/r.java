package i00;

import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r extends xy.h implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ qy.b f33933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.android.billingclient.api.g f33934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.android.billingclient.api.g gVar, vy.d dVar) {
        super(3, dVar);
        this.f33934c = gVar;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = new r(this.f33934c, (vy.d) obj3);
        rVar.f33933b = (qy.b) obj;
        return rVar.invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        com.android.billingclient.api.g gVar = this.f33934c;
        a.a aVar = (a.a) gVar.f7507c;
        qy.b bVar = this.f33933b;
        wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f33932a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            byte bI = aVar.I();
            if (bI == 1) {
                return gVar.d(true);
            }
            if (bI == 0) {
                return gVar.d(false);
            }
            if (bI != 6) {
                if (bI == 8) {
                    return gVar.c();
                }
                a.a.u(aVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f33933b = null;
            this.f33932a = 1;
            obj = com.android.billingclient.api.g.a(gVar, bVar, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return (h00.m) obj;
    }
}
