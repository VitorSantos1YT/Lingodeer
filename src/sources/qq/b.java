package qq;

import android.os.Bundle;
import android.widget.RelativeLayout;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import nv.p;
import oz.q;
import oz.x;
import rq.c;
import rq.g;
import rq.i;
import sq.v;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements mp.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f48303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pq.b f48304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hi.a f48305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f48306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f48307e;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fv.c f48309t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f48308f = -1;
    public final ArrayList H = new ArrayList();
    public final HashMap K = new HashMap();

    public b(v vVar, pq.b bVar) {
        this.f48303a = vVar;
        this.f48304b = bVar;
        vVar.N = this;
        this.f48309t = new fv.c();
    }

    @Override // ii.a
    public final void A() {
        hi.a aVar = this.f48305c;
        if (aVar != null) {
            aVar.f();
        }
        fv.c cVar = this.f48309t;
        if (cVar != null) {
            ArrayList arrayList = this.H;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                cVar.a(((Number) obj).intValue());
            }
        }
    }

    @Override // mp.a
    public final boolean b() {
        int i11 = this.f48308f;
        List list = this.f48306d;
        m.c(list);
        return i11 >= list.size() - 1;
    }

    @Override // mp.a
    public final int i() {
        List list;
        c cVar = this.f48307e;
        if (cVar == null || (list = cVar.f40177a) == null) {
            return 0;
        }
        return list.size();
    }

    @Override // mp.a
    public final int m() {
        return 0;
    }

    @Override // mp.a
    public final int n() {
        return this.f48308f;
    }

    @Override // mp.a
    public final void p(Bundle bundle) {
        String strG;
        String strSubstring;
        ArrayList arrayList = new ArrayList();
        pq.b bVar = this.f48304b;
        String str = bVar.f46991f;
        m.e(str, "getStudyPool(...)");
        int i11 = 0;
        int i12 = 6;
        String[] strArr = (String[]) q.W0(str, new String[]{","}, 0, 6).toArray(new String[0]);
        int length = strArr.length;
        int i13 = 0;
        while (true) {
            int i14 = 1;
            if (i13 >= length) {
                break;
            }
            String str2 = strArr[i13];
            int length2 = str2.length() - 1;
            int i15 = i11;
            int i16 = i15;
            while (i15 <= length2) {
                int i17 = m.h(str2.charAt(i16 == 0 ? i15 : length2), 32) <= 0 ? 1 : i11;
                if (i16 == 0) {
                    if (i17 == 0) {
                        i16 = 1;
                    } else {
                        i15++;
                    }
                } else if (i17 == 0) {
                    break;
                } else {
                    length2--;
                }
            }
            String strG2 = w4.c.g(str2, length2, 1, i15);
            String str3 = bVar.f46989d;
            m.e(str3, "getFinalPool(...)");
            String[] strArr2 = (String[]) q.W0(str3, new String[]{","}, i11, i12).toArray(new String[i11]);
            int length3 = strArr2.length;
            int i18 = i11;
            while (true) {
                if (i18 >= length3) {
                    strG = BuildConfig.VERSION_NAME;
                    strSubstring = BuildConfig.VERSION_NAME;
                    break;
                }
                String str4 = strArr2[i18];
                int i19 = i11;
                int length4 = str4.length() - 1;
                while (i11 <= length4) {
                    boolean z11 = m.h(str4.charAt(i19 == 0 ? i11 : length4), 32) <= 0;
                    if (i19 != 0) {
                        if (!z11) {
                            i14 = 1;
                            break;
                        }
                        length4--;
                    } else if (z11) {
                        i11++;
                    } else {
                        i14 = 1;
                        i19 = 1;
                    }
                    i14 = 1;
                }
                strG = w4.c.g(str4, length4, i14, i11);
                if (x.k0(strG2, strG, false)) {
                    strSubstring = strG2.substring(0, strG2.length() - strG.length());
                    m.e(strSubstring, "substring(...)");
                    break;
                } else {
                    i18++;
                    i11 = 0;
                    i14 = 1;
                }
            }
            pq.a aVar = new pq.a();
            aVar.f46983a = strG2;
            aVar.f46984b = strSubstring;
            aVar.f46985c = strG;
            arrayList.add(aVar);
            i13++;
            i11 = 0;
            i12 = 6;
        }
        Collections.shuffle(arrayList);
        if (arrayList.isEmpty()) {
            return;
        }
        v vVar = this.f48303a;
        c cVar = new c(vVar, arrayList);
        this.f48307e = cVar;
        cVar.f40178b.clear();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = cVar.f49367h;
        int size = arrayList3.size();
        for (int i21 = 0; i21 < size; i21++) {
            g gVar = new g(cVar.f49366g, (pq.a) arrayList3.get(i21));
            try {
                cVar.f40178b.add(gVar);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            arrayList2.add(gVar);
            int i22 = i21 % 2;
            if (i22 != 0 && i21 != arrayList3.size() - 1) {
                if (arrayList2.size() > 2) {
                    pq.a aVar2 = ((g) p.f(3, arrayList2)).f49358b;
                    i iVar = new i(cVar.f49366g, aVar2, c.m(arrayList2, aVar2));
                    try {
                        iVar.j();
                        cVar.f40178b.add(iVar);
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
                pq.a aVar3 = ((g) p.f(2, arrayList2)).f49358b;
                i iVar2 = new i(cVar.f49366g, aVar3, c.m(arrayList2, aVar3));
                try {
                    iVar2.j();
                    cVar.f40178b.add(iVar2);
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } else if (i22 == 0 || i21 != arrayList3.size() - 1) {
                if (i22 == 0 && i21 == arrayList3.size() - 1) {
                    pq.a aVar4 = ((g) p.f(2, arrayList2)).f49358b;
                    i iVar3 = new i(cVar.f49366g, aVar4, c.m(arrayList2, aVar4));
                    try {
                        iVar3.j();
                        cVar.f40178b.add(iVar3);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    pq.a aVar5 = ((g) p.f(1, arrayList2)).f49358b;
                    i iVar4 = new i(cVar.f49366g, aVar5, c.m(arrayList2, aVar5));
                    try {
                        iVar4.j();
                        cVar.f40178b.add(iVar4);
                    } catch (Exception e13) {
                        e13.printStackTrace();
                    }
                }
            } else {
                if (arrayList2.size() > 2) {
                    pq.a aVar6 = ((g) p.f(3, arrayList2)).f49358b;
                    i iVar5 = new i(cVar.f49366g, aVar6, c.m(arrayList2, aVar6));
                    try {
                        iVar5.j();
                        cVar.f40178b.add(iVar5);
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                }
                if (arrayList2.size() >= 2) {
                    pq.a aVar7 = ((g) p.f(2, arrayList2)).f49358b;
                    i iVar6 = new i(cVar.f49366g, aVar7, c.m(arrayList2, aVar7));
                    try {
                        iVar6.j();
                        cVar.f40178b.add(iVar6);
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                }
                pq.a aVar8 = ((g) p.f(1, arrayList2)).f49358b;
                i iVar7 = new i(cVar.f49366g, aVar8, c.m(arrayList2, aVar8));
                try {
                    iVar7.j();
                    cVar.f40178b.add(iVar7);
                } catch (Exception e16) {
                    e16.printStackTrace();
                }
            }
        }
        c cVar2 = this.f48307e;
        List list = cVar2 != null ? cVar2.f40178b : null;
        this.f48306d = list;
        m.c(list);
        vVar.E(list.size());
        vVar.W(false);
        vVar.X();
    }

    @Override // mp.a
    public final void q() {
        hi.a aVar = this.f48305c;
        m.c(aVar);
        boolean zA = aVar.a();
        hi.a aVar2 = this.f48305c;
        v vVar = this.f48303a;
        vVar.N(zA, aVar2);
        vVar.S(this.f48308f + 1);
    }

    @Override // mp.a
    public final HashMap s() {
        return this.K;
    }

    @Override // mp.a
    public final void t(RelativeLayout relativeLayout) {
        this.f48308f++;
        hi.a aVar = this.f48305c;
        if (aVar != null) {
            aVar.f();
        }
        int i11 = this.f48308f;
        List list = this.f48306d;
        m.c(list);
        if (i11 >= list.size()) {
            List list2 = this.f48306d;
            m.c(list2);
            list2.size();
            this.f48303a.g(false);
            return;
        }
        List list3 = this.f48306d;
        m.c(list3);
        hi.a aVar2 = (hi.a) list3.get(this.f48308f);
        this.f48305c = aVar2;
        if (aVar2 != null) {
            aVar2.d(relativeLayout);
        }
    }

    @Override // mp.a
    public final hi.a u() {
        return this.f48305c;
    }

    @Override // mp.a
    public final void z(boolean z11) {
        this.f48303a.S(this.f48308f + 1);
    }

    @Override // mp.a
    public final void l() {
    }

    @Override // ii.a
    public final void start() {
    }

    @Override // mp.a
    public final void v() {
    }

    @Override // mp.a
    public final void e(Bundle bundle) {
    }
}
