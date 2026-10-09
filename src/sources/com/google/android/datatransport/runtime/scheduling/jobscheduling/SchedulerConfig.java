package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Clock f8130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f8131b = new HashMap();
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static abstract class ConfigValue {

        /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
        public static abstract class Builder {
        }

        public abstract long a();

        public abstract Set b();

        public abstract long c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DEVICE_CHARGING;
        public static final Flag DEVICE_IDLE;
        public static final Flag NETWORK_UNMETERED;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            NETWORK_UNMETERED = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            DEVICE_IDLE = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = flag3;
            $VALUES = new Flag[]{flag, flag2, flag3};
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    public static SchedulerConfig b(Clock clock) {
        Builder builder = new Builder();
        Priority priority = Priority.DEFAULT;
        AutoValue_SchedulerConfig_ConfigValue.Builder builder2 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder2.f8125c = set;
        builder2.f8123a = 30000L;
        builder2.f8124b = 86400000L;
        builder.f8131b.put(priority, builder2.a());
        Priority priority2 = Priority.HIGHEST;
        AutoValue_SchedulerConfig_ConfigValue.Builder builder3 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder3.f8125c = set;
        builder3.f8123a = 1000L;
        builder3.f8124b = 86400000L;
        builder.f8131b.put(priority2, builder3.a());
        Priority priority3 = Priority.VERY_LOW;
        AutoValue_SchedulerConfig_ConfigValue.Builder builder4 = new AutoValue_SchedulerConfig_ConfigValue.Builder();
        if (set == null) {
            throw new NullPointerException("Null flags");
        }
        builder4.f8125c = set;
        builder4.f8123a = 86400000L;
        builder4.f8124b = 86400000L;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(Flag.DEVICE_IDLE)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        builder4.f8125c = setUnmodifiableSet;
        builder.f8131b.put(priority3, builder4.a());
        builder.f8130a = clock;
        if (clock == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (builder.f8131b.keySet().size() < Priority.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        HashMap map = builder.f8131b;
        builder.f8131b = new HashMap();
        return new AutoValue_SchedulerConfig(builder.f8130a, map);
    }

    public abstract Clock a();

    public final long c(Priority priority, long j11, int i11) {
        long jA = j11 - a().a();
        ConfigValue configValue = (ConfigValue) d().get(priority);
        long jA2 = configValue.a();
        int i12 = i11 - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i12) * jA2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((jA2 > 1 ? jA2 : 2L) * ((long) i12)))), jA), configValue.c());
    }

    public abstract Map d();
}
