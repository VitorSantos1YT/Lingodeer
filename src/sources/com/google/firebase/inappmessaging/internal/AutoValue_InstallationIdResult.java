package com.google.firebase.inappmessaging.internal;

import com.google.firebase.installations.InstallationTokenResult;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_InstallationIdResult extends InstallationIdResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstallationTokenResult f19960b;

    public AutoValue_InstallationIdResult(String str, InstallationTokenResult installationTokenResult) {
        if (str == null) {
            throw new NullPointerException("Null installationId");
        }
        this.f19959a = str;
        if (installationTokenResult == null) {
            throw new NullPointerException("Null installationTokenResult");
        }
        this.f19960b = installationTokenResult;
    }

    @Override // com.google.firebase.inappmessaging.internal.InstallationIdResult
    public final String a() {
        return this.f19959a;
    }

    @Override // com.google.firebase.inappmessaging.internal.InstallationIdResult
    public final InstallationTokenResult b() {
        return this.f19960b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstallationIdResult)) {
            return false;
        }
        InstallationIdResult installationIdResult = (InstallationIdResult) obj;
        return this.f19959a.equals(installationIdResult.a()) && this.f19960b.equals(installationIdResult.b());
    }

    public final int hashCode() {
        return ((this.f19959a.hashCode() ^ 1000003) * 1000003) ^ this.f19960b.hashCode();
    }

    public final String toString() {
        return "InstallationIdResult{installationId=" + this.f19959a + ", installationTokenResult=" + this.f19960b + "}";
    }
}
