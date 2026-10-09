package com.google.android.gms.internal.base;

import com.google.android.gms.common.Feature;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Feature f9587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Feature f9588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Feature[] f9589c;

    static {
        Feature feature = new Feature("CLIENT_TELEMETRY", 1L);
        f9587a = feature;
        Feature feature2 = new Feature("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        f9588b = feature2;
        f9589c = new Feature[]{feature, feature2};
    }
}
