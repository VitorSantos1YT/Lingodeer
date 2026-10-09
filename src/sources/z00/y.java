package z00;

import hh.p0;
import java.util.Objects;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f58453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f58454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f58455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f58456d;

    public y(int i11, int i12, int i13, int i14) {
        if (i11 < 0) {
            throw new IllegalArgumentException(p0.h(i11, "lineIndex ", " must be >= 0"));
        }
        if (i12 < 0) {
            throw new IllegalArgumentException(p0.h(i12, "columnIndex ", " must be >= 0"));
        }
        if (i13 < 0) {
            throw new IllegalArgumentException(p0.h(i13, "inputIndex ", " must be >= 0"));
        }
        if (i14 < 0) {
            throw new IllegalArgumentException(p0.h(i14, "length ", " must be >= 0"));
        }
        this.f58453a = i11;
        this.f58454b = i12;
        this.f58455c = i13;
        this.f58456d = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f58453a == yVar.f58453a && this.f58454b == yVar.f58454b && this.f58455c == yVar.f58455c && this.f58456d == yVar.f58456d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f58453a), Integer.valueOf(this.f58454b), Integer.valueOf(this.f58455c), Integer.valueOf(this.f58456d));
    }

    public final String toString() {
        StringBuilder sbK = w4.c.k("SourceSpan{line=", this.f58453a, ", column=", this.f58454b, ", input=");
        sbK.append(this.f58455c);
        sbK.append(", length=");
        sbK.append(this.f58456d);
        sbK.append("}");
        return sbK.toString();
    }

    public final y a(int i11, int i12) {
        if (i11 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i11, "beginIndex ", " + must be >= 0"));
        }
        int i13 = this.f58456d;
        if (i11 > i13) {
            throw new IndexOutOfBoundsException(nv.p.p("beginIndex ", i11, i13, " must be <= length "));
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException(p0.h(i12, "endIndex ", " + must be >= 0"));
        }
        if (i12 > i13) {
            throw new IndexOutOfBoundsException(nv.p.p("endIndex ", i12, i13, " must be <= length "));
        }
        if (i11 > i12) {
            throw new IndexOutOfBoundsException(nv.p.p("beginIndex ", i11, i12, HOBXIlHxIkMBEA.nYy));
        }
        if (i11 == 0 && i12 == i13) {
            return this;
        }
        return new y(this.f58453a, this.f58454b + i11, this.f58455c + i11, i12 - i11);
    }
}
