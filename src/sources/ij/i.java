package ij;

import a0.b2;
import b7.e0;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.ReviewNewDao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import ns.o;
import nv.p;
import re.q;
import ry.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f34434b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f34435a;

    public i() {
        if (n.f34440v == null) {
            synchronized (n.class) {
                if (n.f34440v == null) {
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    kotlin.jvm.internal.m.c(lingoSkillApplication);
                    n.f34440v = new n(lingoSkillApplication);
                }
            }
        }
        n nVar = n.f34440v;
        kotlin.jvm.internal.m.c(nVar);
        this.f34435a = nVar;
    }

    public static String a(long j11, int i11, int i12) {
        String strP = xt.d.p(i12);
        if (i11 == 0) {
            strP = strP.concat("w_");
        } else if (i11 == 1) {
            strP = strP.concat("s_");
        } else if (i11 == 2) {
            strP = strP.concat("c_");
        } else if (i11 == 3) {
            strP = strP.concat("sc_");
        } else if (i11 == 4) {
            strP = strP.concat("syllable_");
        }
        return strP + j11;
    }

    public final void b(ReviewNew reviewNew, int i11) {
        if (reviewNew.getUnit() == null) {
            reviewNew.setUnit(-1L);
        }
        reviewNew.setLastStudyTime(Long.valueOf(System.currentTimeMillis() / 1000));
        if (i11 == -2) {
            reviewNew.setStatus("B");
        } else if (i11 == -1) {
            reviewNew.setStatus("A");
        } else if (i11 == 0) {
            reviewNew.setStatus("C");
        } else if (i11 == 1) {
            reviewNew.setStatus("D");
        }
        Integer elemType = reviewNew.getElemType();
        q qVar = vx.b.f54316e;
        if (elemType != null && elemType.intValue() == 0) {
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            if (ry.l.D(new Integer[]{47, 48, 49, 50, 53, 54}, Integer.valueOf(x.n().keyLanguage))) {
                new ay.x(new g(reviewNew, 0)).f(h.f34433a).f(new ob.e(14, this, reviewNew)).k(ky.e.f38937b).g(px.b.a()).h(new dm.a(reviewNew, 17), qVar);
                return;
            }
        }
        new ay.x(new com.google.common.cache.a(4, this, reviewNew)).k(ky.e.f38937b).g(px.b.a()).h(new b2(reviewNew, 20), qVar);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0140 A[PHI: r8
      0x0140: PHI (r8v14 com.lingo.lingoskill.object.ReviewNew) = (r8v12 com.lingo.lingoskill.object.ReviewNew), (r8v15 com.lingo.lingoskill.object.ReviewNew) binds: [B:59:0x0150, B:54:0x013e] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c(int i11, int i12, long j11, long j12) {
        int size;
        List listK;
        Collection collectionT;
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        String id2 = a(j11, i11, x.n().keyLanguage);
        kotlin.jvm.internal.m.f(id2, "id");
        k10.g gVarQueryBuilder = this.f34435a.f34448h.queryBuilder();
        int i13 = 0;
        gVarQueryBuilder.f(ReviewNewDao.Properties.CwsId.b(id2), new k10.h[0]);
        StringBuilder sbC = gVarQueryBuilder.c();
        ArrayList arrayList = gVarQueryBuilder.f37852c;
        if (gVarQueryBuilder.f37855f != null) {
            sbC.append(" LIMIT ?");
            arrayList.add(gVarQueryBuilder.f37855f);
            size = arrayList.size() - 1;
        } else {
            size = -1;
        }
        k10.f fVar = (k10.f) new k10.c(gVarQueryBuilder.f37854e, sbC.toString(), k10.a.b(arrayList.toArray()), size).b();
        fVar.a();
        ReviewNew reviewNew = (ReviewNew) ((org.greenrobot.greendao.a) fVar.f37841b.f40184b).loadUniqueAndCloseCursor(fVar.f37840a.getDatabase().d(fVar.f37842c, fVar.f37843d));
        Matcher matcherW = p.w(0, "_", "compile(...)", id2);
        if (matcherW.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iC = 0;
            do {
                iC = p.c(matcherW, id2, iC, arrayList2);
            } while (matcherW.find());
            p.B(iC, id2, arrayList2);
            listK = arrayList2;
        } else {
            listK = o.K(id2.toString());
        }
        if (!listK.isEmpty()) {
            ListIterator listIterator = listK.listIterator(listK.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT = r.f50854a;
                    break;
                } else if (((String) listIterator.previous()).length() != 0) {
                    collectionT = e0.t(listIterator, 1, listK);
                    break;
                }
            }
        } else {
            collectionT = r.f50854a;
            break;
        }
        String str = ((String[]) collectionT.toArray(new String[0]))[1];
        int iHashCode = str.hashCode();
        if (iHashCode != 99) {
            if (iHashCode != 115) {
                if (iHashCode == 119) {
                    str.equals("w");
                } else if (iHashCode != 3664) {
                    if (iHashCode == 1768164544 && str.equals("syllable")) {
                        i13 = 4;
                    }
                } else if (str.equals("sc")) {
                    i13 = 3;
                }
            } else if (str.equals("s")) {
                i13 = 1;
            }
        } else if (str.equals("c")) {
            i13 = 2;
        }
        if (reviewNew == null) {
            reviewNew = new ReviewNew();
            reviewNew.setCwsId(id2);
            reviewNew.setUnit(Long.valueOf(j12));
            reviewNew.setElemType(Integer.valueOf(i13));
            if (j12 != -1) {
                i12 = -2;
            }
        } else if (j12 != -1 && kotlin.jvm.internal.m.a(reviewNew.getStatus(), "B")) {
            i12 = -2;
        }
        b(reviewNew, i12);
    }
}
