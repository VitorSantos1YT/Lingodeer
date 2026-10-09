package xi;

import android.os.Parcel;
import android.os.Parcelable;
import com.tbruyelle.rxpermissions3.BuildConfig;
import p9.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new j0(26);
    public String H;
    public String K;
    public String L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f56095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f56096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f56097c = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f56098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f56099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String[] f56100f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f56101t;

    public c(long j11, String str) {
        this.f56095a = j11;
        this.f56096b = str;
    }

    public final String[] a() {
        this.f56100f = new String[this.f56099e.split(";").length];
        for (int i11 = 0; i11 < this.f56099e.split(";").length; i11++) {
            this.f56100f[i11] = this.f56099e.split(";")[i11];
            if (this.f56100f[i11].equals("uei")) {
                this.f56100f[i11] = "ui";
            }
            if (this.f56100f[i11].equals("uen")) {
                this.f56100f[i11] = "un";
            }
        }
        return this.f56100f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f56095a);
        parcel.writeString(this.f56096b);
        parcel.writeString(this.f56097c);
        parcel.writeString(this.f56098d);
        parcel.writeString(this.f56099e);
        parcel.writeStringArray(this.f56100f);
        parcel.writeIntArray(this.f56101t);
        parcel.writeString(this.H);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
    }
}
