package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReportWithSessionId extends CrashlyticsReportWithSessionId {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport f18238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f18240c;

    public AutoValue_CrashlyticsReportWithSessionId(CrashlyticsReport crashlyticsReport, String str, File file) {
        if (crashlyticsReport == null) {
            throw new NullPointerException("Null report");
        }
        this.f18238a = crashlyticsReport;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f18239b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f18240c = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final CrashlyticsReport a() {
        return this.f18238a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final File b() {
        return this.f18240c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId
    public final String c() {
        return this.f18239b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReportWithSessionId)) {
            return false;
        }
        CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = (CrashlyticsReportWithSessionId) obj;
        return this.f18238a.equals(crashlyticsReportWithSessionId.a()) && this.f18239b.equals(crashlyticsReportWithSessionId.c()) && this.f18240c.equals(crashlyticsReportWithSessionId.b());
    }

    public final int hashCode() {
        return ((((this.f18238a.hashCode() ^ 1000003) * 1000003) ^ this.f18239b.hashCode()) * 1000003) ^ this.f18240c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f18238a + ", sessionId=" + this.f18239b + ", reportFile=" + this.f18240c + "}";
    }
}
