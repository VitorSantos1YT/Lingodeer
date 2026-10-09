package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f44025a;
    private static final e00.g descriptor;

    static {
        u0 u0Var = new u0();
        f44025a = u0Var;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainToken", u0Var, 6);
        f1Var.k("word", true);
        f1Var.k("tWord", true);
        f1Var.k("meaning", true);
        f1Var.k("reading", true);
        f1Var.k("romaji", true);
        f1Var.k("is_highlight", true);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, qx.b.s(t1Var), t1Var, qx.b.s(t1Var), t1Var, g00.g.f28401a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        boolean zW = false;
        String strK = null;
        String str = null;
        String strK2 = null;
        String str2 = null;
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
                    str = (String) aVarD.s(gVar, 1, t1.f28468a, str);
                    i11 |= 2;
                    break;
                case 2:
                    strK2 = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    str2 = (String) aVarD.s(gVar, 3, t1.f28468a, str2);
                    i11 |= 8;
                    break;
                case 4:
                    strK3 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    zW = aVarD.w(gVar, 5);
                    i11 |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new w0(i11, strK, str, strK2, str2, strK3, zW);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        w0 value = (w0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        boolean z11 = value.f44035f;
        String str = value.f44034e;
        String str2 = value.f44033d;
        String str3 = value.f44032c;
        String str4 = value.f44031b;
        String str5 = value.f44030a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str5, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 0, str5);
        }
        if (bVarD.G(gVar) || str4 != null) {
            bVarD.x(gVar, 1, t1.f28468a, str4);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str3, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 2, str3);
        }
        if (bVarD.G(gVar) || str2 != null) {
            bVarD.x(gVar, 3, t1.f28468a, str2);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 4, str);
        }
        if (bVarD.G(gVar) || z11) {
            bVarD.B(gVar, 5, z11);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
