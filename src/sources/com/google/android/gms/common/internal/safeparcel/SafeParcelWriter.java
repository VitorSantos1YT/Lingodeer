package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    public static void a(Parcel parcel, int i11, Boolean bool) {
        if (bool == null) {
            return;
        }
        p(parcel, i11, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void b(Parcel parcel, int i11, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeBundle(bundle);
        r(parcel, iQ);
    }

    public static void c(Parcel parcel, int i11, byte[] bArr, boolean z11) {
        if (bArr == null) {
            if (z11) {
                p(parcel, i11, 0);
            }
        } else {
            int iQ = q(parcel, i11);
            parcel.writeByteArray(bArr);
            r(parcel, iQ);
        }
    }

    public static void d(Parcel parcel, int i11, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        r(parcel, iQ);
    }

    public static void e(Parcel parcel, int i11, Double d5) {
        if (d5 == null) {
            return;
        }
        p(parcel, i11, 8);
        parcel.writeDouble(d5.doubleValue());
    }

    public static void f(Parcel parcel, int i11, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeStrongBinder(iBinder);
        r(parcel, iQ);
    }

    public static void g(Parcel parcel, int i11, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeIntArray(iArr);
        r(parcel, iQ);
    }

    public static void h(Parcel parcel, int i11, Integer num) {
        if (num == null) {
            return;
        }
        p(parcel, i11, 4);
        parcel.writeInt(num.intValue());
    }

    public static void i(Parcel parcel, int i11, Long l9) {
        if (l9 == null) {
            return;
        }
        p(parcel, i11, 8);
        parcel.writeLong(l9.longValue());
    }

    public static void j(Parcel parcel, int i11, Parcelable parcelable, int i12, boolean z11) {
        if (parcelable == null) {
            if (z11) {
                p(parcel, i11, 0);
            }
        } else {
            int iQ = q(parcel, i11);
            parcelable.writeToParcel(parcel, i12);
            r(parcel, iQ);
        }
    }

    public static void k(Parcel parcel, int i11, String str, boolean z11) {
        if (str == null) {
            if (z11) {
                p(parcel, i11, 0);
            }
        } else {
            int iQ = q(parcel, i11);
            parcel.writeString(str);
            r(parcel, iQ);
        }
    }

    public static void l(Parcel parcel, int i11, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeStringArray(strArr);
        r(parcel, iQ);
    }

    public static void m(Parcel parcel, int i11, List list) {
        if (list == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeStringList(list);
        r(parcel, iQ);
    }

    public static void n(Parcel parcel, int i11, Parcelable[] parcelableArr, int i12) {
        if (parcelableArr == null) {
            return;
        }
        int iQ = q(parcel, i11);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i12);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        r(parcel, iQ);
    }

    public static void o(Parcel parcel, int i11, List list, boolean z11) {
        if (list == null) {
            if (z11) {
                p(parcel, i11, 0);
                return;
            }
            return;
        }
        int iQ = q(parcel, i11);
        int size = list.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            Parcelable parcelable = (Parcelable) list.get(i12);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int iDataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int iDataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int iDataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(iDataPosition);
                parcel.writeInt(iDataPosition3 - iDataPosition2);
                parcel.setDataPosition(iDataPosition3);
            }
        }
        r(parcel, iQ);
    }

    public static void p(Parcel parcel, int i11, int i12) {
        parcel.writeInt(i11 | (i12 << 16));
    }

    public static int q(Parcel parcel, int i11) {
        parcel.writeInt(i11 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void r(Parcel parcel, int i11) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i11 - 4);
        parcel.writeInt(iDataPosition - i11);
        parcel.setDataPosition(iDataPosition);
    }
}
