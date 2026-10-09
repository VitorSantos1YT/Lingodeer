package jt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v0 extends xy.i implements fz.g {
    public /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ String f37230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f37232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns.l f37233f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f37234t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(boolean z11, vt.n0 n0Var, ns.l lVar, vy.d dVar, int i11) {
        super(4, dVar);
        this.f37228a = i11;
        this.f37231d = z11;
        this.f37232e = n0Var;
        this.f37233f = lVar;
    }

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f37228a) {
            case 0:
                ns.l lVar = this.f37233f;
                v0 v0Var = new v0(this.f37231d, this.f37232e, lVar, (vy.d) obj4, 0);
                v0Var.f37234t = (List) obj;
                v0Var.H = (List) obj2;
                v0Var.f37230c = (String) obj3;
                return v0Var.invokeSuspend(qy.b0.f48488a);
            default:
                ns.l lVar2 = this.f37233f;
                v0 v0Var2 = new v0(this.f37231d, this.f37232e, lVar2, (vy.d) obj4, 1);
                v0Var2.f37230c = (String) obj;
                v0Var2.f37234t = (String) obj2;
                v0Var2.H = (String) obj3;
                return v0Var2.invokeSuspend(qy.b0.f48488a);
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37228a) {
            case 0:
                List list = (List) this.f37234t;
                List list2 = (List) this.H;
                String str = this.f37230c;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f37229b;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!this.f37231d || !((fr.o0) this.f37232e).c()) {
                        return ns.h.f43975c;
                    }
                    this.f37234t = null;
                    this.H = null;
                    this.f37230c = null;
                    this.f37229b = 1;
                    obj = this.f37233f.a(list, str, list2, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return (ns.h) obj;
            default:
                String str2 = this.f37230c;
                String str3 = (String) this.f37234t;
                String str4 = (String) this.H;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f37229b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (!this.f37231d || !((fr.o0) this.f37232e).c()) {
                        return ns.h.f43975c;
                    }
                    this.f37230c = null;
                    this.f37234t = null;
                    this.H = null;
                    this.f37229b = 1;
                    ns.l lVar = this.f37233f;
                    lVar.getClass();
                    obj = lVar.b(ns.c.SPELLING, str2, str4, str3, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return (ns.h) obj;
        }
    }
}
