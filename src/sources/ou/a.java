package ou;

import e00.g;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.t1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.h;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f46066a;
    private static final g descriptor;

    static {
        a aVar = new a();
        f46066a = aVar;
        f1 f1Var = new f1("com.lingodeer.hanziwriter.data.HanziBean", aVar, 6);
        f1Var.k("character", false);
        f1Var.k("strokes", false);
        f1Var.k("medians", false);
        f1Var.k("radStrokes", true);
        f1Var.k("width", true);
        f1Var.k("height", true);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        h[] hVarArr = c.f46067j;
        m0 m0Var = m0.f28434a;
        return new c00.a[]{t1.f28468a, hVarArr[1].getValue(), hVarArr[2].getValue(), hVarArr[3].getValue(), m0Var, m0Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        h[] hVarArr = c.f46067j;
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        String strK = null;
        List list = null;
        List list2 = null;
        List list3 = null;
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
                    list = (List) aVarD.t(gVar, 1, (c00.a) hVarArr[1].getValue(), list);
                    i11 |= 2;
                    break;
                case 2:
                    list2 = (List) aVarD.t(gVar, 2, (c00.a) hVarArr[2].getValue(), list2);
                    i11 |= 4;
                    break;
                case 3:
                    list3 = (List) aVarD.t(gVar, 3, (c00.a) hVarArr[3].getValue(), list3);
                    i11 |= 8;
                    break;
                case 4:
                    iP = aVarD.p(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    iP2 = aVarD.p(gVar, 5);
                    i11 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new c(i11, strK, list, list2, list3, iP, iP2);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        c value = (c) obj;
        m.f(value, "value");
        g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        h[] hVarArr = c.f46067j;
        String str = value.f46068a;
        List list = value.f46071d;
        bVarD.w(gVar, 0, str);
        bVarD.A(gVar, 1, (c00.a) hVarArr[1].getValue(), value.f46069b);
        bVarD.A(gVar, 2, (c00.a) hVarArr[2].getValue(), value.f46070c);
        if (bVarD.G(gVar) || !m.a(list, r.f50854a)) {
            bVarD.A(gVar, 3, (c00.a) hVarArr[3].getValue(), list);
        }
        if (bVarD.G(gVar) || value.f46075h != 0) {
            bVarD.g(4, value.f46075h, gVar);
        }
        if (bVarD.G(gVar) || value.f46076i != 0) {
            bVarD.g(5, value.f46076i, gVar);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
