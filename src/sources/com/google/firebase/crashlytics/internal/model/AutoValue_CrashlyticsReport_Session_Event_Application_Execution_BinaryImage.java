package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18750d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f18751a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18752b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18753c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f18754d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f18755e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage a() {
            String str;
            if (this.f18755e == 3 && (str = this.f18753c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(this.f18751a, this.f18752b, str, this.f18754d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f18755e & 1) == 0) {
                sb2.append(" baseAddress");
            }
            if ((this.f18755e & 2) == 0) {
                sb2.append(" size");
            }
            if (this.f18753c == null) {
                sb2.append(" name");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder b(long j11) {
            this.f18751a = j11;
            this.f18755e = (byte) (this.f18755e | 1);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f18753c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder d(long j11) {
            this.f18752b = j11;
            this.f18755e = (byte) (this.f18755e | 2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder
        public final CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder e(String str) {
            this.f18754d = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_Application_Execution_BinaryImage(long j11, long j12, String str, String str2) {
        this.f18747a = j11;
        this.f18748b = j12;
        this.f18749c = str;
        this.f18750d = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long b() {
        return this.f18747a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String c() {
        return this.f18749c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final long d() {
        return this.f18748b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Execution.BinaryImage
    public final String e() {
        return this.f18750d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application.Execution.BinaryImage)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        if (this.f18747a != binaryImage.b() || this.f18748b != binaryImage.d() || !this.f18749c.equals(binaryImage.c())) {
            return false;
        }
        String str = this.f18750d;
        if (str == null) {
            return binaryImage.e() == null;
        }
        return str.equals(binaryImage.e());
    }

    public final int hashCode() {
        long j11 = this.f18747a;
        long j12 = this.f18748b;
        int iHashCode = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f18749c.hashCode()) * 1000003;
        String str = this.f18750d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f18747a);
        sb2.append(", size=");
        sb2.append(this.f18748b);
        sb2.append(", name=");
        sb2.append(this.f18749c);
        sb2.append(", uuid=");
        return a.k(sb2, this.f18750d, "}");
    }
}
