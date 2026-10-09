package g3;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f28648b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f28649c = new i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f28650d = new i(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28651a;

    public /* synthetic */ i(int i11) {
        this.f28651a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f28651a) {
            case 0:
                f2.c cVarH = ((t) obj).h();
                f2.c cVarH2 = ((t) obj2).h();
                int iCompare = Float.compare(cVarH.f26572a, cVarH2.f26572a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f26573b, cVarH2.f26573b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f26575d, cVarH2.f26575d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f26574c, cVarH2.f26574c);
            case 1:
                f2.c cVarH3 = ((t) obj).h();
                f2.c cVarH4 = ((t) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f26574c, cVarH3.f26574c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f26573b, cVarH4.f26573b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f26575d, cVarH4.f26575d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f26572a, cVarH3.f26572a);
            default:
                qy.l lVar = (qy.l) obj;
                qy.l lVar2 = (qy.l) obj2;
                int iCompare7 = Float.compare(((f2.c) lVar.f48495a).f26573b, ((f2.c) lVar2.f48495a).f26573b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((f2.c) lVar.f48495a).f26575d, ((f2.c) lVar2.f48495a).f26575d);
        }
    }
}
