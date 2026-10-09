package com.google.android.gms.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8648a;

    public GooglePlayServicesRepairableException(int i11) {
        super("Google Play Services not available");
        this.f8648a = i11;
    }
}
