package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f43966a;
    private static final e00.g descriptor;

    static {
        d0 d0Var = new d0();
        f43966a = d0Var;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainHeader", d0Var, 2);
        f1Var.k("title", true);
        f1Var.k("subtitle", true);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        String strK = null;
        boolean z11 = true;
        int i11 = 0;
        String strK2 = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                strK2 = aVarD.k(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new f0(i11, strK, strK2);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        f0 value = (f0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        String str = value.f43969b;
        String str2 = value.f43968a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str2, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 0, str2);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 1, str);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
