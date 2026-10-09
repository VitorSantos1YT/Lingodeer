package com.lingo.lingoskill.object;

import com.alibaba.sdk.android.oss.common.OSSConstants;
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
public final /* synthetic */ class IntroPage$$serializer implements e0 {
    public static final int $stable;
    public static final IntroPage$$serializer INSTANCE;
    private static final g descriptor;

    static {
        IntroPage$$serializer introPage$$serializer = new IntroPage$$serializer();
        INSTANCE = introPage$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.IntroPage", introPage$$serializer, 17);
        f1Var.k("cn", true);
        f1Var.k("jp", true);
        f1Var.k("kr", true);
        f1Var.k("en", true);
        f1Var.k("es", true);
        f1Var.k("fr", true);
        f1Var.k("de", true);
        f1Var.k("pt", true);
        f1Var.k("vt", true);
        f1Var.k("ru", true);
        f1Var.k("it", true);
        f1Var.k("ar", true);
        f1Var.k("idn", true);
        f1Var.k("colorAccent", true);
        f1Var.k("colorAccentTitle1", true);
        f1Var.k("colorAccentTitle2", true);
        f1Var.k("colorAccentButton", true);
        descriptor = f1Var;
    }

    private IntroPage$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        LanConfig$$serializer lanConfig$$serializer = LanConfig$$serializer.INSTANCE;
        t1 t1Var = t1.f28468a;
        return new c00.a[]{lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, lanConfig$$serializer, t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final IntroPage deserialize(f00.c decoder) {
        int i11;
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        LanConfig lanConfig = null;
        LanConfig lanConfig2 = null;
        LanConfig lanConfig3 = null;
        LanConfig lanConfig4 = null;
        LanConfig lanConfig5 = null;
        LanConfig lanConfig6 = null;
        LanConfig lanConfig7 = null;
        LanConfig lanConfig8 = null;
        LanConfig lanConfig9 = null;
        LanConfig lanConfig10 = null;
        LanConfig lanConfig11 = null;
        LanConfig lanConfig12 = null;
        LanConfig lanConfig13 = null;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        int i12 = 0;
        boolean z11 = true;
        while (z11) {
            LanConfig lanConfig14 = lanConfig5;
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    lanConfig5 = lanConfig14;
                    z11 = false;
                    i12 = i12;
                    lanConfig2 = lanConfig2;
                    break;
                case 0:
                    lanConfig5 = (LanConfig) aVarD.t(gVar, 0, LanConfig$$serializer.INSTANCE, lanConfig14);
                    i12 |= 1;
                    lanConfig2 = lanConfig2;
                    break;
                case 1:
                    lanConfig6 = (LanConfig) aVarD.t(gVar, 1, LanConfig$$serializer.INSTANCE, lanConfig6);
                    i12 |= 2;
                    lanConfig5 = lanConfig14;
                    break;
                case 2:
                    lanConfig7 = (LanConfig) aVarD.t(gVar, 2, LanConfig$$serializer.INSTANCE, lanConfig7);
                    i12 |= 4;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 3:
                    lanConfig8 = (LanConfig) aVarD.t(gVar, 3, LanConfig$$serializer.INSTANCE, lanConfig8);
                    i12 |= 8;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 4:
                    lanConfig9 = (LanConfig) aVarD.t(gVar, 4, LanConfig$$serializer.INSTANCE, lanConfig9);
                    i12 |= 16;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 5:
                    lanConfig10 = (LanConfig) aVarD.t(gVar, 5, LanConfig$$serializer.INSTANCE, lanConfig10);
                    i12 |= 32;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 6:
                    lanConfig11 = (LanConfig) aVarD.t(gVar, 6, LanConfig$$serializer.INSTANCE, lanConfig11);
                    i12 |= 64;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 7:
                    lanConfig12 = (LanConfig) aVarD.t(gVar, 7, LanConfig$$serializer.INSTANCE, lanConfig12);
                    i12 |= 128;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 8:
                    lanConfig13 = (LanConfig) aVarD.t(gVar, 8, LanConfig$$serializer.INSTANCE, lanConfig13);
                    i12 |= 256;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 9:
                    lanConfig = (LanConfig) aVarD.t(gVar, 9, LanConfig$$serializer.INSTANCE, lanConfig);
                    i12 |= 512;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 10:
                    lanConfig3 = (LanConfig) aVarD.t(gVar, 10, LanConfig$$serializer.INSTANCE, lanConfig3);
                    i12 |= 1024;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 11:
                    lanConfig4 = (LanConfig) aVarD.t(gVar, 11, LanConfig$$serializer.INSTANCE, lanConfig4);
                    i12 |= 2048;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 12:
                    lanConfig2 = (LanConfig) aVarD.t(gVar, 12, LanConfig$$serializer.INSTANCE, lanConfig2);
                    i12 |= 4096;
                    lanConfig5 = lanConfig14;
                    lanConfig6 = lanConfig6;
                    break;
                case 13:
                    strK = aVarD.k(gVar, 13);
                    i12 |= OSSConstants.DEFAULT_BUFFER_SIZE;
                    lanConfig5 = lanConfig14;
                    break;
                case 14:
                    strK2 = aVarD.k(gVar, 14);
                    i12 |= 16384;
                    lanConfig5 = lanConfig14;
                    break;
                case 15:
                    strK3 = aVarD.k(gVar, 15);
                    i11 = 32768;
                    i12 |= i11;
                    lanConfig5 = lanConfig14;
                    break;
                case 16:
                    strK4 = aVarD.k(gVar, 16);
                    i11 = 65536;
                    i12 |= i11;
                    lanConfig5 = lanConfig14;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new IntroPage(i12, lanConfig5, lanConfig6, lanConfig7, lanConfig8, lanConfig9, lanConfig10, lanConfig11, lanConfig12, lanConfig13, lanConfig, lanConfig3, lanConfig4, lanConfig2, strK, strK2, strK3, strK4, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, IntroPage value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        IntroPage.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
