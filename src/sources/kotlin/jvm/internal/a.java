package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class a implements h, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f38343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f38346e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f38347f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f38348t;

    public a(int i11, int i12, Class cls, Object obj, String str, String str2) {
        this.f38342a = obj;
        this.f38343b = cls;
        this.f38344c = str;
        this.f38345d = str2;
        this.f38347f = i11;
        this.f38348t = i12 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f38346e == aVar.f38346e && this.f38347f == aVar.f38347f && this.f38348t == aVar.f38348t && m.a(this.f38342a, aVar.f38342a) && this.f38343b.equals(aVar.f38343b) && this.f38344c.equals(aVar.f38344c) && this.f38345d.equals(aVar.f38345d);
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return this.f38347f;
    }

    public final int hashCode() {
        Object obj = this.f38342a;
        return ((((defpackage.e.d(defpackage.e.d((this.f38343b.hashCode() + ((obj != null ? obj.hashCode() : 0) * 31)) * 31, 31, this.f38344c), 31, this.f38345d) + (this.f38346e ? 1231 : 1237)) * 31) + this.f38347f) * 31) + this.f38348t;
    }

    public final String toString() {
        z.f38362a.getClass();
        return a0.a(this);
    }
}
