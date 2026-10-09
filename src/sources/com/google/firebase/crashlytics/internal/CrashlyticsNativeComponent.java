package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface CrashlyticsNativeComponent {
    NativeSessionFileProvider a(String str);

    boolean b();

    void c(String str, long j11, StaticSessionData staticSessionData);

    boolean d(String str);
}
