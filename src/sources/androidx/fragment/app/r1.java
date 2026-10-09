package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements Parcelable {
    public static final Parcelable.Creator<r1> CREATOR = new android.support.v4.media.a(13);
    public final boolean H;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final int N;
    public final String O;
    public final int P;
    public final boolean Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1823f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f1824t;

    public r1(k0 k0Var) {
        this.f1818a = k0Var.getClass().getName();
        this.f1819b = k0Var.mWho;
        this.f1820c = k0Var.mFromLayout;
        this.f1821d = k0Var.mInDynamicContainer;
        this.f1822e = k0Var.mFragmentId;
        this.f1823f = k0Var.mContainerId;
        this.f1824t = k0Var.mTag;
        this.H = k0Var.mRetainInstance;
        this.K = k0Var.mRemoving;
        this.L = k0Var.mDetached;
        this.M = k0Var.mHidden;
        this.N = k0Var.mMaxState.ordinal();
        this.O = k0Var.mTargetWho;
        this.P = k0Var.mTargetRequestCode;
        this.Q = k0Var.mUserVisibleHint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f1818a);
        sb2.append(" (");
        sb2.append(this.f1819b);
        sb2.append(")}:");
        if (this.f1820c) {
            sb2.append(" fromLayout");
        }
        if (this.f1821d) {
            sb2.append(" dynamicContainer");
        }
        int i11 = this.f1823f;
        if (i11 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i11));
        }
        String str = this.f1824t;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.H) {
            sb2.append(" retainInstance");
        }
        if (this.K) {
            sb2.append(" removing");
        }
        if (this.L) {
            sb2.append(" detached");
        }
        if (this.M) {
            sb2.append(" hidden");
        }
        String str2 = this.O;
        if (str2 != null) {
            sb2.append(" targetWho=");
            sb2.append(str2);
            sb2.append(" targetRequestCode=");
            sb2.append(this.P);
        }
        if (this.Q) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f1818a);
        parcel.writeString(this.f1819b);
        parcel.writeInt(this.f1820c ? 1 : 0);
        parcel.writeInt(this.f1821d ? 1 : 0);
        parcel.writeInt(this.f1822e);
        parcel.writeInt(this.f1823f);
        parcel.writeString(this.f1824t);
        parcel.writeInt(this.H ? 1 : 0);
        parcel.writeInt(this.K ? 1 : 0);
        parcel.writeInt(this.L ? 1 : 0);
        parcel.writeInt(this.M ? 1 : 0);
        parcel.writeInt(this.N);
        parcel.writeString(this.O);
        parcel.writeInt(this.P);
        parcel.writeInt(this.Q ? 1 : 0);
    }

    public r1(Parcel parcel) {
        this.f1818a = parcel.readString();
        this.f1819b = parcel.readString();
        this.f1820c = parcel.readInt() != 0;
        this.f1821d = parcel.readInt() != 0;
        this.f1822e = parcel.readInt();
        this.f1823f = parcel.readInt();
        this.f1824t = parcel.readString();
        this.H = parcel.readInt() != 0;
        this.K = parcel.readInt() != 0;
        this.L = parcel.readInt() != 0;
        this.M = parcel.readInt() != 0;
        this.N = parcel.readInt();
        this.O = parcel.readString();
        this.P = parcel.readInt();
        this.Q = parcel.readInt() != 0;
    }
}
