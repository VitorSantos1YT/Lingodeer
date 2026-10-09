package l0;

import f0.n1;
import n0.q0;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f39191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f39192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f39193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, int i11, int i12, vy.d dVar) {
        super(2, dVar);
        this.f39191c = wVar;
        this.f39192d = i11;
        this.f39193e = i12;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        t tVar = new t(this.f39191c, this.f39192d, this.f39193e, dVar);
        tVar.f39190b = obj;
        return tVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((n1) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f39189a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            n1 n1Var = (n1) this.f39190b;
            w wVar = this.f39191c;
            s sVar = new s(n1Var, wVar, 0);
            v3.c cVar = ((o) wVar.f39207f.getValue()).f39154i;
            this.f39189a = 1;
            if (q0.a(sVar, this.f39192d, this.f39193e, 100, cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return b0.f48488a;
    }
}
