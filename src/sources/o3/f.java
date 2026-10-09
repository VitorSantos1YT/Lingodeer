package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44676b;

    public f(int i11, int i12) {
        this.f44675a = i11;
        this.f44676b = i12;
        if (i11 >= 0 && i12 >= 0) {
            return;
        }
        p3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
    }

    @Override // o3.g
    public final void a(b7.p pVar) {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f44675a; i12++) {
            int i13 = i11 + 1;
            int i14 = pVar.f4016b;
            if (i14 <= i13) {
                i11 = i14;
                break;
            }
            i11 = (Character.isHighSurrogate(pVar.c((i14 - i13) + (-1))) && Character.isLowSurrogate(pVar.c(pVar.f4016b - i13))) ? i11 + 2 : i13;
        }
        int iE = 0;
        for (int i15 = 0; i15 < this.f44676b; i15++) {
            int i16 = iE + 1;
            int i17 = pVar.f4017c;
            ar.f fVar = (ar.f) pVar.f4020f;
            if (i17 + i16 >= fVar.e()) {
                iE = fVar.e() - pVar.f4017c;
                break;
            }
            iE = (Character.isHighSurrogate(pVar.c((pVar.f4017c + i16) + (-1))) && Character.isLowSurrogate(pVar.c(pVar.f4017c + i16))) ? iE + 2 : i16;
        }
        int i18 = pVar.f4017c;
        pVar.b(i18, iE + i18);
        int i19 = pVar.f4016b;
        pVar.b(i19 - i11, i19);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f44675a == fVar.f44675a && this.f44676b == fVar.f44676b;
    }

    public final int hashCode() {
        return (this.f44675a * 31) + this.f44676b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f44675a);
        sb2.append(", lengthAfterCursor=");
        return ep.a.j(sb2, this.f44676b, ')');
    }
}
