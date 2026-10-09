package com.google.firebase.database.core.utilities;

import com.google.firebase.database.core.Path;
import com.google.firebase.database.core.RepoInfo;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ParsedUrl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RepoInfo f19423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Path f19424b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParsedUrl.class != obj.getClass()) {
            return false;
        }
        ParsedUrl parsedUrl = (ParsedUrl) obj;
        if (this.f19423a.equals(parsedUrl.f19423a)) {
            return this.f19424b.equals(parsedUrl.f19424b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f19424b.hashCode() + (this.f19423a.hashCode() * 31);
    }
}
