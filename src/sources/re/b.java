package re;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import lf.v0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public final String H;
    public final String K;
    public final Date L;
    public final String M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f49115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f49116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f49117c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f49118d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f49120f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Date f49121t;
    public static final Date N = new Date(Long.MAX_VALUE);
    public static final Date O = new Date();
    public static final g P = g.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<b> CREATOR = new j0(6);

    public b(String accessToken, String applicationId, String userId, Collection collection, Collection collection2, Collection collection3, g gVar, Date date, Date date2, Date date3, String str) {
        kotlin.jvm.internal.m.f(accessToken, "accessToken");
        kotlin.jvm.internal.m.f(applicationId, "applicationId");
        kotlin.jvm.internal.m.f(userId, "userId");
        v0.i(accessToken, "accessToken");
        v0.i(applicationId, "applicationId");
        v0.i(userId, "userId");
        Date date4 = N;
        this.f49115a = date == null ? date4 : date;
        Set setUnmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        kotlin.jvm.internal.m.e(setUnmodifiableSet, "unmodifiableSet(if (perm…missions) else HashSet())");
        this.f49116b = setUnmodifiableSet;
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        kotlin.jvm.internal.m.e(setUnmodifiableSet2, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f49117c = setUnmodifiableSet2;
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        kotlin.jvm.internal.m.e(setUnmodifiableSet3, "unmodifiableSet(\n       …missions) else HashSet())");
        this.f49118d = setUnmodifiableSet3;
        this.f49119e = accessToken;
        gVar = gVar == null ? P : gVar;
        if (str != null && str.equals("instagram")) {
            int i11 = a.f49109a[gVar.ordinal()];
            if (i11 == 1) {
                gVar = g.INSTAGRAM_APPLICATION_WEB;
            } else if (i11 == 2) {
                gVar = g.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i11 == 3) {
                gVar = g.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f49120f = gVar;
        this.f49121t = date2 == null ? O : date2;
        this.H = applicationId;
        this.K = userId;
        this.L = (date3 == null || date3.getTime() == 0) ? date4 : date3;
        this.M = str == null ? "facebook" : str;
    }

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f49119e);
        jSONObject.put("expires_at", this.f49115a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f49116b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f49117c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f49118d));
        jSONObject.put("last_refresh", this.f49121t.getTime());
        jSONObject.put("source", this.f49120f.name());
        jSONObject.put("application_id", this.H);
        jSONObject.put("user_id", this.K);
        jSONObject.put("data_access_expiration_time", this.L.getTime());
        String str = this.M;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        boolean zA;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.M;
        if (kotlin.jvm.internal.m.a(this.f49115a, bVar.f49115a) && kotlin.jvm.internal.m.a(this.f49116b, bVar.f49116b) && kotlin.jvm.internal.m.a(this.f49117c, bVar.f49117c) && kotlin.jvm.internal.m.a(this.f49118d, bVar.f49118d) && kotlin.jvm.internal.m.a(this.f49119e, bVar.f49119e) && this.f49120f == bVar.f49120f && kotlin.jvm.internal.m.a(this.f49121t, bVar.f49121t) && kotlin.jvm.internal.m.a(this.H, bVar.H) && kotlin.jvm.internal.m.a(this.K, bVar.K) && kotlin.jvm.internal.m.a(this.L, bVar.L)) {
            String str2 = this.M;
            if (str2 == null) {
                zA = str == null;
            } else {
                zA = kotlin.jvm.internal.m.a(str2, str);
            }
            if (zA) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.L.hashCode() + defpackage.e.d(defpackage.e.d((this.f49121t.hashCode() + ((this.f49120f.hashCode() + defpackage.e.d((this.f49118d.hashCode() + ((this.f49117c.hashCode() + ((this.f49116b.hashCode() + ((this.f49115a.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31, this.f49119e)) * 31)) * 31, 31, this.H), 31, this.K)) * 31;
        String str = this.M;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{AccessToken token:ACCESS_TOKEN_REMOVED permissions:[");
        s.i(d0.INCLUDE_ACCESS_TOKENS);
        sb2.append(TextUtils.join(", ", this.f49116b));
        sb2.append("]}");
        String string = sb2.toString();
        kotlin.jvm.internal.m.e(string, "builder.toString()");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeLong(this.f49115a.getTime());
        dest.writeStringList(new ArrayList(this.f49116b));
        dest.writeStringList(new ArrayList(this.f49117c));
        dest.writeStringList(new ArrayList(this.f49118d));
        dest.writeString(this.f49119e);
        dest.writeString(this.f49120f.name());
        dest.writeLong(this.f49121t.getTime());
        dest.writeString(this.H);
        dest.writeString(this.K);
        dest.writeLong(this.L.getTime());
        dest.writeString(this.M);
    }

    public b(Parcel parcel) {
        g gVarValueOf;
        this.f49115a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.m.e(setUnmodifiableSet, "unmodifiableSet(HashSet(permissionsList))");
        this.f49116b = setUnmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.m.e(setUnmodifiableSet2, "unmodifiableSet(HashSet(permissionsList))");
        this.f49117c = setUnmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList);
        Set setUnmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList));
        kotlin.jvm.internal.m.e(setUnmodifiableSet3, "unmodifiableSet(HashSet(permissionsList))");
        this.f49118d = setUnmodifiableSet3;
        String string = parcel.readString();
        v0.k(string, "token");
        this.f49119e = string;
        String string2 = parcel.readString();
        if (string2 != null) {
            gVarValueOf = g.valueOf(string2);
        } else {
            gVarValueOf = P;
        }
        this.f49120f = gVarValueOf;
        this.f49121t = new Date(parcel.readLong());
        String string3 = parcel.readString();
        v0.k(string3, "applicationId");
        this.H = string3;
        String string4 = parcel.readString();
        v0.k(string4, "userId");
        this.K = string4;
        this.L = new Date(parcel.readLong());
        this.M = parcel.readString();
    }
}
