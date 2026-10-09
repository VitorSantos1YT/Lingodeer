package bv;

import g00.d1;
import g00.f1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f6374a;
    private static final e00.g descriptor;

    static {
        w0 w0Var = new w0();
        f6374a = w0Var;
        f1 f1Var = new f1("com.lingodeer.media.tone.WordScores", w0Var, 3);
        f1Var.k("overall", false);
        f1Var.k("tone", false);
        f1Var.k("pronunciation", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        g00.v vVar = g00.v.f28479a;
        return new c00.a[]{vVar, vVar, vVar};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        double dE = 0.0d;
        double dE2 = 0.0d;
        double dE3 = 0.0d;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                dE = aVarD.e(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                dE2 = aVarD.e(gVar, 1);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                dE3 = aVarD.e(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new y0(i11, dE, dE2, dE3);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        y0 value = (y0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.q(gVar, 0, value.f6376a);
        bVarD.q(gVar, 1, value.f6377b);
        bVarD.q(gVar, 2, value.f6378c);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
