package com.google.firebase.sessions.api;

import androidx.lifecycle.viewmodel.compose.NP.IMCc;
import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Name {
        private static final /* synthetic */ yy.a $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;
        public static final Name CRASHLYTICS;
        public static final Name MATT_SAYS_HI;
        public static final Name PERFORMANCE;

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }

        static {
            Name name = new Name("CRASHLYTICS", 0);
            CRASHLYTICS = name;
            Name name2 = new Name("PERFORMANCE", 1);
            PERFORMANCE = name2;
            Name name3 = new Name(IMCc.dcrYlt, 2);
            MATT_SAYS_HI = name3;
            Name[] nameArr = {name, name2, name3};
            $VALUES = nameArr;
            $ENTRIES = ub.a.U(nameArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SessionDetails {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21043a;

        public SessionDetails(String sessionId) {
            m.f(sessionId, "sessionId");
            this.f21043a = sessionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && m.a(this.f21043a, ((SessionDetails) obj).f21043a);
        }

        public final int hashCode() {
            return this.f21043a.hashCode();
        }

        public final String toString() {
            return p0.o(new StringBuilder("SessionDetails(sessionId="), this.f21043a, ')');
        }
    }

    boolean a();

    Name b();

    void c(SessionDetails sessionDetails);
}
