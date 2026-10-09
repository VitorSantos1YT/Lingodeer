package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import ep.a;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_CustomAttribute extends CrashlyticsReport.CustomAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18643b;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.CustomAttribute.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18645b;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute a() {
            String str;
            String str2 = this.f18644a;
            if (str2 != null && (str = this.f18645b) != null) {
                return new AutoValue_CrashlyticsReport_CustomAttribute(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18644a == null) {
                sb2.append(" key");
            }
            if (this.f18645b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f18644a = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute.Builder
        public final CrashlyticsReport.CustomAttribute.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f18645b = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_CustomAttribute(String str, String str2) {
        this.f18642a = str;
        this.f18643b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String b() {
        return this.f18642a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.CustomAttribute
    public final String c() {
        return this.f18643b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.CustomAttribute)) {
            return false;
        }
        CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
        return this.f18642a.equals(customAttribute.b()) && this.f18643b.equals(customAttribute.c());
    }

    public final int hashCode() {
        return ((this.f18642a.hashCode() ^ 1000003) * 1000003) ^ this.f18643b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f18642a);
        sb2.append(", value=");
        return a.k(sb2, this.f18643b, "}");
    }
}
