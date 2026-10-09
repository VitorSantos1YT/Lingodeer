package bn;

import a5.f;
import com.lingo.lingoskill.object.ReviewNew;
import java.util.Collections;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import nv.p;
import oi.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends ai.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f4468h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:30:0x007b  */
    public b(p0 view, int i11, List reviews) {
        hi.a aVarL;
        super(view, 3);
        m.f(view, "view");
        m.f(reviews, "reviews");
        this.f4468h = reviews;
        if (i11 != 4) {
            Collections.shuffle(reviews);
        }
        int i12 = (i11 == 2 || i11 == 4) ? 1 : 3;
        for (int i13 = 0; i13 < i12; i13++) {
            int size = reviews.size();
            for (int i14 = 0; i14 < size; i14++) {
                ReviewNew reviewNew = (ReviewNew) reviews.get(i14);
                qi.a aVar = new qi.a();
                aVar.f47799b = (int) reviewNew.getId();
                int iA = p.a(reviewNew, "getElemType(...)");
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
                        if (i13 > 0 && this.f40180d.size() >= 20) {
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
                    if (i13 > 0) {
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

    @Override // ai.b, lp.a
    public final f d() {
        return new f(24, false);
    }

    @Override // ai.b, lp.a
    public final c f() {
        return new c(2);
    }
}
