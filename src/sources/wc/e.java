package wc;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends View.BaseSavedState {
    public static final Parcelable.Creator<e> CREATOR = new j0(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f54948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f54949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f54950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f54951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f54952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54953f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f54954t;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.f54948a);
        parcel.writeFloat(this.f54950c);
        parcel.writeInt(this.f54951d ? 1 : 0);
        parcel.writeString(this.f54952e);
        parcel.writeInt(this.f54953f);
        parcel.writeInt(this.f54954t);
    }
}
