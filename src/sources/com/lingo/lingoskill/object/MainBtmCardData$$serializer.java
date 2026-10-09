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
public final /* synthetic */ class MainBtmCardData$$serializer implements e0 {
    public static final int $stable;
    public static final MainBtmCardData$$serializer INSTANCE;
    private static final g descriptor;

    static {
        MainBtmCardData$$serializer mainBtmCardData$$serializer = new MainBtmCardData$$serializer();
        INSTANCE = mainBtmCardData$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.MainBtmCardData", mainBtmCardData$$serializer, 17);
        f1Var.k("tch", true);
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
        f1Var.k("tr", true);
        f1Var.k("idn", true);
        f1Var.k("pl", true);
        f1Var.k("thai", true);
        f1Var.k("ara", true);
        f1Var.k("hi", true);
        descriptor = f1Var;
    }

    private MainBtmCardData$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final MainBtmCardData deserialize(f00.c decoder) {
        int i11;
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i12 = 0;
        String strK = null;
        String strK2 = null;
        String strK3 = null;
        String strK4 = null;
        String strK5 = null;
        String strK6 = null;
        String strK7 = null;
        String strK8 = null;
        String strK9 = null;
        String strK10 = null;
        String strK11 = null;
        String strK12 = null;
        String strK13 = null;
        String strK14 = null;
        String strK15 = null;
        String strK16 = null;
        String strK17 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    strK = aVarD.k(gVar, 0);
                    i12 |= 1;
                    continue;
                case 1:
                    strK2 = aVarD.k(gVar, 1);
                    i12 |= 2;
                    continue;
                case 2:
                    strK3 = aVarD.k(gVar, 2);
                    i12 |= 4;
                    continue;
                case 3:
                    strK4 = aVarD.k(gVar, 3);
                    i12 |= 8;
                    continue;
                case 4:
                    strK5 = aVarD.k(gVar, 4);
                    i12 |= 16;
                    continue;
                case 5:
                    strK6 = aVarD.k(gVar, 5);
                    i12 |= 32;
                    continue;
                case 6:
                    strK7 = aVarD.k(gVar, 6);
                    i12 |= 64;
                    continue;
                case 7:
                    strK8 = aVarD.k(gVar, 7);
                    i12 |= 128;
                    continue;
                case 8:
                    strK9 = aVarD.k(gVar, 8);
                    i12 |= 256;
                    continue;
                case 9:
                    strK10 = aVarD.k(gVar, 9);
                    i12 |= 512;
                    continue;
                case 10:
                    strK11 = aVarD.k(gVar, 10);
                    i12 |= 1024;
                    continue;
                case 11:
                    strK12 = aVarD.k(gVar, 11);
                    i12 |= 2048;
                    continue;
                case 12:
                    strK13 = aVarD.k(gVar, 12);
                    i12 |= 4096;
                    continue;
                case 13:
                    strK14 = aVarD.k(gVar, 13);
                    i12 |= OSSConstants.DEFAULT_BUFFER_SIZE;
                    continue;
                case 14:
                    strK15 = aVarD.k(gVar, 14);
                    i12 |= 16384;
                    continue;
                case 15:
                    strK16 = aVarD.k(gVar, 15);
                    i11 = 32768;
                    break;
                case 16:
                    strK17 = aVarD.k(gVar, 16);
                    i11 = 65536;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
            i12 |= i11;
        }
        aVarD.c(gVar);
        return new MainBtmCardData(i12, strK, strK2, strK3, strK4, strK5, strK6, strK7, strK8, strK9, strK10, strK11, strK12, strK13, strK14, strK15, strK16, strK17, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, MainBtmCardData value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        MainBtmCardData.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
