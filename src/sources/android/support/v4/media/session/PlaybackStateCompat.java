package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bw.ORXQ.ADSb;
import defpackage.e;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new android.support.v4.media.a(8);
    public final long H;
    public final ArrayList K;
    public final long L;
    public final Bundle M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f786f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f787t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CharSequence f789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f790c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f791d;

        public CustomAction(Parcel parcel) {
            this.f788a = parcel.readString();
            this.f789b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f790c = parcel.readInt();
            this.f791d = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f789b) + ", mIcon=" + this.f790c + ", mExtras=" + this.f791d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            parcel.writeString(this.f788a);
            TextUtils.writeToParcel(this.f789b, parcel, i11);
            parcel.writeInt(this.f790c);
            parcel.writeBundle(this.f791d);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f781a = parcel.readInt();
        this.f782b = parcel.readLong();
        this.f784d = parcel.readFloat();
        this.H = parcel.readLong();
        this.f783c = parcel.readLong();
        this.f785e = parcel.readLong();
        this.f787t = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.K = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.L = parcel.readLong();
        this.M = parcel.readBundle(a.class.getClassLoader());
        this.f786f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f781a);
        parcel.writeLong(this.f782b);
        parcel.writeFloat(this.f784d);
        parcel.writeLong(this.H);
        parcel.writeLong(this.f783c);
        parcel.writeLong(this.f785e);
        TextUtils.writeToParcel(this.f787t, parcel, i11);
        parcel.writeTypedList(this.K);
        parcel.writeLong(this.L);
        parcel.writeBundle(this.M);
        parcel.writeInt(this.f786f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaybackState {state=");
        sb2.append(this.f781a);
        sb2.append(", position=");
        sb2.append(this.f782b);
        sb2.append(", buffered position=");
        sb2.append(this.f783c);
        sb2.append(", speed=");
        sb2.append(this.f784d);
        sb2.append(", updated=");
        sb2.append(this.H);
        sb2.append(ADSb.hIoCNQNWl);
        sb2.append(this.f785e);
        sb2.append(", error code=");
        sb2.append(this.f786f);
        sb2.append(", error message=");
        sb2.append(this.f787t);
        sb2.append(", custom actions=");
        sb2.append(this.K);
        sb2.append(", active item id=");
        return e.i(this.L, "}", sb2);
    }
}
