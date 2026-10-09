package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_PersistedEvent extends PersistedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransportContext f8189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EventInternal f8190c;

    public AutoValue_PersistedEvent(long j11, TransportContext transportContext, EventInternal eventInternal) {
        this.f8188a = j11;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f8189b = transportContext;
        if (eventInternal == null) {
            throw new NullPointerException("Null event");
        }
        this.f8190c = eventInternal;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final EventInternal a() {
        return this.f8190c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final long b() {
        return this.f8188a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent
    public final TransportContext c() {
        return this.f8189b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PersistedEvent)) {
            return false;
        }
        PersistedEvent persistedEvent = (PersistedEvent) obj;
        return this.f8188a == persistedEvent.b() && this.f8189b.equals(persistedEvent.c()) && this.f8190c.equals(persistedEvent.a());
    }

    public final int hashCode() {
        long j11 = this.f8188a;
        return ((((((int) ((j11 >>> 32) ^ j11)) ^ 1000003) * 1000003) ^ this.f8189b.hashCode()) * 1000003) ^ this.f8190c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f8188a + ", transportContext=" + this.f8189b + ", event=" + this.f8190c + "}";
    }
}
