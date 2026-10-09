package com.lingo.lingoskill.object;

import androidx.lifecycle.livedata.HeRS.DytezVyM;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import dl.ExOZ.xItStCyvVEZ;
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
public final /* synthetic */ class NewBillingThemeLearnPage$$serializer implements e0 {
    public static final int $stable;
    public static final NewBillingThemeLearnPage$$serializer INSTANCE;
    private static final g descriptor;

    private NewBillingThemeLearnPage$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        MainBtmCardData$$serializer mainBtmCardData$$serializer = MainBtmCardData$$serializer.INSTANCE;
        return new c00.a[]{t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, mainBtmCardData$$serializer, mainBtmCardData$$serializer};
    }

    @Override // c00.a
    public final NewBillingThemeLearnPage deserialize(f00.c decoder) {
        int i11;
        int i12;
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        MainBtmCardData mainBtmCardData = null;
        MainBtmCardData mainBtmCardData2 = null;
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
        int i13 = 0;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    z11 = z11;
                    strK = aVarD.k(gVar, 0);
                    i13 |= 1;
                    z11 = z11;
                    break;
                case 1:
                    strK2 = aVarD.k(gVar, 1);
                    i13 |= 2;
                    break;
                case 2:
                    strK3 = aVarD.k(gVar, 2);
                    i13 |= 4;
                    break;
                case 3:
                    strK4 = aVarD.k(gVar, 3);
                    i13 |= 8;
                    break;
                case 4:
                    strK5 = aVarD.k(gVar, 4);
                    i13 |= 16;
                    break;
                case 5:
                    strK6 = aVarD.k(gVar, 5);
                    i13 |= 32;
                    break;
                case 6:
                    strK7 = aVarD.k(gVar, 6);
                    i13 |= 64;
                    break;
                case 7:
                    strK8 = aVarD.k(gVar, 7);
                    i13 |= 128;
                    break;
                case 8:
                    strK9 = aVarD.k(gVar, 8);
                    i13 |= 256;
                    break;
                case 9:
                    strK10 = aVarD.k(gVar, 9);
                    i13 |= 512;
                    break;
                case 10:
                    strK11 = aVarD.k(gVar, 10);
                    i13 |= 1024;
                    break;
                case 11:
                    strK12 = aVarD.k(gVar, 11);
                    i13 |= 2048;
                    break;
                case 12:
                    strK13 = aVarD.k(gVar, 12);
                    i13 |= 4096;
                    break;
                case 13:
                    strK14 = aVarD.k(gVar, 13);
                    i13 |= OSSConstants.DEFAULT_BUFFER_SIZE;
                    break;
                case 14:
                    strK15 = aVarD.k(gVar, 14);
                    i13 |= 16384;
                    break;
                case 15:
                    strK16 = aVarD.k(gVar, 15);
                    i12 = 32768;
                    i13 |= i12;
                    break;
                case 16:
                    strK17 = aVarD.k(gVar, 16);
                    i12 = 65536;
                    i13 |= i12;
                    break;
                case 17:
                    mainBtmCardData = (MainBtmCardData) aVarD.t(gVar, 17, MainBtmCardData$$serializer.INSTANCE, mainBtmCardData);
                    i11 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    i13 |= i11;
                    z11 = z11;
                    break;
                case 18:
                    mainBtmCardData2 = (MainBtmCardData) aVarD.t(gVar, 18, MainBtmCardData$$serializer.INSTANCE, mainBtmCardData2);
                    i11 = 262144;
                    i13 |= i11;
                    z11 = z11;
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new NewBillingThemeLearnPage(i13, strK, strK2, strK3, strK4, strK5, strK6, strK7, strK8, strK9, strK10, strK11, strK12, strK13, strK14, strK15, strK16, strK17, mainBtmCardData, mainBtmCardData2, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, NewBillingThemeLearnPage value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        NewBillingThemeLearnPage.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        NewBillingThemeLearnPage$$serializer newBillingThemeLearnPage$$serializer = new NewBillingThemeLearnPage$$serializer();
        INSTANCE = newBillingThemeLearnPage$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.NewBillingThemeLearnPage", newBillingThemeLearnPage$$serializer, 19);
        f1Var.k("topBarColor", true);
        f1Var.k("topBarEndColor", true);
        f1Var.k("topBarTextColor", true);
        f1Var.k(xItStCyvVEZ.RPYhwcwM, true);
        f1Var.k("topBarFreeTrialColor", true);
        f1Var.k("topBarFreeTrialEndColor", true);
        f1Var.k("countDownColor", true);
        f1Var.k("countDownBgColor", true);
        f1Var.k("newTopBarColor", true);
        f1Var.k("newTopBarEndColor", true);
        f1Var.k(DytezVyM.HoyfbZnIpMcmehY, true);
        f1Var.k("newTopBarTextColor", true);
        f1Var.k("newTopBarBtnColor", true);
        f1Var.k("newTopBarBtnEndColor", true);
        f1Var.k("newTopBarBtnTextColor", true);
        f1Var.k("newTopBarLeftIconUrl", true);
        f1Var.k("newTopBarDeeplink", true);
        f1Var.k("mainBtmCardPicData", true);
        f1Var.k("mainBtmCardPadPicData", true);
        descriptor = f1Var;
    }
}
