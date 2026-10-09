package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f6312a;
    private static final e00.g descriptor;

    static {
        j jVar = new j();
        f6312a = jVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.AudioParams", jVar, 4);
        f1Var.k("sampleBytes", false);
        f1Var.k("audioType", false);
        f1Var.k("channel", false);
        f1Var.k("sampleRate", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        g00.m0 m0Var = g00.m0.f28434a;
        return new c00.a[]{m0Var, t1.f28468a, m0Var, m0Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        String strK = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                iP = aVarD.p(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                strK = aVarD.k(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                iP2 = aVarD.p(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                iP3 = aVarD.p(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new l(strK, i11, iP, iP2, iP3);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        l value = (l) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.g(0, value.f6314a, gVar);
        bVarD.w(gVar, 1, value.f6315b);
        bVarD.g(2, value.f6316c, gVar);
        bVarD.g(3, value.f6317d, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
