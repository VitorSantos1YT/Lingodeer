package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f6313a;
    private static final e00.g descriptor;

    static {
        j0 j0Var = new j0();
        f6313a = j0Var;
        f1 f1Var = new f1("com.lingodeer.media.tone.ToneAssessmentResult", j0Var, 11);
        f1Var.k("eof", false);
        f1Var.k("tokenId", false);
        f1Var.k("applicationId", true);
        f1Var.k("audioUrl", true);
        f1Var.k("result", false);
        f1Var.k("recordId", true);
        f1Var.k("params", true);
        f1Var.k("refText", false);
        f1Var.k("error", true);
        f1Var.k("errId", true);
        f1Var.k("dtLastResponse", true);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        g00.m0 m0Var = g00.m0.f28434a;
        t1 t1Var = t1.f28468a;
        return new c00.a[]{m0Var, t1Var, qx.b.s(t1Var), qx.b.s(t1Var), g.f6298a, qx.b.s(t1Var), qx.b.s(d.f6291a), t1Var, qx.b.s(t1Var), qx.b.s(m0Var), qx.b.s(t1Var)};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        Integer num = null;
        String str = null;
        String strK = null;
        String str2 = null;
        String str3 = null;
        i iVar = null;
        String str4 = null;
        f fVar = null;
        String strK2 = null;
        String str5 = null;
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    iP = aVarD.p(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strK = aVarD.k(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    str2 = (String) aVarD.s(gVar, 2, t1.f28468a, str2);
                    i11 |= 4;
                    break;
                case 3:
                    str3 = (String) aVarD.s(gVar, 3, t1.f28468a, str3);
                    i11 |= 8;
                    break;
                case 4:
                    iVar = (i) aVarD.t(gVar, 4, g.f6298a, iVar);
                    i11 |= 16;
                    break;
                case 5:
                    str4 = (String) aVarD.s(gVar, 5, t1.f28468a, str4);
                    i11 |= 32;
                    break;
                case 6:
                    fVar = (f) aVarD.s(gVar, 6, d.f6291a, fVar);
                    i11 |= 64;
                    break;
                case 7:
                    strK2 = aVarD.k(gVar, 7);
                    i11 |= 128;
                    break;
                case 8:
                    str5 = (String) aVarD.s(gVar, 8, t1.f28468a, str5);
                    i11 |= 256;
                    break;
                case 9:
                    num = (Integer) aVarD.s(gVar, 9, g00.m0.f28434a, num);
                    i11 |= 512;
                    break;
                case 10:
                    str = (String) aVarD.s(gVar, 10, t1.f28468a, str);
                    i11 |= 1024;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new l0(i11, iP, strK, str2, str3, iVar, str4, fVar, strK2, str5, num, str);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        l0 value = (l0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        int i11 = value.f6318a;
        String str = value.f6328k;
        Integer num = value.f6327j;
        String str2 = value.f6326i;
        f fVar = value.f6324g;
        String str3 = value.f6323f;
        String str4 = value.f6321d;
        String str5 = value.f6320c;
        bVarD.g(0, i11, gVar);
        bVarD.w(gVar, 1, value.f6319b);
        if (bVarD.G(gVar) || str5 != null) {
            bVarD.x(gVar, 2, t1.f28468a, str5);
        }
        if (bVarD.G(gVar) || str4 != null) {
            bVarD.x(gVar, 3, t1.f28468a, str4);
        }
        bVarD.A(gVar, 4, g.f6298a, value.f6322e);
        if (bVarD.G(gVar) || str3 != null) {
            bVarD.x(gVar, 5, t1.f28468a, str3);
        }
        if (bVarD.G(gVar) || fVar != null) {
            bVarD.x(gVar, 6, d.f6291a, fVar);
        }
        bVarD.w(gVar, 7, value.f6325h);
        if (bVarD.G(gVar) || str2 != null) {
            bVarD.x(gVar, 8, t1.f28468a, str2);
        }
        if (bVarD.G(gVar) || num != null) {
            bVarD.x(gVar, 9, g00.m0.f28434a, num);
        }
        if (bVarD.G(gVar) || str != null) {
            bVarD.x(gVar, 10, t1.f28468a, str);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
