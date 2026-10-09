package com.lingo.lingoskill.http.model;

import com.lingo.fluent.object.SyncProgress;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ProgressFluentLearnSyncResponse {
    public static final int $stable = 8;
    private final SyncProgress progress;

    public ProgressFluentLearnSyncResponse(SyncProgress progress) {
        m.f(progress, "progress");
        this.progress = progress;
    }

    public static /* synthetic */ ProgressFluentLearnSyncResponse copy$default(ProgressFluentLearnSyncResponse progressFluentLearnSyncResponse, SyncProgress syncProgress, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            syncProgress = progressFluentLearnSyncResponse.progress;
        }
        return progressFluentLearnSyncResponse.copy(syncProgress);
    }

    public final SyncProgress component1() {
        return this.progress;
    }

    public final ProgressFluentLearnSyncResponse copy(SyncProgress progress) {
        m.f(progress, "progress");
        return new ProgressFluentLearnSyncResponse(progress);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProgressFluentLearnSyncResponse) && m.a(this.progress, ((ProgressFluentLearnSyncResponse) obj).progress);
    }

    public final SyncProgress getProgress() {
        return this.progress;
    }

    public int hashCode() {
        return this.progress.hashCode();
    }

    public String toString() {
        return "ProgressFluentLearnSyncResponse(progress=" + this.progress + ")";
    }
}
