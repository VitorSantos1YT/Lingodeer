package bv;

import am.rVFB.LwKl;
import g00.d1;
import g00.f1;
import g00.t1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class x implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f6375a;
    private static final e00.g descriptor;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = z.f6379e;
        g00.m0 m0Var = g00.m0.f28434a;
        return new c00.a[]{t1.f28468a, m0Var, m0Var, hVarArr[3].getValue()};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = z.f6379e;
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        String strK = null;
        List list = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                iP = aVarD.p(gVar, 1);
                i11 |= 2;
            } else if (iN == 2) {
                iP2 = aVarD.p(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                list = (List) aVarD.t(gVar, 3, (c00.a) hVarArr[3].getValue(), list);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new z(i11, strK, iP, iP2, list);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        z value = (z) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = z.f6379e;
        bVarD.w(gVar, 0, value.f6380a);
        bVarD.g(1, value.f6381b, gVar);
        bVarD.g(2, value.f6382c, gVar);
        bVarD.A(gVar, 3, (c00.a) hVarArr[3].getValue(), value.f6383d);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        x xVar = new x();
        f6375a = xVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.SimpleToneResult", xVar, 4);
        f1Var.k("targetPinyin", false);
        f1Var.k(LwKl.FbeOTSyyZdeQSvu, false);
        f1Var.k("overallScore", false);
        f1Var.k("subDetails", false);
        descriptor = f1Var;
    }
}
