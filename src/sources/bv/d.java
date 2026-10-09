package bv;

import g00.d1;
import g00.f1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6291a;
    private static final e00.g descriptor;

    static {
        d dVar = new d();
        f6291a = dVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.AssessmentParams", dVar, 3);
        f1Var.k("app", false);
        f1Var.k("audio", false);
        f1Var.k("request", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{a.f6278a, j.f6312a, u.f6357a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        c cVar2 = null;
        boolean z11 = true;
        int i11 = 0;
        l lVar = null;
        w wVar = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                cVar2 = (c) aVarD.t(gVar, 0, a.f6278a, cVar2);
                i11 |= 1;
            } else if (iN == 1) {
                lVar = (l) aVarD.t(gVar, 1, j.f6312a, lVar);
                i11 |= 2;
            } else {
                if (iN != 2) {
                    throw new UnknownFieldException(iN);
                }
                wVar = (w) aVarD.t(gVar, 2, u.f6357a, wVar);
                i11 |= 4;
            }
        }
        aVarD.c(gVar);
        return new f(i11, cVar2, lVar, wVar);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        f value = (f) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.A(gVar, 0, a.f6278a, value.f6293a);
        bVarD.A(gVar, 1, j.f6312a, value.f6294b);
        bVarD.A(gVar, 2, u.f6357a, value.f6295c);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
