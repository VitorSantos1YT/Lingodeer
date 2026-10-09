package y6;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<k0> CREATOR = new j(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57223c;

    static {
        b7.f0.G(0);
        b7.f0.G(1);
        b7.f0.G(2);
    }

    public k0() {
        this.f57221a = -1;
        this.f57222b = -1;
        this.f57223c = -1;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        k0 k0Var = (k0) obj;
        int i11 = this.f57221a - k0Var.f57221a;
        if (i11 != 0) {
            return i11;
        }
        int i12 = this.f57222b - k0Var.f57222b;
        return i12 == 0 ? this.f57223c - k0Var.f57223c : i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f57221a == k0Var.f57221a && this.f57222b == k0Var.f57222b && this.f57223c == k0Var.f57223c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f57221a * 31) + this.f57222b) * 31) + this.f57223c;
    }

    public final String toString() {
        return this.f57221a + "." + this.f57222b + "." + this.f57223c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f57221a);
        parcel.writeInt(this.f57222b);
        parcel.writeInt(this.f57223c);
    }

    public k0(Parcel parcel) {
        this.f57221a = parcel.readInt();
        this.f57222b = parcel.readInt();
        this.f57223c = parcel.readInt();
    }
}
