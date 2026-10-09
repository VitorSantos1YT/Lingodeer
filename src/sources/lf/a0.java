package lf;

import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f39962a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f39963b = new HashMap();

    public static final void a(u uVar, x feature) {
        kotlin.jvm.internal.m.f(feature, "feature");
        c0.c(new z(uVar, feature));
    }

    public static final boolean b(x feature) {
        boolean z11;
        kotlin.jvm.internal.m.f(feature, "feature");
        boolean z12 = false;
        if (x.Unknown != feature) {
            if (x.Core != feature) {
                String string = re.s.a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString("FBSDKFeature" + feature, null);
                if (string == null || !string.equals("18.1.3")) {
                    x xVarB = feature.b();
                    if (xVarB == feature) {
                        switch (y.f40131a[feature.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case Service.METRICS_FIELD_NUMBER /* 24 */:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            case Service.BILLING_FIELD_NUMBER /* 26 */:
                            case 27:
                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            case 30:
                            case 31:
                            case Consts.SP /* 32 */:
                            case 33:
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case 35:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                break;
                            default:
                                z12 = true;
                                break;
                        }
                        return c0.b("FBSDKFeature" + feature, re.s.b(), z12);
                    }
                    if (b(xVarB)) {
                        switch (y.f40131a[feature.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case Service.METRICS_FIELD_NUMBER /* 24 */:
                            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            case Service.BILLING_FIELD_NUMBER /* 26 */:
                            case 27:
                            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                            case 30:
                            case 31:
                            case Consts.SP /* 32 */:
                            case 33:
                            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                            case 35:
                            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                                z11 = false;
                                break;
                            default:
                                z11 = true;
                                break;
                        }
                        if (c0.b("FBSDKFeature" + feature, re.s.b(), z11)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
