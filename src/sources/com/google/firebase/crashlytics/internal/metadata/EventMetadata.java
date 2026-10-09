package com.google.firebase.crashlytics.internal.metadata;

import defpackage.e;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class EventMetadata {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f18397c;

    public EventMetadata(Map additionalCustomKeys, String str, long j11) {
        m.f(additionalCustomKeys, "additionalCustomKeys");
        this.f18395a = str;
        this.f18396b = j11;
        this.f18397c = additionalCustomKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventMetadata)) {
            return false;
        }
        EventMetadata eventMetadata = (EventMetadata) obj;
        return m.a(this.f18395a, eventMetadata.f18395a) && this.f18396b == eventMetadata.f18396b && m.a(this.f18397c, eventMetadata.f18397c);
    }

    public final int hashCode() {
        return this.f18397c.hashCode() + e.f(this.f18396b, this.f18395a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "EventMetadata(sessionId=" + this.f18395a + ", timestamp=" + this.f18396b + ", additionalCustomKeys=" + this.f18397c + ')';
    }
}
