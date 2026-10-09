package m00;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f40673b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f40674a;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.m.e(separator, "separator");
        f40673b = separator;
    }

    public a0(l bytes) {
        kotlin.jvm.internal.m.f(bytes, "bytes");
        this.f40674a = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = n00.c.a(this);
        l lVar = this.f40674a;
        if (iA == -1) {
            iA = 0;
        } else if (iA < lVar.e() && lVar.k(iA) == 92) {
            iA++;
        }
        int iE = lVar.e();
        int i11 = iA;
        while (iA < iE) {
            if (lVar.k(iA) == 47 || lVar.k(iA) == 92) {
                arrayList.add(lVar.r(i11, iA));
                i11 = iA + 1;
            }
            iA++;
        }
        if (i11 < lVar.e()) {
            arrayList.add(lVar.r(i11, lVar.e()));
        }
        return arrayList;
    }

    public final a0 b() {
        l lVar = n00.c.f43064d;
        l lVar2 = this.f40674a;
        if (kotlin.jvm.internal.m.a(lVar2, lVar)) {
            return null;
        }
        l lVar3 = n00.c.f43061a;
        if (kotlin.jvm.internal.m.a(lVar2, lVar3)) {
            return null;
        }
        l lVar4 = n00.c.f43062b;
        if (kotlin.jvm.internal.m.a(lVar2, lVar4)) {
            return null;
        }
        l suffix = n00.c.f43065e;
        lVar2.getClass();
        kotlin.jvm.internal.m.f(suffix, "suffix");
        int iE = lVar2.e();
        byte[] bArr = suffix.f40724a;
        if (lVar2.n(iE - bArr.length, suffix, bArr.length) && (lVar2.e() == 2 || lVar2.n(lVar2.e() - 3, lVar3, 1) || lVar2.n(lVar2.e() - 3, lVar4, 1))) {
            return null;
        }
        int iM = l.m(lVar2, lVar3);
        if (iM == -1) {
            iM = l.m(lVar2, lVar4);
        }
        if (iM == 2 && g() != null) {
            if (lVar2.e() == 3) {
                return null;
            }
            return new a0(l.s(lVar2, 0, 3, 1));
        }
        if (iM == 1 && lVar2.p(lVar4)) {
            return null;
        }
        if (iM != -1 || g() == null) {
            if (iM == -1) {
                return new a0(lVar);
            }
            return iM == 0 ? new a0(l.s(lVar2, 0, 1, 1)) : new a0(l.s(lVar2, 0, iM, 1));
        }
        if (lVar2.e() == 2) {
            return null;
        }
        return new a0(l.s(lVar2, 0, 2, 1));
    }

    public final a0 c(a0 other) {
        kotlin.jvm.internal.m.f(other, "other");
        l lVar = other.f40674a;
        int iA = n00.c.a(this);
        l lVar2 = this.f40674a;
        a0 a0Var = iA == -1 ? null : new a0(lVar2.r(0, iA));
        int iA2 = n00.c.a(other);
        if (!kotlin.jvm.internal.m.a(a0Var, iA2 != -1 ? new a0(lVar.r(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i11 = 0;
        while (i11 < iMin && kotlin.jvm.internal.m.a(arrayListA.get(i11), arrayListA2.get(i11))) {
            i11++;
        }
        if (i11 == iMin && lVar2.e() == lVar.e()) {
            return p20.c.m(".");
        }
        if (arrayListA2.subList(i11, arrayListA2.size()).indexOf(n00.c.f43065e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        if (kotlin.jvm.internal.m.a(lVar, n00.c.f43064d)) {
            return this;
        }
        i iVar = new i();
        l lVarC = n00.c.c(other);
        if (lVarC == null && (lVarC = n00.c.c(this)) == null) {
            lVarC = n00.c.f(f40673b);
        }
        int size = arrayListA2.size();
        for (int i12 = i11; i12 < size; i12++) {
            iVar.I(n00.c.f43065e);
            iVar.I(lVarC);
        }
        int size2 = arrayListA.size();
        while (i11 < size2) {
            iVar.I((l) arrayListA.get(i11));
            iVar.I(lVarC);
            i11++;
        }
        return n00.c.d(iVar, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        a0 other = (a0) obj;
        kotlin.jvm.internal.m.f(other, "other");
        return this.f40674a.compareTo(other.f40674a);
    }

    public final a0 e(String child) {
        kotlin.jvm.internal.m.f(child, "child");
        i iVar = new i();
        iVar.Y(child);
        return n00.c.b(this, n00.c.d(iVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a0) && kotlin.jvm.internal.m.a(((a0) obj).f40674a, this.f40674a);
    }

    public final Path f() {
        Path path = Paths.get(this.f40674a.v(), new String[0]);
        kotlin.jvm.internal.m.e(path, "get(...)");
        return path;
    }

    public final Character g() {
        l lVar = n00.c.f43061a;
        l lVar2 = this.f40674a;
        if (l.h(lVar2, lVar) != -1 || lVar2.e() < 2 || lVar2.k(1) != 58) {
            return null;
        }
        char cK = (char) lVar2.k(0);
        if (('a' > cK || cK >= '{') && ('A' > cK || cK >= '[')) {
            return null;
        }
        return Character.valueOf(cK);
    }

    public final int hashCode() {
        return this.f40674a.hashCode();
    }

    public final File toFile() {
        return new File(this.f40674a.v());
    }

    public final String toString() {
        return this.f40674a.v();
    }
}
