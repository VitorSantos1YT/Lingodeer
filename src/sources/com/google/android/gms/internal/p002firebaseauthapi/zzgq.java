package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class zzgq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f10497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f10498b;

    static {
        int[] iArr = new int[zzvk.values().length];
        f10498b = iArr;
        try {
            iArr[zzvk.SHA1.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f10498b[zzvk.SHA224.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f10498b[zzvk.SHA256.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f10498b[zzvk.SHA384.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f10498b[zzvk.SHA512.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr2 = new int[zzxl.values().length];
        f10497a = iArr2;
        try {
            iArr2[zzxl.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f10497a[zzxl.CRUNCHY.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            f10497a[zzxl.LEGACY.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            f10497a[zzxl.RAW.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
    }
}
