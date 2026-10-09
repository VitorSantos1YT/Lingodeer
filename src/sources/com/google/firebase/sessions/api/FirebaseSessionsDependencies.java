package com.google.firebase.sessions.api;

import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseSessionsDependencies {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FirebaseSessionsDependencies f21032a = new FirebaseSessionsDependencies();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f21033b = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Dependency {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CountDownLatch f21034a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CrashlyticsAppQualitySessionsSubscriber f21035b = null;

        public Dependency(CountDownLatch countDownLatch) {
            this.f21034a = countDownLatch;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Dependency)) {
                return false;
            }
            Dependency dependency = (Dependency) obj;
            return this.f21034a.equals(dependency.f21034a) && m.a(this.f21035b, dependency.f21035b);
        }

        public final int hashCode() {
            int iHashCode = this.f21034a.hashCode() * 31;
            CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = this.f21035b;
            return iHashCode + (crashlyticsAppQualitySessionsSubscriber == null ? 0 : crashlyticsAppQualitySessionsSubscriber.hashCode());
        }

        public final String toString() {
            return "Dependency(latch=" + this.f21034a + ", subscriber=" + this.f21035b + ')';
        }
    }

    private FirebaseSessionsDependencies() {
    }

    public static final void a(SessionSubscriber.Name subscriberName) {
        m.f(subscriberName, "subscriberName");
        Map map = f21033b;
        if (map.containsKey(subscriberName)) {
            subscriberName.toString();
        } else {
            map.put(subscriberName, new Dependency(new CountDownLatch(1)));
            subscriberName.toString();
        }
    }

    public static Dependency b(SessionSubscriber.Name name) {
        Map dependencies = f21033b;
        m.e(dependencies, "dependencies");
        Object obj = dependencies.get(name);
        if (obj != null) {
            return (Dependency) obj;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    public static final void d(CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        SessionSubscriber.Name name = SessionSubscriber.Name.CRASHLYTICS;
        f21032a.getClass();
        Dependency dependencyB = b(name);
        if (dependencyB.f21035b != null) {
            Objects.toString(name);
            return;
        }
        dependencyB.f21035b = crashlyticsAppQualitySessionsSubscriber;
        Objects.toString(name);
        dependencyB.f21034a.countDown();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0064  */
    /* JADX WARN: Code duplicated, block: B:19:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009f  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009f -> B:21:0x00a0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(xy.c r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.c(xy.c):java.lang.Object");
    }
}
