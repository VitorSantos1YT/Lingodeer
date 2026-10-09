package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class GetIdListener implements StateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f20368a;

    public GetIdListener(TaskCompletionSource taskCompletionSource) {
        this.f20368a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        if (persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.UNREGISTERED && persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.REGISTERED && persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return false;
        }
        this.f20368a.trySetResult(persistedInstallationEntry.c());
        return true;
    }
}
