package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Operator f14326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f14327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AnonymousClass1 f14324c = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.1
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final boolean a(long j11, ArrayList arrayList) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) obj;
                if (dateValidator != null && dateValidator.L0(j11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final int getId() {
            return 1;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AnonymousClass2 f14325d = new Operator() { // from class: com.google.android.material.datepicker.CompositeDateValidator.2
        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final boolean a(long j11, ArrayList arrayList) {
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) obj;
                if (dateValidator != null && !dateValidator.L0(j11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.Operator
        public final int getId() {
            return 2;
        }
    };
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new Parcelable.Creator<CompositeDateValidator>() { // from class: com.google.android.material.datepicker.CompositeDateValidator.3
        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator createFromParcel(Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i11 = parcel.readInt();
            Operator operator = (i11 != 2 && i11 == 1) ? CompositeDateValidator.f14324c : CompositeDateValidator.f14325d;
            arrayList.getClass();
            return new CompositeDateValidator(arrayList, operator);
        }

        @Override // android.os.Parcelable.Creator
        public final CompositeDateValidator[] newArray(int i11) {
            return new CompositeDateValidator[i11];
        }
    };

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface Operator {
        boolean a(long j11, ArrayList arrayList);

        int getId();
    }

    public CompositeDateValidator(ArrayList arrayList, Operator operator) {
        this.f14327b = arrayList;
        this.f14326a = operator;
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean L0(long j11) {
        return this.f14326a.a(j11, this.f14327b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f14327b.equals(compositeDateValidator.f14327b) && this.f14326a.getId() == compositeDateValidator.f14326a.getId();
    }

    public final int hashCode() {
        return this.f14327b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(this.f14327b);
        parcel.writeInt(this.f14326a.getId());
    }
}
