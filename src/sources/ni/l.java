package ni;

import a.ar.MFeWs;
import java.util.List;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f43829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f43830d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(m mVar, List list, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43827a = i11;
        this.f43829c = mVar;
        this.f43830d = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43827a) {
            case 0:
                return new l(this.f43829c, this.f43830d, dVar, 0);
            case 1:
                return new l(this.f43829c, this.f43830d, dVar, 1);
            case 2:
                return new l(this.f43829c, this.f43830d, dVar, 2);
            default:
                return new l(this.f43829c, this.f43830d, dVar, 3);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f43827a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((l) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f43827a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f43828b;
                m mVar = this.f43829c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f43828b = 1;
                    obj = mVar.c("subs", this.f43830d, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list = (List) obj;
                if (!list.isEmpty()) {
                    mVar.H.k(list.get(0));
                }
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f43828b;
                m mVar2 = this.f43829c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f43828b = 1;
                    obj = mVar2.c("subs", this.f43830d, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    mVar2.K.k(list2.get(0));
                }
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f43828b;
                m mVar3 = this.f43829c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f43828b = 1;
                    obj = mVar3.c("subs", this.f43830d, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list3 = (List) obj;
                if (!list3.isEmpty()) {
                    mVar3.L.k(list3.get(0));
                }
                return qy.b0.f48488a;
            default:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f43828b;
                m mVar4 = this.f43829c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    this.f43828b = 1;
                    obj = mVar4.c("subs", this.f43830d, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException(MFeWs.BQY);
                    }
                    com.bumptech.glide.e.F(obj);
                }
                List list4 = (List) obj;
                if (!list4.isEmpty()) {
                    mVar4.M.k(list4.get(0));
                }
                return qy.b0.f48488a;
        }
    }
}
