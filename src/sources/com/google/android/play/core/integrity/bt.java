package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class bt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f16187a;

    public bt(bn bnVar) {
        this.f16187a = bnVar;
    }

    public final /* synthetic */ Task a(long j11, long j12, int i11, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f16187a.d(standardIntegrityTokenRequest, j11, j12, 0);
    }
}
