package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.datepicker.d;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class GetAuthTokenListener implements StateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Utils f20366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f20367b;

    public GetAuthTokenListener(Utils utils, TaskCompletionSource taskCompletionSource) {
        this.f20366a = utils;
        this.f20367b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean a(Exception exc) {
        this.f20367b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.StateListener
    public final boolean b(PersistedInstallationEntry persistedInstallationEntry) {
        String str;
        if (persistedInstallationEntry.f() != PersistedInstallation.RegistrationStatus.REGISTERED || this.f20366a.a(persistedInstallationEntry)) {
            return false;
        }
        AutoValue_InstallationTokenResult.Builder builder = new AutoValue_InstallationTokenResult.Builder();
        String strA = persistedInstallationEntry.a();
        if (strA == null) {
            throw new NullPointerException("Null token");
        }
        builder.f20345a = strA;
        builder.f20346b = persistedInstallationEntry.b();
        builder.f20347c = (byte) (builder.f20347c | 1);
        long jG = persistedInstallationEntry.g();
        byte b3 = (byte) (builder.f20347c | 2);
        builder.f20347c = b3;
        if (b3 == 3 && (str = builder.f20345a) != null) {
            this.f20367b.setResult(new AutoValue_InstallationTokenResult(str, builder.f20346b, jG));
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        if (builder.f20345a == null) {
            sb2.append(" token");
        }
        if ((builder.f20347c & 1) == 0) {
            sb2.append(" tokenExpirationTimestamp");
        }
        if ((builder.f20347c & 2) == 0) {
            sb2.append(" tokenCreationTimestamp");
        }
        throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
    }
}
