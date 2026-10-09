package g;

import h1.p8;
import kotlin.jvm.internal.u;
import n9.z;
import qy.b0;
import rt.fd;
import rt.jd;
import rt.u8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends xy.i implements fz.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28308b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i11, vy.d dVar) {
        super(i11, dVar);
        this.f28307a = 3;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f28307a) {
            case 0:
                k kVar = new k((u) this.f28308b, (vy.d) obj3, 0);
                b0 b0Var = b0.f48488a;
                kVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                ((Number) obj2).floatValue();
                k kVar2 = new k((p8) this.f28308b, (vy.d) obj3, 1);
                b0 b0Var2 = b0.f48488a;
                kVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                k kVar3 = new k((z) this.f28308b, (vy.d) obj3, 2);
                b0 b0Var3 = b0.f48488a;
                kVar3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                k kVar4 = new k(3, (vy.d) obj3);
                kVar4.f28308b = (u8) obj;
                return kVar4.invokeSuspend(b0.f48488a);
            default:
                k kVar5 = new k((jd) this.f28308b, (vy.d) obj3, 4);
                b0 b0Var4 = b0.f48488a;
                kVar5.invokeSuspend(b0Var4);
                return b0Var4;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f28307a;
        b0 b0Var = b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((u) this.f28308b).f38357a = true;
                return b0Var;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((p8) this.f28308b).f30863l.invoke();
                return b0Var;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                ((z) this.f28308b).getClass();
                return b0Var;
            case 3:
                u8 u8Var = (u8) this.f28308b;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                return u8Var.f50487a.keySet();
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                jd jdVar = (jd) this.f28308b;
                if (!jdVar.N) {
                    jdVar.N = true;
                    jdVar.a("fail");
                }
                jdVar.f49947t.d(fd.f49765a);
                return b0Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, vy.d dVar, int i11) {
        super(3, dVar);
        this.f28307a = i11;
        this.f28308b = obj;
    }
}
