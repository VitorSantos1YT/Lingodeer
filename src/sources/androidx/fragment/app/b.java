package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new android.support.v4.media.a(9);
    public final int H;
    public final CharSequence K;
    public final int L;
    public final CharSequence M;
    public final ArrayList N;
    public final ArrayList O;
    public final boolean P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f1616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f1618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f1619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1621f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1622t;

    public b(a aVar) {
        int size = aVar.f1891a.size();
        this.f1616a = new int[size * 6];
        if (!aVar.f1897g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1617b = new ArrayList(size);
        this.f1618c = new int[size];
        this.f1619d = new int[size];
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            y1 y1Var = (y1) aVar.f1891a.get(i12);
            int i13 = i11 + 1;
            this.f1616a[i11] = y1Var.f1878a;
            ArrayList arrayList = this.f1617b;
            k0 k0Var = y1Var.f1879b;
            arrayList.add(k0Var != null ? k0Var.mWho : null);
            int[] iArr = this.f1616a;
            iArr[i13] = y1Var.f1880c ? 1 : 0;
            iArr[i11 + 2] = y1Var.f1881d;
            iArr[i11 + 3] = y1Var.f1882e;
            int i14 = i11 + 5;
            iArr[i11 + 4] = y1Var.f1883f;
            i11 += 6;
            iArr[i14] = y1Var.f1884g;
            this.f1618c[i12] = y1Var.f1885h.ordinal();
            this.f1619d[i12] = y1Var.f1886i.ordinal();
        }
        this.f1620e = aVar.f1896f;
        this.f1621f = aVar.f1899i;
        this.f1622t = aVar.f1611t;
        this.H = aVar.f1900j;
        this.K = aVar.f1901k;
        this.L = aVar.f1902l;
        this.M = aVar.m;
        this.N = aVar.f1903n;
        this.O = aVar.f1904o;
        this.P = aVar.f1905p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeIntArray(this.f1616a);
        parcel.writeStringList(this.f1617b);
        parcel.writeIntArray(this.f1618c);
        parcel.writeIntArray(this.f1619d);
        parcel.writeInt(this.f1620e);
        parcel.writeString(this.f1621f);
        parcel.writeInt(this.f1622t);
        parcel.writeInt(this.H);
        TextUtils.writeToParcel(this.K, parcel, 0);
        parcel.writeInt(this.L);
        TextUtils.writeToParcel(this.M, parcel, 0);
        parcel.writeStringList(this.N);
        parcel.writeStringList(this.O);
        parcel.writeInt(this.P ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1616a = parcel.createIntArray();
        this.f1617b = parcel.createStringArrayList();
        this.f1618c = parcel.createIntArray();
        this.f1619d = parcel.createIntArray();
        this.f1620e = parcel.readInt();
        this.f1621f = parcel.readString();
        this.f1622t = parcel.readInt();
        this.H = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.K = (CharSequence) creator.createFromParcel(parcel);
        this.L = parcel.readInt();
        this.M = (CharSequence) creator.createFromParcel(parcel);
        this.N = parcel.createStringArrayList();
        this.O = parcel.createStringArrayList();
        this.P = parcel.readInt() != 0;
    }
}
