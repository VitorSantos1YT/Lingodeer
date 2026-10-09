package ti;

import ai.b;
import b7.e0;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.ReviewNew;
import com.lingo.lingoskill.object.ReviewNewDao;
import com.tbruyelle.rxpermissions3.BuildConfig;
import ij.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k10.g;
import k10.h;
import kotlin.jvm.internal.m;
import org.greenrobot.greendao.d;
import oz.q;
import se.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f52427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    public a(mp.b view, int i11, List list) {
        hi.a aVarL;
        super(view, 15);
        m.f(view, "view");
        this.f52427h = list;
        if (i11 != 0 && i11 != 1 && i11 != 2 && i11 != 100 && i11 != -1) {
            throw new IllegalArgumentException();
        }
        if (list == null) {
            if (i.f34434b == null) {
                synchronized (i.class) {
                    if (i.f34434b == null) {
                        i.f34434b = new i();
                    }
                }
            }
            i iVar = i.f34434b;
            m.c(iVar);
            g gVarQueryBuilder = iVar.f34435a.f34448h.queryBuilder();
            d dVar = ReviewNewDao.Properties.CwsId;
            LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
            h hVarE = dVar.e(xt.d.p(x.n().keyLanguage).concat("%"));
            h hVarB = ReviewNewDao.Properties.ElemType.b(Integer.valueOf(i11));
            d dVar2 = ReviewNewDao.Properties.Unit;
            Long[] lArrS = p.S();
            gVarQueryBuilder.f(hVarE, hVarB, dVar2.d(Arrays.copyOf(lArrS, lArrS.length)));
            List listD = gVarQueryBuilder.d();
            ArrayList arrayListR = e0.r("list(...)", listD);
            for (Object obj : listD) {
                String cwsId = ((ReviewNew) obj).getCwsId();
                m.e(cwsId, "getCwsId(...)");
                Object obj2 = q.W0(cwsId, new String[]{"_"}, 0, 6).get(0);
                LingoSkillApplication lingoSkillApplication2 = LingoSkillApplication.f21665b;
                if (m.a(obj2, oz.x.q0(xt.d.p(x.n().keyLanguage), "_", BuildConfig.VERSION_NAME))) {
                    arrayListR.add(obj);
                }
            }
            list = ry.m.c1(arrayListR.subList(0, Math.min(40, arrayListR.size())));
        }
        Collections.shuffle(list);
        for (int i12 = 0; i12 < 3; i12++) {
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                ReviewNew reviewNew = (ReviewNew) list.get(i13);
                qi.a aVar = new qi.a();
                aVar.f47799b = (int) reviewNew.getId();
                int iA = nv.p.a(reviewNew, "getElemType(...)");
                aVar.f47798a = iA;
                if (iA == 0) {
                    List listB = lp.a.b(aVar.f47799b);
                    aVar.f47802e = listB;
                    if (listB.size() > 0) {
                        k(aVar);
                        aVarL = l(aVar);
                        if (aVarL != null) {
                            this.f40180d.add(aVar);
                            this.f40181e.add(aVarL);
                        }
                        if (i12 > 0 && this.f40180d.size() >= 20) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (iA == 1) {
                        List listA = lp.a.a(aVar.f47799b);
                        aVar.f47802e = listA;
                        if (listA.size() <= 0) {
                            continue;
                        } else {
                            k(aVar);
                        }
                    } else if (iA == 2) {
                        aVar.f47800c = 2;
                    }
                    aVarL = l(aVar);
                    if (aVarL != null) {
                        this.f40180d.add(aVar);
                        this.f40181e.add(aVarL);
                    }
                    if (i12 > 0) {
                        continue;
                    }
                }
            }
            if (this.f40180d.size() >= 20) {
                break;
            }
        }
        h(this.f40180d);
        i(this.f40181e);
    }
}
