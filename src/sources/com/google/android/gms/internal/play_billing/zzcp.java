package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcp implements Executor {
    public static final zzcp zza;
    private static final /* synthetic */ zzcp[] zzb;

    static {
        zzcp zzcpVar = new zzcp("INSTANCE", 0);
        zza = zzcpVar;
        zzb = new zzcp[]{zzcpVar};
    }

    public static zzcp[] values() {
        return (zzcp[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
