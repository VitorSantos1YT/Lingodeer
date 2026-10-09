package e5;

import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.util.Base64;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.core.widget.RemoteViewsCompatService;
import com.lingodeer.R;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements RemoteViewsService.RemoteViewsFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f24863e = new l(new long[0], new RemoteViews[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteViewsCompatService f24864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l f24867d = f24863e;

    public n(RemoteViewsCompatService remoteViewsCompatService, int i11, int i12) {
        this.f24864a = remoteViewsCompatService;
        this.f24865b = i11;
        this.f24866c = i12;
    }

    public final void a() {
        Long lValueOf;
        RemoteViewsCompatService remoteViewsCompatService = this.f24864a;
        SharedPreferences sharedPreferences = remoteViewsCompatService.getSharedPreferences("androidx.core.widget.prefs.RemoteViewsCompat", 0);
        kotlin.jvm.internal.m.e(sharedPreferences, "context.getSharedPrefere…S_FILENAME, MODE_PRIVATE)");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24865b);
        sb2.append(':');
        sb2.append(this.f24866c);
        l lVar = null;
        String string = sharedPreferences.getString(sb2.toString(), null);
        if (string != null) {
            byte[] bArrDecode = Base64.decode(string, 0);
            kotlin.jvm.internal.m.e(bArrDecode, "decode(hexString, Base64.DEFAULT)");
            Parcel parcel = Parcel.obtain();
            kotlin.jvm.internal.m.e(parcel, "obtain()");
            try {
                parcel.unmarshall(bArrDecode, 0, bArrDecode.length);
                parcel.setDataPosition(0);
                kotlin.jvm.internal.m.f(parcel, "parcel");
                m mVar = new m();
                byte[] bArr = new byte[parcel.readInt()];
                mVar.f24861b = bArr;
                parcel.readByteArray(bArr);
                String string2 = parcel.readString();
                kotlin.jvm.internal.m.c(string2);
                mVar.f24862c = string2;
                mVar.f24860a = parcel.readLong();
                parcel.recycle();
                if (kotlin.jvm.internal.m.a(Build.VERSION.INCREMENTAL, (String) mVar.f24862c)) {
                    try {
                        PackageInfo packageInfo = remoteViewsCompatService.getPackageManager().getPackageInfo(remoteViewsCompatService.getPackageName(), 0);
                        lValueOf = Long.valueOf(Build.VERSION.SDK_INT >= 28 ? a2.l.k(packageInfo) : packageInfo.versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                        Objects.toString(remoteViewsCompatService.getPackageManager());
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        if (lValueOf.longValue() == mVar.f24860a) {
                            try {
                                byte[] bytes = (byte[]) mVar.f24861b;
                                kotlin.jvm.internal.m.f(bytes, "bytes");
                                Parcel parcelObtain = Parcel.obtain();
                                kotlin.jvm.internal.m.e(parcelObtain, "obtain()");
                                try {
                                    parcelObtain.unmarshall(bytes, 0, bytes.length);
                                    parcelObtain.setDataPosition(0);
                                    l lVar2 = new l(parcelObtain);
                                    parcelObtain.recycle();
                                    lVar = lVar2;
                                } catch (Throwable th2) {
                                    parcelObtain.recycle();
                                    throw th2;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                parcel.recycle();
                throw th3;
            }
        }
        if (lVar == null) {
            lVar = f24863e;
        }
        this.f24867d = lVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return ((long[]) this.f24867d.f24858c).length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i11) {
        try {
            return ((long[]) this.f24867d.f24858c)[i11];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i11) {
        try {
            return ((RemoteViews[]) this.f24867d.f24859d)[i11];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.f24864a.getPackageName(), R.layout.invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return this.f24867d.f24856a;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return this.f24867d.f24857b;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        a();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
