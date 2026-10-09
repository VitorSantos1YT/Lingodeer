package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.1
        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final CalendarConstraints[] newArray(int i11) {
            return new CalendarConstraints[i11];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Month f14300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Month f14301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateValidator f14302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Month f14303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f14304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14305f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f14306t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int f14307c = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f14308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public DateValidator f14309b = new DateValidatorPointForward(Long.MIN_VALUE);

        static {
            UtcDates.a(Month.a(1900, 0).f14402f);
            UtcDates.a(Month.a(2100, 11).f14402f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface DateValidator extends Parcelable {
        boolean L0(long j11);
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i11) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f14300a = month;
        this.f14301b = month2;
        this.f14303d = month3;
        this.f14304e = i11;
        this.f14302c = dateValidator;
        if (month3 != null && month.f14397a.compareTo(month3.f14397a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f14397a.compareTo(month2.f14397a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i11 < 0 || i11 > UtcDates.g(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f14306t = month.e(month2) + 1;
        this.f14305f = (month2.f14399c - month.f14399c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f14300a.equals(calendarConstraints.f14300a) && this.f14301b.equals(calendarConstraints.f14301b) && Objects.equals(this.f14303d, calendarConstraints.f14303d) && this.f14304e == calendarConstraints.f14304e && this.f14302c.equals(calendarConstraints.f14302c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f14300a, this.f14301b, this.f14303d, Integer.valueOf(this.f14304e), this.f14302c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f14300a, 0);
        parcel.writeParcelable(this.f14301b, 0);
        parcel.writeParcelable(this.f14303d, 0);
        parcel.writeParcelable(this.f14302c, 0);
        parcel.writeInt(this.f14304e);
    }
}
