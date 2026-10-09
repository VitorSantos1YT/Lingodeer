package com.lingodeer.data.model;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.m;
import wt.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class SRSStatusScheduleKt {
    public static final boolean isDueOn(SRSStatus sRSStatus, LocalDate today, ZoneId zoneId) {
        m.f(sRSStatus, "<this>");
        m.f(today, "today");
        m.f(zoneId, "zoneId");
        LocalDate localDateScheduledDate = scheduledDate(sRSStatus, zoneId);
        return localDateScheduledDate == null || localDateScheduledDate.compareTo((ChronoLocalDate) today) <= 0;
    }

    public static final boolean isNewCard(SRSStatus sRSStatus) {
        m.f(sRSStatus, "<this>");
        return sRSStatus.getStatus() == s.NEW;
    }

    public static final LocalDate scheduledDate(SRSStatus sRSStatus, ZoneId zoneId) {
        m.f(sRSStatus, "<this>");
        m.f(zoneId, "zoneId");
        if (sRSStatus.getNextReviewTime() <= 0) {
            return null;
        }
        return Instant.ofEpochSecond(sRSStatus.getNextReviewTime()).atZone(zoneId).l();
    }
}
