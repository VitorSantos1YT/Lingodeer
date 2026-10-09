package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalField;
import java.util.ArrayList;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LocalDate f35088h = LocalDate.of(2000, 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ChronoLocalDate f35089g;

    @Override // j$.time.format.j
    public final boolean b(v vVar) {
        if (vVar.f35108c) {
            return super.b(vVar);
        }
        return false;
    }

    public p(TemporalField temporalField, int i11, int i12, ChronoLocalDate chronoLocalDate, int i13) {
        super(temporalField, i11, i12, d0.NOT_NEGATIVE, i13);
        this.f35089g = chronoLocalDate;
    }

    @Override // j$.time.format.j
    public final long a(x xVar, long j11) {
        long jAbs = Math.abs(j11);
        ChronoLocalDate chronoLocalDate = this.f35089g;
        long j12 = chronoLocalDate != null ? Chronology.r(xVar.f35115a).I(chronoLocalDate).get(this.f35064a) : 0;
        long[] jArr = j.f35063f;
        if (j11 >= j12) {
            long j13 = jArr[this.f35065b];
            if (j11 < j12 + j13) {
                return jAbs % j13;
            }
        }
        return jAbs % jArr[this.f35066c];
    }

    @Override // j$.time.format.j
    public final int c(v vVar, long j11, int i11, int i12) {
        final p pVar;
        final v vVar2;
        final long j12;
        final int i13;
        final int i14;
        int i15;
        long j13;
        ChronoLocalDate chronoLocalDate = this.f35089g;
        if (chronoLocalDate != null) {
            i15 = vVar.d().I(chronoLocalDate).get(this.f35064a);
            pVar = this;
            vVar2 = vVar;
            j12 = j11;
            i13 = i11;
            i14 = i12;
            Consumer consumer = new Consumer() { // from class: j$.time.format.o
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f35083a.c(vVar2, j12, i13, i14);
                }
            };
            if (vVar2.f35110e == null) {
                vVar2.f35110e = new ArrayList();
            }
            vVar2.f35110e.add(consumer);
        } else {
            pVar = this;
            vVar2 = vVar;
            j12 = j11;
            i13 = i11;
            i14 = i12;
            i15 = 0;
        }
        int i16 = i14 - i13;
        int i17 = pVar.f35065b;
        if (i16 != i17 || j12 < 0) {
            j13 = j12;
        } else {
            long j14 = j.f35063f[i17];
            long j15 = i15;
            long j16 = j15 - (j15 % j14);
            long j17 = i15 > 0 ? j16 + j12 : j16 - j12;
            j13 = j17 < j15 ? j17 + j14 : j17;
        }
        return vVar2.g(pVar.f35064a, j13, i13, i14);
    }

    @Override // j$.time.format.j
    public final j d() {
        if (this.f35068e == -1) {
            return this;
        }
        return new p(this.f35064a, this.f35065b, this.f35066c, this.f35089g, -1);
    }

    @Override // j$.time.format.j
    public final j e(int i11) {
        return new p(this.f35064a, this.f35065b, this.f35066c, this.f35089g, this.f35068e + i11);
    }

    @Override // j$.time.format.j
    public final String toString() {
        ChronoLocalDate chronoLocalDate = this.f35089g;
        return "ReducedValue(" + this.f35064a + "," + this.f35065b + "," + this.f35066c + "," + (chronoLocalDate != null ? chronoLocalDate : 0) + ")";
    }
}
