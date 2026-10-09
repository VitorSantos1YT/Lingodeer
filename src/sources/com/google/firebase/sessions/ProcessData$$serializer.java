package com.google.firebase.sessions;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import e00.g;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.m0;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public /* synthetic */ class ProcessData$$serializer implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ProcessData$$serializer f20914a;
    private static final g descriptor;

    static {
        ProcessData$$serializer processData$$serializer = new ProcessData$$serializer();
        f20914a = processData$$serializer;
        f1 f1Var = new f1("com.google.firebase.sessions.ProcessData", processData$$serializer, 2);
        f1Var.k("pid", false);
        f1Var.k("uuid", false);
        descriptor = f1Var;
    }

    private ProcessData$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{m0.f28434a, t1.f28468a};
    }

    @Override // c00.a
    public final Object deserialize(f00.c cVar) {
        g gVar = descriptor;
        f00.a aVarD = cVar.d(gVar);
        String strK = null;
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                iP = aVarD.p(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                strK = aVarD.k(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new ProcessData(i11, iP, strK);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // g00.e0
    public final c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    @Override // c00.a
    public final void serialize(d dVar, Object obj) {
        ProcessData processData = (ProcessData) obj;
        m.f(processData, DytezVyM.QsS);
        g gVar = descriptor;
        f00.b bVarD = dVar.d(gVar);
        bVarD.g(0, processData.f20912a, gVar);
        bVarD.w(gVar, 1, processData.f20913b);
        bVarD.c(gVar);
    }
}
