package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import v6.c;
import w6.a;
import w6.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zbc implements SignInConnectionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f8533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8534b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8535c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8536d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8537e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f8538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile a f8539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile a f8540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f8541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f8542j;

    public zbc(Context context, Set set) {
        context.getApplicationContext();
        this.f8541i = new Semaphore(0);
        this.f8542j = set;
    }

    public final void a() {
        if (this.f8539g != null) {
            boolean z11 = this.f8534b;
            if (!z11) {
                if (z11) {
                    c();
                } else {
                    this.f8537e = true;
                }
            }
            if (this.f8540h != null) {
                this.f8539g.getClass();
                this.f8539g = null;
                return;
            }
            this.f8539g.getClass();
            a aVar = this.f8539g;
            aVar.f54654c.set(true);
            if (aVar.f54652a.cancel(false)) {
                this.f8540h = this.f8539g;
            }
            this.f8539g = null;
        }
    }

    public final void b() {
        if (this.f8540h != null || this.f8539g == null) {
            return;
        }
        this.f8539g.getClass();
        if (this.f8538f == null) {
            this.f8538f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        a aVar = this.f8539g;
        Executor executor = this.f8538f;
        if (aVar.f54653b == d.PENDING) {
            aVar.f54653b = d.RUNNING;
            executor.execute(aVar.f54652a);
            return;
        }
        int i11 = w6.c.f54659a[aVar.f54653b.ordinal()];
        if (i11 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i11 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f8539g = new a(this);
        b();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
