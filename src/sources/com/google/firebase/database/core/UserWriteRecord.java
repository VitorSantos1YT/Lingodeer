package com.google.firebase.database.core;

import com.google.firebase.database.snapshot.Node;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class UserWriteRecord {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f19358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Node f19359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CompoundWrite f19360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19361e;

    public UserWriteRecord(long j11, Path path, Node node, boolean z11) {
        this.f19357a = j11;
        this.f19358b = path;
        this.f19359c = node;
        this.f19360d = null;
        this.f19361e = z11;
    }

    public final CompoundWrite a() {
        CompoundWrite compoundWrite = this.f19360d;
        if (compoundWrite != null) {
            return compoundWrite;
        }
        throw new IllegalArgumentException("Can't access merge when write is an overwrite!");
    }

    public final Node b() {
        Node node = this.f19359c;
        if (node != null) {
            return node;
        }
        throw new IllegalArgumentException("Can't access overwrite when write is a merge!");
    }

    public final boolean c() {
        return this.f19359c != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UserWriteRecord.class != obj.getClass()) {
            return false;
        }
        UserWriteRecord userWriteRecord = (UserWriteRecord) obj;
        CompoundWrite compoundWrite = userWriteRecord.f19360d;
        Node node = userWriteRecord.f19359c;
        if (this.f19357a != userWriteRecord.f19357a || !this.f19358b.equals(userWriteRecord.f19358b) || this.f19361e != userWriteRecord.f19361e) {
            return false;
        }
        Node node2 = this.f19359c;
        if (node2 != null) {
            if (!node2.equals(node)) {
                return false;
            }
        } else if (node != null) {
            return false;
        }
        CompoundWrite compoundWrite2 = this.f19360d;
        if (compoundWrite2 != null) {
            return compoundWrite2.equals(compoundWrite);
        }
        return compoundWrite == null;
    }

    public final int hashCode() {
        int iHashCode = (this.f19358b.hashCode() + ((Boolean.valueOf(this.f19361e).hashCode() + (Long.valueOf(this.f19357a).hashCode() * 31)) * 31)) * 31;
        Node node = this.f19359c;
        int iHashCode2 = (iHashCode + (node != null ? node.hashCode() : 0)) * 31;
        CompoundWrite compoundWrite = this.f19360d;
        return iHashCode2 + (compoundWrite != null ? compoundWrite.hashCode() : 0);
    }

    public final String toString() {
        return "UserWriteRecord{id=" + this.f19357a + " path=" + this.f19358b + " visible=" + this.f19361e + " overwrite=" + this.f19359c + " merge=" + this.f19360d + "}";
    }

    public UserWriteRecord(long j11, Path path, CompoundWrite compoundWrite) {
        this.f19357a = j11;
        this.f19358b = path;
        this.f19359c = null;
        this.f19360d = compoundWrite;
        this.f19361e = true;
    }
}
