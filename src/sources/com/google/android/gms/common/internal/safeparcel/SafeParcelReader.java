package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.e;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import nv.p;
import w4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SafeParcelReader {

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int iDataPosition = parcel.dataPosition();
            int iDataSize = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
            sb2.append(str);
            sb2.append(" Parcel: pos=");
            sb2.append(iDataPosition);
            sb2.append(" size=");
            sb2.append(iDataSize);
            super(sb2.toString());
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal a(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i12 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iV);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i12);
    }

    public static Bundle b(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iV);
        return bundle;
    }

    public static byte[] c(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iV);
        return bArrCreateByteArray;
    }

    public static byte[][] d(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        int i12 = parcel.readInt();
        byte[][] bArr = new byte[i12][];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i13] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iV);
        return bArr;
    }

    public static int[] e(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iV);
        return iArrCreateIntArray;
    }

    public static Parcelable f(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iV);
        return parcelable;
    }

    public static String g(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iV);
        return string;
    }

    public static String[] h(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iV);
        return strArrCreateStringArray;
    }

    public static ArrayList i(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iV);
        return arrayListCreateStringArrayList;
    }

    public static Object[] j(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iV);
        return objArrCreateTypedArray;
    }

    public static ArrayList k(Parcel parcel, int i11, Parcelable.Creator creator) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iV);
        return arrayListCreateTypedArrayList;
    }

    public static void l(Parcel parcel, int i11) {
        if (parcel.dataPosition() != i11) {
            throw new ParseException(e.g(i11, "Overread allowed size end=", new StringBuilder(String.valueOf(i11).length() + 26)), parcel);
        }
    }

    public static boolean m(Parcel parcel, int i11) {
        y(parcel, i11, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean n(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        if (iV == 0) {
            return null;
        }
        z(parcel, iV, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double o(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        if (iV == 0) {
            return null;
        }
        z(parcel, iV, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float p(Parcel parcel, int i11) {
        y(parcel, i11, 4);
        return parcel.readFloat();
    }

    public static IBinder q(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        int iDataPosition = parcel.dataPosition();
        if (iV == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iV);
        return strongBinder;
    }

    public static int r(Parcel parcel, int i11) {
        y(parcel, i11, 4);
        return parcel.readInt();
    }

    public static Integer s(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        if (iV == 0) {
            return null;
        }
        z(parcel, iV, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long t(Parcel parcel, int i11) {
        y(parcel, i11, 8);
        return parcel.readLong();
    }

    public static Long u(Parcel parcel, int i11) {
        int iV = v(parcel, i11);
        if (iV == 0) {
            return null;
        }
        z(parcel, iV, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int v(Parcel parcel, int i11) {
        return (i11 & (-65536)) != -65536 ? (char) (i11 >> 16) : parcel.readInt();
    }

    public static void w(Parcel parcel, int i11) {
        parcel.setDataPosition(parcel.dataPosition() + v(parcel, i11));
    }

    public static int x(Parcel parcel) {
        int i11 = parcel.readInt();
        int iV = v(parcel, i11);
        char c11 = (char) i11;
        int iDataPosition = parcel.dataPosition();
        if (c11 != 20293) {
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i11))), parcel);
        }
        int i12 = iV + iDataPosition;
        if (i12 >= iDataPosition && i12 <= parcel.dataSize()) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i12).length());
        sb2.append("Size read is invalid start=");
        sb2.append(iDataPosition);
        sb2.append(" end=");
        sb2.append(i12);
        throw new ParseException(sb2.toString(), parcel);
    }

    public static void y(Parcel parcel, int i11, int i12) {
        int iV = v(parcel, i11);
        if (iV == i12) {
            return;
        }
        String hexString = Integer.toHexString(iV);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iV).length() + 4 + 1);
        c.t(i12, iV, "Expected size ", " got ", sb2);
        throw new ParseException(p.u(sb2, " (0x", hexString, ")"), parcel);
    }

    public static void z(Parcel parcel, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        String hexString = Integer.toHexString(i11);
        int length = String.valueOf(i12).length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i11).length() + 4 + 1);
        c.t(i12, i11, "Expected size ", " got ", sb2);
        throw new ParseException(p.u(sb2, " (0x", hexString, ")"), parcel);
    }
}
