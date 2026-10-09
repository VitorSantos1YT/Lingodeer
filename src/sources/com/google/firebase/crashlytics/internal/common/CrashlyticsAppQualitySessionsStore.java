package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.persistence.FileStore;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class CrashlyticsAppQualitySessionsStore {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18251d = new b(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f18252e = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileStore f18253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18254b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18255c = null;

    public CrashlyticsAppQualitySessionsStore(FileStore fileStore) {
        this.f18253a = fileStore;
    }
}
