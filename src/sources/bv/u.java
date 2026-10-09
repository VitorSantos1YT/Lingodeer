package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6357a;
    private static final e00.g descriptor;

    static {
        u uVar = new u();
        f6357a = uVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.RequestParams", uVar, 4);
        f1Var.k("coreType", false);
        f1Var.k("refText", false);
        f1Var.k("tokenId", false);
        f1Var.k("refPinyin", true);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, t1Var, qx.b.s(t1Var)};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String str = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                strK2 = aVarD.k(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                strK3 = aVarD.k(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                str = (String) aVarD.s(gVar, 3, t1.f28468a, str);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new w(i11, strK, strK2, strK3, str);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        w value = (w) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        String str = value.f6370a;
        String str2 = value.f6373d;
        bVarD.w(gVar, 0, str);
        bVarD.w(gVar, 1, value.f6371b);
        bVarD.w(gVar, 2, value.f6372c);
        if (bVarD.G(gVar) || str2 != null) {
            bVarD.x(gVar, 3, t1.f28468a, str2);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
