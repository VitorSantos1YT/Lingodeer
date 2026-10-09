package ca;

import java.util.Locale;
import kotlin.jvm.internal.m;
import oz.q;
import oz.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f6791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6792g;

    public i(int i11, int i12, String name, String type, String str, boolean z11) {
        m.f(name, "name");
        m.f(type, "type");
        this.f6786a = name;
        this.f6787b = type;
        this.f6788c = z11;
        this.f6789d = i11;
        this.f6790e = str;
        this.f6791f = i12;
        String upperCase = type.toUpperCase(Locale.ROOT);
        m.e(upperCase, "toUpperCase(...)");
        this.f6792g = q.v0(upperCase, "INT", false) ? 3 : (q.v0(upperCase, "CHAR", false) || q.v0(upperCase, "CLOB", false) || q.v0(upperCase, "TEXT", false)) ? 2 : q.v0(upperCase, "BLOB", false) ? 5 : (q.v0(upperCase, "REAL", false) || q.v0(upperCase, "FLOA", false) || q.v0(upperCase, "DOUB", false)) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof i) {
                boolean z11 = this.f6789d > 0;
                i iVar = (i) obj;
                int i11 = iVar.f6791f;
                if (z11 == (iVar.f6789d > 0) && m.a(this.f6786a, iVar.f6786a) && this.f6788c == iVar.f6788c) {
                    String str = iVar.f6790e;
                    int i12 = this.f6791f;
                    String str2 = this.f6790e;
                    if ((i12 != 1 || i11 != 2 || str2 == null || ff.h.j(str2, str)) && ((i12 != 2 || i11 != 1 || str == null || ff.h.j(str, str2)) && ((i12 == 0 || i12 != i11 || (str2 == null ? str == null : ff.h.j(str2, str))) && this.f6792g == iVar.f6792g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f6786a.hashCode() * 31) + this.f6792g) * 31) + (this.f6788c ? 1231 : 1237)) * 31) + this.f6789d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n            |Column {\n            |   name = '");
        sb2.append(this.f6786a);
        sb2.append("',\n            |   type = '");
        sb2.append(this.f6787b);
        sb2.append("',\n            |   affinity = '");
        sb2.append(this.f6792g);
        sb2.append("',\n            |   notNull = '");
        sb2.append(this.f6788c);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(this.f6789d);
        sb2.append("',\n            |   defaultValue = '");
        String str = this.f6790e;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return r.e0(r.h0(sb2.toString()), "    ");
    }
}
