package yr;

import g00.d1;
import g00.e0;
import g00.f1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f57872a;
    private static final e00.g descriptor;

    static {
        f fVar = new f();
        f57872a = fVar;
        f1 f1Var = new f1("com.lingodeer.characterdrill.usecase.FetchTopicsCategoriesUseCase.TopicsRoot", fVar, 1);
        f1Var.k("categories", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{qx.b.s((c00.a) h.f57873b[0].getValue())};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = h.f57873b;
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
                list = (List) aVarD.s(gVar, 0, (c00.a) hVarArr[0].getValue(), list);
                i11 = 1;
            }
        }
        aVarD.c(gVar);
        return new h(i11, list);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        h value = (h) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.x(gVar, 0, (c00.a) h.f57873b[0].getValue(), value.f57874a);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
