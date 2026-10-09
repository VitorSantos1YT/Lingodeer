package com.lingo.lingoskill.object;

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
public final /* synthetic */ class NewBillingThemeIntroPage$$serializer implements e0 {
    public static final int $stable;
    public static final NewBillingThemeIntroPage$$serializer INSTANCE;
    private static final g descriptor;

    static {
        NewBillingThemeIntroPage$$serializer newBillingThemeIntroPage$$serializer = new NewBillingThemeIntroPage$$serializer();
        INSTANCE = newBillingThemeIntroPage$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.NewBillingThemeIntroPage", newBillingThemeIntroPage$$serializer, 13);
        f1Var.k("bannerPicUrl", true);
        f1Var.k("bannerPicPadLandUrl", true);
        f1Var.k("colorAccent", true);
        f1Var.k("colorTitle", true);
        f1Var.k("colorCountDownTitle", true);
        f1Var.k("colorCountDownClock", true);
        f1Var.k("colorCountDownClockBtm", true);
        f1Var.k("colorButton", true);
        f1Var.k("colorButtonEnd", true);
        f1Var.k("colorButtonText", true);
        f1Var.k("colorButtonBtm", true);
        f1Var.k("colorButtonBtmEnd", true);
        f1Var.k("colorButtonBtmText", true);
        descriptor = f1Var;
    }

    private NewBillingThemeIntroPage$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final NewBillingThemeIntroPage deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
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
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    strK = aVarD.k(gVar, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strK2 = aVarD.k(gVar, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strK3 = aVarD.k(gVar, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strK4 = aVarD.k(gVar, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strK5 = aVarD.k(gVar, 4);
                    i11 |= 16;
                    break;
                case 5:
                    strK6 = aVarD.k(gVar, 5);
                    i11 |= 32;
                    break;
                case 6:
                    strK7 = aVarD.k(gVar, 6);
                    i11 |= 64;
                    break;
                case 7:
                    strK8 = aVarD.k(gVar, 7);
                    i11 |= 128;
                    break;
                case 8:
                    strK9 = aVarD.k(gVar, 8);
                    i11 |= 256;
                    break;
                case 9:
                    strK10 = aVarD.k(gVar, 9);
                    i11 |= 512;
                    break;
                case 10:
                    strK11 = aVarD.k(gVar, 10);
                    i11 |= 1024;
                    break;
                case 11:
                    strK12 = aVarD.k(gVar, 11);
                    i11 |= 2048;
                    break;
                case 12:
                    strK13 = aVarD.k(gVar, 12);
                    i11 |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new NewBillingThemeIntroPage(i11, strK, strK2, strK3, strK4, strK5, strK6, strK7, strK8, strK9, strK10, strK11, strK12, strK13, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, NewBillingThemeIntroPage value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        NewBillingThemeIntroPage.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }
}
