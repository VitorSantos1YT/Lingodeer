package com.google.firebase.database.core.view;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.snapshot.PriorityIndex;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class QuerySpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f19476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final QueryParams f19477b;

    public QuerySpec(Path path, QueryParams queryParams) {
        this.f19476a = path;
        this.f19477b = queryParams;
    }

    public static QuerySpec a(Path path) {
        return new QuerySpec(path, QueryParams.f19466i);
    }

    public final boolean b() {
        QueryParams queryParams = this.f19477b;
        return queryParams.h() && queryParams.f19473g.equals(PriorityIndex.f19553a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || QuerySpec.class != obj.getClass()) {
            return false;
        }
        QuerySpec querySpec = (QuerySpec) obj;
        return this.f19476a.equals(querySpec.f19476a) && this.f19477b.equals(querySpec.f19477b);
    }

    public final int hashCode() {
        return this.f19477b.hashCode() + (this.f19476a.hashCode() * 31);
    }

    public final String toString() {
        return this.f19476a + ":" + this.f19477b;
    }
}
