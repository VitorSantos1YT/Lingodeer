package com.google.common.util.concurrent;

import com.google.common.base.Stopwatch;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
public abstract class RateLimiter {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class SleepingStopwatch {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        class AnonymousClass1 extends SleepingStopwatch {
            public AnonymousClass1() {
                new Stopwatch().b();
            }
        }
    }

    public abstract double a();

    public final String toString() {
        Locale locale = Locale.ROOT;
        throw null;
    }
}
