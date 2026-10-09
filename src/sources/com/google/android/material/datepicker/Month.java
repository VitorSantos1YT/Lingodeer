package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.1
        @Override // android.os.Parcelable.Creator
        public final Month createFromParcel(Parcel parcel) {
            return Month.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Month[] newArray(int i11) {
            return new Month[i11];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Calendar f14397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f14402f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f14403t;

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = UtcDates.c(calendar);
        this.f14397a = calendarC;
        this.f14398b = calendarC.get(2);
        this.f14399c = calendarC.get(1);
        this.f14400d = calendarC.getMaximum(7);
        this.f14401e = calendarC.getActualMaximum(5);
        this.f14402f = calendarC.getTimeInMillis();
    }

    public static Month a(int i11, int i12) {
        Calendar calendarG = UtcDates.g(null);
        calendarG.set(1, i11);
        calendarG.set(2, i12);
        return new Month(calendarG);
    }

    public static Month b(long j11) {
        Calendar calendarG = UtcDates.g(null);
        calendarG.setTimeInMillis(j11);
        return new Month(calendarG);
    }

    public final String c() {
        if (this.f14403t == null) {
            this.f14403t = UtcDates.b("yMMMM", Locale.getDefault()).format(new Date(this.f14397a.getTimeInMillis()));
        }
        return this.f14403t;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Month month) {
        return this.f14397a.compareTo(month.f14397a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e(Month month) {
        if (!(this.f14397a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f14398b - this.f14398b) + ((month.f14399c - this.f14399c) * 12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f14398b == month.f14398b && this.f14399c == month.f14399c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14398b), Integer.valueOf(this.f14399c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f14399c);
        parcel.writeInt(this.f14398b);
    }
}
