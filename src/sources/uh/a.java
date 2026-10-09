package uh;

import java.util.ArrayList;
import java.util.List;
import ns.o;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f52967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f52968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f52969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f52970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f52971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52972f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f52973g;

    static {
        List listK = o.K("lifetime_membership_kr");
        f52967a = listK;
        List listK2 = o.K("lifetime_membership_vip_kr");
        f52968b = listK2;
        List listL = o.L("sd1_month_1_kr", "sd1_month_3_kr", "sd1_month_12_kr");
        f52969c = listL;
        List listL2 = o.L("sd1_month_1_vip_kr", "sd1_month_3_vip_kr", "sd1_month_12_vip_kr");
        f52970d = listL2;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(listL);
        arrayList.addAll(listL2);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(listK);
        arrayList2.addAll(listK2);
        f52971e = "o72RGIoN0T";
        f52972f = "nMwMIIB8mxjxn";
        f52973g = "ok=";
    }
}
