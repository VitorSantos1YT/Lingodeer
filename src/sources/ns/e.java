package ns;

import g00.d1;
import g00.f1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f43967a;
    private static final e00.g descriptor;

    static {
        e eVar = new e();
        f43967a = eVar;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseAnswerJudgeResponse", eVar, 3);
        f1Var.k("judgment", false);
        f1Var.k("correctionCount", false);
        f1Var.k("retryReason", false);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = g.f43970d;
        return new c00.a[]{hVarArr[0].getValue(), hVarArr[1].getValue(), hVarArr[2].getValue()};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = g.f43970d;
        q qVar = null;
        boolean z11 = true;
        int i11 = 0;
        b bVar = null;
        s sVar = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                qVar = (q) aVarD.t(gVar, 0, (c00.a) hVarArr[0].getValue(), qVar);
                i11 |= 1;
            } else if (iN == 1) {
                bVar = (b) aVarD.t(gVar, 1, (c00.a) hVarArr[1].getValue(), bVar);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                sVar = (s) aVarD.t(gVar, 2, (c00.a) hVarArr[2].getValue(), sVar);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new g(i11, qVar, bVar, sVar);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        g value = (g) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = g.f43970d;
        bVarD.A(gVar, 0, (c00.a) hVarArr[0].getValue(), value.f43971a);
        bVarD.A(gVar, 1, (c00.a) hVarArr[1].getValue(), value.f43972b);
        bVarD.A(gVar, 2, (c00.a) hVarArr[2].getValue(), value.f43973c);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
