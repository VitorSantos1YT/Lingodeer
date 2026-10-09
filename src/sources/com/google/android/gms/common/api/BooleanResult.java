package com.google.android.gms.common.api;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class BooleanResult implements Result {
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BooleanResult)) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }
}
