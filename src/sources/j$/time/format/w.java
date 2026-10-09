package j$.time.format;

import com.tbruyelle.rxpermissions3.BuildConfig;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChronoLocalDate f35111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TemporalAccessor f35112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Chronology f35113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ZoneId f35114d;

    public w(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.f35111a = chronoLocalDate;
        this.f35112b = temporalAccessor;
        this.f35113c = chronology;
        this.f35114d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean h(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f35111a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.h(temporalField);
        }
        return this.f35112b.h(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.p k(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f35111a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.k(temporalField);
        }
        return this.f35112b.k(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long j(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.f35111a;
        if (chronoLocalDate != null && temporalField.isDateBased()) {
            return chronoLocalDate.j(temporalField);
        }
        return this.f35112b.j(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object d(j$.time.f fVar) {
        if (fVar == j$.time.temporal.n.f35177b) {
            return this.f35113c;
        }
        if (fVar == j$.time.temporal.n.f35176a) {
            return this.f35114d;
        }
        if (fVar == j$.time.temporal.n.f35178c) {
            return this.f35112b.d(fVar);
        }
        return fVar.k(this);
    }

    public final String toString() {
        String str;
        String str2 = BuildConfig.VERSION_NAME;
        Chronology chronology = this.f35113c;
        if (chronology != null) {
            str = " with chronology " + chronology;
        } else {
            str = BuildConfig.VERSION_NAME;
        }
        ZoneId zoneId = this.f35114d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f35112b + str + str2;
    }
}
