package kt;

import j3.t;
import kotlin.jvm.internal.m;
import l1.b1;
import o3.w;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f38684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(String str, b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38682a = i11;
        this.f38683b = str;
        this.f38684c = b1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38682a) {
            case 0:
                return new k(this.f38683b, this.f38684c, dVar, 0);
            default:
                return new k(this.f38683b, this.f38684c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38682a) {
            case 0:
                k kVar = (k) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                kVar.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                k kVar2 = (k) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                kVar2.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f38682a;
        qy.b0 b0Var = qy.b0.f48488a;
        b1 b1Var = this.f38684c;
        String str = this.f38683b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!m.a(str, ((w) b1Var.getValue()).f44704a.f35700b)) {
                    int length = str.length();
                    b1Var.setValue(new w(str, t.b(length, length), 4));
                }
                break;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                if (!m.a(str, ((w) b1Var.getValue()).f44704a.f35700b)) {
                    int length2 = str.length();
                    b1Var.setValue(new w(str, t.b(length2, length2), 4));
                }
                break;
        }
        return b0Var;
    }
}
