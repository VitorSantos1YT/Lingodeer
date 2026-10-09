package tf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import lf.v0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new b(7);
    public final String H;
    public final String K;
    public String L;
    public boolean M;
    public final h0 N;
    public boolean O;
    public boolean P;
    public final String Q;
    public final String R;
    public final String S;
    public final a T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f52214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f52215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f52216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f52217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f52218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52219f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f52220t;

    public t(s loginBehavior, Set set, e defaultAudience, String str, String str2, String str3, h0 h0Var, String str4, String str5, String str6, a aVar) {
        kotlin.jvm.internal.m.f(loginBehavior, "loginBehavior");
        kotlin.jvm.internal.m.f(defaultAudience, "defaultAudience");
        this.f52214a = loginBehavior;
        this.f52215b = set;
        this.f52216c = defaultAudience;
        this.H = str;
        this.f52217d = str2;
        this.f52218e = str3;
        this.N = h0Var == null ? h0.FACEBOOK : h0Var;
        if (str4 == null || str4.length() == 0) {
            String string = UUID.randomUUID().toString();
            kotlin.jvm.internal.m.e(string, "randomUUID().toString()");
            this.Q = string;
        } else {
            this.Q = str4;
        }
        this.R = str5;
        this.S = str6;
        this.T = aVar;
    }

    public final boolean a() {
        for (String str : this.f52215b) {
            c0 c0Var = d0.f52154i;
            if (str != null && (oz.x.s0(str, "publish", false) || oz.x.s0(str, "manage", false) || d0.f52155j.contains(str))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.m.f(dest, "dest");
        dest.writeString(this.f52214a.name());
        dest.writeStringList(new ArrayList(this.f52215b));
        dest.writeString(this.f52216c.name());
        dest.writeString(this.f52217d);
        dest.writeString(this.f52218e);
        dest.writeByte(this.f52219f ? (byte) 1 : (byte) 0);
        dest.writeString(this.f52220t);
        dest.writeString(this.H);
        dest.writeString(this.K);
        dest.writeString(this.L);
        dest.writeByte(this.M ? (byte) 1 : (byte) 0);
        dest.writeString(this.N.name());
        dest.writeByte(this.O ? (byte) 1 : (byte) 0);
        dest.writeByte(this.P ? (byte) 1 : (byte) 0);
        dest.writeString(this.Q);
        dest.writeString(this.R);
        dest.writeString(this.S);
        a aVar = this.T;
        dest.writeString(aVar != null ? aVar.name() : null);
    }

    public t(Parcel parcel) {
        e eVarValueOf;
        h0 h0VarValueOf;
        String string = parcel.readString();
        v0.k(string, "loginBehavior");
        this.f52214a = s.valueOf(string);
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f52215b = new HashSet(arrayList);
        String string2 = parcel.readString();
        if (string2 != null) {
            eVarValueOf = e.valueOf(string2);
        } else {
            eVarValueOf = e.NONE;
        }
        this.f52216c = eVarValueOf;
        String string3 = parcel.readString();
        v0.k(string3, "applicationId");
        this.f52217d = string3;
        String string4 = parcel.readString();
        v0.k(string4, "authId");
        this.f52218e = string4;
        this.f52219f = parcel.readByte() != 0;
        this.f52220t = parcel.readString();
        String string5 = parcel.readString();
        v0.k(string5, "authType");
        this.H = string5;
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readByte() != 0;
        String string6 = parcel.readString();
        if (string6 != null) {
            h0VarValueOf = h0.valueOf(string6);
        } else {
            h0VarValueOf = h0.FACEBOOK;
        }
        this.N = h0VarValueOf;
        this.O = parcel.readByte() != 0;
        this.P = parcel.readByte() != 0;
        String string7 = parcel.readString();
        v0.k(string7, "nonce");
        this.Q = string7;
        this.R = parcel.readString();
        this.S = parcel.readString();
        String string8 = parcel.readString();
        this.T = string8 != null ? a.valueOf(string8) : null;
    }
}
