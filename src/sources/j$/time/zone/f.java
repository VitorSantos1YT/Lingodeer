package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.chrono.p;
import j$.time.temporal.ChronoField;
import j$.time.temporal.l;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f35221i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e[] f35222j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f35223k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f35224l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f35225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f35226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f35227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f35228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f35229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f35230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeZone f35231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentMap f35232h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f35207b;
        if (bVar.w()) {
            if (localDateTime.H(localDateTime2)) {
                return bVar.f35208c;
            }
            if (!localDateTime.H(bVar.f35207b.Z(bVar.f35209d.f34941b - bVar.f35208c.f34941b))) {
                return bVar.f35209d;
            }
        } else {
            if (!localDateTime.H(localDateTime2)) {
                return bVar.f35209d;
            }
            if (localDateTime.H(bVar.f35207b.Z(bVar.f35209d.f34941b - bVar.f35208c.f34941b))) {
                return bVar.f35208c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f35225a = jArr;
        this.f35226b = zoneOffsetArr;
        this.f35227c = jArr2;
        this.f35229e = zoneOffsetArr2;
        this.f35230f = eVarArr;
        if (jArr2.length == 0) {
            this.f35228d = f35223k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i11 = 0;
            while (i11 < jArr2.length) {
                int i12 = i11 + 1;
                b bVar = new b(jArr2[i11], zoneOffsetArr2[i11], zoneOffsetArr2[i12]);
                if (bVar.w()) {
                    arrayList.add(bVar.f35207b);
                    arrayList.add(bVar.f35207b.Z(bVar.f35209d.f34941b - bVar.f35208c.f34941b));
                } else {
                    arrayList.add(bVar.f35207b.Z(bVar.f35209d.f34941b - bVar.f35208c.f34941b));
                    arrayList.add(bVar.f35207b);
                }
                i11 = i12;
            }
            this.f35228d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f35231g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f35226b = zoneOffsetArr;
        long[] jArr = f35221i;
        this.f35225a = jArr;
        this.f35227c = jArr;
        this.f35228d = f35223k;
        this.f35229e = zoneOffsetArr;
        this.f35230f = f35222j;
        this.f35231g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {h(timeZone.getRawOffset())};
        this.f35226b = zoneOffsetArr;
        long[] jArr = f35221i;
        this.f35225a = jArr;
        this.f35227c = jArr;
        this.f35228d = f35223k;
        this.f35229e = zoneOffsetArr;
        this.f35230f = f35222j;
        this.f35231g = timeZone;
    }

    public static ZoneOffset h(int i11) {
        return ZoneOffset.c0(i11 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f35231g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j11, ZoneOffset zoneOffset) {
        return LocalDate.ofEpochDay(Math.floorDiv(j11 + ((long) zoneOffset.f34941b), 86400)).getYear();
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f35231g;
        if (timeZone != null) {
            return h(timeZone.getOffset(instant.toEpochMilli()));
        }
        if (this.f35227c.length == 0) {
            return this.f35226b[0];
        }
        long epochSecond = instant.getEpochSecond();
        if (this.f35230f.length > 0) {
            long[] jArr = this.f35227c;
            if (epochSecond > jArr[jArr.length - 1]) {
                ZoneOffset[] zoneOffsetArr = this.f35229e;
                b[] bVarArrB = b(c(epochSecond, zoneOffsetArr[zoneOffsetArr.length - 1]));
                b bVar = null;
                for (int i11 = 0; i11 < bVarArrB.length; i11++) {
                    bVar = bVarArrB[i11];
                    if (epochSecond < bVar.f35206a) {
                        return bVar.f35208c;
                    }
                }
                return bVar.f35209d;
            }
        }
        int iBinarySearch = Arrays.binarySearch(this.f35227c, epochSecond);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return this.f35229e[iBinarySearch + 1];
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.w() ? Collections.EMPTY_LIST : j$.time.b.c(new Object[]{bVar.f35208c, bVar.f35209d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r8.w(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r8.f34923b.f0() <= r0.f34923b.f0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i11) {
        LocalDate localDateB;
        b[] bVarArr = f35224l;
        Integer numValueOf = Integer.valueOf(i11);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.f35232h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j11 = 1;
        int i12 = 0;
        int i13 = 1;
        if (this.f35231g != null) {
            if (i11 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f34920c;
            LocalDate localDateOf = LocalDate.of(i11 - 1, 12, 31);
            ChronoField.HOUR_OF_DAY.Z(0);
            long epochSecond = new LocalDateTime(localDateOf, LocalTime.f34926g[0]).toEpochSecond(this.f35226b[0]);
            long j12 = 1000;
            int offset = this.f35231g.getOffset(epochSecond * 1000);
            long j13 = 31968000 + epochSecond;
            while (epochSecond < j13) {
                long j14 = epochSecond + 7776000;
                long j15 = j12;
                if (offset != this.f35231g.getOffset(j14 * j15)) {
                    while (j14 - epochSecond > j11) {
                        long jFloorDiv = Math.floorDiv(j14 + epochSecond, 2L);
                        if (this.f35231g.getOffset(jFloorDiv * j15) == offset) {
                            epochSecond = jFloorDiv;
                        } else {
                            j14 = jFloorDiv;
                        }
                        j11 = 1;
                    }
                    if (this.f35231g.getOffset(epochSecond * j15) == offset) {
                        epochSecond = j14;
                    }
                    ZoneOffset zoneOffsetH = h(offset);
                    int offset2 = this.f35231g.getOffset(epochSecond * j15);
                    ZoneOffset zoneOffsetH2 = h(offset2);
                    if (c(epochSecond, zoneOffsetH2) == i11) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(epochSecond, zoneOffsetH, zoneOffsetH2);
                    }
                    offset = offset2;
                } else {
                    epochSecond = j14;
                }
                j12 = j15;
                j11 = 1;
            }
            if (1916 <= i11 && i11 < 2100) {
                ((ConcurrentHashMap) this.f35232h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f35230f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i14 = 0;
        while (i14 < eVarArr.length) {
            e eVar = eVarArr[i14];
            byte b3 = eVar.f35213b;
            if (b3 < 0) {
                Month month = eVar.f35212a;
                long j16 = i11;
                int iB = month.B(p.f34989d.X(j16)) + 1 + eVar.f35213b;
                LocalDate localDate = LocalDate.f34915d;
                ChronoField.YEAR.Z(j16);
                ChronoField.DAY_OF_MONTH.Z(iB);
                localDateB = LocalDate.B(i11, month.getValue(), iB);
                DayOfWeek dayOfWeek = eVar.f35214c;
                if (dayOfWeek != null) {
                    localDateB = localDateB.e(new l(dayOfWeek.getValue(), i13));
                }
            } else {
                Month month2 = eVar.f35212a;
                LocalDate localDate2 = LocalDate.f34915d;
                ChronoField.YEAR.Z(i11);
                ChronoField.DAY_OF_MONTH.Z(b3);
                localDateB = LocalDate.B(i11, month2.getValue(), b3);
                DayOfWeek dayOfWeek2 = eVar.f35214c;
                if (dayOfWeek2 != null) {
                    localDateB = localDateB.e(new l(dayOfWeek2.getValue(), i12));
                }
            }
            if (eVar.f35216e) {
                localDateB = localDateB.plusDays(1L);
            }
            LocalDateTime localDateTimeJ = LocalDateTime.J(localDateB, eVar.f35215d);
            d dVar = eVar.f35217f;
            ZoneOffset zoneOffset = eVar.f35218g;
            ZoneOffset zoneOffset2 = eVar.f35219h;
            int i15 = c.f35210a[dVar.ordinal()];
            if (i15 == 1) {
                localDateTimeJ = localDateTimeJ.Z(zoneOffset2.f34941b - ZoneOffset.UTC.f34941b);
            } else if (i15 == 2) {
                localDateTimeJ = localDateTimeJ.Z(zoneOffset2.f34941b - zoneOffset.f34941b);
            }
            bVarArr3[i14] = new b(localDateTimeJ, eVar.f35219h, eVar.f35220i);
            i14++;
            i12 = 0;
        }
        if (i11 < 2100) {
            ((ConcurrentHashMap) this.f35232h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean g(Instant instant) {
        ZoneOffset zoneOffsetH;
        TimeZone timeZone = this.f35231g;
        if (timeZone != null) {
            zoneOffsetH = h(timeZone.getRawOffset());
        } else if (this.f35227c.length == 0) {
            zoneOffsetH = this.f35226b[0];
        } else {
            int iBinarySearch = Arrays.binarySearch(this.f35225a, instant.getEpochSecond());
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            zoneOffsetH = this.f35226b[iBinarySearch + 1];
        }
        return !zoneOffsetH.equals(d(instant));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f35231g, fVar.f35231g) && Arrays.equals(this.f35225a, fVar.f35225a) && Arrays.equals(this.f35226b, fVar.f35226b) && Arrays.equals(this.f35227c, fVar.f35227c) && Arrays.equals(this.f35229e, fVar.f35229e) && Arrays.equals(this.f35230f, fVar.f35230f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f35231g) ^ Arrays.hashCode(this.f35225a)) ^ Arrays.hashCode(this.f35226b)) ^ Arrays.hashCode(this.f35227c)) ^ Arrays.hashCode(this.f35229e)) ^ Arrays.hashCode(this.f35230f);
    }

    public final String toString() {
        TimeZone timeZone = this.f35231g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        ZoneOffset[] zoneOffsetArr = this.f35226b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + "]";
    }
}
