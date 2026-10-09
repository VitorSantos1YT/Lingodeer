package o3;

import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f44678g = new j(false, 0, true, 1, 1, q3.b.f47418c);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f44679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f44681c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f44682d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f44683e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3.b f44684f;

    public j(boolean z11, int i11, boolean z12, int i12, int i13, q3.b bVar) {
        this.f44679a = z11;
        this.f44680b = i11;
        this.f44681c = z12;
        this.f44682d = i12;
        this.f44683e = i13;
        this.f44684f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f44679a == jVar.f44679a && this.f44680b == jVar.f44680b && this.f44681c == jVar.f44681c && this.f44682d == jVar.f44682d && this.f44683e == jVar.f44683e && kotlin.jvm.internal.m.a(this.f44684f, jVar.f44684f);
    }

    public final int hashCode() {
        return this.f44684f.f47419a.hashCode() + defpackage.e.b(this.f44683e, defpackage.e.b(this.f44682d, defpackage.e.e(defpackage.e.b(this.f44680b, Boolean.hashCode(this.f44679a) * 31, 31), 31, this.f44681c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ImeOptions(singleLine=");
        sb2.append(this.f44679a);
        sb2.append(", capitalization=");
        int i11 = this.f44680b;
        if (i11 == -1) {
            str = "Unspecified";
        } else if (i11 == 0) {
            str = scqhIrGXy.nxZzGCdeKLHuzW;
        } else if (i11 == 1) {
            str = "Characters";
        } else if (i11 == 2) {
            str = "Words";
        } else {
            str = i11 == 3 ? "Sentences" : "Invalid";
        }
        sb2.append((Object) str);
        sb2.append(", autoCorrect=");
        sb2.append(this.f44681c);
        sb2.append(", keyboardType=");
        sb2.append((Object) k.a(this.f44682d));
        sb2.append(", imeAction=");
        sb2.append((Object) i.a(this.f44683e));
        sb2.append(", platformImeOptions=null, hintLocales=");
        sb2.append(this.f44684f);
        sb2.append(')');
        return sb2.toString();
    }
}
