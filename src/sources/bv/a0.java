package bv;

import com.google.zxing.pdf417.decoder.vBn.xTCJ;
import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f6279a;
    private static final e00.g descriptor;

    static {
        a0 a0Var = new a0();
        f6279a = a0Var;
        f1 f1Var = new f1("com.lingodeer.media.tone.SubDetails", a0Var, 7);
        f1Var.k("shengMu", false);
        f1Var.k("shengMuScore", false);
        f1Var.k("yunMu", false);
        f1Var.k("yunMuScore", false);
        f1Var.k("tone", false);
        f1Var.k("toneScore", false);
        f1Var.k("pronunciation", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        g00.m0 m0Var = g00.m0.f28434a;
        return new c00.a[]{t1Var, m0Var, t1Var, m0Var, t1Var, m0Var, m0Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        int iP4 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    strK = aVarD.k(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    iP = aVarD.p(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strK2 = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    iP2 = aVarD.p(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strK3 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    iP3 = aVarD.p(gVar, 5);
                    i11 |= 32;
                    break;
                case 6:
                    iP4 = aVarD.p(gVar, 6);
                    i11 |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new c0(i11, strK, iP, strK2, iP2, strK3, iP3, iP4);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        c0 c0Var = (c0) obj;
        kotlin.jvm.internal.m.f(c0Var, xTCJ.EfQYybeuKnRV);
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.w(gVar, 0, c0Var.f6284a);
        bVarD.g(1, c0Var.f6285b, gVar);
        bVarD.w(gVar, 2, c0Var.f6286c);
        bVarD.g(3, c0Var.f6287d, gVar);
        bVarD.w(gVar, 4, c0Var.f6288e);
        bVarD.g(5, c0Var.f6289f, gVar);
        bVarD.g(6, c0Var.f6290g, gVar);
        bVarD.c(gVar);
    }
}
