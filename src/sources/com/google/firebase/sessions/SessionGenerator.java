package com.google.firebase.sessions;

import java.util.Locale;
import kotlin.jvm.internal.m;
import oz.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SessionGenerator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeProvider f20967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UuidGenerator f20968b;

    public SessionGenerator(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        m.f(timeProvider, "timeProvider");
        m.f(uuidGenerator, "uuidGenerator");
        this.f20967a = timeProvider;
        this.f20968b = uuidGenerator;
    }

    public final SessionDetails a(SessionDetails sessionDetails) {
        String str;
        String string = this.f20968b.next().toString();
        m.e(string, "toString(...)");
        String lowerCase = x.q0(string, "-", com.tbruyelle.rxpermissions3.BuildConfig.VERSION_NAME).toLowerCase(Locale.ROOT);
        m.e(lowerCase, "toLowerCase(...)");
        return new SessionDetails(sessionDetails != null ? sessionDetails.f20937c + 1 : 0, lowerCase, (sessionDetails == null || (str = sessionDetails.f20936b) == null) ? lowerCase : str, this.f20967a.a().f21023b);
    }
}
