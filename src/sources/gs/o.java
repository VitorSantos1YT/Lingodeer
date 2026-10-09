package gs;

import com.lingodeer.data.model.uistate.LeaderBoardUser;
import iv.j0;
import l1.t;
import mt.y3;
import qy.b0;
import tg.i0;
import tg.v;
import xu.a0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f29815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f29816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f29818e;

    public /* synthetic */ o(int i11, int i12, fz.a aVar, z1.r rVar) {
        this.f29814a = 4;
        this.f29815b = rVar;
        this.f29818e = aVar;
        this.f29816c = i11;
        this.f29817d = i12;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29814a) {
            case 0:
                ((Integer) obj2).getClass();
                int iM = t.M(this.f29817d | 1);
                a.u(this.f29816c, (fz.a) this.f29818e, (t1.d) this.f29815b, (l1.n) obj, iM);
                break;
            case 1:
                ((Integer) obj2).getClass();
                j0.d((z1.r) this.f29818e, (t1.d) this.f29815b, (l1.n) obj, t.M(this.f29816c | 1), this.f29817d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM2 = t.M(this.f29817d | 1);
                ku.a.i(this.f29816c, iM2, (fz.a) this.f29818e, (fz.a) this.f29815b, (l1.n) obj);
                break;
            case 3:
                ((Integer) obj2).intValue();
                int iM3 = t.M(this.f29817d | 1);
                y3.g(this.f29816c, (fz.a) this.f29818e, (fz.c) this.f29815b, (l1.n) obj, iM3);
                break;
            case 4:
                ((Integer) obj2).getClass();
                qu.b.e((z1.r) this.f29815b, (fz.a) this.f29818e, (l1.n) obj, t.M(this.f29816c | 1), this.f29817d);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iM4 = t.M(this.f29817d | 1);
                v.c((i0) this.f29818e, this.f29816c, (t1.d) this.f29815b, (l1.n) obj, iM4);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM5 = t.M(this.f29817d | 1);
                a0.f((LeaderBoardUser) this.f29818e, this.f29816c, (fz.c) this.f29815b, (l1.n) obj, iM5);
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ o(int i11, fz.a aVar, qy.e eVar, int i12, int i13) {
        this.f29814a = i13;
        this.f29816c = i11;
        this.f29818e = aVar;
        this.f29815b = eVar;
        this.f29817d = i12;
    }

    public /* synthetic */ o(Object obj, int i11, qy.e eVar, int i12, int i13) {
        this.f29814a = i13;
        this.f29818e = obj;
        this.f29816c = i11;
        this.f29815b = eVar;
        this.f29817d = i12;
    }

    public /* synthetic */ o(z1.r rVar, t1.d dVar, int i11, int i12) {
        this.f29814a = 1;
        this.f29818e = rVar;
        this.f29815b = dVar;
        this.f29816c = i11;
        this.f29817d = i12;
    }
}
