package com.google.accompanist.permissions;

import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewPermissionState implements PermissionState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStatus f7794a;

    public PreviewPermissionState(PermissionStatus status) {
        m.f(status, "status");
        this.f7794a = status;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public final PermissionStatus getStatus() {
        return this.f7794a;
    }

    @Override // com.google.accompanist.permissions.PermissionState
    public final void a() {
    }
}
