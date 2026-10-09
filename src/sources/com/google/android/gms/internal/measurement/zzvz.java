package com.google.android.gms.internal.measurement;

import android.os.StrictMode;
import java.security.SecureRandom;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzvz {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zzvz f12096c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f12097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f12098b;

    static {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            f12096c = new zzvz(UUID.randomUUID(), new SecureRandom().nextLong());
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public zzvz(UUID uuid, long j11) {
        this.f12097a = uuid;
        this.f12098b = new AtomicLong((j11 ^ 25214903917L) & 281474976710655L);
    }

    public final long a() {
        AtomicLong atomicLong;
        long j11;
        long j12;
        long j13;
        do {
            atomicLong = this.f12098b;
            j11 = atomicLong.get();
            j12 = ((j11 * 25214903917L) + 11) & 281474976710655L;
            j13 = ((25214903917L * j12) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j11, j13));
        return (((long) ((int) (j12 >>> 16))) << 32) + ((long) ((int) (j13 >>> 16)));
    }

    public final UUID b() {
        long jA = a() & (-61441);
        long jA2 = a() >>> 2;
        UUID uuid = this.f12097a;
        return new UUID(jA ^ uuid.getMostSignificantBits(), jA2 ^ uuid.getLeastSignificantBits());
    }
}
