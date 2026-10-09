package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import k5.b;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ExtendableSavedState extends b {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.ClassLoaderCreator
        public final ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new ExtendableSavedState[i11];
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f15512c;

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f15512c = new t0(0);
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f15512c + "}";
    }

    @Override // k5.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        t0 t0Var = this.f15512c;
        int i12 = t0Var.f56767c;
        parcel.writeInt(i12);
        String[] strArr = new String[i12];
        Bundle[] bundleArr = new Bundle[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            strArr[i13] = (String) t0Var.f(i13);
            bundleArr[i13] = (Bundle) t0Var.j(i13);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i11 = parcel.readInt();
        String[] strArr = new String[i11];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i11];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f15512c = new t0(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            this.f15512c.put(strArr[i12], bundleArr[i12]);
        }
    }
}
