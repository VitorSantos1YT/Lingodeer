package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f6330a;
    private static final e00.g descriptor;

    static {
        m0 m0Var = new m0();
        f6330a = m0Var;
        f1 f1Var = new f1("com.lingodeer.media.tone.WarningInfo", m0Var, 2);
        f1Var.k("message", false);
        f1Var.k("code", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{t1.f28468a, g00.m0.f28434a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        String strK = null;
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                iP = aVarD.p(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new o0(i11, iP, strK);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        o0 value = (o0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.w(gVar, 0, value.f6337a);
        bVarD.g(1, value.f6338b, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
