package bv;

import g00.d1;
import g00.f1;
import g00.t1;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements g00.e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6278a;
    private static final e00.g descriptor;

    static {
        a aVar = new a();
        f6278a = aVar;
        f1 f1Var = new f1("com.lingodeer.media.tone.AppParams", aVar, 4);
        f1Var.k("timestamp", false);
        f1Var.k("userId", false);
        f1Var.k("applicationId", false);
        f1Var.k("sig", false);
        descriptor = f1Var;
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        e00.g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        int i11 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        boolean z11 = true;
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
            } else if (iN == 2) {
                strK3 = aVarD.k(gVar, 2);
                i11 |= 4;
            } else {
                if (iN != 3) {
                    throw new UnknownFieldException(iN);
                }
                strK4 = aVarD.k(gVar, 3);
                i11 |= 8;
            }
        }
        aVarD.c(gVar);
        return new c(i11, strK, strK2, strK3, strK4);
    }

    @Override // c00.a
    public final e00.g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(f00.d dVar, Object obj) {
        c value = (c) obj;
        kotlin.jvm.internal.m.f(value, "value");
        e00.g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.w(gVar, 0, value.f6280a);
        bVarD.w(gVar, 1, value.f6281b);
        bVarD.w(gVar, 2, value.f6282c);
        bVarD.w(gVar, 3, value.f6283d);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
