package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.lingo.lingoskill.ui.base.ENO.MzwEyWCkjXL;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8122c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f8123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f8124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f8125c;

        public final SchedulerConfig.ConfigValue a() {
            String strM = this.f8123a == null ? MzwEyWCkjXL.hNJpjrWrqSEorNC : BuildConfig.VERSION_NAME;
            if (this.f8124b == null) {
                strM = strM.concat(" maxAllowedDelay");
            }
            if (this.f8125c == null) {
                strM = defpackage.e.m(strM, " flags");
            }
            if (strM.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f8123a.longValue(), this.f8124b.longValue(), this.f8125c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strM));
        }
    }

    public AutoValue_SchedulerConfig_ConfigValue(long j11, long j12, Set set) {
        this.f8120a = j11;
        this.f8121b = j12;
        this.f8122c = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long a() {
        return this.f8120a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final Set b() {
        return this.f8122c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    public final long c() {
        return this.f8121b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        return this.f8120a == configValue.a() && this.f8121b == configValue.c() && this.f8122c.equals(configValue.b());
    }

    public final int hashCode() {
        long j11 = this.f8120a;
        int i11 = (((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003;
        long j12 = this.f8121b;
        return ((i11 ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f8122c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8120a + ", maxAllowedDelay=" + this.f8121b + ", flags=" + this.f8122c + "}";
    }
}
