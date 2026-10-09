package ns;

import g00.d1;
import g00.f1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f43991a;
    private static final e00.g descriptor;

    static {
        j0 j0Var = new j0();
        f43991a = j0Var;
        f1 f1Var = new f1("com.lingodeer.course.ai.CourseMistakeExplainPrompt", j0Var, 2);
        f1Var.k("META", false);
        f1Var.k("DATA", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{g0.f43974a, m0.f44005a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        i0 i0Var = null;
        boolean z11 = true;
        int i11 = 0;
        o0 o0Var = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                i0Var = (i0) aVarD.t(gVar, 0, g0.f43974a, i0Var);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                o0Var = (o0) aVarD.t(gVar, 1, m0.f44005a, o0Var);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new l0(i11, i0Var, o0Var);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        l0 value = (l0) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.A(gVar, 0, g0.f43974a, value.f44002a);
        bVarD.A(gVar, 1, m0.f44005a, value.f44003b);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
