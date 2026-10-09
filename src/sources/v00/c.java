package v00;

import a10.e;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.List;
import l8.h;
import qx.p;
import u00.d;
import u00.f;
import w00.k;
import z00.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u00.a f53467a = new u00.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f53468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f53469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f53470d;

    public c(ArrayList arrayList, e eVar) {
        ArrayList arrayList2 = new ArrayList();
        this.f53468b = arrayList2;
        this.f53470d = true;
        this.f53469c = arrayList;
        arrayList2.add(eVar);
    }

    public static ArrayList l(e eVar) {
        CharSequence charSequence = eVar.f289a;
        int iG = p.G(charSequence, 0, charSequence.length());
        int length = charSequence.length();
        if (charSequence.charAt(iG) == '|') {
            iG++;
            length = p.H(charSequence, charSequence.length() - 1, iG) + 1;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i11 = iG;
        while (iG < length) {
            char cCharAt = charSequence.charAt(iG);
            if (cCharAt == '\\') {
                int i12 = iG + 1;
                if (i12 >= length || charSequence.charAt(i12) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    iG = i12;
                }
            } else if (cCharAt != '|') {
                sb2.append(cCharAt);
            } else {
                arrayList.add(new e(sb2.toString(), eVar.a(i11, iG).f290b));
                sb2.setLength(0);
                i11 = iG + 1;
            }
            iG++;
        }
        if (sb2.length() > 0) {
            arrayList.add(new e(sb2.toString(), eVar.a(i11, eVar.f289a.length()).f290b));
        }
        return arrayList;
    }

    @Override // c10.a
    public final void a(e eVar) {
        this.f53468b.add(eVar);
    }

    @Override // c10.a
    public final boolean d() {
        return this.f53470d;
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f53467a;
    }

    @Override // c10.a
    public final void i(k kVar) {
        u00.a aVar = this.f53467a;
        List listD = aVar.d();
        y yVar = !listD.isEmpty() ? (y) listD.get(0) : null;
        u00.e eVar = new u00.e();
        if (yVar != null) {
            eVar.b(yVar);
        }
        aVar.c(eVar);
        f fVar = new f();
        fVar.g(eVar.d());
        eVar.c(fVar);
        ArrayList arrayList = this.f53468b;
        ArrayList arrayListL = l((e) arrayList.get(0));
        int size = arrayListL.size();
        for (int i11 = 0; i11 < size; i11++) {
            d dVarK = k((e) arrayListL.get(i11), i11, kVar);
            dVarK.f52718g = true;
            fVar.c(dVarK);
        }
        int i12 = 2;
        u00.b bVar = null;
        while (i12 < arrayList.size()) {
            e eVar2 = (e) arrayList.get(i12);
            y yVar2 = i12 < listD.size() ? (y) listD.get(i12) : null;
            ArrayList arrayListL2 = l(eVar2);
            f fVar2 = new f();
            if (yVar2 != null) {
                fVar2.b(yVar2);
            }
            int i13 = 0;
            while (i13 < size) {
                fVar2.c(k(i13 < arrayListL2.size() ? (e) arrayListL2.get(i13) : new e(BuildConfig.VERSION_NAME, null), i13, kVar));
                i13++;
            }
            if (bVar == null) {
                bVar = new u00.b();
                aVar.c(bVar);
            }
            bVar.c(fVar2);
            bVar.b(yVar2);
            i12++;
        }
    }

    @Override // c10.a
    public final h j(w00.f fVar) {
        CharSequence charSequence = fVar.f54383a.f289a;
        int iP = p.p('|', charSequence, fVar.f54388f);
        if (iP == -1) {
            return null;
        }
        if (iP != fVar.f54388f || p.G(charSequence, iP + 1, charSequence.length()) != charSequence.length()) {
            return h.a(fVar.f54385c);
        }
        this.f53470d = false;
        return null;
    }

    public final d k(e eVar, int i11, k kVar) {
        d dVar = new d();
        y yVar = eVar.f290b;
        if (yVar != null) {
            dVar.b(yVar);
        }
        ArrayList arrayList = this.f53469c;
        if (i11 < arrayList.size()) {
            dVar.f52719h = ((b) arrayList.get(i11)).f53466a;
        }
        CharSequence charSequence = eVar.f289a;
        int iG = p.G(charSequence, 0, charSequence.length());
        e eVarA = eVar.a(iG, p.H(charSequence, charSequence.length() - 1, iG) + 1);
        a10.f fVar = new a10.f(0);
        fVar.f291a.add(eVarA);
        kVar.e(fVar, dVar);
        return dVar;
    }
}
