package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f6329a;
    private static final e00.g descriptor;

    static {
        m mVar = new m();
        f6329a = mVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.PhonemeResult", mVar, 6);
        f1Var.k("pronunciation", false);
        f1Var.k("tone_index", false);
        f1Var.k("category", false);
        f1Var.k("span", false);
        f1Var.k("phone", false);
        f1Var.k("phoneme", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{g00.v.f28479a, t1Var, g00.m0.f28434a, d0.f6292a, t1Var, t1Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        int iP = 0;
        double dE = 0.0d;
        String strK = null;
        f0 f0Var = null;
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
                    dE = aVarD.e(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strK = aVarD.k(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    iP = aVarD.p(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    f0Var = (f0) aVarD.t(gVar, 3, d0.f6292a, f0Var);
                    i11 |= 8;
                    break;
                case 4:
                    strK2 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    strK3 = aVarD.k(gVar, 5);
                    i11 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new o(i11, dE, strK, iP, f0Var, strK2, strK3);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        o value = (o) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.q(gVar, 0, value.f6331a);
        bVarD.w(gVar, 1, value.f6332b);
        bVarD.g(2, value.f6333c, gVar);
        bVarD.A(gVar, 3, d0.f6292a, value.f6334d);
        bVarD.w(gVar, 4, value.f6335e);
        bVarD.w(gVar, 5, value.f6336f);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
