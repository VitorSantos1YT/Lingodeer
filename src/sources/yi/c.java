package yi;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import b7.e0;
import com.bumptech.glide.g;
import com.stkouyu.util.CommandUtil;
import fr.j3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import ns.o;
import nv.p;
import oz.q;
import ry.r;
import ui.h;
import zi.i;
import zi.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements mp.a {
    public final fv.c H;
    public int K;
    public int L;
    public int M;
    public final ArrayList N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f57853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi.c f57854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public hi.a f57856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f57857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zi.c f57858f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f57859t;

    public c(h hVar, xi.c lesson, int i11) {
        m.f(lesson, "lesson");
        this.f57853a = hVar;
        this.f57854b = lesson;
        this.f57855c = i11;
        this.f57859t = -1;
        this.N = new ArrayList();
        hVar.N = this;
        this.H = new fv.c();
    }

    @Override // ii.a
    public final void A() {
        hi.a aVar = this.f57856d;
        if (aVar != null) {
            m.c(aVar);
            aVar.f();
        }
        fv.c cVar = this.H;
        if (cVar != null) {
            Iterator it = this.N.iterator();
            m.e(it, "iterator(...)");
            while (it.hasNext()) {
                Object next = it.next();
                m.e(next, "next(...)");
                cVar.a(((Number) next).intValue());
            }
        }
    }

    @Override // mp.a
    public final boolean b() {
        int i11 = this.f57859t;
        ArrayList arrayList = this.f57857e;
        m.c(arrayList);
        return i11 >= arrayList.size() - 1;
    }

    @Override // mp.a
    public final int i() {
        zi.c cVar = this.f57858f;
        m.c(cVar);
        return cVar.f40177a.size();
    }

    @Override // mp.a
    public final int m() {
        return 0;
    }

    @Override // mp.a
    public final int n() {
        return this.f57859t;
    }

    @Override // mp.a
    public final void p(Bundle bundle) {
        int i11;
        Object next;
        List listK;
        Collection collectionT;
        String str;
        int i12;
        String str2;
        int i13;
        int i14;
        String str3;
        ArrayList arrayList = new ArrayList();
        int i15 = this.f57855c;
        xi.c cVar = this.f57854b;
        if (i15 == 0) {
            i11 = i15;
            arrayList.addAll(g.o((int) cVar.f56095a, cVar.K));
        } else if (i15 != 1) {
            i11 = i15;
        } else {
            long j11 = cVar.f56095a;
            int i16 = 0;
            String str4 = "i ";
            if (j11 == -2) {
                ArrayList arrayListO = g.o((int) j11, cVar.L);
                int[] iArrP = j3.P(arrayListO.size(), 20);
                int length = iArrP.length;
                int i17 = 0;
                while (i17 < length) {
                    int i18 = i17;
                    int i19 = iArrP[i18];
                    int[] iArr = iArrP;
                    String str5 = ((xi.b) arrayListO.get(i19)).f56091e;
                    if (!m.a(((xi.b) arrayListO.get(i19)).f56088b, "i ") || (str3 = ((xi.b) arrayListO.get(i19)).f56087a) == null) {
                        i13 = i15;
                        i14 = length;
                    } else {
                        i14 = length;
                        int iHashCode = str3.hashCode();
                        i13 = i15;
                        if (iHashCode != 99) {
                            if (iHashCode != 122) {
                                if (iHashCode != 3173) {
                                    if (iHashCode != 3669) {
                                        if (iHashCode != 3886) {
                                            if (iHashCode != 114) {
                                                if (iHashCode == 115 && str3.equals("s")) {
                                                }
                                            } else if (!str3.equals("r")) {
                                            }
                                        } else if (str3.equals("zh")) {
                                        }
                                    } else if (!str3.equals(CommandUtil.COMMAND_SH)) {
                                    }
                                } else if (!str3.equals("ch")) {
                                }
                            } else if (!str3.equals("z")) {
                            }
                        } else if (!str3.equals("c")) {
                        }
                        i17 = i18 + 1;
                        length = i14;
                        iArrP = iArr;
                        i15 = i13;
                    }
                    arrayList.add(arrayListO.get(i19));
                    i17 = i18 + 1;
                    length = i14;
                    iArrP = iArr;
                    i15 = i13;
                }
                i11 = i15;
            } else {
                i11 = i15;
                String str6 = cVar.K;
                m.e(str6, "getTestPool1(...)");
                Pattern patternCompile = Pattern.compile(";");
                m.e(patternCompile, "compile(...)");
                q.U0(0);
                Matcher matcher = patternCompile.matcher(str6);
                if (matcher.find()) {
                    ArrayList arrayList2 = new ArrayList(10);
                    int iC = 0;
                    while (true) {
                        iC = p.c(matcher, str6, iC, arrayList2);
                        if (!matcher.find()) {
                            break;
                        } else {
                            i16 = 0;
                        }
                    }
                    p.B(iC, str6, arrayList2);
                    listK = arrayList2;
                } else {
                    listK = o.K(str6.toString());
                }
                if (listK.isEmpty()) {
                    collectionT = r.f50854a;
                    break;
                }
                ListIterator listIterator = listK.listIterator(listK.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collectionT = e0.t(listIterator, 1, listK);
                            break;
                        }
                    } else {
                        collectionT = r.f50854a;
                        break;
                    }
                }
                String[] strArr = (String[]) collectionT.toArray(new String[i16]);
                ArrayList arrayListO2 = g.o((int) cVar.f56095a, cVar.L);
                int[] iArrP2 = j3.P(arrayListO2.size(), strArr.length);
                int length2 = iArrP2.length;
                int i21 = 0;
                while (i21 < length2) {
                    int i22 = iArrP2[i21];
                    int[] iArr2 = iArrP2;
                    if (!m.a(((xi.b) arrayListO2.get(i22)).f56088b, str4) || (str2 = ((xi.b) arrayListO2.get(i22)).f56087a) == null) {
                        str = str4;
                        i12 = length2;
                    } else {
                        str = str4;
                        int iHashCode2 = str2.hashCode();
                        i12 = length2;
                        if (iHashCode2 != 99) {
                            if (iHashCode2 != 122) {
                                if (iHashCode2 != 3173) {
                                    if (iHashCode2 != 3669) {
                                        if (iHashCode2 != 3886) {
                                            if (iHashCode2 != 114) {
                                                if (iHashCode2 == 115 && str2.equals("s")) {
                                                }
                                            } else if (!str2.equals("r")) {
                                            }
                                        } else if (str2.equals("zh")) {
                                        }
                                    } else if (!str2.equals(CommandUtil.COMMAND_SH)) {
                                    }
                                } else if (!str2.equals("ch")) {
                                }
                            } else if (!str2.equals("z")) {
                            }
                        } else if (!str2.equals("c")) {
                        }
                        i21++;
                        str4 = str;
                        iArrP2 = iArr2;
                        length2 = i12;
                    }
                    arrayList.add(arrayListO2.get(i22));
                    i21++;
                    str4 = str;
                    iArrP2 = iArr2;
                    length2 = i12;
                }
            }
        }
        h hVar = this.f57853a;
        zi.c cVar2 = new zi.c(hVar, arrayList, cVar, i11);
        this.f57858f = cVar2;
        ArrayList arrayList3 = cVar2.f59234k;
        arrayList3.clear();
        ArrayList arrayList4 = cVar2.f59231h;
        int i23 = cVar2.f59233j;
        if (i23 == 0) {
            ArrayList arrayList5 = new ArrayList();
            int size = arrayList4.size();
            for (int i24 = 0; i24 < size; i24++) {
                zi.g gVar = new zi.g(cVar2.f59230g, (xi.b) arrayList4.get(i24));
                try {
                    arrayList3.add(gVar);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                arrayList5.add(gVar);
                int i25 = i24 % 2;
                if (i25 != 0 && i24 != arrayList4.size() - 1) {
                    if (arrayList5.size() > 2) {
                        xi.b bVar = ((zi.g) p.f(3, arrayList5)).f59223b;
                        l lVar = new l(cVar2.f59230g, bVar, zi.c.m(arrayList5, bVar));
                        try {
                            lVar.j();
                            arrayList3.add(lVar);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    xi.b bVar2 = ((zi.g) p.f(2, arrayList5)).f59223b;
                    l lVar2 = new l(cVar2.f59230g, bVar2, zi.c.m(arrayList5, bVar2));
                    try {
                        lVar2.j();
                        arrayList3.add(lVar2);
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } else if (i25 != 0 && i24 == arrayList4.size() - 1) {
                    if (arrayList5.size() > 2) {
                        xi.b bVar3 = ((zi.g) p.f(3, arrayList5)).f59223b;
                        l lVar3 = new l(cVar2.f59230g, bVar3, zi.c.m(arrayList5, bVar3));
                        try {
                            lVar3.j();
                            arrayList3.add(lVar3);
                        } catch (Exception e12) {
                            e12.printStackTrace();
                        }
                    }
                    if (arrayList5.size() >= 2) {
                        xi.b bVar4 = ((zi.g) p.f(2, arrayList5)).f59223b;
                        l lVar4 = new l(cVar2.f59230g, bVar4, zi.c.m(arrayList5, bVar4));
                        try {
                            lVar4.j();
                            arrayList3.add(lVar4);
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                    xi.b bVar5 = ((zi.g) p.f(1, arrayList5)).f59223b;
                    l lVar5 = new l(cVar2.f59230g, bVar5, zi.c.m(arrayList5, bVar5));
                    try {
                        lVar5.j();
                        arrayList3.add(lVar5);
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                } else if (i25 == 0 && i24 == arrayList4.size() - 1) {
                    xi.b bVar6 = ((zi.g) p.f(2, arrayList5)).f59223b;
                    l lVar6 = new l(cVar2.f59230g, bVar6, zi.c.m(arrayList5, bVar6));
                    try {
                        lVar6.j();
                        arrayList3.add(lVar6);
                    } catch (Exception e15) {
                        e15.printStackTrace();
                    }
                    xi.b bVar7 = ((zi.g) p.f(1, arrayList5)).f59223b;
                    l lVar7 = new l(cVar2.f59230g, bVar7, zi.c.m(arrayList5, bVar7));
                    try {
                        lVar7.j();
                        arrayList3.add(lVar7);
                    } catch (Exception e16) {
                        e16.printStackTrace();
                    }
                }
            }
        } else if (i23 == 1) {
            int size2 = arrayList4.size();
            int i26 = 0;
            while (i26 < size2) {
                int i27 = i26 + 1;
                xi.b bVar8 = (xi.b) arrayList4.get(i26);
                String str7 = bVar8.f56091e;
                if (!TextUtils.isEmpty(bVar8.a())) {
                    i iVar = new i(cVar2.f59230g, bVar8, cVar2.f59232i);
                    try {
                        iVar.j();
                        arrayList3.add(iVar);
                    } catch (Exception e17) {
                        e17.printStackTrace();
                    }
                }
                i26 = i27;
            }
        }
        zi.c cVar3 = this.f57858f;
        m.c(cVar3);
        ArrayList arrayList6 = cVar3.f59234k;
        this.f57857e = arrayList6;
        m.c(arrayList6);
        hVar.E(arrayList6.size());
        ArrayList arrayList7 = this.f57857e;
        m.c(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        int size3 = arrayList7.size();
        int i28 = 0;
        while (i28 < size3) {
            Object obj = arrayList7.get(i28);
            i28++;
            for (fv.a aVar : ((hi.a) obj).g()) {
                if (!new File(aVar.f28184c).exists()) {
                    Iterator it = arrayList8.iterator();
                    m.e(it, "iterator(...)");
                    do {
                        if (!it.hasNext()) {
                            arrayList8.add(aVar);
                            break;
                        } else {
                            next = it.next();
                            m.e(next, "next(...)");
                        }
                    } while (!((fv.a) next).equals(aVar));
                }
            }
        }
        int size4 = arrayList8.size();
        if (size4 <= 0) {
            hVar.W(false);
            return;
        }
        hVar.W(true);
        fv.c cVar4 = this.H;
        m.c(cVar4);
        cVar4.c(arrayList8, new fn.b(this, size4, 4), false);
    }

    @Override // mp.a
    public final void q() {
        hi.a aVar = this.f57856d;
        m.c(aVar);
        boolean zA = aVar.a();
        if (zA) {
            this.L++;
        }
        hi.a aVar2 = this.f57856d;
        h hVar = this.f57853a;
        hVar.N(zA, aVar2);
        hVar.S(this.f57859t + 1);
    }

    @Override // mp.a
    public final HashMap s() {
        return new HashMap();
    }

    @Override // mp.a
    public final void t(RelativeLayout relativeLayout) {
        this.f57859t++;
        hi.a aVar = this.f57856d;
        if (aVar != null) {
            aVar.f();
        }
        int i11 = this.f57859t;
        ArrayList arrayList = this.f57857e;
        m.c(arrayList);
        if (i11 >= arrayList.size()) {
            float f5 = this.L;
            ArrayList arrayList2 = this.f57857e;
            m.c(arrayList2);
            this.M = (int) ((f5 / arrayList2.size()) * 100);
            this.f57853a.g(false);
            return;
        }
        ArrayList arrayList3 = this.f57857e;
        m.c(arrayList3);
        hi.a aVar2 = (hi.a) arrayList3.get(this.f57859t);
        this.f57856d = aVar2;
        m.c(aVar2);
        aVar2.d(relativeLayout);
    }

    @Override // mp.a
    public final hi.a u() {
        return this.f57856d;
    }

    @Override // mp.a
    public final void z(boolean z11) {
        this.f57853a.S(this.f57859t + 1);
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
