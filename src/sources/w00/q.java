package w00;

import fr.j3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import z00.t;
import z00.w;
import z00.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class q extends c10.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f54445a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f54446b = new m();

    @Override // c10.a
    public final void a(a10.e eVar) {
        m mVar = this.f54446b;
        ArrayList arrayList = mVar.f54429b;
        arrayList.add(eVar);
        if (mVar.f54428a == l.PARAGRAPH) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(eVar);
        b10.b bVar = new b10.b(arrayList2);
        while (bVar.f()) {
            int iOrdinal = mVar.f54428a.ordinal();
            if (iOrdinal == 0) {
                mVar.a();
                bVar.q();
                if (!bVar.l('[')) {
                    mVar.f54428a = l.PARAGRAPH;
                    mVar.a();
                    return;
                } else {
                    mVar.f54428a = l.LABEL;
                    mVar.f54432e = new StringBuilder();
                    if (!bVar.f()) {
                        mVar.f54432e.append('\n');
                    }
                }
            } else {
                if (iOrdinal == 1) {
                    a9.e eVarO = bVar.o();
                    if (j3.S(bVar)) {
                        mVar.f54432e.append(bVar.e(eVarO, bVar.o()).e());
                        if (!bVar.f()) {
                            mVar.f54432e.append('\n');
                        } else if (bVar.l(']') && bVar.l(':') && mVar.f54432e.length() <= 999 && !y00.a.a(mVar.f54432e.toString()).isEmpty()) {
                            mVar.f54428a = l.DESTINATION;
                            bVar.q();
                        }
                    }
                    mVar.f54428a = l.PARAGRAPH;
                    mVar.a();
                    return;
                }
                if (iOrdinal == 2) {
                    bVar.q();
                    a9.e eVarO2 = bVar.o();
                    if (j3.R(bVar)) {
                        String strE = bVar.e(eVarO2, bVar.o()).e();
                        if (strE.startsWith("<")) {
                            strE = nv.p.i(1, 1, strE);
                        }
                        mVar.f54433f = strE;
                        int iQ = bVar.q();
                        if (!bVar.f()) {
                            mVar.f54436i = true;
                            arrayList.clear();
                        } else if (iQ == 0) {
                        }
                        mVar.f54428a = l.START_TITLE;
                    }
                    mVar.f54428a = l.PARAGRAPH;
                    mVar.a();
                    return;
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("Unknown parsing state: ".concat(String.valueOf(mVar.f54428a)));
                    }
                    a9.e eVarO3 = bVar.o();
                    if (j3.T(bVar, mVar.f54434g)) {
                        mVar.f54435h.append(bVar.e(eVarO3, bVar.o()).e());
                        if (bVar.f()) {
                            bVar.k();
                            bVar.q();
                            if (bVar.f()) {
                                mVar.f54435h = null;
                            } else {
                                mVar.f54436i = true;
                                arrayList.clear();
                                mVar.f54428a = l.START_DEFINITION;
                            }
                        } else {
                            mVar.f54435h.append('\n');
                        }
                    } else {
                        mVar.f54435h = null;
                    }
                    mVar.f54428a = l.PARAGRAPH;
                    mVar.a();
                    return;
                }
                bVar.q();
                if (bVar.f()) {
                    mVar.f54434g = (char) 0;
                    char cN = bVar.n();
                    if (cN == '\"' || cN == '\'') {
                        mVar.f54434g = cN;
                    } else if (cN == '(') {
                        mVar.f54434g = ')';
                    }
                    if (mVar.f54434g != 0) {
                        mVar.f54428a = l.TITLE;
                        mVar.f54435h = new StringBuilder();
                        bVar.k();
                        if (!bVar.f()) {
                            mVar.f54435h.append('\n');
                        }
                    } else {
                        mVar.f54428a = l.START_DEFINITION;
                    }
                } else {
                    mVar.f54428a = l.START_DEFINITION;
                }
            }
        }
    }

    @Override // c10.a
    public final void b(y yVar) {
        this.f54446b.f54431d.add(yVar);
    }

    @Override // c10.a
    public final void e() {
        w wVar;
        m mVar = this.f54446b;
        mVar.a();
        ArrayList arrayList = mVar.f54430c;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            wVar = this.f54445a;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            z00.q qVar = (z00.q) obj;
            qVar.i();
            t tVar = wVar.f58446d;
            qVar.f58446d = tVar;
            if (tVar != null) {
                tVar.f58447e = qVar;
            }
            qVar.f58447e = wVar;
            wVar.f58446d = qVar;
            t tVar2 = wVar.f58443a;
            qVar.f58443a = tVar2;
            if (qVar.f58446d == null) {
                tVar2.f58444b = qVar;
            }
        }
        ArrayList arrayList2 = mVar.f54429b;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList2);
        if (arrayList3.isEmpty()) {
            wVar.i();
        } else {
            wVar.g(mVar.f54431d);
        }
    }

    @Override // c10.a
    public final z00.a f() {
        return this.f54445a;
    }

    @Override // c10.a
    public final List g() {
        z00.f fVar = new z00.f();
        m mVar = this.f54446b;
        mVar.a();
        ArrayList arrayList = mVar.f54430c;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z00.q qVar = (z00.q) obj;
            fVar.f58424b.putIfAbsent(y00.a.a(qVar.f58440g), qVar);
        }
        ArrayList arrayList2 = new ArrayList(1);
        Object obj2 = new Object[]{fVar}[0];
        Objects.requireNonNull(obj2);
        arrayList2.add(obj2);
        return Collections.unmodifiableList(arrayList2);
    }

    @Override // c10.a
    public final void i(k kVar) {
        ArrayList arrayList = this.f54446b.f54429b;
        a10.f fVar = new a10.f(0);
        ArrayList arrayList2 = fVar.f291a;
        arrayList2.addAll(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        kVar.e(fVar, this.f54445a);
    }

    @Override // c10.a
    public final l8.h j(f fVar) {
        if (fVar.f54391i) {
            return null;
        }
        return l8.h.a(fVar.f54385c);
    }
}
