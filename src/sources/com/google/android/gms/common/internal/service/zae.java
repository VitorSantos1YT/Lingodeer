package com.google.android.gms.common.internal.service;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zae extends zaa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseImplementation.ResultHolder f8960a;

    public zae(BaseImplementation.ResultHolder resultHolder) {
        this.f8960a = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zam
    public final void g0(int i11) {
        this.f8960a.a(new Status(i11, null, null, null));
    }
}
