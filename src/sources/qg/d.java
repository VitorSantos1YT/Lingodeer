package qg;

import java.util.List;
import l1.n;
import l1.t;
import l1.v1;
import ni.h;
import qy.b0;
import rt.tf;
import s0.q1;
import tg.i0;
import ue.f;
import v0.g;
import x0.i;
import x0.l;
import yg.o;
import ys.o3;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47731c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f47732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f47733e;

    public /* synthetic */ d(int i11, int i12, fz.a aVar, String str, String str2) {
        this.f47729a = 3;
        this.f47730b = i11;
        this.f47732d = str;
        this.f47731c = str2;
        this.f47733e = aVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f47729a;
        int i12 = this.f47730b;
        b0 b0Var = b0.f48488a;
        Object obj3 = this.f47733e;
        Object obj4 = this.f47732d;
        Object obj5 = this.f47731c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                f.d((i0) obj5, (String) obj4, (b) obj3, (n) obj, t.M(i12 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                ((q1) obj5).b((Object[]) obj4, (fz.c) obj3, (n) obj, t.M(i12 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                ((t1.d) obj5).e(obj4, obj3, (n) obj, t.M(i12) | 1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM = t.M(196615);
                tv.a.h(this.f47730b, (String) obj4, (String) obj5, (fz.a) obj3, (n) obj, iM);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((w1.c) obj5).c(obj4, (t1.d) obj3, (n) obj, t.M(i12 | 1));
                break;
            case 5:
                ((Integer) obj2).intValue();
                l.c((g) obj5, (z0.d) obj4, (fz.a) obj3, (n) obj, t.M(i12 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                xn.a.l((List) obj5, (List) obj4, (fz.c) obj3, (n) obj, t.M(i12 | 1));
                break;
            case 7:
                ((Integer) obj2).intValue();
                xu.c.c((zu.a) obj5, (fz.a) obj4, (fz.e) obj3, (n) obj, t.M(i12 | 1));
                break;
            case 8:
                ((Integer) obj2).intValue();
                o.k((h) obj5, (fz.a) obj3, (String) obj4, (n) obj, t.M(i12 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                o3.a((fz.c) obj5, (tf) obj4, (t1.d) obj3, (n) obj, t.M(i12 | 1));
                break;
            default:
                t1.d dVar = i.f55597a;
                ((Integer) obj2).getClass();
                f.e((r) obj5, (v1) obj4, (t1.d) obj3, (n) obj, t.M(i12 | 1));
                break;
        }
        return b0Var;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11, int i12) {
        this.f47729a = i12;
        this.f47731c = obj;
        this.f47732d = obj2;
        this.f47733e = obj3;
        this.f47730b = i11;
    }

    public /* synthetic */ d(h hVar, fz.a aVar, String str, int i11) {
        this.f47729a = 8;
        this.f47731c = hVar;
        this.f47733e = aVar;
        this.f47732d = str;
        this.f47730b = i11;
    }

    public /* synthetic */ d(r rVar, v1 v1Var, t1.d dVar, int i11) {
        this.f47729a = 10;
        t1.d dVar2 = i.f55597a;
        this.f47731c = rVar;
        this.f47732d = v1Var;
        this.f47733e = dVar;
        this.f47730b = i11;
    }
}
