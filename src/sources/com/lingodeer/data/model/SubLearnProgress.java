package com.lingodeer.data.model;

import defpackage.e;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SubLearnProgress {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f22323id;
    private final String progress;
    private final long time;

    public SubLearnProgress(String id2, String progress, long j11) {
        m.f(id2, "id");
        m.f(progress, "progress");
        this.f22323id = id2;
        this.progress = progress;
        this.time = j11;
    }

    public static /* synthetic */ SubLearnProgress copy$default(SubLearnProgress subLearnProgress, String str, String str2, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = subLearnProgress.f22323id;
        }
        if ((i11 & 2) != 0) {
            str2 = subLearnProgress.progress;
        }
        if ((i11 & 4) != 0) {
            j11 = subLearnProgress.time;
        }
        return subLearnProgress.copy(str, str2, j11);
    }

    public final String component1() {
        return this.f22323id;
    }

    public final String component2() {
        return this.progress;
    }

    public final long component3() {
        return this.time;
    }

    public final SubLearnProgress copy(String id2, String progress, long j11) {
        m.f(id2, "id");
        m.f(progress, "progress");
        return new SubLearnProgress(id2, progress, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubLearnProgress)) {
            return false;
        }
        SubLearnProgress subLearnProgress = (SubLearnProgress) obj;
        return m.a(this.f22323id, subLearnProgress.f22323id) && m.a(this.progress, subLearnProgress.progress) && this.time == subLearnProgress.time;
    }

    public final String getId() {
        return this.f22323id;
    }

    public final String getProgress() {
        return this.progress;
    }

    public final long getTime() {
        return this.time;
    }

    public int hashCode() {
        return Long.hashCode(this.time) + e.d(this.f22323id.hashCode() * 31, 31, this.progress);
    }

    public String toString() {
        return e.i(this.time, ")", e.s("SubLearnProgress(id=", this.f22323id, ", progress=", this.progress, ", time="));
    }
}
