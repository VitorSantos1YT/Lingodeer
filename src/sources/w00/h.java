package w00;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z00.a f54408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54409c;

    public h() {
        this.f54407a = 1;
        this.f54408b = new z00.o();
        this.f54409c = new ArrayList();
    }

    @Override // c10.a
    public void a(a10.e eVar) {
        switch (this.f54407a) {
            case 1:
                ((ArrayList) this.f54409c).add(eVar.f289a);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033 A[LOOP:1: B:12:0x002f->B:14:0x0033, LOOP_END] */
    @Override // c10.a
    public void e() {
        int i11;
        StringBuilder sb2;
        CharSequence charSequence;
        switch (this.f54407a) {
            case 1:
                ArrayList arrayList = (ArrayList) this.f54409c;
                int size = arrayList.size();
                do {
                    size--;
                    if (size >= 0) {
                        charSequence = (CharSequence) arrayList.get(size);
                    }
                    sb2 = new StringBuilder();
                    for (i11 = 0; i11 < size + 1; i11++) {
                        sb2.append((CharSequence) arrayList.get(i11));
                        sb2.append('\n');
                    }
                    ((z00.o) this.f54408b).f58437g = sb2.toString();
                    break;
                } while (qx.p.G(charSequence, 0, charSequence.length()) == charSequence.length());
                sb2 = new StringBuilder();
                while (i11 < size + 1) {
                    sb2.append((CharSequence) arrayList.get(i11));
                    sb2.append('\n');
                }
                ((z00.o) this.f54408b).f58437g = sb2.toString();
                break;
        }
    }

    @Override // c10.a
    public final z00.a f() {
        switch (this.f54407a) {
            case 0:
                return (z00.k) this.f54408b;
            default:
                return (z00.o) this.f54408b;
        }
    }

    @Override // c10.a
    public void i(k kVar) {
        switch (this.f54407a) {
            case 0:
                kVar.e((a10.f) this.f54409c, (z00.k) this.f54408b);
                break;
        }
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        switch (this.f54407a) {
            case 0:
                return null;
            default:
                if (fVar.f54390h >= 4) {
                    return new l8.h(-1, fVar.f54386d + 4, false);
                }
                if (fVar.f54391i) {
                    return l8.h.a(fVar.f54388f);
                }
                return null;
        }
    }

    public h(int i11, a10.f fVar) {
        this.f54407a = 0;
        z00.k kVar = new z00.k();
        this.f54408b = kVar;
        kVar.f58432g = i11;
        this.f54409c = fVar;
    }
}
