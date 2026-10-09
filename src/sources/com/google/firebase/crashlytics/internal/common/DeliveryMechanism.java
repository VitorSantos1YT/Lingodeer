package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f18324id;

    DeliveryMechanism(int i11) {
        this.f18324id = i11;
    }

    public final int a() {
        return this.f18324id;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f18324id);
    }
}
