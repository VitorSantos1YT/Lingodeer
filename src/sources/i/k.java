package i;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new android.support.v4.media.a(23);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentSender f33886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Intent f33887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f33888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f33889d;

    public k(IntentSender intentSender, Intent intent, int i11, int i12) {
        m.f(intentSender, "intentSender");
        this.f33886a = intentSender;
        this.f33887b = intent;
        this.f33888c = i11;
        this.f33889d = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i11) {
        m.f(dest, "dest");
        dest.writeParcelable(this.f33886a, i11);
        dest.writeParcelable(this.f33887b, i11);
        dest.writeInt(this.f33888c);
        dest.writeInt(this.f33889d);
    }
}
