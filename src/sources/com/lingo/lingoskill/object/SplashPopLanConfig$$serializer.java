package com.lingo.lingoskill.object;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import e00.g;
import f00.b;
import f00.d;
import g00.d1;
import g00.e0;
import g00.f1;
import g00.o1;
import g00.t1;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import qy.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public final /* synthetic */ class SplashPopLanConfig$$serializer implements e0 {
    public static final int $stable;
    public static final SplashPopLanConfig$$serializer INSTANCE;
    private static final g descriptor;

    private SplashPopLanConfig$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        return new c00.a[]{g00.g.f28401a, t1.f28468a};
    }

    @Override // c00.a
    public final SplashPopLanConfig deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        boolean z11 = true;
        int i11 = 0;
        boolean zW = false;
        String strK = null;
        while (z11) {
            int iN = aVarD.n(gVar);
            if (iN == -1) {
                z11 = false;
            } else if (iN == 0) {
                zW = aVarD.w(gVar, 0);
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
        return new SplashPopLanConfig(i11, zW, strK, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, SplashPopLanConfig value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        SplashPopLanConfig.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        SplashPopLanConfig$$serializer splashPopLanConfig$$serializer = new SplashPopLanConfig$$serializer();
        INSTANCE = splashPopLanConfig$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.SplashPopLanConfig", splashPopLanConfig$$serializer, 2);
        f1Var.k("isPopupPage", true);
        f1Var.k(DytezVyM.idDDhSU, true);
        descriptor = f1Var;
    }
}
