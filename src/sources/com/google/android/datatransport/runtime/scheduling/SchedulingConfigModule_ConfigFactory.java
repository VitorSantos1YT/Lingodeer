package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import oy.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f8112a;

    public SchedulingConfigModule_ConfigFactory(TimeModule_EventClockFactory timeModule_EventClockFactory) {
        this.f8112a = timeModule_EventClockFactory;
    }

    @Override // oy.a
    public final Object get() {
        return SchedulerConfig.b((Clock) this.f8112a.get());
    }
}
