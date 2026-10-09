package jt;

import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends xy.i implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f37088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f37091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.p f37092f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f37093t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1(vt.n0 n0Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, x1.p pVar, vy.d dVar, int i11) {
        super(1, dVar);
        this.f37087a = i11;
        this.f37093t = n0Var;
        this.f37089c = b1Var;
        this.f37090d = b1Var2;
        this.f37091e = b1Var3;
        this.f37092f = pVar;
    }

    @Override // xy.a
    public final vy.d create(vy.d dVar) {
        switch (this.f37087a) {
            case 0:
                return new o1(this.f37093t, this.f37089c, this.f37090d, this.f37091e, this.f37092f, dVar, 0);
            default:
                return new o1((fr.o0) this.f37093t, this.f37089c, this.f37090d, this.f37091e, this.f37092f, dVar, 1);
        }
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        vy.d dVar = (vy.d) obj;
        switch (this.f37087a) {
            case 0:
                break;
        }
        return ((o1) create(dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f37087a;
        x1.p pVar = this.f37092f;
        l1.b1 b1Var = this.f37091e;
        int i12 = 13;
        vy.d dVar = null;
        vt.n0 n0Var = this.f37093t;
        l1.b1 b1Var2 = this.f37089c;
        l1.b1 b1Var3 = this.f37090d;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f37088b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    fr.o0 o0Var = (fr.o0) n0Var;
                    boolean z11 = !o0Var.f27733a.isKeyboard;
                    this.f37088b = 1;
                    yz.f fVar = rz.o0.f50940a;
                    Object objM = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var, z11, dVar, i12), this);
                    if (objM != aVar) {
                        objM = b0Var;
                    }
                    if (objM == aVar) {
                        return aVar;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                Env env = ((fr.o0) n0Var).f27733a;
                b1Var2.setValue(Boolean.valueOf(env.isKeyboard));
                ht.q qVar = (ht.q) b1Var3.getValue();
                kotlin.jvm.internal.m.f(qVar, "<this>");
                if (qVar != ht.q.DEFAULT && qVar != ht.q.SELECTED) {
                    return b0Var;
                }
                b1Var3.setValue(md.a.v(env.keyLanguage, ((Boolean) b1Var2.getValue()).booleanValue(), pVar.size(), (String) b1Var.getValue()));
                return b0Var;
            default:
                fr.o0 o0Var2 = (fr.o0) n0Var;
                Env env2 = o0Var2.f27733a;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f37088b;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    boolean z12 = !env2.isKeyboard;
                    this.f37088b = 1;
                    yz.f fVar2 = rz.o0.f50940a;
                    Object objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var2, z12, dVar, i12), this);
                    if (objM2 != aVar2) {
                        objM2 = b0Var;
                    }
                    if (objM2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                b1Var2.setValue(Boolean.valueOf(env2.isKeyboard));
                ht.q qVar2 = (ht.q) b1Var3.getValue();
                kotlin.jvm.internal.m.f(qVar2, "<this>");
                if (qVar2 != ht.q.DEFAULT && qVar2 != ht.q.SELECTED) {
                    return b0Var;
                }
                b1Var3.setValue(md.a.v(env2.keyLanguage, ((Boolean) b1Var2.getValue()).booleanValue(), pVar.size(), (String) b1Var.getValue()));
                return b0Var;
        }
    }
}
