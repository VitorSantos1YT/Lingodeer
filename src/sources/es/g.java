package es;

import com.lingodeer.data.model.LessonState;
import et.o;
import j9.v;
import java.util.List;
import l1.b1;
import l1.m;
import l1.n;
import l1.s;
import l1.t;
import mt.m3;
import mt.p2;
import qy.b0;
import rt.b4;
import rt.j2;
import rt.l9;
import rt.mb;
import ys.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements fz.e {
    public final /* synthetic */ Object H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25807a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f25809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fz.a f25810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25812f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f25813t;

    public /* synthetic */ g(o oVar, boolean z11, fz.c cVar, fz.a aVar, fz.a aVar2, fz.a aVar3, fz.a aVar4, int i11) {
        this.f25811e = oVar;
        this.f25808b = z11;
        this.f25809c = cVar;
        this.f25810d = aVar;
        this.f25812f = aVar2;
        this.f25813t = aVar3;
        this.H = aVar4;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25807a) {
            case 0:
                ((Integer) obj2).getClass();
                j.e((String) this.f25811e, this.f25808b, (LessonState) this.f25812f, this.f25810d, (List) this.f25813t, this.f25809c, (Long) this.H, (n) obj, t.M(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                et.a.b((o) this.f25811e, this.f25808b, this.f25809c, this.f25810d, (fz.a) this.f25812f, (fz.a) this.f25813t, (fz.a) this.H, (n) obj, t.M(1));
                break;
            case 2:
                List list = (List) this.f25813t;
                v vVar = (v) this.f25811e;
                b4 b4Var = (b4) this.f25812f;
                b1 b1Var = (b1) this.H;
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zH = sVar.h(vVar);
                    Object objQ = sVar.Q();
                    if (zH || objQ == m.f39353a) {
                        objQ = new j9.h(vVar, b1Var, 21);
                        sVar.o0(objQ);
                    }
                    m3.g(list, this.f25808b, this.f25810d, (fz.c) objQ, this.f25809c, b4Var, sVar, 0);
                } else {
                    sVar.W();
                }
                return b0.f48488a;
            case 3:
                ((Integer) obj2).getClass();
                p2.a(this.f25808b, this.f25810d, this.f25809c, (fz.a) this.f25812f, (fz.c) this.f25813t, (String) this.f25811e, (j2) this.H, (n) obj, t.M(1));
                break;
            default:
                ((Integer) obj2).getClass();
                h2.a(this.f25808b, (mb) this.f25811e, (l9) this.f25812f, this.f25810d, (fz.a) this.f25813t, this.f25809c, (fz.c) this.H, (n) obj, t.M(1));
                break;
        }
        return b0.f48488a;
    }

    public /* synthetic */ g(String str, boolean z11, LessonState lessonState, fz.a aVar, List list, fz.c cVar, Long l9, int i11) {
        this.f25811e = str;
        this.f25808b = z11;
        this.f25812f = lessonState;
        this.f25810d = aVar;
        this.f25813t = list;
        this.f25809c = cVar;
        this.H = l9;
    }

    public /* synthetic */ g(List list, boolean z11, fz.a aVar, v vVar, fz.c cVar, b4 b4Var, b1 b1Var) {
        this.f25813t = list;
        this.f25808b = z11;
        this.f25810d = aVar;
        this.f25811e = vVar;
        this.f25809c = cVar;
        this.f25812f = b4Var;
        this.H = b1Var;
    }

    public /* synthetic */ g(boolean z11, fz.a aVar, fz.c cVar, fz.a aVar2, fz.c cVar2, String str, j2 j2Var, int i11) {
        this.f25808b = z11;
        this.f25810d = aVar;
        this.f25809c = cVar;
        this.f25812f = aVar2;
        this.f25813t = cVar2;
        this.f25811e = str;
        this.H = j2Var;
    }

    public /* synthetic */ g(boolean z11, mb mbVar, l9 l9Var, fz.a aVar, fz.a aVar2, fz.c cVar, fz.c cVar2, int i11) {
        this.f25808b = z11;
        this.f25811e = mbVar;
        this.f25812f = l9Var;
        this.f25810d = aVar;
        this.f25813t = aVar2;
        this.f25809c = cVar;
        this.H = cVar2;
    }
}
