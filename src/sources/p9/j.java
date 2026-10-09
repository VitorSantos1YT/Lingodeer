package p9;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends m {
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f46687a;

    public j(Parcel parcel) {
        super(parcel);
        int i11 = parcel.readInt();
        this.f46687a = new HashSet();
        String[] strArr = new String[i11];
        parcel.readStringArray(strArr);
        Collections.addAll(this.f46687a, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f46687a.size());
        HashSet hashSet = this.f46687a;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public j() {
        super(AbsSavedState.EMPTY_STATE);
    }
}
