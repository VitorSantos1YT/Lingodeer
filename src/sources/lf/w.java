package lf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f40128a;

    static {
        int[] iArr = new int[x.values().length];
        try {
            iArr[x.Core.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[x.AppEvents.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[x.CodelessEvents.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[x.RestrictiveDataFiltering.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[x.Instrument.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[x.CrashReport.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[x.CrashShield.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[x.ThreadCheck.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[x.ErrorReport.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[x.AnrReport.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[x.AAM.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[x.CloudBridge.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[x.PrivacyProtection.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[x.SuggestedEvents.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[x.IntelligentIntegrity.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[x.StdParamEnforcement.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[x.ProtectedMode.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[x.BannedParamFiltering.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr[x.MACARuleMatching.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr[x.BlocklistEvents.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr[x.FilterRedactedEvents.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr[x.FilterSensitiveParams.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr[x.ModelRequest.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr[x.EventDeactivation.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr[x.OnDeviceEventProcessing.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr[x.OnDevicePostInstallEventProcessing.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr[x.IapLogging.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr[x.IapLoggingLib2.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr[x.IapLoggingLib5To7.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr[x.AndroidManualImplicitPurchaseDedupe.ordinal()] = 30;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr[x.AndroidManualImplicitSubsDedupe.ordinal()] = 31;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr[x.AndroidIAPSubscriptionAutoLogging.ordinal()] = 32;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr[x.Monitoring.ordinal()] = 33;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr[x.Megatron.ordinal()] = 34;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr[x.Elora.ordinal()] = 35;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr[x.GPSARATriggers.ordinal()] = 36;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr[x.GPSPACAProcessing.ordinal()] = 37;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr[x.GPSTopicsObservation.ordinal()] = 38;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr[x.ServiceUpdateCompliance.ordinal()] = 39;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr[x.Login.ordinal()] = 40;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr[x.ChromeCustomTabsPrefetching.ordinal()] = 41;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr[x.IgnoreAppSwitchToLoggedOut.ordinal()] = 42;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr[x.BypassAppSwitch.ordinal()] = 43;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr[x.Share.ordinal()] = 44;
        } catch (NoSuchFieldError unused44) {
        }
        f40128a = iArr;
    }
}
