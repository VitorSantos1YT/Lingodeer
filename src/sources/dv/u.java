package dv;

import g00.d1;
import g00.f1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f24521a;
    private static final e00.g descriptor;

    static {
        u uVar = new u();
        f24521a = uVar;
        f1 f1Var = new f1("com.lingodeer.network.GeminiContent", uVar, 1);
        f1Var.k("parts", true);
        descriptor = f1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{w.f24528b[0].getValue()};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = w.f24528b;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else {
                if (iN != 0) {
                    throw new UnknownFieldException(iN);
                }
                list = (List) aVarD.t(gVar, 0, (c00.a) hVarArr[0].getValue(), list);
                i11 = 1;
            }
        }
        aVarD.c(gVar);
        return new w(i11, list);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        w value = (w) obj;
        kotlin.jvm.internal.m.f(value, "value");
        List list = value.f24529a;
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = w.f24528b;
        if (bVarD.G(gVar) || !kotlin.jvm.internal.m.a(list, ry.r.f50854a)) {
            bVarD.A(gVar, 0, (c00.a) hVarArr[0].getValue(), list);
        }
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
