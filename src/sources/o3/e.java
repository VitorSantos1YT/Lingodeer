package o3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f44673b;

    public e(int i11, int i12) {
        this.f44672a = i11;
        this.f44673b = i12;
        if (i11 >= 0 && i12 >= 0) {
            return;
        }
        p3.a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i11 + " and " + i12 + " respectively.");
    }

    @Override // o3.g
    public final void a(b7.p pVar) {
        int i11 = pVar.f4017c;
        ar.f fVar = (ar.f) pVar.f4020f;
        int i12 = this.f44673b;
        int iE = i11 + i12;
        if (((i11 ^ iE) & (i12 ^ iE)) < 0) {
            iE = fVar.e();
        }
        pVar.b(pVar.f4017c, Math.min(iE, fVar.e()));
        int i13 = pVar.f4016b;
        int i14 = this.f44672a;
        int i15 = i13 - i14;
        if (((i13 ^ i15) & (i14 ^ i13)) < 0) {
            i15 = 0;
        }
        pVar.b(Math.max(0, i15), pVar.f4016b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f44672a == eVar.f44672a && this.f44673b == eVar.f44673b;
    }

    public final int hashCode() {
        return (this.f44672a * 31) + this.f44673b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f44672a);
        sb2.append(", lengthAfterCursor=");
        return ep.a.j(sb2, this.f44673b, ')');
    }
}
