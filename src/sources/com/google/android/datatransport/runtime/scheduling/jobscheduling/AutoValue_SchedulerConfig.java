package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clock f8118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f8119b;

    public AutoValue_SchedulerConfig(Clock clock, Map map) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.f8118a = clock;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f8119b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Clock a() {
        return this.f8118a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map d() {
        return this.f8119b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f8118a.equals(schedulerConfig.a()) && this.f8119b.equals(schedulerConfig.d());
    }

    public final int hashCode() {
        return ((this.f8118a.hashCode() ^ 1000003) * 1000003) ^ this.f8119b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8118a + ", values=" + this.f8119b + "}";
    }
}
