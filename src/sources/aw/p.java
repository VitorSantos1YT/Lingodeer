package aw;

import android.os.Parcel;
import android.os.Parcelable;
import com.liulishuo.filedownloader.message.MessageSnapshot$NoFieldException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new android.support.v4.media.a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3238b;

    public p(int i11) {
        this.f3237a = i11;
    }

    public void b() {
        throw new MessageSnapshot$NoFieldException("getEtag", this);
    }

    public String c() {
        throw new MessageSnapshot$NoFieldException("getFileName", this);
    }

    public long d() {
        throw new MessageSnapshot$NoFieldException("getLargeSofarBytes", this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        throw new MessageSnapshot$NoFieldException("getLargeTotalBytes", this);
    }

    public int g() {
        throw new MessageSnapshot$NoFieldException("getRetryingTimes", this);
    }

    public int i() {
        throw new MessageSnapshot$NoFieldException("getSmallSofarBytes", this);
    }

    public int j() {
        throw new MessageSnapshot$NoFieldException("getSmallTotalBytes", this);
    }

    public abstract /* synthetic */ byte k();

    public Throwable l() {
        throw new MessageSnapshot$NoFieldException("getThrowable", this);
    }

    public void m() {
        throw new MessageSnapshot$NoFieldException("isResuming", this);
    }

    public void n() {
        throw new MessageSnapshot$NoFieldException("isReusedDownloadedFile", this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.f3238b ? (byte) 1 : (byte) 0);
        parcel.writeByte(k());
        parcel.writeInt(this.f3237a);
    }

    public p(Parcel parcel) {
        this.f3237a = parcel.readInt();
    }
}
