package w00;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z00.i f54402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f54403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54404c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f54405d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final StringBuilder f54406e;

    public g(int i11, int i12, char c11) {
        z00.i iVar = new z00.i();
        this.f54402a = iVar;
        this.f54406e = new StringBuilder();
        this.f54403b = c11;
        this.f54404c = i11;
        iVar.f58426g = String.valueOf(c11);
        Integer numValueOf = Integer.valueOf(i11);
        if (i11 < 3) {
            throw new IllegalArgumentException("openingFenceLength needs to be >= 3");
        }
        Integer num = iVar.f58428i;
        if (num != null && num.intValue() < i11) {
            throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
        }
        iVar.f58427h = numValueOf;
        iVar.f58429j = i12;
    }

    @Override // c10.a
    public final void a(a10.e eVar) {
        CharSequence charSequence = eVar.f289a;
        if (this.f54405d == null) {
            this.f54405d = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.f54406e;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // c10.a
    public final void e() {
        String strB = y00.a.b(this.f54405d.trim());
        z00.i iVar = this.f54402a;
        iVar.f58430k = strB;
        iVar.f58431l = this.f54406e.toString();
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f54402a;
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        int i11 = fVar.f54388f;
        int i12 = fVar.f54385c;
        CharSequence charSequence = fVar.f54383a.f289a;
        int i13 = fVar.f54390h;
        z00.i iVar = this.f54402a;
        if (i13 < 4 && i11 < charSequence.length()) {
            int length = charSequence.length();
            for (int i14 = i11; i14 < length; i14++) {
                if (charSequence.charAt(i14) != this.f54403b) {
                    length = i14;
                    break;
                }
            }
            int i15 = length - i11;
            if (i15 >= this.f54404c && qx.p.G(charSequence, i11 + i15, charSequence.length()) == charSequence.length()) {
                Integer numValueOf = Integer.valueOf(i15);
                if (i15 < 3) {
                    throw new IllegalArgumentException("closingFenceLength needs to be >= 3");
                }
                Integer num = iVar.f58427h;
                if (num != null && i15 < num.intValue()) {
                    throw new IllegalArgumentException("fence lengths required to be: closingFenceLength >= openingFenceLength");
                }
                iVar.f58428i = numValueOf;
                return new l8.h(-1, -1, true);
            }
        }
        int length2 = charSequence.length();
        for (int i16 = iVar.f58429j; i16 > 0 && i12 < length2 && charSequence.charAt(i12) == ' '; i16--) {
            i12++;
        }
        return l8.h.a(i12);
    }
}
