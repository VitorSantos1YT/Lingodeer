package com.lingo.lingoskill.object;

import e00.g;
import f00.b;
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
public final /* synthetic */ class AreaAndAge$$serializer implements e0 {
    public static final int $stable;
    public static final AreaAndAge$$serializer INSTANCE;
    private static final g descriptor;

    static {
        AreaAndAge$$serializer areaAndAge$$serializer = new AreaAndAge$$serializer();
        INSTANCE = areaAndAge$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.AreaAndAge", areaAndAge$$serializer, 2);
        f1Var.k("area", false);
        f1Var.k("age", false);
        descriptor = f1Var;
    }

    private AreaAndAge$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{t1.f28468a, m0.f28434a};
    }

    @Override // c00.a
    public final AreaAndAge deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        boolean z11 = true;
        int i11 = 0;
        int iP = 0;
        String strK = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                strK = aVarD.k(gVar, 0);
                i11 |= 1;
            } else {
                if (iN != 1) {
                    throw new UnknownFieldException(iN);
                }
                iP = aVarD.p(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new AreaAndAge(i11, strK, iP, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, AreaAndAge value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        AreaAndAge.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
