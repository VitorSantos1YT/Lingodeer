package com.lingodeer.network.model;

import ep.a;
import kotlin.jvm.internal.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class FirebaseOpenIdCheckResponse {
    private boolean isexist;

    public FirebaseOpenIdCheckResponse() {
        this(false, 1, null);
    }

    public static /* synthetic */ FirebaseOpenIdCheckResponse copy$default(FirebaseOpenIdCheckResponse firebaseOpenIdCheckResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = firebaseOpenIdCheckResponse.isexist;
        }
        return firebaseOpenIdCheckResponse.copy(z11);
    }

    public final boolean component1() {
        return this.isexist;
    }

    public final FirebaseOpenIdCheckResponse copy(boolean z11) {
        return new FirebaseOpenIdCheckResponse(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseOpenIdCheckResponse) && this.isexist == ((FirebaseOpenIdCheckResponse) obj).isexist;
    }

    public final boolean getIsexist() {
        return this.isexist;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isexist);
    }

    public final void setIsexist(boolean z11) {
        this.isexist = z11;
    }

    public String toString() {
        return a.i("FirebaseOpenIdCheckResponse(isexist=", ")", this.isexist);
    }

    public FirebaseOpenIdCheckResponse(boolean z11) {
        this.isexist = z11;
    }

    public /* synthetic */ FirebaseOpenIdCheckResponse(boolean z11, int i11, f fVar) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
