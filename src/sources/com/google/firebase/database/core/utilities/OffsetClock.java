package com.google.firebase.database.core.utilities;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class OffsetClock implements Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19420a;

    @Override // com.google.firebase.database.core.utilities.Clock
    public final long millis() {
        return System.currentTimeMillis() + this.f19420a;
    }
}
