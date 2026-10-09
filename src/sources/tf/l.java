package tf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.p0;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f52195e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f52196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c0 f52194d = new c0();
    public static final Parcelable.Creator<l> CREATOR = new b(2);

    public l(Parcel parcel) {
        super(parcel);
        this.f52196c = "device_auth";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // tf.e0
    public final String e() {
        return this.f52196c;
    }

    @Override // tf.e0
    public final int m(t request) {
        kotlin.jvm.internal.m.f(request, "request");
        p0 p0VarE = d().e();
        if (p0VarE == null || p0VarE.isFinishing()) {
            return 1;
        }
        k kVar = new k();
        kVar.u(p0VarE.getSupportFragmentManager(), "login_with_facebook");
        kVar.D(request);
        return 1;
    }

    public l(w wVar) {
        this.f52166b = wVar;
        this.f52196c = "device_auth";
    }
}
