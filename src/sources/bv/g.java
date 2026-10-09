package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6298a;
    private static final e00.g descriptor;

    static {
        g gVar = new g();
        f6298a = gVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.AssessmentResultData", gVar, 9);
        f1Var.k("overall", false);
        f1Var.k("pronunciation", false);
        f1Var.k("words", false);
        f1Var.k("kernel_version", false);
        f1Var.k("warning", true);
        f1Var.k("duration", false);
        f1Var.k("numeric_duration", true);
        f1Var.k("tone", false);
        f1Var.k("resource_version", false);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = i.f6302j;
        g00.v vVar = g00.v.f28479a;
        t1 t1Var = t1.f28468a;
        return new c00.a[]{vVar, vVar, hVarArr[2].getValue(), t1Var, qx.b.s((c00.a) hVarArr[4].getValue()), t1Var, qx.b.s(vVar), vVar, t1Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = i.f6302j;
        List list = null;
        double dE = 0.0d;
        double dE2 = 0.0d;
        double dE3 = 0.0d;
        Double d5 = null;
        List list2 = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        int i11 = 0;
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
                    dE2 = aVarD.e(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    list2 = (List) aVarD.t(gVar, 2, (c00.a) hVarArr[2].getValue(), list2);
                    i11 |= 4;
                    break;
                case 3:
                    strK = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    list = (List) aVarD.s(gVar, 4, (c00.a) hVarArr[4].getValue(), list);
                    i11 |= 16;
                    break;
                case 5:
                    strK2 = aVarD.k(gVar, 5);
                    i11 |= 32;
                    break;
                case 6:
                    d5 = (Double) aVarD.s(gVar, 6, g00.v.f28479a, d5);
                    i11 |= 64;
                    break;
                case 7:
                    dE3 = aVarD.e(gVar, 7);
                    i11 |= 128;
                    break;
                case 8:
                    strK3 = aVarD.k(gVar, 8);
                    i11 |= 256;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new i(i11, dE, dE2, list2, strK, list, strK2, d5, dE3, strK3);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        i value = (i) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = i.f6302j;
        double d5 = value.f6303a;
        Double d11 = value.f6309g;
        List list = value.f6307e;
        bVarD.q(gVar, 0, d5);
        bVarD.q(gVar, 1, value.f6304b);
        bVarD.A(gVar, 2, (c00.a) hVarArr[2].getValue(), value.f6305c);
        bVarD.w(gVar, 3, value.f6306d);
        if (bVarD.G(gVar) || list != null) {
            bVarD.x(gVar, 4, (c00.a) hVarArr[4].getValue(), list);
        }
        bVarD.w(gVar, 5, value.f6308f);
        if (bVarD.G(gVar) || d11 != null) {
            bVarD.x(gVar, 6, g00.v.f28479a, d11);
        }
        bVarD.q(gVar, 7, value.f6310h);
        bVarD.w(gVar, 8, value.f6311i);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
