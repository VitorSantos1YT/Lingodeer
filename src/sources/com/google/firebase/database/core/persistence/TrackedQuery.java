package com.google.firebase.database.core.persistence;

import com.google.firebase.database.core.view.QuerySpec;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class TrackedQuery {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QuerySpec f19402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f19403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f19404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f19405e;

    public TrackedQuery(long j11, QuerySpec querySpec, long j12, boolean z11, boolean z12) {
        this.f19401a = j11;
        if (querySpec.f19477b.h() && !querySpec.b()) {
            throw new IllegalArgumentException("Can't create TrackedQuery for a non-default query that loads all data");
        }
        this.f19402b = querySpec;
        this.f19403c = j12;
        this.f19404d = z11;
        this.f19405e = z12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == TrackedQuery.class) {
            TrackedQuery trackedQuery = (TrackedQuery) obj;
            if (this.f19401a == trackedQuery.f19401a && this.f19402b.equals(trackedQuery.f19402b) && this.f19403c == trackedQuery.f19403c && this.f19404d == trackedQuery.f19404d && this.f19405e == trackedQuery.f19405e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f19405e).hashCode() + ((Boolean.valueOf(this.f19404d).hashCode() + ((Long.valueOf(this.f19403c).hashCode() + ((this.f19402b.hashCode() + (Long.valueOf(this.f19401a).hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrackedQuery{id=");
        sb2.append(this.f19401a);
        sb2.append(", querySpec=");
        sb2.append(this.f19402b);
        sb2.append(", lastUse=");
        sb2.append(this.f19403c);
        sb2.append(", complete=");
        sb2.append(this.f19404d);
        sb2.append(", active=");
        return p0.p(sb2, this.f19405e, "}");
    }
}
