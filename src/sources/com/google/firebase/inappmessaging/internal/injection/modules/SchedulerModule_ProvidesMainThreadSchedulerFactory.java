package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import uw.n;
import vw.b;
import vw.e;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class SchedulerModule_ProvidesMainThreadSchedulerFactory implements Factory<n> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchedulerModule f20231a;

    public SchedulerModule_ProvidesMainThreadSchedulerFactory(SchedulerModule schedulerModule) {
        this.f20231a = schedulerModule;
    }

    @Override // oy.a
    public final Object get() {
        this.f20231a.getClass();
        e eVar = b.f54305a;
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException(anrPHlQ.BENpJrgZBjGZJJg);
    }
}
