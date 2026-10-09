package bv;

import g00.d1;
import g00.f1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f6292a;
    private static final e00.g descriptor;

    static {
        d0 d0Var = new d0();
        f6292a = d0Var;
        f1 f1Var = new f1("com.lingodeer.media.tone.TimeSpan", d0Var, 2);
        f1Var.k("end", false);
        f1Var.k("start", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        g00.m0 m0Var = g00.m0.f28434a;
        return new c00.a[]{m0Var, m0Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                iP = aVarD.p(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                iP2 = aVarD.p(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new f0(i11, iP, iP2);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        f0 value = (f0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.g(0, value.f6296a, gVar);
        bVarD.g(1, value.f6297b, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
