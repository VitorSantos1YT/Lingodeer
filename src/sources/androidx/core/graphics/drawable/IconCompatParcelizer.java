package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import sa.a;
import sa.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1400a = aVar.f(iconCompat.f1400a, 1);
        byte[] bArr = iconCompat.f1402c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f51524e;
            int i11 = parcel.readInt();
            if (i11 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i11];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1402c = bArr;
        iconCompat.f1403d = aVar.g(iconCompat.f1403d, 3);
        iconCompat.f1404e = aVar.f(iconCompat.f1404e, 4);
        iconCompat.f1405f = aVar.f(iconCompat.f1405f, 5);
        iconCompat.f1406g = (ColorStateList) aVar.g(iconCompat.f1406g, 6);
        String string = iconCompat.f1408i;
        if (aVar.e(7)) {
            string = ((b) aVar).f51524e.readString();
        }
        iconCompat.f1408i = string;
        String string2 = iconCompat.f1409j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f51524e.readString();
        }
        iconCompat.f1409j = string2;
        iconCompat.f1407h = PorterDuff.Mode.valueOf(iconCompat.f1408i);
        switch (iconCompat.f1400a) {
            case -1:
                Parcelable parcelable = iconCompat.f1403d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1401b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1403d;
                if (parcelable2 != null) {
                    iconCompat.f1401b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f1402c;
                iconCompat.f1401b = bArr3;
                iconCompat.f1400a = 3;
                iconCompat.f1404e = 0;
                iconCompat.f1405f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1402c, Charset.forName("UTF-16"));
                iconCompat.f1401b = str;
                if (iconCompat.f1400a == 2 && iconCompat.f1409j == null) {
                    iconCompat.f1409j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1401b = iconCompat.f1402c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1408i = iconCompat.f1407h.name();
        switch (iconCompat.f1400a) {
            case -1:
                iconCompat.f1403d = (Parcelable) iconCompat.f1401b;
                break;
            case 1:
            case 5:
                iconCompat.f1403d = (Parcelable) iconCompat.f1401b;
                break;
            case 2:
                iconCompat.f1402c = ((String) iconCompat.f1401b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1402c = (byte[]) iconCompat.f1401b;
                break;
            case 4:
            case 6:
                iconCompat.f1402c = iconCompat.f1401b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i11 = iconCompat.f1400a;
        if (-1 != i11) {
            aVar.j(i11, 1);
        }
        byte[] bArr = iconCompat.f1402c;
        if (bArr != null) {
            aVar.i(2);
            Parcel parcel = ((b) aVar).f51524e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1403d;
        if (parcelable != null) {
            aVar.i(3);
            ((b) aVar).f51524e.writeParcelable(parcelable, 0);
        }
        int i12 = iconCompat.f1404e;
        if (i12 != 0) {
            aVar.j(i12, 4);
        }
        int i13 = iconCompat.f1405f;
        if (i13 != 0) {
            aVar.j(i13, 5);
        }
        ColorStateList colorStateList = iconCompat.f1406g;
        if (colorStateList != null) {
            aVar.i(6);
            ((b) aVar).f51524e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1408i;
        if (str != null) {
            aVar.i(7);
            ((b) aVar).f51524e.writeString(str);
        }
        String str2 = iconCompat.f1409j;
        if (str2 != null) {
            aVar.i(8);
            ((b) aVar).f51524e.writeString(str2);
        }
    }
}
