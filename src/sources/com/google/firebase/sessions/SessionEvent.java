package com.google.firebase.sessions;

import com.google.firebase.encoders.annotations.Encodable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@Encodable
public final class SessionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EventType f20940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SessionInfo f20941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f20942c;

    public SessionEvent(EventType eventType, SessionInfo sessionInfo, ApplicationInfo applicationInfo) {
        m.f(eventType, "eventType");
        this.f20940a = eventType;
        this.f20941b = sessionInfo;
        this.f20942c = applicationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEvent)) {
            return false;
        }
        SessionEvent sessionEvent = (SessionEvent) obj;
        return this.f20940a == sessionEvent.f20940a && m.a(this.f20941b, sessionEvent.f20941b) && m.a(this.f20942c, sessionEvent.f20942c);
    }

    public final int hashCode() {
        return this.f20942c.hashCode() + ((this.f20941b.hashCode() + (this.f20940a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + this.f20940a + ", sessionData=" + this.f20941b + ", applicationInfo=" + this.f20942c + ')';
    }
}
