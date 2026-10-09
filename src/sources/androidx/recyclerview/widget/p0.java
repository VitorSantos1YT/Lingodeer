package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2583a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2583a) {
            case 0:
                q0 q0Var = new q0();
                q0Var.f2591a = parcel.readInt();
                q0Var.f2592b = parcel.readInt();
                q0Var.f2593c = parcel.readInt() == 1;
                return q0Var;
            case 1:
                n2 n2Var = new n2();
                n2Var.f2550a = parcel.readInt();
                n2Var.f2551b = parcel.readInt();
                n2Var.f2553d = parcel.readInt() == 1;
                int i11 = parcel.readInt();
                if (i11 > 0) {
                    int[] iArr = new int[i11];
                    n2Var.f2552c = iArr;
                    parcel.readIntArray(iArr);
                }
                return n2Var;
            default:
                o2 o2Var = new o2();
                o2Var.f2569a = parcel.readInt();
                o2Var.f2570b = parcel.readInt();
                int i12 = parcel.readInt();
                o2Var.f2571c = i12;
                if (i12 > 0) {
                    int[] iArr2 = new int[i12];
                    o2Var.f2572d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int i13 = parcel.readInt();
                o2Var.f2573e = i13;
                if (i13 > 0) {
                    int[] iArr3 = new int[i13];
                    o2Var.f2574f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                o2Var.H = parcel.readInt() == 1;
                o2Var.K = parcel.readInt() == 1;
                o2Var.L = parcel.readInt() == 1;
                o2Var.f2575t = parcel.readArrayList(n2.class.getClassLoader());
                return o2Var;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f2583a) {
            case 0:
                return new q0[i11];
            case 1:
                return new n2[i11];
            default:
                return new o2[i11];
        }
    }
}
