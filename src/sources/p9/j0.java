package p9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.api.Service;
import java.util.ArrayList;
import java.util.List;
import rt.m5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f46688a;

    public /* synthetic */ j0(int i11) {
        this.f46688a = i11;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel source) {
        switch (this.f46688a) {
            case 0:
                return new k0(source);
            case 1:
                return new l0(source);
            case 2:
                pq.b bVar = new pq.b();
                bVar.f46986a = source.readInt();
                bVar.f46987b = source.readString();
                bVar.f46988c = source.readString();
                bVar.f46989d = source.readString();
                bVar.f46990e = source.readString();
                bVar.f46991f = source.readString();
                return bVar;
            case 3:
                qi.a aVar = new qi.a();
                aVar.f47798a = source.readInt();
                aVar.f47799b = source.readLong();
                aVar.f47800c = source.readInt();
                ArrayList arrayList = new ArrayList();
                aVar.f47801d = arrayList;
                source.readList(arrayList, Long.class.getClassLoader());
                List arrayList2 = new ArrayList();
                aVar.f47802e = arrayList2;
                source.readList(arrayList2, Integer.class.getClassLoader());
                return aVar;
            case 4:
                r.h hVar = new r.h();
                hVar.f48570a = source.readInt();
                return hVar;
            case 5:
                r.g0 g0Var = new r.g0(source);
                g0Var.f48568a = source.readByte() != 0;
                return g0Var;
            case 6:
                kotlin.jvm.internal.m.f(source, "source");
                return new re.b(source);
            case 7:
                kotlin.jvm.internal.m.f(source, "source");
                return new re.h(source);
            case 8:
                kotlin.jvm.internal.m.f(source, "source");
                return new re.i(source);
            case 9:
                kotlin.jvm.internal.m.f(source, "source");
                return new re.j(source);
            case 10:
                kotlin.jvm.internal.m.f(source, "parcel");
                return new re.r(source.readInt(), source.readInt(), source.readInt(), source.readString(), source.readString(), source.readString(), source.readString(), null, null, false);
            case 11:
                kotlin.jvm.internal.m.f(source, "source");
                return new re.x(source);
            case 12:
                kotlin.jvm.internal.m.f(source, "source");
                return new re.f0(source);
            case 13:
                return new ParcelImpl(source);
            case 14:
                wc.e eVar = new wc.e(source);
                eVar.f54948a = source.readString();
                eVar.f54950c = source.readFloat();
                eVar.f54951d = source.readInt() == 1;
                eVar.f54952e = source.readString();
                eVar.f54953f = source.readInt();
                eVar.f54954t = source.readInt();
                return eVar;
            case 15:
                kotlin.jvm.internal.m.f(source, "parcel");
                return new xf.a(source);
            case 16:
                kotlin.jvm.internal.m.f(source, "parcel");
                return new xf.b(source);
            case 17:
                kotlin.jvm.internal.m.f(source, "parcel");
                xf.c cVar = new xf.c(source);
                cVar.f56024t = source.readString();
                m5 m5Var = new m5(9);
                xf.a aVar2 = (xf.a) source.readParcelable(xf.a.class.getClassLoader());
                if (aVar2 != null) {
                    ((Bundle) m5Var.f50058b).putAll(aVar2.f56022a);
                }
                cVar.H = new xf.a(m5Var);
                tp.g gVar = new tp.g(7);
                xf.b bVar2 = (xf.b) source.readParcelable(xf.b.class.getClassLoader());
                if (bVar2 != null) {
                    ((Bundle) gVar.f52461b).putAll(bVar2.f56023a);
                }
                cVar.K = new xf.b(gVar);
                return cVar;
            case 18:
                kotlin.jvm.internal.m.f(source, "source");
                return new xf.e(source);
            case 19:
                kotlin.jvm.internal.m.f(source, "source");
                return new xf.f(source);
            case 20:
                kotlin.jvm.internal.m.f(source, "source");
                return new xf.i(source);
            case 21:
                kotlin.jvm.internal.m.f(source, "source");
                return new xf.k(source);
            case 22:
                kotlin.jvm.internal.m.f(source, "parcel");
                return new xf.l(source);
            case 23:
                kotlin.jvm.internal.m.f(source, "parcel");
                return new xf.m(source);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                kotlin.jvm.internal.m.f(source, "source");
                return new xf.o(source);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                kotlin.jvm.internal.m.f(source, "parcel");
                return new xf.p(source);
            default:
                xi.c cVar2 = new xi.c();
                cVar2.f56095a = source.readLong();
                cVar2.f56096b = source.readString();
                cVar2.f56097c = source.readString();
                cVar2.f56098d = source.readString();
                cVar2.f56099e = source.readString();
                cVar2.f56100f = source.createStringArray();
                cVar2.f56101t = source.createIntArray();
                cVar2.H = source.readString();
                cVar2.K = source.readString();
                cVar2.L = source.readString();
                return cVar2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i11) {
        switch (this.f46688a) {
            case 0:
                return new k0[i11];
            case 1:
                return new l0[i11];
            case 2:
                return new pq.b[i11];
            case 3:
                return new qi.a[i11];
            case 4:
                return new r.h[i11];
            case 5:
                return new r.g0[i11];
            case 6:
                return new re.b[i11];
            case 7:
                return new re.h[i11];
            case 8:
                return new re.i[i11];
            case 9:
                return new re.j[i11];
            case 10:
                return new re.r[i11];
            case 11:
                return new re.x[i11];
            case 12:
                return new re.f0[i11];
            case 13:
                return new ParcelImpl[i11];
            case 14:
                return new wc.e[i11];
            case 15:
                return new xf.a[i11];
            case 16:
                return new xf.b[i11];
            case 17:
                return new xf.c[i11];
            case 18:
                return new xf.e[i11];
            case 19:
                return new xf.f[i11];
            case 20:
                return new xf.i[i11];
            case 21:
                return new xf.k[i11];
            case 22:
                return new xf.l[i11];
            case 23:
                return new xf.m[i11];
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new xf.o[i11];
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new xf.p[i11];
            default:
                return new xi.c[i11];
        }
    }
}
