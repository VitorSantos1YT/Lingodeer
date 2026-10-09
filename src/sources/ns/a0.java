package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.d1;
import g00.f1;
import g00.t1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f43961a;
    private static final e00.g descriptor;

    static {
        a0 a0Var = new a0();
        f43961a = a0Var;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainExample", a0Var, 2);
        f1Var.k("full_translation", true);
        f1Var.k("tokens", true);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{t1.f28468a, c0.f43962c[1].getValue()};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = c0.f43962c;
        String strK = null;
        boolean z11 = true;
        int i11 = 0;
        List list = null;
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
                list = (List) aVarD.t(gVar, 1, (c00.a) hVarArr[1].getValue(), list);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new c0(i11, strK, list);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        c0 value = (c0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        List list = value.f43964b;
        String str = value.f43963a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = c0.f43962c;
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 0, str);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(list, ry.r.f50854a)) {
            bVarD.A(gVar, 1, (c00.a) hVarArr[1].getValue(), list);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
