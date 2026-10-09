package sa;

import android.os.Parcel;
import android.util.SparseIntArray;
import com.tbruyelle.rxpermissions3.BuildConfig;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f51523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f51524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51526g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f51527h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51528i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51529j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f51530k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), BuildConfig.VERSION_NAME, new e(0), new e(0), new e(0));
    }

    @Override // sa.a
    public final b a() {
        Parcel parcel = this.f51524e;
        int iDataPosition = parcel.dataPosition();
        int i11 = this.f51529j;
        if (i11 == this.f51525f) {
            i11 = this.f51526g;
        }
        return new b(parcel, iDataPosition, i11, ep.a.k(new StringBuilder(), this.f51527h, "  "), this.f51520a, this.f51521b, this.f51522c);
    }

    @Override // sa.a
    public final boolean e(int i11) {
        while (this.f51529j < this.f51526g) {
            int i12 = this.f51530k;
            if (i12 == i11) {
                return true;
            }
            if (String.valueOf(i12).compareTo(String.valueOf(i11)) > 0) {
                return false;
            }
            int i13 = this.f51529j;
            Parcel parcel = this.f51524e;
            parcel.setDataPosition(i13);
            int i14 = parcel.readInt();
            this.f51530k = parcel.readInt();
            this.f51529j += i14;
        }
        return this.f51530k == i11;
    }

    @Override // sa.a
    public final void i(int i11) {
        int i12 = this.f51528i;
        SparseIntArray sparseIntArray = this.f51523d;
        Parcel parcel = this.f51524e;
        if (i12 >= 0) {
            int i13 = sparseIntArray.get(i12);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i13);
            parcel.writeInt(iDataPosition - i13);
            parcel.setDataPosition(iDataPosition);
        }
        this.f51528i = i11;
        sparseIntArray.put(i11, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i11);
    }

    public b(Parcel parcel, int i11, int i12, String str, e eVar, e eVar2, e eVar3) {
        super(eVar, eVar2, eVar3);
        this.f51523d = new SparseIntArray();
        this.f51528i = -1;
        this.f51530k = -1;
        this.f51524e = parcel;
        this.f51525f = i11;
        this.f51526g = i12;
        this.f51529j = i11;
        this.f51527h = str;
    }
}
