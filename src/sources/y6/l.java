package y6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparator, Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new j(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k[] f57224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f57225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57227d;

    public l(ArrayList arrayList, String str) {
        this(str, false, (k[]) arrayList.toArray(new k[0]));
    }

    public final l a(String str) {
        return Objects.equals(this.f57226c, str) ? this : new l(str, false, this.f57224a);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k kVar = (k) obj;
        k kVar2 = (k) obj2;
        UUID uuid = f.f57188a;
        if (uuid.equals(kVar.f57217b)) {
            return uuid.equals(kVar2.f57217b) ? 0 : 1;
        }
        return kVar.f57217b.compareTo(kVar2.f57217b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (Objects.equals(this.f57226c, lVar.f57226c) && Arrays.equals(this.f57224a, lVar.f57224a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f57225b == 0) {
            String str = this.f57226c;
            this.f57225b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f57224a);
        }
        return this.f57225b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f57226c);
        parcel.writeTypedArray(this.f57224a, 0);
    }

    public l(String str, boolean z11, k... kVarArr) {
        this.f57226c = str;
        kVarArr = z11 ? (k[]) kVarArr.clone() : kVarArr;
        this.f57224a = kVarArr;
        this.f57227d = kVarArr.length;
        Arrays.sort(kVarArr, this);
    }

    public l(Parcel parcel) {
        this.f57226c = parcel.readString();
        k[] kVarArr = (k[]) parcel.createTypedArray(k.CREATOR);
        String str = b7.f0.f3975a;
        this.f57224a = kVarArr;
        this.f57227d = kVarArr.length;
    }
}
