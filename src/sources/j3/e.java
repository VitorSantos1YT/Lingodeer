package j3;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Appendable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f35683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f35684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f35685c;

    public /* synthetic */ e() {
        this(16);
    }

    public final void a(p0 p0Var, int i11, int i12) {
        this.f35685c.add(new d(i11, i12, 8, p0Var, null));
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof h) {
            c((h) charSequence);
            return this;
        }
        this.f35683a.append(charSequence);
        return this;
    }

    public final void b(char c11) {
        this.f35683a.append(c11);
    }

    public final void c(h hVar) {
        StringBuilder sb2 = this.f35683a;
        int length = sb2.length();
        sb2.append(hVar.f35700b);
        List list = hVar.f35699a;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar = (f) list.get(i11);
                this.f35685c.add(new d(fVar.f35690b + length, fVar.f35691c + length, fVar.f35689a, fVar.f35692d));
            }
        }
    }

    public final void d(String str) {
        this.f35683a.append(str);
    }

    public final void e() {
        ArrayList arrayList = this.f35684b;
        if (arrayList.isEmpty()) {
            p3.a.c("Nothing to pop.");
        }
        ((d) hh.p0.f(1, arrayList)).f35679c = this.f35683a.length();
    }

    public final void f(int i11) {
        ArrayList arrayList = this.f35684b;
        if (i11 >= arrayList.size()) {
            p3.a.c(i11 + " should be less than " + arrayList.size());
        }
        while (arrayList.size() - 1 >= i11) {
            e();
        }
    }

    public final int g(u uVar) {
        d dVar = new d(this.f35683a.length(), 0, 12, uVar, null);
        ArrayList arrayList = this.f35684b;
        arrayList.add(dVar);
        this.f35685c.add(dVar);
        return arrayList.size() - 1;
    }

    public final int h(String str, String str2) {
        d dVar = new d(this.f35683a.length(), 0, 4, new r0(str2), str);
        ArrayList arrayList = this.f35684b;
        arrayList.add(dVar);
        this.f35685c.add(dVar);
        return arrayList.size() - 1;
    }

    public final int i(p0 p0Var) {
        d dVar = new d(this.f35683a.length(), 0, 12, p0Var, null);
        ArrayList arrayList = this.f35684b;
        arrayList.add(dVar);
        this.f35685c.add(dVar);
        return arrayList.size() - 1;
    }

    public final h j() {
        StringBuilder sb2 = this.f35683a;
        String string = sb2.toString();
        ArrayList arrayList = this.f35685c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(((d) arrayList.get(i11)).a(sb2.length()));
        }
        return new h(string, arrayList2);
    }

    public e(int i11) {
        this.f35683a = new StringBuilder(i11);
        this.f35684b = new ArrayList();
        this.f35685c = new ArrayList();
        new ArrayList();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i11, int i12) {
        boolean z11 = charSequence instanceof h;
        StringBuilder sb2 = this.f35683a;
        if (z11) {
            h hVar = (h) charSequence;
            int length = sb2.length();
            sb2.append((CharSequence) hVar.f35700b, i11, i12);
            List listA = i.a(hVar, i11, i12, null);
            if (listA != null) {
                int size = listA.size();
                for (int i13 = 0; i13 < size; i13++) {
                    f fVar = (f) listA.get(i13);
                    this.f35685c.add(new d(fVar.f35690b + length, fVar.f35691c + length, fVar.f35689a, fVar.f35692d));
                }
            }
            return this;
        }
        sb2.append(charSequence, i11, i12);
        return this;
    }

    public e(h hVar) {
        this();
        c(hVar);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c11) {
        this.f35683a.append(c11);
        return this;
    }
}
