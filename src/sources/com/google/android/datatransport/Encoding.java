package com.google.android.datatransport;

import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class Encoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7804a;

    public Encoding(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f7804a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f7804a.equals(((Encoding) obj).f7804a);
    }

    public final int hashCode() {
        return this.f7804a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.k(new StringBuilder("Encoding{name=\""), this.f7804a, "\"}");
    }
}
