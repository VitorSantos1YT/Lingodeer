package jt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f37147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f37148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ String f37149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f37150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns.l f37151f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(vt.n0 n0Var, ns.l lVar, vy.d dVar) {
        super(4, dVar);
        this.f37150e = n0Var;
        this.f37151f = lVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        r1 r1Var = new r1(this.f37150e, this.f37151f, (vy.d) obj4);
        r1Var.f37147b = (List) obj;
        r1Var.f37148c = (List) obj2;
        r1Var.f37149d = (String) obj3;
        return r1Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        List list = this.f37147b;
        List list2 = this.f37148c;
        String str = this.f37149d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f37146a;
        boolean z11 = false;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (((fr.o0) this.f37150e).c()) {
                this.f37147b = null;
                this.f37148c = null;
                this.f37149d = null;
                this.f37146a = 1;
                obj = this.f37151f.a(list, str, list2, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return Boolean.valueOf(z11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        if (((ns.h) obj).f43976a == ns.q.CORRECT) {
            z11 = true;
        }
        return Boolean.valueOf(z11);
    }
}
