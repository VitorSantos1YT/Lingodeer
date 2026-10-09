package ns;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f44005a;
    private static final e00.g descriptor;

    static {
        m0 m0Var = new m0();
        f44005a = m0Var;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainQuestionData", m0Var, 3);
        f1Var.k("SOURCE_MEANING", false);
        f1Var.k("CORRECT_ANSWER", false);
        f1Var.k("USER_RESPONSE", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        String strK = null;
        boolean z11 = true;
        int i11 = 0;
        String strK2 = null;
        String strK3 = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else if (iN == 1) {
                strK2 = aVarD.k(gVar, 1);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                strK3 = aVarD.k(gVar, 2);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new o0(i11, strK, strK2, strK3);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        o0 value = (o0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.w(gVar, 0, value.f44009a);
        bVarD.w(gVar, 1, value.f44010b);
        bVarD.w(gVar, 2, value.f44011c);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
