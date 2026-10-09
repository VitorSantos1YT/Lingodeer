package com.google.firebase.database.core;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Tag {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19355a;

    public Tag(long j11) {
        this.f19355a = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Tag.class == obj.getClass() && this.f19355a == ((Tag) obj).f19355a;
    }

    public final int hashCode() {
        long j11 = this.f19355a;
        return (int) (j11 ^ (j11 >>> 32));
    }

    public final String toString() {
        return "Tag{tagNumber=" + this.f19355a + '}';
    }
}
