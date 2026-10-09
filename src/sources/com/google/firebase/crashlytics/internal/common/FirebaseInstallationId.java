package com.google.firebase.crashlytics.internal.common;

import hh.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstallationId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18329b;

    public FirebaseInstallationId(String str, String str2) {
        this.f18328a = str;
        this.f18329b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FirebaseInstallationId)) {
            return false;
        }
        FirebaseInstallationId firebaseInstallationId = (FirebaseInstallationId) obj;
        return m.a(this.f18328a, firebaseInstallationId.f18328a) && m.a(this.f18329b, firebaseInstallationId.f18329b);
    }

    public final int hashCode() {
        String str = this.f18328a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f18329b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.f18328a);
        sb2.append(", authToken=");
        return p0.o(sb2, this.f18329b, ')');
    }
}
