package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzhx extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzhz f13075d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhx(zzhz zzhzVar, Runnable runnable, boolean z11, String str) {
        super(runnable, null);
        this.f13075d = zzhzVar;
        long andIncrement = zzhz.f13080k.getAndIncrement();
        this.f13072a = andIncrement;
        this.f13074c = str;
        this.f13073b = z11;
        if (andIncrement == Long.MAX_VALUE) {
            zzgu zzguVar = zzhzVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zzhx zzhxVar = (zzhx) obj;
        boolean z11 = zzhxVar.f13073b;
        boolean z12 = this.f13073b;
        if (z12 != z11) {
            return !z12 ? 1 : -1;
        }
        long j11 = zzhxVar.f13072a;
        long j12 = this.f13072a;
        if (j12 < j11) {
            return -1;
        }
        if (j12 > j11) {
            return 1;
        }
        zzgu zzguVar = this.f13075d.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12943g.b(Long.valueOf(j12), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th2) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        zzgu zzguVar = this.f13075d.f13202a.f13099f;
        zzic.m(zzguVar);
        zzguVar.f12942f.b(th2, this.f13074c);
        if ((th2 instanceof zzhv) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th2);
        }
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhx(zzhz zzhzVar, Callable callable, boolean z11) {
        super(callable);
        this.f13075d = zzhzVar;
        long andIncrement = zzhz.f13080k.getAndIncrement();
        this.f13072a = andIncrement;
        this.f13074c = "Task exception on worker thread";
        this.f13073b = z11;
        if (andIncrement == Long.MAX_VALUE) {
            zzgu zzguVar = zzhzVar.f13202a.f13099f;
            zzic.m(zzguVar);
            zzguVar.f12942f.a("Tasks index overflow");
        }
    }
}
