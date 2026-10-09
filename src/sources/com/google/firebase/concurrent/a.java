package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f18173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f18174c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f18172a = i11;
        this.f18173b = obj;
        this.f18174c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18172a) {
            case 0:
                CustomThreadFactory customThreadFactory = (CustomThreadFactory) this.f18173b;
                Runnable runnable = (Runnable) this.f18174c;
                Process.setThreadPriority(customThreadFactory.f18154c);
                StrictMode.ThreadPolicy threadPolicy = customThreadFactory.f18155d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                break;
            default:
                Callable callable = (Callable) this.f18173b;
                DelegatingScheduledFuture.AnonymousClass1 anonymousClass1 = (DelegatingScheduledFuture.AnonymousClass1) this.f18174c;
                try {
                    anonymousClass1.a(callable.call());
                } catch (Exception e8) {
                    anonymousClass1.b(e8);
                }
                break;
        }
    }
}
