package lf;

import android.R;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.stkouyu.util.httputil.Consts;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum x {
    Unknown(-1),
    Core(0),
    AppEvents(65536),
    CodelessEvents(65792),
    CloudBridge(67584),
    RestrictiveDataFiltering(66048),
    AAM(66304),
    PrivacyProtection(66560),
    SuggestedEvents(66561),
    IntelligentIntegrity(66562),
    ModelRequest(66563),
    ProtectedMode(66564),
    MACARuleMatching(66565),
    BlocklistEvents(66566),
    FilterRedactedEvents(66567),
    FilterSensitiveParams(66568),
    StdParamEnforcement(R.attr.trimPathEnd),
    BannedParamFiltering(R.attr.trimPathOffset),
    EventDeactivation(66816),
    OnDeviceEventProcessing(67072),
    OnDevicePostInstallEventProcessing(67073),
    IapLogging(67328),
    IapLoggingLib2(67329),
    IapLoggingLib5To7(67330),
    AndroidManualImplicitPurchaseDedupe(67331),
    AndroidManualImplicitSubsDedupe(67332),
    AndroidIAPSubscriptionAutoLogging(67333),
    Instrument(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE),
    CrashReport(131328),
    CrashShield(131329),
    ThreadCheck(131330),
    ErrorReport(131584),
    AnrReport(131840),
    Monitoring(196608),
    ServiceUpdateCompliance(196864),
    Megatron(262144),
    Elora(327680),
    GPSARATriggers(393216),
    GPSPACAProcessing(458752),
    GPSTopicsObservation(524288),
    Login(16777216),
    ChromeCustomTabsPrefetching(R.attr.theme),
    IgnoreAppSwitchToLoggedOut(R.id.background),
    BypassAppSwitch(R.style.Animation),
    Share(33554432);

    public static final v Companion = new v();
    private final int code;

    x(int i11) {
        this.code = i11;
    }

    public final x b() {
        int i11 = this.code;
        if ((i11 & 255) > 0) {
            Companion.getClass();
            return v.a(i11 & (-256));
        }
        if ((65280 & i11) > 0) {
            Companion.getClass();
            return v.a(i11 & (-65536));
        }
        if ((16711680 & i11) > 0) {
            Companion.getClass();
            return v.a(i11 & (-16777216));
        }
        Companion.getClass();
        return v.a(0);
    }

    @Override // java.lang.Enum
    public final String toString() {
        switch (w.f40128a[ordinal()]) {
            case 1:
                return "CoreKit";
            case 2:
                return "AppEvents";
            case 3:
                return "CodelessEvents";
            case 4:
                return "RestrictiveDataFiltering";
            case 5:
                return "Instrument";
            case 6:
                return "CrashReport";
            case 7:
                return "CrashShield";
            case 8:
                return "ThreadCheck";
            case 9:
                return "ErrorReport";
            case 10:
                return "AnrReport";
            case 11:
                return "AAM";
            case 12:
                return "AppEventsCloudbridge";
            case 13:
                return "PrivacyProtection";
            case 14:
                return "SuggestedEvents";
            case 15:
                return "IntelligentIntegrity";
            case 16:
                return "StdParamEnforcement";
            case 17:
                return "ProtectedMode";
            case 18:
                return "BannedParamFiltering";
            case 19:
                return "MACARuleMatching";
            case 20:
                return "BlocklistEvents";
            case 21:
                return "FilterRedactedEvents";
            case 22:
                return "FilterSensitiveParams";
            case 23:
                return "ModelRequest";
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return "EventDeactivation";
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return "OnDeviceEventProcessing";
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return "OnDevicePostInstallEventProcessing";
            case 27:
                return "IAPLogging";
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return "IAPLoggingLib2";
            case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                return "IAPLoggingLib5To7";
            case 30:
                return "AndroidManualImplicitPurchaseDedupe";
            case 31:
                return "AndroidManualImplicitSubsDedupe";
            case Consts.SP /* 32 */:
                return "AndroidIAPSubscriptionAutoLogging";
            case 33:
                return "Monitoring";
            case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                return "Megatron";
            case 35:
                return "Elora";
            case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                return "GPSARATriggers";
            case 37:
                return "GPSPACAProcessing";
            case 38:
                return "GPSTopicsObservation";
            case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                return "ServiceUpdateCompliance";
            case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                return "LoginKit";
            case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                return "ChromeCustomTabsPrefetching";
            case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                return "IgnoreAppSwitchToLoggedOut";
            case 43:
                return "BypassAppSwitch";
            case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                return "ShareKit";
            default:
                return "unknown";
        }
    }
}
