package rt;

import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.SRSStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f50258b;

    public /* synthetic */ q(int i11, Set set) {
        this.f50257a = i11;
        this.f50258b = set;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        boolean zContains;
        boolean z11;
        switch (this.f50257a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                kotlin.jvm.internal.m.f(entry, "<destruct>");
                zContains = this.f50258b.contains(Long.valueOf(((Number) entry.getKey()).longValue()));
                break;
            case 1:
                c1 it = (c1) obj;
                kotlin.jvm.internal.m.f(it, "it");
                zContains = this.f50258b.contains(it.f49553a.getId());
                break;
            case 2:
                Bookmark bookmark = (Bookmark) obj;
                kotlin.jvm.internal.m.f(bookmark, "bookmark");
                Long lB = w8.b(bookmark.getId());
                if (lB == null || !this.f50258b.contains(lB)) {
                    return null;
                }
                return new qy.l(lB, bookmark.getFolderId());
            default:
                SRSStatus review = (SRSStatus) obj;
                kotlin.jvm.internal.m.f(review, "review");
                Set set = this.f50258b;
                if ((set instanceof Collection) && set.isEmpty()) {
                    z11 = false;
                } else {
                    Iterator it2 = set.iterator();
                    while (it2.hasNext()) {
                        if (((x8) it2.next()).a() == review.getElemType()) {
                            z11 = true;
                        }
                    }
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
        return Boolean.valueOf(zContains);
    }
}
