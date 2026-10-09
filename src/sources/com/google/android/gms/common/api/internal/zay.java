package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zay implements PendingResult.StatusListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BasePendingResult f8851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zaaa f8852b;

    public zay(zaaa zaaaVar, BasePendingResult basePendingResult) {
        this.f8851a = basePendingResult;
        Objects.requireNonNull(zaaaVar);
        this.f8852b = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void a(Status status) {
        this.f8852b.f8767a.remove(this.f8851a);
    }
}
