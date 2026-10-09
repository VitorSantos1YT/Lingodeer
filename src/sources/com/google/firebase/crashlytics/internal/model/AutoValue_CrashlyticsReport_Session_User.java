package com.google.firebase.crashlytics.internal.model;

import com.google.type.bACG.scNRoQgKSYX;
import ep.a;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class AutoValue_CrashlyticsReport_Session_User extends CrashlyticsReport.Session.User {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18840a;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder extends CrashlyticsReport.Session.User.Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f18841a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User a() {
            String str = this.f18841a;
            if (str != null) {
                return new AutoValue_CrashlyticsReport_Session_User(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User.Builder
        public final CrashlyticsReport.Session.User.Builder b(String str) {
            if (str == null) {
                throw new NullPointerException(PQgum.QnNMiXDkwBwbl);
            }
            this.f18841a = str;
            return this;
        }
    }

    public AutoValue_CrashlyticsReport_Session_User(String str) {
        this.f18840a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.User
    public final String b() {
        return this.f18840a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.User) {
            return this.f18840a.equals(((CrashlyticsReport.Session.User) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f18840a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return a.k(new StringBuilder(scNRoQgKSYX.QeRFEJ), this.f18840a, "}");
    }
}
