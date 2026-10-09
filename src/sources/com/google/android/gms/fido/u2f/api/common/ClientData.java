package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ClientData {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Builder implements Cloneable {
        public Builder() {
            Parcelable.Creator<ChannelIdValue> creator = ChannelIdValue.CREATOR;
        }

        public final Object clone() {
            return new Builder();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClientData) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }
}
