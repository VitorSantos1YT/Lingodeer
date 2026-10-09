package rt;

import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.SRSStatusScheduleKt;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l2 {
    public static final f2 a(ArrayList arrayList, LocalDate localDate, ZoneId zoneId) {
        boolean z11;
        boolean z12;
        fr.a2 a2Var = new fr.a2(new fr.a2(new fr.a2(new fr.a2(new gu.g(22), 11), 12), 13), 14);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (!((SRSStatus) obj).isExcludedFromReview()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList2.get(i12);
            i12++;
            if (SRSStatusScheduleKt.isDueOn((SRSStatus) obj2, localDate, zoneId)) {
                arrayList3.add(obj2);
            }
        }
        List listS0 = ry.m.S0(arrayList3, a2Var);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : listS0) {
            if (!SRSStatusScheduleKt.isNewCard((SRSStatus) obj3)) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj4 : listS0) {
            if (SRSStatusScheduleKt.isNewCard((SRSStatus) obj4)) {
                arrayList5.add(obj4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        int size3 = arrayList2.size();
        int i13 = 0;
        while (i13 < size3) {
            Object obj5 = arrayList2.get(i13);
            i13++;
            SRSStatus sRSStatus = (SRSStatus) obj5;
            LocalDate localDateScheduledDate = SRSStatusScheduleKt.scheduledDate(sRSStatus, zoneId);
            qy.l lVar = localDateScheduledDate != null ? new qy.l(localDateScheduledDate, sRSStatus) : null;
            if (lVar != null) {
                arrayList6.add(lVar);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        int size4 = arrayList6.size();
        int i14 = 0;
        while (i14 < size4) {
            Object obj6 = arrayList6.get(i14);
            i14++;
            if (((LocalDate) ((qy.l) obj6).f48495a).compareTo((ChronoLocalDate) localDate) > 0) {
                arrayList7.add(obj6);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size5 = arrayList7.size();
        int i15 = 0;
        while (i15 < size5) {
            Object obj7 = arrayList7.get(i15);
            i15++;
            qy.l lVar2 = (qy.l) obj7;
            LocalDate localDate2 = (LocalDate) lVar2.f48495a;
            Object arrayList8 = linkedHashMap.get(localDate2);
            if (arrayList8 == null) {
                arrayList8 = new ArrayList();
                linkedHashMap.put(localDate2, arrayList8);
            }
            ((List) arrayList8).add((SRSStatus) lVar2.f48496b);
        }
        Set setEntrySet = new TreeMap(linkedHashMap).entrySet();
        kotlin.jvm.internal.m.e(setEntrySet, "<get-entries>(...)");
        List<Map.Entry> listU0 = ry.m.U0(setEntrySet, 2);
        ArrayList arrayList9 = new ArrayList(ry.n.W(listU0, 10));
        for (Map.Entry entry : listU0) {
            kotlin.jvm.internal.m.c(entry);
            arrayList9.add(new qy.l(((LocalDate) entry.getKey()).format(DateTimeFormatter.ofPattern("MMM dd")), Integer.valueOf(((List) entry.getValue()).size())));
        }
        if (arrayList2.isEmpty()) {
            z11 = false;
            break;
        }
        int size6 = arrayList2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                z11 = false;
                break;
            }
            Object obj8 = arrayList2.get(i16);
            i16++;
            if (!SRSStatusScheduleKt.isNewCard((SRSStatus) obj8)) {
                z11 = true;
                break;
            }
        }
        if (arrayList.isEmpty()) {
            z12 = false;
        } else {
            int size7 = arrayList.size();
            int i17 = 0;
            while (i17 < size7) {
                Object obj9 = arrayList.get(i17);
                i17++;
                int elemType = ((SRSStatus) obj9).getElemType();
                if (elemType >= 0 && elemType < 3) {
                    z12 = true;
                }
            }
            z12 = false;
        }
        return new f2(arrayList4, arrayList5, arrayList5, arrayList9, z11, false, mt.q2.FLASHCARD, z12, 0, false, 0, Integer.MAX_VALUE, false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:45:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x020a  */
    /* JADX WARN: Code duplicated, block: B:58:0x021e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0222  */
    /* JADX WARN: Code duplicated, block: B:61:0x023b  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249  */
    /* JADX WARN: Code duplicated, block: B:67:0x024e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0257  */
    /* JADX WARN: Code duplicated, block: B:72:0x0260  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f7 -> B:57:0x021c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x012e -> B:30:0x0139). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object b(rt.n1 r18, f0.x1 r19, f0.x1 r20, f0.x1 r21, xy.c r22) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.l2.b(rt.n1, f0.x1, f0.x1, f0.x1, xy.c):java.lang.Object");
    }
}
