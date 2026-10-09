package com.github.javiersantos.piracychecker.enums;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public enum PiracyCheckerError {
    NOT_LICENSED("This user is not using a licensed application from Google Play."),
    SIGNATURE_NOT_VALID("This app is using another signature. The original APK has been modified."),
    INVALID_INSTALLER_ID("This app has been installed from a non-allowed source."),
    USING_DEBUG_APP("This is a debug build."),
    USING_APP_IN_EMULATOR("This app is being used in an emulator."),
    PIRATE_APP_INSTALLED("At least one pirate app has been detected on device."),
    BLOCK_PIRATE_APP("At least one pirate app has been detected and the app must be reinstalled when all unauthorized apps are uninstalled."),
    THIRD_PARTY_STORE_INSTALLED("At least one third-party store has been detected on device."),
    INVALID_PACKAGE_NAME("Application package name is invalid."),
    NON_MATCHING_UID("Application UID doesn't match."),
    NOT_MARKET_MANAGED("Not market managed error."),
    CHECK_IN_PROGRESS("License check is in progress."),
    INVALID_PUBLIC_KEY("Application public key is invalid."),
    MISSING_PERMISSION("Application misses the 'com.android.vending.CHECK_LICENSE' permission."),
    UNKNOWN("Unknown error.");

    public static final Companion Companion = new Companion(0);
    private final String text;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    PiracyCheckerError(String str) {
        this.text = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.text;
    }
}
