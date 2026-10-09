package y6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new j(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f57216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f57217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f57218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f57219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f57220e;

    public k(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f57217b = uuid;
        this.f57218c = str;
        str2.getClass();
        this.f57219d = d0.o(str2);
        this.f57220e = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        k kVar = (k) obj;
        return Objects.equals(this.f57218c, kVar.f57218c) && Objects.equals(this.f57219d, kVar.f57219d) && Objects.equals(this.f57217b, kVar.f57217b) && Arrays.equals(this.f57220e, kVar.f57220e);
    }

    public final int hashCode() {
        if (this.f57216a == 0) {
            int iHashCode = this.f57217b.hashCode() * 31;
            String str = this.f57218c;
            this.f57216a = Arrays.hashCode(this.f57220e) + defpackage.e.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f57219d);
        }
        return this.f57216a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        UUID uuid = this.f57217b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f57218c);
        parcel.writeString(this.f57219d);
        parcel.writeByteArray(this.f57220e);
    }

    public k(Parcel parcel) {
        this.f57217b = new UUID(parcel.readLong(), parcel.readLong());
        this.f57218c = parcel.readString();
        String string = parcel.readString();
        String str = b7.f0.f3975a;
        this.f57219d = string;
        this.f57220e = parcel.createByteArray();
    }
}
