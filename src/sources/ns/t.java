package ns;

import g00.d1;
import g00.f1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f44023a;
    private static final e00.g descriptor;

    static {
        t tVar = new t();
        f44023a = tVar;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainComparisonTable", tVar, 2);
        f1Var.k("columns", true);
        f1Var.k("data", true);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = v.f44026c;
        return new c00.a[]{hVarArr[0].getValue(), hVarArr[1].getValue()};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = v.f44026c;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        List list2 = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                list = (List) aVarD.t(gVar, 0, (c00.a) hVarArr[0].getValue(), list);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                list2 = (List) aVarD.t(gVar, 1, (c00.a) hVarArr[1].getValue(), list2);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new v(i11, list, list2);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        v value = (v) obj;
        kotlin.jvm.internal.m.f(value, "value");
        List list = value.f44028b;
        List list2 = value.f44027a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = v.f44026c;
        boolean zG = bVarD.G(gVar);
        ry.r rVar = ry.r.f50854a;
        if (zG || !kotlin.jvm.internal.m.a(list2, rVar)) {
            bVarD.A(gVar, 0, (c00.a) hVarArr[0].getValue(), list2);
        }
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(list, rVar)) {
            bVarD.A(gVar, 1, (c00.a) hVarArr[1].getValue(), list);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
