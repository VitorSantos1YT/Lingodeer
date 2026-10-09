package a10;

import a0.p1;
import a5.j;
import aw.p;
import com.adjust.sdk.Constants;
import com.yalantis.ucrop.view.CropImageView;
import fb.g0;
import ff.h;
import fr.j3;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.m;
import ns.o;
import q6.i;
import q6.n;
import qy.l;
import re.w;
import tp.g;
import uv.k;
import uv.s;
import y.u;
import z00.y;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f291a;

    public f(int i11) {
        switch (i11) {
            case 3:
                this.f291a = new ArrayList();
                break;
            default:
                this.f291a = new ArrayList();
                break;
        }
    }

    @Override // re.w
    public void a(String str, String value) {
        m.f(value, "value");
        this.f291a.add(String.format(Locale.US, "%s=%s", Arrays.copyOf(new Object[]{str, URLEncoder.encode(value, Constants.ENCODING)}, 2)));
    }

    public void b(uv.b bVar) {
        if (bVar.f53192n == 0) {
            j jVar = bVar.f53187h;
            bVar.f53192n = jVar != null ? jVar.hashCode() : bVar.hashCode();
        }
        uv.j jVar2 = bVar.f53181b.f53196a;
        if (jVar2.f53216a == null) {
            o00.a.P(jVar2, "can't begin the task, the holder fo the messenger is nil, %d", Integer.valueOf(jVar2.f53218c.size()));
        } else {
            jVar2.f53217b.getClass();
            c(bVar);
        }
    }

    public void c(uv.b bVar) {
        if (bVar.f53195q) {
            return;
        }
        synchronized (this.f291a) {
            try {
                if (this.f291a.contains(bVar)) {
                    o00.a.P(this, "already has %s", bVar);
                } else {
                    bVar.f53195q = true;
                    this.f291a.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public ArrayList d(int i11, j jVar) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f291a) {
            try {
                ArrayList arrayList2 = this.f291a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    uv.b bVar = (uv.b) obj;
                    bVar.getClass();
                    if (bVar.f53187h == jVar) {
                        if (!(bVar.f53192n != 0)) {
                            bVar.f53192n = i11;
                            arrayList.add(bVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public String e() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f291a;
            if (i11 >= arrayList.size()) {
                return sb2.toString();
            }
            if (i11 != 0) {
                sb2.append('\n');
            }
            sb2.append(((e) arrayList.get(i11)).f289a);
            i11++;
        }
    }

    public ArrayList f(int i11) {
        byte b3;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f291a) {
            try {
                ArrayList arrayList2 = this.f291a;
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    uv.b bVar = (uv.b) obj;
                    boolean z11 = true;
                    if (bVar.a() == i11) {
                        if (bVar.f53180a.f53199d >= 0) {
                            z11 = false;
                        }
                        if (!z11 && (b3 = bVar.f53180a.f53199d) != 0 && b3 != 10) {
                            arrayList.add(bVar);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f291a;
        int size = arrayList2.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            y yVar = ((e) obj).f290b;
            if (yVar != null) {
                arrayList.add(yVar);
            }
        }
        return arrayList;
    }

    public boolean h(uv.b bVar) {
        ArrayList arrayList = this.f291a;
        return arrayList.isEmpty() || !arrayList.contains(bVar);
    }

    public void i(uv.b bVar, p pVar) {
        boolean zRemove;
        byte bK = pVar.k();
        synchronized (this.f291a) {
            try {
                zRemove = this.f291a.remove(bVar);
                if (zRemove && this.f291a.size() == 0) {
                    g gVar = k.f53220a;
                    if (((s) gVar.f52461b).r()) {
                        gVar.m();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!zRemove) {
            o00.a.B(6, this, null, "remove error, not exist: %s %d", bVar, Byte.valueOf(bK));
            return;
        }
        uv.j jVar = bVar.f53181b.f53196a;
        if (bK == -4) {
            jVar.f53217b.b();
            jVar.c(pVar);
            return;
        }
        if (bK != -3) {
            if (bK == -2) {
                jVar.f53217b.b();
                jVar.c(pVar);
                return;
            } else {
                if (bK != -1) {
                    return;
                }
                jVar.f53217b.b();
                jVar.c(pVar);
                return;
            }
        }
        if (pVar.k() == -3) {
            aw.a aVar = new aw.a(pVar);
            jVar.f53217b.getClass();
            jVar.c(aVar);
        } else {
            int i11 = pVar.f3237a;
            byte bK2 = pVar.k();
            int i12 = ew.f.f25949a;
            Locale locale = Locale.ENGLISH;
            throw new IllegalStateException(nv.p.p("take block completed snapshot, must has already be completed. ", i11, bK2, " "));
        }
    }

    public f(q6.m start, q6.m end) {
        l lVar;
        l lVarA;
        l lVarA2;
        float fD;
        m.f(start, "start");
        m.f(end, "end");
        i iVarI = j3.I(new p1(start.f47505b, start.f47506c), start);
        i iVarI2 = j3.I(new p1(end.f47505b, end.f47506c), end);
        List features1 = iVarI.f47492c;
        List features2 = iVarI2.f47492c;
        m.f(features1, "features1");
        m.f(features2, "features2");
        sy.c cVarO = o.o();
        int size = features1.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((q6.k) features1.get(i11)).f47494b instanceof q6.e) {
                cVarO.add(features1.get(i11));
            }
        }
        sy.c cVarE = o.e(cVarO);
        sy.c cVarO2 = o.o();
        int size2 = features2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (((q6.k) features2.get(i12)).f47494b instanceof q6.e) {
                cVarO2.add(features2.get(i12));
            }
        }
        sy.c cVarE2 = o.e(cVarO2);
        if (cVarE.b() > cVarE2.b()) {
            lVar = new l(g0.j(cVarE2, cVarE), cVarE2);
        } else {
            lVar = new l(cVarE, g0.j(cVarE, cVarE2));
        }
        List list = (List) lVar.f48495a;
        List list2 = (List) lVar.f48496b;
        sy.c cVarO3 = o.o();
        int size3 = list.size();
        for (int i13 = 0; i13 < size3 && i13 != list2.size(); i13++) {
            cVarO3.add(new l(Float.valueOf(((q6.k) list.get(i13)).f47493a), Float.valueOf(((q6.k) list2.get(i13)).f47493a)));
        }
        l[] lVarArr = (l[]) o.e(cVarO3).toArray(new l[0]);
        q6.d dVar = new q6.d((l[]) Arrays.copyOf(lVarArr, lVarArr.length));
        u uVar = dVar.f47479a;
        u uVar2 = dVar.f47480b;
        float fZ = h.z(uVar, uVar2, CropImageView.DEFAULT_ASPECT_RATIO);
        ArrayList arrayList = iVarI2.f47491b;
        if (CropImageView.DEFAULT_ASPECT_RATIO <= fZ && fZ <= 1.0f) {
            if (fZ >= 1.0E-4f) {
                int size4 = arrayList.size();
                int i14 = 0;
                int i15 = 0;
                while (true) {
                    if (i15 >= size4) {
                        i14 = -1;
                        break;
                    }
                    Object obj = arrayList.get(i15);
                    i15++;
                    q6.h hVar = (q6.h) obj;
                    float f5 = hVar.f47487c;
                    if (fZ <= hVar.f47488d && f5 <= fZ) {
                        break;
                    } else {
                        i14++;
                    }
                }
                l lVarA3 = ((q6.h) arrayList.get(i14)).a(fZ);
                q6.h hVar2 = (q6.h) lVarA3.f48495a;
                ArrayList arrayListM = o.M(((q6.h) lVarA3.f48496b).f47485a);
                int size5 = arrayList.size();
                for (int i16 = 1; i16 < size5; i16++) {
                    arrayListM.add(((q6.h) arrayList.get((i16 + i14) % arrayList.size())).f47485a);
                }
                arrayListM.add(hVar2.f47485a);
                u uVar3 = new u(arrayList.size() + 2);
                int size6 = arrayList.size() + 2;
                int i17 = 0;
                while (i17 < size6) {
                    if (i17 == 0) {
                        fD = CropImageView.DEFAULT_ASPECT_RATIO;
                    } else {
                        fD = i17 == arrayList.size() + 1 ? 1.0f : n.d(((q6.h) arrayList.get(((i14 + i17) - 1) % arrayList.size())).f47488d - fZ, 1.0f);
                    }
                    uVar3.a(fD);
                    i17++;
                }
                sy.c cVarO4 = o.o();
                int size7 = features2.size();
                for (int i18 = 0; i18 < size7; i18++) {
                    cVarO4.add(new q6.k(n.d(((q6.k) features2.get(i18)).f47493a - fZ, 1.0f), ((q6.k) features2.get(i18)).f47494b));
                }
                iVarI2 = new i(iVarI2.f47490a, o.e(cVarO4), arrayListM, uVar3);
            }
            ArrayList arrayList2 = new ArrayList();
            q6.h hVar3 = (q6.h) ry.m.t0(0, iVarI);
            q6.h hVar4 = (q6.h) ry.m.t0(0, iVarI2);
            int i19 = 1;
            int i21 = 1;
            while (hVar3 != null && hVar4 != null) {
                float f11 = i21 == iVarI.f47491b.size() ? 1.0f : hVar3.f47488d;
                float fZ2 = i19 == iVarI2.f47491b.size() ? 1.0f : h.z(uVar2, uVar, n.d(hVar4.f47488d + fZ, 1.0f));
                float fMin = Math.min(f11, fZ2);
                float f12 = 1.0E-6f + fMin;
                if (f11 > f12) {
                    lVarA = hVar3.a(fMin);
                } else {
                    l lVar2 = new l(hVar3, ry.m.t0(i21, iVarI));
                    i21++;
                    lVarA = lVar2;
                }
                q6.h hVar5 = (q6.h) lVarA.f48495a;
                hVar3 = (q6.h) lVarA.f48496b;
                if (fZ2 > f12) {
                    lVarA2 = hVar4.a(n.d(h.z(uVar, uVar2, fMin) - fZ, 1.0f));
                } else {
                    l lVar3 = new l(hVar4, ry.m.t0(i19, iVarI2));
                    i19++;
                    lVarA2 = lVar3;
                }
                q6.h hVar6 = (q6.h) lVarA2.f48495a;
                hVar4 = (q6.h) lVarA2.f48496b;
                arrayList2.add(new l(hVar5.f47485a, hVar6.f47485a));
            }
            if (hVar3 == null && hVar4 == null) {
                this.f291a = arrayList2;
                return;
            }
            throw new IllegalArgumentException("Expected both Polygon's Cubic to be fully matched");
        }
        throw new IllegalArgumentException("Cutting point is expected to be between 0 and 1");
    }

    public f(ArrayList arrayList) {
        this.f291a = arrayList;
    }
}
