package dv;

import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f24442a;
    private static final e00.g descriptor;

    static {
        d0 d0Var = new d0();
        f24442a = d0Var;
        f1 f1Var = new f1("com.lingodeer.network.GeminiServerResponse", d0Var, 3);
        f1Var.k("result", true);
        f1Var.k("status", true);
        f1Var.k("error", true);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{x.f24530a, g00.m0.f28434a, t1.f28468a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        z zVar = null;
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        String strK = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                zVar = (z) aVarD.t(gVar, 0, x.f24530a, zVar);
                i11 |= 1;
            } else if (iN == 1) {
                iP = aVarD.p(gVar, 1);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                strK = aVarD.k(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new f0(i11, zVar, iP, strK);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        f0 value = (f0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        String str = value.f24447c;
        int i11 = value.f24446b;
        z zVar = value.f24445a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(zVar, new z())) {
            bVarD.A(gVar, 0, x.f24530a, zVar);
        }
        if (bVarD.G(gVar) || i11 != 0) {
            bVarD.g(1, i11, gVar);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 2, str);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
