package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhy extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f13077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13078c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzhz f13079d;

    public zzhy(zzhz zzhzVar, String str, BlockingQueue blockingQueue) {
        this.f13079d = zzhzVar;
        Preconditions.g(blockingQueue);
        this.f13076a = new Object();
        this.f13077b = blockingQueue;
        setName(str);
    }

    public final void a() {
        zzhz zzhzVar = this.f13079d;
        synchronized (zzhzVar.f13087i) {
            try {
                if (!this.f13078c) {
                    zzhzVar.f13088j.release();
                    zzhzVar.f13087i.notifyAll();
                    if (this == zzhzVar.f13081c) {
                        zzhzVar.f13081c = null;
                    } else if (this == zzhzVar.f13082d) {
                        zzhzVar.f13082d = null;
                    } else {
                        zzgu zzguVar = zzhzVar.f13202a.f13099f;
                        zzic.m(zzguVar);
                        zzguVar.f12942f.a("Current scheduler thread is neither worker nor network");
                    }
                    this.f13078c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z11 = false;
        while (!z11) {
            try {
                this.f13079d.f13088j.acquire();
                z11 = true;
            } catch (InterruptedException e8) {
                zzgu zzguVar = this.f13079d.f13202a.f13099f;
                zzic.m(zzguVar);
                zzguVar.f12945i.b(e8, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f13077b;
                zzhx zzhxVar = (zzhx) blockingQueue.poll();
                if (zzhxVar != null) {
                    Process.setThreadPriority(true != zzhxVar.f13073b ? 10 : threadPriority);
                    zzhxVar.run();
                } else {
                    Object obj = this.f13076a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.f13079d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e10) {
                                zzgu zzguVar2 = this.f13079d.f13202a.f13099f;
                                zzic.m(zzguVar2);
                                zzguVar2.f12945i.b(e10, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f13079d.f13087i) {
                        if (this.f13077b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            a();
            throw th2;
        }
    }
}
