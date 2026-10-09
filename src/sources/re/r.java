package re;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookException;
import com.facebook.FacebookServiceException;
import java.util.Map;
import java.util.Set;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable {
    public final String H;
    public final FacebookException K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f49197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f49198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f49199f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f49200t;
    public static final q L = new q(0);
    public static final Parcelable.Creator<r> CREATOR = new j0(10);

    public r(int i11, int i12, int i13, String str, String str2, String str3, String str4, Object obj, FacebookException facebookException, boolean z11) {
        Set set;
        Set set2;
        Set set3;
        p pVar;
        this.f49194a = i11;
        this.f49195b = i12;
        this.f49196c = i13;
        this.f49197d = str;
        this.f49198e = str3;
        this.f49199f = str4;
        this.f49200t = obj;
        this.H = str2;
        q qVar = L;
        if (facebookException != null) {
            this.K = facebookException;
            pVar = p.OTHER;
        } else {
            this.K = new FacebookServiceException(this, a());
            lf.r rVarP = qVar.p();
            Map map = rVarP.f40112b;
            Map map2 = rVarP.f40113c;
            Map map3 = rVarP.f40111a;
            pVar = z11 ? p.TRANSIENT : (map3 != null && map3.containsKey(Integer.valueOf(i12)) && ((set3 = (Set) map3.get(Integer.valueOf(i12))) == null || set3.contains(Integer.valueOf(i13)))) ? p.OTHER : (map2 != null && map2.containsKey(Integer.valueOf(i12)) && ((set2 = (Set) map2.get(Integer.valueOf(i12))) == null || set2.contains(Integer.valueOf(i13)))) ? p.LOGIN_RECOVERABLE : (map != null && map.containsKey(Integer.valueOf(i12)) && ((set = (Set) map.get(Integer.valueOf(i12))) == null || set.contains(Integer.valueOf(i13)))) ? p.TRANSIENT : p.OTHER;
        }
        qVar.p();
        if (pVar == null) {
            return;
        }
        int i14 = lf.q.f40097a[pVar.ordinal()];
    }

    public final String a() {
        String str = this.H;
        if (str != null) {
            return str;
        }
        FacebookException facebookException = this.K;
        if (facebookException != null) {
            return facebookException.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str = "{HttpStatus: " + this.f49194a + ", errorCode: " + this.f49195b + ", subErrorCode: " + this.f49196c + ", errorType: " + this.f49197d + ", errorMessage: " + a() + "}";
        kotlin.jvm.internal.m.e(str, "StringBuilder(\"{HttpStat…(\"}\")\n        .toString()");
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.m.f(out, "out");
        out.writeInt(this.f49194a);
        out.writeInt(this.f49195b);
        out.writeInt(this.f49196c);
        out.writeString(this.f49197d);
        out.writeString(a());
        out.writeString(this.f49198e);
        out.writeString(this.f49199f);
    }

    public r(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc), false);
    }

    public r(int i11, String str, String str2) {
        this(-1, i11, -1, str, str2, null, null, null, null, false);
    }
}
