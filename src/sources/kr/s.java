package kr;

import com.lingodeer.data.model.UserInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f38576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f38577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(int i11, int i12, vy.d dVar) {
        super(i11, dVar);
        this.f38575a = i12;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f38575a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                s sVar = new s(3, 0, (vy.d) obj3);
                sVar.f38577c = (j) obj;
                sVar.f38576b = zBooleanValue;
                return sVar.invokeSuspend(qy.b0.f48488a);
            default:
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                s sVar2 = new s(3, 1, (vy.d) obj3);
                sVar2.f38577c = (UserInfo) obj;
                sVar2.f38576b = zBooleanValue2;
                return sVar2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f38575a) {
            case 0:
                j jVar = (j) this.f38577c;
                boolean z11 = this.f38576b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new qy.l(jVar, Boolean.valueOf(z11));
            default:
                UserInfo userInfo = (UserInfo) this.f38577c;
                boolean z12 = this.f38576b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return new qy.l(userInfo, Boolean.valueOf(z12));
        }
    }
}
