package com.lingo.lingoskill.object;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.google.type.bACG.scNRoQgKSYX;
import com.stkouyu.util.httputil.Consts;
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
import sz.xej.iFLeRCXvYCGdPW;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@c
public final /* synthetic */ class NewBillingThemeBillingPage$$serializer implements e0 {
    public static final int $stable;
    public static final NewBillingThemeBillingPage$$serializer INSTANCE;
    private static final g descriptor;

    private NewBillingThemeBillingPage$$serializer() {
    }

    @Override // g00.e0
    public final c00.a[] childSerializers() {
        t1 t1Var = t1.f28468a;
        return new c00.a[]{t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var, t1Var};
    }

    @Override // c00.a
    public final NewBillingThemeBillingPage deserialize(f00.c decoder) {
        m.f(decoder, "decoder");
        g gVar = descriptor;
        f00.a aVarD = decoder.d(gVar);
        int i11 = 0;
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
        String str = null;
        String strK14 = null;
        String strK15 = null;
        String strK16 = null;
        String str2 = null;
        String strK17 = null;
        String strK18 = null;
        String strK19 = null;
        String strK20 = null;
        String strK21 = null;
        String strK22 = null;
        String strK23 = null;
        String strK24 = null;
        String strK25 = null;
        String strK26 = null;
        String strK27 = null;
        String strK28 = null;
        String strK29 = null;
        String strK30 = null;
        String strK31 = null;
        String strK32 = null;
        String strK33 = null;
        String strK34 = null;
        String strK35 = null;
        String strK36 = null;
        String strK37 = null;
        String strK38 = null;
        String strK39 = null;
        String strK40 = null;
        String strK41 = null;
        String strK42 = null;
        String strK43 = null;
        boolean z11 = true;
        while (z11) {
            int iN = aVarD.n(gVar);
            switch (iN) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    i11 |= 1;
                    strK = aVarD.k(gVar, 0);
                    break;
                case 1:
                    i11 |= 2;
                    strK2 = aVarD.k(gVar, 1);
                    break;
                case 2:
                    i11 |= 4;
                    strK3 = aVarD.k(gVar, 2);
                    break;
                case 3:
                    i11 |= 8;
                    strK4 = aVarD.k(gVar, 3);
                    break;
                case 4:
                    i11 |= 16;
                    strK5 = aVarD.k(gVar, 4);
                    break;
                case 5:
                    i11 |= 32;
                    strK6 = aVarD.k(gVar, 5);
                    break;
                case 6:
                    i11 |= 64;
                    strK7 = aVarD.k(gVar, 6);
                    break;
                case 7:
                    i11 |= 128;
                    strK8 = aVarD.k(gVar, 7);
                    break;
                case 8:
                    i11 |= 256;
                    strK9 = aVarD.k(gVar, 8);
                    break;
                case 9:
                    i11 |= 512;
                    strK10 = aVarD.k(gVar, 9);
                    break;
                case 10:
                    i11 |= 1024;
                    strK11 = aVarD.k(gVar, 10);
                    break;
                case 11:
                    i11 |= 2048;
                    strK12 = aVarD.k(gVar, 11);
                    break;
                case 12:
                    i11 |= 4096;
                    strK13 = aVarD.k(gVar, 12);
                    break;
                case 13:
                    String strK44 = aVarD.k(gVar, 13);
                    i11 |= OSSConstants.DEFAULT_BUFFER_SIZE;
                    str = strK44;
                    break;
                case 14:
                    i11 |= 16384;
                    strK14 = aVarD.k(gVar, 14);
                    break;
                case 15:
                    i11 |= 32768;
                    strK15 = aVarD.k(gVar, 15);
                    break;
                case 16:
                    i11 |= 65536;
                    strK16 = aVarD.k(gVar, 16);
                    break;
                case 17:
                    String strK45 = aVarD.k(gVar, 17);
                    i11 |= OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    str2 = strK45;
                    break;
                case 18:
                    i11 |= 262144;
                    strK17 = aVarD.k(gVar, 18);
                    break;
                case 19:
                    i11 |= 524288;
                    strK18 = aVarD.k(gVar, 19);
                    break;
                case 20:
                    i11 |= 1048576;
                    strK19 = aVarD.k(gVar, 20);
                    break;
                case 21:
                    i11 |= 2097152;
                    strK20 = aVarD.k(gVar, 21);
                    break;
                case 22:
                    i11 |= 4194304;
                    strK21 = aVarD.k(gVar, 22);
                    break;
                case 23:
                    i11 |= 8388608;
                    strK22 = aVarD.k(gVar, 23);
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    i11 |= 16777216;
                    strK23 = aVarD.k(gVar, 24);
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    i11 |= 33554432;
                    strK24 = aVarD.k(gVar, 25);
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    i11 |= 67108864;
                    strK25 = aVarD.k(gVar, 26);
                    break;
                case 27:
                    i11 |= 134217728;
                    strK26 = aVarD.k(gVar, 27);
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    i11 |= 268435456;
                    strK27 = aVarD.k(gVar, 28);
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    i11 |= 536870912;
                    strK28 = aVarD.k(gVar, 29);
                    break;
                case 30:
                    i11 |= 1073741824;
                    strK29 = aVarD.k(gVar, 30);
                    break;
                case 31:
                    i11 |= Integer.MIN_VALUE;
                    strK30 = aVarD.k(gVar, 31);
                    break;
                case Consts.SP /* 32 */:
                    i12 |= 1;
                    strK31 = aVarD.k(gVar, 32);
                    break;
                case 33:
                    i12 |= 2;
                    strK32 = aVarD.k(gVar, 33);
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    i12 |= 4;
                    strK33 = aVarD.k(gVar, 34);
                    break;
                case 35:
                    i12 |= 8;
                    strK34 = aVarD.k(gVar, 35);
                    break;
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                    i12 |= 16;
                    strK35 = aVarD.k(gVar, 36);
                    break;
                case 37:
                    i12 |= 32;
                    strK36 = aVarD.k(gVar, 37);
                    break;
                case 38:
                    i12 |= 64;
                    strK37 = aVarD.k(gVar, 38);
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    i12 |= 128;
                    strK38 = aVarD.k(gVar, 39);
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    i12 |= 256;
                    strK39 = aVarD.k(gVar, 40);
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    i12 |= 512;
                    strK40 = aVarD.k(gVar, 41);
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    i12 |= 1024;
                    strK41 = aVarD.k(gVar, 42);
                    break;
                case 43:
                    i12 |= 2048;
                    strK42 = aVarD.k(gVar, 43);
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    i12 |= 4096;
                    strK43 = aVarD.k(gVar, 44);
                    break;
                default:
                    throw new UnknownFieldException(iN);
            }
        }
        aVarD.c(gVar);
        return new NewBillingThemeBillingPage(i11, i12, strK, strK2, strK3, strK4, strK5, strK6, strK7, strK8, strK9, strK10, strK11, strK12, strK13, str, strK14, strK15, strK16, str2, strK17, strK18, strK19, strK20, strK21, strK22, strK23, strK24, strK25, strK26, strK27, strK28, strK29, strK30, strK31, strK32, strK33, strK34, strK35, strK36, strK37, strK38, strK39, strK40, strK41, strK42, strK43, (o1) null);
    }

    @Override // c00.a
    public final g getDescriptor() {
        return descriptor;
    }

    @Override // c00.a
    public final void serialize(d encoder, NewBillingThemeBillingPage value) {
        m.f(encoder, "encoder");
        m.f(value, "value");
        g gVar = descriptor;
        b bVarD = encoder.d(gVar);
        NewBillingThemeBillingPage.write$Self$app_release(value, bVarD, gVar);
        bVarD.c(gVar);
    }

    @Override // g00.e0
    public c00.a[] typeParametersSerializers() {
        return d1.f28375b;
    }

    static {
        NewBillingThemeBillingPage$$serializer newBillingThemeBillingPage$$serializer = new NewBillingThemeBillingPage$$serializer();
        INSTANCE = newBillingThemeBillingPage$$serializer;
        $stable = 8;
        f1 f1Var = new f1("com.lingo.lingoskill.object.NewBillingThemeBillingPage", newBillingThemeBillingPage$$serializer, 45);
        f1Var.k("bannerPicUrl", true);
        f1Var.k("bannerPicPadLandUrl", true);
        f1Var.k(iFLeRCXvYCGdPW.FhFCwvAI, true);
        f1Var.k("colorBackgroundEnd", true);
        f1Var.k("colorAccent", true);
        f1Var.k("colorTitle", true);
        f1Var.k("colorBottomText1", true);
        f1Var.k("colorBottomText2", true);
        f1Var.k("colorBottomText3", true);
        f1Var.k(scNRoQgKSYX.TOGS, true);
        f1Var.k("colorCountDownClock", true);
        f1Var.k("colorYearlyTag", true);
        f1Var.k("colorYearlyTagEnd", true);
        f1Var.k("colorYearlyTagText", true);
        f1Var.k("colorYearlyCountDownTag", true);
        f1Var.k("colorYearlyCountDownTagEnd", true);
        f1Var.k("colorYearlyCountDownTagText", true);
        f1Var.k("colorYearlyCheckedIcon", true);
        f1Var.k("colorYearlyCheckedIconBg", true);
        f1Var.k("colorYearlyCard", true);
        f1Var.k("colorYearlyCardEnd", true);
        f1Var.k("colorYearlyCardText", true);
        f1Var.k("colorYearlyCardStroke", true);
        f1Var.k("colorOthersCheckedIcon", true);
        f1Var.k("colorOthersCheckedIconBg", true);
        f1Var.k("colorOthersCard", true);
        f1Var.k("colorOthersCardEnd", true);
        f1Var.k("colorOthersCardText", true);
        f1Var.k("colorOthersCardStroke", true);
        f1Var.k("colorLifeTimeTag", true);
        f1Var.k("colorLifeTimeTagEnd", true);
        f1Var.k("colorLifeTimeTagText", true);
        f1Var.k("colorLifeTimeCheckedIcon", true);
        f1Var.k("colorLifeTimeCheckedIconBg", true);
        f1Var.k("colorLifeTimeCard", true);
        f1Var.k("colorLifeTimeCardEnd", true);
        f1Var.k("colorLifeTimeCardText", true);
        f1Var.k("colorLifeTimeCardStroke", true);
        f1Var.k("colorActivityFAQ", true);
        f1Var.k("colorButton", true);
        f1Var.k("colorButtonEnd", true);
        f1Var.k("colorButtonText", true);
        f1Var.k("colorButtonBuyYearly", true);
        f1Var.k("colorButtonBuyYearlyEnd", true);
        f1Var.k("colorButtonBuyYearlyText", true);
        descriptor = f1Var;
    }
}
