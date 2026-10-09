package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17737g;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f17738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f17739b;
    }

    public FirebaseOptions(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i11 = Strings.f9128a;
        Preconditions.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.f17732b = str;
        this.f17731a = str2;
        this.f17733c = str3;
        this.f17734d = str4;
        this.f17735e = str5;
        this.f17736f = str6;
        this.f17737g = str7;
    }

    public static FirebaseOptions a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String strA = stringResourceValueReader.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new FirebaseOptions(strA, stringResourceValueReader.a("google_api_key"), stringResourceValueReader.a("firebase_database_url"), stringResourceValueReader.a("ga_trackingId"), stringResourceValueReader.a("gcm_defaultSenderId"), stringResourceValueReader.a("google_storage_bucket"), stringResourceValueReader.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseOptions)) {
            return false;
        }
        FirebaseOptions firebaseOptions = (FirebaseOptions) obj;
        return Objects.a(this.f17732b, firebaseOptions.f17732b) && Objects.a(this.f17731a, firebaseOptions.f17731a) && Objects.a(this.f17733c, firebaseOptions.f17733c) && Objects.a(this.f17734d, firebaseOptions.f17734d) && Objects.a(this.f17735e, firebaseOptions.f17735e) && Objects.a(this.f17736f, firebaseOptions.f17736f) && Objects.a(this.f17737g, firebaseOptions.f17737g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17732b, this.f17731a, this.f17733c, this.f17734d, this.f17735e, this.f17736f, this.f17737g});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        toStringHelper.a(this.f17732b, "applicationId");
        toStringHelper.a(this.f17731a, "apiKey");
        toStringHelper.a(this.f17733c, "databaseUrl");
        toStringHelper.a(this.f17735e, "gcmSenderId");
        toStringHelper.a(this.f17736f, "storageBucket");
        toStringHelper.a(this.f17737g, "projectId");
        return toStringHelper.toString();
    }
}
