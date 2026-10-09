package ns;

import com.tbruyelle.rxpermissions3.BuildConfig;
import g00.d1;
import g00.f1;
import g00.t1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f44012a;
    private static final e00.g descriptor;

    static {
        p0 p0Var = new p0();
        f44012a = p0Var;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainResponse", p0Var, 5);
        f1Var.k("header", true);
        f1Var.k("comparison_view", true);
        f1Var.k("explanation_md", true);
        f1Var.k("comparison_table", true);
        f1Var.k("examples", true);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{d0.f43966a, qx.b.s(w.f44029a), t1.f28468a, qx.b.s(t.f44023a), r0.f44013f[4].getValue()};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = r0.f44013f;
        int i11 = 0;
        f0 f0Var = null;
        y yVar = null;
        String strK = null;
        v vVar = null;
        List list = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                f0Var = (f0) aVarD.t(gVar, 0, d0.f43966a, f0Var);
                i11 |= 1;
            } else if (iN == 1) {
                yVar = (y) aVarD.s(gVar, 1, w.f44029a, yVar);
                i11 |= 2;
            } else if (iN == 2) {
                strK = aVarD.k(gVar, 2);
                i11 |= 4;
            } else if (iN == 3) {
                vVar = (v) aVarD.s(gVar, 3, t.f44023a, vVar);
                i11 |= 8;
            } else {
                if (iN != 4) {
                    throw new UnknownFieldException(iN);
                }
                list = (List) aVarD.t(gVar, 4, (c00.a) hVarArr[4].getValue(), list);
                i11 |= 16;
            }
        }
        aVarD.c(gVar);
        return new r0(i11, f0Var, yVar, strK, vVar, list);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        r0 value = (r0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        List list = value.f44018e;
        v vVar = value.f44017d;
        String str = value.f44016c;
        y yVar = value.f44015b;
        f0 f0Var = value.f44014a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = r0.f44013f;
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(f0Var, new f0())) {
            bVarD.A(gVar, 0, d0.f43966a, f0Var);
        }
        if (bVarD.G(gVar) || yVar != null) {
            bVarD.x(gVar, 1, w.f44029a, yVar);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(str, BuildConfig.VERSION_NAME)) {
            bVarD.w(gVar, 2, str);
        }
        if (bVarD.G(gVar) || vVar != null) {
            bVarD.x(gVar, 3, t.f44023a, vVar);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(list, ry.r.f50854a)) {
            bVarD.A(gVar, 4, (c00.a) hVarArr[4].getValue(), list);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
