package fr;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.database.model.BookmarkFolderEntity;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import rt.k6;
import rt.oe;
import rt.ue;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a2 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27391b;

    public /* synthetic */ a2(Object obj, int i11) {
        this.f27390a = i11;
        this.f27391b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f27390a) {
            case 0:
                int iCompare = ((b4.e) this.f27391b).compare(obj, obj2);
                return iCompare != 0 ? iCompare : qx.b.i((Comparable) ((Map.Entry) obj).getKey(), (Comparable) ((Map.Entry) obj2).getKey());
            case 1:
                int iCompare2 = ((Comparator) this.f27391b).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                return y2.i0.f56877w0.compare(((g3.t) obj).f28698c, ((g3.t) obj2).f28698c);
            case 2:
                int iCompare3 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : qx.b.i(Integer.valueOf(((g3.t) obj).f28702g), Integer.valueOf(((g3.t) obj2).f28702g));
            case 3:
                lw.o1 o1Var = (lw.o1) this.f27391b;
                int iD = o1Var.d(obj) - o1Var.d(obj2);
                return iD != 0 ? iD : obj.getClass().getName().compareTo(obj2.getClass().getName());
            case 4:
                int iCompare4 = ((gu.g) this.f27391b).compare(obj, obj2);
                return iCompare4 != 0 ? iCompare4 : qx.b.i(((ot.i2) obj).f45854a, ((ot.i2) obj2).f45854a);
            case 5:
                int iCompare5 = ((gu.g) this.f27391b).compare(obj, obj2);
                return iCompare5 != 0 ? iCompare5 : qx.b.i(((SRSStatus) obj).getId(), ((SRSStatus) obj2).getId());
            case 6:
                int iCompare6 = ((gu.g) this.f27391b).compare(obj, obj2);
                return iCompare6 != 0 ? iCompare6 : qx.b.i(Long.valueOf(((oe) obj).f50221b.f49553a.getUnitId()), Long.valueOf(((oe) obj2).f50221b.f49553a.getUnitId()));
            case 7:
                int iCompare7 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare7 != 0 ? iCompare7 : qx.b.i(Integer.valueOf(((oe) obj).f50221b.f49553a.getElemType()), Integer.valueOf(((oe) obj2).f50221b.f49553a.getElemType()));
            case 8:
                int iCompare8 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare8 != 0 ? iCompare8 : qx.b.i(Long.valueOf(((oe) obj).f50221b.f49553a.getElemId()), Long.valueOf(((oe) obj2).f50221b.f49553a.getElemId()));
            case 9:
                int iCompare9 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare9 != 0 ? iCompare9 : qx.b.i(((oe) obj).f50220a, ((oe) obj2).f50220a);
            case 10:
                int iCompare10 = ((gu.g) this.f27391b).compare(obj, obj2);
                return iCompare10 != 0 ? iCompare10 : qx.b.i(((ue) obj).f50511b, ((ue) obj2).f50511b);
            case 11:
                int iCompare11 = ((gu.g) this.f27391b).compare(obj, obj2);
                return iCompare11 != 0 ? iCompare11 : qx.b.i(Long.valueOf(((SRSStatus) obj).getUnitId()), Long.valueOf(((SRSStatus) obj2).getUnitId()));
            case 12:
                int iCompare12 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare12 != 0 ? iCompare12 : qx.b.i(Integer.valueOf(((SRSStatus) obj).getElemType()), Integer.valueOf(((SRSStatus) obj2).getElemType()));
            case 13:
                int iCompare13 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare13 != 0 ? iCompare13 : qx.b.i(Long.valueOf(((SRSStatus) obj).getElemId()), Long.valueOf(((SRSStatus) obj2).getElemId()));
            case 14:
                int iCompare14 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare14 != 0 ? iCompare14 : qx.b.i(((SRSStatus) obj).getId(), ((SRSStatus) obj2).getId());
            case 15:
                int iCompare15 = ((gu.g) this.f27391b).compare(obj, obj2);
                return iCompare15 != 0 ? iCompare15 : qx.b.i(Long.valueOf(((k6) obj).f49972c.getLastStudyTime()), Long.valueOf(((k6) obj2).f49972c.getLastStudyTime()));
            case 16:
                int iCompare16 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare16 != 0 ? iCompare16 : qx.b.i(((k6) obj).f49972c.getId(), ((k6) obj2).f49972c.getId());
            case 17:
                Integer num = 1;
                Set set = (Set) this.f27391b;
                return qx.b.i(set.contains(((BookmarkFolderEntity) obj).getId()) ? 0 : num, set.contains(((BookmarkFolderEntity) obj2).getId()) ? 0 : 1);
            case 18:
                int iCompare17 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare17 != 0 ? iCompare17 : qx.b.i(Long.valueOf(((BookmarkFolderEntity) obj).getTime()), Long.valueOf(((BookmarkFolderEntity) obj2).getTime()));
            case 19:
                int iCompare18 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare18 != 0 ? iCompare18 : qx.b.i(Integer.valueOf(((BookmarkFolderEntity) obj).getServerId()), Integer.valueOf(((BookmarkFolderEntity) obj2).getServerId()));
            case 20:
                int iCompare19 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare19 != 0 ? iCompare19 : qx.b.i(((BookmarkFolderEntity) obj).getId(), ((BookmarkFolderEntity) obj2).getId());
            case 21:
                int iCompare20 = ((ua.e) this.f27391b).compare(obj, obj2);
                return iCompare20 != 0 ? iCompare20 : qx.b.i(Integer.valueOf(((SRSStatus) obj).getLastStudyStatus().ordinal()), Integer.valueOf(((SRSStatus) obj2).getLastStudyStatus().ordinal()));
            default:
                int iCompare21 = ((a2) this.f27391b).compare(obj, obj2);
                return iCompare21 != 0 ? iCompare21 : qx.b.i(Long.valueOf(((SRSStatus) obj).getLastStudyTime()), Long.valueOf(((SRSStatus) obj2).getLastStudyTime()));
        }
    }

    public a2(Comparator comparator) {
        this.f27390a = 1;
        this.f27391b = comparator;
    }
}
