package w00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00.b f54368a = new z00.b();

    public static boolean k(f fVar, int i11) {
        CharSequence charSequence = fVar.f54383a.f289a;
        return fVar.f54390h < 4 && i11 < charSequence.length() && charSequence.charAt(i11) == '>';
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f54368a;
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        char cCharAt;
        int i11 = fVar.f54388f;
        if (!k(fVar, i11)) {
            return null;
        }
        int i12 = fVar.f54386d + fVar.f54390h;
        int i13 = i12 + 1;
        CharSequence charSequence = fVar.f54383a.f289a;
        int i14 = i11 + 1;
        if (i14 < charSequence.length() && ((cCharAt = charSequence.charAt(i14)) == '\t' || cCharAt == ' ')) {
            i13 = i12 + 2;
        }
        return new l8.h(-1, i13, false);
    }
}
