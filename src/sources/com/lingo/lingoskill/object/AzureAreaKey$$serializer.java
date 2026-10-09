package com.lingo.lingoskill.object;

import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public final /* synthetic */ class AzureAreaKey$$serializer implements e0 {
    public static final int $stable;
    public static final AzureAreaKey$$serializer INSTANCE;
    private static final g descriptor;

    static {
        AzureAreaKey$$serializer azureAreaKey$$serializer = new AzureAreaKey$$serializer();
        INSTANCE = azureAreaKey$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.AzureAreaKey", azureAreaKey$$serializer, 2);
        f1Var.k("speechSubscriptionKey", false);
        f1Var.k("serviceRegion", false);
        descriptor = f1Var;
    }

    private AzureAreaKey$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var};
    }

    @Override // c00.a
    public final AzureAreaKey deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        boolean z11 = true;
        int i11 = 0;
        String strK = null;
        String strK2 = null;
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
                strK2 = aVarD.k(gVar, 1);
                i11 |= 2;
            }
        }
        aVarD.c(gVar);
        return new AzureAreaKey(i11, strK, strK2, null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, AzureAreaKey value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        AzureAreaKey.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
