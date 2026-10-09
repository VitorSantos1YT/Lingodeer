package p7;

import androidx.media3.exoplayer.source.MergingMediaSource$IllegalMergeException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.MultimapBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final y6.x f46417t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a[] f46418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f46419l;
    public final y6.o0[] m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f46420n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p20.c f46421o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ListMultimap f46422p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f46423q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long[][] f46424r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MergingMediaSource$IllegalMergeException f46425s;

    static {
        kw.b bVar = new kw.b();
        ImmutableMap.k();
        ImmutableList.s();
        List list = Collections.EMPTY_LIST;
        ImmutableList.s();
        j7.t tVar = new j7.t();
        f46417t = new y6.x("MergingMediaSource", new y6.s(bVar), null, new y6.t(tVar), y6.a0.B, y6.v.f57368a);
    }

    public l0(a... aVarArr) {
        p20.c cVar = new p20.c(24);
        this.f46418k = aVarArr;
        this.f46421o = cVar;
        this.f46420n = new ArrayList(Arrays.asList(aVarArr));
        this.f46423q = -1;
        this.f46419l = new ArrayList(aVarArr.length);
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            this.f46419l.add(new ArrayList());
        }
        this.m = new y6.o0[aVarArr.length];
        this.f46424r = new long[0][];
        new HashMap();
        this.f46422p = MultimapBuilder.a().a().c();
    }

    @Override // p7.a
    public final z a(b0 b0Var, t7.g gVar, long j11) {
        a[] aVarArr = this.f46418k;
        int length = aVarArr.length;
        z[] zVarArr = new z[length];
        y6.o0[] o0VarArr = this.m;
        int iB = o0VarArr[0].b(b0Var.f46328a);
        for (int i11 = 0; i11 < length; i11++) {
            b0 b0VarA = b0Var.a(o0VarArr[i11].l(iB));
            zVarArr[i11] = aVarArr[i11].a(b0VarA, gVar, j11 - this.f46424r[iB][i11]);
            ((List) this.f46419l.get(i11)).add(new k0(b0VarA, zVarArr[i11]));
        }
        return new j0(this.f46421o, this.f46424r[iB], zVarArr);
    }

    @Override // p7.a
    public final y6.x g() {
        a[] aVarArr = this.f46418k;
        return aVarArr.length > 0 ? aVarArr[0].g() : f46417t;
    }

    @Override // p7.k, p7.a
    public final void i() throws MergingMediaSource$IllegalMergeException {
        MergingMediaSource$IllegalMergeException mergingMediaSource$IllegalMergeException = this.f46425s;
        if (mergingMediaSource$IllegalMergeException != null) {
            throw mergingMediaSource$IllegalMergeException;
        }
        super.i();
    }

    @Override // p7.a
    public final void k(d7.q qVar) {
        this.f46412j = qVar;
        this.f46411i = b7.f0.m(null);
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f46418k;
            if (i11 >= aVarArr.length) {
                return;
            }
            w(Integer.valueOf(i11), aVarArr[i11]);
            i11++;
        }
    }

    @Override // p7.a
    public final void m(z zVar) {
        j0 j0Var = (j0) zVar;
        int i11 = 0;
        while (true) {
            a[] aVarArr = this.f46418k;
            if (i11 >= aVarArr.length) {
                return;
            }
            List list = (List) this.f46419l.get(i11);
            z[] zVarArr = j0Var.f46403a;
            boolean[] zArr = j0Var.f46404b;
            z zVar2 = zArr[i11] ? ((f1) zVarArr[i11]).f46375a : zVarArr[i11];
            for (int i12 = 0; i12 < list.size(); i12++) {
                if (((k0) list.get(i12)).f46414b.equals(zVar2)) {
                    list.remove(i12);
                    break;
                }
            }
            a aVar = aVarArr[i11];
            z[] zVarArr2 = j0Var.f46403a;
            aVar.m(zArr[i11] ? ((f1) zVarArr2[i11]).f46375a : zVarArr2[i11]);
            i11++;
        }
    }

    @Override // p7.k, p7.a
    public final void o() {
        super.o();
        Arrays.fill(this.m, (Object) null);
        this.f46423q = -1;
        this.f46425s = null;
        ArrayList arrayList = this.f46420n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f46418k);
    }

    @Override // p7.a
    public final void r(y6.x xVar) {
        this.f46418k[0].r(xVar);
    }

    @Override // p7.k
    public final b0 s(Object obj, b0 b0Var) {
        int iIntValue = ((Integer) obj).intValue();
        ArrayList arrayList = this.f46419l;
        List list = (List) arrayList.get(iIntValue);
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (((k0) list.get(i11)).f46413a.equals(b0Var)) {
                return ((k0) ((List) arrayList.get(0)).get(i11)).f46413a;
            }
        }
        return null;
    }

    @Override // p7.k
    public final void v(Object obj, a aVar, y6.o0 o0Var) {
        Integer num = (Integer) obj;
        if (this.f46425s != null) {
            return;
        }
        if (this.f46423q == -1) {
            this.f46423q = o0Var.h();
        } else if (o0Var.h() != this.f46423q) {
            this.f46425s = new MergingMediaSource$IllegalMergeException();
            return;
        }
        int length = this.f46424r.length;
        y6.o0[] o0VarArr = this.m;
        if (length == 0) {
            this.f46424r = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f46423q, o0VarArr.length);
        }
        ArrayList arrayList = this.f46420n;
        arrayList.remove(aVar);
        o0VarArr[num.intValue()] = o0Var;
        if (arrayList.isEmpty()) {
            l(o0VarArr[0]);
        }
    }
}
