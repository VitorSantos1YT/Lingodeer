package yr;

import g00.d1;
import g00.e0;
import g00.f1;
import g00.t1;
import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f57867a;
    private static final e00.g descriptor;

    static {
        c cVar = new c();
        f57867a = cVar;
        f1 f1Var = new f1("com.lingodeer.characterdrill.usecase.FetchTopicsCategoriesUseCase.CategoryItem", cVar, 3);
        f1Var.k("name_zh", false);
        f1Var.k("name_en", false);
        f1Var.k("characters", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        qy.h[] hVarArr = e.f57868d;
        t1 t1Var = t1.f28468a;
        return new c00.a[]{qx.b.s(t1Var), qx.b.s(t1Var), qx.b.s((c00.a) hVarArr[2].getValue())};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        qy.h[] hVarArr = e.f57868d;
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        String str2 = null;
        List list = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                str = (String) aVarD.s(gVar, 0, t1.f28468a, str);
                i11 |= 1;
            } else if (iN == 1) {
                str2 = (String) aVarD.s(gVar, 1, t1.f28468a, str2);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                list = (List) aVarD.s(gVar, 2, (c00.a) hVarArr[2].getValue(), list);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new e(i11, str, str2, list);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        e value = (e) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        qy.h[] hVarArr = e.f57868d;
        t1 t1Var = t1.f28468a;
        bVarD.x(gVar, 0, t1Var, value.f57869a);
        bVarD.x(gVar, 1, t1Var, value.f57870b);
        bVarD.x(gVar, 2, (c00.a) hVarArr[2].getValue(), value.f57871c);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
