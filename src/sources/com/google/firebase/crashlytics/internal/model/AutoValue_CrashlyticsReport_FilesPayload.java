package com.google.firebase.crashlytics.internal.model;

import ep.a;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_FilesPayload extends CrashlyticsReport.FilesPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18647b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.FilesPayload.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f18648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18649b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload a() {
            List list = this.f18648a;
            if (list != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload(list, this.f18649b);
            }
            throw new IllegalStateException("Missing required properties: files");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder b(List list) {
            if (list == null) {
                throw new NullPointerException("Null files");
            }
            this.f18648a = list;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.Builder
        public final CrashlyticsReport.FilesPayload.Builder c(String str) {
            this.f18649b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload(List list, String str) {
        this.f18646a = list;
        this.f18647b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final List b() {
        return this.f18646a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload
    public final String c() {
        return this.f18647b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload)) {
            return false;
        }
        CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
        if (!this.f18646a.equals(filesPayload.b())) {
            return false;
        }
        String str = this.f18647b;
        if (str == null) {
            return filesPayload.c() == null;
        }
        return str.equals(filesPayload.c());
    }

    public final int hashCode() {
        int iHashCode = (this.f18646a.hashCode() ^ 1000003) * 1000003;
        String str = this.f18647b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f18646a);
        sb2.append(", orgId=");
        return a.k(sb2, this.f18647b, "}");
    }
}
