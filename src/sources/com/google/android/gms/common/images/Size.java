package com.google.android.gms.common.images;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Size {
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(String.valueOf(0).length() + 1 + String.valueOf(0).length());
        sb2.append("0x0");
        return sb2.toString();
    }
}
