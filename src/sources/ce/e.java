package ce;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements td.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6850b;

    public /* synthetic */ e(Object obj, int i11) {
        this.f6849a = i11;
        this.f6850b = obj;
    }

    @Override // td.l
    public final vd.b0 a(Object obj, int i11, int i12, td.j jVar) {
        switch (this.f6849a) {
            case 0:
                o oVar = (o) this.f6850b;
                return oVar.a(new ob.m((ByteBuffer) obj, oVar.f6885d, oVar.f6884c, 4), i11, i12, jVar, o.f6880j);
            case 1:
                o oVar2 = (o) this.f6850b;
                return oVar2.a(new ob.m((ParcelFileDescriptor) obj, oVar2.f6885d, oVar2.f6884c), i11, i12, jVar, o.f6880j);
            default:
                return c.e(((sd.d) obj).b(), (wd.a) this.f6850b);
        }
    }

    @Override // td.l
    public final boolean b(Object obj, td.j jVar) {
        switch (this.f6849a) {
            case 0:
                ((o) this.f6850b).getClass();
                return true;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                return (!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT);
            default:
                return true;
        }
    }
}
