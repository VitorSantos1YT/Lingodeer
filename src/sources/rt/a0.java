package rt;

import com.lingodeer.data.model.Bookmark;
import com.lingodeer.data.model.CourseACK;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 extends xy.i implements fz.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ List f49412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ List f49413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f49414c;

    @Override // fz.g
    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        a0 a0Var = new a0(4, (vy.d) obj4);
        a0Var.f49412a = (List) obj;
        a0Var.f49413b = (List) obj2;
        a0Var.f49414c = zBooleanValue;
        return a0Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        Object next;
        List list = this.f49412a;
        List list2 = this.f49413b;
        boolean z11 = this.f49414c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        ArrayList arrayList = new ArrayList(ry.n.W(list2, 10));
        Iterator it = list2.iterator();
        while (true) {
            i11 = 0;
            if (!it.hasNext()) {
                break;
            }
            CourseACK courseACK = (CourseACK) it.next();
            Iterator it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!kotlin.jvm.internal.m.a(((Bookmark) next).getId(), courseACK.getBookmarkId()));
            Bookmark bookmark = (Bookmark) next;
            arrayList.add(courseACK.copy((1727 & 1) != 0 ? courseACK.ackId : 0L, (1727 & 2) != 0 ? courseACK.grammarACK : null, (1727 & 4) != 0 ? courseACK.translation : null, (1727 & 8) != 0 ? courseACK.explanation : null, (1727 & 16) != 0 ? courseACK.unitId : 0L, (1727 & 32) != 0 ? courseACK.examples : null, (1727 & 64) != 0 ? courseACK.unitSortIndex : 0, (1727 & 128) != 0 ? courseACK.canAccess : z11 || courseACK.getUnitSortIndex() == 1, (1727 & 256) != 0 ? courseACK.bookmarkId : null, (1727 & 512) != 0 ? courseACK.isFav : bookmark != null && bookmark.isFav() == 1, (1727 & 1024) != 0 ? courseACK.note : null, (1727 & 2048) != 0 ? courseACK.unitName : null, (1727 & 4096) != 0 ? courseACK.exampleSentences : null));
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList.get(i12);
            i12++;
            if (((CourseACK) obj2).isFav()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(ry.n.W(arrayList, 10));
        int size2 = arrayList.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj3 = arrayList.get(i13);
            i13++;
            arrayList3.add(((CourseACK) obj3).getUnitName());
        }
        List listJ0 = ry.m.j0(arrayList3);
        ArrayList arrayList4 = new ArrayList(ry.n.W(arrayList2, 10));
        int size3 = arrayList2.size();
        while (i11 < size3) {
            Object obj4 = arrayList2.get(i11);
            i11++;
            arrayList4.add(((CourseACK) obj4).getUnitName());
        }
        return new w(arrayList, arrayList2, listJ0, ry.m.j0(arrayList4));
    }
}
