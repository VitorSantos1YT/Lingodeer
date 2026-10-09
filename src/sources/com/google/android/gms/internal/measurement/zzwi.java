package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.MoreExecutors;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzwi implements Runnable, zzwt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public zzws f12106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12107b = zzrn.a(Thread.currentThread());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f12110e;

    public zzwi(zzws zzwsVar, boolean z11) {
        this.f12110e = false;
        this.f12106a = zzwsVar;
        this.f12110e = z11;
    }

    public final void a(AbstractFuture abstractFuture) {
        if (this.f12108c) {
            throw new IllegalStateException("Span was already closed. Did you attach it to a future after calling Tracer.endSpan()?");
        }
        if (this.f12109d) {
            throw new IllegalStateException("Signal is already attached to future");
        }
        this.f12109d = true;
        abstractFuture.N(this, MoreExecutors.a());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        zzws zzwsVar = this.f12106a;
        try {
            this.f12106a = null;
            boolean z11 = this.f12109d;
            if (!z11) {
                if (this.f12108c) {
                    throw new IllegalStateException("Span was already closed!");
                }
                this.f12108c = true;
                if (this.f12107b && !z11) {
                    zzrn.a(Thread.currentThread());
                }
            }
            if (zzwsVar != null) {
                zzwsVar.close();
            }
            if (this.f12110e) {
                zzvy.b(zzvy.c(), zzwg.f12104t);
            }
        } catch (Throwable th2) {
            if (zzwsVar != null) {
                try {
                    zzwsVar.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z11;
        if (this.f12108c || !(z11 = this.f12109d)) {
            zzrn.b().post(new Runnable() { // from class: com.google.android.gms.internal.measurement.zzwh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    throw new IllegalStateException("Span was closed by an invalid call to SpanEndSignal.run()");
                }
            });
            return;
        }
        this.f12108c = true;
        if (!this.f12107b || z11) {
            return;
        }
        zzrn.a(Thread.currentThread());
    }
}
