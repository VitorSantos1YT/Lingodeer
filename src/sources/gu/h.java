package gu;

import j$.time.LocalDate;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import oz.o;
import qy.n;
import ry.l;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f29861a = new o("\\d{8}");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f29862b = l.m0(new String[]{"saved", "streaksaved"});

    public static final boolean a(LinkedHashSet linkedHashSet, ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSetD = qx.b.D(linkedHashSet, arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    LocalDate localDateB = b((String) obj);
                    if (localDateB != null) {
                        int i12 = 1;
                        for (LocalDate localDateMinusDays = localDateB.minusDays(1L); linkedHashSetD.contains(localDateMinusDays.format(DateTimeFormatter.BASIC_ISO_DATE)); localDateMinusDays = localDateMinusDays.minusDays(1L)) {
                            i12++;
                        }
                        for (LocalDate localDatePlusDays = localDateB.plusDays(1L); linkedHashSetD.contains(localDatePlusDays.format(DateTimeFormatter.BASIC_ISO_DATE)); localDatePlusDays = localDatePlusDays.plusDays(1L)) {
                            i12++;
                        }
                        if (i12 <= 2) {
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public static final LocalDate b(String str) {
        Object objL;
        if (!f29861a.f(str)) {
            return null;
        }
        try {
            objL = LocalDate.parse(str, DateTimeFormatter.BASIC_ISO_DATE);
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        return (LocalDate) (objL instanceof n ? null : objL);
    }
}
