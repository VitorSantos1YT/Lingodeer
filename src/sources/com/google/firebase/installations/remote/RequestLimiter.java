package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class RequestLimiter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f20420d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f20421e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Utils f20422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20424c;

    public RequestLimiter() {
        Pattern pattern = Utils.f20372c;
        SystemClock systemClockB = SystemClock.b();
        if (Utils.f20373d == null) {
            Utils.f20373d = new Utils(systemClockB);
        }
        this.f20422a = Utils.f20373d;
    }

    public final synchronized boolean a() {
        return this.f20424c == 0 || this.f20422a.f20374a.a() > this.f20423b;
    }

    public final synchronized void b(int i11) {
        long jMin;
        if ((i11 >= 200 && i11 < 300) || i11 == 401 || i11 == 404) {
            synchronized (this) {
                this.f20424c = 0;
            }
            return;
        }
        this.f20424c++;
        synchronized (this) {
            try {
                if (i11 == 429 || (i11 >= 500 && i11 < 600)) {
                    double dPow = Math.pow(2.0d, this.f20424c);
                    this.f20422a.getClass();
                    jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), f20421e);
                } else {
                    jMin = f20420d;
                }
                this.f20423b = this.f20422a.f20374a.a() + jMin;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return;
        throw th;
    }
}
