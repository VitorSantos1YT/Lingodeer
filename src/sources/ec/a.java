package ec;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator<a> CREATOR = new android.support.v4.media.a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f25456b;

    public a(String str, Map map) {
        this.f25455a = str;
        this.f25456b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f25455a, aVar.f25455a) && m.a(this.f25456b, aVar.f25456b);
    }

    public final int hashCode() {
        return this.f25456b.hashCode() + (this.f25455a.hashCode() * 31);
    }

    public final String toString() {
        return "Key(key=" + this.f25455a + ", extras=" + this.f25456b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f25455a);
        Map map = this.f25456b;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            parcel.writeString(str);
            parcel.writeString(str2);
        }
    }
}
