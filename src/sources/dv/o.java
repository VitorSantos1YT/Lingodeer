package dv;

import g00.d1;
import g00.f1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f24493a;
    private static final e00.g descriptor;

    static {
        o oVar = new o();
        f24493a = oVar;
        f1 f1Var = new f1("com.lingodeer.network.GeminiCandidate", oVar, 1);
        f1Var.k("content", true);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{u.f24521a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        w wVar = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else {
                if (iN != 0) {
                    throw new UnknownFieldException(iN);
                }
                wVar = (w) aVarD.t(gVar, 0, u.f24521a, wVar);
                i11 = 1;
            }
        }
        aVarD.c(gVar);
        return new q(i11, wVar);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        q value = (q) obj;
        kotlin.jvm.internal.m.f(value, "value");
        w wVar = value.f24501a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(wVar, new w())) {
            bVarD.A(gVar, 0, u.f24521a, wVar);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
