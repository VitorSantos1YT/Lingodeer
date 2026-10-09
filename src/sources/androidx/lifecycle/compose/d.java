package androidx.lifecycle.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import iu.k;
import iv.z0;
import j3.y0;
import java.util.List;
import l1.n;
import l1.t;
import n0.i0;
import n0.l;
import qy.b0;
import se.p;
import sg.q;
import tg.j0;
import tg.v;
import xu.a0;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f2050f;

    public /* synthetic */ d(int i11, Object obj, fz.a aVar, fz.a aVar2, int i12, int i13) {
        this.f2045a = i13;
        this.f2046b = i11;
        this.f2049e = obj;
        this.f2047c = aVar;
        this.f2050f = aVar2;
        this.f2048d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f2045a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return LifecycleEffectKt.LifecycleEventEffect$lambda$5((Lifecycle.Event) this.f2049e, (LifecycleOwner) this.f2050f, (fz.a) this.f2047c, this.f2046b, this.f2048d, (n) obj, iIntValue);
            case 1:
                ((Integer) obj2).getClass();
                fu.a.m(this.f2046b, (String) this.f2049e, (String) this.f2050f, (fz.a) this.f2047c, (n) obj, t.M(this.f2048d | 1));
                return b0.f48488a;
            case 2:
                ((Integer) obj2).getClass();
                k.d((String) this.f2049e, (r) this.f2050f, (y0) this.f2047c, (n) obj, t.M(this.f2046b | 1), this.f2048d);
                return b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                iv.a.A((List) this.f2049e, (fz.c) this.f2050f, (r) this.f2047c, (n) obj, t.M(this.f2046b | 1), this.f2048d);
                return b0.f48488a;
            case 4:
                ((Integer) obj2).getClass();
                z0.l((List) this.f2049e, (r) this.f2050f, (y0) this.f2047c, (n) obj, t.M(this.f2046b | 1), this.f2048d);
                return b0.f48488a;
            case 5:
                ((Integer) obj2).getClass();
                j0.c.a((r) this.f2049e, (z1.e) this.f2050f, (t1.d) this.f2047c, (n) obj, t.M(this.f2046b | 1), this.f2048d);
                return b0.f48488a;
            case 6:
                ((Integer) obj2).getClass();
                l.b(this.f2049e, this.f2046b, (i0) this.f2050f, (t1.d) this.f2047c, (n) obj, t.M(this.f2048d | 1));
                return b0.f48488a;
            case 7:
                ((Integer) obj2).getClass();
                nv.a.h(this.f2046b, (sv.d) this.f2049e, (fz.a) this.f2047c, (fz.a) this.f2050f, (n) obj, t.M(this.f2048d | 1));
                return b0.f48488a;
            case 8:
                ((Integer) obj2).getClass();
                p.H((tg.i0) this.f2049e, (q) this.f2050f, (r) this.f2047c, (n) obj, t.M(this.f2046b | 1), this.f2048d);
                return b0.f48488a;
            case 9:
                ((Integer) obj2).getClass();
                v.a((r) this.f2049e, (j0) this.f2050f, (fz.f) this.f2047c, (n) obj, t.M(this.f2046b | 1), this.f2048d);
                return b0.f48488a;
            case 10:
                ((Integer) obj2).getClass();
                xu.r.b(this.f2046b, (String) this.f2049e, (r) this.f2050f, (fz.e) this.f2047c, (n) obj, t.M(this.f2048d | 1));
                return b0.f48488a;
            default:
                ((Integer) obj2).intValue();
                a0.e(this.f2046b, (fz.c) this.f2049e, (fz.a) this.f2047c, (fz.a) this.f2050f, (n) obj, t.M(this.f2048d | 1));
                return b0.f48488a;
        }
    }

    public /* synthetic */ d(int i11, String str, Object obj, qy.e eVar, int i12, int i13) {
        this.f2045a = i13;
        this.f2046b = i11;
        this.f2049e = str;
        this.f2050f = obj;
        this.f2047c = eVar;
        this.f2048d = i12;
    }

    public /* synthetic */ d(Object obj, int i11, i0 i0Var, t1.d dVar, int i12) {
        this.f2045a = 6;
        this.f2049e = obj;
        this.f2046b = i11;
        this.f2050f = i0Var;
        this.f2047c = dVar;
        this.f2048d = i12;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i11, int i12, int i13) {
        this.f2045a = i13;
        this.f2049e = obj;
        this.f2050f = obj2;
        this.f2047c = obj3;
        this.f2046b = i11;
        this.f2048d = i12;
    }
}
