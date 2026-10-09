package com.google.firebase.crashlytics.internal.model;

import com.google.android.material.datepicker.d;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment extends CrashlyticsReport.Session.Event.RolloutAssignment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f18816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18819d;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutAssignment.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant f18820a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f18821b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f18822c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f18823d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f18824e;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment a() {
            CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant;
            String str;
            String str2;
            if (this.f18824e == 1 && (rolloutVariant = this.f18820a) != null && (str = this.f18821b) != null && (str2 = this.f18822c) != null) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(rolloutVariant, str, str2, this.f18823d);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f18820a == null) {
                sb2.append(" rolloutVariant");
            }
            if (this.f18821b == null) {
                sb2.append(" parameterKey");
            }
            if (this.f18822c == null) {
                sb2.append(" parameterValue");
            }
            if ((1 & this.f18824e) == 0) {
                sb2.append(" templateVersion");
            }
            throw new IllegalStateException(d.k(sb2, "Missing required properties:"));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f18821b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f18822c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder d(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant) {
            if (rolloutVariant == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f18820a = rolloutVariant;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment.Builder
        public final CrashlyticsReport.Session.Event.RolloutAssignment.Builder e(long j11) {
            this.f18823d = j11;
            this.f18824e = (byte) (this.f18824e | 1);
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, String str, String str2, long j11) {
        this.f18816a = rolloutVariant;
        this.f18817b = str;
        this.f18818c = str2;
        this.f18819d = j11;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String b() {
        return this.f18817b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final String c() {
        return this.f18818c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant d() {
        return this.f18816a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutAssignment
    public final long e() {
        return this.f18819d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.RolloutAssignment)) {
            return false;
        }
        CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment = (CrashlyticsReport.Session.Event.RolloutAssignment) obj;
        return this.f18816a.equals(rolloutAssignment.d()) && this.f18817b.equals(rolloutAssignment.b()) && this.f18818c.equals(rolloutAssignment.c()) && this.f18819d == rolloutAssignment.e();
    }

    public final int hashCode() {
        int iHashCode = (((((this.f18816a.hashCode() ^ 1000003) * 1000003) ^ this.f18817b.hashCode()) * 1000003) ^ this.f18818c.hashCode()) * 1000003;
        long j11 = this.f18819d;
        return iHashCode ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb2.append(this.f18816a);
        sb2.append(", parameterKey=");
        sb2.append(this.f18817b);
        sb2.append(", parameterValue=");
        sb2.append(this.f18818c);
        sb2.append(", templateVersion=");
        return e.i(this.f18819d, "}", sb2);
    }
}
