package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.1
        @Override // android.os.Parcelable.Creator
        public final TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeModel[] newArray(int i11) {
            return new TimeModel[i11];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaxInputValidator f15796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaxInputValidator f15797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15801f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15802t;

    public TimeModel() {
        this(0, 0, 10, 0);
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public final int b() {
        if (this.f15798c == 1) {
            return this.f15799d % 24;
        }
        int i11 = this.f15799d;
        if (i11 % 12 == 0) {
            return 12;
        }
        return this.f15802t == 1 ? i11 - 12 : i11;
    }

    public final void c(int i11) {
        if (this.f15798c == 1) {
            this.f15799d = i11;
        } else {
            this.f15799d = (i11 % 12) + (this.f15802t != 1 ? 0 : 12);
        }
    }

    public final void d(int i11) {
        if (i11 != this.f15802t) {
            this.f15802t = i11;
            int i12 = this.f15799d;
            if (i12 < 12 && i11 == 1) {
                this.f15799d = i12 + 12;
            } else {
                if (i12 < 12 || i11 != 0) {
                    return;
                }
                this.f15799d = i12 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f15799d == timeModel.f15799d && this.f15800e == timeModel.f15800e && this.f15798c == timeModel.f15798c && this.f15801f == timeModel.f15801f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f15798c), Integer.valueOf(this.f15799d), Integer.valueOf(this.f15800e), Integer.valueOf(this.f15801f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f15799d);
        parcel.writeInt(this.f15800e);
        parcel.writeInt(this.f15801f);
        parcel.writeInt(this.f15798c);
    }

    public TimeModel(int i11, int i12, int i13, int i14) {
        this.f15799d = i11;
        this.f15800e = i12;
        this.f15801f = i13;
        this.f15798c = i14;
        this.f15802t = i11 >= 12 ? 1 : 0;
        this.f15796a = new MaxInputValidator(59);
        this.f15797b = new MaxInputValidator(i14 == 1 ? 23 : 12);
    }
}
