package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Intent;
import android.util.Pair;
import b7.k;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import kotlin.jvm.internal.y;
import lf.j;
import re.m;
import y6.h0;
import y6.i0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements SynchronizationGuard.CriticalSection, k, i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f8163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8164c;

    public /* synthetic */ b(int i11, i0 i0Var, i0 i0Var2) {
        this.f8162a = i11;
        this.f8163b = i0Var;
        this.f8164c = i0Var2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object b() {
        Uploader uploader = (Uploader) this.f8163b;
        uploader.f8135d.a((TransportContext) this.f8164c, this.f8162a + 1);
        return null;
    }

    @Override // i.b
    public void f(Object obj) {
        Object jVar = (m) this.f8163b;
        int i11 = this.f8162a;
        y launcher = (y) this.f8164c;
        Pair pair = (Pair) obj;
        kotlin.jvm.internal.m.f(launcher, "$launcher");
        if (jVar == null) {
            jVar = new j();
        }
        Object obj2 = pair.first;
        kotlin.jvm.internal.m.e(obj2, "result.first");
        ((j) jVar).a(i11, ((Number) obj2).intValue(), (Intent) pair.second);
        i.c cVar = (i.c) launcher.f38361a;
        if (cVar != null) {
            synchronized (cVar) {
                cVar.b();
                launcher.f38361a = null;
            }
        }
    }

    @Override // b7.k
    public void invoke(Object obj) {
        i0 i0Var = (i0) this.f8163b;
        i0 i0Var2 = (i0) this.f8164c;
        h0 h0Var = (h0) obj;
        h0Var.getClass();
        h0Var.C(this.f8162a, i0Var, i0Var2);
    }

    public /* synthetic */ b(Uploader uploader, TransportContext transportContext, int i11) {
        this.f8163b = uploader;
        this.f8164c = transportContext;
        this.f8162a = i11;
    }

    public /* synthetic */ b(m mVar, int i11, y yVar) {
        this.f8163b = mVar;
        this.f8162a = i11;
        this.f8164c = yVar;
    }
}
