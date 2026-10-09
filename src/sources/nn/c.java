package nn;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.livedata.HeRS.DytezVyM;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import b0.o1;
import bp.e0;
import bt.e6;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.android.material.datepicker.d;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import defpackage.e;
import fr.j3;
import g2.v0;
import h1.ua;
import j0.a2;
import j0.c2;
import j0.e1;
import j0.e2;
import j0.i1;
import j0.o;
import j0.u;
import j0.v;
import j0.v1;
import j0.z1;
import j3.p0;
import j3.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k9.p;
import km.x0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.g;
import l1.n;
import l1.q1;
import l1.s;
import l1.t;
import l1.x1;
import mt.w4;
import oz.q;
import r0.f;
import se.i;
import u3.l;
import w2.q0;
import y2.h;
import y2.j;
import y2.k;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final void a(int i11, String str, n nVar, r rVar) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-941417498);
        int i12 = i11 | (sVar2.f(str) ? 4 : 2) | (sVar2.f(rVar) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            r rVarH = d0.n.h(j0.c.A(rVar, 1), i.k(sVar2, R.color.white), f.d(4));
            q0 q0VarD = o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarH);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(j.f56917f, q0VarD, sVar2);
            t.J(j.f56916e, q1VarL, sVar2);
            h hVar = j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar2);
            ua.b(str, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 0, 0, 0L, null, 16777212), sVar2, i12 & 14, 0, 65534);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(str, rVar, i11, 7);
        }
    }

    public static final void b(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-667807673);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.C(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 8, 1), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.second_black), 0L, null, null, null, 0L, null, null, 0, 0, j3.v(1.8d), null, 16646142), sVar, 54, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e0(str, i11, 23);
        }
    }

    public static final void c(fz.c cVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1026118940);
        int i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            Object objQ = sVar.Q();
            g gVar = l1.m.f39353a;
            int i13 = 6;
            if (objQ == gVar) {
                objQ = ry.m.g1(q.W0("A a\n[pol-f-zy-a]\tĄ ą\n[pol-f-zy-a-1]\tB b\n[pol-f-zy-b]\tC c\n[pol-f-zy-c]\tĆ ć\n[pol-f-zy-c-1]\tD d\n[pol-f-zy-d]\tE e\n[pol-f-zy-e]\tĘ ę\n[pol-f-zy-e-1]\tF f\n[pol-f-zy-f]\tG g\n[pol-f-zy-g]\tH h\n[pol-f-zy-h]\tI i\n[pol-f-zy-i]\tJ j\n[pol-f-zy-j]\tK k\n[pol-f-zy-k]\tL l\n[pol-f-zy-l]\tŁ ł\n[pol-f-zy-l-1]\tM m\n[pol-f-zy-m]\tN n\n[pol-f-zy-n]\tŃ ń\n[pol-f-zy-n-1]\tO o\n[pol-f-zy-o]\tÓ ó\n[pol-f-zy-o-1]\tP p\n[pol-f-zy-p]\tQ q\n[pol-f-zy-q]\tR r\n[pol-f-zy-r]\tS s\n[pol-f-zy-s]\tŚ ś\n[pol-f-zy-s-1]\tT t\n[pol-f-zy-t]\tU u\n[pol-f-zy-u]\tV v\n[pol-f-zy-v]\tW w\n[pol-f-zy-w]\tX x\n[pol-f-zy-x]\tY y\n[pol-f-zy-y]\tZ z\n[pol-f-zy-z]\tŹ ź\n[pol-f-zy-z-1]\tŻ ż\n[pol-f-zy-z-2]", new String[]{"\t"}, 0, 6), 5, 5);
                sVar.o0(objQ);
            }
            List<List> list = (List) objQ;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, uVarA, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            m("Alphabet", sVar, 6);
            b("Polish alphabet derives from the Latin alphabet, but includes some additional letters with diacritics.", sVar, 6);
            sVar.d0(-120803452);
            for (List<String> list2 : list) {
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                int iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, oVar);
                k.J.getClass();
                y2.i iVar2 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar2);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA, sVar);
                t.J(j.f56916e, q1VarL2, sVar);
                h hVar2 = j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                t.J(j.f56915d, rVarC2, sVar);
                sVar.d0(-882005644);
                for (String str : list2) {
                    String str2 = (String) q.W0(str, new String[]{"\n"}, 0, i13).get(0);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarB = d2.h.b(j0.c.j(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), f.d(4));
                    boolean zF = ((i12 & 14) == 4) | sVar.f(str);
                    Object objQ2 = sVar.Q();
                    if (zF || objQ2 == gVar) {
                        objQ2 = new in.h(cVar, str, 13);
                        sVar.o0(objQ2);
                    }
                    a(0, str2, sVar, d0.n.o(rVarB, false, null, (fz.a) objQ2, 15));
                    i13 = 6;
                }
                sVar.p(false);
                if (list2.size() < 5) {
                    sVar.d0(-1571862941);
                    int size = list2.size();
                    for (int i14 = 5; size < i14; i14 = 5) {
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        j0.c.g(sVar, j0.c.A(new i1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1));
                        size++;
                    }
                } else {
                    sVar.d0(-1578086966);
                }
                sVar.p(false);
                sVar.p(true);
                i13 = 6;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar, i11, 16);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:52:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0217  */
    /* JADX WARN: Code duplicated, block: B:71:0x0220  */
    /* JADX WARN: Code duplicated, block: B:74:0x023b  */
    /* JADX WARN: Code duplicated, block: B:75:0x023d  */
    /* JADX WARN: Code duplicated, block: B:81:0x024f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0139 A[EDGE_INSN: B:92:0x0139->B:46:0x0139 BREAK  A[LOOP:0: B:39:0x0115->B:45:0x0128], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0278 A[SYNTHETIC] */
    public static final void d(fz.c cVar, n nVar, int i11) {
        Object obj;
        List list;
        int iHashCode;
        int length;
        int i12;
        double d5;
        Iterator it;
        List list2;
        int iHashCode2;
        y2.i iVar;
        double d11;
        h hVar;
        Iterator itO;
        int i13;
        Object next;
        int i14;
        String str;
        String str2;
        boolean z11;
        boolean zF;
        Object objQ;
        fz.c cVar2 = cVar;
        z1.i iVar2 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(707716197);
        int i15 = i11 | (sVar.h(cVar2) ? 4 : 2);
        if (sVar.T(i15 & 1, (i15 & 3) != 2)) {
            Object objQ2 = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ2 == gVar) {
                obj = objQ2;
                String[] strArr = {"Consonant / IPA", "Example"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ2;
            String[] strArr2 = (String[]) obj;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = ry.m.g1(q.W0("B b\n/b/\n[pol-f-zy-b-0]\tbardzo\nvery\n[pol-f-zy-bardzo]\tC c\n/t͡s/\n[pol-f-zy-c-0]\tco\nwhat\n[pol-f-zy-co]\tĆ ć\n/t͡ɕ/\n[pol-f-zy-c-1-0]\tdać\nto give\n[pol-f-zy-dac]\tD d\n/d/\n[pol-f-zy-d-0]\tdaleko\nfar away\n[pol-f-zy-daleko]\tF f\n/f/\n[pol-f-zy-f-0]\tszafa\ncloset\n[pol-f-zy-szafa]\tG g\n/g/\n[pol-f-zy-g-0]\tbigos\nbigos, hunter’s stew\n[pol-f-zy-bigos]\tH h\n/x/\n[pol-f-zy-h-0]\thotel\nhotel\n[pol-f-zy-hotel]\tJ j\n/j/\n[pol-f-zy-j-0]\tjestem\nI am\n[pol-f-zy-jestem]\tK k\n/k/\n[pol-f-zy-k-0]\tkot\ncat\n[pol-f-zy-kot]\tL l\n/l/\n[pol-f-zy-l-0]\tlata\nyears\n[pol-f-zy-lata]\tŁ ł\n/w/\n[pol-f-zy-l-1-0]\tmiło\nnicely\n[pol-f-zy-milo]\tM m\n/m/\n[pol-f-zy-m-0]\tmama\nmom\n[pol-f-zy-mama]\tN n\n/n/\n[pol-f-zy-n-0]\twino\nwine\n[pol-f-zy-wino]\tŃ ń\n/ɲ/\n[pol-f-zy-n-1-0]\tdzień\nday\n[pol-f-zy-dzien]\tP p\n/p/\n[pol-f-zy-p-0]\tpapuga\nparrot\n[pol-f-zy-papuga]\tR r\n/r/\n[pol-f-zy-r-0]\tryba\nfish\n[pol-f-zy-ryba]\tS s\n/s/\n[pol-f-zy-s-0]\tsok\njuice\n[pol-f-zy-sok]\tŚ ś\n/ɕ/\n[pol-f-zy-s-1-0]\tświat\nworld\n[pol-f-zy-swiat]\tT t\n/t/\n[pol-f-zy-t-0]\ttata\ndad\n[pol-f-zy-tata]\tW w\n/v/\n[pol-f-zy-w-0]\twoda\nwater\n[pol-f-zy-woda]\tZ z\n/z/\n[pol-f-zy-z-0]\tmuzyka\nmusic\n[pol-f-zy-muzyka]\tŹ ź\n/ʑ/\n[pol-f-zy-z-1-0]\tźle\nbadly\n[pol-f-zy-zle]\tŻ ż\n/ʐ/\n[pol-f-zy-z-2-0]\tżona\nwife\n[pol-f-zy-zona]", new String[]{"\t"}, 0, 6), 2, 2);
                sVar.o0(objQ3);
            }
            List list3 = (List) objQ3;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar3 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S) {
                list = list3;
            } else {
                list = list3;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                h hVar5 = j.f56915d;
                t.J(hVar5, rVarC, sVar);
                m("Consonants", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                sVar.d0(-601726123);
                length = strArr2.length;
                i12 = 0;
                while (true) {
                    d5 = 0.0d;
                    if (i12 < length) {
                        break;
                    }
                    String str3 = strArr2[i12];
                    if (1.0f > 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    o(0, str3, sVar, e2.c(new i1(1.0f, true), 1.0f));
                    i12++;
                }
                sVar.p(false);
                sVar.p(true);
                sVar.d0(570542150);
                it = list.iterator();
                while (it.hasNext()) {
                    list2 = (List) it.next();
                    r rVarQ2 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC3 = z1.a.c(sVar, rVarQ2);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    d11 = d5;
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA2, sVar);
                    t.J(j.f56916e, q1VarL3, sVar);
                    hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    itO = d.o(sVar, rVarC3, j.f56915d, -794841492, list2);
                    i13 = 0;
                    while (itO.hasNext()) {
                        next = itO.next();
                        i14 = i13 + 1;
                        if (i13 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        List listW0 = q.W0((String) next, new String[]{"\n"}, 0, 6);
                        String str4 = (String) listW0.get(0);
                        String str5 = (String) listW0.get(1);
                        str = (String) listW0.get(2);
                        if (i13 == 1) {
                            str2 = (String) q.W0((CharSequence) q.W0((CharSequence) list2.get(0), new String[]{"\n"}, 0, 6).get(0), new String[]{" "}, 0, 6).get(1);
                        } else {
                            str2 = BuildConfig.VERSION_NAME;
                        }
                        Iterator it2 = it;
                        List list4 = list2;
                        String str6 = str2;
                        if (1.0f <= d11) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        r rVarB = d2.h.b(e2.c(new i1(1.0f, true), 1.0f), f.d(4));
                        if ((i15 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | sVar.f(str);
                        objQ = sVar.Q();
                        if (zF || objQ == gVar) {
                            objQ = new in.h(cVar, str, 12);
                            sVar.o0(objQ);
                        }
                        p(str4, str5, str6, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 0);
                        i13 = i14;
                        it = it2;
                        list2 = list4;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    d5 = d11;
                    it = it;
                }
                cVar2 = cVar;
                sVar.p(false);
                b("Note: The letters Q q, V v, and X x are only used in loanwords (e.g. quiz, vlog) or abbreviations (e.g., a word starting with ks- being abbreviated as x.).", sVar, 6);
                sVar.p(true);
            }
            e.A(iHashCode3, sVar, iHashCode3, hVar4);
            h hVar6 = j.f56915d;
            t.J(hVar6, rVarC, sVar);
            m("Consonants", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ3 = j0.c.q(oVar, e1.Min);
            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarQ3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA3, sVar);
            t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar6, rVarC4, sVar);
            sVar.d0(-601726123);
            length = strArr2.length;
            i12 = 0;
            while (true) {
                d5 = 0.0d;
                if (i12 < length) {
                    break;
                    break;
                }
                String str7 = strArr2[i12];
                if (1.0f > 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                o(0, str7, sVar, e2.c(new i1(1.0f, true), 1.0f));
                i12++;
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(570542150);
            it = list.iterator();
            while (it.hasNext()) {
                list2 = (List) it.next();
                r rVarQ4 = j0.c.q(oVar, e1.Min);
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, rVarQ4);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                d11 = d5;
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA4, sVar);
                t.J(j.f56916e, q1VarL5, sVar);
                hVar = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                itO = d.o(sVar, rVarC5, j.f56915d, -794841492, list2);
                i13 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List listW1 = q.W0((String) next, new String[]{"\n"}, 0, 6);
                    String str8 = (String) listW1.get(0);
                    String str9 = (String) listW1.get(1);
                    str = (String) listW1.get(2);
                    if (i13 == 1) {
                        str2 = (String) q.W0((CharSequence) q.W0((CharSequence) list2.get(0), new String[]{"\n"}, 0, 6).get(0), new String[]{" "}, 0, 6).get(1);
                    } else {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    Iterator it3 = it;
                    List list5 = list2;
                    String str10 = str2;
                    if (1.0f <= d11) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarB2 = d2.h.b(e2.c(new i1(1.0f, true), 1.0f), f.d(4));
                    if ((i15 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | sVar.f(str);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new in.h(cVar, str, 12);
                        sVar.o0(objQ);
                    } else {
                        objQ = new in.h(cVar, str, 12);
                        sVar.o0(objQ);
                    }
                    p(str8, str9, str10, d0.n.o(rVarB2, false, null, (fz.a) objQ, 15), sVar, 0);
                    i13 = i14;
                    it = it3;
                    list2 = list5;
                }
                sVar.p(false);
                sVar.p(true);
                d5 = d11;
                it = it;
            }
            cVar2 = cVar;
            sVar.p(false);
            b("Note: The letters Q q, V v, and X x are only used in loanwords (e.g. quiz, vlog) or abbreviations (e.g., a word starting with ks- being abbreviated as x.).", sVar, 6);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar2, i11, 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:52:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0215  */
    /* JADX WARN: Code duplicated, block: B:71:0x021f  */
    /* JADX WARN: Code duplicated, block: B:74:0x023a  */
    /* JADX WARN: Code duplicated, block: B:75:0x023c  */
    /* JADX WARN: Code duplicated, block: B:81:0x024f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0139 A[EDGE_INSN: B:92:0x0139->B:46:0x0139 BREAK  A[LOOP:0: B:39:0x0115->B:45:0x0128], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0277 A[SYNTHETIC] */
    public static final void f(fz.c cVar, n nVar, int i11) {
        fz.c cVar2;
        Object obj;
        List<List> list;
        int iHashCode;
        int length;
        int i12;
        double d5;
        char c11;
        int iHashCode2;
        y2.i iVar;
        double d11;
        h hVar;
        Iterator itO;
        int i13;
        Object next;
        int i14;
        String str;
        String str2;
        boolean z11;
        boolean zF;
        Object objQ;
        z1.i iVar2 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(1486639891);
        int i15 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i15 & 1, (i15 & 3) != 2)) {
            Object objQ2 = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ2 == gVar) {
                obj = objQ2;
                String[] strArr = {"Digraph", "Example"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ2;
            String[] strArr2 = (String[]) obj;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = ry.m.g1(q.W0("ch\n/x/\n[pol-f-zy-ch]\ttrochę\na little\n[pol-f-zy-troche]\tcz\n/ʈ͡ʂ/\n[pol-f-zy-cz]\tczy\nor\n[pol-f-zy-czy]\tdz\n/d͡z/\n[pol-f-zy-dz]\tdzwon\nbell\n[pol-f-zy-dzwon]\tdź\n/d͡ʑ/\n[pol-f-zy-dz-1]\tdźwięk\nsound\n[pol-f-zy-dzwiek]\tdż\n/d͡ʐ/\n[pol-f-zy-dz-2]\tdżem\njam\n[pol-f-zy-dzem]\trz\n/ʐ/\n[pol-f-zy-rz]\tdobrze\nwell\n[pol-f-zy-dobrze]\tsz\n/ʂ/\n[pol-f-zy-sz]\tproszę\nplease\n[pol-f-zy-prosze]", new String[]{"\t"}, 0, 6), 2, 2);
                sVar.o0(objQ3);
            }
            List list2 = (List) objQ3;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar3 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S) {
                list = list2;
            } else {
                list = list2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                h hVar5 = j.f56915d;
                t.J(hVar5, rVarC, sVar);
                m("Digraphs", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                sVar.d0(-1686041341);
                length = strArr2.length;
                i12 = 0;
                while (true) {
                    d5 = 0.0d;
                    c11 = 0;
                    if (i12 < length) {
                        break;
                    }
                    String str3 = strArr2[i12];
                    if (1.0f > 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    o(0, str3, sVar, e2.c(new i1(1.0f, true), 1.0f));
                    i12++;
                }
                sVar.p(false);
                sVar.p(true);
                sVar.d0(58206387);
                for (List list3 : list) {
                    r rVarQ2 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC3 = z1.a.c(sVar, rVarQ2);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    d11 = d5;
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA2, sVar);
                    t.J(j.f56916e, q1VarL3, sVar);
                    hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    itO = d.o(sVar, rVarC3, j.f56915d, -703002470, list3);
                    i13 = 0;
                    while (itO.hasNext()) {
                        next = itO.next();
                        i14 = i13 + 1;
                        if (i13 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        List listW0 = q.W0((String) next, new String[]{"\n"}, 0, 6);
                        String str4 = (String) listW0.get(0);
                        String str5 = (String) listW0.get(1);
                        str = (String) listW0.get(2);
                        if (i13 == 1) {
                            str2 = (String) q.W0((CharSequence) q.W0((CharSequence) list3.get(0), new String[]{"\n"}, 0, 6).get(0), new String[]{" "}, 0, 6).get(0);
                        } else {
                            str2 = BuildConfig.VERSION_NAME;
                        }
                        String str6 = str2;
                        z1.o oVar2 = oVar;
                        if (1.0f <= d11) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        r rVarB = d2.h.b(e2.c(new i1(1.0f, true), 1.0f), f.d(4));
                        if ((i15 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | sVar.f(str);
                        objQ = sVar.Q();
                        if (zF || objQ == gVar) {
                            objQ = new in.h(cVar, str, 6);
                            sVar.o0(objQ);
                        }
                        p(str4, str5, str6, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 0);
                        i13 = i14;
                        oVar = oVar2;
                        c11 = 0;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    oVar = oVar;
                    c11 = c11;
                    d5 = d11;
                }
                cVar2 = cVar;
                sVar.p(false);
                sVar.p(true);
            }
            e.A(iHashCode3, sVar, iHashCode3, hVar4);
            h hVar6 = j.f56915d;
            t.J(hVar6, rVarC, sVar);
            m("Digraphs", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ3 = j0.c.q(oVar, e1.Min);
            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarQ3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA3, sVar);
            t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar6, rVarC4, sVar);
            sVar.d0(-1686041341);
            length = strArr2.length;
            i12 = 0;
            while (true) {
                d5 = 0.0d;
                c11 = 0;
                if (i12 < length) {
                    break;
                    break;
                }
                String str7 = strArr2[i12];
                if (1.0f > 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                o(0, str7, sVar, e2.c(new i1(1.0f, true), 1.0f));
                i12++;
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(58206387);
            while (r0.hasNext()) {
                r rVarQ4 = j0.c.q(oVar, e1.Min);
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, rVarQ4);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                d11 = d5;
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA4, sVar);
                t.J(j.f56916e, q1VarL5, sVar);
                hVar = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                itO = d.o(sVar, rVarC5, j.f56915d, -703002470, list3);
                i13 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List listW1 = q.W0((String) next, new String[]{"\n"}, 0, 6);
                    String str8 = (String) listW1.get(0);
                    String str9 = (String) listW1.get(1);
                    str = (String) listW1.get(2);
                    if (i13 == 1) {
                        str2 = (String) q.W0((CharSequence) q.W0((CharSequence) list3.get(0), new String[]{"\n"}, 0, 6).get(0), new String[]{" "}, 0, 6).get(0);
                    } else {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    String str10 = str2;
                    z1.o oVar3 = oVar;
                    if (1.0f <= d11) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarB2 = d2.h.b(e2.c(new i1(1.0f, true), 1.0f), f.d(4));
                    if ((i15 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | sVar.f(str);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new in.h(cVar, str, 6);
                        sVar.o0(objQ);
                    } else {
                        objQ = new in.h(cVar, str, 6);
                        sVar.o0(objQ);
                    }
                    p(str8, str9, str10, d0.n.o(rVarB2, false, null, (fz.a) objQ, 15), sVar, 0);
                    i13 = i14;
                    oVar = oVar3;
                    c11 = 0;
                }
                sVar.p(false);
                sVar.p(true);
                oVar = oVar;
                c11 = c11;
                d5 = d11;
            }
            cVar2 = cVar;
            sVar.p(false);
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar2, i11, 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x0301  */
    /* JADX WARN: Code duplicated, block: B:124:0x0352 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0334 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0116  */
    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0135  */
    /* JADX WARN: Code duplicated, block: B:44:0x0149  */
    /* JADX WARN: Code duplicated, block: B:47:0x0158  */
    /* JADX WARN: Code duplicated, block: B:52:0x0182  */
    /* JADX WARN: Code duplicated, block: B:54:0x018a  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x01da  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:72:0x0201  */
    /* JADX WARN: Code duplicated, block: B:74:0x0217  */
    /* JADX WARN: Code duplicated, block: B:77:0x024b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0254  */
    /* JADX WARN: Code duplicated, block: B:82:0x025a  */
    /* JADX WARN: Code duplicated, block: B:85:0x0271  */
    /* JADX WARN: Code duplicated, block: B:86:0x0273  */
    /* JADX WARN: Code duplicated, block: B:90:0x0281  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d5  */
    public static final void h(fz.c cVar, n nVar, int i11) {
        Object obj;
        List list;
        int iHashCode;
        int i12;
        Iterator it;
        int i13;
        Object next;
        int i14;
        int iHashCode2;
        y2.i iVar;
        h hVar;
        Iterator itO;
        int i15;
        Object next2;
        int i16;
        String str;
        float f5;
        boolean z11;
        boolean zF;
        Object objQ;
        float f11;
        boolean z12;
        boolean zF2;
        Object objQ2;
        z1.i iVar2 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(-382467852);
        int i17 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i17 & 1, (i17 & 3) != 2)) {
            Object objQ3 = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ3 == gVar) {
                obj = objQ3;
                String[] strArr = {"Palatalization pattern", "Example"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ3;
            String[] strArr2 = (String[]) obj;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = ry.m.g1(q.W0("/t͡s/ → /t͡ɕ/\n[pol-f-zy-ts-ts-1]\tciepło\nwarm\n[pol-f-zy-cieplo]\t/n/ → /ɲ/\n[pol-f-zy-n-n-1]\tnie\nno\n[pol-f-zy-nie]\t/s/ → /ɕ/\n[pol-f-zy-s-s-1]\tsiedem\nseven\n[pol-f-zy-siedem]\t/z/ → /ʑ/\n[pol-f-zy-z-z-1]\tzimno\ncold\n[pol-f-zy-zimno]\t/d͡z/ → /d͡ʑ/\n[pol-f-zy-dz-dz-1]\tdziękuję\nthank you\n[pol-f-zy-dziekuje]", new String[]{"\t"}, 0, 6), 2, 2);
                sVar.o0(objQ4);
            }
            List list2 = (List) objQ4;
            Object objQ5 = sVar.Q();
            Object obj2 = objQ5;
            if (objQ5 == gVar) {
                String[] strArr3 = {"c", "n", "s", "z", "dz"};
                sVar.o0(strArr3);
                obj2 = strArr3;
            }
            String[] strArr4 = (String[]) obj2;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar3 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S) {
                list = list2;
            } else {
                list = list2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                h hVar5 = j.f56915d;
                t.J(hVar5, rVarC, sVar);
                m("Palatalization", sVar, 6);
                b("In Polish, consonants followed by -i are usually palatalized.", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                sVar.d0(1723538212);
                for (String str2 : strArr2) {
                    r rVarC3 = e2.c(oVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    o(0, str2, sVar, w4.c.p(1.0f, true, rVarC3));
                }
                sVar.p(false);
                sVar.p(true);
                sVar.d0(1613783984);
                it = list.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list3 = (List) next;
                    r rVarQ2 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC4 = z1.a.c(sVar, rVarQ2);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA2, sVar);
                    t.J(j.f56916e, q1VarL3, sVar);
                    hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    itO = d.o(sVar, rVarC4, j.f56915d, -609927024, list3);
                    i15 = 0;
                    while (itO.hasNext()) {
                        next2 = itO.next();
                        i16 = i15 + 1;
                        if (i15 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str = (String) next2;
                        if (i15 != 0) {
                            it = it;
                            iVar2 = iVar2;
                            sVar.d0(-1083503229);
                            String str3 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f5 = Float.MAX_VALUE;
                            } else {
                                f5 = 1.0f;
                            }
                            r rVarB = d2.h.b(e2.c(new i1(f5, true), 1.0f), f.d(4));
                            if ((i17 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF = z11 | sVar.f(str);
                            objQ = sVar.Q();
                            if (zF || objQ == gVar) {
                                objQ = new in.h(cVar, str, 7);
                                sVar.o0(objQ);
                            }
                            p(str3, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i15 != 1) {
                            sVar.d0(-1110191563);
                            sVar.p(false);
                        } else {
                            sVar.d0(-1082850462);
                            String str4 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                            String str5 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(1);
                            String str6 = strArr4[i13];
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f11 = Float.MAX_VALUE;
                            } else {
                                f11 = 1.0f;
                            }
                            r rVarB2 = d2.h.b(e2.c(new i1(f11, true), 1.0f), f.d(4));
                            if ((i17 & 14) == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            zF2 = z12 | sVar.f(str);
                            objQ2 = sVar.Q();
                            if (zF2 || objQ2 == gVar) {
                                objQ2 = new in.h(cVar, str, 8);
                                sVar.o0(objQ2);
                            }
                            p(str4, str5, str6, d0.n.o(rVarB2, false, null, (fz.a) objQ2, 15), sVar, 0);
                            sVar.p(false);
                        }
                        i15 = i16;
                        iVar2 = iVar2;
                        it = it;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    i13 = i14;
                    iVar2 = iVar2;
                    it = it;
                }
                sVar.p(false);
                sVar.p(true);
            }
            e.A(iHashCode3, sVar, iHashCode3, hVar4);
            h hVar6 = j.f56915d;
            t.J(hVar6, rVarC, sVar);
            m("Palatalization", sVar, 6);
            b("In Polish, consonants followed by -i are usually palatalized.", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ3 = j0.c.q(oVar, e1.Min);
            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC5 = z1.a.c(sVar, rVarQ3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA3, sVar);
            t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar6, rVarC5, sVar);
            sVar.d0(1723538212);
            while (i12 < r1) {
                r rVarC6 = e2.c(oVar, 1.0f);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                o(0, str2, sVar, w4.c.p(1.0f, true, rVarC6));
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(1613783984);
            it = list.iterator();
            i13 = 0;
            while (it.hasNext()) {
                next = it.next();
                i14 = i13 + 1;
                if (i13 >= 0) {
                    ns.o.V();
                    throw null;
                }
                List list4 = (List) next;
                r rVarQ4 = j0.c.q(oVar, e1.Min);
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC7 = z1.a.c(sVar, rVarQ4);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA4, sVar);
                t.J(j.f56916e, q1VarL5, sVar);
                hVar = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                itO = d.o(sVar, rVarC7, j.f56915d, -609927024, list4);
                i15 = 0;
                while (itO.hasNext()) {
                    next2 = itO.next();
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str = (String) next2;
                    if (i15 != 0) {
                        it = it;
                        iVar2 = iVar2;
                        sVar.d0(-1083503229);
                        String str7 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f5 = Float.MAX_VALUE;
                        } else {
                            f5 = 1.0f;
                        }
                        r rVarB3 = d2.h.b(e2.c(new i1(f5, true), 1.0f), f.d(4));
                        if ((i17 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | sVar.f(str);
                        objQ = sVar.Q();
                        if (zF) {
                            objQ = new in.h(cVar, str, 7);
                            sVar.o0(objQ);
                        } else {
                            objQ = new in.h(cVar, str, 7);
                            sVar.o0(objQ);
                        }
                        p(str7, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB3, false, null, (fz.a) objQ, 15), sVar, 432);
                        sVar.p(false);
                    } else if (i15 != 1) {
                        sVar.d0(-1110191563);
                        sVar.p(false);
                    } else {
                        sVar.d0(-1082850462);
                        String str8 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                        String str9 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(1);
                        String str10 = strArr4[i13];
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f11 = Float.MAX_VALUE;
                        } else {
                            f11 = 1.0f;
                        }
                        r rVarB4 = d2.h.b(e2.c(new i1(f11, true), 1.0f), f.d(4));
                        if ((i17 & 14) == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zF2 = z12 | sVar.f(str);
                        objQ2 = sVar.Q();
                        if (zF2) {
                            objQ2 = new in.h(cVar, str, 8);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new in.h(cVar, str, 8);
                            sVar.o0(objQ2);
                        }
                        p(str8, str9, str10, d0.n.o(rVarB4, false, null, (fz.a) objQ2, 15), sVar, 0);
                        sVar.p(false);
                    }
                    i15 = i16;
                    iVar2 = iVar2;
                    it = it;
                }
                sVar.p(false);
                sVar.p(true);
                i13 = i14;
                iVar2 = iVar2;
                it = it;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar, i11, 11);
        }
    }

    public static final void i(fz.c cVar, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.f0(-1382679660);
        if ((i11 & 6) == 0) {
            i12 = (sVar.h(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.T(i12 & 1, (i12 & 3) != 2)) {
            float f5 = 16;
            v1 v1Var = new v1(f5, f5, f5, f5);
            boolean z11 = (i12 & 14) == 4;
            Object objQ = sVar.Q();
            if (z11 || objQ == l1.m.f39353a) {
                objQ = new o1(cVar, 24);
                sVar.o0(objQ);
            }
            ue.f.a(null, null, v1Var, null, null, null, false, null, (fz.c) objQ, sVar, 384, 507);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iv.d(cVar, i11, 11);
        }
    }

    public static final void j(qn.a aVar, fz.a aVar2, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(-1482404404);
        int i12 = i11 | 2 | (sVar.h(aVar2) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.Y();
            if ((i11 & 1) == 0 || sVar.C()) {
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, 6);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                aVar = (qn.a) ViewModelKt.viewModel(z.a(qn.a.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, sVar, 0, 0);
            } else {
                sVar.W();
            }
            int i13 = i12 & (-15);
            sVar.q();
            n(((Number) t.o(aVar.f47816b, sVar).getValue()).floatValue(), aVar2, t1.e.d(-241438895, new mt.r(aVar, 6), sVar), sVar, (i13 & 112) | 384);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p(aVar, i11, 20, aVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:37:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x011d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0125  */
    /* JADX WARN: Code duplicated, block: B:49:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x0182  */
    /* JADX WARN: Code duplicated, block: B:52:0x0186  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:67:0x0215  */
    /* JADX WARN: Code duplicated, block: B:71:0x021f  */
    /* JADX WARN: Code duplicated, block: B:74:0x023a  */
    /* JADX WARN: Code duplicated, block: B:75:0x023c  */
    /* JADX WARN: Code duplicated, block: B:81:0x024e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0139 A[EDGE_INSN: B:92:0x0139->B:46:0x0139 BREAK  A[LOOP:0: B:39:0x0115->B:45:0x0128], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0277 A[SYNTHETIC] */
    public static final void k(fz.c cVar, n nVar, int i11) {
        fz.c cVar2;
        Object obj;
        List<List> list;
        int iHashCode;
        int length;
        int i12;
        double d5;
        int iHashCode2;
        y2.i iVar;
        double d11;
        h hVar;
        Iterator itO;
        int i13;
        Object next;
        int i14;
        String str;
        String str2;
        boolean z11;
        boolean zF;
        Object objQ;
        z1.i iVar2 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(-1993139913);
        int i15 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i15 & 1, (i15 & 3) != 2)) {
            Object objQ2 = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ2 == gVar) {
                obj = objQ2;
                String[] strArr = {"Vowel / IPA", "Example"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ2;
            String[] strArr2 = (String[]) obj;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = ry.m.g1(q.W0("A a\n/a/\n[pol-f-zy-a-0]\tpan\nMr.\n[pol-f-zy-pan]\tE e\n/ɛ/\n[pol-f-zy-e-0]\ttelefon\nphone\n[pol-f-zy-telefon]\tI i\n/i/\n[pol-f-zy-i-0]\tpani\nMs.\n[pol-f-zy-pani]\tO o\n/ɔ/\n[pol-f-zy-o-0]\tpolski\nPolish\n[pol-f-zy-polski]\tÓ ó\n/u/\n[pol-f-zy-o-1-0]\tmówić\nto speak\n[pol-f-zy-mowic]\tU u\n/u/\n[pol-f-zy-u-0]\tlubić\nto love\n[pol-f-zy-lubic]\tY y\n/ɪ/\n[pol-f-zy-y-0]\tdobry\ngood\n[pol-f-zy-dobry]", new String[]{"\t"}, 0, 6), 2, 2);
                sVar.o0(objQ3);
            }
            List list2 = (List) objQ3;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar3 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S) {
                list = list2;
            } else {
                list = list2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                h hVar5 = j.f56915d;
                t.J(hVar5, rVarC, sVar);
                m("Vowels", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                sVar.d0(-607475545);
                length = strArr2.length;
                i12 = 0;
                while (true) {
                    d5 = 0.0d;
                    if (i12 < length) {
                        break;
                    }
                    String str3 = strArr2[i12];
                    if (1.0f > 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    o(0, str3, sVar, e2.c(new i1(1.0f, true), 1.0f));
                    i12++;
                }
                sVar.p(false);
                sVar.p(true);
                sVar.d0(-1503970507);
                for (List list3 : list) {
                    r rVarQ2 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC3 = z1.a.c(sVar, rVarQ2);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    d11 = d5;
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA2, sVar);
                    t.J(j.f56916e, q1VarL3, sVar);
                    hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    itO = d.o(sVar, rVarC3, j.f56915d, -1401981762, list3);
                    i13 = 0;
                    while (itO.hasNext()) {
                        next = itO.next();
                        i14 = i13 + 1;
                        if (i13 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        List listW0 = q.W0((String) next, new String[]{"\n"}, 0, 6);
                        String str4 = (String) listW0.get(0);
                        String str5 = (String) listW0.get(1);
                        str = (String) listW0.get(2);
                        if (i13 == 1) {
                            str2 = (String) q.W0((CharSequence) q.W0((CharSequence) list3.get(0), new String[]{"\n"}, 0, 6).get(0), new String[]{" "}, 0, 6).get(1);
                        } else {
                            str2 = BuildConfig.VERSION_NAME;
                        }
                        String str6 = str2;
                        z1.o oVar2 = oVar;
                        if (1.0f <= d11) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        r rVarB = d2.h.b(e2.c(new i1(1.0f, true), 1.0f), f.d(4));
                        if ((i15 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | sVar.f(str);
                        objQ = sVar.Q();
                        if (zF || objQ == gVar) {
                            objQ = new in.h(cVar, str, 14);
                            sVar.o0(objQ);
                        }
                        p(str4, str5, str6, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 0);
                        i13 = i14;
                        oVar = oVar2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    oVar = oVar;
                    d5 = d11;
                }
                cVar2 = cVar;
                sVar.p(false);
                sVar.p(true);
            }
            e.A(iHashCode3, sVar, iHashCode3, hVar4);
            h hVar6 = j.f56915d;
            t.J(hVar6, rVarC, sVar);
            m("Vowels", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ3 = j0.c.q(oVar, e1.Min);
            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarQ3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA3, sVar);
            t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar6, rVarC4, sVar);
            sVar.d0(-607475545);
            length = strArr2.length;
            i12 = 0;
            while (true) {
                d5 = 0.0d;
                if (i12 < length) {
                    break;
                    break;
                }
                String str7 = strArr2[i12];
                if (1.0f > 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                o(0, str7, sVar, e2.c(new i1(1.0f, true), 1.0f));
                i12++;
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(-1503970507);
            while (r0.hasNext()) {
                r rVarQ4 = j0.c.q(oVar, e1.Min);
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, rVarQ4);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                d11 = d5;
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA4, sVar);
                t.J(j.f56916e, q1VarL5, sVar);
                hVar = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                itO = d.o(sVar, rVarC5, j.f56915d, -1401981762, list3);
                i13 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List listW1 = q.W0((String) next, new String[]{"\n"}, 0, 6);
                    String str8 = (String) listW1.get(0);
                    String str9 = (String) listW1.get(1);
                    str = (String) listW1.get(2);
                    if (i13 == 1) {
                        str2 = (String) q.W0((CharSequence) q.W0((CharSequence) list3.get(0), new String[]{"\n"}, 0, 6).get(0), new String[]{" "}, 0, 6).get(1);
                    } else {
                        str2 = BuildConfig.VERSION_NAME;
                    }
                    String str10 = str2;
                    z1.o oVar3 = oVar;
                    if (1.0f <= d11) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    r rVarB2 = d2.h.b(e2.c(new i1(1.0f, true), 1.0f), f.d(4));
                    if ((i15 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | sVar.f(str);
                    objQ = sVar.Q();
                    if (zF) {
                        objQ = new in.h(cVar, str, 14);
                        sVar.o0(objQ);
                    } else {
                        objQ = new in.h(cVar, str, 14);
                        sVar.o0(objQ);
                    }
                    p(str8, str9, str10, d0.n.o(rVarB2, false, null, (fz.a) objQ, 15), sVar, 0);
                    i13 = i14;
                    oVar = oVar3;
                }
                sVar.p(false);
                sVar.p(true);
                oVar = oVar;
                d5 = d11;
            }
            cVar2 = cVar;
            sVar.p(false);
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar2, i11, 17);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:44:0x013b  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0174  */
    /* JADX WARN: Code duplicated, block: B:54:0x017d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x015b A[EDGE_INSN: B:71:0x015b->B:49:0x015b BREAK  A[LOOP:0: B:42:0x0137->B:48:0x0150], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e7 A[SYNTHETIC] */
    public static final void l(fz.c cVar, n nVar, int i11) {
        Object obj;
        List list;
        int iHashCode;
        int length;
        int i12;
        float f5;
        int i13;
        int i14;
        String str;
        boolean z11;
        boolean zF;
        Object objQ;
        s sVar = (s) nVar;
        sVar.f0(-1150969);
        int i15 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i15 & 1, (i15 & 3) != 2)) {
            Object objQ2 = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ2 == gVar) {
                obj = objQ2;
                String[] strArr = {"Examples"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ2;
            String[] strArr2 = (String[]) obj;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = q.W0("uczyć\nto teach (imperfective)\n[pol-f-zy-uczyc]\tnauczyć\nto teach (perfective)\n[pol-f-zy-nauczyc]\tnauczyciel\nmale teacher\n[pol-f-zy-nauczyciel]\tnauczycielka\nfemale teacher\n[pol-f-zy-nauczycielka]", new String[]{"\t"}, 0, 6);
                sVar.o0(objQ3);
            }
            List list2 = (List) objQ3;
            Object objQ4 = sVar.Q();
            Object obj2 = objQ4;
            if (objQ4 == gVar) {
                String[] strArr3 = {"u", "u", "czy", "ciel"};
                sVar.o0(strArr3);
                obj2 = strArr3;
            }
            String[] strArr4 = (String[]) obj2;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            h hVar = j.f56917f;
            t.J(hVar, uVarA, sVar);
            h hVar2 = j.f56916e;
            t.J(hVar2, q1VarL, sVar);
            h hVar3 = j.f56918g;
            if (sVar.S) {
                list = list2;
            } else {
                list = list2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                h hVar4 = j.f56915d;
                t.J(hVar4, rVarC, sVar);
                m("Word stress", sVar, 6);
                b("In Polish, stress usually falls on the second-to-last syllable.", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar, a2VarA, sVar);
                t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                t.J(hVar4, rVarC2, sVar);
                sVar.d0(1076727415);
                length = strArr2.length;
                i12 = 0;
                while (true) {
                    f5 = 1.0f;
                    if (i12 < length) {
                        break;
                    }
                    String str2 = strArr2[i12];
                    r rVarC3 = e2.c(oVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    o(0, str2, sVar, w4.c.p(1.0f, true, rVarC3));
                    i12++;
                }
                sVar.p(false);
                sVar.p(true);
                sVar.d0(-2045968419);
                i13 = 0;
                for (Object obj3 : list) {
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str = (String) obj3;
                    String str3 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                    String str4 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(1);
                    String str5 = strArr4[i13];
                    r rVarB = d2.h.b(e2.e(oVar, f5), f.d(4));
                    if ((i15 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zF = z11 | sVar.f(str);
                    objQ = sVar.Q();
                    if (zF || objQ == gVar) {
                        objQ = new in.h(cVar, str, 11);
                        sVar.o0(objQ);
                    }
                    p(str3, str4, str5, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 0);
                    i13 = i14;
                    f5 = 1.0f;
                }
                sVar.p(false);
                sVar.p(true);
            }
            e.A(iHashCode2, sVar, iHashCode2, hVar3);
            h hVar5 = j.f56915d;
            t.J(hVar5, rVarC, sVar);
            m("Word stress", sVar, 6);
            b("In Polish, stress usually falls on the second-to-last syllable.", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ2 = j0.c.q(oVar, e1.Min);
            a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            r rVarC4 = z1.a.c(sVar, rVarQ2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar, a2VarA2, sVar);
            t.J(hVar2, q1VarL3, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            t.J(hVar5, rVarC4, sVar);
            sVar.d0(1076727415);
            length = strArr2.length;
            i12 = 0;
            while (true) {
                f5 = 1.0f;
                if (i12 < length) {
                    break;
                    break;
                }
                String str6 = strArr2[i12];
                r rVarC5 = e2.c(oVar, 1.0f);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                o(0, str6, sVar, w4.c.p(1.0f, true, rVarC5));
                i12++;
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(-2045968419);
            i13 = 0;
            while (r10.hasNext()) {
                i14 = i13 + 1;
                if (i13 >= 0) {
                    ns.o.V();
                    throw null;
                }
                str = (String) obj3;
                String str7 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                String str8 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(1);
                String str9 = strArr4[i13];
                r rVarB2 = d2.h.b(e2.e(oVar, f5), f.d(4));
                if ((i15 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zF = z11 | sVar.f(str);
                objQ = sVar.Q();
                if (zF) {
                    objQ = new in.h(cVar, str, 11);
                    sVar.o0(objQ);
                } else {
                    objQ = new in.h(cVar, str, 11);
                    sVar.o0(objQ);
                }
                p(str7, str8, str9, d0.n.o(rVarB2, false, null, (fz.a) objQ, 15), sVar, 0);
                i13 = i14;
                f5 = 1.0f;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar, i11, 13);
        }
    }

    public static final void m(String str, n nVar, int i11) {
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.f0(-593903700);
        if (sVar2.T(i11 & 1, (i11 & 3) != 2)) {
            sVar = sVar2;
            ua.b(str, j0.c.E(z1.o.f58481a, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 54, 0, 65532);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e0(str, i11, 24);
        }
    }

    public static final void n(float f5, fz.a onClickClose, t1.d dVar, n nVar, int i11) {
        int i12;
        m.f(onClickClose, "onClickClose");
        s sVar = (s) nVar;
        sVar.f0(1356566751);
        if ((i11 & 6) == 0) {
            i12 = (sVar.c(f5) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(onClickClose) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.h(dVar) ? 256 : 128;
        }
        if (!sVar.T(i12 & 1, (i12 & 147) != 146)) {
            sVar.W();
        } else if (f5 < 1.0f) {
            sVar.d0(2132985597);
            tv.a.g(f5, null, sVar, i12 & 14, 6);
            sVar.p(false);
        } else {
            sVar.d0(2133071622);
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            r rVarC = z1.a.c(sVar, z1.o.f58481a);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(j.f56917f, uVarA, sVar);
            t.J(j.f56916e, q1VarL, sVar);
            h hVar = j.f56918g;
            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar);
            h1.e0.c(a.f43859c, null, t1.e.d(-2110753973, new lt.g(onClickClose, 12, (byte) 0), sVar), null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, null, sVar, 390, 250);
            dVar.invoke(sVar, Integer.valueOf((i12 >> 6) & 14));
            sVar.p(true);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new w4(f5, onClickClose, dVar, i11, 1);
        }
    }

    public static final void o(int i11, String header, n nVar, r rVar) {
        s sVar;
        m.f(header, "header");
        s sVar2 = (s) nVar;
        sVar2.f0(1584258109);
        int i12 = i11 | (sVar2.f(header) ? 4 : 2) | (sVar2.f(rVar) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            r rVarA = j0.c.A(e2.i(d0.n.h(j0.c.A(rVar, 1), i.k(sVar2, R.color.colorAccent), f.d(4)), 42, CropImageView.DEFAULT_ASPECT_RATIO, 2), 6);
            q0 q0VarD = o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarA);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(j.f56917f, q0VarD, sVar2);
            t.J(j.f56916e, q1VarL, sVar2);
            h hVar = j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar2);
            ua.b(header, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.white), j3.A(14), n3.s.K, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar2, i12 & 14, 0, 65534);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.a(header, rVar, i11, 6);
        }
    }

    public static final void p(String str, String str2, String str3, r rVar, n nVar, int i11) {
        s sVar;
        boolean z11;
        s sVar2 = (s) nVar;
        sVar2.f0(-1973846045);
        int i12 = (i11 & 6) == 0 ? (sVar2.f(str) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.f(str2) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(str3) ? 256 : 128;
        }
        int i13 = i12 | (sVar2.f(rVar) ? 2048 : 1024);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            r rVarA = j0.c.A(d0.n.h(j0.c.A(rVar, 1), i.k(sVar2, R.color.white), f.d(4)), 8);
            u uVarA = j0.t.a(j0.i.f35307e, z1.c.P, sVar2, 54);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            r rVarC = z1.a.c(sVar2, rVarA);
            k.J.getClass();
            y2.i iVar = j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            t.J(j.f56917f, uVarA, sVar2);
            t.J(j.f56916e, q1VarL, sVar2);
            h hVar = j.f56918g;
            if (sVar2.S || !m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            t.J(j.f56915d, rVarC, sVar2);
            if (str.length() > 0) {
                sVar2.d0(-213724507);
                sVar2.d0(-6893244);
                StringBuilder sb2 = new StringBuilder(16);
                new ArrayList();
                ArrayList arrayList = new ArrayList();
                new ArrayList();
                sb2.append(str);
                if (!q.K0(str3)) {
                    sVar2.d0(1166527955);
                    int i14 = 0;
                    while (true) {
                        int iF0 = q.F0(str, str3, i14, true);
                        if (iF0 == -1) {
                            break;
                        }
                        int length = str3.length() + iF0;
                        arrayList.add(new j3.d(iF0, length, 8, new p0(i.k(sVar2, R.color.colorAccent), 0L, n3.s.K, (n3.o) null, (n3.p) null, (n3.i) null, (String) null, 0L, (u3.a) null, (u3.p) null, (q3.b) null, 0L, (l) null, (v0) null, 65530), null));
                        i14 = length;
                    }
                } else {
                    sVar2.d0(1131894786);
                }
                sVar2.p(false);
                String string = sb2.toString();
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i15 = 0; i15 < size; i15++) {
                    arrayList2.add(((j3.d) arrayList.get(i15)).a(sb2.length()));
                }
                j3.h hVar2 = new j3.h(string, arrayList2);
                sVar2.p(false);
                y0 y0VarA = y0.a((y0) sVar2.j(ua.f31167a), i.k(sVar2, R.color.primary_black), j3.A(18), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444);
                z11 = false;
                ua.c(hVar2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, y0VarA, sVar2, 0, 0, 131070);
                sVar = sVar2;
            } else {
                sVar = sVar2;
                z11 = false;
                sVar.d0(-248222423);
            }
            sVar.p(z11);
            if (str2.length() > 0) {
                sVar.d0(-212413548);
                j0.c.g(sVar, e2.g(z1.o.f58481a, 2));
                s sVar3 = sVar;
                ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), i.k(sVar, R.color.second_black), j3.A(14), null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), sVar3, (i13 >> 3) & 14, 0, 65534);
                sVar = sVar3;
            } else {
                sVar.d0(-248222423);
            }
            sVar.p(z11);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(str, (Object) str2, (Object) str3, (Object) rVar, i11, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x0305  */
    /* JADX WARN: Code duplicated, block: B:124:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x033a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x011a  */
    /* JADX WARN: Code duplicated, block: B:35:0x011e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0139  */
    /* JADX WARN: Code duplicated, block: B:44:0x014d  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0186  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:57:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01de  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:72:0x0205  */
    /* JADX WARN: Code duplicated, block: B:74:0x021b  */
    /* JADX WARN: Code duplicated, block: B:77:0x024f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0258  */
    /* JADX WARN: Code duplicated, block: B:82:0x025e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0275  */
    /* JADX WARN: Code duplicated, block: B:86:0x0277  */
    /* JADX WARN: Code duplicated, block: B:90:0x0285  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:95:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:98:0x02d9  */
    public static final void e(fz.c cVar, n nVar, int i11) {
        Object obj;
        List list;
        int iHashCode;
        int i12;
        Iterator it;
        int i13;
        Object next;
        int i14;
        int iHashCode2;
        y2.i iVar;
        h hVar;
        Iterator itO;
        int i15;
        Object next2;
        int i16;
        String str;
        float f5;
        boolean z11;
        boolean zF;
        Object objQ;
        float f11;
        boolean z12;
        boolean zF2;
        Object objQ2;
        z1.i iVar2 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(760549017);
        int i17 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i17 & 1, (i17 & 3) != 2)) {
            Object objQ3 = sVar.Q();
            g gVar = l1.m.f39353a;
            if (objQ3 == gVar) {
                obj = objQ3;
                String[] strArr = {"Devoicing pattern", "Example"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ3;
            String[] strArr2 = (String[]) obj;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = ry.m.g1(q.W0("/b/ → /p/\n[pol-f-zy-b-p]\tchleb\nbread\n[pol-f-zy-chleb]\t/d/ → /t/\n[pol-f-zy-d-t]\tsłodki\nsweet\n[pol-f-zy-slodki]\t/g/ → /k/\n[pol-f-zy-g-k]\tpociąg\ntrain\n[pol-f-zy-pociag]\t/v/ → /f/\n[pol-f-zy-v-f]\twczoraj\nyesterday\n[pol-f-zy-wczoraj]\t/z/ → /s/\n[pol-f-zy-z-s]\tgaz\ngas\n[pol-f-zy-gaz]\t/ʐ/ → /ʂ/\n[pol-f-zy-rz-sz]\tgorzki\nbitter\n[pol-f-zy-gorzki]", new String[]{"\t"}, 0, 6), 2, 2);
                sVar.o0(objQ4);
            }
            List list2 = (List) objQ4;
            Object objQ5 = sVar.Q();
            Object obj2 = objQ5;
            if (objQ5 == gVar) {
                String[] strArr3 = {"b", "d", "g", "w", "z", "rz"};
                sVar.o0(strArr3);
                obj2 = strArr3;
            }
            String[] strArr4 = (String[]) obj2;
            u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar3 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            h hVar2 = j.f56917f;
            t.J(hVar2, uVarA, sVar);
            h hVar3 = j.f56916e;
            t.J(hVar3, q1VarL, sVar);
            h hVar4 = j.f56918g;
            if (sVar.S) {
                list = list2;
            } else {
                list = list2;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                }
                h hVar5 = j.f56915d;
                t.J(hVar5, rVarC, sVar);
                m("Devoicing", sVar, 6);
                b("“Devoicing” (a normally voiced consonant becoming voiceless) takes place if the consonant is followed by a voiceless consonant or if the consonant occurs at the end of the word.", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                t.J(hVar2, a2VarA, sVar);
                t.J(hVar3, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar4);
                }
                t.J(hVar5, rVarC2, sVar);
                sVar.d0(1229221269);
                for (String str2 : strArr2) {
                    r rVarC3 = e2.c(oVar, 1.0f);
                    if (1.0f <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    o(0, str2, sVar, w4.c.p(1.0f, true, rVarC3));
                }
                sVar.p(false);
                sVar.p(true);
                sVar.d0(-534058167);
                it = list.iterator();
                i13 = 0;
                while (it.hasNext()) {
                    next = it.next();
                    i14 = i13 + 1;
                    if (i13 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    List list3 = (List) next;
                    r rVarQ2 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA2 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                    iHashCode2 = Long.hashCode(sVar.T);
                    q1 q1VarL3 = sVar.l();
                    r rVarC4 = z1.a.c(sVar, rVarQ2);
                    k.J.getClass();
                    iVar = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA2, sVar);
                    t.J(j.f56916e, q1VarL3, sVar);
                    hVar = j.f56918g;
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                        e.A(iHashCode2, sVar, iHashCode2, hVar);
                    }
                    itO = d.o(sVar, rVarC4, j.f56915d, -54252945, list3);
                    i15 = 0;
                    while (itO.hasNext()) {
                        next2 = itO.next();
                        i16 = i15 + 1;
                        if (i15 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str = (String) next2;
                        if (i15 != 0) {
                            it = it;
                            iVar2 = iVar2;
                            sVar.d0(2035702672);
                            String str3 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f5 = Float.MAX_VALUE;
                            } else {
                                f5 = 1.0f;
                            }
                            r rVarB = d2.h.b(e2.c(new i1(f5, true), 1.0f), f.d(4));
                            if ((i17 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            zF = z11 | sVar.f(str);
                            objQ = sVar.Q();
                            if (zF || objQ == gVar) {
                                objQ = new in.h(cVar, str, 9);
                                sVar.o0(objQ);
                            }
                            p(str3, BuildConfig.VERSION_NAME, DytezVyM.RtMUpwpeEATygj, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i15 != 1) {
                            sVar.d0(2005889538);
                            sVar.p(false);
                        } else {
                            sVar.d0(2036355439);
                            String str4 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                            String str5 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(1);
                            String str6 = strArr4[i13];
                            if (1.0f <= 0.0d) {
                                k0.a.a("invalid weight; must be greater than zero");
                            }
                            if (1.0f > Float.MAX_VALUE) {
                                f11 = Float.MAX_VALUE;
                            } else {
                                f11 = 1.0f;
                            }
                            r rVarB2 = d2.h.b(e2.c(new i1(f11, true), 1.0f), f.d(4));
                            if ((i17 & 14) == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            zF2 = z12 | sVar.f(str);
                            objQ2 = sVar.Q();
                            if (zF2 || objQ2 == gVar) {
                                objQ2 = new in.h(cVar, str, 10);
                                sVar.o0(objQ2);
                            }
                            p(str4, str5, str6, d0.n.o(rVarB2, false, null, (fz.a) objQ2, 15), sVar, 0);
                            sVar.p(false);
                        }
                        i15 = i16;
                        iVar2 = iVar2;
                        it = it;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    i13 = i14;
                    iVar2 = iVar2;
                    it = it;
                }
                sVar.p(false);
                sVar.p(true);
            }
            e.A(iHashCode3, sVar, iHashCode3, hVar4);
            h hVar6 = j.f56915d;
            t.J(hVar6, rVarC, sVar);
            m("Devoicing", sVar, 6);
            b("“Devoicing” (a normally voiced consonant becoming voiceless) takes place if the consonant is followed by a voiceless consonant or if the consonant occurs at the end of the word.", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ3 = j0.c.q(oVar, e1.Min);
            a2 a2VarA3 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            r rVarC5 = z1.a.c(sVar, rVarQ3);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            t.J(hVar2, a2VarA3, sVar);
            t.J(hVar3, q1VarL4, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar4);
            }
            t.J(hVar6, rVarC5, sVar);
            sVar.d0(1229221269);
            while (i12 < r1) {
                r rVarC6 = e2.c(oVar, 1.0f);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                o(0, str2, sVar, w4.c.p(1.0f, true, rVarC6));
            }
            sVar.p(false);
            sVar.p(true);
            sVar.d0(-534058167);
            it = list.iterator();
            i13 = 0;
            while (it.hasNext()) {
                next = it.next();
                i14 = i13 + 1;
                if (i13 >= 0) {
                    ns.o.V();
                    throw null;
                }
                List list4 = (List) next;
                r rVarQ4 = j0.c.q(oVar, e1.Min);
                a2 a2VarA4 = z1.a(j0.i.f35303a, iVar2, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC7 = z1.a.c(sVar, rVarQ4);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA4, sVar);
                t.J(j.f56916e, q1VarL5, sVar);
                hVar = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                } else {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                itO = d.o(sVar, rVarC7, j.f56915d, -54252945, list4);
                i15 = 0;
                while (itO.hasNext()) {
                    next2 = itO.next();
                    i16 = i15 + 1;
                    if (i15 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str = (String) next2;
                    if (i15 != 0) {
                        it = it;
                        iVar2 = iVar2;
                        sVar.d0(2035702672);
                        String str7 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f5 = Float.MAX_VALUE;
                        } else {
                            f5 = 1.0f;
                        }
                        r rVarB3 = d2.h.b(e2.c(new i1(f5, true), 1.0f), f.d(4));
                        if ((i17 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        zF = z11 | sVar.f(str);
                        objQ = sVar.Q();
                        if (zF) {
                            objQ = new in.h(cVar, str, 9);
                            sVar.o0(objQ);
                        } else {
                            objQ = new in.h(cVar, str, 9);
                            sVar.o0(objQ);
                        }
                        p(str7, BuildConfig.VERSION_NAME, DytezVyM.RtMUpwpeEATygj, d0.n.o(rVarB3, false, null, (fz.a) objQ, 15), sVar, 432);
                        sVar.p(false);
                    } else if (i15 != 1) {
                        sVar.d0(2005889538);
                        sVar.p(false);
                    } else {
                        sVar.d0(2036355439);
                        String str8 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(0);
                        String str9 = (String) q.W0(str, new String[]{"\n"}, 0, 6).get(1);
                        String str10 = strArr4[i13];
                        if (1.0f <= 0.0d) {
                            k0.a.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f11 = Float.MAX_VALUE;
                        } else {
                            f11 = 1.0f;
                        }
                        r rVarB4 = d2.h.b(e2.c(new i1(f11, true), 1.0f), f.d(4));
                        if ((i17 & 14) == 4) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zF2 = z12 | sVar.f(str);
                        objQ2 = sVar.Q();
                        if (zF2) {
                            objQ2 = new in.h(cVar, str, 10);
                            sVar.o0(objQ2);
                        } else {
                            objQ2 = new in.h(cVar, str, 10);
                            sVar.o0(objQ2);
                        }
                        p(str8, str9, str10, d0.n.o(rVarB4, false, null, (fz.a) objQ2, 15), sVar, 0);
                        sVar.p(false);
                    }
                    i15 = i16;
                    iVar2 = iVar2;
                    it = it;
                }
                sVar.p(false);
                sVar.p(true);
                i13 = i14;
                iVar2 = iVar2;
                it = it;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar, i11, 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0385  */
    /* JADX WARN: Code duplicated, block: B:106:0x0397  */
    /* JADX WARN: Code duplicated, block: B:109:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:110:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:113:0x03be A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:119:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:120:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:123:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0406  */
    /* JADX WARN: Code duplicated, block: B:127:0x0434  */
    /* JADX WARN: Code duplicated, block: B:128:0x0449  */
    /* JADX WARN: Code duplicated, block: B:132:0x045e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0491  */
    /* JADX WARN: Code duplicated, block: B:135:0x0495  */
    /* JADX WARN: Code duplicated, block: B:138:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:140:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:146:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:148:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:150:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:152:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:153:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:155:0x0528  */
    /* JADX WARN: Code duplicated, block: B:156:0x052a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0539 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x053b  */
    /* JADX WARN: Code duplicated, block: B:162:0x0564  */
    /* JADX WARN: Code duplicated, block: B:164:0x0592  */
    /* JADX WARN: Code duplicated, block: B:165:0x0594  */
    /* JADX WARN: Code duplicated, block: B:168:0x05a0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:171:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x063e  */
    /* JADX WARN: Code duplicated, block: B:179:0x0642  */
    /* JADX WARN: Code duplicated, block: B:182:0x0655  */
    /* JADX WARN: Code duplicated, block: B:185:0x0666  */
    /* JADX WARN: Code duplicated, block: B:189:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:190:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:193:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:195:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:198:0x06df  */
    /* JADX WARN: Code duplicated, block: B:202:0x0705  */
    /* JADX WARN: Code duplicated, block: B:204:0x0734  */
    /* JADX WARN: Code duplicated, block: B:205:0x0738  */
    /* JADX WARN: Code duplicated, block: B:208:0x074b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0759  */
    /* JADX WARN: Code duplicated, block: B:214:0x076c  */
    /* JADX WARN: Code duplicated, block: B:216:0x0774  */
    /* JADX WARN: Code duplicated, block: B:218:0x0779  */
    /* JADX WARN: Code duplicated, block: B:220:0x077c  */
    /* JADX WARN: Code duplicated, block: B:222:0x077f  */
    /* JADX WARN: Code duplicated, block: B:223:0x079b  */
    /* JADX WARN: Code duplicated, block: B:225:0x07d2  */
    /* JADX WARN: Code duplicated, block: B:226:0x07d4  */
    /* JADX WARN: Code duplicated, block: B:229:0x07e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:232:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:234:0x081b  */
    /* JADX WARN: Code duplicated, block: B:236:0x0844  */
    /* JADX WARN: Code duplicated, block: B:237:0x0846  */
    /* JADX WARN: Code duplicated, block: B:240:0x0852 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0854  */
    /* JADX WARN: Code duplicated, block: B:243:0x087f  */
    /* JADX WARN: Code duplicated, block: B:256:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:258:0x05f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x08b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0102  */
    /* JADX WARN: Code duplicated, block: B:32:0x0106  */
    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x0132  */
    /* JADX WARN: Code duplicated, block: B:43:0x0144  */
    /* JADX WARN: Code duplicated, block: B:46:0x0152  */
    /* JADX WARN: Code duplicated, block: B:50:0x0195  */
    /* JADX WARN: Code duplicated, block: B:51:0x0199  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:59:0x0214  */
    /* JADX WARN: Code duplicated, block: B:60:0x0218  */
    /* JADX WARN: Code duplicated, block: B:65:0x0233  */
    /* JADX WARN: Code duplicated, block: B:68:0x0259  */
    /* JADX WARN: Code duplicated, block: B:69:0x025d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0278  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0310  */
    /* JADX WARN: Code duplicated, block: B:87:0x0312  */
    /* JADX WARN: Code duplicated, block: B:90:0x0319  */
    /* JADX WARN: Code duplicated, block: B:93:0x031e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0323  */
    /* JADX WARN: Code duplicated, block: B:98:0x0374  */
    /* JADX WARN: Code duplicated, block: B:99:0x0378  */
    public static final void g(fz.c cVar, n nVar, int i11) {
        fz.c cVar2;
        Object obj;
        Float[] fArr;
        int iHashCode;
        int length;
        int i12;
        int i13;
        int iHashCode2;
        y2.i iVar;
        h hVar;
        c2 c2Var;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        z1.i iVar2;
        float f5;
        int i14;
        boolean z11;
        Object objQ;
        g gVar;
        g gVar2;
        int iHashCode6;
        boolean z12;
        Object objQ2;
        g gVar3;
        fz.c cVar3;
        boolean z13;
        Object objQ3;
        Object objQ4;
        Iterator it;
        z1.i iVar3;
        int iHashCode7;
        y2.i iVar4;
        h hVar2;
        String str;
        int i15;
        int iHashCode8;
        Object objQ5;
        Iterator it2;
        int iHashCode9;
        y2.i iVar5;
        h hVar3;
        Iterator itO;
        int i16;
        Object next;
        int i17;
        String str2;
        int i18;
        boolean z14;
        boolean zF;
        Object objQ6;
        int i19;
        boolean z15;
        boolean zF2;
        Object objQ7;
        z1.i iVar6;
        int iHashCode10;
        y2.i iVar7;
        h hVar4;
        Iterator itO2;
        int i21;
        Object next2;
        int i22;
        String str3;
        z1.i iVar8;
        boolean z16;
        boolean zF3;
        Object objQ8;
        boolean z17;
        boolean zF4;
        Object objQ9;
        float fFloatValue;
        Float fValueOf = Float.valueOf(1.0f);
        z1.h hVar5 = z1.c.O;
        z1.i iVar9 = z1.c.L;
        s sVar = (s) nVar;
        sVar.f0(-1991122812);
        int i23 = i11 | (sVar.h(cVar) ? 4 : 2);
        if (sVar.T(i23 & 1, (i23 & 3) != 2)) {
            Object objQ10 = sVar.Q();
            g gVar4 = l1.m.f39353a;
            if (objQ10 == gVar4) {
                obj = objQ10;
                String[] strArr = {"Letter", "Rule", "IPA", "Example"};
                sVar.o0(strArr);
                obj = strArr;
            }
            obj = objQ10;
            String[] strArr2 = (String[]) obj;
            Object objQ11 = sVar.Q();
            int i24 = 2;
            Object obj2 = objQ11;
            if (objQ11 == gVar4) {
                Float[] fArr2 = {fValueOf, Float.valueOf(1.8f), fValueOf, Float.valueOf(2.0f)};
                sVar.o0(fArr2);
                obj2 = fArr2;
            }
            Float[] fArr3 = (Float[]) obj2;
            u uVarA = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
            int iHashCode11 = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            r rVarC = z1.a.c(sVar, oVar);
            k.J.getClass();
            y2.i iVar10 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar10);
            } else {
                sVar.r0();
            }
            h hVar6 = j.f56917f;
            t.J(hVar6, uVarA, sVar);
            h hVar7 = j.f56916e;
            t.J(hVar7, q1VarL, sVar);
            h hVar8 = j.f56918g;
            if (sVar.S) {
                fArr = fArr3;
            } else {
                fArr = fArr3;
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode11))) {
                }
                h hVar9 = j.f56915d;
                t.J(hVar9, rVarC, sVar);
                m("Nasal vowels", sVar, 6);
                j0.c.g(sVar, e2.g(oVar, 8));
                r rVarQ = j0.c.q(oVar, e1.Min);
                a2 a2VarA = z1.a(j0.i.f35303a, iVar9, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                q1 q1VarL2 = sVar.l();
                r rVarC2 = z1.a.c(sVar, rVarQ);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar10);
                } else {
                    sVar.r0();
                }
                t.J(hVar6, a2VarA, sVar);
                t.J(hVar7, q1VarL2, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    e.A(iHashCode, sVar, iHashCode, hVar8);
                }
                t.J(hVar9, rVarC2, sVar);
                sVar.d0(1033949018);
                length = strArr2.length;
                i12 = 0;
                i13 = 0;
                while (i12 < length) {
                    String str4 = strArr2[i12];
                    int i25 = i13 + 1;
                    fFloatValue = fArr[i13].floatValue();
                    if (fFloatValue <= 0.0d) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    if (fFloatValue > Float.MAX_VALUE) {
                        fFloatValue = Float.MAX_VALUE;
                    }
                    o(0, str4, sVar, e2.c(new i1(fFloatValue, true), 1.0f));
                    i12++;
                    i13 = i25;
                }
                sVar.p(false);
                sVar.p(true);
                e1 e1Var = e1.Min;
                r rVarQ2 = j0.c.q(oVar, e1Var);
                j0.b bVar = j0.i.f35303a;
                a2 a2VarA2 = z1.a(bVar, iVar9, sVar, 0);
                iHashCode2 = Long.hashCode(sVar.T);
                q1 q1VarL3 = sVar.l();
                r rVarC3 = z1.a.c(sVar, rVarQ2);
                k.J.getClass();
                iVar = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                h hVar10 = j.f56917f;
                t.J(hVar10, a2VarA2, sVar);
                h hVar11 = j.f56916e;
                t.J(hVar11, q1VarL3, sVar);
                hVar = j.f56918g;
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    e.A(iHashCode2, sVar, iHashCode2, hVar);
                }
                h hVar12 = j.f56915d;
                t.J(hVar12, rVarC3, sVar);
                c2Var = c2.f35266a;
                p("Ą ą", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                r rVarA = c2Var.a(oVar, 4.8f);
                j0.d dVar = j0.i.f35305c;
                u uVarA2 = j0.t.a(dVar, hVar5, sVar, 0);
                iHashCode3 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                r rVarC4 = z1.a.c(sVar, rVarA);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar10, uVarA2, sVar);
                t.J(hVar11, q1VarL4, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    e.A(iHashCode3, sVar, iHashCode3, hVar);
                }
                t.J(hVar12, rVarC4, sVar);
                r rVarQ3 = j0.c.q(oVar, e1Var);
                a2 a2VarA3 = z1.a(bVar, iVar9, sVar, 0);
                iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL5 = sVar.l();
                r rVarC5 = z1.a.c(sVar, rVarQ3);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar10, a2VarA3, sVar);
                t.J(hVar11, q1VarL5, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    e.A(iHashCode4, sVar, iHashCode4, hVar);
                }
                t.J(hVar12, rVarC5, sVar);
                r rVarA2 = c2Var.a(oVar, 1.8f);
                u uVarA3 = j0.t.a(dVar, hVar5, sVar, 0);
                iHashCode5 = Long.hashCode(sVar.T);
                q1 q1VarL6 = sVar.l();
                r rVarC6 = z1.a.c(sVar, rVarA2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar10, uVarA3, sVar);
                t.J(hVar11, q1VarL6, sVar);
                if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                    e.A(iHashCode5, sVar, iHashCode5, hVar);
                }
                t.J(hVar12, rVarC6, sVar);
                iVar2 = iVar9;
                p(BuildConfig.VERSION_NAME, "single or at the end of word", BuildConfig.VERSION_NAME, v.a(e2.e(oVar, 1.0f), 1.0f), sVar, 438);
                p(BuildConfig.VERSION_NAME, "before ch, f, h, rz, s, sz, ś, w, z, ź or ż", BuildConfig.VERSION_NAME, v.a(e2.e(oVar, 1.0f), 1.0f), sVar, 438);
                sVar.p(true);
                f5 = 4;
                r rVarB = d2.h.b(e2.c(c2Var.a(oVar, 1.0f), 1.0f), f.d(f5));
                i14 = i23 & 14;
                if (i14 == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ = sVar.Q();
                if (z11) {
                    gVar = gVar4;
                } else {
                    gVar = gVar4;
                    if (objQ == gVar) {
                        gVar2 = gVar;
                    }
                    p("/ɔ̃/", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 438);
                    r rVarA3 = c2Var.a(oVar, 2.0f);
                    u uVarA4 = j0.t.a(dVar, hVar5, sVar, 0);
                    iHashCode6 = Long.hashCode(sVar.T);
                    q1 q1VarL7 = sVar.l();
                    r rVarC7 = z1.a.c(sVar, rVarA3);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar10, uVarA4, sVar);
                    t.J(hVar11, q1VarL7, sVar);
                    if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode6))) {
                        e.A(iHashCode6, sVar, iHashCode6, hVar);
                    }
                    t.J(hVar12, rVarC7, sVar);
                    r rVarB2 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
                    if (i14 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    objQ2 = sVar.Q();
                    gVar3 = gVar2;
                    if (!z12 || objQ2 == gVar3) {
                        cVar3 = cVar;
                        objQ2 = new x0(cVar3, 16);
                        sVar.o0(objQ2);
                    } else {
                        cVar3 = cVar;
                    }
                    p("jedną", "one (feminine accusative)", "ą", d0.n.o(rVarB2, false, null, (fz.a) objQ2, 15), sVar, 438);
                    r rVarB3 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
                    if (i14 == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    objQ3 = sVar.Q();
                    if (z13 || objQ3 == gVar3) {
                        objQ3 = new x0(cVar3, 17);
                        sVar.o0(objQ3);
                    }
                    p("mąż", "husband", "ą", d0.n.o(rVarB3, false, null, (fz.a) objQ3, 15), sVar, 438);
                    sVar.p(true);
                    sVar.p(true);
                    objQ4 = sVar.Q();
                    if (objQ4 == gVar3) {
                        objQ4 = ry.m.g1(q.W0("before b or p\t/ɔm/\n[pol-f-zy-a-1-0-2]\tząb\ntooth\n[pol-f-zy-zab]\tbefore c, cz, d, dz, dż or t\t/ɔn/\n[pol-f-zy-a-1-0-3]\tgorąco\nhot\n[pol-f-zy-gorco]\tbefore ć or dź\t/ɔɲ/\n[pol-f-zy-a-1-0-4]\twziąć\nto take\n[pol-f-zy-wziac]\tbefore g or k\t/ɔŋ/\n[pol-f-zy-a-1-0-5]\tpociąg\ntrain\n[pol-f-zy-pociag]", new String[]{"\t"}, 0, 6), 3, 3);
                        sVar.o0(objQ4);
                    }
                    sVar.d0(-62607973);
                    it = ((List) objQ4).iterator();
                    while (it.hasNext()) {
                        List list = (List) it.next();
                        r rVarQ4 = j0.c.q(oVar, e1.Min);
                        iVar6 = iVar2;
                        a2 a2VarA4 = z1.a(j0.i.f35303a, iVar6, sVar, 0);
                        iHashCode10 = Long.hashCode(sVar.T);
                        q1 q1VarL8 = sVar.l();
                        r rVarC8 = z1.a.c(sVar, rVarQ4);
                        k.J.getClass();
                        iVar7 = j.f56913b;
                        sVar.h0();
                        Iterator it3 = it;
                        if (sVar.S) {
                            sVar.k(iVar7);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, a2VarA4, sVar);
                        t.J(j.f56916e, q1VarL8, sVar);
                        hVar4 = j.f56918g;
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode10))) {
                            e.A(iHashCode10, sVar, iHashCode10, hVar4);
                        }
                        itO2 = d.o(sVar, rVarC8, j.f56915d, -1201988101, list);
                        i21 = 0;
                        while (itO2.hasNext()) {
                            next2 = itO2.next();
                            i22 = i21 + 1;
                            if (i21 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            str3 = (String) next2;
                            if (i21 != 0) {
                                iVar8 = iVar6;
                                sVar.d0(-211639773);
                                p(BuildConfig.VERSION_NAME, str3, ypOOxsaJG.vzWqjdDxYeEeCR, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                                sVar.p(false);
                            } else if (i21 != 1) {
                                iVar8 = iVar6;
                                sVar.d0(-211134473);
                                String str5 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                                r rVarB4 = d2.h.b(e2.c(c2Var.a(oVar, 1.0f), 1.0f), f.d(f5));
                                if (i14 == 4) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                zF3 = z16 | sVar.f(str3);
                                objQ8 = sVar.Q();
                                if (zF3 || objQ8 == gVar3) {
                                    objQ8 = new in.h(cVar3, str3, 15);
                                    sVar.o0(objQ8);
                                }
                                p(str5, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB4, false, null, (fz.a) objQ8, 15), sVar, 432);
                                sVar.p(false);
                            } else if (i21 != i24) {
                                sVar.d0(-231198479);
                                sVar.p(false);
                                iVar8 = iVar6;
                            } else {
                                sVar.d0(-210371160);
                                String str6 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                                String str7 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(1);
                                r rVarB5 = d2.h.b(e2.c(c2Var.a(oVar, 2.0f), 1.0f), f.d(f5));
                                if (i14 == 4) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                zF4 = z17 | sVar.f(str3);
                                objQ9 = sVar.Q();
                                if (zF4 || objQ9 == gVar3) {
                                    objQ9 = new in.h(cVar3, str3, 16);
                                    sVar.o0(objQ9);
                                }
                                r rVarO = d0.n.o(rVarB5, false, null, (fz.a) objQ9, 15);
                                iVar8 = iVar6;
                                p(str6, str7, "ą", rVarO, sVar, 384);
                                sVar.p(false);
                            }
                            iVar6 = iVar8;
                            i21 = i22;
                            itO2 = itO2;
                            i24 = 2;
                        }
                        sVar.p(false);
                        sVar.p(true);
                        iVar2 = iVar6;
                        it = it3;
                        i24 = 2;
                    }
                    iVar3 = iVar2;
                    d.B(sVar, false, true, true);
                    r rVarQ5 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA5 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                    iHashCode7 = Long.hashCode(sVar.T);
                    q1 q1VarL9 = sVar.l();
                    r rVarC9 = z1.a.c(sVar, rVarQ5);
                    k.J.getClass();
                    iVar4 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar4);
                    } else {
                        sVar.r0();
                    }
                    h hVar13 = j.f56917f;
                    t.J(hVar13, a2VarA5, sVar);
                    h hVar14 = j.f56916e;
                    t.J(hVar14, q1VarL9, sVar);
                    hVar2 = j.f56918g;
                    if (sVar.S) {
                        str = "\t";
                    } else {
                        str = "\t";
                        if (!m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                        }
                        h hVar15 = j.f56915d;
                        t.J(hVar15, rVarC9, sVar);
                        i15 = i14;
                        p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                        r rVarA4 = c2Var.a(oVar, 4.8f);
                        u uVarA5 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                        iHashCode8 = Long.hashCode(sVar.T);
                        q1 q1VarL10 = sVar.l();
                        r rVarC10 = z1.a.c(sVar, rVarA4);
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar4);
                        } else {
                            sVar.r0();
                        }
                        t.J(hVar13, uVarA5, sVar);
                        t.J(hVar14, q1VarL10, sVar);
                        if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode8))) {
                            e.A(iHashCode8, sVar, iHashCode8, hVar2);
                        }
                        t.J(hVar15, rVarC10, sVar);
                        objQ5 = sVar.Q();
                        if (objQ5 == gVar3) {
                            objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                            sVar.o0(objQ5);
                        }
                        sVar.d0(240204226);
                        it2 = ((List) objQ5).iterator();
                        while (it2.hasNext()) {
                            List list2 = (List) it2.next();
                            r rVarQ6 = j0.c.q(oVar, e1.Min);
                            a2 a2VarA6 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                            iHashCode9 = Long.hashCode(sVar.T);
                            q1 q1VarL11 = sVar.l();
                            r rVarC11 = z1.a.c(sVar, rVarQ6);
                            k.J.getClass();
                            iVar5 = j.f56913b;
                            sVar.h0();
                            if (sVar.S) {
                                sVar.k(iVar5);
                            } else {
                                sVar.r0();
                            }
                            t.J(j.f56917f, a2VarA6, sVar);
                            t.J(j.f56916e, q1VarL11, sVar);
                            hVar3 = j.f56918g;
                            if (sVar.S || !m.a(sVar.Q(), Integer.valueOf(iHashCode9))) {
                                e.A(iHashCode9, sVar, iHashCode9, hVar3);
                            }
                            itO = d.o(sVar, rVarC11, j.f56915d, -899100862, list2);
                            i16 = 0;
                            while (itO.hasNext()) {
                                next = itO.next();
                                i17 = i16 + 1;
                                if (i16 >= 0) {
                                    ns.o.V();
                                    throw null;
                                }
                                str2 = (String) next;
                                if (i16 != 0) {
                                    i18 = i15;
                                    sVar.d0(587934756);
                                    p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                                    sVar.p(false);
                                } else if (i16 != 1) {
                                    i18 = i15;
                                    sVar.d0(588437700);
                                    String str8 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                    r rVarC12 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                                    if (i18 == 4) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    zF = z14 | sVar.f(str2);
                                    objQ6 = sVar.Q();
                                    if (zF || objQ6 == gVar3) {
                                        objQ6 = new in.h(cVar, str2, 17);
                                        sVar.o0(objQ6);
                                    }
                                    p(str8, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC12, false, null, (fz.a) objQ6, 15), sVar, 432);
                                    sVar.p(false);
                                } else if (i16 != 2) {
                                    sVar.d0(564801874);
                                    sVar.p(false);
                                    i18 = i15;
                                } else {
                                    sVar.d0(589125621);
                                    String str9 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                    String str10 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                                    r rVarC13 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                                    i19 = i15;
                                    if (i19 == 4) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    zF2 = z15 | sVar.f(str2);
                                    objQ7 = sVar.Q();
                                    if (zF2 || objQ7 == gVar3) {
                                        objQ7 = new in.h(cVar, str2, 18);
                                        sVar.o0(objQ7);
                                    }
                                    i18 = i19;
                                    p(str9, str10, "ę", d0.n.o(rVarC13, false, null, (fz.a) objQ7, 15), sVar, 384);
                                    sVar.p(false);
                                }
                                i15 = i18;
                                i16 = i17;
                                it2 = it2;
                            }
                            sVar.p(false);
                            sVar.p(true);
                            it2 = it2;
                        }
                        cVar2 = cVar;
                        sVar.p(false);
                        sVar.p(true);
                        sVar.p(true);
                        sVar.p(true);
                    }
                    e.A(iHashCode7, sVar, iHashCode7, hVar2);
                    h hVar16 = j.f56915d;
                    t.J(hVar16, rVarC9, sVar);
                    i15 = i14;
                    p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                    r rVarA5 = c2Var.a(oVar, 4.8f);
                    u uVarA6 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                    iHashCode8 = Long.hashCode(sVar.T);
                    q1 q1VarL12 = sVar.l();
                    r rVarC14 = z1.a.c(sVar, rVarA5);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar4);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar13, uVarA6, sVar);
                    t.J(hVar14, q1VarL12, sVar);
                    if (sVar.S) {
                        e.A(iHashCode8, sVar, iHashCode8, hVar2);
                    } else {
                        e.A(iHashCode8, sVar, iHashCode8, hVar2);
                    }
                    t.J(hVar16, rVarC14, sVar);
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar3) {
                        objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                        sVar.o0(objQ5);
                    }
                    sVar.d0(240204226);
                    it2 = ((List) objQ5).iterator();
                    while (it2.hasNext()) {
                        List list3 = (List) it2.next();
                        r rVarQ7 = j0.c.q(oVar, e1.Min);
                        a2 a2VarA7 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                        iHashCode9 = Long.hashCode(sVar.T);
                        q1 q1VarL13 = sVar.l();
                        r rVarC15 = z1.a.c(sVar, rVarQ7);
                        k.J.getClass();
                        iVar5 = j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar5);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, a2VarA7, sVar);
                        t.J(j.f56916e, q1VarL13, sVar);
                        hVar3 = j.f56918g;
                        if (sVar.S) {
                            e.A(iHashCode9, sVar, iHashCode9, hVar3);
                        } else {
                            e.A(iHashCode9, sVar, iHashCode9, hVar3);
                        }
                        itO = d.o(sVar, rVarC15, j.f56915d, -899100862, list3);
                        i16 = 0;
                        while (itO.hasNext()) {
                            next = itO.next();
                            i17 = i16 + 1;
                            if (i16 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            str2 = (String) next;
                            if (i16 != 0) {
                                i18 = i15;
                                sVar.d0(587934756);
                                p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                                sVar.p(false);
                            } else if (i16 != 1) {
                                i18 = i15;
                                sVar.d0(588437700);
                                String str11 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                r rVarC16 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                                if (i18 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                zF = z14 | sVar.f(str2);
                                objQ6 = sVar.Q();
                                if (zF) {
                                    objQ6 = new in.h(cVar, str2, 17);
                                    sVar.o0(objQ6);
                                } else {
                                    objQ6 = new in.h(cVar, str2, 17);
                                    sVar.o0(objQ6);
                                }
                                p(str11, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC16, false, null, (fz.a) objQ6, 15), sVar, 432);
                                sVar.p(false);
                            } else if (i16 != 2) {
                                sVar.d0(564801874);
                                sVar.p(false);
                                i18 = i15;
                            } else {
                                sVar.d0(589125621);
                                String str12 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                String str13 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                                r rVarC17 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                                i19 = i15;
                                if (i19 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                zF2 = z15 | sVar.f(str2);
                                objQ7 = sVar.Q();
                                if (zF2) {
                                    objQ7 = new in.h(cVar, str2, 18);
                                    sVar.o0(objQ7);
                                } else {
                                    objQ7 = new in.h(cVar, str2, 18);
                                    sVar.o0(objQ7);
                                }
                                i18 = i19;
                                p(str12, str13, "ę", d0.n.o(rVarC17, false, null, (fz.a) objQ7, 15), sVar, 384);
                                sVar.p(false);
                            }
                            i15 = i18;
                            i16 = i17;
                            it2 = it2;
                        }
                        sVar.p(false);
                        sVar.p(true);
                        it2 = it2;
                    }
                    cVar2 = cVar;
                    sVar.p(false);
                    sVar.p(true);
                    sVar.p(true);
                    sVar.p(true);
                }
                gVar2 = gVar;
                objQ = new x0(cVar, 15);
                sVar.o0(objQ);
                p("/ɔ̃/", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB, false, null, (fz.a) objQ, 15), sVar, 438);
                r rVarA6 = c2Var.a(oVar, 2.0f);
                u uVarA7 = j0.t.a(dVar, hVar5, sVar, 0);
                iHashCode6 = Long.hashCode(sVar.T);
                q1 q1VarL14 = sVar.l();
                r rVarC18 = z1.a.c(sVar, rVarA6);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar10, uVarA7, sVar);
                t.J(hVar11, q1VarL14, sVar);
                if (sVar.S) {
                    e.A(iHashCode6, sVar, iHashCode6, hVar);
                } else {
                    e.A(iHashCode6, sVar, iHashCode6, hVar);
                }
                t.J(hVar12, rVarC18, sVar);
                r rVarB6 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ2 = sVar.Q();
                gVar3 = gVar2;
                if (z12) {
                    cVar3 = cVar;
                    objQ2 = new x0(cVar3, 16);
                    sVar.o0(objQ2);
                } else {
                    cVar3 = cVar;
                    objQ2 = new x0(cVar3, 16);
                    sVar.o0(objQ2);
                }
                p("jedną", "one (feminine accusative)", "ą", d0.n.o(rVarB6, false, null, (fz.a) objQ2, 15), sVar, 438);
                r rVarB7 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
                if (i14 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ3 = sVar.Q();
                if (z13) {
                    objQ3 = new x0(cVar3, 17);
                    sVar.o0(objQ3);
                } else {
                    objQ3 = new x0(cVar3, 17);
                    sVar.o0(objQ3);
                }
                p("mąż", "husband", "ą", d0.n.o(rVarB7, false, null, (fz.a) objQ3, 15), sVar, 438);
                sVar.p(true);
                sVar.p(true);
                objQ4 = sVar.Q();
                if (objQ4 == gVar3) {
                    objQ4 = ry.m.g1(q.W0("before b or p\t/ɔm/\n[pol-f-zy-a-1-0-2]\tząb\ntooth\n[pol-f-zy-zab]\tbefore c, cz, d, dz, dż or t\t/ɔn/\n[pol-f-zy-a-1-0-3]\tgorąco\nhot\n[pol-f-zy-gorco]\tbefore ć or dź\t/ɔɲ/\n[pol-f-zy-a-1-0-4]\twziąć\nto take\n[pol-f-zy-wziac]\tbefore g or k\t/ɔŋ/\n[pol-f-zy-a-1-0-5]\tpociąg\ntrain\n[pol-f-zy-pociag]", new String[]{"\t"}, 0, 6), 3, 3);
                    sVar.o0(objQ4);
                }
                sVar.d0(-62607973);
                it = ((List) objQ4).iterator();
                while (it.hasNext()) {
                    List list4 = (List) it.next();
                    r rVarQ8 = j0.c.q(oVar, e1.Min);
                    iVar6 = iVar2;
                    a2 a2VarA8 = z1.a(j0.i.f35303a, iVar6, sVar, 0);
                    iHashCode10 = Long.hashCode(sVar.T);
                    q1 q1VarL15 = sVar.l();
                    r rVarC19 = z1.a.c(sVar, rVarQ8);
                    k.J.getClass();
                    iVar7 = j.f56913b;
                    sVar.h0();
                    Iterator it4 = it;
                    if (sVar.S) {
                        sVar.k(iVar7);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA8, sVar);
                    t.J(j.f56916e, q1VarL15, sVar);
                    hVar4 = j.f56918g;
                    if (sVar.S) {
                        e.A(iHashCode10, sVar, iHashCode10, hVar4);
                    } else {
                        e.A(iHashCode10, sVar, iHashCode10, hVar4);
                    }
                    itO2 = d.o(sVar, rVarC19, j.f56915d, -1201988101, list4);
                    i21 = 0;
                    while (itO2.hasNext()) {
                        next2 = itO2.next();
                        i22 = i21 + 1;
                        if (i21 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str3 = (String) next2;
                        if (i21 != 0) {
                            iVar8 = iVar6;
                            sVar.d0(-211639773);
                            p(BuildConfig.VERSION_NAME, str3, ypOOxsaJG.vzWqjdDxYeEeCR, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                            sVar.p(false);
                        } else if (i21 != 1) {
                            iVar8 = iVar6;
                            sVar.d0(-211134473);
                            String str14 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                            r rVarB8 = d2.h.b(e2.c(c2Var.a(oVar, 1.0f), 1.0f), f.d(f5));
                            if (i14 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zF3 = z16 | sVar.f(str3);
                            objQ8 = sVar.Q();
                            if (zF3) {
                                objQ8 = new in.h(cVar3, str3, 15);
                                sVar.o0(objQ8);
                            } else {
                                objQ8 = new in.h(cVar3, str3, 15);
                                sVar.o0(objQ8);
                            }
                            p(str14, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB8, false, null, (fz.a) objQ8, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i21 != i24) {
                            sVar.d0(-231198479);
                            sVar.p(false);
                            iVar8 = iVar6;
                        } else {
                            sVar.d0(-210371160);
                            String str15 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                            String str16 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(1);
                            r rVarB9 = d2.h.b(e2.c(c2Var.a(oVar, 2.0f), 1.0f), f.d(f5));
                            if (i14 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zF4 = z17 | sVar.f(str3);
                            objQ9 = sVar.Q();
                            if (zF4) {
                                objQ9 = new in.h(cVar3, str3, 16);
                                sVar.o0(objQ9);
                            } else {
                                objQ9 = new in.h(cVar3, str3, 16);
                                sVar.o0(objQ9);
                            }
                            r rVarO2 = d0.n.o(rVarB9, false, null, (fz.a) objQ9, 15);
                            iVar8 = iVar6;
                            p(str15, str16, "ą", rVarO2, sVar, 384);
                            sVar.p(false);
                        }
                        iVar6 = iVar8;
                        i21 = i22;
                        itO2 = itO2;
                        i24 = 2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    iVar2 = iVar6;
                    it = it4;
                    i24 = 2;
                }
                iVar3 = iVar2;
                d.B(sVar, false, true, true);
                r rVarQ9 = j0.c.q(oVar, e1.Min);
                a2 a2VarA9 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                iHashCode7 = Long.hashCode(sVar.T);
                q1 q1VarL16 = sVar.l();
                r rVarC20 = z1.a.c(sVar, rVarQ9);
                k.J.getClass();
                iVar4 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                h hVar17 = j.f56917f;
                t.J(hVar17, a2VarA9, sVar);
                h hVar18 = j.f56916e;
                t.J(hVar18, q1VarL16, sVar);
                hVar2 = j.f56918g;
                if (sVar.S) {
                    str = "\t";
                    if (!m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                    }
                    h hVar19 = j.f56915d;
                    t.J(hVar19, rVarC20, sVar);
                    i15 = i14;
                    p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                    r rVarA7 = c2Var.a(oVar, 4.8f);
                    u uVarA8 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                    iHashCode8 = Long.hashCode(sVar.T);
                    q1 q1VarL17 = sVar.l();
                    r rVarC110 = z1.a.c(sVar, rVarA7);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar4);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar17, uVarA8, sVar);
                    t.J(hVar18, q1VarL17, sVar);
                    if (sVar.S) {
                        e.A(iHashCode8, sVar, iHashCode8, hVar2);
                    } else {
                        e.A(iHashCode8, sVar, iHashCode8, hVar2);
                    }
                    t.J(hVar19, rVarC110, sVar);
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar3) {
                        objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                        sVar.o0(objQ5);
                    }
                    sVar.d0(240204226);
                    it2 = ((List) objQ5).iterator();
                    while (it2.hasNext()) {
                        List list5 = (List) it2.next();
                        r rVarQ10 = j0.c.q(oVar, e1.Min);
                        a2 a2VarA10 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                        iHashCode9 = Long.hashCode(sVar.T);
                        q1 q1VarL18 = sVar.l();
                        r rVarC111 = z1.a.c(sVar, rVarQ10);
                        k.J.getClass();
                        iVar5 = j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar5);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, a2VarA10, sVar);
                        t.J(j.f56916e, q1VarL18, sVar);
                        hVar3 = j.f56918g;
                        if (sVar.S) {
                            e.A(iHashCode9, sVar, iHashCode9, hVar3);
                        } else {
                            e.A(iHashCode9, sVar, iHashCode9, hVar3);
                        }
                        itO = d.o(sVar, rVarC111, j.f56915d, -899100862, list5);
                        i16 = 0;
                        while (itO.hasNext()) {
                            next = itO.next();
                            i17 = i16 + 1;
                            if (i16 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            str2 = (String) next;
                            if (i16 != 0) {
                                i18 = i15;
                                sVar.d0(587934756);
                                p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                                sVar.p(false);
                            } else if (i16 != 1) {
                                i18 = i15;
                                sVar.d0(588437700);
                                String str17 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                r rVarC112 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                                if (i18 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                zF = z14 | sVar.f(str2);
                                objQ6 = sVar.Q();
                                if (zF) {
                                    objQ6 = new in.h(cVar, str2, 17);
                                    sVar.o0(objQ6);
                                } else {
                                    objQ6 = new in.h(cVar, str2, 17);
                                    sVar.o0(objQ6);
                                }
                                p(str17, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC112, false, null, (fz.a) objQ6, 15), sVar, 432);
                                sVar.p(false);
                            } else if (i16 != 2) {
                                sVar.d0(564801874);
                                sVar.p(false);
                                i18 = i15;
                            } else {
                                sVar.d0(589125621);
                                String str18 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                String str19 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                                r rVarC113 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                                i19 = i15;
                                if (i19 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                zF2 = z15 | sVar.f(str2);
                                objQ7 = sVar.Q();
                                if (zF2) {
                                    objQ7 = new in.h(cVar, str2, 18);
                                    sVar.o0(objQ7);
                                } else {
                                    objQ7 = new in.h(cVar, str2, 18);
                                    sVar.o0(objQ7);
                                }
                                i18 = i19;
                                p(str18, str19, "ę", d0.n.o(rVarC113, false, null, (fz.a) objQ7, 15), sVar, 384);
                                sVar.p(false);
                            }
                            i15 = i18;
                            i16 = i17;
                            it2 = it2;
                        }
                        sVar.p(false);
                        sVar.p(true);
                        it2 = it2;
                    }
                    cVar2 = cVar;
                    sVar.p(false);
                    sVar.p(true);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    str = "\t";
                }
                e.A(iHashCode7, sVar, iHashCode7, hVar2);
                h hVar110 = j.f56915d;
                t.J(hVar110, rVarC20, sVar);
                i15 = i14;
                p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                r rVarA8 = c2Var.a(oVar, 4.8f);
                u uVarA9 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                iHashCode8 = Long.hashCode(sVar.T);
                q1 q1VarL19 = sVar.l();
                r rVarC114 = z1.a.c(sVar, rVarA8);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(hVar17, uVarA9, sVar);
                t.J(hVar18, q1VarL19, sVar);
                if (sVar.S) {
                    e.A(iHashCode8, sVar, iHashCode8, hVar2);
                } else {
                    e.A(iHashCode8, sVar, iHashCode8, hVar2);
                }
                t.J(hVar110, rVarC114, sVar);
                objQ5 = sVar.Q();
                if (objQ5 == gVar3) {
                    objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                    sVar.o0(objQ5);
                }
                sVar.d0(240204226);
                it2 = ((List) objQ5).iterator();
                while (it2.hasNext()) {
                    List list6 = (List) it2.next();
                    r rVarQ11 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA11 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                    iHashCode9 = Long.hashCode(sVar.T);
                    q1 q1VarL110 = sVar.l();
                    r rVarC115 = z1.a.c(sVar, rVarQ11);
                    k.J.getClass();
                    iVar5 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar5);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA11, sVar);
                    t.J(j.f56916e, q1VarL110, sVar);
                    hVar3 = j.f56918g;
                    if (sVar.S) {
                        e.A(iHashCode9, sVar, iHashCode9, hVar3);
                    } else {
                        e.A(iHashCode9, sVar, iHashCode9, hVar3);
                    }
                    itO = d.o(sVar, rVarC115, j.f56915d, -899100862, list6);
                    i16 = 0;
                    while (itO.hasNext()) {
                        next = itO.next();
                        i17 = i16 + 1;
                        if (i16 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str2 = (String) next;
                        if (i16 != 0) {
                            i18 = i15;
                            sVar.d0(587934756);
                            p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                            sVar.p(false);
                        } else if (i16 != 1) {
                            i18 = i15;
                            sVar.d0(588437700);
                            String str110 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                            r rVarC116 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                            if (i18 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zF = z14 | sVar.f(str2);
                            objQ6 = sVar.Q();
                            if (zF) {
                                objQ6 = new in.h(cVar, str2, 17);
                                sVar.o0(objQ6);
                            } else {
                                objQ6 = new in.h(cVar, str2, 17);
                                sVar.o0(objQ6);
                            }
                            p(str110, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC116, false, null, (fz.a) objQ6, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i16 != 2) {
                            sVar.d0(564801874);
                            sVar.p(false);
                            i18 = i15;
                        } else {
                            sVar.d0(589125621);
                            String str111 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                            String str112 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                            r rVarC117 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                            i19 = i15;
                            if (i19 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zF2 = z15 | sVar.f(str2);
                            objQ7 = sVar.Q();
                            if (zF2) {
                                objQ7 = new in.h(cVar, str2, 18);
                                sVar.o0(objQ7);
                            } else {
                                objQ7 = new in.h(cVar, str2, 18);
                                sVar.o0(objQ7);
                            }
                            i18 = i19;
                            p(str111, str112, "ę", d0.n.o(rVarC117, false, null, (fz.a) objQ7, 15), sVar, 384);
                            sVar.p(false);
                        }
                        i15 = i18;
                        i16 = i17;
                        it2 = it2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    it2 = it2;
                }
                cVar2 = cVar;
                sVar.p(false);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
            }
            e.A(iHashCode11, sVar, iHashCode11, hVar8);
            h hVar20 = j.f56915d;
            t.J(hVar20, rVarC, sVar);
            m("Nasal vowels", sVar, 6);
            j0.c.g(sVar, e2.g(oVar, 8));
            r rVarQ12 = j0.c.q(oVar, e1.Min);
            a2 a2VarA12 = z1.a(j0.i.f35303a, iVar9, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL20 = sVar.l();
            r rVarC21 = z1.a.c(sVar, rVarQ12);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar10);
            } else {
                sVar.r0();
            }
            t.J(hVar6, a2VarA12, sVar);
            t.J(hVar7, q1VarL20, sVar);
            if (sVar.S) {
                e.A(iHashCode, sVar, iHashCode, hVar8);
            } else {
                e.A(iHashCode, sVar, iHashCode, hVar8);
            }
            t.J(hVar20, rVarC21, sVar);
            sVar.d0(1033949018);
            length = strArr2.length;
            i12 = 0;
            i13 = 0;
            while (i12 < length) {
                String str20 = strArr2[i12];
                int i26 = i13 + 1;
                fFloatValue = fArr[i13].floatValue();
                if (fFloatValue <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                if (fFloatValue > Float.MAX_VALUE) {
                    fFloatValue = Float.MAX_VALUE;
                }
                o(0, str20, sVar, e2.c(new i1(fFloatValue, true), 1.0f));
                i12++;
                i13 = i26;
            }
            sVar.p(false);
            sVar.p(true);
            e1 e1Var2 = e1.Min;
            r rVarQ13 = j0.c.q(oVar, e1Var2);
            j0.b bVar2 = j0.i.f35303a;
            a2 a2VarA13 = z1.a(bVar2, iVar9, sVar, 0);
            iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL21 = sVar.l();
            r rVarC22 = z1.a.c(sVar, rVarQ13);
            k.J.getClass();
            iVar = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            h hVar111 = j.f56917f;
            t.J(hVar111, a2VarA13, sVar);
            h hVar112 = j.f56916e;
            t.J(hVar112, q1VarL21, sVar);
            hVar = j.f56918g;
            if (sVar.S) {
                e.A(iHashCode2, sVar, iHashCode2, hVar);
            } else {
                e.A(iHashCode2, sVar, iHashCode2, hVar);
            }
            h hVar113 = j.f56915d;
            t.J(hVar113, rVarC22, sVar);
            c2Var = c2.f35266a;
            p("Ą ą", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
            r rVarA9 = c2Var.a(oVar, 4.8f);
            j0.d dVar2 = j0.i.f35305c;
            u uVarA10 = j0.t.a(dVar2, hVar5, sVar, 0);
            iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL22 = sVar.l();
            r rVarC23 = z1.a.c(sVar, rVarA9);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar111, uVarA10, sVar);
            t.J(hVar112, q1VarL22, sVar);
            if (sVar.S) {
                e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                e.A(iHashCode3, sVar, iHashCode3, hVar);
            }
            t.J(hVar113, rVarC23, sVar);
            r rVarQ14 = j0.c.q(oVar, e1Var2);
            a2 a2VarA14 = z1.a(bVar2, iVar9, sVar, 0);
            iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL23 = sVar.l();
            r rVarC24 = z1.a.c(sVar, rVarQ14);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar111, a2VarA14, sVar);
            t.J(hVar112, q1VarL23, sVar);
            if (sVar.S) {
                e.A(iHashCode4, sVar, iHashCode4, hVar);
            } else {
                e.A(iHashCode4, sVar, iHashCode4, hVar);
            }
            t.J(hVar113, rVarC24, sVar);
            r rVarA10 = c2Var.a(oVar, 1.8f);
            u uVarA11 = j0.t.a(dVar2, hVar5, sVar, 0);
            iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL24 = sVar.l();
            r rVarC25 = z1.a.c(sVar, rVarA10);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar111, uVarA11, sVar);
            t.J(hVar112, q1VarL24, sVar);
            if (sVar.S) {
                e.A(iHashCode5, sVar, iHashCode5, hVar);
            } else {
                e.A(iHashCode5, sVar, iHashCode5, hVar);
            }
            t.J(hVar113, rVarC25, sVar);
            iVar2 = iVar9;
            p(BuildConfig.VERSION_NAME, "single or at the end of word", BuildConfig.VERSION_NAME, v.a(e2.e(oVar, 1.0f), 1.0f), sVar, 438);
            p(BuildConfig.VERSION_NAME, "before ch, f, h, rz, s, sz, ś, w, z, ź or ż", BuildConfig.VERSION_NAME, v.a(e2.e(oVar, 1.0f), 1.0f), sVar, 438);
            sVar.p(true);
            f5 = 4;
            r rVarB10 = d2.h.b(e2.c(c2Var.a(oVar, 1.0f), 1.0f), f.d(f5));
            i14 = i23 & 14;
            if (i14 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ = sVar.Q();
            if (z11) {
                gVar = gVar4;
                if (objQ == gVar) {
                    gVar2 = gVar;
                }
                p("/ɔ̃/", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB10, false, null, (fz.a) objQ, 15), sVar, 438);
                r rVarA11 = c2Var.a(oVar, 2.0f);
                u uVarA12 = j0.t.a(dVar2, hVar5, sVar, 0);
                iHashCode6 = Long.hashCode(sVar.T);
                q1 q1VarL111 = sVar.l();
                r rVarC118 = z1.a.c(sVar, rVarA11);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                t.J(hVar111, uVarA12, sVar);
                t.J(hVar112, q1VarL111, sVar);
                if (sVar.S) {
                    e.A(iHashCode6, sVar, iHashCode6, hVar);
                } else {
                    e.A(iHashCode6, sVar, iHashCode6, hVar);
                }
                t.J(hVar113, rVarC118, sVar);
                r rVarB11 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ2 = sVar.Q();
                gVar3 = gVar2;
                if (z12) {
                    cVar3 = cVar;
                    objQ2 = new x0(cVar3, 16);
                    sVar.o0(objQ2);
                } else {
                    cVar3 = cVar;
                    objQ2 = new x0(cVar3, 16);
                    sVar.o0(objQ2);
                }
                p("jedną", "one (feminine accusative)", "ą", d0.n.o(rVarB11, false, null, (fz.a) objQ2, 15), sVar, 438);
                r rVarB12 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
                if (i14 == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                objQ3 = sVar.Q();
                if (z13) {
                    objQ3 = new x0(cVar3, 17);
                    sVar.o0(objQ3);
                } else {
                    objQ3 = new x0(cVar3, 17);
                    sVar.o0(objQ3);
                }
                p("mąż", "husband", "ą", d0.n.o(rVarB12, false, null, (fz.a) objQ3, 15), sVar, 438);
                sVar.p(true);
                sVar.p(true);
                objQ4 = sVar.Q();
                if (objQ4 == gVar3) {
                    objQ4 = ry.m.g1(q.W0("before b or p\t/ɔm/\n[pol-f-zy-a-1-0-2]\tząb\ntooth\n[pol-f-zy-zab]\tbefore c, cz, d, dz, dż or t\t/ɔn/\n[pol-f-zy-a-1-0-3]\tgorąco\nhot\n[pol-f-zy-gorco]\tbefore ć or dź\t/ɔɲ/\n[pol-f-zy-a-1-0-4]\twziąć\nto take\n[pol-f-zy-wziac]\tbefore g or k\t/ɔŋ/\n[pol-f-zy-a-1-0-5]\tpociąg\ntrain\n[pol-f-zy-pociag]", new String[]{"\t"}, 0, 6), 3, 3);
                    sVar.o0(objQ4);
                }
                sVar.d0(-62607973);
                it = ((List) objQ4).iterator();
                while (it.hasNext()) {
                    List list7 = (List) it.next();
                    r rVarQ15 = j0.c.q(oVar, e1.Min);
                    iVar6 = iVar2;
                    a2 a2VarA15 = z1.a(j0.i.f35303a, iVar6, sVar, 0);
                    iHashCode10 = Long.hashCode(sVar.T);
                    q1 q1VarL112 = sVar.l();
                    r rVarC119 = z1.a.c(sVar, rVarQ15);
                    k.J.getClass();
                    iVar7 = j.f56913b;
                    sVar.h0();
                    Iterator it5 = it;
                    if (sVar.S) {
                        sVar.k(iVar7);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA15, sVar);
                    t.J(j.f56916e, q1VarL112, sVar);
                    hVar4 = j.f56918g;
                    if (sVar.S) {
                        e.A(iHashCode10, sVar, iHashCode10, hVar4);
                    } else {
                        e.A(iHashCode10, sVar, iHashCode10, hVar4);
                    }
                    itO2 = d.o(sVar, rVarC119, j.f56915d, -1201988101, list7);
                    i21 = 0;
                    while (itO2.hasNext()) {
                        next2 = itO2.next();
                        i22 = i21 + 1;
                        if (i21 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str3 = (String) next2;
                        if (i21 != 0) {
                            iVar8 = iVar6;
                            sVar.d0(-211639773);
                            p(BuildConfig.VERSION_NAME, str3, ypOOxsaJG.vzWqjdDxYeEeCR, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                            sVar.p(false);
                        } else if (i21 != 1) {
                            iVar8 = iVar6;
                            sVar.d0(-211134473);
                            String str113 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                            r rVarB13 = d2.h.b(e2.c(c2Var.a(oVar, 1.0f), 1.0f), f.d(f5));
                            if (i14 == 4) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            zF3 = z16 | sVar.f(str3);
                            objQ8 = sVar.Q();
                            if (zF3) {
                                objQ8 = new in.h(cVar3, str3, 15);
                                sVar.o0(objQ8);
                            } else {
                                objQ8 = new in.h(cVar3, str3, 15);
                                sVar.o0(objQ8);
                            }
                            p(str113, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB13, false, null, (fz.a) objQ8, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i21 != i24) {
                            sVar.d0(-231198479);
                            sVar.p(false);
                            iVar8 = iVar6;
                        } else {
                            sVar.d0(-210371160);
                            String str114 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                            String str115 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(1);
                            r rVarB14 = d2.h.b(e2.c(c2Var.a(oVar, 2.0f), 1.0f), f.d(f5));
                            if (i14 == 4) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            zF4 = z17 | sVar.f(str3);
                            objQ9 = sVar.Q();
                            if (zF4) {
                                objQ9 = new in.h(cVar3, str3, 16);
                                sVar.o0(objQ9);
                            } else {
                                objQ9 = new in.h(cVar3, str3, 16);
                                sVar.o0(objQ9);
                            }
                            r rVarO3 = d0.n.o(rVarB14, false, null, (fz.a) objQ9, 15);
                            iVar8 = iVar6;
                            p(str114, str115, "ą", rVarO3, sVar, 384);
                            sVar.p(false);
                        }
                        iVar6 = iVar8;
                        i21 = i22;
                        itO2 = itO2;
                        i24 = 2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    iVar2 = iVar6;
                    it = it5;
                    i24 = 2;
                }
                iVar3 = iVar2;
                d.B(sVar, false, true, true);
                r rVarQ16 = j0.c.q(oVar, e1.Min);
                a2 a2VarA16 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                iHashCode7 = Long.hashCode(sVar.T);
                q1 q1VarL113 = sVar.l();
                r rVarC26 = z1.a.c(sVar, rVarQ16);
                k.J.getClass();
                iVar4 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                h hVar114 = j.f56917f;
                t.J(hVar114, a2VarA16, sVar);
                h hVar115 = j.f56916e;
                t.J(hVar115, q1VarL113, sVar);
                hVar2 = j.f56918g;
                if (sVar.S) {
                    str = "\t";
                    if (!m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                    }
                    h hVar116 = j.f56915d;
                    t.J(hVar116, rVarC26, sVar);
                    i15 = i14;
                    p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                    r rVarA12 = c2Var.a(oVar, 4.8f);
                    u uVarA13 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                    iHashCode8 = Long.hashCode(sVar.T);
                    q1 q1VarL114 = sVar.l();
                    r rVarC1110 = z1.a.c(sVar, rVarA12);
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar4);
                    } else {
                        sVar.r0();
                    }
                    t.J(hVar114, uVarA13, sVar);
                    t.J(hVar115, q1VarL114, sVar);
                    if (sVar.S) {
                        e.A(iHashCode8, sVar, iHashCode8, hVar2);
                    } else {
                        e.A(iHashCode8, sVar, iHashCode8, hVar2);
                    }
                    t.J(hVar116, rVarC1110, sVar);
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar3) {
                        objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                        sVar.o0(objQ5);
                    }
                    sVar.d0(240204226);
                    it2 = ((List) objQ5).iterator();
                    while (it2.hasNext()) {
                        List list8 = (List) it2.next();
                        r rVarQ17 = j0.c.q(oVar, e1.Min);
                        a2 a2VarA17 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                        iHashCode9 = Long.hashCode(sVar.T);
                        q1 q1VarL115 = sVar.l();
                        r rVarC1111 = z1.a.c(sVar, rVarQ17);
                        k.J.getClass();
                        iVar5 = j.f56913b;
                        sVar.h0();
                        if (sVar.S) {
                            sVar.k(iVar5);
                        } else {
                            sVar.r0();
                        }
                        t.J(j.f56917f, a2VarA17, sVar);
                        t.J(j.f56916e, q1VarL115, sVar);
                        hVar3 = j.f56918g;
                        if (sVar.S) {
                            e.A(iHashCode9, sVar, iHashCode9, hVar3);
                        } else {
                            e.A(iHashCode9, sVar, iHashCode9, hVar3);
                        }
                        itO = d.o(sVar, rVarC1111, j.f56915d, -899100862, list8);
                        i16 = 0;
                        while (itO.hasNext()) {
                            next = itO.next();
                            i17 = i16 + 1;
                            if (i16 >= 0) {
                                ns.o.V();
                                throw null;
                            }
                            str2 = (String) next;
                            if (i16 != 0) {
                                i18 = i15;
                                sVar.d0(587934756);
                                p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                                sVar.p(false);
                            } else if (i16 != 1) {
                                i18 = i15;
                                sVar.d0(588437700);
                                String str116 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                r rVarC1112 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                                if (i18 == 4) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                zF = z14 | sVar.f(str2);
                                objQ6 = sVar.Q();
                                if (zF) {
                                    objQ6 = new in.h(cVar, str2, 17);
                                    sVar.o0(objQ6);
                                } else {
                                    objQ6 = new in.h(cVar, str2, 17);
                                    sVar.o0(objQ6);
                                }
                                p(str116, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC1112, false, null, (fz.a) objQ6, 15), sVar, 432);
                                sVar.p(false);
                            } else if (i16 != 2) {
                                sVar.d0(564801874);
                                sVar.p(false);
                                i18 = i15;
                            } else {
                                sVar.d0(589125621);
                                String str117 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                                String str118 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                                r rVarC1113 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                                i19 = i15;
                                if (i19 == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                zF2 = z15 | sVar.f(str2);
                                objQ7 = sVar.Q();
                                if (zF2) {
                                    objQ7 = new in.h(cVar, str2, 18);
                                    sVar.o0(objQ7);
                                } else {
                                    objQ7 = new in.h(cVar, str2, 18);
                                    sVar.o0(objQ7);
                                }
                                i18 = i19;
                                p(str117, str118, "ę", d0.n.o(rVarC1113, false, null, (fz.a) objQ7, 15), sVar, 384);
                                sVar.p(false);
                            }
                            i15 = i18;
                            i16 = i17;
                            it2 = it2;
                        }
                        sVar.p(false);
                        sVar.p(true);
                        it2 = it2;
                    }
                    cVar2 = cVar;
                    sVar.p(false);
                    sVar.p(true);
                    sVar.p(true);
                    sVar.p(true);
                } else {
                    str = "\t";
                }
                e.A(iHashCode7, sVar, iHashCode7, hVar2);
                h hVar117 = j.f56915d;
                t.J(hVar117, rVarC26, sVar);
                i15 = i14;
                p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                r rVarA13 = c2Var.a(oVar, 4.8f);
                u uVarA14 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                iHashCode8 = Long.hashCode(sVar.T);
                q1 q1VarL116 = sVar.l();
                r rVarC1114 = z1.a.c(sVar, rVarA13);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(hVar114, uVarA14, sVar);
                t.J(hVar115, q1VarL116, sVar);
                if (sVar.S) {
                    e.A(iHashCode8, sVar, iHashCode8, hVar2);
                } else {
                    e.A(iHashCode8, sVar, iHashCode8, hVar2);
                }
                t.J(hVar117, rVarC1114, sVar);
                objQ5 = sVar.Q();
                if (objQ5 == gVar3) {
                    objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                    sVar.o0(objQ5);
                }
                sVar.d0(240204226);
                it2 = ((List) objQ5).iterator();
                while (it2.hasNext()) {
                    List list9 = (List) it2.next();
                    r rVarQ18 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA18 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                    iHashCode9 = Long.hashCode(sVar.T);
                    q1 q1VarL117 = sVar.l();
                    r rVarC1115 = z1.a.c(sVar, rVarQ18);
                    k.J.getClass();
                    iVar5 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar5);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA18, sVar);
                    t.J(j.f56916e, q1VarL117, sVar);
                    hVar3 = j.f56918g;
                    if (sVar.S) {
                        e.A(iHashCode9, sVar, iHashCode9, hVar3);
                    } else {
                        e.A(iHashCode9, sVar, iHashCode9, hVar3);
                    }
                    itO = d.o(sVar, rVarC1115, j.f56915d, -899100862, list9);
                    i16 = 0;
                    while (itO.hasNext()) {
                        next = itO.next();
                        i17 = i16 + 1;
                        if (i16 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str2 = (String) next;
                        if (i16 != 0) {
                            i18 = i15;
                            sVar.d0(587934756);
                            p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                            sVar.p(false);
                        } else if (i16 != 1) {
                            i18 = i15;
                            sVar.d0(588437700);
                            String str119 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                            r rVarC1116 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                            if (i18 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zF = z14 | sVar.f(str2);
                            objQ6 = sVar.Q();
                            if (zF) {
                                objQ6 = new in.h(cVar, str2, 17);
                                sVar.o0(objQ6);
                            } else {
                                objQ6 = new in.h(cVar, str2, 17);
                                sVar.o0(objQ6);
                            }
                            p(str119, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC1116, false, null, (fz.a) objQ6, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i16 != 2) {
                            sVar.d0(564801874);
                            sVar.p(false);
                            i18 = i15;
                        } else {
                            sVar.d0(589125621);
                            String str1110 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                            String str1111 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                            r rVarC1117 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                            i19 = i15;
                            if (i19 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zF2 = z15 | sVar.f(str2);
                            objQ7 = sVar.Q();
                            if (zF2) {
                                objQ7 = new in.h(cVar, str2, 18);
                                sVar.o0(objQ7);
                            } else {
                                objQ7 = new in.h(cVar, str2, 18);
                                sVar.o0(objQ7);
                            }
                            i18 = i19;
                            p(str1110, str1111, "ę", d0.n.o(rVarC1117, false, null, (fz.a) objQ7, 15), sVar, 384);
                            sVar.p(false);
                        }
                        i15 = i18;
                        i16 = i17;
                        it2 = it2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    it2 = it2;
                }
                cVar2 = cVar;
                sVar.p(false);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
            } else {
                gVar = gVar4;
            }
            gVar2 = gVar;
            objQ = new x0(cVar, 15);
            sVar.o0(objQ);
            p("/ɔ̃/", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB10, false, null, (fz.a) objQ, 15), sVar, 438);
            r rVarA14 = c2Var.a(oVar, 2.0f);
            u uVarA15 = j0.t.a(dVar2, hVar5, sVar, 0);
            iHashCode6 = Long.hashCode(sVar.T);
            q1 q1VarL118 = sVar.l();
            r rVarC1118 = z1.a.c(sVar, rVarA14);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            t.J(hVar111, uVarA15, sVar);
            t.J(hVar112, q1VarL118, sVar);
            if (sVar.S) {
                e.A(iHashCode6, sVar, iHashCode6, hVar);
            } else {
                e.A(iHashCode6, sVar, iHashCode6, hVar);
            }
            t.J(hVar113, rVarC1118, sVar);
            r rVarB15 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
            if (i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ2 = sVar.Q();
            gVar3 = gVar2;
            if (z12) {
                cVar3 = cVar;
                objQ2 = new x0(cVar3, 16);
                sVar.o0(objQ2);
            } else {
                cVar3 = cVar;
                objQ2 = new x0(cVar3, 16);
                sVar.o0(objQ2);
            }
            p("jedną", "one (feminine accusative)", "ą", d0.n.o(rVarB15, false, null, (fz.a) objQ2, 15), sVar, 438);
            r rVarB16 = d2.h.b(v.a(e2.e(oVar, 1.0f), 1.0f), f.d(f5));
            if (i14 == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            objQ3 = sVar.Q();
            if (z13) {
                objQ3 = new x0(cVar3, 17);
                sVar.o0(objQ3);
            } else {
                objQ3 = new x0(cVar3, 17);
                sVar.o0(objQ3);
            }
            p("mąż", "husband", "ą", d0.n.o(rVarB16, false, null, (fz.a) objQ3, 15), sVar, 438);
            sVar.p(true);
            sVar.p(true);
            objQ4 = sVar.Q();
            if (objQ4 == gVar3) {
                objQ4 = ry.m.g1(q.W0("before b or p\t/ɔm/\n[pol-f-zy-a-1-0-2]\tząb\ntooth\n[pol-f-zy-zab]\tbefore c, cz, d, dz, dż or t\t/ɔn/\n[pol-f-zy-a-1-0-3]\tgorąco\nhot\n[pol-f-zy-gorco]\tbefore ć or dź\t/ɔɲ/\n[pol-f-zy-a-1-0-4]\twziąć\nto take\n[pol-f-zy-wziac]\tbefore g or k\t/ɔŋ/\n[pol-f-zy-a-1-0-5]\tpociąg\ntrain\n[pol-f-zy-pociag]", new String[]{"\t"}, 0, 6), 3, 3);
                sVar.o0(objQ4);
            }
            sVar.d0(-62607973);
            it = ((List) objQ4).iterator();
            while (it.hasNext()) {
                List list10 = (List) it.next();
                r rVarQ19 = j0.c.q(oVar, e1.Min);
                iVar6 = iVar2;
                a2 a2VarA19 = z1.a(j0.i.f35303a, iVar6, sVar, 0);
                iHashCode10 = Long.hashCode(sVar.T);
                q1 q1VarL119 = sVar.l();
                r rVarC1119 = z1.a.c(sVar, rVarQ19);
                k.J.getClass();
                iVar7 = j.f56913b;
                sVar.h0();
                Iterator it6 = it;
                if (sVar.S) {
                    sVar.k(iVar7);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA19, sVar);
                t.J(j.f56916e, q1VarL119, sVar);
                hVar4 = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode10, sVar, iHashCode10, hVar4);
                } else {
                    e.A(iHashCode10, sVar, iHashCode10, hVar4);
                }
                itO2 = d.o(sVar, rVarC1119, j.f56915d, -1201988101, list10);
                i21 = 0;
                while (itO2.hasNext()) {
                    next2 = itO2.next();
                    i22 = i21 + 1;
                    if (i21 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str3 = (String) next2;
                    if (i21 != 0) {
                        iVar8 = iVar6;
                        sVar.d0(-211639773);
                        p(BuildConfig.VERSION_NAME, str3, ypOOxsaJG.vzWqjdDxYeEeCR, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                        sVar.p(false);
                    } else if (i21 != 1) {
                        iVar8 = iVar6;
                        sVar.d0(-211134473);
                        String str1112 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                        r rVarB17 = d2.h.b(e2.c(c2Var.a(oVar, 1.0f), 1.0f), f.d(f5));
                        if (i14 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zF3 = z16 | sVar.f(str3);
                        objQ8 = sVar.Q();
                        if (zF3) {
                            objQ8 = new in.h(cVar3, str3, 15);
                            sVar.o0(objQ8);
                        } else {
                            objQ8 = new in.h(cVar3, str3, 15);
                            sVar.o0(objQ8);
                        }
                        p(str1112, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarB17, false, null, (fz.a) objQ8, 15), sVar, 432);
                        sVar.p(false);
                    } else if (i21 != i24) {
                        sVar.d0(-231198479);
                        sVar.p(false);
                        iVar8 = iVar6;
                    } else {
                        sVar.d0(-210371160);
                        String str1113 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(0);
                        String str1114 = (String) q.W0(str3, new String[]{"\n"}, 0, 6).get(1);
                        r rVarB18 = d2.h.b(e2.c(c2Var.a(oVar, 2.0f), 1.0f), f.d(f5));
                        if (i14 == 4) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        zF4 = z17 | sVar.f(str3);
                        objQ9 = sVar.Q();
                        if (zF4) {
                            objQ9 = new in.h(cVar3, str3, 16);
                            sVar.o0(objQ9);
                        } else {
                            objQ9 = new in.h(cVar3, str3, 16);
                            sVar.o0(objQ9);
                        }
                        r rVarO4 = d0.n.o(rVarB18, false, null, (fz.a) objQ9, 15);
                        iVar8 = iVar6;
                        p(str1113, str1114, "ą", rVarO4, sVar, 384);
                        sVar.p(false);
                    }
                    iVar6 = iVar8;
                    i21 = i22;
                    itO2 = itO2;
                    i24 = 2;
                }
                sVar.p(false);
                sVar.p(true);
                iVar2 = iVar6;
                it = it6;
                i24 = 2;
            }
            iVar3 = iVar2;
            d.B(sVar, false, true, true);
            r rVarQ110 = j0.c.q(oVar, e1.Min);
            a2 a2VarA110 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
            iHashCode7 = Long.hashCode(sVar.T);
            q1 q1VarL1110 = sVar.l();
            r rVarC27 = z1.a.c(sVar, rVarQ110);
            k.J.getClass();
            iVar4 = j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            h hVar118 = j.f56917f;
            t.J(hVar118, a2VarA110, sVar);
            h hVar119 = j.f56916e;
            t.J(hVar119, q1VarL1110, sVar);
            hVar2 = j.f56918g;
            if (sVar.S) {
                str = "\t";
                if (!m.a(sVar.Q(), Integer.valueOf(iHashCode7))) {
                }
                h hVar1110 = j.f56915d;
                t.J(hVar1110, rVarC27, sVar);
                i15 = i14;
                p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
                r rVarA15 = c2Var.a(oVar, 4.8f);
                u uVarA16 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
                iHashCode8 = Long.hashCode(sVar.T);
                q1 q1VarL1111 = sVar.l();
                r rVarC11110 = z1.a.c(sVar, rVarA15);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar4);
                } else {
                    sVar.r0();
                }
                t.J(hVar118, uVarA16, sVar);
                t.J(hVar119, q1VarL1111, sVar);
                if (sVar.S) {
                    e.A(iHashCode8, sVar, iHashCode8, hVar2);
                } else {
                    e.A(iHashCode8, sVar, iHashCode8, hVar2);
                }
                t.J(hVar1110, rVarC11110, sVar);
                objQ5 = sVar.Q();
                if (objQ5 == gVar3) {
                    objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                    sVar.o0(objQ5);
                }
                sVar.d0(240204226);
                it2 = ((List) objQ5).iterator();
                while (it2.hasNext()) {
                    List list11 = (List) it2.next();
                    r rVarQ111 = j0.c.q(oVar, e1.Min);
                    a2 a2VarA111 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                    iHashCode9 = Long.hashCode(sVar.T);
                    q1 q1VarL1112 = sVar.l();
                    r rVarC11111 = z1.a.c(sVar, rVarQ111);
                    k.J.getClass();
                    iVar5 = j.f56913b;
                    sVar.h0();
                    if (sVar.S) {
                        sVar.k(iVar5);
                    } else {
                        sVar.r0();
                    }
                    t.J(j.f56917f, a2VarA111, sVar);
                    t.J(j.f56916e, q1VarL1112, sVar);
                    hVar3 = j.f56918g;
                    if (sVar.S) {
                        e.A(iHashCode9, sVar, iHashCode9, hVar3);
                    } else {
                        e.A(iHashCode9, sVar, iHashCode9, hVar3);
                    }
                    itO = d.o(sVar, rVarC11111, j.f56915d, -899100862, list11);
                    i16 = 0;
                    while (itO.hasNext()) {
                        next = itO.next();
                        i17 = i16 + 1;
                        if (i16 >= 0) {
                            ns.o.V();
                            throw null;
                        }
                        str2 = (String) next;
                        if (i16 != 0) {
                            i18 = i15;
                            sVar.d0(587934756);
                            p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                            sVar.p(false);
                        } else if (i16 != 1) {
                            i18 = i15;
                            sVar.d0(588437700);
                            String str1115 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                            r rVarC11112 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                            if (i18 == 4) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            zF = z14 | sVar.f(str2);
                            objQ6 = sVar.Q();
                            if (zF) {
                                objQ6 = new in.h(cVar, str2, 17);
                                sVar.o0(objQ6);
                            } else {
                                objQ6 = new in.h(cVar, str2, 17);
                                sVar.o0(objQ6);
                            }
                            p(str1115, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC11112, false, null, (fz.a) objQ6, 15), sVar, 432);
                            sVar.p(false);
                        } else if (i16 != 2) {
                            sVar.d0(564801874);
                            sVar.p(false);
                            i18 = i15;
                        } else {
                            sVar.d0(589125621);
                            String str1116 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                            String str1117 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                            r rVarC11113 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                            i19 = i15;
                            if (i19 == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            zF2 = z15 | sVar.f(str2);
                            objQ7 = sVar.Q();
                            if (zF2) {
                                objQ7 = new in.h(cVar, str2, 18);
                                sVar.o0(objQ7);
                            } else {
                                objQ7 = new in.h(cVar, str2, 18);
                                sVar.o0(objQ7);
                            }
                            i18 = i19;
                            p(str1116, str1117, "ę", d0.n.o(rVarC11113, false, null, (fz.a) objQ7, 15), sVar, 384);
                            sVar.p(false);
                        }
                        i15 = i18;
                        i16 = i17;
                        it2 = it2;
                    }
                    sVar.p(false);
                    sVar.p(true);
                    it2 = it2;
                }
                cVar2 = cVar;
                sVar.p(false);
                sVar.p(true);
                sVar.p(true);
                sVar.p(true);
            } else {
                str = "\t";
            }
            e.A(iHashCode7, sVar, iHashCode7, hVar2);
            h hVar1111 = j.f56915d;
            t.J(hVar1111, rVarC27, sVar);
            i15 = i14;
            p("Ę ę", BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.0f), 1.0f), sVar, 438);
            r rVarA16 = c2Var.a(oVar, 4.8f);
            u uVarA17 = j0.t.a(j0.i.f35305c, hVar5, sVar, 0);
            iHashCode8 = Long.hashCode(sVar.T);
            q1 q1VarL1113 = sVar.l();
            r rVarC11114 = z1.a.c(sVar, rVarA16);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar4);
            } else {
                sVar.r0();
            }
            t.J(hVar118, uVarA17, sVar);
            t.J(hVar119, q1VarL1113, sVar);
            if (sVar.S) {
                e.A(iHashCode8, sVar, iHashCode8, hVar2);
            } else {
                e.A(iHashCode8, sVar, iHashCode8, hVar2);
            }
            t.J(hVar1111, rVarC11114, sVar);
            objQ5 = sVar.Q();
            if (objQ5 == gVar3) {
                objQ5 = ry.m.g1(q.W0("single or before ch, f, h, rz, s, sz, ś, w, z, ź or ż\t/ɛ̃/\n[pol-f-zy-e-1-0-1]\tjęzyk \nlanguage\n[pol-f-zy-jezyk]\tend of word\t/ɛ/\n[pol-f-zy-e-1-0-2]\tmogę\nI can\n[pol-f-zy-moge]\tbefore b or p\t/ɛm/\n[pol-f-zy-e-1-0-3]\tzęby\nteeth\n[pol-f-zy-zeby]\tbefore c, cz, d, dz, dż or t\t/ɛn/\n[pol-f-zy-e-1-0-4]\tbędą\n(they) will be\n[pol-f-zy-beda]\tbefore ć or dź\t/ɛɲ/\n[pol-f-zy-e-1-0-5]\tpięć\nfive\n[pol-f-zy-piec]\tbefore g or k\t/ɛŋ/\n[pol-f-zy-e-1-0-6]\tpiękna\nbeautiful\n[pol-f-zy-piekna]", new String[]{str}, 0, 6), 3, 3);
                sVar.o0(objQ5);
            }
            sVar.d0(240204226);
            it2 = ((List) objQ5).iterator();
            while (it2.hasNext()) {
                List list12 = (List) it2.next();
                r rVarQ112 = j0.c.q(oVar, e1.Min);
                a2 a2VarA112 = z1.a(j0.i.f35303a, iVar3, sVar, 0);
                iHashCode9 = Long.hashCode(sVar.T);
                q1 q1VarL1114 = sVar.l();
                r rVarC11115 = z1.a.c(sVar, rVarQ112);
                k.J.getClass();
                iVar5 = j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar5);
                } else {
                    sVar.r0();
                }
                t.J(j.f56917f, a2VarA112, sVar);
                t.J(j.f56916e, q1VarL1114, sVar);
                hVar3 = j.f56918g;
                if (sVar.S) {
                    e.A(iHashCode9, sVar, iHashCode9, hVar3);
                } else {
                    e.A(iHashCode9, sVar, iHashCode9, hVar3);
                }
                itO = d.o(sVar, rVarC11115, j.f56915d, -899100862, list12);
                i16 = 0;
                while (itO.hasNext()) {
                    next = itO.next();
                    i17 = i16 + 1;
                    if (i16 >= 0) {
                        ns.o.V();
                        throw null;
                    }
                    str2 = (String) next;
                    if (i16 != 0) {
                        i18 = i15;
                        sVar.d0(587934756);
                        p(BuildConfig.VERSION_NAME, str2, BuildConfig.VERSION_NAME, e2.c(c2Var.a(oVar, 1.8f), 1.0f), sVar, 390);
                        sVar.p(false);
                    } else if (i16 != 1) {
                        i18 = i15;
                        sVar.d0(588437700);
                        String str1118 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                        r rVarC11116 = e2.c(c2Var.a(oVar, 1.0f), 1.0f);
                        if (i18 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zF = z14 | sVar.f(str2);
                        objQ6 = sVar.Q();
                        if (zF) {
                            objQ6 = new in.h(cVar, str2, 17);
                            sVar.o0(objQ6);
                        } else {
                            objQ6 = new in.h(cVar, str2, 17);
                            sVar.o0(objQ6);
                        }
                        p(str1118, BuildConfig.VERSION_NAME, BuildConfig.VERSION_NAME, d0.n.o(rVarC11116, false, null, (fz.a) objQ6, 15), sVar, 432);
                        sVar.p(false);
                    } else if (i16 != 2) {
                        sVar.d0(564801874);
                        sVar.p(false);
                        i18 = i15;
                    } else {
                        sVar.d0(589125621);
                        String str1119 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(0);
                        String str11110 = (String) q.W0(str2, new String[]{"\n"}, 0, 6).get(1);
                        r rVarC11117 = e2.c(c2Var.a(oVar, 2.0f), 1.0f);
                        i19 = i15;
                        if (i19 == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        zF2 = z15 | sVar.f(str2);
                        objQ7 = sVar.Q();
                        if (zF2) {
                            objQ7 = new in.h(cVar, str2, 18);
                            sVar.o0(objQ7);
                        } else {
                            objQ7 = new in.h(cVar, str2, 18);
                            sVar.o0(objQ7);
                        }
                        i18 = i19;
                        p(str1119, str11110, "ę", d0.n.o(rVarC11117, false, null, (fz.a) objQ7, 15), sVar, 384);
                        sVar.p(false);
                    }
                    i15 = i18;
                    i16 = i17;
                    it2 = it2;
                }
                sVar.p(false);
                sVar.p(true);
                it2 = it2;
            }
            cVar2 = cVar;
            sVar.p(false);
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
        } else {
            cVar2 = cVar;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new e6(cVar2, i11, 18);
        }
    }
}
