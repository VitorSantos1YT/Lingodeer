package com.google.firebase.sessions;

import bq.u;
import c00.e;
import com.bumptech.glide.d;
import g00.d1;
import java.util.Map;
import kotlin.jvm.internal.m;
import qy.h;
import qy.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@e
public final class SessionData {
    public static final Companion Companion = new Companion(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h[] f20928d = {null, null, d.u(j.PUBLICATION, new u(20))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SessionDetails f20929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Time f20930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20931c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Companion {
        private Companion() {
        }

        public final c00.a serializer() {
            return SessionData$$serializer.f20932a;
        }

        public /* synthetic */ Companion(int i11) {
            this();
        }
    }

    public /* synthetic */ SessionData(int i11, SessionDetails sessionDetails, Time time, Map map) {
        if (1 != (i11 & 1)) {
            d1.k(i11, 1, SessionData$$serializer.f20932a.getDescriptor());
            throw null;
        }
        this.f20929a = sessionDetails;
        if ((i11 & 2) == 0) {
            this.f20930b = null;
        } else {
            this.f20930b = time;
        }
        if ((i11 & 4) == 0) {
            this.f20931c = null;
        } else {
            this.f20931c = map;
        }
    }

    public static SessionData a(SessionData sessionData, SessionDetails sessionDetails, Time time, Map map, int i11) {
        if ((i11 & 1) != 0) {
            sessionDetails = sessionData.f20929a;
        }
        if ((i11 & 2) != 0) {
            time = sessionData.f20930b;
        }
        if ((i11 & 4) != 0) {
            map = sessionData.f20931c;
        }
        sessionData.getClass();
        m.f(sessionDetails, "sessionDetails");
        return new SessionData(sessionDetails, time, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionData)) {
            return false;
        }
        SessionData sessionData = (SessionData) obj;
        return m.a(this.f20929a, sessionData.f20929a) && m.a(this.f20930b, sessionData.f20930b) && m.a(this.f20931c, sessionData.f20931c);
    }

    public final int hashCode() {
        int iHashCode = this.f20929a.hashCode() * 31;
        Time time = this.f20930b;
        int iHashCode2 = (iHashCode + (time == null ? 0 : Long.hashCode(time.f21022a))) * 31;
        Map map = this.f20931c;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.f20929a + ", backgroundTime=" + this.f20930b + ", processDataMap=" + this.f20931c + ')';
    }

    public SessionData(SessionDetails sessionDetails, Time time, Map map) {
        m.f(sessionDetails, "sessionDetails");
        this.f20929a = sessionDetails;
        this.f20930b = time;
        this.f20931c = map;
    }
}
