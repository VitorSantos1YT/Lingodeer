package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class GmsLogger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8930b;

    public GmsLogger(String str, String str2) {
        Object[] objArr = {str, 23};
        if (!(str.length() <= 23)) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        this.f8929a = str;
        this.f8930b = (str2 == null || str2.length() <= 0) ? null : str2;
    }
}
