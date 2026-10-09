package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18638c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18641c;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch a() {
            String str;
            String str2;
            String str3 = this.f18639a;
            if (str3 != null && (str = this.f18640b) != null && (str2 = this.f18641c) != null) {
                return new AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18639a == null) {
                sb2.append(" arch");
            }
            if (this.f18640b == null) {
                sb2.append(" libraryName");
            }
            if (this.f18641c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f18639a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f18641c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder
        public final CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.Builder d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f18640b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_ApplicationExitInfo_BuildIdMappingForArch(String str, String str2, String str3) {
        this.f18636a = str;
        this.f18637b = str2;
        this.f18638c = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String b() {
        return this.f18636a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String c() {
        return this.f18638c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch
    public final String d() {
        return this.f18637b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch)) {
            return false;
        }
        CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch = (CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch) obj;
        return this.f18636a.equals(buildIdMappingForArch.b()) && this.f18637b.equals(buildIdMappingForArch.d()) && this.f18638c.equals(buildIdMappingForArch.c());
    }

    public final int hashCode() {
        return ((((this.f18636a.hashCode() ^ 1000003) * 1000003) ^ this.f18637b.hashCode()) * 1000003) ^ this.f18638c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f18636a);
        sb2.append(", libraryName=");
        sb2.append(this.f18637b);
        sb2.append(", buildId=");
        return a.k(sb2, this.f18638c, "}");
    }
}
