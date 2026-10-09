package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t0 f6356a;
    private static final e00.g descriptor;

    static {
        t0 t0Var = new t0();
        f6356a = t0Var;
        f1 f1Var = new f1("com.lingodeer.media.tone.WordResult", t0Var, 12);
        f1Var.k("word_parts", false);
        f1Var.k("charType", false);
        f1Var.k("pinyin", false);
        f1Var.k("rawpinyin", false);
        f1Var.k("symbolpinyin", false);
        f1Var.k("readType", false);
        f1Var.k("repetition", true);
        f1Var.k("phonemes", false);
        f1Var.k("span", false);
        f1Var.k("word", false);
        f1Var.k("tone", false);
        f1Var.k("scores", false);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = v0.m;
        g00.m0 m0Var = g00.m0.f28434a;
        t1 t1Var = t1.f28468a;
        return new c00.a[]{s0.f6350a, m0Var, t1Var, t1Var, t1Var, m0Var, qx.b.s((c00.a) hVarArr[6].getValue()), hVarArr[7].getValue(), d0.f6292a, t1Var, t1Var, w0.f6374a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = v0.m;
        f0 f0Var = null;
        y0 y0Var = null;
        List list = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        List list2 = null;
        List list3 = null;
        String strK4 = null;
        String strK5 = null;
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        int iP2 = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    list = (List) aVarD.t(gVar, 0, s0.f6350a, list);
                    i11 |= 1;
                    break;
                case 1:
                    iP = aVarD.p(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strK = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strK2 = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strK3 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    iP2 = aVarD.p(gVar, 5);
                    i11 |= 32;
                    break;
                case 6:
                    list2 = (List) aVarD.s(gVar, 6, (c00.a) hVarArr[6].getValue(), list2);
                    i11 |= 64;
                    break;
                case 7:
                    list3 = (List) aVarD.t(gVar, 7, (c00.a) hVarArr[7].getValue(), list3);
                    i11 |= 128;
                    break;
                case 8:
                    f0Var = (f0) aVarD.t(gVar, 8, d0.f6292a, f0Var);
                    i11 |= 256;
                    break;
                case 9:
                    strK4 = aVarD.k(gVar, 9);
                    i11 |= 512;
                    break;
                case 10:
                    strK5 = aVarD.k(gVar, 10);
                    i11 |= 1024;
                    break;
                case 11:
                    y0Var = (y0) aVarD.t(gVar, 11, w0.f6374a, y0Var);
                    i11 |= 2048;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new v0(i11, list, iP, strK, strK2, strK3, iP2, list2, list3, f0Var, strK4, strK5, y0Var);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        v0 value = (v0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = v0.m;
        s0 s0Var = s0.f6350a;
        List list = value.f6358a;
        List list2 = value.f6364g;
        bVarD.A(gVar, 0, s0Var, list);
        bVarD.g(1, value.f6359b, gVar);
        bVarD.w(gVar, 2, value.f6360c);
        bVarD.w(gVar, 3, value.f6361d);
        bVarD.w(gVar, 4, value.f6362e);
        bVarD.g(5, value.f6363f, gVar);
        if (bVarD.G(gVar) || list2 != null) {
            bVarD.x(gVar, 6, (c00.a) hVarArr[6].getValue(), list2);
        }
        bVarD.A(gVar, 7, (c00.a) hVarArr[7].getValue(), value.f6365h);
        bVarD.A(gVar, 8, d0.f6292a, value.f6366i);
        bVarD.w(gVar, 9, value.f6367j);
        bVarD.w(gVar, 10, value.f6368k);
        bVarD.A(gVar, 11, w0.f6374a, value.f6369l);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
