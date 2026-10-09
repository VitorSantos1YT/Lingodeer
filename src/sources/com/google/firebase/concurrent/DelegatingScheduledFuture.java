package com.google.firebase.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class DelegatingScheduledFuture<V> extends a4.h implements ScheduledFuture<V> {
    public static final /* synthetic */ int K = 0;
    public final ScheduledFuture H;

    /* JADX INFO: renamed from: com.google.firebase.concurrent.DelegatingScheduledFuture$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Completer<Object> {
        public AnonymousClass1() {
        }

        public final void a(Object obj) {
            int i11 = DelegatingScheduledFuture.K;
            DelegatingScheduledFuture.this.k(obj);
        }

        public final void b(Exception exc) {
            int i11 = DelegatingScheduledFuture.K;
            DelegatingScheduledFuture.this.l(exc);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Completer<T> {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Resolver<T> {
        ScheduledFuture a(AnonymousClass1 anonymousClass1);
    }

    public DelegatingScheduledFuture(Resolver resolver) {
        this.H = resolver.a(new AnonymousClass1());
    }

    @Override // a4.h
    public final void b() {
        ScheduledFuture scheduledFuture = this.H;
        Object obj = this.f344a;
        scheduledFuture.cancel((obj instanceof a4.a) && ((a4.a) obj).f324a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.H.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.H.getDelay(timeUnit);
    }
}
