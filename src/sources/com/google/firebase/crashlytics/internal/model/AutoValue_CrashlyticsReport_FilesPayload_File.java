package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_FilesPayload_File extends CrashlyticsReport.FilesPayload.File {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18651b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.FilesPayload.File.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f18653b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File a() {
            byte[] bArr;
            String str = this.f18652a;
            if (str != null && (bArr = this.f18653b) != null) {
                return new AutoValue_CrashlyticsReport_FilesPayload_File(bArr, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18652a == null) {
                sb2.append(" filename");
            }
            if (this.f18653b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f18653b = bArr;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.Builder
        public final CrashlyticsReport.FilesPayload.File.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f18652a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_FilesPayload_File(byte[] bArr, String str) {
        this.f18650a = str;
        this.f18651b = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final byte[] b() {
        return this.f18651b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File
    public final String c() {
        return this.f18650a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.FilesPayload.File)) {
            return false;
        }
        CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
        if (this.f18650a.equals(file.c())) {
            return Arrays.equals(this.f18651b, file instanceof AutoValue_CrashlyticsReport_FilesPayload_File ? ((AutoValue_CrashlyticsReport_FilesPayload_File) file).f18651b : file.b());
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18650a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f18651b);
    }

    public final String toString() {
        return "File{filename=" + this.f18650a + ", contents=" + Arrays.toString(this.f18651b) + "}";
    }
}
